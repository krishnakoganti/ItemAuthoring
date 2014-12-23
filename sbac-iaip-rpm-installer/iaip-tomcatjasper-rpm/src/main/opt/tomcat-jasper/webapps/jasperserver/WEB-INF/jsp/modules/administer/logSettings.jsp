<%--
  ~ Copyright (C) 2005 - 2011 Jaspersoft Corporation. All rights reserved.
  ~ http://www.jaspersoft.com.
  ~
  ~ Unless you have purchased  a commercial license agreement from Jaspersoft,
  ~ the following license terms  apply:
  ~
  ~ This program is free software: you can redistribute it and/or  modify
  ~ it under the terms of the GNU Affero General Public License  as
  ~ published by the Free Software Foundation, either version 3 of  the
  ~ License, or (at your option) any later version.
  ~
  ~ This program is distributed in the hope that it will be useful,
  ~ but WITHOUT ANY WARRANTY; without even the implied warranty of
  ~ MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
  ~ GNU Affero  General Public License for more details.
  ~
  ~ You should have received a copy of the GNU Affero General Public  License
  ~ along with this program. If not, see <http://www.gnu.org/licenses/>.
  --%>

<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<t:insertTemplate template="/WEB-INF/jsp/templates/page.jsp">
    <t:putAttribute name="pageTitle"><spring:message code="menu.log.Settings"/></t:putAttribute>
    <t:putAttribute name="bodyID" value="logSettings"/>
    <t:putAttribute name="bodyClass" value="twoColumn"/>
    <t:putAttribute name="headerContent">
        <script type="text/javascript" src="${pageContext.request.contextPath}/scripts/administer.base.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/scripts/administer.logging.js"></script>
        <script type="text/javascript">
            Administer.urlContext = "${pageContext.request.contextPath}";
        </script>
        <%@ include file="../common/jsEdition.jsp" %>
    </t:putAttribute>
    <t:putAttribute name="bodyContent">
		<t:insertTemplate template="/WEB-INF/jsp/templates/container.jsp">
            <t:putAttribute name="containerID" value="settings"/>
		    <t:putAttribute name="containerClass" value="column decorated primary"/>
		    <t:putAttribute name="containerTitle"><spring:message code="menu.log.Settings"/></t:putAttribute>
		    <t:putAttribute name="bodyClass" value=""/>
		    <t:putAttribute name="bodyContent">
				<ul class="list setLeft tabular threeColumn">
                    <c:forEach var="logger" items="${loggers}" varStatus="n">
                        <li class="list">
                            <div class="wrap"><b class="icon" title=""></b>
                                <p class="column one">${loggerDesc[logger.key]}</p>
                                <p class="column two">${logger.key}</p>
                                <p class="column three">
                                    <select onchange="setLevel('${logger.key}', this.options[this.selectedIndex].value)">
                                        <c:forEach var="level" items="ERROR,WARN,INFO,DEBUG">
                                            <option value="${level}" <c:if test="${logger.value == level}">selected="selected"</c:if>>${level}</option>
                                        </c:forEach>
                                    </select>
                                </p>
                            </div>
                        </li>
                    </c:forEach>

					<li class="list">
						<div class="wrap"><b class="icon" title=""></b>
							<p class="column one">&nbsp;</p>
							<p class="column two"><input type="text" size="80" value="" id="newLoggerName" class="fnormal"/></p>
							<p class="column three">
                                <select onchange="setLevel(getElementById('newLoggerName').value, this.options[this.selectedIndex].value)">
                                    <c:forEach var="level" items="ERROR,WARN,INFO,DEBUG">
                                        <option value="${level}">${level}</option>
                                    </c:forEach>
                                </select>
							</p>
						</div>
					</li>
				</ul>
		    </t:putAttribute>
		    <t:putAttribute name="footerContent">
		    </t:putAttribute>
		</t:insertTemplate>

		<t:insertTemplate template="/WEB-INF/jsp/templates/container.jsp">
		    <t:putAttribute name="containerID" value="filters"/>
		    <t:putAttribute name="containerClass">
                column decorated secondary sizeable
                <t:putAttribute name="containerElements">
                    <div class="sizer horizontal"></div>
                    <button class="button minimize"></button>
                </t:putAttribute>
            </t:putAttribute>
		    <t:putAttribute name="containerTitle"><spring:message code="menu.settings"/></t:putAttribute>
		    <t:putAttribute name="bodyClass" value=""/>
		    <t:putAttribute name="bodyContent">
		    	<ul class="list filters">
                    <li class="list selected"><p class="wrap button" id="navLogSettings"><b class="icon"></b><spring:message code="menu.log.Settings"/></p></li>
                    <c:if test="${isProVersion}">
                        <li class="list"><p class="wrap button" id="navDesignerOptions"><b class="icon"></b><spring:message code="menu.adhoc.options"/></p></li>
                        <li class="list"><p class="wrap button" id="navDesignerCache"><b class="icon"></b><spring:message code="menu.adhoc.cache"/></p></li>
                        <li class="list"><p class="wrap button" id="navImport"><b class="icon"></b><spring:message code="import.import"/></p></li>
                        <li class="list"><p class="wrap button" id="navExport"><b class="icon"></b><spring:message code="export.export"/></p></li>
                    </c:if>
                    <li class="list"><p class="wrap button" id="navAnalysisOptions"><b class="icon"></b><spring:message code="menu.mondrian.properties"/></p></li>

                    <li class="list" disabled="disabled"><p class="wrap separator" href="#"><b class="icon"></b></p></li>
				</ul>
		    </t:putAttribute>
		    <t:putAttribute name="footerContent">
		    </t:putAttribute>
		</t:insertTemplate>
	</t:putAttribute>
</t:insertTemplate>
