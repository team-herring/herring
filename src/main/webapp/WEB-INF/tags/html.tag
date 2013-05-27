<!doctype html>
<%@ tag description="Herring HTML Page Tag" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="css" fragment="true" %>
<%@ attribute name="javascript" fragment="true" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Herring - ${title}</title>

    <!-- Stylesheets for Framework -->
    <link href="<c:url value="/resources/3rd-party/bootstrap/css/bootstrap.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/3rd-party/flat-ui/css/flat-ui.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/herring/html.css"/>" type="text/css" rel="stylesheet"/>

    <!-- Stylesheets for This Feature -->
    <jsp:invoke fragment="css"/>
</head>
<body>
<div id="wrapper">
    <jsp:doBody/>
</div>

<!-- Javascripts for Framework -->
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery-1.8.3.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery-ui-1.10.3.custom.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery.ui.touch-punch.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/bootstrap-select.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/bootstrap-switch.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/flatui-checkbox.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/flatui-radio.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery.tagsinput.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery.placeholder.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/3rd-party/flat-ui/js/jquery.stacktable.js"/>"></script>

<!-- Javascripts for This Feature -->
<jsp:invoke fragment="javascript"/>
</body>
</html>