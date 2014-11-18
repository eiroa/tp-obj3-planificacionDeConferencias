/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.MesaDeDebate;
import ar.unq.edu.objetos3.pdc.PdcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesa De Debate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.MesaDeDebateImpl#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MesaDeDebateImpl extends ActividadImpl implements MesaDeDebate
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected Actividad tipo;

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
   * The default value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuracion()
   * @generated
   * @ordered
   */
  protected static final int DURACION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuracion()
   * @generated
   * @ordered
   */
  protected int duracion = DURACION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAula() <em>Aula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected Espacio aula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MesaDeDebateImpl()
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
    return PdcPackage.Literals.MESA_DE_DEBATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actividad getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(Actividad newTipo, NotificationChain msgs)
  {
    Actividad oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(Actividad newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.MESA_DE_DEBATE__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.MESA_DE_DEBATE__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__TIPO, newTipo, newTipo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__TITULO, oldTitulo, titulo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuracion()
  {
    return duracion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuracion(int newDuracion)
  {
    int oldDuracion = duracion;
    duracion = newDuracion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__DURACION, oldDuracion, duracion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espacio getAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAula(Espacio newAula, NotificationChain msgs)
  {
    Espacio oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__AULA, oldAula, newAula);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(Espacio newAula)
  {
    if (newAula != aula)
    {
      NotificationChain msgs = null;
      if (aula != null)
        msgs = ((InternalEObject)aula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.MESA_DE_DEBATE__AULA, null, msgs);
      if (newAula != null)
        msgs = ((InternalEObject)newAula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.MESA_DE_DEBATE__AULA, null, msgs);
      msgs = basicSetAula(newAula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.MESA_DE_DEBATE__AULA, newAula, newAula));
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
      case PdcPackage.MESA_DE_DEBATE__TIPO:
        return basicSetTipo(null, msgs);
      case PdcPackage.MESA_DE_DEBATE__AULA:
        return basicSetAula(null, msgs);
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
      case PdcPackage.MESA_DE_DEBATE__TIPO:
        return getTipo();
      case PdcPackage.MESA_DE_DEBATE__TITULO:
        return getTitulo();
      case PdcPackage.MESA_DE_DEBATE__DURACION:
        return getDuracion();
      case PdcPackage.MESA_DE_DEBATE__AULA:
        return getAula();
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
      case PdcPackage.MESA_DE_DEBATE__TIPO:
        setTipo((Actividad)newValue);
        return;
      case PdcPackage.MESA_DE_DEBATE__TITULO:
        setTitulo((String)newValue);
        return;
      case PdcPackage.MESA_DE_DEBATE__DURACION:
        setDuracion((Integer)newValue);
        return;
      case PdcPackage.MESA_DE_DEBATE__AULA:
        setAula((Espacio)newValue);
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
      case PdcPackage.MESA_DE_DEBATE__TIPO:
        setTipo((Actividad)null);
        return;
      case PdcPackage.MESA_DE_DEBATE__TITULO:
        setTitulo(TITULO_EDEFAULT);
        return;
      case PdcPackage.MESA_DE_DEBATE__DURACION:
        setDuracion(DURACION_EDEFAULT);
        return;
      case PdcPackage.MESA_DE_DEBATE__AULA:
        setAula((Espacio)null);
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
      case PdcPackage.MESA_DE_DEBATE__TIPO:
        return tipo != null;
      case PdcPackage.MESA_DE_DEBATE__TITULO:
        return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
      case PdcPackage.MESA_DE_DEBATE__DURACION:
        return duracion != DURACION_EDEFAULT;
      case PdcPackage.MESA_DE_DEBATE__AULA:
        return aula != null;
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
    result.append(", duracion: ");
    result.append(duracion);
    result.append(')');
    return result.toString();
  }

} //MesaDeDebateImpl
