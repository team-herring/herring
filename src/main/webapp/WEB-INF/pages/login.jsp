<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:html title="Login Required">
    <jsp:attribute name="css">
        <link href="<c:url value="/resources/herring/login.css"/>" type="text/css" rel="stylesheet"/>
    </jsp:attribute>

    <jsp:body>
        <div id="login-screen">
            <div class="login-icon">
                <img src="<c:url value="/resources/3rd-party/flat-ui/images/icons/Book@2x.png"/>"/>
                <h4>Welcome to
                    <small>Herring!</small>
                </h4>
            </div>
            <form class="login-form" method="post" action="<c:url value="/auth/login.do"/>">
                <div class="control-group">
                    <input type="text" placeholder="Login ID" class="login-field" name="username" id="login-id"/>
                    <label class="login-field-icon fui-user" for="login-id"></label>
                </div>
                <div class="control-group">
                    <input type="password" placeholder="Password" class="login-field" name="password" id="login-password"/>
                    <label class="login-field-icon fui-lock" for="login-password"></label>
                </div>
                <input type="submit" value="Login" id="login-button" class="btn btn-primary btn-large btn-block"/>
            </form>
            <c:if test="${failure}">
                <div class="alert alert-error">
                    <h4>Login Failure</h4>
                    <p>아이디 또는 비밀번호가 올바르지 않습니다.</p>
                </div>
            </c:if>
        </div>
    </jsp:body>
</h:html>