//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import java.lang.Object;

/**
 * The <b>SIMSystem class</b> provides a way to get a view of the GSM File system.
 * In any case, the client applet (SIM Tookit or other) will only access to methods
 * of the SIMView interface. No instance of this class is needed.<p>
 *
 * Applet example :<pre><code>
 * public class MyApplet extends Applet {
 *
 *     private SIMView theGsmApplet;
 *     private byte[] buffer;
 *
 *     public MyApplet () {
 *         // get a reference to the GSM interface
 *         theGsmApplet = SIMSystem.getTheSIMView();
 *         // create the exchange buffer
 *         buffer = new byte[32];
 *     }
 *
 *     public static void install(byte bArray[],short bOffset, byte bLength) throws ISOException {
 *         // create and register the applet
 *         MyApplet myAppletRef = new MyApplet();
 *         myAppletRef.register();
 *     }
 *
 *     public void getADN(short adnNumber) {
 *         // select EF ADN in DF GSM
 *         theGsmApplet.select((short)SIMView.FID_DF_TELECOM);
 *         theGsmApplet.select((short)SIMView.FID_EF_ADN);
 *         // reads the record from EF ADN and put it in the exchange buffer
 *         theGsmApplet.readRecord((short)adnNumber,
 *                                 (byte)SIMView.REC_ACC_MODE_ABSOLUTE_CURRENT,
 *                                 (short)0,
 *                                 (byte[])buffer,
 *                                 (short)0,
 *                                 (short)32);
 *     }
 * }
 * </code></pre>
 *
 * @version 5.0.1
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 */
public class SIMSystem extends Object {

    // ------------------------------- Constructors ---------------------------
    /**
     * constructor
     */
    private SIMSystem() {
    }

    // ------------------------------- API methods ----------------------------
    /**
     * Return a reference to the GSM interface
     *
     * @return a reference to a class which implements the SIMView interface
     */
    public static SIMView getTheSIMView() {
		return null;
    }
}
