$('document').ready(function() {
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(seccion, status){
			$('#idEditar').val(seccion.idseccion);
			$('#codigoEdit').val(seccion.codseccion);
			$('#nombreEdit').val(seccion.nombreseccion);
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