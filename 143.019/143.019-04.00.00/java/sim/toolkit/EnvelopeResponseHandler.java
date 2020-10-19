//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The EnvelopeResponseHandler class contains basic methods to handle the <b>Envelope response
 * </b>data field. This class will be used by the Toolkit applet in order to
 * edit the response to current Envelope command. No constructor is available
 * for the Toolkit applet. The EnvelopeResponseHandler class is a <b>Temporary 
 * JCRE Entry Point Object</b>. The only way to get a EnvelopeResponseHandler 
 * reference is through the <code>getTheHandler()</code> static method.<p>
 *
 * @version 4.0.0
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 * @see ViewHandler
 * @see EditHandler
 * @see EnvelopeHandler
 * @see ToolkitException
 */
public final class EnvelopeResponseHandler extends EditHandler {

    // ------------------------------- Constructors ---------------------------
    /**
     * Constructor
     */
    private EnvelopeResponseHandler() {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Returns the single system instance of the EnvelopeResponseHandler class. 
     * The applet shall get the reference of the handler at its triggering, 
     * the beginning of the processToolkit method.
     *
     * @return reference of the system instance
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
     */
    public static EnvelopeResponseHandler getTheHandler() throws ToolkitException {
		return null;
    }

    /**
     * Pepares the Envelope response. Should be used with Envelope SMS-PP Data
     * Download.
     *
     * @param statusType the status to be sent to the ME (SW1_RP_ACK or SW1_RP_ERROR)
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy </ul>
     */
    public void post(byte statusType) throws ToolkitException{
    }

    /**
     * Prepare the Envelope response in a BER TLV structure. Should be used with Envelope
     * Call Control by SIM or MO Short Message Control by SIM. The tag value is to be used
     * to set the Result for Call Control and MO Short Message Control by the SIM.
     *
     * @param statusType the status to be sent to the ME (SW1_RP_ACK or SW1_RP_ERROR)
     * @param tag the BER Tag to be used at the beginning of the SIMPLE_TLV list.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void postAsBERTLV(byte statusType, byte tag) throws ToolkitException {
    }

}
