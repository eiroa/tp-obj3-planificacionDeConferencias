/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.PdcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Espacio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl#getName <em>Name</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl#getCapacidad <em>Capacidad</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl#isTieneComputadoras <em>Tiene Computadoras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EspacioImpl extends MinimalEObjectImpl.Container implements Espacio
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCapacidad() <em>Capacidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacidad()
   * @generated
   * @ordered
   */
  protected static final int CAPACIDAD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCapacidad() <em>Capacidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacidad()
   * @generated
   * @ordered
   */
  protected int capacidad = CAPACIDAD_EDEFAULT;

  /**
   * The default value of the '{@link #isTieneComputadoras() <em>Tiene Computadoras</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTieneComputadoras()
   * @generated
   * @ordered
   */
  protected static final boolean TIENE_COMPUTADORAS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTieneComputadoras() <em>Tiene Computadoras</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTieneComputadoras()
   * @generated
   * @ordered
   */
  protected boolean tieneComputadoras = TIENE_COMPUTADORAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EspacioImpl()
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
    return PdcPackage.Literals.ESPACIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ESPACIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCapacidad()
  {
    return capacidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapacidad(int newCapacidad)
  {
    int oldCapacidad = capacidad;
    capacidad = newCapacidad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ESPACIO__CAPACIDAD, oldCapacidad, capacidad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTieneComputadoras()
  {
    return tieneComputadoras;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTieneComputadoras(boolean newTieneComputadoras)
  {
    boolean oldTieneComputadoras = tieneComputadoras;
    tieneComputadoras = newTieneComputadoras;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ESPACIO__TIENE_COMPUTADORAS, oldTieneComputadoras, tieneComputadoras));
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
      case PdcPackage.ESPACIO__NAME:
        return getName();
      case PdcPackage.ESPACIO__CAPACIDAD:
        return getCapacidad();
      case PdcPackage.ESPACIO__TIENE_COMPUTADORAS:
        return isTieneComputadoras();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdcPackage.ESPACIO__NAME:
        setName((String)newValue);
        return;
      case PdcPackage.ESPACIO__CAPACIDAD:
        setCapacidad((Integer)newValue);
        return;
      case PdcPackage.ESPACIO__TIENE_COMPUTADORAS:
        setTieneComputadoras((Boolean)newValue);
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
      case PdcPackage.ESPACIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PdcPackage.ESPACIO__CAPACIDAD:
        setCapacidad(CAPACIDAD_EDEFAULT);
        return;
      case PdcPackage.ESPACIO__TIENE_COMPUTADORAS:
        setTieneComputadoras(TIENE_COMPUTADORAS_EDEFAULT);
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
      case PdcPackage.ESPACIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PdcPackage.ESPACIO__CAPACIDAD:
        return capacidad != CAPACIDAD_EDEFAULT;
      case PdcPackage.ESPACIO__TIENE_COMPUTADORAS:
        return tieneComputadoras != TIENE_COMPUTADORAS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", capacidad: ");
    result.append(capacidad);
    result.append(", tieneComputadoras: ");
    result.append(tieneComputadoras);
    result.append(')');
    return result.toString();
  }

} //EspacioImpl
