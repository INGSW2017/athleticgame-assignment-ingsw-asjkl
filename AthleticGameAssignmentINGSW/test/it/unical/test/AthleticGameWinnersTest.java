package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame game;
	
	@After
	public void after(){
		game.reset();
	}
	
	@Before
	public void before(){
		game.start();
	}
	
	@Test
	public void test1Winner(){
		game.addArrival("Ciccio", Instant.now().plusMillis(1000));
		game.addArrival("Ciccio1", Instant.now().plusMillis(1000));
		game.addArrival("Ciccio2", Instant.now().plusMillis(2000));
		game.addArrival("Ciccio3", Instant.now().plusMillis(3000));
		game.addArrival("Ciccio4", Instant.now().plusMillis(4000));
		game.addArrival("Ciccio5", Instant.now().plusMillis(3000));
		Assert.assertEquals("Ciccio1", game.getWinner());
	}
	
	@BeforeClass
	public static void beforeClass(){
		game=new AthleticGame("Ciclismo");
	}
}
