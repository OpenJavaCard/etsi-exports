//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.usim.suci;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The <b><code>SUCIRegistry</code></b> class contains static method(s) to register object(s) in the USIM.
 * Theses object exposes SUCI related services.
 */

public class SUCIRegistry {
	
     private SUCIRegistry(){};

    /**
     * Register an instance of an object that implements <code>SUCICalculator</code> interface to
	 * the indicated USIM application.
	 * This object will be used by the USIM to retrieve the SUCI to be returned to the terminal
	 * <p>Note:<ul>
	 * <li><em>The object <code>SUCICalculator</code>, shall be in the same 
	 *	security domain of the the indicated USIM application.</em>
	 * <li><em>To deregister the object <code>SUCICalculator</code>, the reference of this object will be needed.</em>
	 * </ul>
     *
	 * @param      aid                   AID of the USIM requesting USIM SUCI services
	 * @param      calc                  object that implements <code>SUCICalculator</code>
	 * @exception  NullPointerException  if <code>aid</code> or <code>calc</code> is <code>null</code>
	 * @exception  SystemException		 if <code>aid</code> is not present or not an USIM application
	 * @exception  SUCIException   with the following reason codes:
	 * <ul>
	 * <li>{@link uicc.usim.suci.SUCIException#ALREADY_REGISTERED 
	 *     SUCIException.ALREADY_REGISTERED}
	 * 	   if a <code>SUCICalculator</code> is already registered to the indicated USIM
	 * <li>{@link uicc.usim.suci.SUCIException#WRONG_INTERFACE
	 * 	   SUCIException.WRONG_INTERFACE}
	 * 	   if <code>calc</code> object doesn't implement <code>SUCICalculator</code> interface
	 * <li>{@link uicc.usim.suci.SUCIException#WRONG_OWNERSHIP
	 * 	   SUCIException.WRONG_OWNERSHIP}
	 * 	   if <code>calc</code> object is from an application not in the same security domain 
	 *	   of the indicated USIM application.
	 * </ul>
     */
    public static void registerSUCICalculator(javacard.framework.AID aid, SUCICalculator calc) {
    }

    /**
     * Register an instance of an object that implements
	 * <code>SUCICalculator</code> interface to the USIM application.
	 * This object will be used by the USIM to retrieve the SUCI to be returned to the terminal
	 * <p>Note:<ul>
	 * <li><em>The object <code>SUCICalculator</code>, shall be in the same 
	 *	security domain of the the indicated USIM application.</em>
	 * <li><em>To deregister the object <code>SUCICalculator</code>, the reference of this object will be needed.</em>
	 * </ul>
     *
	 * @param      calc                  object that implements <code>SUCICalculator</code>
	 * @exception  NullPointerException  if <code>calc</code> is <code>null</code>
	 * @exception  SUCIException   with the following reason codes:
	 * <ul>
	 * <li>{@link uicc.usim.suci.SUCIException#NO_USIM
	 *     SUCIException.NO_USIM} if there is no USIM available.
	 * <li>{@link uicc.usim.suci.SUCIException#ALREADY_REGISTERED
	 *     SUCIException.ALREADY_REGISTERED}
	 *     if an <code>SUCICalculator</code> is already registered to the indicated USIM
	 * <li>{@link uicc.usim.suci.SUCIException#WRONG_INTERFACE
	 *      SUCIException.WRONG_INTERFACE}
	 *      if <code>calc</code> object doesn't implement <code>SUCICalculator</code> interface
	 * <li>{@link uicc.usim.suci.SUCIException#WRONG_OWNERSHIP
	 * 	   SUCIException.WRONG_OWNERSHIP}
	 * 	   if <code>calc</code> object is from an application not in the same security domain 
	 *	   of the indicated USIM application.
	 * </ul>
     */
    public static void registerSUCICalculator(SUCICalculator calc) {
    }

    /**
     * Deregister an instance of an object that implements 
	 * <code>SUCICalculator</code> interface from the indicated USIM application.
     *
	 * @param      aid                   AID of the USIM using SUCI services
	 * @param      calc                  object that implements <code>SUCICalculator</code> that is registered and should be deregistered
	 * @exception  NullPointerException  if <code>aid</code> or <code>calc</code> is <code>null</code>
	 * @exception  SystemException		 if <code>aid</code> is not present or not an USIM application
	 * @exception  SUCIException   with the following reason codes:
	 * <ul>
	 * <li>{@link uicc.usim.suci.SUCIException#NOT_REGISTERED
	 *     SUCIException.NOT_REGISTERED}
	 *     if the <code>SUCICalculator</code> is not registered for the indicated USIM.
	 *     The <code>SUCICalculator</code> registered object, if any, will stay registered.
	 * </ul>
     */
    public static void deregisterSUCICalculator(javacard.framework.AID aid, SUCICalculator calc) {
    }

    /**
     * Deregister an instance of an object that implements <code>SUCICalculator</code>
	 * interface from the USIM application.
     *
	 * @param      calc                  object that implements <code>SUCICalculator</code> that is registered and should be deregistered
	 * @exception  NullPointerException  if <code>calc</code> is <code>null</code>
	 * @exception  SUCIException   with the following reason codes:
	 * <ul>
	 * <li>{@link uicc.usim.suci.SUCIException#NO_USIM
	 *     SUCIException.NO_USIM} if there is no USIM available.
	 * <li>{@link uicc.usim.suci.SUCIException#NOT_REGISTERED
	 *     SUCIException.NOT_REGISTERED}
	 *     if the <code>SUCICalculator</code> is not registered to the indicated USIM.
	 *     The <code>SUCICalculator</code> registered object, if any, will stay registered.
	 * </ul>
     */
    public static void deregisterSUCICalculator(SUCICalculator calc) {
    }
}