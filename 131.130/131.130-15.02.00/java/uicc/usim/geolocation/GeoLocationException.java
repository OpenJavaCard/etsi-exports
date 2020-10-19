package uicc.usim.geolocation;

import javacard.framework.CardRuntimeException;

/**
 * Geographical Location exception and its associated constants.
 */
public class GeoLocationException extends CardRuntimeException {

    // ------------------------------- Constants ------------------------------
    /** This reason code (= 1) is used to indicate that the parameters are incorrect
     */
    public static final short INCORRECT_PARAMETERS = (short)1;

    /** This reason code (= 2) is used to indicate that the geographical location is disabled
     */
    public static final short FUNCTION_DISABLED = (short)2;

    /** This reason code (= 3) is used to indicate that the operation could not be processed
     */
    public static final short UNABLE_TO_PROCESS_COMMAND = (short)3;

    /**
     * This reason code (= 5) is used to indicate that the information in the <code>ProactiveResponseHandler</code> or in
     * the <code>EnvelopeHandler</code> is not correct.
     */
    public static final short INCORRECT_INFORMATION = (short)5;


    /**
     * This reason code (= 6) is used to indicate that the a <code>performGeoLocationRequest</code> is under processing
     * (i.e. after the sent of a location request and before receiving the "Geographical Location Reporting" ENVELOPE command).
     */
    public static final short LOCATION_REQUEST_PROCESSING = (short)6 ;

    // ------------------------------- Constructors ---------------------------
    /**
     * Construct a GeoLocationException instance with the specified reason. To
     * conserve on resources use <code>throwIt()</code> method to re-use the
     * JCRE instance of this class.
     *
     * @param reason the reason for the exception
     */
    public GeoLocationException(short reason) { super(reason); }

    // ------------------------------- Public methods -------------------------
    /**
     * Throws the JCRE instance of the <code>GeoLocationException</code> class with
     * the specified reason.
     *
     * @param reason the reason for the exception.
     *
     * @exception GeoLocationException always
     */
    public static void throwIt(short reason) throws GeoLocationException {
    }
}

