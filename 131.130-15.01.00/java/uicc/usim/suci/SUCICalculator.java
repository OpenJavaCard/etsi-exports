//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.suci;


/**
 *  An object that implements this interface provides callbacks for an applet to 
 *  be able to provide the SUCI to the USIM.
 */
public interface SUCICalculator extends javacard.framework.Shareable
{
	
	// ------------------------------- Public methods -------------------------

	/**
	 * This method is called by the USIM upon reception of a GET IDENTITY APDU 
	 * Command in SUCI context sent by the terminal. The returned value shall 
	 * be stored in the provided Global Array buffer and contain the SUCI TLV 
	 * data object tag, length and value.
	 *
	 * @param  buffer   provided <b>Global Array</b> to store the SUCI.
	 * @param  bOffset  offset in the buffer indicating the start of the SUCI.
	 * @param  bLength  maximum length of the SUCI to be stored into the buffer.
	 * @return short    size of the data stored in the buffer.
	 */
	short getSUCI(byte[] buffer, short bOffset, short bLength);
}
