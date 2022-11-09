/**
 */
package factoryTutorial.util;

import factoryTutorial.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see factoryTutorial.FactoryTutorialPackage
 * @generated
 */
public class FactoryTutorialAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FactoryTutorialPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTutorialAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FactoryTutorialPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryTutorialSwitch<Adapter> modelSwitch = new FactoryTutorialSwitch<Adapter>() {
		@Override
		public Adapter caseFactory(Factory object) {
			return createFactoryAdapter();
		}

		@Override
		public Adapter caseItemType(ItemType object) {
			return createItemTypeAdapter();
		}

		@Override
		public Adapter caseOverseasItem(OverseasItem object) {
			return createOverseasItemAdapter();
		}

		@Override
		public Adapter caseOverseasMaterial(OverseasMaterial object) {
			return createOverseasMaterialAdapter();
		}

		@Override
		public Adapter caseBasicItemType(BasicItemType object) {
			return createBasicItemTypeAdapter();
		}

		@Override
		public Adapter caseComplexItemType(ComplexItemType object) {
			return createComplexItemTypeAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.OverseasItem <em>Overseas Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.OverseasItem
	 * @generated
	 */
	public Adapter createOverseasItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.OverseasMaterial <em>Overseas Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.OverseasMaterial
	 * @generated
	 */
	public Adapter createOverseasMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.BasicItemType <em>Basic Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.BasicItemType
	 * @generated
	 */
	public Adapter createBasicItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.ComplexItemType <em>Complex Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.ComplexItemType
	 * @generated
	 */
	public Adapter createComplexItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factoryTutorial.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factoryTutorial.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FactoryTutorialAdapterFactory
