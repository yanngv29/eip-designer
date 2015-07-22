/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getToEndpoint <em>To Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getFromEndpoint <em>From Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#isGuaranteed <em>Guaranteed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends CDOObjectImpl implements Channel {
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
	 * The default value of the '{@link #isGuaranteed() <em>Guaranteed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuaranteed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUARANTEED_EDEFAULT = false;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getToEndpoint() {
		return (Endpoint)eDynamicGet(EipPackage.CHANNEL__TO_ENDPOINT, EipPackage.Literals.CHANNEL__TO_ENDPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetToEndpoint() {
		return (Endpoint)eDynamicGet(EipPackage.CHANNEL__TO_ENDPOINT, EipPackage.Literals.CHANNEL__TO_ENDPOINT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToEndpoint(Endpoint newToEndpoint, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToEndpoint, EipPackage.CHANNEL__TO_ENDPOINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEndpoint(Endpoint newToEndpoint) {
		eDynamicSet(EipPackage.CHANNEL__TO_ENDPOINT, EipPackage.Literals.CHANNEL__TO_ENDPOINT, newToEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getFromEndpoint() {
		return (Endpoint)eDynamicGet(EipPackage.CHANNEL__FROM_ENDPOINT, EipPackage.Literals.CHANNEL__FROM_ENDPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetFromEndpoint() {
		return (Endpoint)eDynamicGet(EipPackage.CHANNEL__FROM_ENDPOINT, EipPackage.Literals.CHANNEL__FROM_ENDPOINT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromEndpoint(Endpoint newFromEndpoint, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFromEndpoint, EipPackage.CHANNEL__FROM_ENDPOINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromEndpoint(Endpoint newFromEndpoint) {
		eDynamicSet(EipPackage.CHANNEL__FROM_ENDPOINT, EipPackage.Literals.CHANNEL__FROM_ENDPOINT, newFromEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EipPackage.CHANNEL__NAME, EipPackage.Literals.CHANNEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.CHANNEL__NAME, EipPackage.Literals.CHANNEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGuaranteed() {
		return (Boolean)eDynamicGet(EipPackage.CHANNEL__GUARANTEED, EipPackage.Literals.CHANNEL__GUARANTEED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuaranteed(boolean newGuaranteed) {
		eDynamicSet(EipPackage.CHANNEL__GUARANTEED, EipPackage.Literals.CHANNEL__GUARANTEED, newGuaranteed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EipPackage.CHANNEL__TO_ENDPOINT:
				Endpoint toEndpoint = basicGetToEndpoint();
				if (toEndpoint != null)
					msgs = ((InternalEObject)toEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__FROM_CHANNELS, Endpoint.class, msgs);
				return basicSetToEndpoint((Endpoint)otherEnd, msgs);
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				Endpoint fromEndpoint = basicGetFromEndpoint();
				if (fromEndpoint != null)
					msgs = ((InternalEObject)fromEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__TO_CHANNEL, Endpoint.class, msgs);
				return basicSetFromEndpoint((Endpoint)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EipPackage.CHANNEL__TO_ENDPOINT:
				return basicSetToEndpoint(null, msgs);
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				return basicSetFromEndpoint(null, msgs);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				if (resolve) return getToEndpoint();
				return basicGetToEndpoint();
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				if (resolve) return getFromEndpoint();
				return basicGetFromEndpoint();
			case EipPackage.CHANNEL__NAME:
				return getName();
			case EipPackage.CHANNEL__GUARANTEED:
				return isGuaranteed();
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				setToEndpoint((Endpoint)newValue);
				return;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				setFromEndpoint((Endpoint)newValue);
				return;
			case EipPackage.CHANNEL__NAME:
				setName((String)newValue);
				return;
			case EipPackage.CHANNEL__GUARANTEED:
				setGuaranteed((Boolean)newValue);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				setToEndpoint((Endpoint)null);
				return;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				setFromEndpoint((Endpoint)null);
				return;
			case EipPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.CHANNEL__GUARANTEED:
				setGuaranteed(GUARANTEED_EDEFAULT);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				return basicGetToEndpoint() != null;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				return basicGetFromEndpoint() != null;
			case EipPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.CHANNEL__GUARANTEED:
				return isGuaranteed() != GUARANTEED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl
