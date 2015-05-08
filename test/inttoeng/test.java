package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void 0‚ð“ü—Í() {
		IntToEng1 ite1 = new IntToEng1();
		String expected = "zero";
		String actual = ite1.translateEng(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void 15‚ð“ü—Í(){
		IntToEng1 ite1 = new IntToEng1();
		String expected = "fifteen";
		String actual = ite1.translateEng(15);
		assertThat(actual,is(expected));
	}

}
