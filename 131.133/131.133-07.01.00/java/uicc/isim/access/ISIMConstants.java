//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.isim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <b>ISIMConstants interface</b> hold all the constants defined in 3GPP TS 31.103
 *
 */
public interface ISIMConstants {

	// ------------------------------- Constants ------------------------------
	
	/**
	 * File identifier : ADF = 0x7FFF
	 */
	public final static short FID_ADF = (short) 0x7FFF;
	/**
	 * EF under ISIM ADF *
	 */
	/**
	 * File identifier : EF IMPI = 0x6F02 (under ADF)
	 */
	public final static short FID_EF_IMPI = (short) 0x6F02;
	/**
	 * File identifier : EF DOMAIN = 0x6F03 (under ADF)
	 */
	public final static short FID_EF_DOMAIN = (short) 0x6F03;
	/**
	 * File identifier : EF IMPU = 0x6F04 (under ADF)
	 */
	public final static short FID_EF_IMPU = (short) 0x6F04;
	/**
	 * File identifier : EF AD = 0x6FAD (under ADF)
	 */
	public final static short FID_EF_AD = (short) 0x6FAD;
	/**
	 * File identifier : EF ARR = 0x6F06 (under ADF)
	 */
	public final static short FID_EF_ARR = (short) 0x6F06;
	/**
	 * File identifier : EF IST = 0x6F07 (under ADF)
	 */
	public final static short FID_EF_IST = (short) 0x6F07;
	/**
	 * File identifier : EF PCSCF = 0x6F09 (under ADF)
	 */
	public final static short FID_EF_PCSCF = (short) 0x6F09;
	/**
	 * File identifier : EF GBABP = 0x6FD5 (under ADF)
	 */
	public final static short FID_EF_GBABP = (short) 0x6FD5;
	/**
	 * File identifier : EF GBANL = 0x6FD7 (under ADF)
	 */
	public final static short FID_EF_GBANL = (short) 0x6FD7;
}

