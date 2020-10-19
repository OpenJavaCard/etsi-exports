//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;


/**
 * The <b>SIMViewException class</b> encapsulates specific exceptions which can
 * be thrown by the methods of the SIMView interface in case of error. <p>
 *
 * @version 4.3.0
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 * @see SIMView
 */

public class SIMViewException extends CardRuntimeException {

    /*-------------------------------- Constants ---------------------------*/
    /** This reason code (= 1) is used to indicate that no EF is selected to
     *  complete the called method.
     */
    public static final short NO_EF_SELECTED                     = (short)1;

    /** This reason code (= 2) is used to indicate that the current File
     *  inconsistent with the called method.
     */
    public static final short FILE_INCONSISTENT                  = (short)2;

    /** This reason code (= 3) is used to indicate that the access condition is
     *  not fulfilled by the calling applet for the called method.
     */
    public static final short AC_NOT_FULFILLED                   = (short)3;

    /** This reason code (= 4) is used to indicate to the calling applet that
     *  the file was not found in the current directory.
     */
    public static final short FILE_NOT_FOUND                     = (short)4;

    /** This reason code (= 5) is used to indicate to the calling applet that an
     *  Internal error happened during the called method.
     */
    public static final short INTERNAL_ERROR                     = (short)5;

    /** This reason code (= 6) is used to indicate that the called method is in
     *  contradiction with the invalidation status of the current file.
     */
    public static final short INVALIDATION_STATUS_CONTRADICTION  = (short)6;

    /** This reason code (= 7) is used to indicate that either the length, the file
     *  offset or both passed to the called method are out of the current
     *  transparent file boundaries.
     */
    public static final short OUT_OF_FILE_BOUNDARIES             = (short)7;

    /** This reason code (= 8) is used to indicate that either the length, the record
     *  offset or both passed to the called method are out of the current
     *  record boundaries.
     */
    public static final short OUT_OF_RECORD_BOUNDARIES           = (short)8;

    /** This reason code (= 9) is used to indicate that the indicated record number is
     *  not available is the current file.
     */
    public static final short RECORD_NUMBER_NOT_AVAILABLE        = (short)9;

    /** This reason code (= 10) is used to indicate that the seek or record access mode
     *  requested is not supported by the called method.
     */
    public static final short INVALID_MODE                       = (short)10;

    /** This reason code (= 11) is used to indicate that the requested pattern was not
     *  by the called method.
     */
    public static final short PATTERN_NOT_FOUND                  = (short)11;

    /** This reason code (= 12) is used to indicate that method can not be performed as
     *  maximum value of the record is reached.
     */
    public static final short MAX_VALUE_REACHED                  = (short)12;

    /** This reason code (= 13) is used to indicate that a memory problem occured.
     */
    public static final short MEMORY_PROBLEM                     = (short)13;

    // ------------------------------- Constructors ---------------------------
    /**
     * Constructs a SIMViewException with the specified reason. To conserve on resources use
     * <code>throwIt()</code> to use the JCRE instance of this class.
     *
     * @param reason the reason for the exception
     */
    public SIMViewException(short reason) {
		super(reason);
    }


    // ------------------------------- API methods ----------------------------
    /**
     * Throws the JCRE instance of SIMViewException with the specified reason.
     *
     * @param reason is the reason for the exception
     *
     * @exception SIMViewException always
     */
    public static void throwIt(short reason) throws SIMViewException {
    }
}
