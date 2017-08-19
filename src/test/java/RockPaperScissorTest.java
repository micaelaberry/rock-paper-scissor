

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorTest {
	
	RockPaperScissor rockPaperScissor;
	
	@Before
	public void setUp(){
	rockPaperScissor = new RockPaperScissor();
	}

	@Test
	public void whenRockBeatsScissors(){
		assertEquals(true, rockPaperScissor.rockBeatsScissor());
	}
	
	@Test
	public void whenPaperBeatsRock(){
		assertEquals(true, rockPaperScissor.paperBeatsRock());
	}
}
