package uicc.usim.geolocation;

import uicc.toolkit.*;

/**
 * This interface defines services allowing an application to get information on the ME current geographical location.
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
    public static final byte VERTICAL_AND_HORIZONTAL_VELOCITY_REQUESTED = (byte)0x03 ;
/**
 * Uncertainty of horizontal velocity requested in addition to horizontal velocity
 */
    public static final byte HORIZONTAL_VELOCITY_REQUESTED_WITH_UNCERTAINTY = (byte)0x05 ;
/**
  * Uncertainty of vertical and horizontal velocity requested in addition to horizontal and vertical velocity
*/
public static final byte VERTICAL_AND_HORIZONTAL_VELOCITY_REQUESTED_WITH_UNCERTAINTY = (byte)0x0F ;
/**
  * Obtain Horizontal Velocity Field from Velocity information.
*/
public static final byte GET_HORIZONTAL_VELOCITY = (byte)0x00 ;
/**
  * Obtain Vertical Velocity Field from Velocity information.
*/
    public static final byte GET_VERTICAL_VELOCITY = (byte)0x01 ;
/**
     * Obtain Horizontal Uncertainty Velocity Field from Velocity information.
*/
public static final byte GET_HORIZONTAL_UNCERTAINTY_VELOCITY = (byte)0x02 ;
/**
  * Obtain Vertical Uncertainty Velocity Field from Velocity information.
*/
public static final byte GET_VERTICAL_UNCERTAINTY_VELOCITY = (byte)0x03 ;
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
     * Preferred NMEA sentence: _RMC
     */
    public static final byte PREFERRED_NMEA_SENTENCE_RMC = (byte)0x01 ;
    /**
     * Preferred NMEA sentence: _GGA
     */
    public static final byte PREFERRED_NMEA_SENTENCE_GGA = (byte)0x02 ;
    /**
     * Preferred NMEA sentence: _GLL
     */
    public static final byte PREFERRED_NMEA_SENTENCE_GLL = (byte)0x04 ;
    /**
     * Preferred NMEA sentence: _GNS
     */
    public static final byte PREFERRED_NMEA_SENTENCE_GNS = (byte)0x08 ;

    /**
     * Set alpha identifier parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param alphaIdentifier Alpha identifier TLV as defined in 3GPP TS 31.111 [7].
     */
    public void setAlphaIdentifier(byte[] alphaIdentifier) ;

    /**
     * Set icon identifier parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param iconIdentifier Value part of Icon identifier TLV as defined in 3GPP TS 31.111 [7].
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setIconIdentifier(short iconIdentifier) ;

    /**
     * Set horizontal accuracy parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param horizontalAccuracy as defined in 3GPP TS 31.111.<br>
     *  The horizontalAccuracy value shall be:<ul>
     *      <li>in the range '00' to '7F', or
     *      <li><code>HORIZONTAL_ACCURACY_BEST_EFFORT</code></ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setHorizontalAccuracy(byte horizontalAccuracy) ;

    /**
     * Set vertical coordinate parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param verticalCoordinate as defined in 3GPP TS 31.111.<br>
     *  The verticalCoordinate value shall be:<ul>
     *      <li>in the range '00' to '7F', or
     *      <li><code>VERTICAL_COORDINATE_NOT_REQUESTED</code>, or
     *      <li><code>VERTICAL_COORDINATE_REQUESTED_BEST_EFFORT</code></ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setVerticalCoordinate(byte verticalCoordinate) ;

    /**
     * Set velocity parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param velocity byte to identify the Velocity Type to return.
     *      Possible value, one or combination (OR operation) of:<ul>
     *      <li><code>HORIZONTAL_VELOCITY_REQUESTED</code>
     *      <li><code>VERTICAL_AND_HORIZONTAL_VELOCITY_REQUESTED</code>
     *      <li><code>HORIZONTAL_VELOCITY_REQUESTED_WITH_UNCERTAINTY</code>
     *      <li><code>VERTICAL_AND_HORIZONTAL_VELOCITY_REQUESTED_WITH_UNCERTAINTY</code></ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setVelocity(byte velocity) ;

    /**
     * Set accepted GAD shapes parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param acceptedGADShapes GAD shapes as defined in 3GPP TS 31.111[7].<br>
     *      Possible values:<ul>
     *      <li><code>GAD_SHAPES_ELLIPSOID_POINT</code>
     *      <li><code>GAD_SHAPES_ELLIPSOID_POINT_WITH_UNCERTAINTY_CIRCLE</code>
     *      <li><code>GAD_SHAPES_ELLIPSOID_POINT_WITH_UNCERTAINTY_ELLIPSE</code>
     *      <li><code>GAD_SHAPES_ELLIPSOID_POINT_WITH_ALTITUDE</code>
     *      <li><code>GAD_SHAPES_POLYGON</code>
     *      <li><code>GAD_SHAPES_ELLIPSOID_POINT_WITH_ALTITUDE_AND_UNCERTAINTY_ELLIPSOID</code>
     *      <li><code>GAD_SHAPES_ELLIPSOID_ARC</code></ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setAcceptedGADShapes(byte acceptedGADShapes) ;

    /**
     * Set Preferred NMEA sentences parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param preferredNMEASentences as defined in 3GPP TS 31.111[7].<br>
     *      Possible values:<ul>
     *      <li><code>PREFERRED_NMEA_SENTENCE_RMC</code>
     *      <li><code>PREFERRED_NMEA_SENTENCE_GGA</code>
     *      <li><code>PREFERRED_NMEA_SENTENCE_GLL</code>
     *      <li><code>PREFERRED_NMEA_SENTENCE_GNS</code></ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setPreferredNMEASentences(byte preferredNMEASentences) ;

    /**
     * Set Preferred Maximum Response Time parameter for this object as defined in 3GPP TS 31.111 [7].
     * @param preferredMaximumResponseTime as defined in 3GPP TS 31.111[7].<br>
     *  preferredMaximumResponseTime shall be in the range'02' to '07' where 2^'xx' represents the preferred maximum response time in seconds
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_PARAMETERS</code> in case of bad parameter is set.</ul>
     */
    public void setPreferredMaximumResponseTime(byte preferredMaximumResponseTime) ;

    /**
     * Request a geographical location operation, using parameters defined in the object.
     * A callback mechanism is used to retrieve the result, when available, using
     * the <code>geoLocationEventListener</code> object. <br>
     * If the ME has indicated in its Terminal Profile that it supports "class n"
     * ("Geographical Location Request" see TS 31.111[7] for more details) the system will first send out
     * a "Geographical Location Request" proactive command.<br>
     * <ul>
     *    <li>If the Terminal Response from the ME indicates that the commands can be performed successfully the
     *        actual Geo Location information will be made available through a <code>GeoLocationInformation</code> object.
     *    </li>
     *    <li>If the Terminal Response from the ME indicates that it can not perform this command,
     *        an exception is thrown, UNABLE_TO_PROCESS_COMMAND.
     *    </li>
     * </ul>
     * If the ME does not support "class n", an exception is thrown, UNABLE_TO_PROCESS_COMMAND.
     *
     * @param geoLocationEventListener the callback object to be invoked once the result is available.
     *
     * @exception  NullPointerException if <code> geoLocationEventListener </code>
     * is <code>null</code>
     *
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>FUNCTION_DISABLED</code> in case the ME is currently unable to get the location information
     *          (e.g. due to lack of GPS coverage or due to a deactivated GPS receiver).
     *      <li><code>UNABLE_TO_PROCESS_COMMAND</code> in case the ME is not equipped with a positioning feature.
     *      <li><code>LOCATION_REQUEST_PROCESSING</code> in case a Geographical Location Request has already been
     *          issued and the Envelope Geographical Location Reporting is expected.</ul>
     * @exception  uicc.toolkit.ToolkitException with the following reason code: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if there is on-going proactive session
     * </ul>
     */
    public void performGeoLocationRequest(GeoLocationEventListener geoLocationEventListener) throws GeoLocationException,uicc.toolkit.ToolkitException ;
}
