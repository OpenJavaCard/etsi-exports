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
 */
public interface USIMConstants {

	// ------------------------------- Constants ------------------------------
	/**
	 * File identifier : MF = 0x3F00
	 */
	public final static short FID_MF = (short) 0x3F00;
	/**
	 * File identifier : ADF = 0x7FFF
	 */
	public final static short FID_ADF = (short) 0x7FFF;
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
	 * File identifier : EF HPPLMN = 0x6F31 (under ADF)
	 */
	public final static short FID_EF_HPPLMN = (short) 0x6F31;
	/**
	 * File identifier : EF ACMMAX = 0x6F37 (under ADF)
	 */
	public final static short FID_EF_ACMMAX = (short) 0x6F37;
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
	 * File identifier : EF ACL = 0x6F57 (under ADF)
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
	 * File identifier : EF SPDI = 0x6FCD (under ADF)
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
	 * File identifier : EF NIA= 0x6FD3 (under ADF)
	 */
	public final static short FID_EF_NIA = (short) 0x6FD3;
	/**
	 * File identifier : EF VGCS= 0x6FB1 (under ADF)
	 */
	public final static short FID_EF_VGCS = (short) 0x6FB1;
	/**
	 * File identifier : EF VGCSS= 0x6FB2 (under ADF)
	 */
	public final static short FID_EF_VGCSS = (short) 0x6FB2;
	/**
	 * File identifier : EF VBS= 0x6FB3 (under ADF)
	 */
	public final static short FID_EF_VBS = (short) 0x6FB3;
	/**
	 * File identifier : EF VBSS= 0x6FB4 (under ADF)
	 */
	public final static short FID_EF_VBSS = (short) 0x6FB4;
	/**
	 * File identifier : EF VGCSCA= 0x6FD4 (under ADF)
	 */
	public final static short FID_EF_VGCSCA = (short) 0x6FD4;
	/**
	 * File identifier : EF VBSCA= 0x6FD5 (under ADF)
	 */
	public final static short FID_EF_VBSCA = (short) 0x6FD5;
	/**
	 * File identifier : EF GBABP= 0x6FD6 (under ADF)
	 */
	public final static short FID_EF_GBABP = (short) 0x6FD6;
	/**
	 * File identifier : EF MSK= 0x6FD7 (under ADF)
	 */
	public final static short FID_EF_MSK = (short) 0x6FD7;
	/**
	 * File identifier : EF MUK= 0x6FD8 (under ADF)
	 */
	public final static short FID_EF_MUK = (short) 0x6FD8;
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
	 * File identifier : DF WLAN = 0x5F40
	 */
	public final static short FID_DF_WLAN = (short) 0x5F40;
	/**
	 * File identifier : DF SOLSA = 0x5F70

	 */
	public final static short FID_DF_SOLSA = (short) 0x5F70;
	/**
	 * EF at the DF SOLSA level *
	 */
	/**
	 * File identifier : EF SAI= 0x4F30 (under DF SOLSA)
	 */
	public final static short FID_EF_SAI = (short) 0x4F30;
	/**
	 * File identifier : EF SLL= 0x4F31 (under DF SOLSA)
	 */
	public final static short FID_EF_SLL = (short) 0x4F31;

	/**
	 * EF at the DF PHONEBOOK level *
	 */
	/**
	 * File identifier : EF PBR = 0x4F30 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PBR = (short) 0x4F30;
	/**
	 * File identifier : EF PSC = 0x4F22 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PSC = (short) 0x4F22;
	/**
	 * File identifier : EF CC = 0x4F23 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_CC = (short) 0x4F23;
	/**
	 * File identifier : EF PUID = 0x4F24 (under DF PHONEBOOK)
	 */
	public final static short FID_EF_PUID = (short) 0x4F24;

	/**
	 * EF at the DF GSM ACCESS level *
	 */
	/**
	 * File identifier : EF KC = 0x4F20 (under DF GSM ACCESS)
	 */
	public final static short FID_EF_KC = (short) 0x4F20;
	/**
	 * File identifier : EF KCGPRS = 0x4F52 (under DF GSM ACCESS)
	 */
	public final static short FID_EF_KCGPRS = (short) 0x4F52;
	/**
	 * File identifier : EF CPBCCH = 0x4F63 (under DF GSM ACCESS)
	 */
	public final static short FID_EF_CPBCCH = (short) 0x4F63;
	/**
	 * File identifier : EF INVSCAN = 0x4F64 (under DF GSM ACCESS)
	 */
	public final static short FID_EF_INVSCAN = (short) 0x4F64;

	/**
	 * EF at the DF MEXE level *
	 */
	/**
	 * File identifier : EF MEXEST = 0x4F40 (under DF MEXE)
	 */
	public final static short FID_EF_MEXEST = (short) 0x4F40;
	/**
	 * File identifier : EF ORPK = 0x4F41 (under DF MEXE)
	 */
	public final static short FID_EF_ORPK = (short) 0x4F41;
	/**
	 * File identifier : EF ARPK = 0x4F42 (under DF MEXE)
	 */
	public final static short FID_EF_ARPK = (short) 0x4F42;
	/**
	 * File identifier : EF TRPRK = 0x4F43 (under DF MEXE)
	 */
	public final static short FID_EF_TRPRK = (short) 0x4F43;

	/**
	 * EF at the DF WLAN level *
	 */
	/**
	 * File identifier : EF PSEUDO = 0x4F41 (under DF WLAN)
	 */
	public final static short FID_EF_PSEUDO = (short) 0x4F41;
	/**
	 * File identifier : EF UPLMNWLAN = 0x4F42 (under DF WLAN)
	 */
	public final static short FID_EF_UPLMNWLAN = (short) 0x4F42;
	/**
	 * File identifier : EF OPLMNWLAN = 0x4F43 (under DF WLAN)
	 */
	public final static short FID_EF_OPLMNWLAN = (short) 0x4F43;
	/**
	 * File identifier : EF UWSIDL = 0x4F44 (under DF WLAN)
	 */
	public final static short FID_EF_UWSIDL = (short) 0x4F44;
	/**
	 * File identifier : EF OWSIDL = 0x4F45 (under DF WLAN)
	 */
	public final static short FID_EF_OWSIDL = (short) 0x4F45;
	/**
	 * File identifier : EF WRI = 0x4F46 (under DF WLAN)
	 */
	public final static short FID_EF_WRI = (short) 0x4F46;
        /**
	 * File identifier : EF ICE_DN = 0x6FE0 (under DF TELECOM)
	 */
	public final static short FID_EF_ICE_DN = (short) 0x6FE0;
        /**
	 * File identifier : EF ICE_FF = 0x6FE1 (under DF TELECOM)
	 */
	public final static short FID_EF_ICE_FF = (short) 0x6FE1;



	/**
	 * EF under DF TELECOM *
	 */
	/**
	 * File identifier : EF ADN = 0x6F3A (under DF TELECOM)
	 */
	public final static short FID_EF_ADN = (short) 0x6F3A;
	/**
	 * File identifier : EF EXT1 = 0x6F4A (under DF TELECOM)
	 */
	public final static short FID_EF_EXT1 = (short) 0x6F4A;
	/**
	 * File identifier : EF ECCP = 0x6F4F (under DF TELECOM)
	 */
	public final static short FID_EF_ECCP = (short) 0x6F4F;
	/**
	 * File identifier : EF SUME = 0x6F54 (under DF TELECOM)
	 */
	public final static short FID_EF_SUME = (short) 0x6F54;

	/**
	 * DF at the DF TELECOM level *
	 */
	/**
	 * File identifier : DF GRAPHICS = 0x5F50
	 */
	public final static short FID_DF_GRAPHICS = (short) 0x5F50;
	/**
	 * File identifier : DF MULTIMEDIA = 0x5F3B
	 */
	public final static short FID_DF_MULTIMEDIA = (short) 0x5F3B;

	/**
	 * EF under DF GRAPHICS *
	 */
	/**
	 * File identifier : EF IMG = 0x4F20 (under DF GRAPHICS)
	 */
	public final static short FID_EF_IMG = (short) 0x4F20;

	/**
	 * EF under DF MULTIMEDIA *
	 */
	/**
	 * File identifier : EF MML = 0x4F47 (under DF MULTIMEDIA)
	 */
	public final static short FID_EF_MML = (short) 0x4F47;
	/**
	 * File identifier : EF MMDF = 0x4F48 (under DF MULTIMEDIA)
	 */
	public final static short FID_EF_MMDF = (short) 0x4F48;
        /**
       * File identifier : EF_GBANL = 0x6FDA (under ADF)
       */
        public final static short FID_EF_GBANL = (short)0x6FDA;
      /**
       * File identifier : EF_EHPLMNPI = 0x6FDB (under ADF)
       */
      public final static short FID_EF_EHPLMNPI = (short)0x6FDB;
      /**
       * File identifier : EF_LRPLMNSI = 0x6FDC (under ADF)
       */
      public final static short FID_EF_LRPLMNSI = (short)0x6FDC;
      /**
       * File identifier : EF_NAFKCA = 0x6FDD (under ADF)
       */
      public final static short FID_EF_NAFKCA = (short)0x6FDD;
            /**
       * File identifier : EF_SPNI = 0x6FDE (under ADF)
       */
      public final static short FID_EF_SPNI = (short)0x6FDE;
      /**
       * File identifier : EF_PNNI = 0x6FDF (under ADF)
       */
      public final static short FID_EF_PNNI = (short)0x6FDF;
/**
       * File identifier : EF_NCP-IP = 0x6FE2 (under ADF)
       */
      public final static short FID_EF_NCP_IP = (short)0x6FE2;
      /**
       * File identifier : EF_EPSLOCI = 0x6FE3 (under ADF)
       */
      public final static short FID_EF_EPSLOCI = (short)0x6FE3;
      /**
       * File identifier : EF_EPSNSC = 0x6FE4 (under ADF)
       */
      public final static short FID_EF_EPSNSC = (short)0x6FE4;
      /**
       * File identifier: EF_UFC =0x6FE6;
       */
      public final static short FID_EF_UFC = (short)0x6FE6;
      /**
       * File identifier: EF_UICCIARI = 0x6FE7;
       */
      public final static short FID_EF_UICCIARI = (short)0x6FE7;
      /**
       * File identifier: EF_NASCONFIG =0x6FE8;
       */
      public final static short FID_EF_NASCONFIG = (short)0x6FE8;
        /**
	 * EF under DF HNB *
	 */
	/**
	 * File identifier : EF ACSGL = 0x4F81 (under DF HNB)
	 */
	public final static short FID_EF_ACSGL = (short) 0x4F81;
	/**
	 * File identifier : EF CSGI = 0x4F82 (under DF HNB)
         * @deprecated
	 */
	public final static short FID_EF_CSGI = (short) 0x4F82;
        /**
	 * File identifier : EF CSGT = 0x4F82 (under DF HNB)
	 */
	public final static short FID_EF_CSGT = (short) 0x4F82;
       /**
	 * File identifier : EF HNBN = 0x4F83 (under DF HNB)
	 */
	public final static short FID_EF_HNBN = (short) 0x4F83;
               /**
	 * File identifier : EF OCSGL = 0x4F84 (under DF HNB)
	 */
	public final static short FID_EF_OCSGL = (short) 0x4F84;
       /**
	 * File identifier : EF OCSGT = 0x4F85 (under DF HNB)
	 */
	public final static short FID_EF_OCSGT = (short) 0x4F85;
       /**
	 * File identifier : EF OHNBN = 0x4F86 (under DF HNB)
	 */
	public final static short FID_EF_OHNBN = (short) 0x4F86;
}
