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
      case PdcPackage.SCHEDULE:
      {
        Schedule schedule = (Schedule)theEObject;
        T result = caseSchedule(schedule);
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
      case PdcPackage.ACTIVIDAD:
      {
        Actividad actividad = (Actividad)theEObject;
        T result = caseActividad(actividad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.CHARLA:
      {
        Charla charla = (Charla)theEObject;
        T result = caseCharla(charla);
        if (result == null) result = caseActividad(charla);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.TALLER:
      {
        Taller taller = (Taller)theEObject;
        T result = caseTaller(taller);
        if (result == null) result = caseActividad(taller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdcPackage.MESA_DE_DEBATE:
      {
        MesaDeDebate mesaDeDebate = (MesaDeDebate)theEObject;
        T result = caseMesaDeDebate(mesaDeDebate);
        if (result == null) result = caseActividad(mesaDeDebate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Charla</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Charla</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharla(Charla object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Taller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Taller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaller(Taller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mesa De Debate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mesa De Debate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMesaDeDebate(MesaDeDebate object)
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
