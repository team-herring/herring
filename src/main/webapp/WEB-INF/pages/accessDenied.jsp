<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="Permission Denied">
    <jsp:body>
        <h:layoutComponent title="User Information">
            <jsp:attribute name="contents">
                <div class="alert alert-error">
                    <h4>Access Denied</h4>

                    <p>해당 작업을 수행할 수 있는 권한이 부족합니다. 로그아웃 이후, 권한이 있는 사용자로 로그인하여 작업을 수행해주세요.</p>
                </div>
            </jsp:attribute>
        </h:layoutComponent>
    </jsp:body>
</h:layout>