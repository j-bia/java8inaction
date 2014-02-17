package org.jbia.referentiel.carte.insee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class InseeLoader {

	public static <T>  List<T> chargerDonnees(Reader reader, ILineMapper<T> mapper) {
		List<T> data = new ArrayList<T>();
		BufferedReader readerData = new BufferedReader(reader);
		
		// la première ligne contient les entetes de colonnes
		try {
			String line = readerData.readLine();
			if (line != null) {
				line = readerData.readLine();
			}
			while (line != null) {
				String [] tokens= line.split("\t");
				data.add(mapper.map(tokens));
				line = readerData.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
