<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="Delete User" description="Herring System에 등록된 사용자를 제거합니다.">
    <jsp:body>
        <c:choose>
            <c:when test="${failure}">
                <div class="alert alert-error">
                    <h4>Delete User Failure</h4>
                    <p>사용자를 제거하는데 실패했습니다. 아래의 오류 보고를 참조하여 다시 시도해주세요.</p>
                    <div class="alert alert-info">${failureInfo}</div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="alert alert-success">
                    <h4>Delete User Complete</h4>
                    <p>사용자를 제거했습니다!</p>
                    <div class="alert alert-info">${successInfo}</div>
                </div>
            </c:otherwise>
        </c:choose>
    </jsp:body>
</h:layout>