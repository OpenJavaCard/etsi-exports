package uicc.usim.geolocation ;

/**
 * An object implementing this interface gives access to the Geo Location information received from the ME.
 */
public interface GeoLocationInfo {

    /**
     * Gives the Latitude of the geographical location  in Degrees, Minutes and Seconds. <br>
     * Precison to whole second is applied for GAD and NMEA when extracting the Latitude information.<br>
     * When ME answer with GAD shape:<ul>
     *  When GAD shape is Polygon:<ul>
         * <li>The returned value is the Centroid of the Polygon which is the average point of all the latitude and longitude samples,
         *     as described in described in TS 23.032 [14] section 7.3.4 Polygon.
         * <li>The Centroid of a non-self-intersecting closed polygon is defined by n vertices (x0,y0), (x1,y1), ..., (xn-1,yn-1) is the point (Cx, Cy),
         *     with:<br>
         *         Cx = (x0+x1+x2+---------+xn)/n<br>
         *         Cy= (y0+y1+y2+-----------+yn)/n<br>
         *     Where x and y are the longitude and latitude of each points respectively.</ul>
         * <li>Absolute latitude(X) is obtained using the formula specified TS 23.032 [14] Section 6.1 Point.
         * <li>Using the Absolute Latitude X:<br>
         *     DD = Integer degrees are equal to the integer part of the decimal degrees<br>
         *     MM = Integer of ((X - DD) * 60)<br>
         *     SS =  (X - DD - MM/60) * 3600</ul>
     * When ME answer with NMEA format: <ul>
         * <li>The Latitude shall be returned if present in the NMEA sentence, as a result of the conversion to the format of the returned data defined below.
         *     The returned data shall be able to provide at least a precision of a whole minute if the Latitude in the NMEA sentence provides so.
         * <li>Only the sentences listed in TS 31.111[7] (i.e. $--RMC, $--GGA, $--GLL, $--GNS) could be used.
         * <li>If two of these sentences are provided in geolocation reporting envelope,only the first NMEA sentence given in
         *     the envelope will used to retrieve the Latitude.
         * <li>If none of these sentences are provided in geolocation reporting envelope, UNABLE_TO_PROCESS_COMMAND exception is thrown.
         * <li>Latitude field from NMEA sentence is coded in ASCII (DDMM.mm).
         * <li>Decimal representation is interpreted as:<br>
         *         DD = Remaining digits to the left of MM<br>
         *         MM = Two Digits immediately to the left of the decimal point<br>
         *         mm = Fraction of Minutes<br>
         *         SS = .mm * 60</ul>
     * @return The Latitude in Degrees, Minutes and Seconds according to TS 23.032 [14], section 6.1 Point.<br>
     * Value returned coding:<ul>
         * <li>In Octet 1 bit 8 will be used as Sign bit.
         * <li>For the seconds, only taking the whole number and not decimal numbers.<br>
         *         Octet 1 (b8 ... b1): I0000000 (I: Sign bit)  where, I = 0 indicates North and I = 1 indicates South<br>
         *         Octet 2 (b8 ... b1): DDDDDDDD (D: Degrees, unsigned integer value)<br>
         *         Octet 3 (b8 ... b1): MMMMMMMM (M: Minutes, unsigned integer value )<br>
         *         Octet 4 (b8 ... b1): SSSSSSSS (S: Seconds, unsigned integer value )</ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_INFORMATION</code> if empty data was returned in Geographical Location reporting envelope (i.e. Geographical Location reporting
     * Tag, Length, and Device Identities only).
     *      <li><code>UNABLE_TO_PROCESS_COMMAND</code> if data returned in Geographical Location reporting envelope
     * does not include any of the sentences listed in TS 31.111[7].
     * </ul>
     */
    public int getLatitude() ;

    /**
     * Gives the Longitude of the geographical location in Degrees, Minutes and Seconds. <br>
     * Precison to whole second is applied for GAD and NMEA when extracting the Longitude information. <br>
     * When ME answer with GAD shape:<ul>
     *  When GAD shape is Polygon:<ul>
         * <li>The returned value is the Centroid of the Polygon which is the average point of all the latitude and longitude samples,
         * as described in described in TS 23.032 [14] section 7.3.4 Polygon.
         * <li>The Centroid of a non-self-intersecting closed polygon is defined by n vertices (x0,y0), (x1,y1), ..., (xn-1,yn-1) is the point (Cx, Cy),
         *     with:<br>
         *         Cx = (x0+x1+x2+---------+xn)/n<br>
         *         Cy= (y0+y1+y2+-----------+yn)/n<br>
         *     Where x and y are the longitude and latitude of each points respectively.</ul>
         * <li>Absolute Longitude(X) is obtained using the formula specified TS 23.032 [14] Section 6.1 Point.
         * <li>Using the Absolute Longitude X:<br>
         *     DD = Integer degrees are equal to the integer part of the decimal degrees<br>
         *     MM = Integer of ((X - DD) * 60)<br>
         *     SS = (X - DD - MM/60) * 3600</ul>
        * When ME answer with NMEA format: <ul>
        * <li>The Longitude shall be returned if present in the NMEA sentence, as a result of the conversion to the format of the returned data defined below.
         *     The returned data shall be able to provide at least a precision of a whole minute if the Longitude in the NMEA sentence provides so.
        * <li>Only the sentences listed in TS 31.111[7] (i.e. $--RMC, $--GGA, $--GLL, $--GNS) could be used.
        * <li>If two of these sentences are provided in geolocation reporting envelope,only the first NMEA sentence given in
        * the envelope will used to retrieve the Longitude.
        * <li>If none of these sentences are provided in geolocation reporting envelope, UNABLE_TO_PROCESS_COMMAND exception is thrown.
         * <li>Longitude field from NMEA sentence is coded in ASCII (DDMM.mm).
         * <li>Decimal representation is interpreted as:
         *         DD = Remaining digits to the left of MM
         *         MM = Two Digits immediately to the left of the decimal point
         *         mm = Fraction of Minutes
         *         SS = .mm * 60</ul>
     * @return The Longitude in Degrees, Minutes and Seconds according to TS 23.032 [14], section 6.1 Point.<br>
     * Value returned coding:<ul>
         * <li>In Octet 1 bit 8 will be used as Sign bit.
         * <li>For the seconds, only taking the whole number and not decimal numbers.<br>
         *         Octet 1 (b8 ... b1): I0000000 (I: Sign bit) where, I = 0 indicates East and I = 1 indicates West<br>
         *         Octet 2 (b8 ... b1): DDDDDDDD (D: Degrees, unsigned integer value)<br>
         *         Octet 3 (b8 ... b1): MMMMMMMM (M: Minutes, unsigned integer value )<br>
         *         Octet 4 (b8 ... b1): SSSSSSSS (S: Seconds, unsigned integer value )</ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
     *      <li><code>INCORRECT_INFORMATION</code> if empty data was returned in Geographical Location reporting envelope (i.e. Geographical Location reporting
     * Tag, Length, and Device Identities only).
     *      <li><code>UNABLE_TO_PROCESS_COMMAND</code> if data returned in Geographical Location reporting envelope
     * does not include any of the sentences listed in TS 31.111[7].
     * </ul>
     */
    public int getLongitude() ;

    /**
     * Gives the Altitude of the geographical location in meters. <br>
        * When ME answer with GAD format: <ul>
            * <li>If the shape does not include the Altitude, an exception is thrown, UNABLE_TO_PROCESS_COMMAND.</ul>
        * When ME answer with NMEA format: <ul>
            * <li>The Altitude is calculated from Altitude w.r.t. Mean Sea Level and Geoidal Separation fields.<br>
            *     NMEA Altitude = Altitude w.r.t. Mean Sea Level (H) + Geoidal Separation (N)
            * <li>Only the sentences listed in TS 31.111[7] (i.e. $--RMC, $--GGA, $--GLL, $--GNS) could be used.
            * <li>If the altitude is not present in NMEA sentence, an exception is thrown, UNABLE_TO_PROCESS_COMMAND.
            * <li>If two of these sentences are provided in geolocation reporting envelope, only the first NMEA sentence given in the envelope will used to retrieve the Altitude.
            * <li>If none of these sentences are provided in geolocation reporting envelope, UNABLE_TO_PROCESS_COMMAND exception is thrown.</ul>
     * @return The Altitude according to TS 23.032 [14], section 6.3 Altitude.
     *
     * @exception  GeoLocationException with the following reason codes: <ul>
        *      <li><code>INCORRECT_INFORMATION</code> if empty data was returned in Geographical Location reporting envelope (i.e. Geographical Location reporting
        * Tag, Length, and Device Identities only).
        *      <li><code>UNABLE_TO_PROCESS_COMMAND</code> if data returned in Geographical Location reporting envelope does not include any of the sentences listed in TS 31.111[7].
        * </ul>
     */
    public int getAltitude() ;

    /**
     * Gives a field from the Velocity Data of the geographical location  (speed in Km/h &amp; bearing/course in degrees). <br>
        * When ME answer with GAD format: <ul>
            * <li>The returned value is the Velocity Field according to the input parameter.
            * <li>If the Velocity Field requested is not present, UNABLE_TO_PROCESS_COMMAND exception is thrown.
            * <li>If the parameter specifies Horizontal Velocity Field, the value returned is Velocity Type from the GeoLocation Envelope,
            *     Bearing and Horizontal Speed, as defined in TS 23.032 [14] section 8.1 Horizontal Velocity.
            * <li>If the parameter specifies Vertical Velocity Field, the value returned is Velocity Type from the GeoLocation Envelope,
            *     Direction and Vertical Speed, as defined in TS 23.032 [14] section 8.2 Horizontal and Vertical Velocity.
            * <li>If the parameter specifies Horizontal Uncertainty Velocity Field, the value returned is Velocity Type from the GeoLocation Envelope and Horizontal Uncertainty Speed,
            *     as defined in TS 23.032 [14] section 8.3 Horizontal Velocity with Uncertainty.
            * <li>If the parameter specifies Vertical Uncertainty Velocity Field, the value returned is Velocity Type from the GeoLocation Envelope and Vertical Uncertainty Speed,
            *     as defined in TS 23.032 [14] section 8.4 Horizontal and Vertical Velocity with Uncertainty.</ul>
        * When ME answer with NMEA format: <ul>
            * <li>Only the sentences listed in TS 31.111[7] (i.e. $--RMC, $--GGA, $--GLL, $--GNS) could be used.
            * <li>The Velocity shall be returned if present in the NMEA RMC sentence for any other sentence type, UNABLE_TO_PROCESS_COMMAND exception is thrown.
            * <li>If none of these sentences are provided in geolocation reporting envelope, UNABLE_TO_PROCESS_COMMAND exception is thrown.
            * <li>For RMC Sentence, the Speed over ground and Course over ground is returned. The Speed over ground is converted from knots to Km/h.
            * <li>As RMC Sentence only returns the Speed over ground and Course over ground, it's only possible to set input parameter to GET_HORIZONTAL_VELOCITY.</ul>
     * @param bGetVelocityField Velocity Type byte to identify the Velocity Type to be returned.
     *      Possible values:<ul>
     *      <li><code>GET_HORIZONTAL_VELOCITY</code>
     *      <li><code>GET_VERTICAL_VELOCITY</code>
     *      <li><code>GET_HORIZONTAL_UNCERTAINTY_VELOCITY</code>
     *      <li><code>GET_VERTICAL_UNCERTAINTY_VELOCITY</code></ul>
     * @return The Velocity field according to TS 23.032 [14].<br>
     * When ME answer with GAD format:<ul>
     * <li>In the MSB byte:<br>
     * - Bit 8 to bit 5 (b8b7b6b5) will provide the Velocity Type received in the envelope according to TS 23.032 [14] Section 8.6<br>
     * - Bit 4 and bit 3 (b4b3) will be used to indicate the Velocity Field (bGetVelocityField parameter) requested<br>
     * - Bit 2 and bit 1 (b2b1) will be used to encode bearing or direction, depending of the Velocity Field returned.<br>
     * <li>For Horizontal Velocity Field, the integer returned will include the Velocity Type received and requested (cf above), Bearing and Horizontal Speed extracted from the Velocity coding type defined in sections 8.12 to 8.15 of TS 23.032 [14], where bearing will be encoded from the bit b1 of the MSB byte in the returned integer. Horizontal Speed will be encoded on LSB bytes of the returned integer. Bit b2 of the MSB byte is set to zero.<br>
     *     Octet 1 (b8 ... b1): TTTT000B (T: Velocity Type, B: Bearing)<br>
     *     Octet 2 (b8 ... b1): BBBBBBBB (B: Bearing)<br>
     *     Octet 3 (b8 ... b1): HHHHHHHH (H: Horizontal Speed higher byte)<br>
     *     Octet 4 (b8 ... b1): HHHHHHHH (H: Horizontal Speed lower byte)<br>
     * <li>For Vertical Velocity Field, the integer returned will include the Velocity Type received and requested (cf above) and the Vertical Speed with its direction extracted from the Velocity coding type defined in sections 8.13 and 8.15 of TS 23.032 [14]. Bit b2 of the MSB byte provides the direction, all other bits are set to zero until the LSB byte that contains the vertical velocity.<br>
     *     Octet 1 (b8 ... b1): TTTT01D0 (T: Velocity Type, D: Direction)<br>
     *     Octet 2 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 3 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 4 (b8 ... b1): VVVVVVVV (V: Vertical Speed)<br>
     * <li>For Horizontal Uncertainty Velocity Field, the integer returned will include the Velocity Type received and requested (cf above) and the Horizontal Uncertainty speed extracted from the Velocity coding type defined in sections 8.14 and 8.15 of TS 23.032 [14]. The Uncertainty Speed is assigned to the last byte of the returned Integer, all other bits are set to zero.<br>
     *     Octet 1 (b8 ... b1): TTTT1000 (T: Velocity Type)<br>
     *     Octet 2 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 3 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 4 (b8 ... b1): UUUUUUUU (U: Horizontal Uncertainty Speed)<br>
     * <li>For Vertical Uncertainty Velocity Field, the integer returned will include the Velocity Type received and requested (cf above) and the Vertical Uncertainty Speed extracted from the Velocity coding type defined in section 8.15 of TS 23.032 [14]. The Vertical Uncertainty Speed is assigned to the last byte of the returned Integer, all other bits are set to zero.<br>
     *     Octet 1 (b8 ... b1): TTTT1100 (T: Velocity Type )<br>
     *     Octet 2 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 3 (b8 ... b1): 00000000 (Not used)<br>
     *     Octet 4 (b8 ... b1): NNNNNNNN (N: Vertical Uncertainty Speed)</ul>
     * When ME answer with NMEA format:<ul>
     * <li>In the MSB, the bits b8 to b5 are defined to "1000" to identify NMEA RMC sentence.
     * <li>In the MSB, the bits b4 to b2 are defined to 00.
     * <li>Course over ground will be encoded from the bit b1 of the MSB byte and following MSB byte. Horizontal Speed (Speed over the Ground converted from knots to Km/h) will be encoded on LSB bytes of the returned integer.<br>
     *     Octet 1 (b8 ... b1): 1000000C (C: Course over ground in degrees)<br>
     *     Octet 2 (b8 ... b1): CCCCCCCC (C: Course over ground in degrees)<br>
     *     Octet 3 (b8 ... b1): SSSSSSSS (S: Speed over Ground in km/h)<br>
     *     Octet 4 (b8 ... b1): SSSSSSSS (S: Speed over Ground in km/h)</ul>
     * @exception  GeoLocationException with the following reason codes: <ul>
        *      <li><code>INCORRECT_INFORMATION</code> if empty data was returned in Geographical Location reporting envelope (i.e. Geographical Location reporting
        * Tag, Length, and Device Identities only).
        *      <li><code>INCORRECT_PARAMETERS</code> if incorrect parameter is set.
        *      <li><code>UNABLE_TO_PROCESS_COMMAND</code> if data returned in Geographical Location reporting envelope does not include any of the sentences listed in TS 31.111[7]
        * or the Velocity field requested is not present.
        * </ul>
     */
    public int getVelocity(byte bGetVelocityField) ;

    /**
     * This API return the Geo Location information provided in the geolocation reporting Envelope.
     * The byte buffer is formatted either using GAD shapes as defined in TS 23.032 [14] or NMEA format as defined in IEC 61162-1
     *  depending on the format answered by the ME. <br>
     * Returns empty buffer (i.e.: length = 0), when empty data was returned in Geographical Location reporting envelope (i.e.
     * Geographical Location Reporting Tag, Length, and Device Identities only). <br>
     * If the ME answer with NMEA format, only the sentences listed in TS 31.111[7] (i.e. $--RMC, $--GGA, $--GLL, $--GNS) could
     * be copied in the buffer. <br>
     * If two of these sentences are provided in geolocation reporting envelope,only the first NMEA sentence given in the
     * envelope will be copied in the buffer. <br>
     * If none of these sentences are provided in geolocation reporting envelope, empty buffer (i.e.: length = 0) is returned. <p>
     * @param buffer byte array where response of the operation shall be copied.
     * @param bOffset offset of the result in <code>buffer</code>
     * @param length length of data in <code>buffer</code>
     * @return actual length of the data copied into the <code>buffer</code>
     */
    public short getResponseBuffer(byte[] buffer, short bOffset, short length) ;
}
