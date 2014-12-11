/*
 * generated by Xtext
 */
package ar.unq.edu.objetos3.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import ar.unq.edu.objetos3.pdc.Schedule
import ar.unq.edu.objetos3.pdc.Actividad
import ar.unq.edu.objetos3.pdc.Orador
import javax.sound.midi.Track

/**
 * Genera el HTML del schedule
 * 
 * NOTA IMPORTANTE:
 * El html generado está pensado para mirarlo localmente.
 * Debido a restricciones de origen cruzado, se debe inicializar el navegador con el flag que desactive la verificacion
 * De dominio cruzado para archivos locales. En particular, para Chrome, se debe inicializarlo con el siguiente flag:
 * 
 * --allow-file-access-from-files
 * 
 * 
 */
class PdcGenerator implements IGenerator {

	def String getKeynote(Actividad a) {
		if (a.keynote) {
			return "true"
		} else {
			return "false"
		}
	}

	def String getTrack(Actividad a) {
		if (a.track == null) {
			return '-'
		} else {
			return a.track.name
		}
	}

	def String getOradores(Actividad a) {
		if (a.oradores == null) {
			return '-'
		} else {
			var result = ''
			for (Orador o : a.oradores) {
				if (a.oradores.indexOf(o) == a.oradores.size - 1) {
					result = result.concat(o.name + ' de ' + o.organizacion.name)
				} else {
					result = result.concat(o.name + ' de ' + o.organizacion.name + ' , ')
				}
			}
			return result
		}
	}

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var actividades = resource.allContents.filter(typeof(Actividad)).toList.sortBy[a|a.horario.minutos].sortBy[a|
			a.horario.hora]
		fsa.generateFile('actividades.json',
			'[

{' + actividades.map [ a |
				" \"titulo\":" + "\"" + a.titulo + "\"" + ',' + "\"track\":" + "\"" + getTrack(a) + "\"" + ',' +
					"\"keynote\":" + "\"" + getKeynote(a) + "\"" + ',' + "\"espacio\":" + "\"" + a.espacio.name + "\"" +
					',' + "\"oradores\":" + "\"" + getOradores(a) + "\"" + ',' + "\"duracion\":" + "\"" + a.duracion +
					"\"" + ',' + " \"horario\": " + "\"" + a.horario.hora + ':' + a.horario.minutos +
					if (a.horario.minutos == 0) {
						'0'
					} else {
						''
					}
			].join("\"},{") + "\"
    }]")
		fsa.generateFile('schedule.html',
			'<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>' + resource.allContents.filter(typeof(Schedule)).map[nombre].join + '</title>
<meta name="description" content="">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.4.0/bootstrap-table.min.css">
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.4.0/bootstrap-table.min.js"></script>
<body ng-app="schedule" class="">
	
<div class="jumbotron">
<h1 class="text-center text-info">' + resource.allContents.filter(typeof(Schedule)).map[nombre].join + '</h1>
</div>



<script>
</script>
<div class="" id="print-content">
<form>

  
<p class="text-center text-danger">Cronograma oficial para la conferencia</p>
<table data-toggle="table" data-url="actividades.json"  data-height="500">
    <thead>
        <tr>
            <th data-field="titulo" data-formatter="nameFormatter" data-sortable="true" >Titulo</th>
			<th data-field="track" data-sortable="true" >Temática</th>
			<th data-field="oradores" data-sortable="true">Oradores</th>
			<th data-field="espacio" data-sortable="true">Espacio</th>
			<th data-field="duracion" data-sortable="true">Duración en minutos</th>
            <th data-field="horario" data-sortable="true">Horario</th>
        </tr>
    </thead>
</table>

<script>
    function nameFormatter(value, row) {
		if(row.keynote == "true"){
			return \'<i class="glyphicon glyphicon-star"></i> \' + value;
		}else{
			return value;
		}
        
    }

    function priceFormatter(value) {
        // 16777215 == ffffff in decimal
        var color = \'#\'+Math.floor(Math.random() * 6777215).toString(16);
        return \'<div  style="color: \' + color + \'">\' +
                \'<i class="glyphicon glyphicon-usd"></i>\' +
                value.substring(1) +
                \'</div>\';
    }
function printDiv(divName) {
 var printContents = document.getElementById(divName).innerHTML;
 w=window.open();
 w.document.write(printContents);
 w.print();
 w.close();
}
</script>
</div>
<span class="glyphicon glyphicon-print">
<input type="button"  class="btn btn-success" onclick="printDiv(\'print-content\')" value="Imprimir cronograma">
  </input>
</form>

</body>
</html>')
	}

}
