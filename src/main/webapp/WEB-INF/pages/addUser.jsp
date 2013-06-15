<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="Add User" description="Herring System을 사용할 새로운 사용자를 추가합니다.">
    <jsp:body>
        <h:layoutComponent title="User Information">
            <jsp:attribute name="contents">
                <form action="<c:url value="/auth/addUser.do"/>" method="post">
                    <div class="row-fluid">
                        <input type="text" name="username" id="username" placeholder="Login ID"/>
                    </div>
                    <div class="row-fluid">
                        <input type="password" name="password" id="password" placeholder="Password"/>
                    </div>
                    <div class="row-fluid inline">
                        ROLE:
                        <c:forEach var="role" items="${userRoles}">
                            <label class="checkbox" for="checkbox_${role}">
                                <input type="checkbox" value="${role}" name="roles" data-toggle="checkbox"/>
                                ${role}
                            </label>
                        </c:forEach>
                    </div>
                    <input type="submit" value="Submit"/>
                </form>
            </jsp:attribute>
        </h:layoutComponent>
    </jsp:body>
</h:layout>