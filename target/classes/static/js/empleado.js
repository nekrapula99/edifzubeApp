$('document').ready(function() {
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(empleado, status){
			$('#cedulaEdit').val(empleado.cedula);
			$('#nombreEdit').val(empleado.nombre);
			$('#apellidoEdit').val(empleado.apellido);
			$('#telefonoEdit').val(empleado.telefono);
		});
		
		$('#editModal').modal();
	});
	
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});