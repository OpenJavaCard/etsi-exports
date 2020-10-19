//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * This class is the basic class for the construction of a list of simple TLV elements.
 * This class is able to handle Simple TLV with a value field no longer than 255 bytes.
 *
 * @version 5.0.1
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 * @see ViewHandler
 * @see ProactiveHandler
 * @see EnvelopeResponseHandler
 * @see ToolkitException
 */
public abstract class EditHandler extends ViewHandler {

	EditHandler(){}

    // ------------------------------- Constructors ---------------------------
    /**
     * Builds a new EditHandler object.
     *
     * @param buffer the buffer containg the TLV list
     * @param offset the position of the TLV list
     * @param length the length of the TLV list
     *
     * @exception NullPointerException if <code>buffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     */
     EditHandler(byte[] buffer, short offset, short length) 
    												throws 	NullPointerException,
                                                    		ArrayIndexOutOfBoundsException  {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Clears the TLV list of an EditHandler and resets the current TLV selected.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void clear() throws ToolkitException {
    }

    /**
     * Appends a buffer into the EditHandler buffer.
     * A successful append does not modify the TLV selected.
     * The TLV list structure of the handler should be maintained by the applet in the
     * appended array (e.g. the length of the TLV element should be coded according to ISO 7816-6),
     * if the TLV manipulation methods are to be used afterwards with the handler.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>offset</code><em> or </em><code>length</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no append is performed.</em>
     * <li><em>If </em><code>offset+length</code><em> is greater than </em><code>buffer.length</code><em>, the length
     * of the </em><code>buffer</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no append is performed.</em> 
     * </ul> 
     *
     * @param buffer the buffer containing data for copy
     * @param offset the offset in the buffer
     * @param length the value length of the buffer
     *
     * @exception NullPointerException if <code>buffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if append would cause access of data outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendArray(byte[] buffer,
                            short offset,
                            short length) throws NullPointerException,
                                                 ArrayIndexOutOfBoundsException,
                                                 ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (byte array format).
     * A successful append does not modify the TLV selected.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>valueOffset</code><em> or </em><code>valueLength</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no append is performed.</em>
     * <li><em>If </em><code>valueOffset+valueLength</code><em> is greater than </em><code>value.length</code><em>, the length
     * of the </em><code>value</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no append is performed.</em> 
     * </ul>
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value the buffer containing the TLV value
     * @param valueOffset the offset of the TLV value in the buffer
     * @param valueLength the value length of the TLV to append
     *
     * @exception NullPointerException if <code>value</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if append would cause access of data outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>BAD_INPUT_PARAMETER</code> if <code>valueLength</code> is greater than 255</ul>
     */
    public void appendTLV(byte tag,
                          byte[] value,
                          short valueOffset,
                          short valueLength) throws NullPointerException,
                                                    ArrayIndexOutOfBoundsException,
                                                    ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (1-byte element).
     * This method is useful to add single byte elements as Item Identifier or Tone.
     * A successful append does not modify the TLV selected.
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value the TLV value on 1 byte
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte value) throws ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (2-byte element)
     * This method is useful to add double byte elements as Device Identities, Duration or
     * Response Length. A successful append does not modify the TLV selected.
     *
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value1 the 1st byte (msb) of the TLV value
     * @param value2 the 2nd byte (lsb) of the TLV value
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte value1,
                          byte value2) throws ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (1 byte and a byte array format).
     * A successful append does not modify the TLV selected.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>value2Offset</code><em> or </em><code>value2Length</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> 
     * exception is thrown and no append is performed.</em>
     * <li><em>If </em><code>value2Offset+value2Length</code><em> is greater than </em><code>value2.length</code><em>, the length
     * of the </em><code>value2</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no append is performed.</em> 
     * </ul>
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value1 the first byte in the value field
     * @param value2 the buffer containing the rest of the TLV field
     * @param value2Offset the offset of the rest of the TLV field in the buffer
     * @param value2Length the value length of the rest of the TLV field to append
     *
     * @exception NullPointerException if <code>value2</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if append would cause access of data outside array bounds.
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>BAD_INPUT_PARAMETER</code> if <code>value2Length</code> is greater than 254</ul>
     */
    public void appendTLV(byte tag,
                          byte value1,
                          byte[] value2,
                          short value2Offset,
                          short value2Length) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     ToolkitException {
    }
}
