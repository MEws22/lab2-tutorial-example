/**
 */
package factoryTutorial.impl;

import factoryTutorial.ComplexItemType;
import factoryTutorial.Component;
import factoryTutorial.FactoryTutorialPackage;
import factoryTutorial.OverseasItem;
import factoryTutorial.OverseasMaterial;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.impl.ComplexItemTypeImpl#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.impl.ComplexItemTypeImpl#getOverseasmaterial <em>Overseasmaterial</em>}</li>
 *   <li>{@link factoryTutorial.impl.ComplexItemTypeImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexItemTypeImpl extends ItemTypeImpl implements ComplexItemType {
	/**
	 * The cached value of the '{@link #getOverseasitem() <em>Overseasitem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverseasitem()
	 * @generated
	 * @ordered
	 */
	protected OverseasItem overseasitem;

	/**
	 * The cached value of the '{@link #getOverseasmaterial() <em>Overseasmaterial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverseasmaterial()
	 * @generated
	 * @ordered
	 */
	protected OverseasMaterial overseasmaterial;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryTutorialPackage.Literals.COMPLEX_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasItem getOverseasitem() {
		if (overseasitem != null && overseasitem.eIsProxy()) {
			InternalEObject oldOverseasitem = (InternalEObject) overseasitem;
			overseasitem = (OverseasItem) eResolveProxy(oldOverseasitem);
			if (overseasitem != oldOverseasitem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM, oldOverseasitem, overseasitem));
			}
		}
		return overseasitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasItem basicGetOverseasitem() {
		return overseasitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverseasitem(OverseasItem newOverseasitem) {
		OverseasItem oldOverseasitem = overseasitem;
		overseasitem = newOverseasitem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM, oldOverseasitem, overseasitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasMaterial getOverseasmaterial() {
		if (overseasmaterial != null && overseasmaterial.eIsProxy()) {
			InternalEObject oldOverseasmaterial = (InternalEObject) overseasmaterial;
			overseasmaterial = (OverseasMaterial) eResolveProxy(oldOverseasmaterial);
			if (overseasmaterial != oldOverseasmaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL, oldOverseasmaterial,
							overseasmaterial));
			}
		}
		return overseasmaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverseasMaterial basicGetOverseasmaterial() {
		return overseasmaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverseasmaterial(OverseasMaterial newOverseasmaterial) {
		OverseasMaterial oldOverseasmaterial = overseasmaterial;
		overseasmaterial = newOverseasmaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL, oldOverseasmaterial, overseasmaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM:
			if (resolve)
				return getOverseasitem();
			return basicGetOverseasitem();
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL:
			if (resolve)
				return getOverseasmaterial();
			return basicGetOverseasmaterial();
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT:
			return getComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM:
			setOverseasitem((OverseasItem) newValue);
			return;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL:
			setOverseasmaterial((OverseasMaterial) newValue);
			return;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM:
			setOverseasitem((OverseasItem) null);
			return;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL:
			setOverseasmaterial((OverseasMaterial) null);
			return;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT:
			getComponent().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASITEM:
			return overseasitem != null;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__OVERSEASMATERIAL:
			return overseasmaterial != null;
		case FactoryTutorialPackage.COMPLEX_ITEM_TYPE__COMPONENT:
			return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexItemTypeImpl
