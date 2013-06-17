<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h:layout title="Edit User" description="사용자의 정보를 수정합니다.">
    <jsp:body>
        <c:choose>
            <c:when test="${failure}">
                <h:layoutComponent title="Error!">
                    <jsp:attribute name="contents">
                        <div class="alert alert-error">
                            <h4>Unauthorized Access</h4>
                            <p>올바르지 못한 접근입니다.<br/>${failureInfo}</p>
                        </div>
                        <p><a href="<c:url value="/auth/listUser.view"/>"><span class="fui-arrow-left"></span>목록으로 돌아가기</a>
                        </p>
                    </jsp:attribute>
                </h:layoutComponent>
            </c:when>
            <c:otherwise>
                <h:layoutComponent title="User Information">
                    <jsp:attribute name="contents">
                        <form action="<c:url value="/auth/editUser.do"/>" method="post">
                            <div class="row-fluid">
                                <input type="text" name="username" id="username" value="${user.username}"
                                       placeholder="Login ID"/>
                            </div>
                            <div class="row-fluid">
                                <input type="password" name="password" id="password" value="${user.password}"
                                       placeholder="Password"/>
                            </div>
                            <div class="row-fluid inline">
                                ROLE:
                                <c:forEach var="role" items="${userRoles}">
                                    <label class="checkbox" for="checkbox_${role}">
                                        <c:set var="roleFlag"><spring:eval expression="user.checkRole(role)"/></c:set>
                                        <c:choose>
                                            <c:when test="${roleFlag}">
                                                <input type="checkbox" value="${role}" name="roles"
                                                       data-toggle="checkbox" checked="checked"/>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="checkbox" value="${role}" name="roles"
                                                       data-toggle="checkbox"/>
                                            </c:otherwise>
                                        </c:choose>
                                            ${role}
                                    </label>
                                </c:forEach>
                            </div>
                            <input class="btn btn-primary" type="submit" value="수정하기"/>
                            <p><a href="<c:url value="/auth/listUser.view"/>"><span class="fui-arrow-left"></span>목록으로
                                돌아가기</a></p>
                        </form>
                    </jsp:attribute>
                </h:layoutComponent>
            </c:otherwise>
        </c:choose>
    </jsp:body>
</h:layout>