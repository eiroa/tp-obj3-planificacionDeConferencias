package extensions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import extensions.ActivitiesExtension;

public class ActividadesTest {
	
	Espacio espacio;
	Espacio sndEspacio;
	Horario horario;
	Horario sndHorario;
	Horario trdHorario;
	Actividad act;
	Actividad sndAct;
	Actividad trdAct;
	List<Actividad> acts = new ArrayList<Actividad>();
	Schedule schedule;
	
	@Before
	public void setUp() throws Exception {
		espacio = new Espacio("Espacio");
		sndEspacio = new Espacio("Segundo espacio");
		horario = new Horario(1,20);
		sndHorario = new Horario(2,10);
		trdHorario = new Horario(3,05);
		act = new Actividad(90,"Un titulo",horario,espacio);
		sndAct = new Actividad(60,"Otro título",sndHorario,espacio);
		trdAct = new Actividad(60, "Otro título más",trdHorario,espacio);
		acts.add(sndAct);
		acts.add(act);
		acts.add(trdAct);
		schedule = new Schedule("Un scheduler",acts);
	}

	@Test
	public void testSortByPlaceAndTime() {
		Map<Espacio, List<Actividad>> sorted = schedule.activitiesSortedByPlaceAndTime();
		assertEquals(1,sorted.keySet().size());
		assertTrue(sorted.keySet().contains(espacio));
		List<Actividad> acts = sorted.get(espacio);
		assertEquals(act,acts.get(0));
		assertEquals(sndAct,acts.get(1));
		assertEquals(trdAct,acts.get(2));
	}
	
	@Test
	public void testHorarioBelongsToRange(){
		assertTrue(sndAct.getHorario().belongsTo(act.getHorario(),trdAct.getHorario()));
	}
	
	@Test
	public void testHorarioNotBelongsToRange(){
		assertFalse(trdAct.getHorario().belongsTo(sndAct.getHorario(),act.getHorario()));
	}
	
	@Test
	public void testHorariosSuperpuestos(){
		assertTrue(schedule.inTheMiddleOf(sndAct, act));
	}

}
