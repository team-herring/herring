<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="Edit User" description="등록된 사용자 정보를 수정합니다.">
    <jsp:body>
        <c:choose>
            <c:when test="${failure}">
                <div class="alert alert-error">
                    <h4>Edit User Failure</h4>
                    <p>사용자 정보를 수정하는데 실패했습니다. 아래의 오류 보고를 참조하여 다시 시도해주세요.</p>
                    <div class="alert alert-info">${failureInfo}</div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="alert alert-success">
                    <h4>Edit User Complete</h4>
                    <p>사용자 정보를 수정했습니다!</p>
                    <div class="alert alert-info">${successInfo}</div>
                </div>
            </c:otherwise>
        </c:choose>
    </jsp:body>
</h:layout>