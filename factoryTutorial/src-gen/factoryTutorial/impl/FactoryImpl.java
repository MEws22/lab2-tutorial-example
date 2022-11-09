/**
 */
package factoryTutorial.impl;

import factoryTutorial.Factory;
import factoryTutorial.FactoryTutorialPackage;
import factoryTutorial.ItemType;
import factoryTutorial.OverseasItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.impl.FactoryImpl#getOverseasitem <em>Overseasitem</em>}</li>
 *   <li>{@link factoryTutorial.impl.FactoryImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link factoryTutorial.impl.FactoryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends MinimalEObjectImpl.Container implements Factory {
	/**
	 * The cached value of the '{@link #getOverseasitem() <em>Overseasitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverseasitem()
	 * @generated
	 * @ordered
	 */
	protected EList<OverseasItem> overseasitem;

	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> itemtype;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryTutorialPackage.Literals.FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverseasItem> getOverseasitem() {
		if (overseasitem == null) {
			overseasitem = new EObjectContainmentEList<OverseasItem>(OverseasItem.class, this,
					FactoryTutorialPackage.FACTORY__OVERSEASITEM);
		}
		return overseasitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItemtype() {
		if (itemtype == null) {
			itemtype = new EObjectContainmentEList<ItemType>(ItemType.class, this,
					FactoryTutorialPackage.FACTORY__ITEMTYPE);
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryTutorialPackage.FACTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FactoryTutorialPackage.FACTORY__OVERSEASITEM:
			return ((InternalEList<?>) getOverseasitem()).basicRemove(otherEnd, msgs);
		case FactoryTutorialPackage.FACTORY__ITEMTYPE:
			return ((InternalEList<?>) getItemtype()).basicRemove(otherEnd, msgs);
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
		case FactoryTutorialPackage.FACTORY__OVERSEASITEM:
			return getOverseasitem();
		case FactoryTutorialPackage.FACTORY__ITEMTYPE:
			return getItemtype();
		case FactoryTutorialPackage.FACTORY__NAME:
			return getName();
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
		case FactoryTutorialPackage.FACTORY__OVERSEASITEM:
			getOverseasitem().clear();
			getOverseasitem().addAll((Collection<? extends OverseasItem>) newValue);
			return;
		case FactoryTutorialPackage.FACTORY__ITEMTYPE:
			getItemtype().clear();
			getItemtype().addAll((Collection<? extends ItemType>) newValue);
			return;
		case FactoryTutorialPackage.FACTORY__NAME:
			setName((String) newValue);
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
		case FactoryTutorialPackage.FACTORY__OVERSEASITEM:
			getOverseasitem().clear();
			return;
		case FactoryTutorialPackage.FACTORY__ITEMTYPE:
			getItemtype().clear();
			return;
		case FactoryTutorialPackage.FACTORY__NAME:
			setName(NAME_EDEFAULT);
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
		case FactoryTutorialPackage.FACTORY__OVERSEASITEM:
			return overseasitem != null && !overseasitem.isEmpty();
		case FactoryTutorialPackage.FACTORY__ITEMTYPE:
			return itemtype != null && !itemtype.isEmpty();
		case FactoryTutorialPackage.FACTORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
