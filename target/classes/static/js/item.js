$('document').ready(function() {
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(item, status){
			$('#idEditar').val(item.iditem);
			$('#codigoEdit').val(item.coditem);
			$('#nombreEdit').val(item.descripcion);
			$('#provedorEdit').val(item.proveedor);
			$('#unimedidaEdit').val(item.unimedida);
			$('#ivaEdit').val(item.iva);
			$('#precioEdit').val(item.precio);
				
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