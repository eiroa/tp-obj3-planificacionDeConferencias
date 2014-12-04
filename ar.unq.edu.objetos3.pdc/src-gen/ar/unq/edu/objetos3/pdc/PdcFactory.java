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
   * Returns a new object of class '<em>PDC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PDC</em>'.
   * @generated
   */
  PDC createPDC();

  /**
   * Returns a new object of class '<em>Organizaciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Organizaciones</em>'.
   * @generated
   */
  Organizaciones createOrganizaciones();

  /**
   * Returns a new object of class '<em>Oradores</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oradores</em>'.
   * @generated
   */
  Oradores createOradores();

  /**
   * Returns a new object of class '<em>Espacios</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Espacios</em>'.
   * @generated
   */
  Espacios createEspacios();

  /**
   * Returns a new object of class '<em>Tracks</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tracks</em>'.
   * @generated
   */
  Tracks createTracks();

  /**
   * Returns a new object of class '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule</em>'.
   * @generated
   */
  Schedule createSchedule();

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
   * Returns a new object of class '<em>Espacio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Espacio</em>'.
   * @generated
   */
  Espacio createEspacio();

  /**
   * Returns a new object of class '<em>Actividad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actividad</em>'.
   * @generated
   */
  Actividad createActividad();

  /**
   * Returns a new object of class '<em>Tipo De Break</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipo De Break</em>'.
   * @generated
   */
  TipoDeBreak createTipoDeBreak();

  /**
   * Returns a new object of class '<em>Desayuno</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desayuno</em>'.
   * @generated
   */
  Desayuno createDesayuno();

  /**
   * Returns a new object of class '<em>Almuerzo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Almuerzo</em>'.
   * @generated
   */
  Almuerzo createAlmuerzo();

  /**
   * Returns a new object of class '<em>Merienda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Merienda</em>'.
   * @generated
   */
  Merienda createMerienda();

  /**
   * Returns a new object of class '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horario</em>'.
   * @generated
   */
  Horario createHorario();

  /**
   * Returns a new object of class '<em>Track</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Track</em>'.
   * @generated
   */
  Track createTrack();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PdcPackage getPdcPackage();

} //PdcFactory
