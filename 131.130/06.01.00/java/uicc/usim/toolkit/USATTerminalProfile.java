//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>SIMTerminalProfile</code> interface contains constants for the Terminal Profile according to TS 51.014
 *
 * @version    2.0.0
 * @author     3GPP T3 API
 * @see uicc.toolkit.TerminalProfile
 */
public interface USATTerminalProfile {

	/**
	 * SMS PP Download index = 1
	 */
	public final static short IDX_SMS_PP_DOWNLOAD = (short) 1;
	/**
	 * Cell Broadcast Download index = 2
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
	public final static short IDX_CALL_CONTROLL_BY_SIM = (short)9;
	/**
	 * Cell identity included in Call Control by SIM = 10
	 */
	public final static short IDX_CELL_IDENTITY_IN_CALL_CONTROLL_BY_SIM = (short)10;
	/**
	 * MO short message control by SIM  = 11
	 */
	public final static short IDX_MO_SM_CONTROLL_BY_SIM = (short)11;
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
	public final static short IDX_PROACTIVE_SIM_PROVIDE_LOCAL_INFORMATION_NMR = (short) 66;
	/**
	 * Proactive SIM: PROVIDE LOCAL INFORMATION (Timing Advance)  = 68
	 */
	public final static short IDX_PROACTIVE_SIM_TIMING_ADVANCE = (short) 68;
}
