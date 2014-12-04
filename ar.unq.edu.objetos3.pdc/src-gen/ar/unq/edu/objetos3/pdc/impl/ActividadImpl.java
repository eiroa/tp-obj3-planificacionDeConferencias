/**
 */
package ar.unq.edu.objetos3.pdc.impl;

import ar.unq.edu.objetos3.pdc.Actividad;
import ar.unq.edu.objetos3.pdc.Espacio;
import ar.unq.edu.objetos3.pdc.Horario;
import ar.unq.edu.objetos3.pdc.Orador;
import ar.unq.edu.objetos3.pdc.PdcPackage;
import ar.unq.edu.objetos3.pdc.TipoDeBreak;
import ar.unq.edu.objetos3.pdc.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsCharla <em>Es Charla</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsMesaDeDebate <em>Es Mesa De Debate</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsTaller <em>Es Taller</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsBreak <em>Es Break</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsEventoDeInauguracion <em>Es Evento De Inauguracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsRegistracion <em>Es Registracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isEsEventoDeCierre <em>Es Evento De Cierre</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#isKeynote <em>Keynote</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getTipoDeBreak <em>Tipo De Break</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.impl.ActividadImpl#getTrack <em>Track</em>}</li>
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
   * The default value of the '{@link #isEsCharla() <em>Es Charla</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsCharla()
   * @generated
   * @ordered
   */
  protected static final boolean ES_CHARLA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsCharla() <em>Es Charla</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsCharla()
   * @generated
   * @ordered
   */
  protected boolean esCharla = ES_CHARLA_EDEFAULT;

  /**
   * The default value of the '{@link #isEsMesaDeDebate() <em>Es Mesa De Debate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsMesaDeDebate()
   * @generated
   * @ordered
   */
  protected static final boolean ES_MESA_DE_DEBATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsMesaDeDebate() <em>Es Mesa De Debate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsMesaDeDebate()
   * @generated
   * @ordered
   */
  protected boolean esMesaDeDebate = ES_MESA_DE_DEBATE_EDEFAULT;

  /**
   * The default value of the '{@link #isEsTaller() <em>Es Taller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsTaller()
   * @generated
   * @ordered
   */
  protected static final boolean ES_TALLER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsTaller() <em>Es Taller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsTaller()
   * @generated
   * @ordered
   */
  protected boolean esTaller = ES_TALLER_EDEFAULT;

  /**
   * The default value of the '{@link #isEsBreak() <em>Es Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsBreak()
   * @generated
   * @ordered
   */
  protected static final boolean ES_BREAK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsBreak() <em>Es Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsBreak()
   * @generated
   * @ordered
   */
  protected boolean esBreak = ES_BREAK_EDEFAULT;

  /**
   * The default value of the '{@link #isEsEventoDeInauguracion() <em>Es Evento De Inauguracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsEventoDeInauguracion()
   * @generated
   * @ordered
   */
  protected static final boolean ES_EVENTO_DE_INAUGURACION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsEventoDeInauguracion() <em>Es Evento De Inauguracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsEventoDeInauguracion()
   * @generated
   * @ordered
   */
  protected boolean esEventoDeInauguracion = ES_EVENTO_DE_INAUGURACION_EDEFAULT;

  /**
   * The default value of the '{@link #isEsRegistracion() <em>Es Registracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsRegistracion()
   * @generated
   * @ordered
   */
  protected static final boolean ES_REGISTRACION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsRegistracion() <em>Es Registracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsRegistracion()
   * @generated
   * @ordered
   */
  protected boolean esRegistracion = ES_REGISTRACION_EDEFAULT;

  /**
   * The default value of the '{@link #isEsEventoDeCierre() <em>Es Evento De Cierre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsEventoDeCierre()
   * @generated
   * @ordered
   */
  protected static final boolean ES_EVENTO_DE_CIERRE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsEventoDeCierre() <em>Es Evento De Cierre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsEventoDeCierre()
   * @generated
   * @ordered
   */
  protected boolean esEventoDeCierre = ES_EVENTO_DE_CIERRE_EDEFAULT;

  /**
   * The default value of the '{@link #isKeynote() <em>Keynote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeynote()
   * @generated
   * @ordered
   */
  protected static final boolean KEYNOTE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKeynote() <em>Keynote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeynote()
   * @generated
   * @ordered
   */
  protected boolean keynote = KEYNOTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTipoDeBreak() <em>Tipo De Break</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoDeBreak()
   * @generated
   * @ordered
   */
  protected TipoDeBreak tipoDeBreak;

  /**
   * The cached value of the '{@link #getTrack() <em>Track</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrack()
   * @generated
   * @ordered
   */
  protected Track track;

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
   * The cached value of the '{@link #getEspacio() <em>Espacio</em>}' reference.
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
   * The cached value of the '{@link #getOradores() <em>Oradores</em>}' reference list.
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
  protected Horario horario;

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
  public boolean isEsCharla()
  {
    return esCharla;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsCharla(boolean newEsCharla)
  {
    boolean oldEsCharla = esCharla;
    esCharla = newEsCharla;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_CHARLA, oldEsCharla, esCharla));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsMesaDeDebate()
  {
    return esMesaDeDebate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsMesaDeDebate(boolean newEsMesaDeDebate)
  {
    boolean oldEsMesaDeDebate = esMesaDeDebate;
    esMesaDeDebate = newEsMesaDeDebate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_MESA_DE_DEBATE, oldEsMesaDeDebate, esMesaDeDebate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsTaller()
  {
    return esTaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsTaller(boolean newEsTaller)
  {
    boolean oldEsTaller = esTaller;
    esTaller = newEsTaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_TALLER, oldEsTaller, esTaller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsBreak()
  {
    return esBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsBreak(boolean newEsBreak)
  {
    boolean oldEsBreak = esBreak;
    esBreak = newEsBreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_BREAK, oldEsBreak, esBreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsEventoDeInauguracion()
  {
    return esEventoDeInauguracion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsEventoDeInauguracion(boolean newEsEventoDeInauguracion)
  {
    boolean oldEsEventoDeInauguracion = esEventoDeInauguracion;
    esEventoDeInauguracion = newEsEventoDeInauguracion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_EVENTO_DE_INAUGURACION, oldEsEventoDeInauguracion, esEventoDeInauguracion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsRegistracion()
  {
    return esRegistracion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsRegistracion(boolean newEsRegistracion)
  {
    boolean oldEsRegistracion = esRegistracion;
    esRegistracion = newEsRegistracion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_REGISTRACION, oldEsRegistracion, esRegistracion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsEventoDeCierre()
  {
    return esEventoDeCierre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsEventoDeCierre(boolean newEsEventoDeCierre)
  {
    boolean oldEsEventoDeCierre = esEventoDeCierre;
    esEventoDeCierre = newEsEventoDeCierre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ES_EVENTO_DE_CIERRE, oldEsEventoDeCierre, esEventoDeCierre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKeynote()
  {
    return keynote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeynote(boolean newKeynote)
  {
    boolean oldKeynote = keynote;
    keynote = newKeynote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__KEYNOTE, oldKeynote, keynote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoDeBreak getTipoDeBreak()
  {
    return tipoDeBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoDeBreak(TipoDeBreak newTipoDeBreak, NotificationChain msgs)
  {
    TipoDeBreak oldTipoDeBreak = tipoDeBreak;
    tipoDeBreak = newTipoDeBreak;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TIPO_DE_BREAK, oldTipoDeBreak, newTipoDeBreak);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoDeBreak(TipoDeBreak newTipoDeBreak)
  {
    if (newTipoDeBreak != tipoDeBreak)
    {
      NotificationChain msgs = null;
      if (tipoDeBreak != null)
        msgs = ((InternalEObject)tipoDeBreak).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__TIPO_DE_BREAK, null, msgs);
      if (newTipoDeBreak != null)
        msgs = ((InternalEObject)newTipoDeBreak).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdcPackage.ACTIVIDAD__TIPO_DE_BREAK, null, msgs);
      msgs = basicSetTipoDeBreak(newTipoDeBreak, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TIPO_DE_BREAK, newTipoDeBreak, newTipoDeBreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Track getTrack()
  {
    if (track != null && track.eIsProxy())
    {
      InternalEObject oldTrack = (InternalEObject)track;
      track = (Track)eResolveProxy(oldTrack);
      if (track != oldTrack)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PdcPackage.ACTIVIDAD__TRACK, oldTrack, track));
      }
    }
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Track basicGetTrack()
  {
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrack(Track newTrack)
  {
    Track oldTrack = track;
    track = newTrack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__TRACK, oldTrack, track));
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
    if (espacio != null && espacio.eIsProxy())
    {
      InternalEObject oldEspacio = (InternalEObject)espacio;
      espacio = (Espacio)eResolveProxy(oldEspacio);
      if (espacio != oldEspacio)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PdcPackage.ACTIVIDAD__ESPACIO, oldEspacio, espacio));
      }
    }
    return espacio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espacio basicGetEspacio()
  {
    return espacio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEspacio(Espacio newEspacio)
  {
    Espacio oldEspacio = espacio;
    espacio = newEspacio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdcPackage.ACTIVIDAD__ESPACIO, oldEspacio, espacio));
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
      oradores = new EObjectResolvingEList<Orador>(Orador.class, this, PdcPackage.ACTIVIDAD__ORADORES);
    }
    return oradores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario getHorario()
  {
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorario(Horario newHorario, NotificationChain msgs)
  {
    Horario oldHorario = horario;
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
  public void setHorario(Horario newHorario)
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
      case PdcPackage.ACTIVIDAD__TIPO_DE_BREAK:
        return basicSetTipoDeBreak(null, msgs);
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
      case PdcPackage.ACTIVIDAD__ES_CHARLA:
        return isEsCharla();
      case PdcPackage.ACTIVIDAD__ES_MESA_DE_DEBATE:
        return isEsMesaDeDebate();
      case PdcPackage.ACTIVIDAD__ES_TALLER:
        return isEsTaller();
      case PdcPackage.ACTIVIDAD__ES_BREAK:
        return isEsBreak();
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_INAUGURACION:
        return isEsEventoDeInauguracion();
      case PdcPackage.ACTIVIDAD__ES_REGISTRACION:
        return isEsRegistracion();
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_CIERRE:
        return isEsEventoDeCierre();
      case PdcPackage.ACTIVIDAD__KEYNOTE:
        return isKeynote();
      case PdcPackage.ACTIVIDAD__TIPO_DE_BREAK:
        return getTipoDeBreak();
      case PdcPackage.ACTIVIDAD__TRACK:
        if (resolve) return getTrack();
        return basicGetTrack();
      case PdcPackage.ACTIVIDAD__TITULO:
        return getTitulo();
      case PdcPackage.ACTIVIDAD__DURACION:
        return getDuracion();
      case PdcPackage.ACTIVIDAD__ESPACIO:
        if (resolve) return getEspacio();
        return basicGetEspacio();
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
      case PdcPackage.ACTIVIDAD__ES_CHARLA:
        setEsCharla((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_MESA_DE_DEBATE:
        setEsMesaDeDebate((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_TALLER:
        setEsTaller((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_BREAK:
        setEsBreak((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_INAUGURACION:
        setEsEventoDeInauguracion((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_REGISTRACION:
        setEsRegistracion((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_CIERRE:
        setEsEventoDeCierre((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__KEYNOTE:
        setKeynote((Boolean)newValue);
        return;
      case PdcPackage.ACTIVIDAD__TIPO_DE_BREAK:
        setTipoDeBreak((TipoDeBreak)newValue);
        return;
      case PdcPackage.ACTIVIDAD__TRACK:
        setTrack((Track)newValue);
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
        setHorario((Horario)newValue);
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
      case PdcPackage.ACTIVIDAD__ES_CHARLA:
        setEsCharla(ES_CHARLA_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_MESA_DE_DEBATE:
        setEsMesaDeDebate(ES_MESA_DE_DEBATE_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_TALLER:
        setEsTaller(ES_TALLER_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_BREAK:
        setEsBreak(ES_BREAK_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_INAUGURACION:
        setEsEventoDeInauguracion(ES_EVENTO_DE_INAUGURACION_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_REGISTRACION:
        setEsRegistracion(ES_REGISTRACION_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_CIERRE:
        setEsEventoDeCierre(ES_EVENTO_DE_CIERRE_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__KEYNOTE:
        setKeynote(KEYNOTE_EDEFAULT);
        return;
      case PdcPackage.ACTIVIDAD__TIPO_DE_BREAK:
        setTipoDeBreak((TipoDeBreak)null);
        return;
      case PdcPackage.ACTIVIDAD__TRACK:
        setTrack((Track)null);
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
        setHorario((Horario)null);
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
      case PdcPackage.ACTIVIDAD__ES_CHARLA:
        return esCharla != ES_CHARLA_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_MESA_DE_DEBATE:
        return esMesaDeDebate != ES_MESA_DE_DEBATE_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_TALLER:
        return esTaller != ES_TALLER_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_BREAK:
        return esBreak != ES_BREAK_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_INAUGURACION:
        return esEventoDeInauguracion != ES_EVENTO_DE_INAUGURACION_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_REGISTRACION:
        return esRegistracion != ES_REGISTRACION_EDEFAULT;
      case PdcPackage.ACTIVIDAD__ES_EVENTO_DE_CIERRE:
        return esEventoDeCierre != ES_EVENTO_DE_CIERRE_EDEFAULT;
      case PdcPackage.ACTIVIDAD__KEYNOTE:
        return keynote != KEYNOTE_EDEFAULT;
      case PdcPackage.ACTIVIDAD__TIPO_DE_BREAK:
        return tipoDeBreak != null;
      case PdcPackage.ACTIVIDAD__TRACK:
        return track != null;
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
    result.append(" (esCharla: ");
    result.append(esCharla);
    result.append(", esMesaDeDebate: ");
    result.append(esMesaDeDebate);
    result.append(", esTaller: ");
    result.append(esTaller);
    result.append(", esBreak: ");
    result.append(esBreak);
    result.append(", esEventoDeInauguracion: ");
    result.append(esEventoDeInauguracion);
    result.append(", esRegistracion: ");
    result.append(esRegistracion);
    result.append(", esEventoDeCierre: ");
    result.append(esEventoDeCierre);
    result.append(", keynote: ");
    result.append(keynote);
    result.append(", titulo: ");
    result.append(titulo);
    result.append(", duracion: ");
    result.append(duracion);
    result.append(", genteEsperada: ");
    result.append(genteEsperada);
    result.append(')');
    return result.toString();
  }

} //ActividadImpl
