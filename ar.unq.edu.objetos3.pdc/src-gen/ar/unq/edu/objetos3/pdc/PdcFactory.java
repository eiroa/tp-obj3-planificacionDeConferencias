/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ar.unq.edu.objetos3.pdc.PdcPackage
 * @generated
 */
public interface PdcFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdcFactory eINSTANCE = ar.unq.edu.objetos3.pdc.impl.PdcFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule</em>'.
   * @generated
   */
  Schedule createSchedule();

  /**
   * Returns a new object of class '<em>Espacio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Espacio</em>'.
   * @generated
   */
  Espacio createEspacio();

  /**
   * Returns a new object of class '<em>Organizacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Organizacion</em>'.
   * @generated
   */
  Organizacion createOrganizacion();

  /**
   * Returns a new object of class '<em>Orador</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orador</em>'.
   * @generated
   */
  Orador createOrador();

  /**
   * Returns a new object of class '<em>Actividad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actividad</em>'.
   * @generated
   */
  Actividad createActividad();

  /**
   * Returns a new object of class '<em>Charla</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Charla</em>'.
   * @generated
   */
  Charla createCharla();

  /**
   * Returns a new object of class '<em>Taller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Taller</em>'.
   * @generated
   */
  Taller createTaller();

  /**
   * Returns a new object of class '<em>Mesa De Debate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mesa De Debate</em>'.
   * @generated
   */
  MesaDeDebate createMesaDeDebate();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PdcPackage getPdcPackage();

} //PdcFactory
