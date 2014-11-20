/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdcFactoryImpl extends EFactoryImpl implements PdcFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PdcFactory init()
  {
    try
    {
      PdcFactory thePdcFactory = (PdcFactory)EPackage.Registry.INSTANCE.getEFactory(PdcPackage.eNS_URI);
      if (thePdcFactory != null)
      {
        return thePdcFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PdcFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdcFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PdcPackage.SCHEDULE: return createSchedule();
      case PdcPackage.ORGANIZACION: return createOrganizacion();
      case PdcPackage.ORADOR: return createOrador();
      case PdcPackage.ACTIVIDAD: return createActividad();
      case PdcPackage.ESPACIO: return createEspacio();
      case PdcPackage.TIPO_DE_ACTIVIDAD: return createTipoDeActividad();
      case PdcPackage.HORA: return createHora();
      case PdcPackage.CHARLA: return createCharla();
      case PdcPackage.TALLER: return createTaller();
      case PdcPackage.MESA_DE_DEBATE: return createMesaDeDebate();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schedule createSchedule()
  {
    ScheduleImpl schedule = new ScheduleImpl();
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizacion createOrganizacion()
  {
    OrganizacionImpl organizacion = new OrganizacionImpl();
    return organizacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orador createOrador()
  {
    OradorImpl orador = new OradorImpl();
    return orador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actividad createActividad()
  {
    ActividadImpl actividad = new ActividadImpl();
    return actividad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espacio createEspacio()
  {
    EspacioImpl espacio = new EspacioImpl();
    return espacio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoDeActividad createTipoDeActividad()
  {
    TipoDeActividadImpl tipoDeActividad = new TipoDeActividadImpl();
    return tipoDeActividad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hora createHora()
  {
    HoraImpl hora = new HoraImpl();
    return hora;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Charla createCharla()
  {
    CharlaImpl charla = new CharlaImpl();
    return charla;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Taller createTaller()
  {
    TallerImpl taller = new TallerImpl();
    return taller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MesaDeDebate createMesaDeDebate()
  {
    MesaDeDebateImpl mesaDeDebate = new MesaDeDebateImpl();
    return mesaDeDebate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdcPackage getPdcPackage()
  {
    return (PdcPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PdcPackage getPackage()
  {
    return PdcPackage.eINSTANCE;
  }

} //PdcFactoryImpl
