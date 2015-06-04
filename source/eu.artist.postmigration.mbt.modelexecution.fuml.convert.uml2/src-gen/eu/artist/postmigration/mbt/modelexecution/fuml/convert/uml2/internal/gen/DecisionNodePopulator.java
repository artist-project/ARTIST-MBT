/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

import eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class DecisionNodePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.DecisionNode) ||
			!(fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.DecisionNode)) {
			return;
		}
		
		fUML.Syntax.Activities.IntermediateActivities.DecisionNode fumlNamedElement = (fUML.Syntax.Activities.IntermediateActivities.DecisionNode) fumlElement;
		org.eclipse.uml2.uml.DecisionNode uml2NamedElement = (org.eclipse.uml2.uml.DecisionNode) uml2Element;
		
		fumlNamedElement.decisionInput = (fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior) result
							.getFUMLElement(uml2NamedElement.getDecisionInput());
		fumlNamedElement.decisionInputFlow = (fUML.Syntax.Activities.IntermediateActivities.ObjectFlow) result
							.getFUMLElement(uml2NamedElement.getDecisionInputFlow());
		
		
		
		
	}
	
}
