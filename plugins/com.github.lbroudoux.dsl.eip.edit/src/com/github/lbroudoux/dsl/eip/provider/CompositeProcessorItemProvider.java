/**
 */
package com.github.lbroudoux.dsl.eip.provider;


import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.lbroudoux.dsl.eip.CompositeProcessor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeProcessorItemProvider 
	extends CDOItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcessorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addToChannelPropertyDescriptor(object);
			addFromChannelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Endpoint_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_name_feature", "_UI_Endpoint_type"),
				 EipPackage.Literals.ENDPOINT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Endpoint_toChannel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_toChannel_feature", "_UI_Endpoint_type"),
				 EipPackage.Literals.ENDPOINT__TO_CHANNEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Endpoint_fromChannels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_fromChannels_feature", "_UI_Endpoint_type"),
				 EipPackage.Literals.ENDPOINT__FROM_CHANNELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeProcessor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeProcessor"));
	}

	/**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   @Override
   protected boolean shouldComposeCreationImage() {
		return true;
	}

   /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeProcessor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeProcessor_type") :
			getString("_UI_CompositeProcessor_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeProcessor.class)) {
			case EipPackage.COMPOSITE_PROCESSOR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EipPackage.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createRouter()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createTransformer()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createGateway()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createAggregator()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createInvocableEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createServiceActivator()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createEnricher()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createCompositeProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createRecipientListRouter()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createContentFilter()));

		newChildDescriptors.add
			(createChildParameter
				(EipPackage.Literals.COMPOSITE_PROCESSOR__OWNED_ENDPOINTS,
				 EipFactory.eINSTANCE.createResequencer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EipEditPlugin.INSTANCE;
	}

}
