/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.InvocableEndpoint;
import com.github.lbroudoux.dsl.eip.ServiceInvocation;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocable Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.InvocableEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.InvocableEndpointImpl#getToChannel <em>To Channel</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.InvocableEndpointImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.InvocableEndpointImpl#getOwnedServiceInvocations <em>Owned Service Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocableEndpointImpl extends CDOObjectImpl implements InvocableEndpoint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocableEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.INVOCABLE_ENDPOINT;
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
	public String getName() {
		return (String)eDynamicGet(EipPackage.INVOCABLE_ENDPOINT__NAME, EipPackage.Literals.ENDPOINT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.INVOCABLE_ENDPOINT__NAME, EipPackage.Literals.ENDPOINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getToChannel() {
		return (Channel)eDynamicGet(EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetToChannel() {
		return (Channel)eDynamicGet(EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToChannel(Channel newToChannel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToChannel, EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToChannel(Channel newToChannel) {
		eDynamicSet(EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, newToChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getFromChannels() {
		return (EList<Channel>)eDynamicGet(EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS, EipPackage.Literals.ENDPOINT__FROM_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceInvocation> getOwnedServiceInvocations() {
		return (EList<ServiceInvocation>)eDynamicGet(EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS, EipPackage.Literals.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				Channel toChannel = basicGetToChannel();
				if (toChannel != null)
					msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
				return basicSetToChannel((Channel)otherEnd, msgs);
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromChannels()).basicAdd(otherEnd, msgs);
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
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				return basicSetToChannel(null, msgs);
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
			case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
				return ((InternalEList<?>)getOwnedServiceInvocations()).basicRemove(otherEnd, msgs);
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
			case EipPackage.INVOCABLE_ENDPOINT__NAME:
				return getName();
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				if (resolve) return getToChannel();
				return basicGetToChannel();
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				return getFromChannels();
			case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
				return getOwnedServiceInvocations();
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
			case EipPackage.INVOCABLE_ENDPOINT__NAME:
				setName((String)newValue);
				return;
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				setToChannel((Channel)newValue);
				return;
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				getFromChannels().clear();
				getFromChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
				getOwnedServiceInvocations().clear();
				getOwnedServiceInvocations().addAll((Collection<? extends ServiceInvocation>)newValue);
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
			case EipPackage.INVOCABLE_ENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				setToChannel((Channel)null);
				return;
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				getFromChannels().clear();
				return;
			case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
				getOwnedServiceInvocations().clear();
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
			case EipPackage.INVOCABLE_ENDPOINT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.INVOCABLE_ENDPOINT__TO_CHANNEL:
				return basicGetToChannel() != null;
			case EipPackage.INVOCABLE_ENDPOINT__FROM_CHANNELS:
				return !getFromChannels().isEmpty();
			case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
				return !getOwnedServiceInvocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvocableEndpointImpl
