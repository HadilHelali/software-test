package tp_test1.junit.monprojet.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import tp_test1.junit.monprojet.PorteMonnaie;
import tp_test1.junit.monprojet.SommeArgent;

public class PortMonnaieTest {

	@Test
	public void testAjouteSommeEtEquals() {
	    PorteMonnaie pm1 = new PorteMonnaie();
	    pm1.ajouteSomme(new SommeArgent(5, "EUR"));
	    pm1.ajouteSomme(new SommeArgent(10, "USD"));

	    PorteMonnaie pm2 = new PorteMonnaie();
	    pm2.ajouteSomme(new SommeArgent(10, "USD"));
	    pm2.ajouteSomme(new SommeArgent(5, "EUR"));

	    PorteMonnaie pm3 = new PorteMonnaie();
	    pm3.ajouteSomme(new SommeArgent(5, "EUR"));

	    assertEquals(pm1, pm2);
	    assertNotEquals(pm1, pm3);
	}

	
}
