/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Aggregator;
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.MessagePart;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getToChannel <em>To Channel</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getPart <em>Part</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatorImpl extends CDOObjectImpl implements Aggregator {
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
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
   protected static final MessagePart PART_EDEFAULT = MessagePart.HEADER;

   /**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
   protected static final String EXPRESSION_EDEFAULT = null;

   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.AGGREGATOR;
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
		return (String)eDynamicGet(EipPackage.AGGREGATOR__NAME, EipPackage.Literals.ENDPOINT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EipPackage.AGGREGATOR__NAME, EipPackage.Literals.ENDPOINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getToChannel() {
		return (Channel)eDynamicGet(EipPackage.AGGREGATOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetToChannel() {
		return (Channel)eDynamicGet(EipPackage.AGGREGATOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToChannel(Channel newToChannel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToChannel, EipPackage.AGGREGATOR__TO_CHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToChannel(Channel newToChannel) {
		eDynamicSet(EipPackage.AGGREGATOR__TO_CHANNEL, EipPackage.Literals.ENDPOINT__TO_CHANNEL, newToChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getFromChannels() {
		return (EList<Channel>)eDynamicGet(EipPackage.AGGREGATOR__FROM_CHANNELS, EipPackage.Literals.ENDPOINT__FROM_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public MessagePart getPart() {
		return (MessagePart)eDynamicGet(EipPackage.AGGREGATOR__PART, EipPackage.Literals.AGGREGATOR__PART, true, true);
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public void setPart(MessagePart newPart) {
		eDynamicSet(EipPackage.AGGREGATOR__PART, EipPackage.Literals.AGGREGATOR__PART, newPart);
	}

   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategy() {
		return (String)eDynamicGet(EipPackage.AGGREGATOR__STRATEGY, EipPackage.Literals.AGGREGATOR__STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(String newStrategy) {
		eDynamicSet(EipPackage.AGGREGATOR__STRATEGY, EipPackage.Literals.AGGREGATOR__STRATEGY, newStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public String getExpression() {
		return (String)eDynamicGet(EipPackage.AGGREGATOR__EXPRESSION, EipPackage.Literals.AGGREGATOR__EXPRESSION, true, true);
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public void setExpression(String newExpression) {
		eDynamicSet(EipPackage.AGGREGATOR__EXPRESSION, EipPackage.Literals.AGGREGATOR__EXPRESSION, newExpression);
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
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				Channel toChannel = basicGetToChannel();
				if (toChannel != null)
					msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
				return basicSetToChannel((Channel)otherEnd, msgs);
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
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
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				return basicSetToChannel(null, msgs);
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
				return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
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
			case EipPackage.AGGREGATOR__NAME:
				return getName();
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				if (resolve) return getToChannel();
				return basicGetToChannel();
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
				return getFromChannels();
			case EipPackage.AGGREGATOR__PART:
				return getPart();
			case EipPackage.AGGREGATOR__STRATEGY:
				return getStrategy();
			case EipPackage.AGGREGATOR__EXPRESSION:
				return getExpression();
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
			case EipPackage.AGGREGATOR__NAME:
				setName((String)newValue);
				return;
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				setToChannel((Channel)newValue);
				return;
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
				getFromChannels().clear();
				getFromChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case EipPackage.AGGREGATOR__PART:
				setPart((MessagePart)newValue);
				return;
			case EipPackage.AGGREGATOR__STRATEGY:
				setStrategy((String)newValue);
				return;
			case EipPackage.AGGREGATOR__EXPRESSION:
				setExpression((String)newValue);
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
			case EipPackage.AGGREGATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				setToChannel((Channel)null);
				return;
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
				getFromChannels().clear();
				return;
			case EipPackage.AGGREGATOR__PART:
				setPart(PART_EDEFAULT);
				return;
			case EipPackage.AGGREGATOR__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case EipPackage.AGGREGATOR__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case EipPackage.AGGREGATOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EipPackage.AGGREGATOR__TO_CHANNEL:
				return basicGetToChannel() != null;
			case EipPackage.AGGREGATOR__FROM_CHANNELS:
				return !getFromChannels().isEmpty();
			case EipPackage.AGGREGATOR__PART:
				return getPart() != PART_EDEFAULT;
			case EipPackage.AGGREGATOR__STRATEGY:
				return STRATEGY_EDEFAULT == null ? getStrategy() != null : !STRATEGY_EDEFAULT.equals(getStrategy());
			case EipPackage.AGGREGATOR__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
		}
		return super.eIsSet(featureID);
	}

} //AggregatorImpl
