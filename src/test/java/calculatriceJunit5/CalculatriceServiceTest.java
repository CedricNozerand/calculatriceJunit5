package calculatriceJunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import calculatriceJunit5.service.CalculatriceService;

public class CalculatriceServiceTest {

	private CalculatriceService calculatrice;
	
	@BeforeEach	
	public void setUp() {
		calculatrice = new CalculatriceService();
		System.out.println("initialisation");
	}
	
	@Test
	public void testAddition() {
		int resultat = calculatrice.addition(10, 5);
		assertEquals(resultat, 15);
		System.out.println("test de l'addition");
	}
	
	@Disabled
	@Test
	public void testAdditionDesactive() {
		int resultat = calculatrice.addition(30, 10);
		assertEquals(resultat, 3);
		System.out.println("test de l'addition désactivé");
	}
	
	@Test
	public void testDivisionPar0(){
		Assertions.assertThrows(ArithmeticException.class, () -> calculatrice.division(10, 0));
		System.out.println("test de la division");
	}
	
	@Test
	public void testDivision(){
		int resultat = calculatrice.division(10, 5);
		Assertions.assertTimeout(Duration.ofMillis(2), () -> assertEquals(resultat, 2));
		System.out.println("test de la division");
	}
	
	@AfterEach
	public void tearDown() {
		calculatrice = null;
		System.out.println("libération");
	}
}
