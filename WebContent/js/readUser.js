$(document).ready(function() {

manageData();

/* manage data list */
	function manageData() {
	    $.ajax({
	        dataType: 'json',
	        url: '/WebDevProject/getdataCtrl'
	    }).done(function(data){
	    	manageRow(data);
	    });
	
	}

	function manageRow(data) {
		var	rows = '';
		$.each( data, function( key, value ) {
		  	rows = rows + '<tr>';	   
	      	rows = rows + '<td>'+value.Username +'</td>';
		  	rows = rows + '<td>'+value.Name+'</td>';
	        rows = rows + '<td>'+value.Surname+'</td>';
	        rows = rows + '<td>'+value.Password+'</td>';
	        rows = rows + '<td>'+value.Email+'</td>';
	        rows = rows + '<td>'+value.Country+'</td>';
		  	rows = rows + '<td data-id="'+value.IdUser+'">';
	        rows = rows + '<button data-toggle="modal" data-target="#edit-item" class="btn btn-primary edit-item">Edit</button> ';
	        rows = rows + '<button class="btn btn-danger remove-item">Delete</button>';
	        rows = rows + '</td>';
		  	rows = rows + '</tr>';
		});
	
		$("tbody").html(rows);
	}

});