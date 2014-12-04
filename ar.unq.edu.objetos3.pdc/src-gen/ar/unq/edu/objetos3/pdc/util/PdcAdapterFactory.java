/**
 */
package ar.unq.edu.objetos3.pdc.util;

import ar.unq.edu.objetos3.pdc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ar.unq.edu.objetos3.pdc.PdcPackage
 * @generated
 */
public class PdcAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdcPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdcAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PdcPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PdcSwitch<Adapter> modelSwitch =
    new PdcSwitch<Adapter>()
    {
      @Override
      public Adapter casePDC(PDC object)
      {
        return createPDCAdapter();
      }
      @Override
      public Adapter caseOrganizaciones(Organizaciones object)
      {
        return createOrganizacionesAdapter();
      }
      @Override
      public Adapter caseOradores(Oradores object)
      {
        return createOradoresAdapter();
      }
      @Override
      public Adapter caseEspacios(Espacios object)
      {
        return createEspaciosAdapter();
      }
      @Override
      public Adapter caseTracks(Tracks object)
      {
        return createTracksAdapter();
      }
      @Override
      public Adapter caseSchedule(Schedule object)
      {
        return createScheduleAdapter();
      }
      @Override
      public Adapter caseOrganizacion(Organizacion object)
      {
        return createOrganizacionAdapter();
      }
      @Override
      public Adapter caseOrador(Orador object)
      {
        return createOradorAdapter();
      }
      @Override
      public Adapter caseEspacio(Espacio object)
      {
        return createEspacioAdapter();
      }
      @Override
      public Adapter caseActividad(Actividad object)
      {
        return createActividadAdapter();
      }
      @Override
      public Adapter caseTipoDeBreak(TipoDeBreak object)
      {
        return createTipoDeBreakAdapter();
      }
      @Override
      public Adapter caseDesayuno(Desayuno object)
      {
        return createDesayunoAdapter();
      }
      @Override
      public Adapter caseAlmuerzo(Almuerzo object)
      {
        return createAlmuerzoAdapter();
      }
      @Override
      public Adapter caseMerienda(Merienda object)
      {
        return createMeriendaAdapter();
      }
      @Override
      public Adapter caseHorario(Horario object)
      {
        return createHorarioAdapter();
      }
      @Override
      public Adapter caseTrack(Track object)
      {
        return createTrackAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.PDC <em>PDC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.PDC
   * @generated
   */
  public Adapter createPDCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Organizaciones <em>Organizaciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Organizaciones
   * @generated
   */
  public Adapter createOrganizacionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Oradores <em>Oradores</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Oradores
   * @generated
   */
  public Adapter createOradoresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Espacios <em>Espacios</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Espacios
   * @generated
   */
  public Adapter createEspaciosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Tracks <em>Tracks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Tracks
   * @generated
   */
  public Adapter createTracksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Schedule
   * @generated
   */
  public Adapter createScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Organizacion <em>Organizacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Organizacion
   * @generated
   */
  public Adapter createOrganizacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Orador <em>Orador</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Orador
   * @generated
   */
  public Adapter createOradorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Espacio <em>Espacio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Espacio
   * @generated
   */
  public Adapter createEspacioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Actividad <em>Actividad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Actividad
   * @generated
   */
  public Adapter createActividadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.TipoDeBreak <em>Tipo De Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.TipoDeBreak
   * @generated
   */
  public Adapter createTipoDeBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Desayuno <em>Desayuno</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Desayuno
   * @generated
   */
  public Adapter createDesayunoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Almuerzo <em>Almuerzo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Almuerzo
   * @generated
   */
  public Adapter createAlmuerzoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Merienda <em>Merienda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Merienda
   * @generated
   */
  public Adapter createMeriendaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Horario
   * @generated
   */
  public Adapter createHorarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.unq.edu.objetos3.pdc.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.unq.edu.objetos3.pdc.Track
   * @generated
   */
  public Adapter createTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PdcAdapterFactory
