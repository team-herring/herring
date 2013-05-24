<%@ tag description="Herring Standard Layout Tag" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="css" fragment="true" %>
<%@ attribute name="javascript" fragment="true" %>
<h:html title="${title}">
    <jsp:attribute name="css">
        <jsp:invoke fragment="css"/>
    </jsp:attribute>

    <jsp:attribute name="javascript">
        <jsp:invoke fragment="javascript"/>
    </jsp:attribute>

    <jsp:body>

    </jsp:body>
</h:html>