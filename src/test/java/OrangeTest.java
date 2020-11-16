import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrangeTest {

@Test
public void testPanierIsEquals() throws Exception {
Orange orange = new Orange(0.2,"France");
Orange orange2 = new Orange(0.5,"Espagne");
Panier panier = new Panier();
Panier panier2 = new Panier();
panier.ajoute(orange);
panier.ajoute(orange2);
panier2.ajoute(orange);
panier2.ajoute(orange2);

assertEquals(true,panier.equals(panier2));
}

@Test
public void testPanierIsNotEquals() throws Exception {
Orange orange = new Orange(0.2,"France");
Orange orange2 = new Orange(0.5,"Espagne");
Panier panier = new Panier();
Panier panier2 = new Panier();
panier.ajoute(orange);
panier.ajoute(orange2);
panier2.ajoute(orange);

assertEquals(false,panier.equals(panier2));
}

@Test
public void testOrangeIsEquals() throws Exception {
Orange orange = new Orange(0.2,"France");
Orange orange2 = new Orange(0.2,"France");

assertEquals(true,orange.equals(orange2));
}

@Test
public void testOrangeIsNotEquals() throws Exception {
Orange orange = new Orange(0.2,"France");
Orange orange2 = new Orange(0.5,"Espagne");

assertEquals(false,orange.equals(orange2));
}

}