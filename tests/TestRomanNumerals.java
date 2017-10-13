import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	
	@Test
	public void convertMCMLXXXIVto1984() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("MCMLXXXIV");
		assertEquals(ret, 1984);
	}
	
	@Test
	public void convertMMXIVto2014() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("MMXIV");
		assertEquals(ret, 2014);
	}
	
	@Test
	public void convertIto1() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("I");
		assertEquals(ret, 1);
	}
	
	@Test
	public void convertVto5() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("V");
		assertEquals(ret, 5);
	}

	@Test
	public void convertXto10() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("X");
		assertEquals(ret, 10);
	}
	
	@Test
	public void convertLto50() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("L");
		assertEquals(ret, 50);
	}
	
	@Test
	public void convertCto100() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("C");
		assertEquals(ret, 100);
	}
	
	@Test
	public void convertDto500() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("D");
		assertEquals(ret, 500);
	}
	
	@Test
	public void convertMto1000() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("M");
		assertEquals(ret, 1000);
	}
	
	@Test
	public void IIIIfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IIII");
		assertEquals(ret, -1);
	}
	
	@Test
	public void XXXXfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("XXXX");
		assertEquals(ret, -1);
	}
	
	@Test
	public void CCCCfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("CCCC");
		assertEquals(ret, -1);
	}
	
	@Test
	public void MMMMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("MMMM");
		assertEquals(ret, -1);
	}
	
	@Test
	public void VVfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VV");
		assertEquals(ret, -1);
	}
	
	@Test
	public void LLfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("LL");
		assertEquals(ret, -1);
	}
	
	@Test
	public void DDfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("DD");
		assertEquals(ret, -1);
	}
	
	@Test
	public void ILfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IL");
		assertEquals(ret, -1);
	}
	
	@Test
	public void ICfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IC");
		assertEquals(ret, -1);
	}
	
	@Test
	public void IDfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("ID");
		assertEquals(ret, -1);
	}
	
	@Test
	public void IMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IM");
		assertEquals(ret, -1);
	}
	
	@Test
	public void XDfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("XD");
		assertEquals(ret, -1);
	}
	
	@Test
	public void XMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("XM");
		assertEquals(ret, -1);
	}
	
	@Test
	public void convertIVto4() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IV");
		assertEquals(ret, 4);
	}
	
	@Test
	public void convertIXto9() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("IX");
		assertEquals(ret, 9);
	}
	
	@Test
	public void convertXLto40() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("XL");
		assertEquals(ret, 40);
	}
	
	@Test
	public void convertXCto90() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("XC");
		assertEquals(ret, 90);
	}
	
	@Test
	public void convertCDto400() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("CD");
		assertEquals(ret, 400);
	}
	
	@Test
	public void convertCMto900() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("CM");
		assertEquals(ret, 900);
	}
	
	@Test
	public void VXfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VX");
		assertEquals(ret, -1);
	}
	
	@Test
	public void VLfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VL");
		assertEquals(ret, -1);
	}
	
	@Test
	public void VCfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VC");
		assertEquals(ret, -1);
	}
	
	@Test
	public void VDfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VD");
		assertEquals(ret, -1);
	}
	
	@Test
	public void VMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("VM");
		assertEquals(ret, -1);
	}
	
	@Test
	public void LCfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("LC");
		assertEquals(ret, -1);
	}
	
	@Test
	public void LDfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("LD");
		assertEquals(ret, -1);
	}
	
	@Test
	public void LMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("LM");
		assertEquals(ret, -1);
	}
	
	@Test
	public void DMfails() {
		RomanNumerals roman = new RomanNumerals();
		int ret = roman.convertToInteger("DM");
		assertEquals(ret, -1);
	}
}
