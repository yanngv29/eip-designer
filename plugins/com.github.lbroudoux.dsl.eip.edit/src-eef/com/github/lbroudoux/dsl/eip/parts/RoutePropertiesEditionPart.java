/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface RoutePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the ownedServiceRefs
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedServiceRefs(ReferencesTableSettings settings);

	/**
	 * Update the ownedServiceRefs
	 * @param newValue the ownedServiceRefs to update
	 * 
	 */
	public void updateOwnedServiceRefs();

	/**
	 * Adds the given filter to the ownedServiceRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedServiceRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedServiceRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedServiceRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedServiceRefs table
	 * 
	 */
	public boolean isContainedInOwnedServiceRefsTable(EObject element);


	/**
	 * @return the exchangeType
	 * 
	 */
	public Enumerator getExchangeType();

	/**
	 * Init the exchangeType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initExchangeType(Object input, Enumerator current);

	/**
	 * Defines a new exchangeType
	 * @param newValue the new exchangeType to set
	 * 
	 */
	public void setExchangeType(Enumerator newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
