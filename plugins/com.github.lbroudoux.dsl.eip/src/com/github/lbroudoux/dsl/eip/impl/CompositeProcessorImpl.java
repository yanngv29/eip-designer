/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.CompositeProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.CompositeProcessorImpl#getToChannel <em>To Channel</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.CompositeProcessorImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.CompositeProcessorImpl#getOwnedEndpoints <em>Owned Endpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeProcessorImpl extends CDOObjectImpl implements CompositeProcessor {
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
	protected CompositeProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.COMPOSITE_PROCESSOR;
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
		return (String)eDynamicGet(EipPackage.COMPOSITE_PROCESSOR__NAME, EipPackage.Literals.ENDPOINT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.COMPOSITE_PROCESSOR__NAME, EipPackage.Literals.ENDPOINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getToChannel() {
		return (Channel)eDynamicGet(EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetToChannel() {
		return (Channel)eDynamicGet(EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToChannel(Channel newToChannel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToChannel, EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToChannel(Channel newToChannel) {
		eDynamicSet(EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, newToChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getFromChannels() {
		return (EList<Channel>)eDynamicGet(EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS, EipPackage.Literals.ENDPOINT__FROM_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Endpoint> getOwnedEndpoints() {
		return (EList<Endpoint>)eDynamicGet(EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS, EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS, true, true);
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
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				Channel toChannel = basicGetToChannel();
				if (toChannel != null)
					msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
				return basicSetToChannel((Channel)otherEnd, msgs);
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
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
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				return basicSetToChannel(null, msgs);
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
				return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				return ((InternalEList<?>)getOwnedEndpoints()).basicRemove(otherEnd, msgs);
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
			case EipPackage.COMPOSITE_PROCESSOR__NAME:
				return getName();
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				if (resolve) return getToChannel();
				return basicGetToChannel();
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
				return getFromChannels();
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				return getOwnedEndpoints();
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
			case EipPackage.COMPOSITE_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				setToChannel((Channel)newValue);
				return;
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
				getFromChannels().clear();
				getFromChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				getOwnedEndpoints().clear();
				getOwnedEndpoints().addAll((Collection<? extends Endpoint>)newValue);
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
			case EipPackage.COMPOSITE_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				setToChannel((Channel)null);
				return;
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
				getFromChannels().clear();
				return;
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				getOwnedEndpoints().clear();
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
			case EipPackage.COMPOSITE_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.COMPOSITE_PROCESSOR__TO_CHANNEL:
				return basicGetToChannel() != null;
			case EipPackage.COMPOSITE_PROCESSOR__FROM_CHANNELS:
				return !getFromChannels().isEmpty();
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				return !getOwnedEndpoints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeProcessorImpl
