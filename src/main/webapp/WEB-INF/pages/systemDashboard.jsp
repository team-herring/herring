<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" tagdir="/WEB-INF/tags" %>
<h:layout title="System Dashboard" description="Herring System의 현재 운영 정보를 표시합니다.">
    <jsp:body>
        <div class="row-fluid">
            <h:layoutComponent title="저장된 데이터 정보" size="6">
                <jsp:attribute name="contents">
                    <p>현재 Herring System에 저장된 데이터의 요약 정보 입니다.</p>
                    <table class="summary">
                        <c:forEach items="${cruiserStatus}" var="state">
                            <tr>
                                <th>${state.key}</th>
                                <td>${state.value}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </jsp:attribute>
            </h:layoutComponent>
            <h:layoutComponent title="연결된 Agent 정보" size="6">
                <jsp:attribute name="contents">
                    <p>현재 herring System에 연결된 Agent의 요약 정보 입니다.</p>
                    <table class="summary">
                        <c:forEach items="${agentStatus}" var="state">
                            <tr>
                                <th>${state.key}</th>
                                <td>${state.value}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </jsp:attribute>
            </h:layoutComponent>
        </div>
    </jsp:body>
</h:layout>