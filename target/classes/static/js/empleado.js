$('document').ready(function() {
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(empleado, status){
			$('#idEditar').val(empleado.idempleado);
			$('#cedulaEdit').val(empleado.cedula);
			$('#nombreEdit').val(empleado.nombre);
			$('#apellidoEdit').val(empleado.apellido);
			$('#telefonoEdit').val(empleado.telefono);
		});
		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(empleado, status){
			$('#idEditar2').val(empleado.idempleado);
			$('#cedulaEdit2').val(empleado.cedula);
			$('#nombreEdit2').val(empleado.nombre);
			$('#apellidoEdit2').val(empleado.apellido);
			$('#telefonoEdit2').val(empleado.telefono);			
		});
		
		$('#detailsModal').modal();
	});
	
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});