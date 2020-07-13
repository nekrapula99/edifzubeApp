$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(item, status){
			$('#idEditar').val(item.iditem);
			$('#codigoEdit').val(item.coditem);
			$('#nombreEdit').val(item.descripcion);
			$('#ddlSeccionEdit').val(item.seccionid);
			$('#proveedorEdit').val(item.proveedor);
			$('#unimedidaEdit').val(item.unimedida);
			$('#ivaEdit').val(item.iva);
			$('#precioEdit').val(item.precio);
		});	
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(item, status){
			$('#idEditar2').val(item.iditem);
			$('#codigoEdit2').val(item.coditem);
			$('#nombreEdit2').val(item.descripcion);
			$('#ddlSeccionEdit2').val(item.seccionid);
			$('#proveedorEdit2').val(item.proveedor);
			$('#unimedidaEdit2').val(item.unimedida);
			$('#ivaEdit2').val(item.iva);
			$('#precioEdit2').val(item.precio);
				
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