import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook grade1;
	private GradeBook grade2;
	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		grade1.addScore(90);
		grade1.addScore(80);
		grade2.addScore(70);
		grade2.addScore(95);
		grade2.addScore(100);
	
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
		
		
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("90.0 80.0 "));
		assertTrue(grade2.toString().equals("70.0 95.0 100.0 "));
		
		assertEquals(grade1.getScoreSize(), 2);
		assertEquals(grade2.getScoreSize(), 3);
		
	}

	@Test
	void testSum() {
		assertEquals(grade1.sum(), 170);
		assertEquals(grade2.sum(), 265);
		
		
	}

	@Test
	void testMinimum() {
		assertEquals(grade1.minimum(), 80);
		assertEquals(grade2.minimum(), 70);
	
	}

	@Test
	void testFinalScore() {
		assertEquals(grade1.finalScore(), 90);
		assertEquals(grade2.finalScore(), 195);
		
	}

	@Test
	void testGetScoreSize() {
		assertEquals(grade1.getScoreSize(), 2);
		assertEquals(grade2.getScoreSize(), 3);
		
	}

	@Test
	void testToString() {
		assertTrue(grade1.toString().equals("90.0 80.0 "));
		assertTrue(grade2.toString().equals("70.0 95.0 100.0 "));
	}

}
