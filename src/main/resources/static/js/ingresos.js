$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')

		$.get(href,function(ingreso, status){
			$('#idEditar').val(ingreso.idingreso);
			$('#fechaingresoEdit').val(ingreso.fechaingreso);
			$('#codingresoEdit').val(ingreso.codingreso);
			$('#detalleEdit').val(ingreso.detalle);
			$('#cantidadEdit').val(ingreso.cantidad);
			$('#unimedidaEdit').val(ingreso.unimedida);
			$('#valorunitarioEdit').val(ingreso.iva);
			$('#ivaEdit').val(ingreso.valorunitario);
			$('#valortotalEdit').val(ingreso.valortotal);
			
		});	
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href')
		
		$.get(href,function(ingreso, status){
			$('#idEditar2').val(ingreso.idingreso);
			$('#fechaingresoEdit2').val(ingreso.fechaingreso);
			$('#codingresoEdit2').val(ingreso.codingreso);
			$('#detalleEdit2').val(ingreso.detalle);
			$('#cantidadEdit2').val(ingreso.cantidad);
			$('#unimedidaEdit2').val(ingreso.unimedida);
			$('#valorunitarioEdit2').val(ingreso.iva);
			$('#ivaEdit2').val(ingreso.valorunitario);
			$('#valortotalEdit2').val(ingreso.valortotal);
				
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