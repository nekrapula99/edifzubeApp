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
	
	$('table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(seccion, status){
			$('#idEditar2').val(seccion.idseccion);
			$('#codigoEdit2').val(seccion.codseccion);
			$('#nombreEdit2').val(seccion.nombreseccion);			
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