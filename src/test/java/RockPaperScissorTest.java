

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RockPaperScissorTest {

	@Test
	public void whenRockBeatsScissors(){
		RockPaperScissor rockPaperScissor = new RockPaperScissor();
		assertEquals(true, rockPaperScissor.rockBeatsScissor());
	}
	
}
