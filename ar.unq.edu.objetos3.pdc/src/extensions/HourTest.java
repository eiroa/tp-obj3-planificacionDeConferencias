package extensions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourTest {

	private Horario horario;
	
	@Before
	public void setUp() throws Exception {
		horario = new Horario(1,25);
	}

	@Test
	public void testHorarioToMinutes() {
		assertEquals(85,horario.toMinutes());
	}

	@Test
	public void testHorarioBelongsTo(){
		Horario begin = new Horario(1,20);
		Horario end = new Horario(1,45);
		assertTrue(horario.belongsTo(begin, end));
	}
	
	@Test
	public void testHorarioNotBelongsTo(){
		Horario begin = new Horario(1,20);
		Horario end = new Horario(1,24);
		assertFalse(horario.belongsTo(begin, end));
	}
	
	@Test
	public void testCreateHorario(){
		Horario created = horario.createHour(1, 20);
		assertEquals(Integer.valueOf(1),created.getHora());
		assertEquals(Integer.valueOf(20),created.getMinutos());
	}
	
	@Test
	public void testPassTenMinutes(){
		horario = horario.pass(10);
		assertEquals(Integer.valueOf(1), horario.getHora());
		assertEquals(Integer.valueOf(35),horario.getMinutos());
	}
	
	@Test
	public void testPassMoreOfAnHour(){
		System.out.println(horario.getHora() + ":" + horario.getMinutos());
		horario = horario.pass(70);
		System.out.println(horario.getHora() + ":" + horario.getMinutos());
		assertEquals(Integer.valueOf(2),horario.getHora());
		assertEquals(Integer.valueOf(35),horario.getMinutos());
	}
	
	@Test
	public void testMinorHorario(){
		Horario minorHorario = new Horario(1,20);
		assertTrue(minorHorario.minor(horario));
	}
	
}
