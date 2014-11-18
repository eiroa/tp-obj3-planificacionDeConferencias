/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.PdcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getOradores <em>Oradores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadImpl extends MinimalEObjectImpl.Container implements Actividad
{
  /**
   * The cached value of the '{@link #getOradores() <em>Oradores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOradores()
   * @generated
   * @ordered
   */
  protected EList<Orador> oradores;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActividadImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PdcPackage.Literals.ACTIVIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Orador> getOradores()
  {
    if (oradores == null)
    {
      oradores = new EObjectContainmentEList<Orador>(Orador.class, this, PdcPackage.ACTIVIDAD__ORADORES);
    }
    return oradores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PdcPackage.ACTIVIDAD__ORADORES:
        return ((InternalEList<?>)getOradores()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdcPackage.ACTIVIDAD__ORADORES:
        return getOradores();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdcPackage.ACTIVIDAD__ORADORES:
        getOradores().clear();
        getOradores().addAll((Collection<? extends Orador>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PdcPackage.ACTIVIDAD__ORADORES:
        getOradores().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PdcPackage.ACTIVIDAD__ORADORES:
        return oradores != null && !oradores.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActividadImpl
