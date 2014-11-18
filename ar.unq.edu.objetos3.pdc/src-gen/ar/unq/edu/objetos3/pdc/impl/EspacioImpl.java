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
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.EspacioImpl#getCapacidad <em>Capacidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EspacioImpl extends MinimalEObjectImpl.Container implements Espacio
{
  /**
   * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitulo()
   * @generated
   * @ordered
   */
  protected static final String TITULO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitulo()
   * @generated
   * @ordered
   */
  protected String titulo = TITULO_EDEFAULT;

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
  public String getTitulo()
  {
    return titulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitulo(String newTitulo)
  {
    String oldTitulo = titulo;
    titulo = newTitulo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ESPACIO__TITULO, oldTitulo, titulo));
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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdcPackage.ESPACIO__TITULO:
        return getTitulo();
      case PdcPackage.ESPACIO__CAPACIDAD:
        return getCapacidad();
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
      case PdcPackage.ESPACIO__TITULO:
        setTitulo((String)newValue);
        return;
      case PdcPackage.ESPACIO__CAPACIDAD:
        setCapacidad((Integer)newValue);
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
      case PdcPackage.ESPACIO__TITULO:
        setTitulo(TITULO_EDEFAULT);
        return;
      case PdcPackage.ESPACIO__CAPACIDAD:
        setCapacidad(CAPACIDAD_EDEFAULT);
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
      case PdcPackage.ESPACIO__TITULO:
        return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
      case PdcPackage.ESPACIO__CAPACIDAD:
        return capacidad != CAPACIDAD_EDEFAULT;
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
    result.append(" (titulo: ");
    result.append(titulo);
    result.append(", capacidad: ");
    result.append(capacidad);
    result.append(')');
    return result.toString();
  }

} //EspacioImpl
