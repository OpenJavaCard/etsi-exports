package uicc.usim.geolocation;

import uicc.toolkit.*;

/**
 * This interface defines services allowing an application to get information on the ME current geographical location.
 * Depending on card and terminal capabilities, different means may be used to compute geographical location.
 *
 * <p>see 3GPP TS 23.032 [14] Universal Geographical Area Description (GAD)
 */
public interface GeoLocation {
   

/**
 * Horizontal accuracy: best effort
 */
	public static final byte HORIZONTAL_ACCURACY_BEST_EFFORT = (byte)0x81 ;
/**
 * Vertical coordinate: not requested
 */
	public static final byte VERTICAL_COORDINATE_NOT_REQUESTED = (byte)0x80 ;
/**
* Vertical coordinate: best effort
*/
	public static final byte VERTICAL_COORDINATE_REQUESTED_BEST_EFFORT = (byte)0x81 ;
/**
 * Horizontal velocity requested
 */
	public static final byte HORIZONTAL_VELOCITY_REQUESTED = (byte)0x01 ;
/**
 * Vertical velocity requested in addition to horizontal velocity
 */
	public static final byte VERTICAL_VELOCITY_REQUESTED = (byte)0x03 ;
/**
 * Uncertainty of horizontal velocity requested in addition to horizontal velocity
 */
	public static final byte UNCERTAINTY_OF_HORIZONTAL_VELOCITY_REQUESTED = (byte)0x05 ;
/**
 * Uncertainty of vertical velocity requested in addition to horizontal and vertical velocity
 */
	public static final byte UNCERTAINTY_OF_VERTICAL_VELOCITY_REQUESTED = (byte)0x11 ;
/**
 * GAD shape: Ellipsoid point
 */
	public static final byte GAD_SHAPES_ELLIPSOID_POINT = (byte)0x01 ;
/**
* GAD shape: Ellipsoid point with uncertainty circle
*/
	public static final byte GAD_SHAPES_ELLIPSOID_POINT_WITH_UNCERTAINTY_CIRCLE = (byte)0x02 ;
/**
* GAD shape: Ellipsoid point with uncertainty ellipse
*/
	public static final byte GAD_SHAPES_ELLIPSOID_POINT_WITH_UNCERTAINTY_ELLIPSE = (byte)0x04 ;
/**
* GAD shape: Ellipsoid point with altitude
*/
	public static final byte GAD_SHAPES_ELLIPSOID_POINT_WITH_ALTITUDE = (byte)0x08 ;
/**
* GAD shape: Polygon
*/
	public static final byte GAD_SHAPES_POLYGON = (byte)0x10 ;
/**
* GAD shape: Ellipsoid point with altitude and uncertainty ellipsoid
*/
	public static final byte GAD_SHAPES_ELLIPSOID_POINT_WITH_ALTITUDE_AND_UNCERTAINTY_ELLIPSOID = (byte)0x20 ;
/**
* GAD shape: Ellipsoid arc
*/
	public static final byte GAD_SHAPES_ELLIPSOID_ARC = (byte)0x40;

    /**
     * Set horizontal accuracy parameter for this object as defined in 3GPP TS 31.111 [7].
     */
    public void setHorizontalAccuracy(byte horizontalAccuracy) ;

    /**
     * Set vertical coordinate parameter for this object as defined in 3GPP TS 31.111 [7].
     */
    public void setVerticalCoordinate(byte verticalCoordinate) ;

    /**
     * Set velocity parameter for this object as defined in 3GPP TS 31.111 [7].
     */
    public void setVelocity(byte velocity) ;

    /**
     * Set accepted GAD shapes parameter for this object as defined in 3GPP TS 31.111 [7].
     */
    public void setAcceptedGADShapes(byte acceptedGADShapes) ;

    /**
     * Request a geographical location operation, using parameters defined in the object.
     * If the ME has indicated in its Terminal Profile that it supports "class n"
     * ("Geographical Location Request" see TS 31.111[7] for more details) the system will first send out
     * a "Geographical Location Request" proactive command.<br>
     * <ul>
     *    <li>If the Terminal Responds from the ME indicates that the commands can be performed successfully the
     *        actual Geo Location information is made available through a <code>GeoLocationInformation</code> object.
     *    </li>
     *    <li>If the Terminal Responds from the ME indicates that it can not perform this command, the system
     *        will send out a Proactive command "Provide Local Information".
     * <ul>
     * <br>
     * If the ME does not support "class n" only the proactive command "Provide Local Information" shall be sent
     *
     * @return a <code>GeoLocationInfo</code> object that provides the geo information received from the ME to the Applet
     * @exception  NullPointerException if <code>proHandler</code> is <code>null</code>
     *
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code>
     *      <li><code>FUNCTION_DISABLED</code>
     *      <li><code>UNABLE_TO_PROCESS_COMMAND</code>
     *      <li><code>UNABLE_TO_ACHIEVE_ACCURACY</code>
     * </ul>
     */
    public GeoLocationInfo performGeoLocationRequest(ProactiveHandler proHandler) throws NullPointerException,GeoLocationException;
}

