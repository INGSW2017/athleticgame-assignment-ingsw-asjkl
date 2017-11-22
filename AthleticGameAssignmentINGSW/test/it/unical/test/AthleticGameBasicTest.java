package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	private static AthleticGame game;
	
	@Before
	public void before(){
		System.out.println("ciao3");
	}
	
	@Test
	public void testTaglia(){
		System.out.println("ciao2");
		game.addArrival("Sapia", Instant.now());
		Assert.assertEquals(1,game.getArrivals().size());
	}
	
	@Test(expected=Exception.class)
	public void controlloPartecipante(){
		System.out.println("ciao1");
		game.addArrival("Giovanni", Instant.now());
		game.getParecipiantTime("Giovanni");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("ciao");
		game=new AthleticGame("Ciclismo");
	}
}

