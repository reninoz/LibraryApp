var MESSAGE_REQUIRED_CLIENT_DETAILS ="Not all mandatory fields have been filled in Person details section. They are highlighted in red below.";

$(document).ready( function(){	
		
	$("#firstName").rules("add", {
		requiredNotInDiscard: '',
		 rangelength : [ 1, 60 ],
		 alphaNumericApostropheHyphen : '',
		 messages:{
			requiredNotInDiscard : MESSAGE_REQUIRED_CLIENT_DETAILS,
			alphaNumericApostropheHyphen : "First name must contain between 1 and 60 characters comprising of a combination of alphanumeric, hyphen (-), apostrophe ('), and spaces only.  Leading spaces, trailing spaces and consecutive spaces are not permitted.",
			rangelength : "Family name must contain between 1 and 60 characters comprising of a combination of alphanumeric, hyphen (-), apostrophe ('), and spaces only.  Leading spaces, trailing spaces and consecutive spaces are not permitted."
		 }
		});
	$("#lastNameOne").rules("add", {
		requiredNotInDiscard: '',
		 rangelength : [ 1, 60 ],
		 alphaNumericApostropheHyphen : '',
		 messages:{
			requiredNotInDiscard : MESSAGE_REQUIRED_CLIENT_DETAILS,
			alphaNumericApostropheHyphen : "Last name 1 must contain between 1 and 60 characters comprising of a combination of alphanumeric, hyphen (-), apostrophe ('), and spaces only.  Leading spaces, trailing spaces and consecutive spaces are not permitted.",
			rangelength : "Given name 1 must contain between 1 and 60 characters comprising of a combination of alphanumeric, hyphen (-), apostrophe ('), and spaces only.  Leading spaces, trailing spaces and consecutive spaces are not permitted."
		 }
		});

	
});

