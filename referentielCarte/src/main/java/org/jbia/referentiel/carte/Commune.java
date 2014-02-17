package org.jbia.referentiel.carte;

public class Commune {

	/**
	 * Code actualité de la commune
	 * 1 commune actuelle 
	 * 2 commune "associée" 
	 * 3 commune périmée 
	 * 4 ancien code dû à un changement de département 
	 * 5 arrondissement municipal 
	 * 6 fraction cantonale 
	 */
	private String codeActualite;
	
	
	/** 
	 *
	 * Chef-lieu de canton, d'arrondissement, de département, de région
	 *
	 * Code chef-lieu
	 *
	 * 0 commune non chef-lieu 
	 * 1 commune chef-lieu de canton 
	 * 2 commune chef-lieu d'arrondissement 
	 * 3 commune chef-lieu de département 
	 * 4 commune chef-lieu de région 
     */
	private String chefLieu;
	
	/**
	 * Découpage de la commune en cantons<br/>
	 * 0 commune non découpée en cantons <br/>
	 * 1 fraction cantonale <br/>
     * 2 canton non précisé <br/>
     *
	 */
	private String cdc;
	
	/**
	 * Nombre de fractions cantonales + 1 de la commune lorsqu'elle est multicantonale
	 */
	private String rang;
	
	
	/**
	 * REG Code région
	 */
	private String codeRegion;
	
	/**
	 * DEP Code département 
	 */
	private String codeDepartement;

	/**
	 * COM Code commune 
	 */
	private String codeCommune;
	
	/**
	 * AR Code arrondissement 
	 */
	private String codeArrondissement;
	
	/**
	 * CT Code canton 
	 */
	private String codeCanton;
	
	/**
	 * MODIF Indicateur de modification subie par la commune 
	 * <ul>
	 * <li>0 = commune non touchée par un événement
     * <li>1 = commune touchée par un événement
	 * </ul>
	 */
	private Boolean modification;
	
	/**
	 * POLE Code de la commune pôle de la commune fusionnée<br/>
	 * Code de la commune à laquelle s'est fusionnée la commune associée (ACTUAL = '2') ou la commune périmée (ACTUAL = '3'), ou nouveau code de la commune suite à son transfert de département, y compris la Corse et l'Île-de-France (ACTUAL ='4'). <br/>
     * Pour les arrondissements municipaux (ACTUAL = '5'), la variable POLE prend pour valeur le code de la commune auquel appartient l'arrondissement.<br/>
     * Pour les autres valeurs de la variable ACTUAL, la variable POLE n'est pas renseignée.<br/>
     * Le code de la commune pôle est renseigné sur 5 positions, les deux premiers caractérisant le département, les trois derniers donnant un numéro d'ordre dans le département.
	 */
	private String codePole;
	
	/**
	 *TNCC Type de nom en clair 
	 *<ul>
	 *<li>0 pas d'article et le nom commence par une consonne sauf H muet. charnière = DE 
	*<li>1 pas d'article et le nom commence par une voyelle ou un H muet. charnière = D' 
	*<li>2 article = LE charnière = DU 
	*<li>3 article = LA charnière = DE LA 
	*<li>4 article = LES charnière = DES 
	*<li>5 article = L' charnière = DE L' 
	*<li>6 article = AUX charnière = DES 
	*<li>7 article = LAS charnière = DE LAS 
	*<li>8 article = LOS charnière = DE LOS 
	*</ul>
	 */
	private String typeNom;
	
	/**
	 *  ARTMAJ Article (majuscules) 
	 */
	private String articleMaj;
	
	
	/**
	 *NCC Nom en clair (majuscules) 
	 */
	private String libelleMaj;
	
	
	/**
	 * ARTMIN Article (typographie riche)
	 */ 
	private String articleMin;
	
	
	/**
	 * NCCENR Nom en clair (typographie riche)
	 */ 
	private String libelle;

	
	/**
	 * ARTICLCT Article (canton)
	 */
	private String articleCanton;
	
	/**
	 * NCCCT Nom en clair du canton (typographie riche) 
	 */
	private String nomCanton;
	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the codeActualite
	 */
	public String getCodeActualite() {
		return codeActualite;
	}

	/**
	 * @param codeActualite the codeActualite to set
	 */
	public void setCodeActualite(String codeActualite) {
		this.codeActualite = codeActualite;
	}

	/**
	 * @return the chefLieu
	 */
	public String getChefLieu() {
		return chefLieu;
	}

	/**
	 * @param chefLieu the chefLieu to set
	 */
	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}

	/**
	 * @return the cdc
	 */
	public String getCdc() {
		return cdc;
	}

	/**
	 * @param cdc the cdc to set
	 */
	public void setCdc(String cdc) {
		this.cdc = cdc;
	}

	/**
	 * @return the rang
	 */
	public String getRang() {
		return rang;
	}

	/**
	 * @param rang the rang to set
	 */
	public void setRang(String rang) {
		this.rang = rang;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * @return the codeArrondissement
	 */
	public String getCodeArrondissement() {
		return codeArrondissement;
	}

	/**
	 * @param codeArrondissement the codeArrondissement to set
	 */
	public void setCodeArrondissement(String codeArrondissement) {
		this.codeArrondissement = codeArrondissement;
	}

	/**
	 * @return the typeNom
	 */
	public String getTypeNom() {
		return typeNom;
	}

	/**
	 * @param typeNom the typeNom to set
	 */
	public void setTypeNom(String typeNom) {
		this.typeNom = typeNom;
	}

	/**
	 * @return the articleMaj
	 */
	public String getArticleMaj() {
		return articleMaj;
	}

	/**
	 * @param articleMaj the articleMaj to set
	 */
	public void setArticleMaj(String articleMaj) {
		this.articleMaj = articleMaj;
	}

	/**
	 * @return the libelleMaj
	 */
	public String getLibelleMaj() {
		return libelleMaj;
	}

	/**
	 * @param libelleMaj the libelleMaj to set
	 */
	public void setLibelleMaj(String libelleMaj) {
		this.libelleMaj = libelleMaj;
	}

	/**
	 * @return the articleMin
	 */
	public String getArticleMin() {
		return articleMin;
	}

	/**
	 * @param articleMin the articleMin to set
	 */
	public void setArticleMin(String articleMin) {
		this.articleMin = articleMin;
	}

	/**
	 * @return the articleCanton
	 */
	public String getArticleCanton() {
		return articleCanton;
	}

	/**
	 * @param articleCanton the articleCanton to set
	 */
	public void setArticleCanton(String articleCanton) {
		this.articleCanton = articleCanton;
	}

	/**
	 * @return the nomCanton
	 */
	public String getNomCanton() {
		return nomCanton;
	}

	/**
	 * @param nomCanton the nomCanton to set
	 */
	public void setNomCanton(String nomCanton) {
		this.nomCanton = nomCanton;
	}

	/**
	 * @return the codeCanton
	 */
	public String getCodeCanton() {
		return codeCanton;
	}

	/**
	 * @param codeCanton the codeCanton to set
	 */
	public void setCodeCanton(String codeCanton) {
		this.codeCanton = codeCanton;
	}

	/**
	 * @return the modification
	 */
	public Boolean getModification() {
		return modification;
	}

	/**
	 * @param modification the modification to set
	 */
	public void setModification(Boolean modification) {
		this.modification = modification;
	}

	/**
	 * @return the codePole
	 */
	public String getCodePole() {
		return codePole;
	}

	/**
	 * @param codePole the codePole to set
	 */
	public void setCodePole(String codePole) {
		this.codePole = codePole;
	}
	
	
}
