//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <b>USIMConstants interface</b> hold all the constants defined in 3GPP TS 31.102
 *
 * @version    2.0.0
 * @author     3GPP TSG-T WG3
 */
public interface USIMConstants {

	// ------------------------------- Constants ------------------------------
	/**
	 * File identifier : MF = 0x3F00
	 */
	public final static short FID_MF = (short) 0x3F00;

	/**
	 * EF under USIM ADF *
	 */
	/**
	 * File identifier : EF LI = 0x6F05 (under ADF)
	 */
	public final static short FID_EF_LI = (short) 0x6F05;
	/**
	 * File identifier : EF IMSI = 0x6F07 (under ADF)
	 */
	public final static short FID_EF_IMSI = (short) 0x6F07;
	/**
	 * File identifier : EF KEYS = 0x6F08 (under ADF)
	 */
	public final static short FID_EF_KEYS = (short) 0x6F08;
	/**
	 * File identifier : EF KEYSPS = 0x6F09 (under ADF)
	 */
	public final static short FID_EF_KEYSPS = (short) 0x6F09;
	/**
	 * File identifier : EF PLMNwACT = 0x6F60 (under ADF)
	 */
	public final static short FID_EF_PLMNWACT = (short) 0x6F60;
	/**
	 * File identifier : EF HPLMN = 0x6F05 (under ADF)
	 */
	public final static short FID_EF_HPLMN = (short) 0x6F31;
	/**
	 * File identifier : EF ACMMAX = 0x6F37 (under ADF)
	 */
	public final static short FID_EF_ACMMAY = (short) 0x6F37;
	/**
	 * File identifier : EF UST = 0x6F38 (under ADF)
	 */
	public final static short FID_EF_UST = (short) 0x6F38;
	/**
	 * File identifier : EF ACM = 0x6F39 (under ADF)
	 */
	public final static short FID_EF_ACM = (short) 0x6F39;
	/**
	 * File identifier : EF GID1 = 0x6F3E (under ADF)
	 */
	public final static short FID_EF_GID1 = (short) 0x6F3E;
	/**
	 * File identifier : EF GID2 = 0x6F3F (under ADF)
	 */
	public final static short FID_EF_GID2 = (short) 0x6F3F;
	/**
	 * File identifier : EF SPN = 0x6F46 (under ADF)
	 */
	public final static short FID_EF_SPN = (short) 0x6F46;
	/**
	 * File identifier : EF PUCT = 0x6F41 (under ADF)
	 */
	public final static short FID_EF_PUCT = (short) 0x6F41;
	/**
	 * File identifier : EF CBMI = 0x6F45 (under ADF)
	 */
	public final static short FID_EF_CBMI = (short) 0x6F45;
	/**
	 * File identifier : EF ACC = 0x6F78 (under ADF)
	 */
	public final static short FID_EF_ACC = (short) 0x6F78;
	/**
	 * File identifier : EF FPLMN = 0x6F7B (under ADF)
	 */
	public final static short FID_EF_FPLMN = (short) 0x6F7B;
	/**
	 * File identifier : EF LOCI = 0x6F7E (under ADF)
	 */
	public final static short FID_EF_LOCI = (short) 0x6F7E;
	/**
	 * File identifier : EF AD = 0x6FAD (under ADF)
	 */
	public final static short FID_EF_AD = (short) 0x6FAD;
	/**
	 * File identifier : EF CBMID = 0x6F48 (under ADF)
	 */
	public final static short FID_EF_CBMID = (short) 0x6F48;
	/**
	 * File identifier : EF ECC = 0x6FB7 (under ADF)
	 */
	public final static short FID_EF_ECC = (short) 0x6FB7;
	/**
	 * File identifier : EF CBMIR = 0x6F50 (under ADF)
	 */
	public final static short FID_EF_CBMIR = (short) 0x6F50;
	/**
	 * File identifier : EF PSLOCI = 0x6F73 (under ADF)
	 */
	public final static short FID_EF_PSLOCI = (short) 0x6F73;
	/**
	 * File identifier : EF FDN = 0x6F3B (under ADF)
	 */
	public final static short FID_EF_FDN = (short) 0x6F3B;
	/**
	 * File identifier : EF SMS = 0x6F3C (under ADF)
	 */
	public final static short FID_EF_SMS = (short) 0x6F3C;
	/**
	 * File identifier : EF MSISDN = 0x6F40 (under ADF)
	 */
	public final static short FID_EF_MSISDN = (short) 0x6F40;
	/**
	 * File identifier : EF SMSP = 0x6F42 (under ADF)
	 */
	public final static short FID_EF_SMSP = (short) 0x6F42;
	/**
	 * File identifier : EF SMSS = 0x6F43 (under ADF)
	 */
	public final static short FID_EF_SMSS = (short) 0x6F43;
	/**
	 * File identifier : EF SDN = 0x6F49 (under ADF)
	 */
	public final static short FID_EF_SDN = (short) 0x6F49;
	/**
	 * File identifier : EF EXT2 = 0x6F4B (under ADF)
	 */
	public final static short FID_EF_EXT2 = (short) 0x6F4B;
	/**
	 * File identifier : EF EXT3 = 0x6F4C (under ADF)
	 */
	public final static short FID_EF_EXT3 = (short) 0x6F4C;
	/**
	 * File identifier : EF SMSR = 0x6F47 (under ADF)
	 */
	public final static short FID_EF_SMSR = (short) 0x6F47;
	/**
	 * File identifier : EF ICI = 0x6F80 (under ADF)
	 */
	public final static short FID_EF_ICI = (short) 0x6F80;
	/**
	 * File identifier : EF OCI = 0x6F81 (under ADF)
	 */
	public final static short FID_EF_OCI = (short) 0x6F81;
	/**
	 * File identifier : EF ICT = 0x6F82 (under ADF)
	 */
	public final static short FID_EF_ICT = (short) 0x6F82;
	/**
	 * File identifier : EF OCT = 0x6F83 (under ADF)
	 */
	public final static short FID_EF_OCT = (short) 0x6F83;
	/**
	 * File identifier : EF EXT5 = 0x6F4E (under ADF)
	 */
	public final static short FID_EF_EXT5 = (short) 0x6F4E;
	/**
	 * File identifier : EF CCP2 = 0x6F4F (under ADF)
	 */
	public final static short FID_EF_CCP2 = (short) 0x6F4F;
	/**
	 * File identifier : EF EMLPP = 0x6FB5 (under ADF)
	 */
	public final static short FID_EF_EMLPP = (short) 0x6FB5;
	/**
	 * File identifier : EF AAEM = 0x6FB6 (under ADF)
	 */
	public final static short FID_EF_AAEM = (short) 0x6FB6;
	/**
	 * File identifier : EF HIDDENKEY = 0x6FC3 (under ADF)
	 */
	public final static short FID_EF_HIDDENKEY = (short) 0x6FC3;
	/**
	 * File identifier : EF BDN = 0x6F4D (under ADF)
	 */
	public final static short FID_EF_BDN = (short) 0x6F4D;
	/**
	 * File identifier : EF EXT4 = 0x6F55 (under ADF)
	 */
	public final static short FID_EF_EXT4 = (short) 0x6F55;
	/**
	 * File identifier : EF CMI = 0x6F58 (under ADF)
	 */
	public final static short FID_EF_CMI = (short) 0x6F58;
	/**
	 * File identifier : EF EST = 0x6F56 (under ADF)
	 */
	public final static short FID_EF_EST = (short) 0x6F56;
	/**
	 * File identifier : EF ACL = 0x6FB6 (under ADF)
	 */
	public final static short FID_EF_ACL = (short) 0x6F57;
	/**
	 * File identifier : EF DCK = 0x6F2C (under ADF)
	 */
	public final static short FID_EF_DCK = (short) 0x6F2C;
	/**
	 * File identifier : EF CNL = 0x6F32 (under ADF)
	 */
	public final static short FID_EF_CNL = (short) 0x6F32;
	/**
	 * File identifier : EF START-HFN = 0x6F5B (under ADF)
	 */
	public final static short FID_EF_START_HFN = (short) 0x6F5B;
	/**
	 * File identifier : EF THRESHOLD = 0x6F5C (under ADF)
	 */
	public final static short FID_EF_THRESHOLD = (short) 0x6F5C;
	/**
	 * File identifier : EF OPLMNWACT = 0x6F61 (under ADF)
	 */
	public final static short FID_EF_OPLMNWACT = (short) 0x6F61;
	/**
	 * File identifier : EF HPLMNWACT = 0x6F62 (under ADF)
	 */
	public final static short FID_EF_HPLMNWACT = (short) 0x6F62;
	/**
	 * File identifier : EF ARR = 0x6F06 (under ADF)
	 */
	public final static short FID_EF_ARR = (short) 0x6F06;
	/**
	 * File identifier : EF RPLMNACT = 0x6F65 (under ADF)
	 */
	public final static short FID_EF_RPLMNACT = (short) 0x6F65;
	/**
	 * File identifier : EF NETPAR = 0x6FC4 (under ADF)
	 */
	public final static short FID_EF_NETPAR = (short) 0x6FC4;
	/**
	 * File identifier : EF PNN = 0x6FC5 (under ADF)
	 */
	public final static short FID_EF_PNN = (short) 0x6FC5;
	/**
	 * File identifier : EF OPL = 0x6FC6 (under ADF)
	 */
	public final static short FID_EF_OPL = (short) 0x6FC6;
	/**
	 * File identifier : EF MBDN = 0x6FC7 (under ADF)
	 */
	public final static short FID_EF_MBDN = (short) 0x6FC7;
	/**
	 * File identifier : EF EXT6 = 0x6FC8 (under ADF)
	 */
	public final static short FID_EF_EXT6 = (short) 0x6FC8;
	/**
	 * File identifier : EF MBI = 0x6FC9 (under ADF)
	 */
	public final static short FID_EF_MBI = (short) 0x6FC9;
	/**
	 * File identifier : EF MBDN = 0x6FC7 (under ADF)
	 */
	//public static final short FID_EF_MBDN = (short) 0x6FC7; /check this
	/**
	 * File identifier : EF MWIS = 0x6FCA (under ADF)
	 */
	public final static short FID_EF_MWIS = (short) 0x6FCA;
	/**
	 * File identifier : EF CFIS = 0x6FCB (under ADF)
	 */
	public final static short FID_EF_CFIS = (short) 0x6FCB;
	/**
	 * File identifier : EF EXT7 = 0x6FCC (under ADF)
	 */
	public final static short FID_EF_EXT7 = (short) 0x6FCC;
	/**
	 * File identifier : EF SPDI = 0x6FC7 (under ADF)
	 */
	public final static short FID_EF_SPDI = (short) 0x6FCD;
	/**
	 * File identifier : EF MMSN = 0x6FCE (under ADF)
	 */
	public final static short FID_EF_MMSN = (short) 0x6FCE;
	/**
	 * File identifier : EF EXT8 = 0x6FCF (under ADF)
	 */
	public final static short FID_EF_EXT8 = (short) 0x6FCF;
	/**
	 * File identifier : EF MMSICP = 0x6FD0 (under ADF)
	 */
	public final static short FID_EF_MMSICP = (short) 0x6FD0;
	/**
	 * File identifier : EF MMSUP = 0x6FD1 (under ADF)
	 */
	public final static short FID_EF_MMSUP = (short) 0x6FD1;
	/**
	 * File identifier : EF MMSUCP = 0x6FD2 (under ADF)
	 */
	public final static short FID_EF_MMSUCP = (short) 0x6FD2;

	/**
	 * DF at the USIM ADF level *
	 */
	/**
	 * File identifier : DF PHONEBOOK = 0x5F3A
	 */
	public final static short FID_DF_PHONEBOOK = (short) 0x5F3A;
	/**
	 * File identifier : DF GSM ACCESS = 0x5F3B
	 */
	public final static short FID_DF_GSM_ACCESS = (short) 0x5F3B;
	/**
	 * File identifier : DF MEXE = 0x5F3C
	 */
	public final static short FID_DF_MEXE = (short) 0x5F3C;

	/**
	 * File identifier : EF EXT7 = 0x6FCC (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PBR = (short) 0x4F30;
	/**
	 * File identifier : EF PSC = 0x4F22 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PSC = (short) 0x4F22;
	/**
	 * File identifier : EF CC = 0x4F23 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_C = (short) 0x4F23;
	/**
	 * File identifier : EF PUID = 0x4F24 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PUID = (short) 0x4F24;

	/**
	 * File identifier : EF KC = 0x4F22 (under DF GSM)
	 */
	public final static short FID_EF_KC = (short) 0x4F20;
	/**
	 * File identifier : EF KCGPRS = 0x4F52 (under DF GSM)
	 */
	public final static short FID_EF_KCGPRS = (short) 0x4F52;
	/**
	 * File identifier : EF CPBCCH = 0x4F63 (under DF GSM)
	 */
	public final static short FID_EF_CPBCCH = (short) 0x4F63;
	/**
	 * File identifier : EF INVSCAN = 0x4F64 (under DF GSM)
	 */
	public final static short FID_EF_INVSCAN = (short) 0x4F64;
	/**
	 * File identifier : EF MEXEST = 0x4F40 (under DF GSM)
	 */
	public final static short FID_EF_MEXEST = (short) 0x4F40;
	/**
	 * File identifier : EF ORPK = 0x4F41 (under DF GSM)
	 */
	public final static short FID_EF_ORPK = (short) 0x4F41;
	/**
	 * File identifier : EF ARPK = 0x4F42 (under DF GSM)
	 */
	public final static short FID_EF_ARPK = (short) 0x4F42;
	/**
	 * File identifier : EF TRPRK = 0x4F43 (under DF GSM)
	 */
	public final static short FID_EF_TRPRK = (short) 0x4F43;
}

