/**
 */
package factoryTutorial;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.ComplexItemType#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.ComplexItemType#getOverseasmaterial <em>Overseasmaterial</em>}</li>
 *   <li>{@link factoryTutorial.ComplexItemType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see factoryTutorial.FactoryTutorialPackage#getComplexItemType()
 * @model
 * @generated
 */
public interface ComplexItemType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Overseasitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overseasitem</em>' reference.
	 * @see #setOverseasitem(OverseasItem)
	 * @see factoryTutorial.FactoryTutorialPackage#getComplexItemType_Overseasitem()
	 * @model
	 * @generated
	 */
	OverseasItem getOverseasitem();

	/**
	 * Sets the value of the '{@link factoryTutorial.ComplexItemType#getOverseasitem <em>Overseasitem</em>}' reference.
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
	 * @see factoryTutorial.FactoryTutorialPackage#getComplexItemType_Overseasmaterial()
	 * @model
	 * @generated
	 */
	OverseasMaterial getOverseasmaterial();

	/**
	 * Sets the value of the '{@link factoryTutorial.ComplexItemType#getOverseasmaterial <em>Overseasmaterial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overseasmaterial</em>' reference.
	 * @see #getOverseasmaterial()
	 * @generated
	 */
	void setOverseasmaterial(OverseasMaterial value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link factoryTutorial.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see factoryTutorial.FactoryTutorialPackage#getComplexItemType_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

} // ComplexItemType
