<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%><%@ taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<script type="text/javascript"	src="<c:url value="/resources/js/person/newPersonForm.js" />"></script>

<h3>Add a new person</h3>
<form:form modelAttribute="person" id="addPersonDetailForm"	action="addPerson">

	<label>First name:<span class="mandatoryField">*</span></label>
	<form:input path="firstName" onchange="clearDPID();" />

</form:form>