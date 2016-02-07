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
                url: "/TestLib/findBooksBorrowed/" + personId + "/" + name,
                type: 'GET',
                dataType: "json",//set to JSON 
                success: function (data) {
                	var content = "<h4>List of book(s) borrowed by TODO</h4>";
                	content += "<table class='table table-bordered table-striped table-hover'>";
                	content += "<thead><tr><th>Title</th><th>Author</th><th>ISBN</th></tr></thead><tbody>";
                	jQuery.each(data, function(i, v){
                		content += "<tr><td>" + v.title + "</td>";
                	      content += "<td>" + v.author + "</td>";
                	      content += "<td>" + v.isbn + "</td></tr>";
                	   });
                	content += "</tbody></table>";
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
<div style="margin: 10px;">

		<div id="booksBorrowed">

			
		</div>

	</div>
</div>