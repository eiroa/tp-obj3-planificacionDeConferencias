/**
 */
package ar.unq.edu.objetos3.pdc.util;

import ar.unq.edu.objetos3.pdc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ar.unq.edu.objetos3.pdc.PdcPackage
 * @generated
 */
public class PdcSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdcPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdcSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PdcPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PdcPackage.PDC:
      {
        PDC pdc = (PDC)theEObject;
        T result = casePDC(pdc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ORGANIZACIONES:
      {
        Organizaciones organizaciones = (Organizaciones)theEObject;
        T result = caseOrganizaciones(organizaciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ORADORES:
      {
        Oradores oradores = (Oradores)theEObject;
        T result = caseOradores(oradores);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ESPACIOS:
      {
        Espacios espacios = (Espacios)theEObject;
        T result = caseEspacios(espacios);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.TRACKS:
      {
        Tracks tracks = (Tracks)theEObject;
        T result = caseTracks(tracks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.SCHEDULE:
      {
        Schedule schedule = (Schedule)theEObject;
        T result = caseSchedule(schedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ORGANIZACION:
      {
        Organizacion organizacion = (Organizacion)theEObject;
        T result = caseOrganizacion(organizacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ORADOR:
      {
        Orador orador = (Orador)theEObject;
        T result = caseOrador(orador);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ESPACIO:
      {
        Espacio espacio = (Espacio)theEObject;
        T result = caseEspacio(espacio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ACTIVIDAD:
      {
        Actividad actividad = (Actividad)theEObject;
        T result = caseActividad(actividad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.TIPO_DE_BREAK:
      {
        TipoDeBreak tipoDeBreak = (TipoDeBreak)theEObject;
        T result = caseTipoDeBreak(tipoDeBreak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.DESAYUNO:
      {
        Desayuno desayuno = (Desayuno)theEObject;
        T result = caseDesayuno(desayuno);
        if (result == null) result = caseTipoDeBreak(desayuno);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.ALMUERZO:
      {
        Almuerzo almuerzo = (Almuerzo)theEObject;
        T result = caseAlmuerzo(almuerzo);
        if (result == null) result = caseTipoDeBreak(almuerzo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.MERIENDA:
      {
        Merienda merienda = (Merienda)theEObject;
        T result = caseMerienda(merienda);
        if (result == null) result = caseTipoDeBreak(merienda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.HORARIO:
      {
        Horario horario = (Horario)theEObject;
        T result = caseHorario(horario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.TRACK:
      {
        Track track = (Track)theEObject;
        T result = caseTrack(track);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PDC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PDC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDC(PDC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organizaciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizaciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizaciones(Organizaciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Oradores</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Oradores</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOradores(Oradores object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Espacios</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Espacios</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEspacios(Espacios object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tracks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tracks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTracks(Tracks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchedule(Schedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organizacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizacion(Organizacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orador</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orador</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrador(Orador object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Espacio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Espacio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEspacio(Espacio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actividad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actividad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActividad(Actividad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipo De Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipo De Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipoDeBreak(TipoDeBreak object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desayuno</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desayuno</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesayuno(Desayuno object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Almuerzo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Almuerzo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlmuerzo(Almuerzo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Merienda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Merienda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMerienda(Merienda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorario(Horario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Track</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Track</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrack(Track object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PdcSwitch
