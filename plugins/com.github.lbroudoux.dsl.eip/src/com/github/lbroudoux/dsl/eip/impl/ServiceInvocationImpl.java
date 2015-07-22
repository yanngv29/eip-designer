/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.ServiceInvocation;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ServiceInvocationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ServiceInvocationImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ServiceInvocationImpl#getServiceRef <em>Service Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInvocationImpl extends CDOObjectImpl implements ServiceInvocation {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.SERVICE_INVOCATION;
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
	public String getContext() {
		return (String)eDynamicGet(EipPackage.SERVICE_INVOCATION__CONTEXT, EipPackage.Literals.SERVICE_INVOCATION__CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		eDynamicSet(EipPackage.SERVICE_INVOCATION__CONTEXT, EipPackage.Literals.SERVICE_INVOCATION__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return (String)eDynamicGet(EipPackage.SERVICE_INVOCATION__OPERATION_NAME, EipPackage.Literals.SERVICE_INVOCATION__OPERATION_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		eDynamicSet(EipPackage.SERVICE_INVOCATION__OPERATION_NAME, EipPackage.Literals.SERVICE_INVOCATION__OPERATION_NAME, newOperationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRef getServiceRef() {
		return (ServiceRef)eDynamicGet(EipPackage.SERVICE_INVOCATION__SERVICE_REF, EipPackage.Literals.SERVICE_INVOCATION__SERVICE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRef basicGetServiceRef() {
		return (ServiceRef)eDynamicGet(EipPackage.SERVICE_INVOCATION__SERVICE_REF, EipPackage.Literals.SERVICE_INVOCATION__SERVICE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRef(ServiceRef newServiceRef) {
		eDynamicSet(EipPackage.SERVICE_INVOCATION__SERVICE_REF, EipPackage.Literals.SERVICE_INVOCATION__SERVICE_REF, newServiceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EipPackage.SERVICE_INVOCATION__CONTEXT:
				return getContext();
			case EipPackage.SERVICE_INVOCATION__OPERATION_NAME:
				return getOperationName();
			case EipPackage.SERVICE_INVOCATION__SERVICE_REF:
				if (resolve) return getServiceRef();
				return basicGetServiceRef();
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
			case EipPackage.SERVICE_INVOCATION__CONTEXT:
				setContext((String)newValue);
				return;
			case EipPackage.SERVICE_INVOCATION__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case EipPackage.SERVICE_INVOCATION__SERVICE_REF:
				setServiceRef((ServiceRef)newValue);
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
			case EipPackage.SERVICE_INVOCATION__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case EipPackage.SERVICE_INVOCATION__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case EipPackage.SERVICE_INVOCATION__SERVICE_REF:
				setServiceRef((ServiceRef)null);
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
			case EipPackage.SERVICE_INVOCATION__CONTEXT:
				return CONTEXT_EDEFAULT == null ? getContext() != null : !CONTEXT_EDEFAULT.equals(getContext());
			case EipPackage.SERVICE_INVOCATION__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? getOperationName() != null : !OPERATION_NAME_EDEFAULT.equals(getOperationName());
			case EipPackage.SERVICE_INVOCATION__SERVICE_REF:
				return basicGetServiceRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceInvocationImpl
