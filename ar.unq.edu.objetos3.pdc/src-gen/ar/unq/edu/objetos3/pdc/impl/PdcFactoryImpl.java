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
      case PdcPackage.PDC: return createPDC();
      case PdcPackage.ORGANIZACIONES: return createOrganizaciones();
      case PdcPackage.ORADORES: return createOradores();
      case PdcPackage.ESPACIOS: return createEspacios();
      case PdcPackage.TRACKS: return createTracks();
      case PdcPackage.SCHEDULE: return createSchedule();
      case PdcPackage.ORGANIZACION: return createOrganizacion();
      case PdcPackage.ORADOR: return createOrador();
      case PdcPackage.ESPACIO: return createEspacio();
      case PdcPackage.ACTIVIDAD: return createActividad();
      case PdcPackage.TIPO_DE_BREAK: return createTipoDeBreak();
      case PdcPackage.DESAYUNO: return createDesayuno();
      case PdcPackage.ALMUERZO: return createAlmuerzo();
      case PdcPackage.MERIENDA: return createMerienda();
      case PdcPackage.HORARIO: return createHorario();
      case PdcPackage.TRACK: return createTrack();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDC createPDC()
  {
    PDCImpl pdc = new PDCImpl();
    return pdc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizaciones createOrganizaciones()
  {
    OrganizacionesImpl organizaciones = new OrganizacionesImpl();
    return organizaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Oradores createOradores()
  {
    OradoresImpl oradores = new OradoresImpl();
    return oradores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espacios createEspacios()
  {
    EspaciosImpl espacios = new EspaciosImpl();
    return espacios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tracks createTracks()
  {
    TracksImpl tracks = new TracksImpl();
    return tracks;
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
  public TipoDeBreak createTipoDeBreak()
  {
    TipoDeBreakImpl tipoDeBreak = new TipoDeBreakImpl();
    return tipoDeBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desayuno createDesayuno()
  {
    DesayunoImpl desayuno = new DesayunoImpl();
    return desayuno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Almuerzo createAlmuerzo()
  {
    AlmuerzoImpl almuerzo = new AlmuerzoImpl();
    return almuerzo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Merienda createMerienda()
  {
    MeriendaImpl merienda = new MeriendaImpl();
    return merienda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario createHorario()
  {
    HorarioImpl horario = new HorarioImpl();
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Track createTrack()
  {
    TrackImpl track = new TrackImpl();
    return track;
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
