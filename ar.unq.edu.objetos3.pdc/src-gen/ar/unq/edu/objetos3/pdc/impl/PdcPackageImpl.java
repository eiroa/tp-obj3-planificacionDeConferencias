/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Charla;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.MesaDeDebate;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.PdcFactory;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.Schedule;
import ar.unq.edu.objetos3.pdc.Taller;

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
  private EClass scheduleEClass = null;

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
  private EClass actividadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charlaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tallerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mesaDeDebateEClass = null;

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
  public EAttribute getSchedule_Fin()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getEspacio_Titulo()
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
  public EClass getOrganizacion()
  {
    return organizacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizacion_Nombre()
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
  public EAttribute getOrador_Nombre()
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
  public EClass getActividad()
  {
    return actividadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActividad_Oradores()
  {
    return (EReference)actividadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharla()
  {
    return charlaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaller()
  {
    return tallerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMesaDeDebate()
  {
    return mesaDeDebateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMesaDeDebate_Tipo()
  {
    return (EReference)mesaDeDebateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMesaDeDebate_Titulo()
  {
    return (EAttribute)mesaDeDebateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMesaDeDebate_Duracion()
  {
    return (EAttribute)mesaDeDebateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMesaDeDebate_Aula()
  {
    return (EReference)mesaDeDebateEClass.getEStructuralFeatures().get(3);
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
    scheduleEClass = createEClass(SCHEDULE);
    createEAttribute(scheduleEClass, SCHEDULE__NOMBRE);
    createEReference(scheduleEClass, SCHEDULE__ACTIVIDADES);
    createEAttribute(scheduleEClass, SCHEDULE__FIN);

    espacioEClass = createEClass(ESPACIO);
    createEAttribute(espacioEClass, ESPACIO__TITULO);
    createEAttribute(espacioEClass, ESPACIO__CAPACIDAD);

    organizacionEClass = createEClass(ORGANIZACION);
    createEAttribute(organizacionEClass, ORGANIZACION__NOMBRE);

    oradorEClass = createEClass(ORADOR);
    createEAttribute(oradorEClass, ORADOR__NOMBRE);
    createEReference(oradorEClass, ORADOR__ORGANIZACION);

    actividadEClass = createEClass(ACTIVIDAD);
    createEReference(actividadEClass, ACTIVIDAD__ORADORES);

    charlaEClass = createEClass(CHARLA);

    tallerEClass = createEClass(TALLER);

    mesaDeDebateEClass = createEClass(MESA_DE_DEBATE);
    createEReference(mesaDeDebateEClass, MESA_DE_DEBATE__TIPO);
    createEAttribute(mesaDeDebateEClass, MESA_DE_DEBATE__TITULO);
    createEAttribute(mesaDeDebateEClass, MESA_DE_DEBATE__DURACION);
    createEReference(mesaDeDebateEClass, MESA_DE_DEBATE__AULA);
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
    charlaEClass.getESuperTypes().add(this.getActividad());
    tallerEClass.getESuperTypes().add(this.getActividad());
    mesaDeDebateEClass.getESuperTypes().add(this.getActividad());

    // Initialize classes and features; add operations and parameters
    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchedule_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_Actividades(), this.getActividad(), null, "actividades", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_Fin(), ecorePackage.getEString(), "fin", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(espacioEClass, Espacio.class, "Espacio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEspacio_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Espacio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEspacio_Capacidad(), ecorePackage.getEInt(), "capacidad", null, 0, 1, Espacio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizacionEClass, Organizacion.class, "Organizacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganizacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Organizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oradorEClass, Orador.class, "Orador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Orador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrador_Organizacion(), this.getOrganizacion(), null, "organizacion", null, 0, 1, Orador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actividadEClass, Actividad.class, "Actividad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActividad_Oradores(), this.getOrador(), null, "oradores", null, 0, -1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charlaEClass, Charla.class, "Charla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tallerEClass, Taller.class, "Taller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mesaDeDebateEClass, MesaDeDebate.class, "MesaDeDebate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMesaDeDebate_Tipo(), this.getActividad(), null, "tipo", null, 0, 1, MesaDeDebate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMesaDeDebate_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, MesaDeDebate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMesaDeDebate_Duracion(), ecorePackage.getEInt(), "duracion", null, 0, 1, MesaDeDebate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMesaDeDebate_Aula(), this.getEspacio(), null, "aula", null, 0, 1, MesaDeDebate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PdcPackageImpl
