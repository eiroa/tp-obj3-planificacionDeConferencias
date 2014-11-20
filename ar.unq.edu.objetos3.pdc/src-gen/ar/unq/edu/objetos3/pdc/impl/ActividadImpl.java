/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Hora;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.TipoDeActividad;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getEspacio <em>Espacio</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getGenteEsperada <em>Gente Esperada</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getOradores <em>Oradores</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getHorario <em>Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadImpl extends MinimalEObjectImpl.Container implements Actividad
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected TipoDeActividad tipo;

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
   * The cached value of the '{@link #getEspacio() <em>Espacio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEspacio()
   * @generated
   * @ordered
   */
  protected Espacio espacio;

  /**
   * The default value of the '{@link #getGenteEsperada() <em>Gente Esperada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenteEsperada()
   * @generated
   * @ordered
   */
  protected static final int GENTE_ESPERADA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGenteEsperada() <em>Gente Esperada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenteEsperada()
   * @generated
   * @ordered
   */
  protected int genteEsperada = GENTE_ESPERADA_EDEFAULT;

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
   * The cached value of the '{@link #getHorario() <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorario()
   * @generated
   * @ordered
   */
  protected Hora horario;

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
  public TipoDeActividad getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(TipoDeActividad newTipo, NotificationChain msgs)
  {
    TipoDeActividad oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(TipoDeActividad newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TIPO, newTipo, newTipo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TITULO, oldTitulo, titulo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__DURACION, oldDuracion, duracion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espacio getEspacio()
  {
    return espacio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEspacio(Espacio newEspacio, NotificationChain msgs)
  {
    Espacio oldEspacio = espacio;
    espacio = newEspacio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ESPACIO, oldEspacio, newEspacio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEspacio(Espacio newEspacio)
  {
    if (newEspacio != espacio)
    {
      NotificationChain msgs = null;
      if (espacio != null)
        msgs = ((InternalEObject)espacio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__ESPACIO, null, msgs);
      if (newEspacio != null)
        msgs = ((InternalEObject)newEspacio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__ESPACIO, null, msgs);
      msgs = basicSetEspacio(newEspacio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ESPACIO, newEspacio, newEspacio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGenteEsperada()
  {
    return genteEsperada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenteEsperada(int newGenteEsperada)
  {
    int oldGenteEsperada = genteEsperada;
    genteEsperada = newGenteEsperada;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__GENTE_ESPERADA, oldGenteEsperada, genteEsperada));
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
  public Hora getHorario()
  {
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorario(Hora newHorario, NotificationChain msgs)
  {
    Hora oldHorario = horario;
    horario = newHorario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__HORARIO, oldHorario, newHorario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorario(Hora newHorario)
  {
    if (newHorario != horario)
    {
      NotificationChain msgs = null;
      if (horario != null)
        msgs = ((InternalEObject)horario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__HORARIO, null, msgs);
      if (newHorario != null)
        msgs = ((InternalEObject)newHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__HORARIO, null, msgs);
      msgs = basicSetHorario(newHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__HORARIO, newHorario, newHorario));
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
      case PdcPackage.ACTIVIDAD__TIPO:
        return basicSetTipo(null, msgs);
      case PdcPackage.ACTIVIDAD__ESPACIO:
        return basicSetEspacio(null, msgs);
      case PdcPackage.ACTIVIDAD__ORADORES:
        return ((InternalEList<?>)getOradores()).basicRemove(otherEnd, msgs);
      case PdcPackage.ACTIVIDAD__HORARIO:
        return basicSetHorario(null, msgs);
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
      case PdcPackage.ACTIVIDAD__TIPO:
        return getTipo();
      case PdcPackage.ACTIVIDAD__TITULO:
        return getTitulo();
      case PdcPackage.ACTIVIDAD__DURACION:
        return getDuracion();
      case PdcPackage.ACTIVIDAD__ESPACIO:
        return getEspacio();
      case PdcPackage.ACTIVIDAD__GENTE_ESPERADA:
        return getGenteEsperada();
      case PdcPackage.ACTIVIDAD__ORADORES:
        return getOradores();
      case PdcPackage.ACTIVIDAD__HORARIO:
        return getHorario();
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
      case PdcPackage.ACTIVIDAD__TIPO:
        setTipo((TipoDeActividad)newValue);
        return;
      case PdcPackage.ACTIVIDAD__TITULO:
        setTitulo((String)newValue);
        return;
      case PdcPackage.ACTIVIDAD__DURACION:
        setDuracion((Integer)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ESPACIO:
        setEspacio((Espacio)newValue);
        return;
      case PdcPackage.ACTIVIDAD__GENTE_ESPERADA:
        setGenteEsperada((Integer)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ORADORES:
        getOradores().clear();
        getOradores().addAll((Collection<? extends Orador>)newValue);
        return;
      case PdcPackage.ACTIVIDAD__HORARIO:
        setHorario((Hora)newValue);
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
      case PdcPackage.ACTIVIDAD__TIPO:
        setTipo((TipoDeActividad)null);
        return;
      case PdcPackage.ACTIVIDAD__TITULO:
        setTitulo(TITULO_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__DURACION:
        setDuracion(DURACION_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ESPACIO:
        setEspacio((Espacio)null);
        return;
      case PdcPackage.ACTIVIDAD__GENTE_ESPERADA:
        setGenteEsperada(GENTE_ESPERADA_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ORADORES:
        getOradores().clear();
        return;
      case PdcPackage.ACTIVIDAD__HORARIO:
        setHorario((Hora)null);
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
      case PdcPackage.ACTIVIDAD__TIPO:
        return tipo != null;
      case PdcPackage.ACTIVIDAD__TITULO:
        return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
      case PdcPackage.ACTIVIDAD__DURACION:
        return duracion != DURACION_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ESPACIO:
        return espacio != null;
      case PdcPackage.ACTIVIDAD__GENTE_ESPERADA:
        return genteEsperada != GENTE_ESPERADA_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ORADORES:
        return oradores != null && !oradores.isEmpty();
      case PdcPackage.ACTIVIDAD__HORARIO:
        return horario != null;
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
    result.append(", genteEsperada: ");
    result.append(genteEsperada);
    result.append(')');
    return result.toString();
  }

} //ActividadImpl
