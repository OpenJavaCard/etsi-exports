package uicc.usim.geolocation ;

import javacard.framework.Shareable;

/**
 * The <code>GeoLocationEventListener</code> interface provides a callback interface for the
 * CAT Runtime Environment to send the result of a geographical operation to an applet.
 */
public interface GeoLocationEventListener extends Shareable {

    /**
     * Called by the CAT Runtime Environment to send the result of a geographical operation
     * to an applet. The result is formatted either in the format of GAD shapes defined in TS 23.032 [14] or in the format of NMEA sentences defined in IEC 61162-1.<p>
     * This method executes in the context of the applet instance. <p>
     * Exceptions thrown by this method are caught by the CAT Runtime Environment and ignored.
     *
     * @param geoLocInfo  object that provides the geo information received from the ME to the
     *        Applet. It's a <b>Temporary JCRE Entry Point Object</b>.
     */
    public void processGeoLocationEventListener(GeoLocationInfo geoLocInfo) ;

}
