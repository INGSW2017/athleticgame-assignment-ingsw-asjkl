package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	private static AthleticGame game;
	
	@Test
	public void testTaglia(){
		game.addArrival("Sapia", Instant.now());
		Assert.assertEquals(1,game.getArrivals().size());
	}
	
	@Test(expected=Exception.class)
	public void controlloPartecipante(){
		game.addArrival("Giovanni", Instant.now());
		game.getParecipiantTime("Giovanni");
	}
	
	@BeforeClass
	public static void beforeClass(){
		game=new AthleticGame("Ciclismo");
	}
}

