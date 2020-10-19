package uicc.usim.toolkit;

//import uicc.toolkit.ToolkitConstants;

/**
 *  <code>ToolkitConstants</code> encapsulates constants related to the USAT Toolkit applets.
 *
 */
public interface ToolkitConstants extends uicc.toolkit.ToolkitConstants { 
    /** Event : Envelope SMS-PP Data Download (31.115 formatted)  = 2        */
    public static final short EVENT_FORMATTED_SMS_PP_ENV                 = (short)2;
     /** Event : Update Record EF sms APDU     (31.115 formatted)  = 3        */
    public static final short EVENT_FORMATTED_SMS_PP_UPD                 = (short)3;
    /** Event : Envelope SMS-PP Data Download unformatted sms  = 4          */
    public static final short EVENT_UNFORMATTED_SMS_PP_ENV               = (short)4;
    /** Event : Update Record EFsms APDU      unformatted sms   = 5         */
    public static final short EVENT_UNFORMATTED_SMS_PP_UPD               = (short)5;
    /** Event : Cell Broadcast Data Download  = 6                           */
    public static final short EVENT_UNFORMATTED_SMS_CB                   = (short)6;
    /** Event : MO Short Message Control by NAA = 10.                        
     *   Note: The constant EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM was 
     *   erroneously used instead of the constant 
     *   Event EVENT_MO_SHORT_MESSAGE_CONTROL_BY_NAA
     *   in earlier releases of this specification. Use constant
     *   EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM in applications
     *  which need to be compatible with earlier releases of this specification.
     */
    public static final short EVENT_MO_SHORT_MESSAGE_CONTROL_BY_NAA      = (short)10;
    /** Note: The constant EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM was 
        erroneously used for the Event EVENT_MO_SHORT_MESSAGE_CONTROL_BY_NAA
        in earlier releases of this specification. The constant
        EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM is maintained for backwards 
        compatiblity with applications which were developed for earlier 
        releases of this specification.
        @deprecated Use EVENT_MO_SHORT_MESSAGE_CONTROL_BY_NAA instead.*/

    public static final short EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM      = (short)10;
    /** Event : Cell Broadcast Data Download Formatted = 24                 */
    public static final short EVENT_FORMATTED_SMS_CB                     = (short)24;
    /** Event : USSD Data Download Formatted = 121                          */
    public static final byte EVENT_FORMATTED_USSD                        = (short)121;
    /** Event : USSD Data Download Unformatted = 122                        */
    public static final byte EVENT_UNFORMATTED_USSD                      = (short)122;
    /** @deprecatedBER-TLV: Cell Broadcast download tag = 0xD2      */
    public static final byte BTAG_CELL_BROADCATS_DOWNLOAD = (byte)0xD2;
   /** BER-TLV: Cell Broadcast download tag = 0xD2      */
    public static final byte BTAG_CELL_BROADCAST_DOWNLOAD = (byte)0xD2;
    /** BER-TLV : MO short message control tag = 0xD5    */
    public static final byte BTAG_MO_SHORT_MESSAGE_CONTROL = (byte)0xD5;
    /** BER-TLV : SMS-PP download tag = 0xD1 */
    public static final byte BTAG_SMS_PP_DOWNLOAD = (byte)0xD1;
    /** BER-TLV : USSD download tag = 0xD9 */
    public static final byte BTAG_USSD_DOWNLOAD = (byte)0xD9;
    /**  Type of proactive command : SEND SS = 0x11 */
    public static final byte PRO_CMD_SEND_SS = (byte)0x11;
    /** Type of proactive command : SEND USSD = 0x12 */
    public static final byte PRO_CMD_SEND_USSD = (byte)0x12;
    /** General Result : USSD or SS transaction terminated by user = 0x14 */
    public static final byte RES_CMD_PERF_USSD_TRANSAC_TERM = (byte)0x14;
    /** General Result : SS return error = 0x34 */
    public static final byte RES_ERROR_SS_RETURN_ERROR = (byte)0x34;
    /** General Result : SMS RP-ERROR = 0x35     */
    public static final byte RES_ERROR_SMS_RP_ERROR = (byte)0x35;
    /** General result: USSD return error = 0x37     */
    public static final byte RES_ERROR_USSD_RETURN_ERROR = (byte)0x37; 
    /** General result: Interaction with call control by USIM or MO short message control by USIM, permanent problem = 0x39 */
    public static final byte RES_CMD_CALL_MO_CONTROL_PROBLEM = (byte)0x39; 
    /** Simple-TLV : BC Repeat Indicator tag = 0x2A */
    public static final byte TAG_BC_INDICATOR = (byte)0x2A;
    /** Simple-TLV : BCCH Channel List tag = 0x1D */
    public static final byte TAG_BCCH_CHANNEL_LIST = (byte)0x1D;
    /** Simple-TLV : Cause tag = 0x1A */
    public static final byte TAG_CAUSE = (byte)0x1A;
    /** Simple-TLV : Cell Broadcast Page tag = 0x0C; */
    public static final byte TAG_CELL_BROADCAST_PAGE = (byte)0x0C;
    /** Simple-TLV : SMS TPDU tag = 0x0B */
    public static final byte TAG_SMS_TPDU = (byte)0x0B;
    /** Simple-TLV : SS String tag */
    public static final byte TAG_SS_STRING = (byte)0x09;
    /** Simple-TLV : Timing Advance tag = 0x2E */
    public static final byte TAG_TIMING_ADVANCE = (byte)0x2E;
    /** Simple-TLV : Transaction Identifier tag = 0x1C */
    public static final byte TAG_TRANSACTION_IDENTFIER = (byte)0x1C;
    /** Simple-TLV : USSD String tag = 0x0A */
    public static final byte TAG_USSD_STRING = (byte)0x0A;
    /** Simple-TLV : PDP context Activation parameters tag = 0x52 */
    public static final byte TAG_PDP_CONTEXT_ACTIVATION_PARAMETERS = (byte)0x52;
    /** Simple-TLV : UTRAN Measurement Qualifier tag = 0x69 */
    public static final byte TAG_UTRAN_MEASUREMENT_QUALIFIER = (byte)0x69;
}
