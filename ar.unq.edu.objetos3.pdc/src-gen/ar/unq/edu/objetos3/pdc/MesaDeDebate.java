/**
 */
package ar.unq.edu.objetos3.pdc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesa De Debate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getMesaDeDebate()
 * @model
 * @generated
 */
public interface MesaDeDebate extends Actividad
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
   * @see #setTipo(Actividad)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getMesaDeDebate_Tipo()
   * @model containment="true"
   * @generated
   */
  Actividad getTipo();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(Actividad value);

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
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getMesaDeDebate_Titulo()
   * @model
   * @generated
   */
  String getTitulo();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getTitulo <em>Titulo</em>}' attribute.
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
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getMesaDeDebate_Duracion()
   * @model
   * @generated
   */
  int getDuracion();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getDuracion <em>Duracion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duracion</em>' attribute.
   * @see #getDuracion()
   * @generated
   */
  void setDuracion(int value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' containment reference.
   * @see #setAula(Espacio)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getMesaDeDebate_Aula()
   * @model containment="true"
   * @generated
   */
  Espacio getAula();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.MesaDeDebate#getAula <em>Aula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' containment reference.
   * @see #getAula()
   * @generated
   */
  void setAula(Espacio value);

} // MesaDeDebate
