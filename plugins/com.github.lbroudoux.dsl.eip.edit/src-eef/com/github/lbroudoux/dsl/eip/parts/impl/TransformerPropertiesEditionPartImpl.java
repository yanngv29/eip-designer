/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class TransformerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TransformerPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer toChannel;
	protected ReferencesTable fromChannels;
	protected List<ViewerFilter> fromChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fromChannelsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TransformerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence transformerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = transformerStep.addStep(EipViewsRepository.Transformer.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Transformer.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Transformer.Properties.toChannel);
		propertiesStep.addStep(EipViewsRepository.Transformer.Properties.fromChannels);
		
		
		composer = new PartComposer(transformerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Transformer.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.Transformer.Properties.name) {
					return createNameText(parent);
				}
				if (key == EipViewsRepository.Transformer.Properties.toChannel) {
					return createToChannelFlatComboViewer(parent);
				}
				if (key == EipViewsRepository.Transformer.Properties.fromChannels) {
					return createFromChannelsAdvancedReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EipMessages.TransformerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EipViewsRepository.Transformer.Properties.name, EipMessages.TransformerPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EipViewsRepository.Transformer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Transformer.Properties.name, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToChannelFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.Transformer.Properties.toChannel, EipMessages.TransformerPropertiesEditionPart_ToChannelLabel);
		toChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Transformer.Properties.toChannel, EipViewsRepository.SWT_KIND));
		toChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		toChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.toChannel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getToChannel()));
			}

		});
		GridData toChannelData = new GridData(GridData.FILL_HORIZONTAL);
		toChannel.setLayoutData(toChannelData);
		toChannel.setID(EipViewsRepository.Transformer.Properties.toChannel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Transformer.Properties.toChannel, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createToChannelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFromChannelsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(EipViewsRepository.Transformer.Properties.fromChannels, EipMessages.TransformerPropertiesEditionPart_FromChannelsLabel);		 
		this.fromChannels = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFromChannels(); }
			public void handleEdit(EObject element) { editFromChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Transformer.Properties.fromChannels, EipViewsRepository.SWT_KIND));
		this.fromChannels.createControls(parent);
		this.fromChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.fromChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		fromChannelsData.horizontalSpan = 3;
		this.fromChannels.setLayoutData(fromChannelsData);
		this.fromChannels.disableMove();
		fromChannels.setID(EipViewsRepository.Transformer.Properties.fromChannels);
		fromChannels.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFromChannels() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(fromChannels.getInput(), fromChannelsFilters, fromChannelsBusinessFilters,
		"fromChannels", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.fromChannels,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				fromChannels.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFromChannels(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransformerPropertiesEditionPartImpl.this, EipViewsRepository.Transformer.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void editFromChannels(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				fromChannels.refresh();
			}
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Transformer.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Transformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#getToChannel()
	 * 
	 */
	public EObject getToChannel() {
		if (toChannel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) toChannel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#initToChannel(EObjectFlatComboSettings)
	 */
	public void initToChannel(EObjectFlatComboSettings settings) {
		toChannel.setInput(settings);
		if (current != null) {
			toChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Transformer.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.Transformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#setToChannel(EObject newValue)
	 * 
	 */
	public void setToChannel(EObject newValue) {
		if (newValue != null) {
			toChannel.setSelection(new StructuredSelection(newValue));
		} else {
			toChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Transformer.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.Transformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#setToChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToChannelButtonMode(ButtonsModeEnum newValue) {
		toChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#addFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToChannel(ViewerFilter filter) {
		toChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#addBusinessFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToChannel(ViewerFilter filter) {
		toChannel.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#initFromChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromChannels.setContentProvider(contentProvider);
		fromChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Transformer.Properties.fromChannels);
		if (eefElementEditorReadOnlyState && fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(false);
			fromChannels.setToolTipText(EipMessages.Transformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#updateFromChannels()
	 * 
	 */
	public void updateFromChannels() {
	fromChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#addFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter) {
		fromChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#addBusinessFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter) {
		fromChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.TransformerPropertiesEditionPart#isContainedInFromChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element) {
		return ((ReferencesTableSettings)fromChannels.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Transformer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
