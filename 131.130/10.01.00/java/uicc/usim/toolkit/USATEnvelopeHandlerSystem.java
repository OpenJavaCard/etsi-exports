package uicc.usim.toolkit;

/**
 * The <code>USATEnvelopeHandlerSystem</code> class provides the means to retrieve an instance of
 * an Object implementing the <code>USATEnvelopeHandler</code> interface.<p>
 *
 * @see USATEnvelopeHandler
 */
public final class USATEnvelopeHandlerSystem {

     /**
      */
      private USATEnvelopeHandlerSystem() { }

    
    /**
     * Returns the single system instance of the <code>USATEnvelopeHandler</code> class.
     * The applet shall get the reference of the handler at its triggering, the beginning of
     * the processToolkit method.
     *
     * @return     reference of the temporary JCRE entry point object of the <code>USATEnvelopeHandler</code>
     * @exception  ToolkitException  with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
     */
    public static USATEnvelopeHandler getTheHandler() throws uicc.toolkit.ToolkitException {
        return null;
    }
}

