/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Almuerzo;
import ar.unq.edu.objetos3.pdc.Desayuno;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Espacios;
import ar.unq.edu.objetos3.pdc.Horario;
import ar.unq.edu.objetos3.pdc.Merienda;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Oradores;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.Organizaciones;
import ar.unq.edu.objetos3.pdc.PdcFactory;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.pdc.TipoDeBreak;
import ar.unq.edu.objetos3.pdc.Track;
import ar.unq.edu.objetos3.pdc.Tracks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdcPackageImpl extends EPackageImpl implements PdcPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizacionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oradoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass espaciosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tracksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oradorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass espacioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actividadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tipoDeBreakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desayunoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass almuerzoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass meriendaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trackEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PdcPackageImpl()
  {
    super(eNS_URI, PdcFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PdcPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PdcPackage init()
  {
    if (isInited) return (PdcPackage)EPackage.Registry.INSTANCE.getEPackage(PdcPackage.eNS_URI);

    // Obtain or create and register package
    PdcPackageImpl thePdcPackage = (PdcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PdcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PdcPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePdcPackage.createPackageContents();

    // Initialize created meta-data
    thePdcPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePdcPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PdcPackage.eNS_URI, thePdcPackage);
    return thePdcPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDC()
  {
    return pdcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDC_LasOrganizaciones()
  {
    return (EReference)pdcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDC_LosOradores()
  {
    return (EReference)pdcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDC_LosEspacios()
  {
    return (EReference)pdcEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDC_LosTracks()
  {
    return (EReference)pdcEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDC_Schedule()
  {
    return (EReference)pdcEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganizaciones()
  {
    return organizacionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganizaciones_Organizaciones()
  {
    return (EReference)organizacionesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOradores()
  {
    return oradoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOradores_Oradores()
  {
    return (EReference)oradoresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEspacios()
  {
    return espaciosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEspacios_Espacios()
  {
    return (EReference)espaciosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTracks()
  {
    return tracksEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTracks_Tracks()
  {
    return (EReference)tracksEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchedule()
  {
    return scheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_Nombre()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchedule_Actividades()
  {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganizacion()
  {
    return organizacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizacion_Name()
  {
    return (EAttribute)organizacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrador()
  {
    return oradorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrador_Name()
  {
    return (EAttribute)oradorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrador_Organizacion()
  {
    return (EReference)oradorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEspacio()
  {
    return espacioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEspacio_Name()
  {
    return (EAttribute)espacioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEspacio_Capacidad()
  {
    return (EAttribute)espacioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEspacio_TieneComputadoras()
  {
    return (EAttribute)espacioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActividad()
  {
    return actividadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsCharla()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsMesaDeDebate()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsTaller()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsBreak()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsEventoDeInauguracion()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsRegistracion()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_EsEventoDeCierre()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_Keynote()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_TipoDeBreak()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_Track()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_Titulo()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_Duracion()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_Espacio()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActividad_GenteEsperada()
  {
    return (EAttribute)actividadEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_Oradores()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_Horario()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTipoDeBreak()
  {
    return tipoDeBreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesayuno()
  {
    return desayunoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlmuerzo()
  {
    return almuerzoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMerienda()
  {
    return meriendaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorario()
  {
    return horarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Hora()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Minutos()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrack()
  {
    return trackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrack_Name()
  {
    return (EAttribute)trackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdcFactory getPdcFactory()
  {
    return (PdcFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pdcEClass = createEClass(PDC);
    createEReference(pdcEClass, PDC__LAS_ORGANIZACIONES);
    createEReference(pdcEClass, PDC__LOS_ORADORES);
    createEReference(pdcEClass, PDC__LOS_ESPACIOS);
    createEReference(pdcEClass, PDC__LOS_TRACKS);
    createEReference(pdcEClass, PDC__SCHEDULE);

    organizacionesEClass = createEClass(ORGANIZACIONES);
    createEReference(organizacionesEClass, ORGANIZACIONES__ORGANIZACIONES);

    oradoresEClass = createEClass(ORADORES);
    createEReference(oradoresEClass, ORADORES__ORADORES);

    espaciosEClass = createEClass(ESPACIOS);
    createEReference(espaciosEClass, ESPACIOS__ESPACIOS);

    tracksEClass = createEClass(TRACKS);
    createEReference(tracksEClass, TRACKS__TRACKS);

    scheduleEClass = createEClass(SCHEDULE);
    createEAttribute(scheduleEClass, SCHEDULE__NOMBRE);
    createEReference(scheduleEClass, SCHEDULE__ACTIVIDADES);

    organizacionEClass = createEClass(ORGANIZACION);
    createEAttribute(organizacionEClass, ORGANIZACION__NAME);

    oradorEClass = createEClass(ORADOR);
    createEAttribute(oradorEClass, ORADOR__NAME);
    createEReference(oradorEClass, ORADOR__ORGANIZACION);

    espacioEClass = createEClass(ESPACIO);
    createEAttribute(espacioEClass, ESPACIO__NAME);
    createEAttribute(espacioEClass, ESPACIO__CAPACIDAD);
    createEAttribute(espacioEClass, ESPACIO__TIENE_COMPUTADORAS);

    actividadEClass = createEClass(ACTIVIDAD);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_CHARLA);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_MESA_DE_DEBATE);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_TALLER);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_BREAK);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_EVENTO_DE_INAUGURACION);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_REGISTRACION);
    createEAttribute(actividadEClass, ACTIVIDAD__ES_EVENTO_DE_CIERRE);
    createEAttribute(actividadEClass, ACTIVIDAD__KEYNOTE);
    createEReference(actividadEClass, ACTIVIDAD__TIPO_DE_BREAK);
    createEReference(actividadEClass, ACTIVIDAD__TRACK);
    createEAttribute(actividadEClass, ACTIVIDAD__TITULO);
    createEAttribute(actividadEClass, ACTIVIDAD__DURACION);
    createEReference(actividadEClass, ACTIVIDAD__ESPACIO);
    createEAttribute(actividadEClass, ACTIVIDAD__GENTE_ESPERADA);
    createEReference(actividadEClass, ACTIVIDAD__ORADORES);
    createEReference(actividadEClass, ACTIVIDAD__HORARIO);

    tipoDeBreakEClass = createEClass(TIPO_DE_BREAK);

    desayunoEClass = createEClass(DESAYUNO);

    almuerzoEClass = createEClass(ALMUERZO);

    meriendaEClass = createEClass(MERIENDA);

    horarioEClass = createEClass(HORARIO);
    createEAttribute(horarioEClass, HORARIO__HORA);
    createEAttribute(horarioEClass, HORARIO__MINUTOS);

    trackEClass = createEClass(TRACK);
    createEAttribute(trackEClass, TRACK__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    desayunoEClass.getESuperTypes().add(this.getTipoDeBreak());
    almuerzoEClass.getESuperTypes().add(this.getTipoDeBreak());
    meriendaEClass.getESuperTypes().add(this.getTipoDeBreak());

    // Initialize classes and features; add operations and parameters
    initEClass(pdcEClass, ar.unq.edu.objetos3.pdc.PDC.class, "PDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPDC_LasOrganizaciones(), this.getOrganizaciones(), null, "lasOrganizaciones", null, 0, -1, ar.unq.edu.objetos3.pdc.PDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDC_LosOradores(), this.getOradores(), null, "losOradores", null, 0, -1, ar.unq.edu.objetos3.pdc.PDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDC_LosEspacios(), this.getEspacios(), null, "losEspacios", null, 0, -1, ar.unq.edu.objetos3.pdc.PDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDC_LosTracks(), this.getTracks(), null, "losTracks", null, 0, -1, ar.unq.edu.objetos3.pdc.PDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDC_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, ar.unq.edu.objetos3.pdc.PDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizacionesEClass, Organizaciones.class, "Organizaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrganizaciones_Organizaciones(), this.getOrganizacion(), null, "organizaciones", null, 0, -1, Organizaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oradoresEClass, Oradores.class, "Oradores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOradores_Oradores(), this.getOrador(), null, "oradores", null, 0, -1, Oradores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(espaciosEClass, Espacios.class, "Espacios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEspacios_Espacios(), this.getEspacio(), null, "espacios", null, 0, -1, Espacios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tracksEClass, Tracks.class, "Tracks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTracks_Tracks(), this.getTrack(), null, "tracks", null, 0, -1, Tracks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchedule_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_Actividades(), this.getActividad(), null, "actividades", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizacionEClass, Organizacion.class, "Organizacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganizacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oradorEClass, Orador.class, "Orador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrador_Name(), ecorePackage.getEString(), "name", null, 0, 1, Orador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrador_Organizacion(), this.getOrganizacion(), null, "organizacion", null, 0, 1, Orador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(espacioEClass, Espacio.class, "Espacio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEspacio_Name(), ecorePackage.getEString(), "name", null, 0, 1, Espacio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEspacio_Capacidad(), ecorePackage.getEInt(), "capacidad", null, 0, 1, Espacio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEspacio_TieneComputadoras(), ecorePackage.getEBoolean(), "tieneComputadoras", null, 0, 1, Espacio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actividadEClass, Actividad.class, "Actividad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActividad_EsCharla(), ecorePackage.getEBoolean(), "esCharla", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsMesaDeDebate(), ecorePackage.getEBoolean(), "esMesaDeDebate", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsTaller(), ecorePackage.getEBoolean(), "esTaller", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsBreak(), ecorePackage.getEBoolean(), "esBreak", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsEventoDeInauguracion(), ecorePackage.getEBoolean(), "esEventoDeInauguracion", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsRegistracion(), ecorePackage.getEBoolean(), "esRegistracion", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_EsEventoDeCierre(), ecorePackage.getEBoolean(), "esEventoDeCierre", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_Keynote(), ecorePackage.getEBoolean(), "keynote", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActividad_TipoDeBreak(), this.getTipoDeBreak(), null, "tipoDeBreak", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActividad_Track(), this.getTrack(), null, "track", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_Duracion(), ecorePackage.getEInt(), "duracion", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActividad_Espacio(), this.getEspacio(), null, "espacio", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActividad_GenteEsperada(), ecorePackage.getEInt(), "genteEsperada", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActividad_Oradores(), this.getOrador(), null, "oradores", null, 0, -1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActividad_Horario(), this.getHorario(), null, "horario", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tipoDeBreakEClass, TipoDeBreak.class, "TipoDeBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(desayunoEClass, Desayuno.class, "Desayuno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(almuerzoEClass, Almuerzo.class, "Almuerzo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(meriendaEClass, Merienda.class, "Merienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(horarioEClass, Horario.class, "Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHorario_Hora(), ecorePackage.getEInt(), "hora", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHorario_Minutos(), ecorePackage.getEInt(), "minutos", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PdcPackageImpl
