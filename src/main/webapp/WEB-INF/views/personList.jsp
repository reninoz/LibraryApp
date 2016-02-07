<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">


function madeAjaxCall(){
$.ajax({
	  type: "get",
	  url: "/TestLib/testAjax",
	  cache: false,    
	  data:'firstName=helo', 
	  success: function(response){
	   $('#booksBorrowed').html(response);
	   },
	   error: function(){      
		   alert('Error while request..');
		  }
		 });
		}
		

$(document).ready(function() {
    $(".btnFind").each(function (){
        var button = $(this);
        var parentDiv = button.parent();
        var personId = parentDiv.attr("data-id");
        var name = parentDiv.attr("data-name");

        button.click(function (){
            $.ajax({
                url: "/TestLib/findBooksBorrowed/" + personId,
                type: 'GET',
                dataType: "json",//set to JSON 
                success: function (data) {
                	var content = '';
                	if (!jQuery.isEmptyObject(data)) {
	                	content = "<h4>Number of book(s) borrowed by " + name + ": " + data.length +  "</h4>";
	                	content += "<table class='table table-bordered table-striped table-hover'>";
	                	content += "<thead><tr><th>Title</th><th>Author</th><th>ISBN</th><th>Start Date</th><th>Due Date</th><th>Return Date</th></tr></thead><tbody>";
	                	jQuery.each(data, function(i, v){
	                		content += "<tr><td>" + v.title + "</td>";
	                		content += "<td>" + v.author + "</td>";
	                		content += "<td>" + v.isbn + "</td>";
	                	      content += "<td>" + v.startDate + "</td>";
	                	      content += "<td>" + v.dueDate + "</td>";
	                	      content += "<td>" + v.returnDate + "</td></tr>";
	                	   });
	                	content += "</tbody></table>";
                	} else {
                		content = "<h4>No book is borrowed by " + name + "</h4>";
                	}
                	 $('#booksBorrowed').html(content);
                },
                error: function(){      
                 alert('Error while request..');
                }
            }); 
        });
    });
} );


</script>

<div style="margin: 10px;">
	<h4>List of Persons</h4>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>
				<th>No.</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${requestScope.persons}"
				varStatus="loopCounter">
				<tr>
					<td><c:out value="${loopCounter.count}" /></td>
					<td><c:out value="${person.name}" /></td>
					<td><c:out value="${person.email}" /></td>
					<td><c:out value="${person.phone}" /></td>
					<td data-id="${person.id}" data-name="${person.name}">
						<button class="btnFind">Find books borrowed</button>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</div>
	<p/>
	<hr/>
	<div style="margin: 10px;">

		<div id="booksBorrowed">

		</div>

	</div>