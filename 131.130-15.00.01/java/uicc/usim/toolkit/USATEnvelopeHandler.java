//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import uicc.toolkit.ToolkitException;
import uicc.toolkit.EnvelopeHandler;
/**
 * The USATEnvelopeHandler interface contains basic methods to handle the <b>SMS Envelope
 * </b>data field. This interface will be used by the Toolkit applet in order to
 * have access to the current SMS Envelope information. No constructor is available
 * for the Toolkit applet.
 *
 @see        uicc.toolkit.EnvelopeHandler
 */
public interface USATEnvelopeHandler extends uicc.toolkit.EnvelopeHandler {
    
    /**
     * Looks for the TP-UDL field in the first TPDU TLV element in the Envelope
     * data field.<br>
     *
     * <br>
     * This method can be used on the events:<ul> 
     * <li>EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, EVENT_UNFORMATTED_SMS_PP_ENV, EVENT_UNFORMATTED_SMS_PP_UPD.</ul>
     * <br>
     * If the element is available it becomes the TLV selected.<br>
     *
     * @return TPUDL offset in the first TPDU TLV element if TPUDL exists.
     *         The value retrieved by using getValueByte is meaningless when the message is
     *         Concatenated. To retrieve the TP-User-Data-Length the method getUserDataLength() shall be used.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TPDU TLV element or if the TPUDL field does not exist</ul>
     */
    public short getTPUDLOffset() throws ToolkitException;
    
    /**
     * Looks for the Secured Data from the Command Packet in the first SMS TPDU
     * or Cell Broadcast Page Simple TLV or USSD String TLV contained in the Envelope handler.<br>
     * <br>
     * This can be used on the events:<ul>
     * <li>EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, if the SMS TP-UD is formatted
     * according to TS 31.115 Single or Concatenated Short Message.
     * <li>EVENT_FORMATTED_SMS_CB, if the Cell Broadcast Page is formatted according to TS 31.115.
     * <li>EVENT_FORMATTED_USSD, if the USSD String is formatted according to TS 31.115.
     * If the element is available it becomes the TLV selected.</ul>
     * <br>
     * @return the offset of the Secured Data first byte in the first SMS TPDU or Cell Broadcast Page or USSD String TLV element.
     *         If the Secured Data length is zero the value returned shall be the offset of the first byte following
     *         the TS 31.115 Command Packet structure.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page TLV element or wrong data format </ul>
     */
    public short getSecuredDataOffset() throws ToolkitException;
    
    /**
     * Looks for the length of the Secured Data from the Command Packet in the first SMS TPDU
     * or Cell Broadcast Page Simple or USSD String TLV contained in the Envelope handler. <br>
     * <br>
     * This can be used on the events:<ul>
     * <li>EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, if the SMS TP-UD
     * is formatted according to TS 31.115 Single or Concatenated Short Message.
     * <li>EVENT_FORMATTED_SMS_CB, if the Cell Broadcast Page is formatted according to TS 31.115.
     * <li>EVENT_FORMATTED_USSD, if the USSD String is formatted according to TS 31.115.
     * If the element is available it becomes the TLV selected.</ul>
     *
     * @return the length of the Secured Data contained in the first SMS TPDU or Cell Broadcast Page TLV or USSD String element (without padding bytes).
     *         If the Secured Data length is zero, no exception shall be thrown.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page or USSD String TLV element or wrong data format </ul>
     */
    public short getSecuredDataLength() throws ToolkitException;
    
    
    /**
     * Looks for the TP-User Data field in the first TPDU TLV element contained in the Envelope Handler. <br>
     * <br>
     * This method can be used on the events:<ul>
     * <li>EVENT_FORMATTED_SMS_PP_ENV,EVENT_FORMATTED_SMS_PP_UPD, EVENT_UNFORMATTED_SMS_PP_ENV, EVENT_UNFORMATTED_SMS_PP_UPD.
     * If the element is available it becomes the TLV selected.</ul>
     * <br>
     * @return the length of the User Data contained in the first SMS TPDU TLV element.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TPDU TLV element or wrong data format </ul>
     */
    public short getUserDataLength() throws ToolkitException;
    
    /**
     * Looks for the Short Message offset in the User Data part of the first SMS TPDU 
     * or of the first Cell Broadcast Page Simple TLV contained in the USATEnvelopeHandler.
     *
     * If this offset is available the simple TLV element becomes the TLV selected.
     *
     * This can be used on the events:<ul> 
     * <li>EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, EVENT_UNFORMATTED_SMS_PP_ENV, 
     * EVENT_UNFORMATTED_SMS_PP_UPD. It returns the offset of the first byte in the User Data part of the first SMS TPDU. 
     * It is the offset of the first byte after the UDH, if any.</ul>
     * <br>
     * This can be used on the events:<ul> 
     * <li>EVENT_FORMATTED_SMS_CB, EVENT_UNFORMATTED_SMS_CB. It returns the offset of the first 
     * byte in the User Data part of the first Cell Broadcast Page Simple TLV. Is is the offset of the first byte after 
     * the UDH, if any.</ul>
     * <br>
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page or wrong data format  </ul>
     */
    public short getShortMessageOffset() throws ToolkitException;
    
    /**
     * Looks for the length of the Short Message in the User Data part of the first SMS TPDU or Cell Broadcast Page COMPREHENSION TLV 
     * contained in the USATEnvelopeHandler.<br>
     * <br>
     * This can be used on the events:<ul> 
     * <li>EVENT_FORMATTED_SMS_PP_ENV, EVENT_FORMATTED_SMS_PP_UPD, EVENT_UNFORMATTED_SMS_PP_ENV, EVENT_UNFORMATTED_SMS_PP_UPD. 
     * It, returns the length of the Short Message in the User Data part of the first SMS TPDU. This length does not include the UDH, if any.</ul>
     * <br>
     * This can be used on the events:<ul> 
     * <li>EVENT_FORMATTED_SMS_CB, EVENT_UNFORMATTED_SMS_CB. It returns the length of the "CBS-Message-Information-Page" field times the number of pages as defined in 3GPP TS 23.041
     * </ul>
     * <br>
     *
     * If this length is available the simple TLV becomes the TLV selected.
     *
     * @return the length of the Short Message in the User Data part of the first SMS TPDU or the length of the Cell Broadcast Page Message Information. 
     *             This length does not include the UDH, if any. If the Short Message length is zero, no exception shall be thrown.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable SMS TPDU or Cell Broadcast Page  or wrong data format </ul>
     */
    public short getShortMessageLength() throws ToolkitException;
}

