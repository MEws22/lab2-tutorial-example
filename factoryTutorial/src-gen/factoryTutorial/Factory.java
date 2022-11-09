/**
 */
package factoryTutorial;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.Factory#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.Factory#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link factoryTutorial.Factory#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see factoryTutorial.FactoryTutorialPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject {
	/**
	 * Returns the value of the '<em><b>Overseasitem</b></em>' containment reference list.
	 * The list contents are of type {@link factoryTutorial.OverseasItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overseasitem</em>' containment reference list.
	 * @see factoryTutorial.FactoryTutorialPackage#getFactory_Overseasitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverseasItem> getOverseasitem();

	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' containment reference list.
	 * The list contents are of type {@link factoryTutorial.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' containment reference list.
	 * @see factoryTutorial.FactoryTutorialPackage#getFactory_Itemtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getItemtype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see factoryTutorial.FactoryTutorialPackage#getFactory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link factoryTutorial.Factory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Factory
