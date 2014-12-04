/**
 * generated by Xtext
 */
package ar.unq.edu.objetos3.validation;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Horario;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Oradores;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.PDC;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.pdc.TipoDeBreak;
import ar.unq.edu.objetos3.pdc.Track;
import ar.unq.edu.objetos3.validation.AbstractPdcValidator;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
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
  public void checkActividadEmpiezaConMayuscula(final Actividad actividad) {
    String _titulo = actividad.getTitulo();
    char _charAt = _titulo.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning(
        "El titulo deberia comenzar con mayuscula", 
        PdcPackage.Literals.ACTIVIDAD__TITULO, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkTituloEsUnico(final Schedule s) {
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
      this.error("Existen titulos repetidos", PdcPackage.Literals.SCHEDULE__NOMBRE, PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkCharlaDuracion(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsCharla = actividad.isEsCharla();
    if (!_isEsCharla) {
      _and = false;
    } else {
      int _duracion = actividad.getDuracion();
      boolean _lessThan = (_duracion < 30);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Una charla no puede durar menos de 30 minutos", PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkMesaDebateDuracion(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsMesaDeDebate = actividad.isEsMesaDeDebate();
    if (!_isEsMesaDeDebate) {
      _and = false;
    } else {
      int _duracion = actividad.getDuracion();
      boolean _lessThan = (_duracion < 60);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Una mesa de debate no puede durar menos de 1 hora", PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkOradoresDeDistintaOrganizacion(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsMesaDeDebate = actividad.isEsMesaDeDebate();
    if (!_isEsMesaDeDebate) {
      _and = false;
    } else {
      EList<Orador> _oradores = actividad.getOradores();
      final Function1<Orador, Organizacion> _function = new Function1<Orador, Organizacion>() {
        public Organizacion apply(final Orador it) {
          return it.getOrganizacion();
        }
      };
      List<Organizacion> _map = ListExtensions.<Orador, Organizacion>map(_oradores, _function);
      Set<Organizacion> _set = IterableExtensions.<Organizacion>toSet(_map);
      int _size = _set.size();
      boolean _lessThan = (_size < 2);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Una mesa de debate no puede estar asociada a una sola organizacion", PdcPackage.Literals.ACTIVIDAD__ESPACIO, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkExistenciaDeTitulos(final Actividad actividad) {
    String _titulo = actividad.getTitulo();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_titulo);
    if (_isNullOrEmpty) {
      this.error("Actividad requiere titulo", PdcPackage.Literals.ACTIVIDAD__DURACION, PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkActividadesConcurrentes(final PDC pdc) {
    Schedule _schedule = pdc.getSchedule();
    EList<Actividad> _actividades = _schedule.getActividades();
    final Function1<Actividad, Espacio> _function = new Function1<Actividad, Espacio>() {
      public Espacio apply(final Actividad a) {
        return a.getEspacio();
      }
    };
    Map<Espacio, List<Actividad>> _groupBy = IterableExtensions.<Espacio, Actividad>groupBy(_actividades, _function);
    final Procedure2<Espacio, List<Actividad>> _function_1 = new Procedure2<Espacio, List<Actividad>>() {
      public void apply(final Espacio p1, final List<Actividad> p2) {
        int _length = ((Object[])Conversions.unwrapArray(p2, Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          final Function1<Actividad, Integer> _function = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getMinutos());
            }
          };
          List<Actividad> sortedValues = IterableExtensions.<Actividad, Integer>sortBy(p2, _function);
          final Function1<Actividad, Integer> _function_1 = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getHora());
            }
          };
          List<Actividad> _sortBy = IterableExtensions.<Actividad, Integer>sortBy(sortedValues, _function_1);
          sortedValues = _sortBy;
          int x = 0;
          for (final Actividad a : sortedValues) {
            {
              Horario _horario = a.getHorario();
              int _hora = _horario.getHora();
              int _multiply = (_hora * 60);
              Horario _horario_1 = a.getHorario();
              int _minutos = _horario_1.getMinutos();
              int _plus = (_multiply + _minutos);
              int _duracion = a.getDuracion();
              int totalMinutes = (_plus + _duracion);
              int _size = sortedValues.size();
              int _minus = (_size - x);
              boolean _greaterThan_1 = (_minus > 1);
              if (_greaterThan_1) {
                Actividad next = sortedValues.get((x + 1));
                Horario _horario_2 = next.getHorario();
                int _hora_1 = _horario_2.getHora();
                int _multiply_1 = (_hora_1 * 60);
                Horario _horario_3 = next.getHorario();
                int _minutos_1 = _horario_3.getMinutos();
                int nextTotalMinutes = (_multiply_1 + _minutos_1);
                if ((totalMinutes > nextTotalMinutes)) {
                  String _titulo = a.getTitulo();
                  String _plus_1 = ("Las actividades " + _titulo);
                  String _plus_2 = (_plus_1 + " y ");
                  String _titulo_1 = next.getTitulo();
                  String _plus_3 = (_plus_2 + _titulo_1);
                  String _plus_4 = (_plus_3 + " se superponen en el mismo lugar");
                  PdcValidator.this.error(_plus_4, 
                    PdcPackage.Literals.PDC__LOS_ESPACIOS, PdcValidator.INVALID_NAME);
                }
                x++;
              }
            }
          }
        }
      }
    };
    MapExtensions.<Espacio, List<Actividad>>forEach(_groupBy, _function_1);
  }
  
  @Check
  public void checkBloquesValidos(final PDC pdc) {
    Schedule _schedule = pdc.getSchedule();
    EList<Actividad> _actividades = _schedule.getActividades();
    final Function1<Actividad, Espacio> _function = new Function1<Actividad, Espacio>() {
      public Espacio apply(final Actividad a) {
        return a.getEspacio();
      }
    };
    Map<Espacio, List<Actividad>> _groupBy = IterableExtensions.<Espacio, Actividad>groupBy(_actividades, _function);
    final Procedure2<Espacio, List<Actividad>> _function_1 = new Procedure2<Espacio, List<Actividad>>() {
      public void apply(final Espacio p1, final List<Actividad> p2) {
        int _length = ((Object[])Conversions.unwrapArray(p2, Object.class)).length;
        boolean _greaterThan = (_length > 3);
        if (_greaterThan) {
          InputOutput.<String>println(((("Actividades posibles de constituir bloque para espacio " + p1) + " ---> ") + p2));
          final Function1<Actividad, Integer> _function = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getMinutos());
            }
          };
          List<Actividad> sortedValues = IterableExtensions.<Actividad, Integer>sortBy(p2, _function);
          final Function1<Actividad, Integer> _function_1 = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getHora());
            }
          };
          List<Actividad> _sortBy = IterableExtensions.<Actividad, Integer>sortBy(sortedValues, _function_1);
          sortedValues = _sortBy;
          boolean primerBreakEncontrado = false;
          int duracionTotal = 0;
          List tracks = new ArrayList<Object>();
          final List organizaciones = new ArrayList<Object>();
          for (final Actividad a : sortedValues) {
            {
              boolean _and = false;
              if (!primerBreakEncontrado) {
                _and = false;
              } else {
                boolean _isEsBreak = a.isEsBreak();
                boolean _not = (!_isEsBreak);
                _and = _not;
              }
              if (_and) {
                InputOutput.<String>println("posible actividad de bloque...");
                int _duracion = a.getDuracion();
                int _plus = (duracionTotal + _duracion);
                duracionTotal = _plus;
                InputOutput.<String>println(("Duracion hasta el momento: " + Integer.valueOf(duracionTotal)));
                Track _track = a.getTrack();
                tracks.add(_track);
                InputOutput.<String>println(("tracks al momento: " + tracks));
                EList<Orador> _oradores = a.getOradores();
                final Procedure1<Orador> _function_2 = new Procedure1<Orador>() {
                  public void apply(final Orador o) {
                    Organizacion _organizacion = o.getOrganizacion();
                    organizaciones.add(_organizacion);
                  }
                };
                IterableExtensions.<Orador>forEach(_oradores, _function_2);
                InputOutput.<String>println(("organizaciones de momento... " + organizaciones));
              }
              boolean _and_1 = false;
              if (!primerBreakEncontrado) {
                _and_1 = false;
              } else {
                boolean _isEsBreak_1 = a.isEsBreak();
                _and_1 = _isEsBreak_1;
              }
              if (_and_1) {
                InputOutput.<String>println("Encontrado el segundo Break");
                int _size = tracks.size();
                boolean _greaterThan_1 = (_size > 1);
                if (_greaterThan_1) {
                  if ((duracionTotal > 120)) {
                    String _name = p1.getName();
                    String _plus_1 = ("Existe un bloque de actividades en el lugar " + _name);
                    String _plus_2 = (_plus_1 + " con una duracion mayor de 2 horas");
                    PdcValidator.this.error(_plus_2, 
                      PdcPackage.Literals.PDC__SCHEDULE, PdcValidator.INVALID_NAME);
                  }
                  Set<Object> _set = IterableExtensions.<Object>toSet(tracks);
                  int _size_1 = _set.size();
                  boolean _greaterThan_2 = (_size_1 > 1);
                  if (_greaterThan_2) {
                    String _name_1 = p1.getName();
                    String _plus_3 = ("Existe un bloque de actividades en el lugar " + _name_1);
                    String _plus_4 = (_plus_3 + " cuyos tracks no corresponden al mismo");
                    PdcValidator.this.error(_plus_4, 
                      PdcPackage.Literals.PDC__SCHEDULE, PdcValidator.INVALID_NAME);
                  }
                  Set<Object> _set_1 = IterableExtensions.<Object>toSet(organizaciones);
                  int _size_2 = _set_1.size();
                  boolean _equals = (_size_2 == 1);
                  if (_equals) {
                    String _name_2 = p1.getName();
                    String _plus_5 = ("Existe un bloque de actividades en el lugar " + _name_2);
                    String _plus_6 = (_plus_5 + " perteneciente a una unica organizacion");
                    PdcValidator.this.warning(_plus_6, 
                      PdcPackage.Literals.PDC__LOS_ESPACIOS, PdcValidator.INVALID_NAME);
                  }
                  duracionTotal = 0;
                  ArrayList<Object> _arrayList = new ArrayList<Object>();
                  tracks = _arrayList;
                  organizaciones.clear();
                } else {
                  duracionTotal = 0;
                  ArrayList<Object> _arrayList_1 = new ArrayList<Object>();
                  tracks = _arrayList_1;
                  organizaciones.clear();
                }
              }
              if ((!primerBreakEncontrado)) {
                boolean _isEsBreak_2 = a.isEsBreak();
                if (_isEsBreak_2) {
                  InputOutput.<String>println("primer break encontrado...");
                  primerBreakEncontrado = true;
                }
              }
            }
          }
        }
      }
    };
    MapExtensions.<Espacio, List<Actividad>>forEach(_groupBy, _function_1);
  }
  
  @Check
  public void checkConcurrenciaDeOradores(final PDC pdc) {
    final HashMap<Orador, Iterable<Actividad>> map = new HashMap<Orador, Iterable<Actividad>>();
    EList<Oradores> _losOradores = pdc.getLosOradores();
    Oradores _head = IterableExtensions.<Oradores>head(_losOradores);
    EList<Orador> _oradores = _head.getOradores();
    final Procedure1<Orador> _function = new Procedure1<Orador>() {
      public void apply(final Orador o) {
        Schedule _schedule = pdc.getSchedule();
        EList<Actividad> _actividades = _schedule.getActividades();
        final Function1<Actividad, Boolean> _function = new Function1<Actividad, Boolean>() {
          public Boolean apply(final Actividad act) {
            EList<Orador> _oradores = act.getOradores();
            return Boolean.valueOf(_oradores.contains(o));
          }
        };
        Iterable<Actividad> actividadesRelacionadas = IterableExtensions.<Actividad>filter(_actividades, _function);
        map.put(o, actividadesRelacionadas);
      }
    };
    IterableExtensions.<Orador>forEach(_oradores, _function);
    final Procedure2<Orador, Iterable<Actividad>> _function_1 = new Procedure2<Orador, Iterable<Actividad>>() {
      public void apply(final Orador p1, final Iterable<Actividad> p2) {
        int _length = ((Object[])Conversions.unwrapArray(p2, Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          final Function1<Actividad, Integer> _function = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getMinutos());
            }
          };
          List<Actividad> sortedValues = IterableExtensions.<Actividad, Integer>sortBy(p2, _function);
          final Function1<Actividad, Integer> _function_1 = new Function1<Actividad, Integer>() {
            public Integer apply(final Actividad it) {
              Horario _horario = it.getHorario();
              return Integer.valueOf(_horario.getHora());
            }
          };
          List<Actividad> _sortBy = IterableExtensions.<Actividad, Integer>sortBy(sortedValues, _function_1);
          sortedValues = _sortBy;
          int x = 0;
          for (final Actividad a : sortedValues) {
            {
              Horario _horario = a.getHorario();
              int _hora = _horario.getHora();
              int _multiply = (_hora * 60);
              Horario _horario_1 = a.getHorario();
              int _minutos = _horario_1.getMinutos();
              int _plus = (_multiply + _minutos);
              int _duracion = a.getDuracion();
              int totalMinutes = (_plus + _duracion);
              int _size = sortedValues.size();
              int _minus = (_size - x);
              boolean _greaterThan_1 = (_minus > 1);
              if (_greaterThan_1) {
                Actividad next = sortedValues.get((x + 1));
                Horario _horario_2 = next.getHorario();
                int _hora_1 = _horario_2.getHora();
                int _multiply_1 = (_hora_1 * 60);
                Horario _horario_3 = next.getHorario();
                int _minutos_1 = _horario_3.getMinutos();
                int nextTotalMinutes = (_multiply_1 + _minutos_1);
                if ((totalMinutes == nextTotalMinutes)) {
                  String _name = p1.getName();
                  String _plus_1 = ("Advertencia, el orador " + _name);
                  String _plus_2 = (_plus_1 + " esta asignado a las actividades adyacentes");
                  String _titulo = a.getTitulo();
                  String _plus_3 = (_plus_2 + _titulo);
                  String _plus_4 = (_plus_3 + " y ");
                  String _titulo_1 = next.getTitulo();
                  String _plus_5 = (_plus_4 + _titulo_1);
                  PdcValidator.this.warning(_plus_5, PdcPackage.Literals.PDC__LOS_ORADORES, 
                    PdcValidator.INVALID_NAME);
                } else {
                  if ((totalMinutes > nextTotalMinutes)) {
                    String _titulo_2 = a.getTitulo();
                    String _plus_6 = ("Las actividades " + _titulo_2);
                    String _plus_7 = (_plus_6 + " y ");
                    String _titulo_3 = next.getTitulo();
                    String _plus_8 = (_plus_7 + _titulo_3);
                    String _plus_9 = (_plus_8 + " del orador ");
                    String _name_1 = p1.getName();
                    String _plus_10 = (_plus_9 + _name_1);
                    String _plus_11 = (_plus_10 + 
                      " se superponen");
                    PdcValidator.this.error(_plus_11, PdcPackage.Literals.PDC__SCHEDULE, PdcValidator.INVALID_NAME);
                  }
                }
                x++;
              }
            }
          }
        }
      }
    };
    MapExtensions.<Orador, Iterable<Actividad>>forEach(map, _function_1);
  }
  
  @Check
  public void checkExclusividadCharlasKeynote(final PDC pdc) {
    Schedule _schedule = pdc.getSchedule();
    EList<Actividad> _actividades = _schedule.getActividades();
    final Function1<Actividad, Boolean> _function = new Function1<Actividad, Boolean>() {
      public Boolean apply(final Actividad act) {
        return Boolean.valueOf(act.isEsCharla());
      }
    };
    Iterable<Actividad> _filter = IterableExtensions.<Actividad>filter(_actividades, _function);
    final Function1<Actividad, Integer> _function_1 = new Function1<Actividad, Integer>() {
      public Integer apply(final Actividad it) {
        Horario _horario = it.getHorario();
        return Integer.valueOf(_horario.getMinutos());
      }
    };
    List<Actividad> sortedValues = IterableExtensions.<Actividad, Integer>sortBy(_filter, _function_1);
    final Function1<Actividad, Integer> _function_2 = new Function1<Actividad, Integer>() {
      public Integer apply(final Actividad it) {
        Horario _horario = it.getHorario();
        return Integer.valueOf(_horario.getHora());
      }
    };
    List<Actividad> _sortBy = IterableExtensions.<Actividad, Integer>sortBy(sortedValues, _function_2);
    sortedValues = _sortBy;
    int x = 0;
    for (final Actividad a : sortedValues) {
      {
        Horario _horario = a.getHorario();
        int _hora = _horario.getHora();
        int _multiply = (_hora * 60);
        Horario _horario_1 = a.getHorario();
        int _minutos = _horario_1.getMinutos();
        int _plus = (_multiply + _minutos);
        int _duracion = a.getDuracion();
        int totalMinutes = (_plus + _duracion);
        int _size = sortedValues.size();
        int _minus = (_size - x);
        boolean _greaterThan = (_minus > 1);
        if (_greaterThan) {
          Actividad next = sortedValues.get((x + 1));
          Horario _horario_2 = next.getHorario();
          int _hora_1 = _horario_2.getHora();
          int _multiply_1 = (_hora_1 * 60);
          Horario _horario_3 = next.getHorario();
          int _minutos_1 = _horario_3.getMinutos();
          int nextTotalMinutes = (_multiply_1 + _minutos_1);
          boolean _and = false;
          boolean _isKeynote = a.isKeynote();
          if (!_isKeynote) {
            _and = false;
          } else {
            _and = (totalMinutes > nextTotalMinutes);
          }
          if (_and) {
            String _titulo = a.getTitulo();
            String _plus_1 = ("La charla keynote " + _titulo);
            String _plus_2 = (_plus_1 + " se superpone con el horario de la actividad ");
            String _titulo_1 = next.getTitulo();
            String _plus_3 = (_plus_2 + _titulo_1);
            this.error(_plus_3, 
              PdcPackage.Literals.PDC__SCHEDULE, PdcValidator.INVALID_NAME);
          }
          x++;
        }
      }
    }
  }
  
  @Check
  public void checkMesaDebate2Oradores(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsMesaDeDebate = actividad.isEsMesaDeDebate();
    if (!_isEsMesaDeDebate) {
      _and = false;
    } else {
      EList<Orador> _oradores = actividad.getOradores();
      int _length = ((Object[])Conversions.unwrapArray(_oradores, Object.class)).length;
      boolean _lessThan = (_length < 2);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Mesa de debate necesita 2 oradores al menos", PdcPackage.Literals.ACTIVIDAD__ORADORES, PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkHorariosValidos(final Horario horario) {
    boolean _or = false;
    int _hora = horario.getHora();
    boolean _lessThan = (_hora < 0);
    if (_lessThan) {
      _or = true;
    } else {
      int _hora_1 = horario.getHora();
      boolean _greaterThan = (_hora_1 > 23);
      _or = _greaterThan;
    }
    if (_or) {
      this.error("Hora invalida utilice valores entre 0 y 23", PdcPackage.Literals.HORARIO__HORA, PdcValidator.INVALID_NAME);
    }
    boolean _or_1 = false;
    int _minutos = horario.getMinutos();
    boolean _lessThan_1 = (_minutos < 0);
    if (_lessThan_1) {
      _or_1 = true;
    } else {
      int _minutos_1 = horario.getMinutos();
      boolean _greaterThan_1 = (_minutos_1 > 59);
      _or_1 = _greaterThan_1;
    }
    if (_or_1) {
      this.error("Minutos invalidos utilice valores entre 0 y 59", PdcPackage.Literals.HORARIO__MINUTOS, PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkDuracionBreak(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsBreak = actividad.isEsBreak();
    if (!_isEsBreak) {
      _and = false;
    } else {
      int _duracion = actividad.getDuracion();
      boolean _lessThan = (_duracion < 15);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Los breaks no pueden durar menos de 15 minutos", PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkDuracionAlmuerzo(final Actividad actividad) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isEsBreak = actividad.isEsBreak();
    if (!_isEsBreak) {
      _and_1 = false;
    } else {
      TipoDeBreak _tipoDeBreak = actividad.getTipoDeBreak();
      EClass _eClass = _tipoDeBreak.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("Almuerzo");
      _and_1 = _equals;
    }
    if (!_and_1) {
      _and = false;
    } else {
      int _duracion = actividad.getDuracion();
      boolean _lessThan = (_duracion < 45);
      _and = _lessThan;
    }
    if (_and) {
      this.error("Los almuerzos no pueden durar menos de 45 minutos", PdcPackage.Literals.ACTIVIDAD__DURACION, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkAulasConMaquinasSoloParaTalleres(final Actividad actividad) {
    boolean _and = false;
    Espacio _espacio = actividad.getEspacio();
    boolean _isTieneComputadoras = _espacio.isTieneComputadoras();
    if (!_isTieneComputadoras) {
      _and = false;
    } else {
      boolean _isEsTaller = actividad.isEsTaller();
      boolean _not = (!_isEsTaller);
      _and = _not;
    }
    if (_and) {
      this.error("Un aula con computadoras solo puede utilizarse para talleres", PdcPackage.Literals.ACTIVIDAD__ESPACIO, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkTallerDebeTenerComputadoras(final Actividad actividad) {
    boolean _and = false;
    boolean _isEsTaller = actividad.isEsTaller();
    if (!_isEsTaller) {
      _and = false;
    } else {
      Espacio _espacio = actividad.getEspacio();
      boolean _isTieneComputadoras = _espacio.isTieneComputadoras();
      _and = _isTieneComputadoras;
    }
    if (_and) {
      this.error("Un taller solo puede llevarse a cabo en un aula con maquinas", PdcPackage.Literals.ACTIVIDAD__ESPACIO, 
        PdcValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkCapacidadActividad(final Actividad actividad) {
    final int x = actividad.getGenteEsperada();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(x, null)) {
        _matched=true;
        String _titulo = actividad.getTitulo();
        String _plus = ("Especifique la gente esperada para la actividad " + _titulo);
        this.error(_plus, PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, PdcValidator.INVALID_NAME);
      }
    }
    if (!_matched) {
      Espacio _espacio = actividad.getEspacio();
      int _capacidad = _espacio.getCapacidad();
      boolean _greaterThan = (x > _capacidad);
      if (_greaterThan) {
        _matched=true;
        String _titulo_1 = actividad.getTitulo();
        String _plus_1 = ("No hay suficiente espacio en actividad " + _titulo_1);
        this.error(_plus_1, PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, PdcValidator.INVALID_NAME);
      }
    }
    if (!_matched) {
      Espacio _espacio_1 = actividad.getEspacio();
      int _capacidad_1 = _espacio_1.getCapacidad();
      int _divide = (_capacidad_1 / 2);
      boolean _lessThan = (x < _divide);
      if (_lessThan) {
        _matched=true;
        String _titulo_2 = actividad.getTitulo();
        String _plus_2 = ("Existe demasiado espacio en actividad " + _titulo_2);
        String _plus_3 = (_plus_2 + " sin usar");
        this.warning(_plus_3, PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, 
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
        String _titulo_3 = actividad.getTitulo();
        String _plus_4 = ("La cantidad de gente esperada para la actividad " + _titulo_3);
        String _plus_5 = (_plus_4 + " es próxima a la capacidad máxima del lugar");
        this.warning(_plus_5, 
          PdcPackage.Literals.ACTIVIDAD__GENTE_ESPERADA, PdcValidator.INVALID_NAME);
      }
    }
  }
}
