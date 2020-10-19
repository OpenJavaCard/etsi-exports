//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The EnvelopeHandler class contains basic methods to handle the <b>Envelope
 * </b>data field. This class will be used by the Toolkit applet in order to
 * have access to the current Envelope information. No constructor is available
 * for the Toolkit applet. The EnvelopeHandler class is a <b>Temporary JCRE 
 * Entry Point Object</b>. The only way to get a EnvelopeHandler reference is 
 * through the <code>getTheHandler()</code> static method.<p>
 *
 * Toolkit Applet Example:<pre><code>
 * private static final byte MY_TAG = (byte)0x54;
 * private byte[] data;
 * data = new byte[32];
 *
 * void processToolkit(byte event) throws ToolkitException {
 *     // get the EnvelopeHandler system instance
 *     EnvelopeHandler theEnv = EnvelopeHandler.getTheHandler();
 *     // look for MY_TAG TLV
 *     if (theEnv.findTLV(MY_TAG, (byte)1) != TLV_NOT_FOUND) {
 *         // check first element byte
 *         if (theEnv.getValueByte((short)0) == (byte)1) {
 *             // copy element part into data buffer
 *             theEnv.copyValue((short)1,
 *                              data,
 *                              (short)0,
 *                              (short)(theEnv.getValueLength() - 1));
 *         }
 *     }
 * }
 * </code></pre>
 *
 * @version 4.0.0
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 * @see ViewHandler
 * @see EnvelopeResponseHandler
 * @see ProactiveHandler
 * @see ToolkitException
 */
public final class EnvelopeHandler extends ViewHandler {

    // ------------------------------- Constructors ---------------------------
    /**
     * constructor
     */
    private EnvelopeHandler() {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Returns the single system instance of the EnvelopeHandler class.
     * The applet shall get the reference of the handler at its triggering, 
     * the beginning of the processToolkit method.
     *
     * @return reference of the system instance
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
     */
    public static EnvelopeHandler getTheHandler() throws ToolkitException{
		return null;
    }

    /**
     * Returns the Envelope BER-TLV tag.
     *
     * @return Envelope BER-TLV tag
     */
    public byte getEnvelopeTag()  {
		return 0;
    }

    /**
     * Looks for the TP-UDL field in the first TPDU TLV element in the Envelope
     * data field. This method can be used on the events EVENT_FORMATTED_SMS_PP_ENV,
     * EVENT_FORMATTED_SMS_PP_UPD, EVENT_UNFORMATTED_SMS_PP_ENV, EVENT_UNFORMATTED_SMS_PP_UPD.
     * If the element is available it becomes the TLV selected.
     *
     * @return TPUDL offset in the first TPDU TLV element if TPUDL exists.
     *      The TPUD length can be recovered by using the getValueByte method in Handler class.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TPDU TLV element or if the TPUDL field does not exist</ul>
     */
    public short getTPUDLOffset() throws ToolkitException {
		return 0;
    }

    /**
     * Looks for the Secured Data from the Command Packet in the first SMS TPDU 
     * or Cell Broadcast Page Simple TLV contained in the Envelope handler. This can
     * be used on the events:
     * - EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, if the SMS TP-UD is formatted
     * according to GSM03.48 Single Short Message.
     * - EVENT_FORMATTED_SMS_CB, if the Cell Broadcast Page is formatted according to GSM 03.48.
     * If the element is available it becomes the TLV selected.
     *
     * @return the offset of the Secured Data first byte in the first SMS TPDU or Cell Broadcast Page TLV element. If the Secured Data length is zero the value returned shall be the SMS TPDU TLV length.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page TLV element or wrong data format </ul>
     */

     public short getSecuredDataOffset() throws ToolkitException {
		return 0;
    }

    /**
     * Looks for the length of the Secured Data from the Command Packet in the first SMS TPDU
     * or Cell Broadcast Page Simple TLV contained in the Envelope handler. This can be used
     * on the events:
     * - EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, if the SMS TP-UD
     * is formatted according to GSM03.48 Single Short Message.
     * - EVENT_FORMATTED_SMS_CB, if the Cell Broadcast Page is formatted according to GSM 03.48.    
     * If the element is available it becomes the TLV selected.
     *
     * @return the length of the Secured Data contained in the first SMS TPDU or Cell Broadcast Page TLV element (without padding bytes). If the Secured Data length is zero, no exception shall be thrown.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page TLV element or wrong data format </ul>
     */

     public short getSecuredDataLength() throws ToolkitException {
		return 0;
    }

    /**
     * Returns the item identifier byte value from the first Item Identifier TLV
     * element in the current Envelope data field.
     * If the element is available it becomes the TLV selected.
     *
     * @return item identifier
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if the item identifier byte is missing in the Item Identifier Simple TLV </ul>
     */
    public byte getItemIdentifier() throws ToolkitException {
		return 0;
    }
}
