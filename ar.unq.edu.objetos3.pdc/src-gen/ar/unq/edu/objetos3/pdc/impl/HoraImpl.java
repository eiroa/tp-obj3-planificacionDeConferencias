/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Hora;
import ar.unq.edu.objetos3.pdc.PdcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.HoraImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.HoraImpl#getMinutos <em>Minutos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HoraImpl extends MinimalEObjectImpl.Container implements Hora
{
  /**
   * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected static final int HORA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected int hora = HORA_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutos() <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutos()
   * @generated
   * @ordered
   */
  protected static final int MINUTOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinutos() <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutos()
   * @generated
   * @ordered
   */
  protected int minutos = MINUTOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HoraImpl()
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
    return PdcPackage.Literals.HORA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHora()
  {
    return hora;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHora(int newHora)
  {
    int oldHora = hora;
    hora = newHora;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.HORA__HORA, oldHora, hora));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutos()
  {
    return minutos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutos(int newMinutos)
  {
    int oldMinutos = minutos;
    minutos = newMinutos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.HORA__MINUTOS, oldMinutos, minutos));
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
      case PdcPackage.HORA__HORA:
        return getHora();
      case PdcPackage.HORA__MINUTOS:
        return getMinutos();
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
      case PdcPackage.HORA__HORA:
        setHora((Integer)newValue);
        return;
      case PdcPackage.HORA__MINUTOS:
        setMinutos((Integer)newValue);
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
      case PdcPackage.HORA__HORA:
        setHora(HORA_EDEFAULT);
        return;
      case PdcPackage.HORA__MINUTOS:
        setMinutos(MINUTOS_EDEFAULT);
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
      case PdcPackage.HORA__HORA:
        return hora != HORA_EDEFAULT;
      case PdcPackage.HORA__MINUTOS:
        return minutos != MINUTOS_EDEFAULT;
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
    result.append(" (hora: ");
    result.append(hora);
    result.append(", minutos: ");
    result.append(minutos);
    result.append(')');
    return result.toString();
  }

} //HoraImpl
