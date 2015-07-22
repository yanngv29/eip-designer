/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.ConditionalRoute;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Router;
import com.github.lbroudoux.dsl.eip.RoutingType;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getToChannel <em>To Channel</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getOwnedRoutes <em>Owned Routes</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterImpl extends CDOObjectImpl implements Router {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RoutingType TYPE_EDEFAULT = RoutingType.HEADER_VALUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.ROUTER;
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
		return (String)eDynamicGet(EipPackage.ROUTER__NAME, EipPackage.Literals.ENDPOINT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.ROUTER__NAME, EipPackage.Literals.ENDPOINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getToChannel() {
		return (Channel)eDynamicGet(EipPackage.ROUTER__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetToChannel() {
		return (Channel)eDynamicGet(EipPackage.ROUTER__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToChannel(Channel newToChannel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToChannel, EipPackage.ROUTER__TO_CHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToChannel(Channel newToChannel) {
		eDynamicSet(EipPackage.ROUTER__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, newToChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getFromChannels() {
		return (EList<Channel>)eDynamicGet(EipPackage.ROUTER__FROM_CHANNELS, EipPackage.Literals.ENDPOINT__FROM_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConditionalRoute> getOwnedRoutes() {
		return (EList<ConditionalRoute>)eDynamicGet(EipPackage.ROUTER__OWNED_ROUTES, EipPackage.Literals.ROUTER__OWNED_ROUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingType getType() {
		return (RoutingType)eDynamicGet(EipPackage.ROUTER__TYPE, EipPackage.Literals.ROUTER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RoutingType newType) {
		eDynamicSet(EipPackage.ROUTER__TYPE, EipPackage.Literals.ROUTER__TYPE, newType);
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
			case EipPackage.ROUTER__TO_CHANNEL:
				Channel toChannel = basicGetToChannel();
				if (toChannel != null)
					msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
				return basicSetToChannel((Channel)otherEnd, msgs);
			case EipPackage.ROUTER__FROM_CHANNELS:
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
			case EipPackage.ROUTER__TO_CHANNEL:
				return basicSetToChannel(null, msgs);
			case EipPackage.ROUTER__FROM_CHANNELS:
				return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
			case EipPackage.ROUTER__OWNED_ROUTES:
				return ((InternalEList<?>)getOwnedRoutes()).basicRemove(otherEnd, msgs);
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
			case EipPackage.ROUTER__NAME:
				return getName();
			case EipPackage.ROUTER__TO_CHANNEL:
				if (resolve) return getToChannel();
				return basicGetToChannel();
			case EipPackage.ROUTER__FROM_CHANNELS:
				return getFromChannels();
			case EipPackage.ROUTER__OWNED_ROUTES:
				return getOwnedRoutes();
			case EipPackage.ROUTER__TYPE:
				return getType();
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
			case EipPackage.ROUTER__NAME:
				setName((String)newValue);
				return;
			case EipPackage.ROUTER__TO_CHANNEL:
				setToChannel((Channel)newValue);
				return;
			case EipPackage.ROUTER__FROM_CHANNELS:
				getFromChannels().clear();
				getFromChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case EipPackage.ROUTER__OWNED_ROUTES:
				getOwnedRoutes().clear();
				getOwnedRoutes().addAll((Collection<? extends ConditionalRoute>)newValue);
				return;
			case EipPackage.ROUTER__TYPE:
				setType((RoutingType)newValue);
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
			case EipPackage.ROUTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.ROUTER__TO_CHANNEL:
				setToChannel((Channel)null);
				return;
			case EipPackage.ROUTER__FROM_CHANNELS:
				getFromChannels().clear();
				return;
			case EipPackage.ROUTER__OWNED_ROUTES:
				getOwnedRoutes().clear();
				return;
			case EipPackage.ROUTER__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EipPackage.ROUTER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.ROUTER__TO_CHANNEL:
				return basicGetToChannel() != null;
			case EipPackage.ROUTER__FROM_CHANNELS:
				return !getFromChannels().isEmpty();
			case EipPackage.ROUTER__OWNED_ROUTES:
				return !getOwnedRoutes().isEmpty();
			case EipPackage.ROUTER__TYPE:
				return getType() != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RouterImpl
