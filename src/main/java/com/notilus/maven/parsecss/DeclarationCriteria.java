package com.notilus.maven.parsecss;

import com.helger.css.decl.CSSExpression;

/**
 * Classe représentant un critère de recherche pour la classe CSSVisitor
 * @author Alexandre PRAT
 * @date 25/10/2018
 */
public class DeclarationCriteria {
	/** Données **/
	private String propertyName;
	private String expressionValue;
	private String value;

	/**
	 * Accesseurs
	 */
	public String getPropertyName() { return propertyName; }
	public String getExpressionValue() { return expressionValue; }
	public void setPropertyName(String propertyName) { this.propertyName = propertyName; }
	public void setExpressionValue(String expressionValue) { this.expressionValue = expressionValue; }
	public void setValue(String value) { this.value = value; }
	
	/**
	 * Récupération de la valeur
	 */
	public CSSExpression getValue() { 
		CSSExpression value = new CSSExpression();
		
		//Définition du terme
		value.addTermSimple(this.value);
		
		return value;
	}

	/**
	 * Constructeur
	 */
	public DeclarationCriteria() {
		//Héritage
		super();
	}

	/**
	 * Constructeur par arguments
	 */
	public DeclarationCriteria(String propertyName,String expressionValue,String value) {
		//Héritage
		this();
		
		//Définition des propriétés
		setPropertyName(propertyName);
		setExpressionValue(expressionValue);
		
		//Définition de l'expression
		setValue(value); 
	}
	
	/**
	 * Récupération d'une description de l'objet
	 */
	public String toString() {
		//Formattage
		return "PropertyName " + (getPropertyName() != null ? getPropertyName() : "") + ", ExpressionValue " + (getExpressionValue() != null ? getExpressionValue() : "") + ", newValue " + (getValue() != null ? getValue() : "");
	}
}
