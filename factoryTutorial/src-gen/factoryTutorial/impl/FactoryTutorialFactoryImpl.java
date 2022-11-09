/**
 */
package factoryTutorial.impl;

import factoryTutorial.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryTutorialFactoryImpl extends EFactoryImpl implements FactoryTutorialFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactoryTutorialFactory init() {
		try {
			FactoryTutorialFactory theFactoryTutorialFactory = (FactoryTutorialFactory) EPackage.Registry.INSTANCE
					.getEFactory(FactoryTutorialPackage.eNS_URI);
			if (theFactoryTutorialFactory != null) {
				return theFactoryTutorialFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryTutorialFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTutorialFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FactoryTutorialPackage.FACTORY:
			return createFactory();
		case FactoryTutorialPackage.OVERSEAS_ITEM:
			return createOverseasItem();
		case FactoryTutorialPackage.OVERSEAS_MATERIAL:
			return createOverseasMaterial();
		case FactoryTutorialPackage.BASIC_ITEM_TYPE:
			return createBasicItemType();
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE:
			return createComplexItemType();
		case FactoryTutorialPackage.COMPONENT:
			return createComponent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory createFactory() {
		FactoryImpl factory = new FactoryImpl();
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasItem createOverseasItem() {
		OverseasItemImpl overseasItem = new OverseasItemImpl();
		return overseasItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasMaterial createOverseasMaterial() {
		OverseasMaterialImpl overseasMaterial = new OverseasMaterialImpl();
		return overseasMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicItemType createBasicItemType() {
		BasicItemTypeImpl basicItemType = new BasicItemTypeImpl();
		return basicItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexItemType createComplexItemType() {
		ComplexItemTypeImpl complexItemType = new ComplexItemTypeImpl();
		return complexItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTutorialPackage getFactoryTutorialPackage() {
		return (FactoryTutorialPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactoryTutorialPackage getPackage() {
		return FactoryTutorialPackage.eINSTANCE;
	}

} //FactoryTutorialFactoryImpl
