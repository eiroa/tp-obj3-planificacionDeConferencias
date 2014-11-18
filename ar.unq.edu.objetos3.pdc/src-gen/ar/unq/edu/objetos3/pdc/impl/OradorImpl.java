/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.Organizacion;
import ar.unq.edu.objetos3.pdc.PdcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.OradorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.OradorImpl#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OradorImpl extends MinimalEObjectImpl.Container implements Orador
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrganizacion() <em>Organizacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizacion()
   * @generated
   * @ordered
   */
  protected Organizacion organizacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OradorImpl()
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
    return PdcPackage.Literals.ORADOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ORADOR__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizacion getOrganizacion()
  {
    return organizacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrganizacion(Organizacion newOrganizacion, NotificationChain msgs)
  {
    Organizacion oldOrganizacion = organizacion;
    organizacion = newOrganizacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.ORADOR__ORGANIZACION, oldOrganizacion, newOrganizacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganizacion(Organizacion newOrganizacion)
  {
    if (newOrganizacion != organizacion)
    {
      NotificationChain msgs = null;
      if (organizacion != null)
        msgs = ((InternalEObject)organizacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ORADOR__ORGANIZACION, null, msgs);
      if (newOrganizacion != null)
        msgs = ((InternalEObject)newOrganizacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ORADOR__ORGANIZACION, null, msgs);
      msgs = basicSetOrganizacion(newOrganizacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ORADOR__ORGANIZACION, newOrganizacion, newOrganizacion));
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
      case PdcPackage.ORADOR__ORGANIZACION:
        return basicSetOrganizacion(null, msgs);
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
      case PdcPackage.ORADOR__NOMBRE:
        return getNombre();
      case PdcPackage.ORADOR__ORGANIZACION:
        return getOrganizacion();
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
      case PdcPackage.ORADOR__NOMBRE:
        setNombre((String)newValue);
        return;
      case PdcPackage.ORADOR__ORGANIZACION:
        setOrganizacion((Organizacion)newValue);
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
      case PdcPackage.ORADOR__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case PdcPackage.ORADOR__ORGANIZACION:
        setOrganizacion((Organizacion)null);
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
      case PdcPackage.ORADOR__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case PdcPackage.ORADOR__ORGANIZACION:
        return organizacion != null;
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
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //OradorImpl
