/**
 */
package factoryTutorial.impl;

import factoryTutorial.Component;
import factoryTutorial.FactoryTutorialPackage;
import factoryTutorial.ItemType;

import factoryTutorial.OverseasItem;
import factoryTutorial.OverseasMaterial;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.impl.ComponentImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link factoryTutorial.impl.ComponentImpl#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.impl.ComponentImpl#getOverseasmaterial <em>Overseasmaterial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemtype;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryTutorialPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemtype() {
		if (itemtype != null && itemtype.eIsProxy()) {
			InternalEObject oldItemtype = (InternalEObject) itemtype;
			itemtype = (ItemType) eResolveProxy(oldItemtype);
			if (itemtype != oldItemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FactoryTutorialPackage.COMPONENT__ITEMTYPE, oldItemtype, itemtype));
			}
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemtype() {
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtype(ItemType newItemtype) {
		ItemType oldItemtype = itemtype;
		itemtype = newItemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryTutorialPackage.COMPONENT__ITEMTYPE,
					oldItemtype, itemtype));
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
							FactoryTutorialPackage.COMPONENT__OVERSEASITEM, oldOverseasitem, overseasitem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryTutorialPackage.COMPONENT__OVERSEASITEM,
					oldOverseasitem, overseasitem));
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
							FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL, oldOverseasmaterial, overseasmaterial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL,
					oldOverseasmaterial, overseasmaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPONENT__ITEMTYPE:
			if (resolve)
				return getItemtype();
			return basicGetItemtype();
		case FactoryTutorialPackage.COMPONENT__OVERSEASITEM:
			if (resolve)
				return getOverseasitem();
			return basicGetOverseasitem();
		case FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL:
			if (resolve)
				return getOverseasmaterial();
			return basicGetOverseasmaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FactoryTutorialPackage.COMPONENT__ITEMTYPE:
			setItemtype((ItemType) newValue);
			return;
		case FactoryTutorialPackage.COMPONENT__OVERSEASITEM:
			setOverseasitem((OverseasItem) newValue);
			return;
		case FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL:
			setOverseasmaterial((OverseasMaterial) newValue);
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
		case FactoryTutorialPackage.COMPONENT__ITEMTYPE:
			setItemtype((ItemType) null);
			return;
		case FactoryTutorialPackage.COMPONENT__OVERSEASITEM:
			setOverseasitem((OverseasItem) null);
			return;
		case FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL:
			setOverseasmaterial((OverseasMaterial) null);
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
		case FactoryTutorialPackage.COMPONENT__ITEMTYPE:
			return itemtype != null;
		case FactoryTutorialPackage.COMPONENT__OVERSEASITEM:
			return overseasitem != null;
		case FactoryTutorialPackage.COMPONENT__OVERSEASMATERIAL:
			return overseasmaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
