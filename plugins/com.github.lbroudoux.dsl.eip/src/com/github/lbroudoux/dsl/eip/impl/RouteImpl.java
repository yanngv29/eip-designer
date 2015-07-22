/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.ExchangeType;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedEndpoints <em>Owned Endpoints</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedChannels <em>Owned Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedServiceRefs <em>Owned Service Refs</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getExchangeType <em>Exchange Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends CDOObjectImpl implements Route {
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
	 * The default value of the '{@link #getExchangeType() <em>Exchange Type</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getExchangeType()
	 * @generated
	 * @ordered
	 */
   protected static final ExchangeType EXCHANGE_TYPE_EDEFAULT = ExchangeType.IN_ONLY;

   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.ROUTE;
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
	@SuppressWarnings("unchecked")
	public EList<Endpoint> getOwnedEndpoints() {
		return (EList<Endpoint>)eDynamicGet(EipPackage.ROUTE__OWNED_ENDPOINTS, EipPackage.Literals.ROUTE__OWNED_ENDPOINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getOwnedChannels() {
		return (EList<Channel>)eDynamicGet(EipPackage.ROUTE__OWNED_CHANNELS, EipPackage.Literals.ROUTE__OWNED_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EipPackage.ROUTE__NAME, EipPackage.Literals.ROUTE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.ROUTE__NAME, EipPackage.Literals.ROUTE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceRef> getOwnedServiceRefs() {
		return (EList<ServiceRef>)eDynamicGet(EipPackage.ROUTE__OWNED_SERVICE_REFS, EipPackage.Literals.ROUTE__OWNED_SERVICE_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public ExchangeType getExchangeType() {
		return (ExchangeType)eDynamicGet(EipPackage.ROUTE__EXCHANGE_TYPE, EipPackage.Literals.ROUTE__EXCHANGE_TYPE, true, true);
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public void setExchangeType(ExchangeType newExchangeType) {
		eDynamicSet(EipPackage.ROUTE__EXCHANGE_TYPE, EipPackage.Literals.ROUTE__EXCHANGE_TYPE, newExchangeType);
	}

   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EipPackage.ROUTE__OWNED_ENDPOINTS:
				return ((InternalEList<?>)getOwnedEndpoints()).basicRemove(otherEnd, msgs);
			case EipPackage.ROUTE__OWNED_CHANNELS:
				return ((InternalEList<?>)getOwnedChannels()).basicRemove(otherEnd, msgs);
			case EipPackage.ROUTE__OWNED_SERVICE_REFS:
				return ((InternalEList<?>)getOwnedServiceRefs()).basicRemove(otherEnd, msgs);
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
			case EipPackage.ROUTE__OWNED_ENDPOINTS:
				return getOwnedEndpoints();
			case EipPackage.ROUTE__OWNED_CHANNELS:
				return getOwnedChannels();
			case EipPackage.ROUTE__NAME:
				return getName();
			case EipPackage.ROUTE__OWNED_SERVICE_REFS:
				return getOwnedServiceRefs();
			case EipPackage.ROUTE__EXCHANGE_TYPE:
				return getExchangeType();
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
			case EipPackage.ROUTE__OWNED_ENDPOINTS:
				getOwnedEndpoints().clear();
				getOwnedEndpoints().addAll((Collection<? extends Endpoint>)newValue);
				return;
			case EipPackage.ROUTE__OWNED_CHANNELS:
				getOwnedChannels().clear();
				getOwnedChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case EipPackage.ROUTE__NAME:
				setName((String)newValue);
				return;
			case EipPackage.ROUTE__OWNED_SERVICE_REFS:
				getOwnedServiceRefs().clear();
				getOwnedServiceRefs().addAll((Collection<? extends ServiceRef>)newValue);
				return;
			case EipPackage.ROUTE__EXCHANGE_TYPE:
				setExchangeType((ExchangeType)newValue);
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
			case EipPackage.ROUTE__OWNED_ENDPOINTS:
				getOwnedEndpoints().clear();
				return;
			case EipPackage.ROUTE__OWNED_CHANNELS:
				getOwnedChannels().clear();
				return;
			case EipPackage.ROUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.ROUTE__OWNED_SERVICE_REFS:
				getOwnedServiceRefs().clear();
				return;
			case EipPackage.ROUTE__EXCHANGE_TYPE:
				setExchangeType(EXCHANGE_TYPE_EDEFAULT);
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
			case EipPackage.ROUTE__OWNED_ENDPOINTS:
				return !getOwnedEndpoints().isEmpty();
			case EipPackage.ROUTE__OWNED_CHANNELS:
				return !getOwnedChannels().isEmpty();
			case EipPackage.ROUTE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.ROUTE__OWNED_SERVICE_REFS:
				return !getOwnedServiceRefs().isEmpty();
			case EipPackage.ROUTE__EXCHANGE_TYPE:
				return getExchangeType() != EXCHANGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RouteImpl
