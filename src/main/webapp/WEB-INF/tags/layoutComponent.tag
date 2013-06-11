<%@ tag description="Herring Dashboard Component Tag" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="contents" fragment="true" %>
<%@ attribute name="size" required="false" %>
<c:if test="${empty size}">
    <c:set var="size" value="6"/>
</c:if>
<div class="span${size}">
    <h2 class="tile-title">${title}</h2>

    <div class="component-contents-container">
        <jsp:invoke fragment="contents"/>
    </div>
</div>