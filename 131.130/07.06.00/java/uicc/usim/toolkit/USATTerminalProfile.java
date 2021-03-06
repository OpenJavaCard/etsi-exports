//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>USATTerminalProfile</code> interface contains constants for the Terminal Profile according to TS 51.014 and to TS 31.111
 *
 * @see uicc.toolkit.TerminalProfile
 */
public interface USATTerminalProfile {

	/**
	 * SMS PP Data Download = 1
	 */
	public final static short IDX_SMS_PP_DATA_DOWNLOAD = (short) 1;
	/**
	 * Cell Broadcast Data Download = 2
	 */
	public final static short IDX_CELL_BROADCAST_DATA_DOWNLOAD = (short) 2;
	/**
	 * '9EXX' response code for SIM data download error = 4
	 */
	 public final static short IDX_9EXX_RESPONSE = (short)4;
	/**
	 * USSD string data object supported in Call Control = 6
	 */
	public static final short IDX_USSD_SUPPORT_IN_CALL_CONTROL = (short)6;
	/**
	 * Envelope Call Control always sent to the SIM during automatic redial mode = 7
	 */
	public final static short IDX_CALL_CONTROLL_AUTOMATIC_REDIAL_MODE = (short) 7;
	/**
	 * Call Control by SIM = 9
	 */
	public final static short IDX_CALL_CONTROL_BY_SIM = (short)9;
	/**
	 * Cell identity included in Call Control by SIM = 10
	 */
	public final static short IDX_CELL_IDENTITY_IN_CALL_CONTROL_BY_SIM = (short)10;
	/**
	 * MO short message control by SIM  = 11
	 */
	public final static short IDX_MO_SM_CONTROL_BY_SIM = (short)11;
	/**
	 * Handling of the alpha identifier  = 12
	 */
	 public static final short IDX_HANDLING_OF_ALPHA_IDENTIFIER = (short)12;
	/**
	 * Proactive SIM: SEND SHORT MESSAGE = 25
	 */
	 public static final short IDX_PROACTIVE_SIM_SEND_SHORT_MESSAGE = (short)25;
	/**
	 * Proactive SIM: SEND SS  = 26
	 */
	public final static short IDX_PROACTIVE_SIM_SEND_SS = (short) 26;
	/**
	 * Proactive SIM: SEND USSD = 27
	 */
	 public final static short IDX_PROACTIVE_SIM_SEND_USSD = (short)27;
	/**
	 * Proactive UICC: PROVIDE LOCAL INFORMATION - NMR = 31
	 */
	 public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_NMR = (short)31;
	 /**
	  * Binary choice in GET INKEY = 59
	  */
	 public final static short IDX_BINARY_CHOICE_IN_GET_INKEY = (short)59;
	/**
	 * 2nd alpha identifier in SET UP CALL = 62
	 */
	 public final static short IDX_2ND_ALPHA_IDENTIFIER_SET_UP_CALL = (short)62;
	 /**
	  * 2nd capability configuration parameter = 63
	  */
	 public static final short IDX_2ND_CAPABILITY_PARAMETER = (short)63;
	/**
	 * Proactive SIM: PROVIDE LOCAL INFORMATION - BCCH  = 66
	 */
	public final static short IDX_PROACTIVE_SIM_PROVIDE_LOCAL_INFORMATION_BCCH = (short) 66;
	/**
	 * Proactive SIM: PROVIDE LOCAL INFORMATION (Timing Advance)  = 68
	 */
	public final static short IDX_PROACTIVE_SIM_TIMING_ADVANCE = (short) 68;
	/**
	 * CALL Control on GPRS = 141
	 */
	public final static short IDX_CALL_CONTROL_ON_GPRS = (short) 141;
	/**
	 * Support of UTRAN PS with extended parameters = 168
	 */
	public final static short IDX_EXTENDED_PARAMETERS_IN_UTRAN_PS_ = (short) 168;
	/**
	 * Proactive UICC: PROVIDE LOCAL INFORMATION � NMR(UTRAN) = 173
	 */
	 public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_NMR_UTRAN = (short) 173;
	/**
	 * USSD Data Download and application mode= 174
	 */
	public final static short IDX_USSD_DATA_DOWNLOAD_AND_APPLICATION_MODE = (short) 174;

}
