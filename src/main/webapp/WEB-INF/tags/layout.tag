<%@ tag description="Herring Standard Layout Tag" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<%@ attribute name="title" required="true" %>
<%@ attribute name="css" fragment="true" %>
<%@ attribute name="description" %>
<%@ attribute name="javascript" fragment="true" %>
<h:html title="${title}">
    <jsp:attribute name="css">
        <link href="<c:url value="/resources/herring/layout.css"/>" rel="stylesheet" type="text/css"/>
        <jsp:invoke fragment="css"/>
    </jsp:attribute>

    <jsp:attribute name="javascript">
        <script type="text/javascript" language="javascript" src="<c:url value="/resources/herring/js/gnb.js"/>"></script>
        <jsp:invoke fragment="javascript"/>
    </jsp:attribute>

    <jsp:body>
        <!-- Global Navigation Bar Start -->
        <div id="gnb" class="navbar navbar-static-top navbar-inverse">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <div class="row-fluid">
                        <!-- Search Bar Start -->
                        <div class="pull-left span8 row-fluid">
                            <form id="search-form" class="navbar-form" action="<c:url value="/search"/>" method="get">
                                <input id="textbox-query" name="search-query" type="text" placeholder="Search Query"/>
                                <button class="btn btn-primary"><span class="fui-search"></span></button>
                            </form>
                        </div>
                        <!-- Search Bar End -->
                        <!-- Navigation Menu Start -->
                        <div class="pull-right">
                            <ul class="nav">
                                <li>
                                    <a data-toggle="popover" title="System Dashboard" data-content="시스템의 전반적인 상황을 표시합니다."><span class="fui-cmd"></span></a>
                                </li>
                                <li>
                                    <a data-toggle="popover" title="Dashboard" data-content="미리 등록된 쿼리의 수행 결과를 보여줍니다."><span class="fui-calendar-solid"></span></a>
                                </li>
                                <li>
                                    <a data-toggle="popover" title="Settings" data-content="Herring 시스템의 설정을 변경합니다."><span class="fui-gear"></span></a>
                                </li>
                                <li>
                                    <a data-toggle="popover" title="Logout" data-content="세션을 종료합니다. 등록된 작업은 세션 종료 이후에도 계속 작동합니다."><span class="fui-cross"></span></a>
                                </li>
                            </ul>
                        </div>
                        <!-- Navigation Menu End -->
                    </div>
                </div>
            </div>
        </div>
        <!-- Global Navigation Bar End -->
        <!-- Contents Start -->
        <div id="contents-wrapper" class="container-fluid">
            <h1>${title}</h1>
            <c:if test="${not empty description}">
                <div class="description">${description}</div>
            </c:if>
            <div class="contents-container">
                <jsp:doBody/>
            </div>
        </div>
        <!-- Contents End -->
        <!-- Footer Start -->
        <div id="footer">
            Herring Project
        </div>
        <!-- Footer End -->
    </jsp:body>
</h:html>