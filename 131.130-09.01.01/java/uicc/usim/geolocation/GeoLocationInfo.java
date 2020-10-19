package uicc.usim.geolocation;

/**
 * An object implementing this interface gives access to the Geo Location information
 * received from the ME.
 *
 */
public interface GeoLocationInfo{
	/**
	 * Gives the Latitude of the geographical location
         * @return int the Latitude a negative value indicates South
	 */
	public int getLatitude();
        /**
         * Gives the Longitude of the geographical location
         * @return the Longitude according to TS 23.032 [14]
         */
	public int getLongitude();
        /**
         * Gives the Altitude of the geographical location
         * @return the Longitude according to TS 23.032 [14]
         */
	public int getAltitude();
        /**
         * Gives the Velocity of the geographical location
         * @return the Longitude according to TS 23.032 [14], -1 if no velocity is given in the
         *         geo location information.
         */
	public int getVelocity();
	/**
	 * The byte buffer is formatted using GAD shapes as defined in TS 23.032 [14]. <p>
	 * @param buffer byte array where response of the operation shall be copied.
	 * @param offset offset of the result in <code>buffer</code>
	 * @param length length of data in <code>buffer</code>
	 * @return actual length of the data copied into the <code>buffer</code>
	 */
	public short getResponseBuffer(byte[] buffer, short bOffset, short length);
}

