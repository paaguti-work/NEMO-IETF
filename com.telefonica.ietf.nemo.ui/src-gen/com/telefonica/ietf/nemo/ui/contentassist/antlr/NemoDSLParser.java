/*
 * generated by Xtext
 */
package com.telefonica.ietf.nemo.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.telefonica.ietf.nemo.services.NemoDSLGrammarAccess;

public class NemoDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private NemoDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.telefonica.ietf.nemo.ui.contentassist.antlr.internal.InternalNemoDSLParser createParser() {
		com.telefonica.ietf.nemo.ui.contentassist.antlr.internal.InternalNemoDSLParser result = new com.telefonica.ietf.nemo.ui.contentassist.antlr.internal.InternalNemoDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getSpecAccess().getGroup(), "rule__Spec__Group__0");
					put(grammarAccess.getNodeModelAccess().getGroup(), "rule__NodeModel__Group__0");
					put(grammarAccess.getNodeModelAccess().getGroup_4(), "rule__NodeModel__Group_4__0");
					put(grammarAccess.getDefinePropertyAccess().getGroup(), "rule__DefineProperty__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getNemoFileAccess().getSpecssAssignment(), "rule__NemoFile__SpecssAssignment");
					put(grammarAccess.getNodeModelAccess().getNameAssignment_1(), "rule__NodeModel__NameAssignment_1");
					put(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_3(), "rule__NodeModel__PropertyDefinitionsAssignment_3");
					put(grammarAccess.getNodeModelAccess().getPropertyDefinitionsAssignment_4_1(), "rule__NodeModel__PropertyDefinitionsAssignment_4_1");
					put(grammarAccess.getDefinePropertyAccess().getPropertyTypeAssignment_0(), "rule__DefineProperty__PropertyTypeAssignment_0");
					put(grammarAccess.getDefinePropertyAccess().getNameAssignment_2(), "rule__DefineProperty__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.telefonica.ietf.nemo.ui.contentassist.antlr.internal.InternalNemoDSLParser typedParser = (com.telefonica.ietf.nemo.ui.contentassist.antlr.internal.InternalNemoDSLParser) parser;
			typedParser.entryRuleNemoFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NemoDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NemoDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
