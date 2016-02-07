<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="margin: 10px;">
	<h4>List of books</h4>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>
				<th>No.</th>
				<th>Title</th>
				<th>Author</th>
				<th>ISBN</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${requestScope.books}"
				varStatus="loopCounter">
				<tr>
					<td><c:out value="${loopCounter.count}" /></td>
					<td><c:out value="${book.title}" /></td>
					<td><c:out value="${book.author}" /></td>
					<td><c:out value="${book.isbn}" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	
</div>