/**
 */
package factoryTutorial;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see factoryTutorial.FactoryTutorialPackage
 * @generated
 */
public interface FactoryTutorialFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryTutorialFactory eINSTANCE = factoryTutorial.impl.FactoryTutorialFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory</em>'.
	 * @generated
	 */
	Factory createFactory();

	/**
	 * Returns a new object of class '<em>Overseas Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overseas Item</em>'.
	 * @generated
	 */
	OverseasItem createOverseasItem();

	/**
	 * Returns a new object of class '<em>Overseas Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overseas Material</em>'.
	 * @generated
	 */
	OverseasMaterial createOverseasMaterial();

	/**
	 * Returns a new object of class '<em>Basic Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Item Type</em>'.
	 * @generated
	 */
	BasicItemType createBasicItemType();

	/**
	 * Returns a new object of class '<em>Complex Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Item Type</em>'.
	 * @generated
	 */
	ComplexItemType createComplexItemType();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactoryTutorialPackage getFactoryTutorialPackage();

} //FactoryTutorialFactory
