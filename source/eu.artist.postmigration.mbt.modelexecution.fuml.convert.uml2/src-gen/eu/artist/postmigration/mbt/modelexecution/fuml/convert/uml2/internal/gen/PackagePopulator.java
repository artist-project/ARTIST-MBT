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
public class PackagePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.Package) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.Package)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.Package fumlNamedElement = (fUML.Syntax.Classes.Kernel.Package) fumlElement;
		org.eclipse.uml2.uml.Package uml2NamedElement = (org.eclipse.uml2.uml.Package) uml2Element;
		
		
		for (org.eclipse.uml2.uml.PackageableElement value : uml2NamedElement.getPackagedElements()) {
					fumlNamedElement.packagedElement.add((fUML.Syntax.Classes.Kernel.PackageableElement) result.getFUMLElement(value));
		}
		
		
		for (org.eclipse.uml2.uml.Type value : uml2NamedElement.getOwnedTypes()) {
					fumlNamedElement.ownedType.add((fUML.Syntax.Classes.Kernel.Type) result.getFUMLElement(value));
		}
		
		
		for (org.eclipse.uml2.uml.Package value : uml2NamedElement.getNestedPackages()) {
					fumlNamedElement.nestedPackage.add((fUML.Syntax.Classes.Kernel.Package) result.getFUMLElement(value));
		}
		
		fumlNamedElement.nestingPackage = (fUML.Syntax.Classes.Kernel.Package) result
							.getFUMLElement(uml2NamedElement.getNestingPackage());
		
		
		
		
	}
	
}
