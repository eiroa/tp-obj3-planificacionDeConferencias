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
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getTipo <em>Tipo</em>}</li>
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
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(TipoDeActividad)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Tipo()
   * @model containment="true"
   * @generated
   */
  TipoDeActividad getTipo();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(TipoDeActividad value);

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
   * Returns the value of the '<em><b>Espacio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Espacio</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Espacio</em>' containment reference.
   * @see #setEspacio(Espacio)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Espacio()
   * @model containment="true"
   * @generated
   */
  Espacio getEspacio();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getEspacio <em>Espacio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Espacio</em>' containment reference.
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
   * Returns the value of the '<em><b>Oradores</b></em>' containment reference list.
   * The list contents are of type {@link ar.unq.edu.objetos3.pdc.Orador}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oradores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oradores</em>' containment reference list.
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Oradores()
   * @model containment="true"
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
   * @see #setHorario(Hora)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Horario()
   * @model containment="true"
   * @generated
   */
  Hora getHorario();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Actividad#getHorario <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario</em>' containment reference.
   * @see #getHorario()
   * @generated
   */
  void setHorario(Hora value);

} // Actividad
