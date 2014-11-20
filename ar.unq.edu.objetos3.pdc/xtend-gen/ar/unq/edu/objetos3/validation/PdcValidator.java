/**
 * generated by Xtext
 */
package ar.unq.edu.objetos3.validation;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.validation.AbstractPdcValidator;
import com.google.common.base.Objects;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class PdcValidator extends AbstractPdcValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkActivityStartsWithCapital(final Actividad actividad) {
    String _titulo = actividad.getTitulo();
    char _charAt = _titulo.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Title should start with a capital", 
        PdcPackage.Literals.ACTIVIDAD__TITULO, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkTitleIsUnique(final Schedule s) {
    EList<Actividad> _actividades = s.getActividades();
    final Function1<Actividad, String> _function = new Function1<Actividad, String>() {
      public String apply(final Actividad a) {
        return a.getTitulo();
      }
    };
    List<String> _map = ListExtensions.<Actividad, String>map(_actividades, _function);
    List<String> _list = IterableExtensions.<String>toList(_map);
    int _length = ((Object[])Conversions.unwrapArray(_list, Object.class)).length;
    EList<Actividad> _actividades_1 = s.getActividades();
    final Function1<Actividad, String> _function_1 = new Function1<Actividad, String>() {
      public String apply(final Actividad a) {
        return a.getTitulo();
      }
    };
    List<String> _map_1 = ListExtensions.<Actividad, String>map(_actividades_1, _function_1);
    Set<String> _set = IterableExtensions.<String>toSet(_map_1);
    int _length_1 = ((Object[])Conversions.unwrapArray(_set, Object.class)).length;
    boolean _greaterThan = (_length > _length_1);
    if (_greaterThan) {
      this.error("There are repeated titles", 
        PdcPackage.Literals.SCHEDULE__NOMBRE, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkActivityDurationl(final Actividad actividad) {
    int _duracion = actividad.getDuracion();
    boolean _lessThan = (_duracion < 30);
    if (_lessThan) {
      this.error("Duration must be at least 30 minutes", 
        PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkTitleExistance(final Actividad actividad) {
    String _titulo = actividad.getTitulo();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_titulo);
    if (_isNullOrEmpty) {
      this.error("Activity requires a title", 
        PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkActivityCapacity(final Actividad actividad) {
    final int x = actividad.getGenteEsperada();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(x, null)) {
        _matched=true;
        this.error("Specify Expected people", 
          PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, 
          PdcValidator.INVALID_NAME);
      }
    }
    if (!_matched) {
      Espacio _espacio = actividad.getEspacio();
      int _capacidad = _espacio.getCapacidad();
      boolean _greaterThan = (x > _capacidad);
      if (_greaterThan) {
        _matched=true;
        this.error("There is not enough space", 
          PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, 
          PdcValidator.INVALID_NAME);
      }
    }
    if (!_matched) {
      Espacio _espacio_1 = actividad.getEspacio();
      int _capacidad_1 = _espacio_1.getCapacidad();
      int _divide = (_capacidad_1 / 2);
      boolean _lessThan = (x < _divide);
      if (_lessThan) {
        _matched=true;
        this.warning("There is way too much space without being used", 
          PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, 
          PdcValidator.INVALID_NAME);
      }
    }
    if (!_matched) {
      Espacio _espacio_2 = actividad.getEspacio();
      int _capacidad_2 = _espacio_2.getCapacidad();
      int _multiply = (90 * _capacidad_2);
      int _divide_1 = (_multiply / 100);
      boolean _greaterThan_1 = (x > _divide_1);
      if (_greaterThan_1) {
        _matched=true;
        this.warning("Expected people almost exceeds capacity", 
          PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, 
          PdcValidator.INVALID_NAME);
      }
    }
  }
}
