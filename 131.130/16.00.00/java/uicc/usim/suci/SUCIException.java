//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.suci;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;

/**
 * This class extends the <code>Throwable</code> class and allows the classes of this package
 * to throw specific exceptions in case of problems. 
 */
public class SUCIException extends CardRuntimeException {

	// ------------------------------- Constants ------------------------------
	/**
	 * This reason code (= 1) is used to indicate that the there is no USIM.
	 */
	public final static short NO_USIM = (short)1;
	/**
	 * This reason code (= 2) is used to indicate that the there is already an 
	 * instance of a <code>SUCICalculator</code> object registered in the USIM application.
	 */
	public final static short ALREADY_REGISTERED = (short)2;
	/**
	 * This reason code (= 3) is used to indicate that the provided object <code>SUCICalculator</code>
	 * is not the one already registered object in the USIM application.
	 */
	public final static short NOT_REGISTERED = (short)3;
	/**
	 * This reason code (= 4) is used to indicate that the provided object 
	 * doesn't implement the expected interface.
	 */
	public final static short WRONG_INTERFACE = (short)4;
	/**
	 * This reason code (= 5) is used to indicate that the provided object 
	 * to be registered is not on the same security domain of the targeted USIM application.
	 */
	public final static short WRONG_OWNERSHIP = (short)5;

	
	// ------------------------------- Constructors ---------------------------
	/**
	 * Construct a <code>SUCIException</code> instance with the specified 
	 * reason. To conserve on resources use <code>throwIt()</code> method to
	 * re-use the JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public SUCIException(short reason) {
		super(reason);
	}

	// ------------------------------- Public methods -------------------------
	/**
	 * Throws the JCRE instance of the <code>SUCIException</code> class with
	 * the specified reason.
	 *
	 * @param  reason                the reason for the exception.
	 * @exception  SUCIException  always
	 */
	public static void throwIt(short reason) throws SUCIException {
	}
}