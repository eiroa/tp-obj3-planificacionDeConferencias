/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsCharla <em>Es Charla</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsMesaDeDebate <em>Es Mesa De Debate</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsTaller <em>Es Taller</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsBreak <em>Es Break</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeInauguracion <em>Es Evento De Inauguracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsRegistracion <em>Es Registracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeCierre <em>Es Evento De Cierre</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#isKeynote <em>Keynote</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getTipoDeBreak <em>Tipo De Break</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getTrack <em>Track</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getEspacio <em>Espacio</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getGenteEsperada <em>Gente Esperada</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getOradores <em>Oradores</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getHorario <em>Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends EObject
{
  /**
   * Returns the value of the '<em><b>Es Charla</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Charla</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Charla</em>' attribute.
   * @see #setEsCharla(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsCharla()
   * @model
   * @generated
   */
  boolean isEsCharla();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsCharla <em>Es Charla</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Charla</em>' attribute.
   * @see #isEsCharla()
   * @generated
   */
  void setEsCharla(boolean value);

  /**
   * Returns the value of the '<em><b>Es Mesa De Debate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Mesa De Debate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Mesa De Debate</em>' attribute.
   * @see #setEsMesaDeDebate(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsMesaDeDebate()
   * @model
   * @generated
   */
  boolean isEsMesaDeDebate();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsMesaDeDebate <em>Es Mesa De Debate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Mesa De Debate</em>' attribute.
   * @see #isEsMesaDeDebate()
   * @generated
   */
  void setEsMesaDeDebate(boolean value);

  /**
   * Returns the value of the '<em><b>Es Taller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Taller</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Taller</em>' attribute.
   * @see #setEsTaller(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsTaller()
   * @model
   * @generated
   */
  boolean isEsTaller();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsTaller <em>Es Taller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Taller</em>' attribute.
   * @see #isEsTaller()
   * @generated
   */
  void setEsTaller(boolean value);

  /**
   * Returns the value of the '<em><b>Es Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Break</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Break</em>' attribute.
   * @see #setEsBreak(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsBreak()
   * @model
   * @generated
   */
  boolean isEsBreak();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsBreak <em>Es Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Break</em>' attribute.
   * @see #isEsBreak()
   * @generated
   */
  void setEsBreak(boolean value);

  /**
   * Returns the value of the '<em><b>Es Evento De Inauguracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Evento De Inauguracion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Evento De Inauguracion</em>' attribute.
   * @see #setEsEventoDeInauguracion(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsEventoDeInauguracion()
   * @model
   * @generated
   */
  boolean isEsEventoDeInauguracion();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeInauguracion <em>Es Evento De Inauguracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Evento De Inauguracion</em>' attribute.
   * @see #isEsEventoDeInauguracion()
   * @generated
   */
  void setEsEventoDeInauguracion(boolean value);

  /**
   * Returns the value of the '<em><b>Es Registracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Registracion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Registracion</em>' attribute.
   * @see #setEsRegistracion(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsRegistracion()
   * @model
   * @generated
   */
  boolean isEsRegistracion();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsRegistracion <em>Es Registracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Registracion</em>' attribute.
   * @see #isEsRegistracion()
   * @generated
   */
  void setEsRegistracion(boolean value);

  /**
   * Returns the value of the '<em><b>Es Evento De Cierre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Evento De Cierre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Evento De Cierre</em>' attribute.
   * @see #setEsEventoDeCierre(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_EsEventoDeCierre()
   * @model
   * @generated
   */
  boolean isEsEventoDeCierre();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isEsEventoDeCierre <em>Es Evento De Cierre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Evento De Cierre</em>' attribute.
   * @see #isEsEventoDeCierre()
   * @generated
   */
  void setEsEventoDeCierre(boolean value);

  /**
   * Returns the value of the '<em><b>Keynote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keynote</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keynote</em>' attribute.
   * @see #setKeynote(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Keynote()
   * @model
   * @generated
   */
  boolean isKeynote();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#isKeynote <em>Keynote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keynote</em>' attribute.
   * @see #isKeynote()
   * @generated
   */
  void setKeynote(boolean value);

  /**
   * Returns the value of the '<em><b>Tipo De Break</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo De Break</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo De Break</em>' containment reference.
   * @see #setTipoDeBreak(TipoDeBreak)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_TipoDeBreak()
   * @model containment="true"
   * @generated
   */
  TipoDeBreak getTipoDeBreak();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getTipoDeBreak <em>Tipo De Break</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo De Break</em>' containment reference.
   * @see #getTipoDeBreak()
   * @generated
   */
  void setTipoDeBreak(TipoDeBreak value);

  /**
   * Returns the value of the '<em><b>Track</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Track</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Track</em>' reference.
   * @see #setTrack(Track)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Track()
   * @model
   * @generated
   */
  Track getTrack();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getTrack <em>Track</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Track</em>' reference.
   * @see #getTrack()
   * @generated
   */
  void setTrack(Track value);

  /**
   * Returns the value of the '<em><b>Titulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titulo</em>' attribute.
   * @see #setTitulo(String)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Titulo()
   * @model
   * @generated
   */
  String getTitulo();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getTitulo <em>Titulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titulo</em>' attribute.
   * @see #getTitulo()
   * @generated
   */
  void setTitulo(String value);

  /**
   * Returns the value of the '<em><b>Duracion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duracion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duracion</em>' attribute.
   * @see #setDuracion(int)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Duracion()
   * @model
   * @generated
   */
  int getDuracion();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getDuracion <em>Duracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duracion</em>' attribute.
   * @see #getDuracion()
   * @generated
   */
  void setDuracion(int value);

  /**
   * Returns the value of the '<em><b>Espacio</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Espacio</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Espacio</em>' reference.
   * @see #setEspacio(Espacio)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Espacio()
   * @model
   * @generated
   */
  Espacio getEspacio();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getEspacio <em>Espacio</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Espacio</em>' reference.
   * @see #getEspacio()
   * @generated
   */
  void setEspacio(Espacio value);

  /**
   * Returns the value of the '<em><b>Gente Esperada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gente Esperada</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gente Esperada</em>' attribute.
   * @see #setGenteEsperada(int)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_GenteEsperada()
   * @model
   * @generated
   */
  int getGenteEsperada();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getGenteEsperada <em>Gente Esperada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gente Esperada</em>' attribute.
   * @see #getGenteEsperada()
   * @generated
   */
  void setGenteEsperada(int value);

  /**
   * Returns the value of the '<em><b>Oradores</b></em>' reference list.
   * The list contents are of type {@link ar.unq.edu.objetos3.pdc.Orador}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oradores</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oradores</em>' reference list.
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Oradores()
   * @model
   * @generated
   */
  EList<Orador> getOradores();

  /**
   * Returns the value of the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario</em>' containment reference.
   * @see #setHorario(Horario)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Horario()
   * @model containment="true"
   * @generated
   */
  Horario getHorario();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getHorario <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario</em>' containment reference.
   * @see #getHorario()
   * @generated
   */
  void setHorario(Horario value);

} // Actividad
