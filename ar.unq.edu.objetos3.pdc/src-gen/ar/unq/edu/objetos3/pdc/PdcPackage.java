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
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.ScheduleImpl <em>Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.ScheduleImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getSchedule()
   * @generated
   */
  int SCHEDULE = 0;

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
   * The feature id for the '<em><b>Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__FIN = 2;

  /**
   * The number of structural features of the '<em>Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl <em>Organizacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.OrganizacionImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getOrganizacion()
   * @generated
   */
  int ORGANIZACION = 1;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZACION__NOMBRE = 0;

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
  int ORADOR = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORADOR__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Organizacion</b></em>' containment reference.
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
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl <em>Actividad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.ActividadImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getActividad()
   * @generated
   */
  int ACTIVIDAD = 3;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__TIPO = 0;

  /**
   * The feature id for the '<em><b>Titulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__TITULO = 1;

  /**
   * The feature id for the '<em><b>Duracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__DURACION = 2;

  /**
   * The feature id for the '<em><b>Espacio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ESPACIO = 3;

  /**
   * The feature id for the '<em><b>Gente Esperada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__GENTE_ESPERADA = 4;

  /**
   * The feature id for the '<em><b>Oradores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__ORADORES = 5;

  /**
   * The feature id for the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD__HORARIO = 6;

  /**
   * The number of structural features of the '<em>Actividad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVIDAD_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl <em>Espacio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.EspacioImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacio()
   * @generated
   */
  int ESPACIO = 4;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO__CAPACIDAD = 1;

  /**
   * The number of structural features of the '<em>Espacio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPACIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.TipoDeActividadImpl <em>Tipo De Actividad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.TipoDeActividadImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTipoDeActividad()
   * @generated
   */
  int TIPO_DE_ACTIVIDAD = 5;

  /**
   * The number of structural features of the '<em>Tipo De Actividad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPO_DE_ACTIVIDAD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.HoraImpl <em>Hora</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.HoraImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getHora()
   * @generated
   */
  int HORA = 6;

  /**
   * The feature id for the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORA__HORA = 0;

  /**
   * The feature id for the '<em><b>Minutos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORA__MINUTOS = 1;

  /**
   * The number of structural features of the '<em>Hora</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.CharlaImpl <em>Charla</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.CharlaImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getCharla()
   * @generated
   */
  int CHARLA = 7;

  /**
   * The number of structural features of the '<em>Charla</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARLA_FEATURE_COUNT = TIPO_DE_ACTIVIDAD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.TallerImpl <em>Taller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.TallerImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTaller()
   * @generated
   */
  int TALLER = 8;

  /**
   * The number of structural features of the '<em>Taller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALLER_FEATURE_COUNT = TIPO_DE_ACTIVIDAD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl <em>Mesa De Debate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl
   * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getMesaDeDebate()
   * @generated
   */
  int MESA_DE_DEBATE = 9;

  /**
   * The number of structural features of the '<em>Mesa De Debate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESA_DE_DEBATE_FEATURE_COUNT = TIPO_DE_ACTIVIDAD_FEATURE_COUNT + 0;


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
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Schedule#getFin <em>Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fin</em>'.
   * @see ar.unq.edu.objetos3.pdc.Schedule#getFin()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Fin();

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
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Organizacion#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see ar.unq.edu.objetos3.pdc.Organizacion#getNombre()
   * @see #getOrganizacion()
   * @generated
   */
  EAttribute getOrganizacion_Nombre();

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
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Orador#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see ar.unq.edu.objetos3.pdc.Orador#getNombre()
   * @see #getOrador()
   * @generated
   */
  EAttribute getOrador_Nombre();

  /**
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.Orador#getOrganizacion <em>Organizacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Organizacion</em>'.
   * @see ar.unq.edu.objetos3.pdc.Orador#getOrganizacion()
   * @see #getOrador()
   * @generated
   */
  EReference getOrador_Organizacion();

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
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see ar.unq.edu.objetos3.pdc.Actividad#getTipo()
   * @see #getActividad()
   * @generated
   */
  EReference getActividad_Tipo();

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
   * Returns the meta object for the containment reference '{@link ar.unq.edu.objetos3.pdc.Actividad#getEspacio <em>Espacio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Espacio</em>'.
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
   * Returns the meta object for the containment reference list '{@link ar.unq.edu.objetos3.pdc.Actividad#getOradores <em>Oradores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Oradores</em>'.
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
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Espacio <em>Espacio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Espacio</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio
   * @generated
   */
  EClass getEspacio();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Espacio#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see ar.unq.edu.objetos3.pdc.Espacio#getNombre()
   * @see #getEspacio()
   * @generated
   */
  EAttribute getEspacio_Nombre();

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
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.TipoDeActividad <em>Tipo De Actividad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tipo De Actividad</em>'.
   * @see ar.unq.edu.objetos3.pdc.TipoDeActividad
   * @generated
   */
  EClass getTipoDeActividad();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Hora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hora</em>'.
   * @see ar.unq.edu.objetos3.pdc.Hora
   * @generated
   */
  EClass getHora();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Hora#getHora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora</em>'.
   * @see ar.unq.edu.objetos3.pdc.Hora#getHora()
   * @see #getHora()
   * @generated
   */
  EAttribute getHora_Hora();

  /**
   * Returns the meta object for the attribute '{@link ar.unq.edu.objetos3.pdc.Hora#getMinutos <em>Minutos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutos</em>'.
   * @see ar.unq.edu.objetos3.pdc.Hora#getMinutos()
   * @see #getHora()
   * @generated
   */
  EAttribute getHora_Minutos();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Charla <em>Charla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Charla</em>'.
   * @see ar.unq.edu.objetos3.pdc.Charla
   * @generated
   */
  EClass getCharla();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.Taller <em>Taller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Taller</em>'.
   * @see ar.unq.edu.objetos3.pdc.Taller
   * @generated
   */
  EClass getTaller();

  /**
   * Returns the meta object for class '{@link ar.unq.edu.objetos3.pdc.MesaDeDebate <em>Mesa De Debate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mesa De Debate</em>'.
   * @see ar.unq.edu.objetos3.pdc.MesaDeDebate
   * @generated
   */
  EClass getMesaDeDebate();

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
     * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__FIN = eINSTANCE.getSchedule_Fin();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZACION__NOMBRE = eINSTANCE.getOrganizacion_Nombre();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORADOR__NOMBRE = eINSTANCE.getOrador_Nombre();

    /**
     * The meta object literal for the '<em><b>Organizacion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORADOR__ORGANIZACION = eINSTANCE.getOrador_Organizacion();

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
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVIDAD__TIPO = eINSTANCE.getActividad_Tipo();

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
     * The meta object literal for the '<em><b>Espacio</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Oradores</b></em>' containment reference list feature.
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
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl <em>Espacio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.EspacioImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getEspacio()
     * @generated
     */
    EClass ESPACIO = eINSTANCE.getEspacio();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPACIO__NOMBRE = eINSTANCE.getEspacio_Nombre();

    /**
     * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPACIO__CAPACIDAD = eINSTANCE.getEspacio_Capacidad();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.TipoDeActividadImpl <em>Tipo De Actividad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.TipoDeActividadImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTipoDeActividad()
     * @generated
     */
    EClass TIPO_DE_ACTIVIDAD = eINSTANCE.getTipoDeActividad();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.HoraImpl <em>Hora</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.HoraImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getHora()
     * @generated
     */
    EClass HORA = eINSTANCE.getHora();

    /**
     * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORA__HORA = eINSTANCE.getHora_Hora();

    /**
     * The meta object literal for the '<em><b>Minutos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORA__MINUTOS = eINSTANCE.getHora_Minutos();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.CharlaImpl <em>Charla</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.CharlaImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getCharla()
     * @generated
     */
    EClass CHARLA = eINSTANCE.getCharla();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.TallerImpl <em>Taller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.TallerImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getTaller()
     * @generated
     */
    EClass TALLER = eINSTANCE.getTaller();

    /**
     * The meta object literal for the '{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl <em>Mesa De Debate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl
     * @see ar.unq.edu.objetos3.pdc.impl.PdcPackageImpl#getMesaDeDebate()
     * @generated
     */
    EClass MESA_DE_DEBATE = eINSTANCE.getMesaDeDebate();

  }

} //PdcPackage
