package org.jbia.referentiel.carte;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jbia.referentiel.carte.insee.CommunMapper;
import org.jbia.referentiel.carte.insee.ILineMapper;
import org.jbia.referentiel.carte.insee.InseeLoader;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Reader readerCommunes = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("france2013.txt"));		
		try {
			ILineMapper<Commune> communeMapper = new CommunMapper();
			List<Commune> communes = InseeLoader.chargerDonnees(readerCommunes, communeMapper);
			assertTrue(communes.size() > 40_000);
			readerCommunes.close();
		} catch (IOException e) {
			fail(e.getMessage());
		}
    }
}
