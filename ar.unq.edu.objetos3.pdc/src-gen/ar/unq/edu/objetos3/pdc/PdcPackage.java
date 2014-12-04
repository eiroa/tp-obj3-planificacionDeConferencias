/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ar.unq.edu.objetos3.pdc.PdcFactory
 * @model kind="package"
 * @generated
 */
public interface PdcPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pdc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unq.ar/edu/objetos3/Pdc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pdc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdcPackage eINSTANCE = ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl.init();

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.PDCImpl <em>PDC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.PDCImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getPDC()
   * @generated
   */
  int PDC = 0;

  /**
   * The feature id for the '<em><b>Las Organizaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC__LAS_ORGANIZACIONES = 0;

  /**
   * The feature id for the '<em><b>Los Oradores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC__LOS_ORADORES = 1;

  /**
   * The feature id for the '<em><b>Los Espacios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC__LOS_ESPACIOS = 2;

  /**
   * The feature id for the '<em><b>Los Tracks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC__LOS_TRACKS = 3;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC__SCHEDULE = 4;

  /**
   * The number of structural features of the '<em>PDC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDC_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.OrganizacionesImpl <em>Organizaciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.OrganizacionesImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrganizaciones()
   * @generated
   */
  int ORGANIZACIONES = 1;

  /**
   * The feature id for the '<em><b>Organizaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZACIONES__ORGANIZACIONES = 0;

  /**
   * The number of structural features of the '<em>Organizaciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZACIONES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.OradoresImpl <em>Oradores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.OradoresImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOradores()
   * @generated
   */
  int ORADORES = 2;

  /**
   * The feature id for the '<em><b>Oradores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADORES__ORADORES = 0;

  /**
   * The number of structural features of the '<em>Oradores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADORES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.EspaciosImpl <em>Espacios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.EspaciosImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacios()
   * @generated
   */
  int ESPACIOS = 3;

  /**
   * The feature id for the '<em><b>Espacios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIOS__ESPACIOS = 0;

  /**
   * The number of structural features of the '<em>Espacios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIOS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.TracksImpl <em>Tracks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.TracksImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTracks()
   * @generated
   */
  int TRACKS = 4;

  /**
   * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKS__TRACKS = 0;

  /**
   * The number of structural features of the '<em>Tracks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.ScheduleImpl <em>Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.ScheduleImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getSchedule()
   * @generated
   */
  int SCHEDULE = 5;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__ACTIVIDADES = 1;

  /**
   * The number of structural features of the '<em>Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl <em>Organizacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrganizacion()
   * @generated
   */
  int ORGANIZACION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZACION__NAME = 0;

  /**
   * The number of structural features of the '<em>Organizacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZACION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.OradorImpl <em>Orador</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.OradorImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrador()
   * @generated
   */
  int ORADOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Organizacion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADOR__ORGANIZACION = 1;

  /**
   * The number of structural features of the '<em>Orador</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl <em>Espacio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.EspacioImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacio()
   * @generated
   */
  int ESPACIO = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO__CAPACIDAD = 1;

  /**
   * The feature id for the '<em><b>Tiene Computadoras</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO__TIENE_COMPUTADORAS = 2;

  /**
   * The number of structural features of the '<em>Espacio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl <em>Actividad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.ActividadImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getActividad()
   * @generated
   */
  int ACTIVIDAD = 9;

  /**
   * The feature id for the '<em><b>Es Charla</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_CHARLA = 0;

  /**
   * The feature id for the '<em><b>Es Mesa De Debate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_MESA_DE_DEBATE = 1;

  /**
   * The feature id for the '<em><b>Es Taller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_TALLER = 2;

  /**
   * The feature id for the '<em><b>Es Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_BREAK = 3;

  /**
   * The feature id for the '<em><b>Es Evento De Inauguracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_EVENTO_DE_INAUGURACION = 4;

  /**
   * The feature id for the '<em><b>Es Registracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_REGISTRACION = 5;

  /**
   * The feature id for the '<em><b>Es Evento De Cierre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ES_EVENTO_DE_CIERRE = 6;

  /**
   * The feature id for the '<em><b>Keynote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__KEYNOTE = 7;

  /**
   * The feature id for the '<em><b>Tipo De Break</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__TIPO_DE_BREAK = 8;

  /**
   * The feature id for the '<em><b>Track</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__TRACK = 9;

  /**
   * The feature id for the '<em><b>Titulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__TITULO = 10;

  /**
   * The feature id for the '<em><b>Duracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__DURACION = 11;

  /**
   * The feature id for the '<em><b>Espacio</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ESPACIO = 12;

  /**
   * The feature id for the '<em><b>Gente Esperada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__GENTE_ESPERADA = 13;

  /**
   * The feature id for the '<em><b>Oradores</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ORADORES = 14;

  /**
   * The feature id for the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__HORARIO = 15;

  /**
   * The number of structural features of the '<em>Actividad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.TipoDeBreakImpl <em>Tipo De Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.TipoDeBreakImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTipoDeBreak()
   * @generated
   */
  int TIPO_DE_BREAK = 10;

  /**
   * The number of structural features of the '<em>Tipo De Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPO_DE_BREAK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.DesayunoImpl <em>Desayuno</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.DesayunoImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getDesayuno()
   * @generated
   */
  int DESAYUNO = 11;

  /**
   * The number of structural features of the '<em>Desayuno</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESAYUNO_FEATURE_COUNT = TIPO_DE_BREAK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.AlmuerzoImpl <em>Almuerzo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.AlmuerzoImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getAlmuerzo()
   * @generated
   */
  int ALMUERZO = 12;

  /**
   * The number of structural features of the '<em>Almuerzo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALMUERZO_FEATURE_COUNT = TIPO_DE_BREAK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.MeriendaImpl <em>Merienda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.MeriendaImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getMerienda()
   * @generated
   */
  int MERIENDA = 13;

  /**
   * The number of structural features of the '<em>Merienda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERIENDA_FEATURE_COUNT = TIPO_DE_BREAK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.HorarioImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getHorario()
   * @generated
   */
  int HORARIO = 14;

  /**
   * The feature id for the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HORA = 0;

  /**
   * The feature id for the '<em><b>Minutos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__MINUTOS = 1;

  /**
   * The number of structural features of the '<em>Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.TrackImpl <em>Track</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.TrackImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTrack()
   * @generated
   */
  int TRACK = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__NAME = 0;

  /**
   * The number of structural features of the '<em>Track</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.PDC <em>PDC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PDC</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC
   * @generated
   */
  EClass getPDC();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.PDC#getLasOrganizaciones <em>Las Organizaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Las Organizaciones</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC#getLasOrganizaciones()
   * @see #getPDC()
   * @generated
   */
  EReference getPDC_LasOrganizaciones();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.PDC#getLosOradores <em>Los Oradores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Los Oradores</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC#getLosOradores()
   * @see #getPDC()
   * @generated
   */
  EReference getPDC_LosOradores();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.PDC#getLosEspacios <em>Los Espacios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Los Espacios</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC#getLosEspacios()
   * @see #getPDC()
   * @generated
   */
  EReference getPDC_LosEspacios();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.PDC#getLosTracks <em>Los Tracks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Los Tracks</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC#getLosTracks()
   * @see #getPDC()
   * @generated
   */
  EReference getPDC_LosTracks();

  /**
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.PDC#getSchedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schedule</em>'.
   * @see ar.unq.edu.objetos3.pdc.PDC#getSchedule()
   * @see #getPDC()
   * @generated
   */
  EReference getPDC_Schedule();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Organizaciones <em>Organizaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organizaciones</em>'.
   * @see ar.unq.edu.objetos3.pdc.Organizaciones
   * @generated
   */
  EClass getOrganizaciones();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Organizaciones#getOrganizaciones <em>Organizaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Organizaciones</em>'.
   * @see ar.unq.edu.objetos3.pdc.Organizaciones#getOrganizaciones()
   * @see #getOrganizaciones()
   * @generated
   */
  EReference getOrganizaciones_Organizaciones();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Oradores <em>Oradores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oradores</em>'.
   * @see ar.unq.edu.objetos3.pdc.Oradores
   * @generated
   */
  EClass getOradores();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Oradores#getOradores <em>Oradores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Oradores</em>'.
   * @see ar.unq.edu.objetos3.pdc.Oradores#getOradores()
   * @see #getOradores()
   * @generated
   */
  EReference getOradores_Oradores();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Espacios <em>Espacios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Espacios</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacios
   * @generated
   */
  EClass getEspacios();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Espacios#getEspacios <em>Espacios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Espacios</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacios#getEspacios()
   * @see #getEspacios()
   * @generated
   */
  EReference getEspacios_Espacios();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Tracks <em>Tracks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tracks</em>'.
   * @see ar.unq.edu.objetos3.pdc.Tracks
   * @generated
   */
  EClass getTracks();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Tracks#getTracks <em>Tracks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tracks</em>'.
   * @see ar.unq.edu.objetos3.pdc.Tracks#getTracks()
   * @see #getTracks()
   * @generated
   */
  EReference getTracks_Tracks();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schedule</em>'.
   * @see ar.unq.edu.objetos3.pdc.Schedule
   * @generated
   */
  EClass getSchedule();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Schedule#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see ar.unq.edu.objetos3.pdc.Schedule#getNombre()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Nombre();

  /**
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Schedule#getActividades <em>Actividades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actividades</em>'.
   * @see ar.unq.edu.objetos3.pdc.Schedule#getActividades()
   * @see #getSchedule()
   * @generated
   */
  EReference getSchedule_Actividades();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Organizacion <em>Organizacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organizacion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Organizacion
   * @generated
   */
  EClass getOrganizacion();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Organizacion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.unq.edu.objetos3.pdc.Organizacion#getName()
   * @see #getOrganizacion()
   * @generated
   */
  EAttribute getOrganizacion_Name();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Orador <em>Orador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orador</em>'.
   * @see ar.unq.edu.objetos3.pdc.Orador
   * @generated
   */
  EClass getOrador();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Orador#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.unq.edu.objetos3.pdc.Orador#getName()
   * @see #getOrador()
   * @generated
   */
  EAttribute getOrador_Name();

  /**
   * Returns the meta object for the reference '{@link ar.unq.edu.objetos3.pdc.Orador#getOrganizacion <em>Organizacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Organizacion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Orador#getOrganizacion()
   * @see #getOrador()
   * @generated
   */
  EReference getOrador_Organizacion();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Espacio <em>Espacio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Espacio</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio
   * @generated
   */
  EClass getEspacio();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Espacio#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio#getName()
   * @see #getEspacio()
   * @generated
   */
  EAttribute getEspacio_Name();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Espacio#getCapacidad <em>Capacidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacidad</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio#getCapacidad()
   * @see #getEspacio()
   * @generated
   */
  EAttribute getEspacio_Capacidad();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Espacio#isTieneComputadoras <em>Tiene Computadoras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tiene Computadoras</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio#isTieneComputadoras()
   * @see #getEspacio()
   * @generated
   */
  EAttribute getEspacio_TieneComputadoras();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Actividad <em>Actividad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actividad</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad
   * @generated
   */
  EClass getActividad();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsCharla <em>Es Charla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Charla</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsCharla()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsCharla();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsMesaDeDebate <em>Es Mesa De Debate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Mesa De Debate</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsMesaDeDebate()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsMesaDeDebate();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsTaller <em>Es Taller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Taller</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsTaller()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsTaller();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsBreak <em>Es Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Break</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsBreak()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsBreak();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeInauguracion <em>Es Evento De Inauguracion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Evento De Inauguracion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeInauguracion()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsEventoDeInauguracion();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsRegistracion <em>Es Registracion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Registracion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsRegistracion()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsRegistracion();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeCierre <em>Es Evento De Cierre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Evento De Cierre</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeCierre()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_EsEventoDeCierre();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#isKeynote <em>Keynote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keynote</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#isKeynote()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_Keynote();

  /**
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getTipoDeBreak <em>Tipo De Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo De Break</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getTipoDeBreak()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_TipoDeBreak();

  /**
   * Returns the meta object for the reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getTrack <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Track</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getTrack()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_Track();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#getTitulo <em>Titulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Titulo</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getTitulo()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_Titulo();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#getDuracion <em>Duracion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duracion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getDuracion()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_Duracion();

  /**
   * Returns the meta object for the reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getEspacio <em>Espacio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Espacio</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getEspacio()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_Espacio();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Actividad#getGenteEsperada <em>Gente Esperada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gente Esperada</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getGenteEsperada()
   * @see #getActividad()
   * @generated
   */
  EAttribute getActividad_GenteEsperada();

  /**
   * Returns the meta object for the reference list '{@link ar.unq.edu.objetos3.pdc.Actividad#getOradores <em>Oradores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Oradores</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getOradores()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_Oradores();

  /**
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getHorario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horario</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getHorario()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_Horario();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.TipoDeBreak <em>Tipo De Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tipo De Break</em>'.
   * @see ar.unq.edu.objetos3.pdc.TipoDeBreak
   * @generated
   */
  EClass getTipoDeBreak();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Desayuno <em>Desayuno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desayuno</em>'.
   * @see ar.unq.edu.objetos3.pdc.Desayuno
   * @generated
   */
  EClass getDesayuno();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Almuerzo <em>Almuerzo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Almuerzo</em>'.
   * @see ar.unq.edu.objetos3.pdc.Almuerzo
   * @generated
   */
  EClass getAlmuerzo();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Merienda <em>Merienda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Merienda</em>'.
   * @see ar.unq.edu.objetos3.pdc.Merienda
   * @generated
   */
  EClass getMerienda();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see ar.unq.edu.objetos3.pdc.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Horario#getHora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora</em>'.
   * @see ar.unq.edu.objetos3.pdc.Horario#getHora()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Hora();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Horario#getMinutos <em>Minutos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutos</em>'.
   * @see ar.unq.edu.objetos3.pdc.Horario#getMinutos()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Minutos();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Track</em>'.
   * @see ar.unq.edu.objetos3.pdc.Track
   * @generated
   */
  EClass getTrack();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Track#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.unq.edu.objetos3.pdc.Track#getName()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PdcFactory getPdcFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.PDCImpl <em>PDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.PDCImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getPDC()
     * @generated
     */
    EClass PDC = eINSTANCE.getPDC();

    /**
     * The meta object literal for the '<em><b>Las Organizaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDC__LAS_ORGANIZACIONES = eINSTANCE.getPDC_LasOrganizaciones();

    /**
     * The meta object literal for the '<em><b>Los Oradores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDC__LOS_ORADORES = eINSTANCE.getPDC_LosOradores();

    /**
     * The meta object literal for the '<em><b>Los Espacios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDC__LOS_ESPACIOS = eINSTANCE.getPDC_LosEspacios();

    /**
     * The meta object literal for the '<em><b>Los Tracks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDC__LOS_TRACKS = eINSTANCE.getPDC_LosTracks();

    /**
     * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDC__SCHEDULE = eINSTANCE.getPDC_Schedule();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.OrganizacionesImpl <em>Organizaciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.OrganizacionesImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrganizaciones()
     * @generated
     */
    EClass ORGANIZACIONES = eINSTANCE.getOrganizaciones();

    /**
     * The meta object literal for the '<em><b>Organizaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZACIONES__ORGANIZACIONES = eINSTANCE.getOrganizaciones_Organizaciones();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.OradoresImpl <em>Oradores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.OradoresImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOradores()
     * @generated
     */
    EClass ORADORES = eINSTANCE.getOradores();

    /**
     * The meta object literal for the '<em><b>Oradores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORADORES__ORADORES = eINSTANCE.getOradores_Oradores();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.EspaciosImpl <em>Espacios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.EspaciosImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacios()
     * @generated
     */
    EClass ESPACIOS = eINSTANCE.getEspacios();

    /**
     * The meta object literal for the '<em><b>Espacios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESPACIOS__ESPACIOS = eINSTANCE.getEspacios_Espacios();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.TracksImpl <em>Tracks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.TracksImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTracks()
     * @generated
     */
    EClass TRACKS = eINSTANCE.getTracks();

    /**
     * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACKS__TRACKS = eINSTANCE.getTracks_Tracks();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.ScheduleImpl <em>Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.ScheduleImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getSchedule()
     * @generated
     */
    EClass SCHEDULE = eINSTANCE.getSchedule();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__NOMBRE = eINSTANCE.getSchedule_Nombre();

    /**
     * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEDULE__ACTIVIDADES = eINSTANCE.getSchedule_Actividades();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl <em>Organizacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrganizacion()
     * @generated
     */
    EClass ORGANIZACION = eINSTANCE.getOrganizacion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZACION__NAME = eINSTANCE.getOrganizacion_Name();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.OradorImpl <em>Orador</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.OradorImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrador()
     * @generated
     */
    EClass ORADOR = eINSTANCE.getOrador();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORADOR__NAME = eINSTANCE.getOrador_Name();

    /**
     * The meta object literal for the '<em><b>Organizacion</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORADOR__ORGANIZACION = eINSTANCE.getOrador_Organizacion();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl <em>Espacio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.EspacioImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacio()
     * @generated
     */
    EClass ESPACIO = eINSTANCE.getEspacio();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPACIO__NAME = eINSTANCE.getEspacio_Name();

    /**
     * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPACIO__CAPACIDAD = eINSTANCE.getEspacio_Capacidad();

    /**
     * The meta object literal for the '<em><b>Tiene Computadoras</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPACIO__TIENE_COMPUTADORAS = eINSTANCE.getEspacio_TieneComputadoras();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl <em>Actividad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.ActividadImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getActividad()
     * @generated
     */
    EClass ACTIVIDAD = eINSTANCE.getActividad();

    /**
     * The meta object literal for the '<em><b>Es Charla</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_CHARLA = eINSTANCE.getActividad_EsCharla();

    /**
     * The meta object literal for the '<em><b>Es Mesa De Debate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_MESA_DE_DEBATE = eINSTANCE.getActividad_EsMesaDeDebate();

    /**
     * The meta object literal for the '<em><b>Es Taller</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_TALLER = eINSTANCE.getActividad_EsTaller();

    /**
     * The meta object literal for the '<em><b>Es Break</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_BREAK = eINSTANCE.getActividad_EsBreak();

    /**
     * The meta object literal for the '<em><b>Es Evento De Inauguracion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_EVENTO_DE_INAUGURACION = eINSTANCE.getActividad_EsEventoDeInauguracion();

    /**
     * The meta object literal for the '<em><b>Es Registracion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_REGISTRACION = eINSTANCE.getActividad_EsRegistracion();

    /**
     * The meta object literal for the '<em><b>Es Evento De Cierre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__ES_EVENTO_DE_CIERRE = eINSTANCE.getActividad_EsEventoDeCierre();

    /**
     * The meta object literal for the '<em><b>Keynote</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__KEYNOTE = eINSTANCE.getActividad_Keynote();

    /**
     * The meta object literal for the '<em><b>Tipo De Break</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__TIPO_DE_BREAK = eINSTANCE.getActividad_TipoDeBreak();

    /**
     * The meta object literal for the '<em><b>Track</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__TRACK = eINSTANCE.getActividad_Track();

    /**
     * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__TITULO = eINSTANCE.getActividad_Titulo();

    /**
     * The meta object literal for the '<em><b>Duracion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__DURACION = eINSTANCE.getActividad_Duracion();

    /**
     * The meta object literal for the '<em><b>Espacio</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__ESPACIO = eINSTANCE.getActividad_Espacio();

    /**
     * The meta object literal for the '<em><b>Gente Esperada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVIDAD__GENTE_ESPERADA = eINSTANCE.getActividad_GenteEsperada();

    /**
     * The meta object literal for the '<em><b>Oradores</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__ORADORES = eINSTANCE.getActividad_Oradores();

    /**
     * The meta object literal for the '<em><b>Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__HORARIO = eINSTANCE.getActividad_Horario();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.TipoDeBreakImpl <em>Tipo De Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.TipoDeBreakImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTipoDeBreak()
     * @generated
     */
    EClass TIPO_DE_BREAK = eINSTANCE.getTipoDeBreak();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.DesayunoImpl <em>Desayuno</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.DesayunoImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getDesayuno()
     * @generated
     */
    EClass DESAYUNO = eINSTANCE.getDesayuno();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.AlmuerzoImpl <em>Almuerzo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.AlmuerzoImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getAlmuerzo()
     * @generated
     */
    EClass ALMUERZO = eINSTANCE.getAlmuerzo();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.MeriendaImpl <em>Merienda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.MeriendaImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getMerienda()
     * @generated
     */
    EClass MERIENDA = eINSTANCE.getMerienda();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.HorarioImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getHorario()
     * @generated
     */
    EClass HORARIO = eINSTANCE.getHorario();

    /**
     * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__HORA = eINSTANCE.getHorario_Hora();

    /**
     * The meta object literal for the '<em><b>Minutos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__MINUTOS = eINSTANCE.getHorario_Minutos();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.TrackImpl <em>Track</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.TrackImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTrack()
     * @generated
     */
    EClass TRACK = eINSTANCE.getTrack();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

  }

} //PdcPackage
