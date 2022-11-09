/**
 */
package factoryTutorial;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see factoryTutorial.FactoryTutorialFactory
 * @model kind="package"
 * @generated
 */
public interface FactoryTutorialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "factoryTutorial";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/factoryTutorial";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "factoryTutorial";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryTutorialPackage eINSTANCE = factoryTutorial.impl.FactoryTutorialPackageImpl.init();

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.FactoryImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Overseasitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__OVERSEASITEM = 0;

	/**
	 * The feature id for the '<em><b>Itemtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ITEMTYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.ItemTypeImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.OverseasItemImpl <em>Overseas Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.OverseasItemImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getOverseasItem()
	 * @generated
	 */
	int OVERSEAS_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Overseasmaterial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_ITEM__OVERSEASMATERIAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_ITEM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Overseas Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Overseas Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.OverseasMaterialImpl <em>Overseas Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.OverseasMaterialImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getOverseasMaterial()
	 * @generated
	 */
	int OVERSEAS_MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_MATERIAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Overseas Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_MATERIAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Overseas Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERSEAS_MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.BasicItemTypeImpl <em>Basic Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.BasicItemTypeImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getBasicItemType()
	 * @generated
	 */
	int BASIC_ITEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__NAME = ITEM_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Basic Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.ComplexItemTypeImpl <em>Complex Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.ComplexItemTypeImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getComplexItemType()
	 * @generated
	 */
	int COMPLEX_ITEM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__NAME = ITEM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Overseasitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__OVERSEASITEM = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overseasmaterial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__OVERSEASMATERIAL = ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__COMPONENT = ITEM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Complex Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factoryTutorial.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factoryTutorial.impl.ComponentImpl
	 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ITEMTYPE = 0;

	/**
	 * The feature id for the '<em><b>Overseasitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OVERSEASITEM = 1;

	/**
	 * The feature id for the '<em><b>Overseasmaterial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OVERSEASMATERIAL = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link factoryTutorial.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see factoryTutorial.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link factoryTutorial.Factory#getOverseasitem <em>Overseasitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overseasitem</em>'.
	 * @see factoryTutorial.Factory#getOverseasitem()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Overseasitem();

	/**
	 * Returns the meta object for the containment reference list '{@link factoryTutorial.Factory#getItemtype <em>Itemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Itemtype</em>'.
	 * @see factoryTutorial.Factory#getItemtype()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Itemtype();

	/**
	 * Returns the meta object for the attribute '{@link factoryTutorial.Factory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factoryTutorial.Factory#getName()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Name();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see factoryTutorial.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link factoryTutorial.ItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factoryTutorial.ItemType#getName()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Name();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.OverseasItem <em>Overseas Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overseas Item</em>'.
	 * @see factoryTutorial.OverseasItem
	 * @generated
	 */
	EClass getOverseasItem();

	/**
	 * Returns the meta object for the containment reference list '{@link factoryTutorial.OverseasItem#getOverseasmaterial <em>Overseasmaterial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overseasmaterial</em>'.
	 * @see factoryTutorial.OverseasItem#getOverseasmaterial()
	 * @see #getOverseasItem()
	 * @generated
	 */
	EReference getOverseasItem_Overseasmaterial();

	/**
	 * Returns the meta object for the attribute '{@link factoryTutorial.OverseasItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factoryTutorial.OverseasItem#getName()
	 * @see #getOverseasItem()
	 * @generated
	 */
	EAttribute getOverseasItem_Name();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.OverseasMaterial <em>Overseas Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overseas Material</em>'.
	 * @see factoryTutorial.OverseasMaterial
	 * @generated
	 */
	EClass getOverseasMaterial();

	/**
	 * Returns the meta object for the attribute '{@link factoryTutorial.OverseasMaterial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factoryTutorial.OverseasMaterial#getName()
	 * @see #getOverseasMaterial()
	 * @generated
	 */
	EAttribute getOverseasMaterial_Name();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.BasicItemType <em>Basic Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Item Type</em>'.
	 * @see factoryTutorial.BasicItemType
	 * @generated
	 */
	EClass getBasicItemType();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.ComplexItemType <em>Complex Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Item Type</em>'.
	 * @see factoryTutorial.ComplexItemType
	 * @generated
	 */
	EClass getComplexItemType();

	/**
	 * Returns the meta object for the reference '{@link factoryTutorial.ComplexItemType#getOverseasitem <em>Overseasitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overseasitem</em>'.
	 * @see factoryTutorial.ComplexItemType#getOverseasitem()
	 * @see #getComplexItemType()
	 * @generated
	 */
	EReference getComplexItemType_Overseasitem();

	/**
	 * Returns the meta object for the reference '{@link factoryTutorial.ComplexItemType#getOverseasmaterial <em>Overseasmaterial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overseasmaterial</em>'.
	 * @see factoryTutorial.ComplexItemType#getOverseasmaterial()
	 * @see #getComplexItemType()
	 * @generated
	 */
	EReference getComplexItemType_Overseasmaterial();

	/**
	 * Returns the meta object for the containment reference list '{@link factoryTutorial.ComplexItemType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see factoryTutorial.ComplexItemType#getComponent()
	 * @see #getComplexItemType()
	 * @generated
	 */
	EReference getComplexItemType_Component();

	/**
	 * Returns the meta object for class '{@link factoryTutorial.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see factoryTutorial.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link factoryTutorial.Component#getItemtype <em>Itemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Itemtype</em>'.
	 * @see factoryTutorial.Component#getItemtype()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Itemtype();

	/**
	 * Returns the meta object for the reference '{@link factoryTutorial.Component#getOverseasitem <em>Overseasitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overseasitem</em>'.
	 * @see factoryTutorial.Component#getOverseasitem()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Overseasitem();

	/**
	 * Returns the meta object for the reference '{@link factoryTutorial.Component#getOverseasmaterial <em>Overseasmaterial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overseasmaterial</em>'.
	 * @see factoryTutorial.Component#getOverseasmaterial()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Overseasmaterial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactoryTutorialFactory getFactoryTutorialFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.FactoryImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Overseasitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__OVERSEASITEM = eINSTANCE.getFactory_Overseasitem();

		/**
		 * The meta object literal for the '<em><b>Itemtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__ITEMTYPE = eINSTANCE.getFactory_Itemtype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__NAME = eINSTANCE.getFactory_Name();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.ItemTypeImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__NAME = eINSTANCE.getItemType_Name();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.OverseasItemImpl <em>Overseas Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.OverseasItemImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getOverseasItem()
		 * @generated
		 */
		EClass OVERSEAS_ITEM = eINSTANCE.getOverseasItem();

		/**
		 * The meta object literal for the '<em><b>Overseasmaterial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERSEAS_ITEM__OVERSEASMATERIAL = eINSTANCE.getOverseasItem_Overseasmaterial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERSEAS_ITEM__NAME = eINSTANCE.getOverseasItem_Name();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.OverseasMaterialImpl <em>Overseas Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.OverseasMaterialImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getOverseasMaterial()
		 * @generated
		 */
		EClass OVERSEAS_MATERIAL = eINSTANCE.getOverseasMaterial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERSEAS_MATERIAL__NAME = eINSTANCE.getOverseasMaterial_Name();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.BasicItemTypeImpl <em>Basic Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.BasicItemTypeImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getBasicItemType()
		 * @generated
		 */
		EClass BASIC_ITEM_TYPE = eINSTANCE.getBasicItemType();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.ComplexItemTypeImpl <em>Complex Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.ComplexItemTypeImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getComplexItemType()
		 * @generated
		 */
		EClass COMPLEX_ITEM_TYPE = eINSTANCE.getComplexItemType();

		/**
		 * The meta object literal for the '<em><b>Overseasitem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM_TYPE__OVERSEASITEM = eINSTANCE.getComplexItemType_Overseasitem();

		/**
		 * The meta object literal for the '<em><b>Overseasmaterial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM_TYPE__OVERSEASMATERIAL = eINSTANCE.getComplexItemType_Overseasmaterial();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM_TYPE__COMPONENT = eINSTANCE.getComplexItemType_Component();

		/**
		 * The meta object literal for the '{@link factoryTutorial.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factoryTutorial.impl.ComponentImpl
		 * @see factoryTutorial.impl.FactoryTutorialPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Itemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ITEMTYPE = eINSTANCE.getComponent_Itemtype();

		/**
		 * The meta object literal for the '<em><b>Overseasitem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OVERSEASITEM = eINSTANCE.getComponent_Overseasitem();

		/**
		 * The meta object literal for the '<em><b>Overseasmaterial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OVERSEASMATERIAL = eINSTANCE.getComponent_Overseasmaterial();

	}

} //FactoryTutorialPackage
