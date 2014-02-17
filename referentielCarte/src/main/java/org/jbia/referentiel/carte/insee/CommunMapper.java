package org.jbia.referentiel.carte.insee;

import org.jbia.referentiel.carte.Commune;

public class CommunMapper implements ILineMapper<Commune> {

	@Override
	public Commune map(String[] token) {
		Commune commune = new Commune();

		commune.setCodeActualite(token[0]);
		commune.setChefLieu(token[1]);
		commune.setCdc(token[2]);
		commune.setRang(token[3]);
		commune.setCodeRegion(token[4]);
		commune.setCodeDepartement(token[5]);
		commune.setCodeCommune(token[6]);
		commune.setCodeArrondissement(token[7]);
		commune.setCodeCanton(token[8]);
		commune.setModification(toBoolean(token[9]));
		commune.setCodePole(token[10]);
		commune.setTypeNom(token[11]);
		commune.setArticleMaj(token[12]);
		commune.setLibelleMaj(token[13]);
		commune.setArticleMin(token[14]);
		commune.setLibelle(token[15]);
		if (token.length > 16) {
			commune.setArticleCanton(token[16]);
			commune.setNomCanton(token[17]);
		}
		return commune;
	}

	private Boolean toBoolean(String string) {
		if ("0".equals(string)) {
			return Boolean.FALSE;
		} else if ("1".equals(string)) {
			return Boolean.TRUE;
		}
		return null;
	}

}
