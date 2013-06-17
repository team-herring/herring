<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="User List" description="Herring System에 등록된 사용자 목록 입니다.">
    <jsp:attribute name="css">
        <link href="<c:url value="/resources/herring/userList.css"/>" rel="stylesheet" type="text/css"/>
    </jsp:attribute>
    <jsp:body>
        <c:choose>
            <c:when test="${failure}">
                <div class="alert alert-error">
                    <h4>Acquire User List Failure</h4>
                    <p>현재 시스템에 등록된 사용자 목록을 받아오는데 실패했습니다. 아래의 오류 보고를 참조하여 다시 시도해주세요.</p>
                    <div class="alert alert-info">${failureInfo}</div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="row-fluid">
                    <table class="span6 userList">
                        <thead>
                        <tr class="row-fluid">
                            <th>사용자명</th>
                            <th class="span1">수정</th>
                            <th class="span1">삭제</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="username" items="${userList}">
                            <tr class="row-fluid">
                                <td class="action"><span class="fui-user"></span>${username}</td>
                                <td class="action"><a class="btn btn-primary"
                                                      href="<c:url value="/auth/editUser.view?username=${username}"/>"><span
                                        class="fui-new"></span></a></td>
                                <td>
                                    <form action="<c:url value="/auth/deleteUser.do"/>" method="post">
                                        <input type="hidden" name="username" value="${username}"/>
                                        <c:choose>
                                            <c:when test="${not (username eq currentUsername)}">
                                                <button class="btn btn-primary"><span class="fui-cross"></span></button>
                                            </c:when>
                                            <c:otherwise>
                                                <button disabled="disabled" class="btn btn-disabled"><span
                                                        class="fui-cross"></span></button>
                                            </c:otherwise>
                                        </c:choose>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="row-fluid">
                    <a href="<c:url value="/auth/addUser.view"/>"><span class="fui-plus"></span>사용자 추가하기</a>
                </div>
            </c:otherwise>
        </c:choose>
    </jsp:body>
</h:layout>