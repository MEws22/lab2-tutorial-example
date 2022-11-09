/**
 */
package factoryTutorial.impl;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overseas Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factoryTutorial.impl.OverseasItemImpl#getOverseasmaterial <em>Overseasmaterial</em>}</li>
 *   <li>{@link factoryTutorial.impl.OverseasItemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverseasItemImpl extends MinimalEObjectImpl.Container implements OverseasItem {
	/**
	 * The cached value of the '{@link #getOverseasmaterial() <em>Overseasmaterial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverseasmaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<OverseasMaterial> overseasmaterial;

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
	protected OverseasItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryTutorialPackage.Literals.OVERSEAS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverseasMaterial> getOverseasmaterial() {
		if (overseasmaterial == null) {
			overseasmaterial = new EObjectContainmentEList<OverseasMaterial>(OverseasMaterial.class, this,
					FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL);
		}
		return overseasmaterial;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryTutorialPackage.OVERSEAS_ITEM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL:
			return ((InternalEList<?>) getOverseasmaterial()).basicRemove(otherEnd, msgs);
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
		case FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL:
			return getOverseasmaterial();
		case FactoryTutorialPackage.OVERSEAS_ITEM__NAME:
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
		case FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL:
			getOverseasmaterial().clear();
			getOverseasmaterial().addAll((Collection<? extends OverseasMaterial>) newValue);
			return;
		case FactoryTutorialPackage.OVERSEAS_ITEM__NAME:
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
		case FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL:
			getOverseasmaterial().clear();
			return;
		case FactoryTutorialPackage.OVERSEAS_ITEM__NAME:
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
		case FactoryTutorialPackage.OVERSEAS_ITEM__OVERSEASMATERIAL:
			return overseasmaterial != null && !overseasmaterial.isEmpty();
		case FactoryTutorialPackage.OVERSEAS_ITEM__NAME:
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

} //OverseasItemImpl
