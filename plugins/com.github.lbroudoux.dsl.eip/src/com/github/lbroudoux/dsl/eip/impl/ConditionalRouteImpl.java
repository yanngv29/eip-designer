/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.ConditionalRoute;
import com.github.lbroudoux.dsl.eip.EipPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalRouteImpl extends CDOObjectImpl implements ConditionalRoute {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.CONDITIONAL_ROUTE;
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
	public String getCondition() {
		return (String)eDynamicGet(EipPackage.CONDITIONAL_ROUTE__CONDITION, EipPackage.Literals.CONDITIONAL_ROUTE__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		eDynamicSet(EipPackage.CONDITIONAL_ROUTE__CONDITION, EipPackage.Literals.CONDITIONAL_ROUTE__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannel() {
		return (Channel)eDynamicGet(EipPackage.CONDITIONAL_ROUTE__CHANNEL, EipPackage.Literals.CONDITIONAL_ROUTE__CHANNEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetChannel() {
		return (Channel)eDynamicGet(EipPackage.CONDITIONAL_ROUTE__CHANNEL, EipPackage.Literals.CONDITIONAL_ROUTE__CHANNEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(Channel newChannel) {
		eDynamicSet(EipPackage.CONDITIONAL_ROUTE__CHANNEL, EipPackage.Literals.CONDITIONAL_ROUTE__CHANNEL, newChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EipPackage.CONDITIONAL_ROUTE__CONDITION:
				return getCondition();
			case EipPackage.CONDITIONAL_ROUTE__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
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
			case EipPackage.CONDITIONAL_ROUTE__CONDITION:
				setCondition((String)newValue);
				return;
			case EipPackage.CONDITIONAL_ROUTE__CHANNEL:
				setChannel((Channel)newValue);
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
			case EipPackage.CONDITIONAL_ROUTE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case EipPackage.CONDITIONAL_ROUTE__CHANNEL:
				setChannel((Channel)null);
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
			case EipPackage.CONDITIONAL_ROUTE__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case EipPackage.CONDITIONAL_ROUTE__CHANNEL:
				return basicGetChannel() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalRouteImpl
