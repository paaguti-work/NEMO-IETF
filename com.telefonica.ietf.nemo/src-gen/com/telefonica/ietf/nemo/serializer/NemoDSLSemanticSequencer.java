/*
 * generated by Xtext
 */
package com.telefonica.ietf.nemo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.telefonica.ietf.nemo.nemoDSL.DefineProperty;
import com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage;
import com.telefonica.ietf.nemo.nemoDSL.NemoFile;
import com.telefonica.ietf.nemo.nemoDSL.NodeModel;
import com.telefonica.ietf.nemo.nemoDSL.Type;
import com.telefonica.ietf.nemo.services.NemoDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NemoDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NemoDSLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == NemoDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NemoDSLPackage.DEFINE_PROPERTY:
				sequence_DefineProperty(context, (DefineProperty) semanticObject); 
				return; 
			case NemoDSLPackage.NEMO_FILE:
				sequence_NemoFile(context, (NemoFile) semanticObject); 
				return; 
			case NemoDSLPackage.NODE_MODEL:
				sequence_NodeModel(context, (NodeModel) semanticObject); 
				return; 
			case NemoDSLPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (propertyType=Type name=ID)
	 */
	protected void sequence_DefineProperty(EObject context, DefineProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NemoDSLPackage.Literals.DEFINE_PROPERTY__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NemoDSLPackage.Literals.DEFINE_PROPERTY__PROPERTY_TYPE));
			if(transientValues.isValueTransient(semanticObject, NemoDSLPackage.Literals.DEFINE_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NemoDSLPackage.Literals.DEFINE_PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinePropertyAccess().getPropertyTypeTypeParserRuleCall_0_0(), semanticObject.getPropertyType());
		feeder.accept(grammarAccess.getDefinePropertyAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     specss+=Spec*
	 */
	protected void sequence_NemoFile(EObject context, NemoFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID propertyDefinitions+=DefineProperty propertyDefinitions+=DefineProperty*)
	 */
	protected void sequence_NodeModel(EObject context, NodeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Type}
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
