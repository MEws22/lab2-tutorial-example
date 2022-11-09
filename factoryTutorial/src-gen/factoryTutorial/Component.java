/**
 */
package factoryTutorial;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.Component#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link factoryTutorial.Component#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.Component#getOverseasmaterial <em>Overseasmaterial</em>}</li>
 * </ul>
 *
 * @see factoryTutorial.FactoryTutorialPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' reference.
	 * @see #setItemtype(ItemType)
	 * @see factoryTutorial.FactoryTutorialPackage#getComponent_Itemtype()
	 * @model
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link factoryTutorial.Component#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

	/**
	 * Returns the value of the '<em><b>Overseasitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overseasitem</em>' reference.
	 * @see #setOverseasitem(OverseasItem)
	 * @see factoryTutorial.FactoryTutorialPackage#getComponent_Overseasitem()
	 * @model
	 * @generated
	 */
	OverseasItem getOverseasitem();

	/**
	 * Sets the value of the '{@link factoryTutorial.Component#getOverseasitem <em>Overseasitem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overseasitem</em>' reference.
	 * @see #getOverseasitem()
	 * @generated
	 */
	void setOverseasitem(OverseasItem value);

	/**
	 * Returns the value of the '<em><b>Overseasmaterial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overseasmaterial</em>' reference.
	 * @see #setOverseasmaterial(OverseasMaterial)
	 * @see factoryTutorial.FactoryTutorialPackage#getComponent_Overseasmaterial()
	 * @model
	 * @generated
	 */
	OverseasMaterial getOverseasmaterial();

	/**
	 * Sets the value of the '{@link factoryTutorial.Component#getOverseasmaterial <em>Overseasmaterial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overseasmaterial</em>' reference.
	 * @see #getOverseasmaterial()
	 * @generated
	 */
	void setOverseasmaterial(OverseasMaterial value);

} // Component
