<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<nav class="navbar navbar-default">
	<ul class="nav navbar-nav">

		<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
			<a href="${homeUrl}">Home&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
		</li>
		
		<li><spring:url value="/viewBookList" var="bookListUrl" htmlEscape="true" /> 
			<a href="${bookListUrl}">Book List</a>
		</li>

		<li><spring:url value="/viewPesonList" var="personListUrl" htmlEscape="true" /> 
			<a href="${personListUrl}">Person List</a>
		</li>
		
<%-- 		<li><spring:url value="/newPerson" var="newPersonUrl" htmlEscape="true" /> 
			<a href="${newPersonUrl}">Add Person</a>
		</li> --%>
	</ul>

</nav>


