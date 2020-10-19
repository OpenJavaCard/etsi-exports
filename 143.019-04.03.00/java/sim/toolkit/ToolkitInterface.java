//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.Shareable;


/**
 * This interface must be implemented by a Toolkit applet (which extends 
 * the <code>javacard.framework.Applet</code> class) so that it can be 
 * triggered by the Toolkit Handler according to the registration information.
 * The Toolkit applet will have to implement the processToolkit shared method
 * so that it can be notified of the following events :
 *
 * <br><br><Table Border="1" Cellpadding="3"><tr bgcolor=#c0c0c0 align=center>
 *     <td> <b>Event</b>                               </td><td> <b>Description</b>                                         </td></tr>
 * <tr><td> EVENT_PROFILE_DOWNLOAD                     </td><td> Terminal Profile command reception                         </td></tr>
 * <tr><td> EVENT_FORMATTED_SMS_PP_ENV                 </td><td> 03.48 formatted envelope SMS-PP Data Download reception    </td></tr>
 * <tr><td> EVENT_FORMATTED_SMS_PP_UPD                 </td><td> 03.48 formatted Update Record EF SMS                       </td></tr>
 * <tr><td> EVENT_UNFORMATTED_SMS_PP_ENV               </td><td> Unformatted Envelope SMS-PP Data Download reception        </td></tr>
 * <tr><td> EVENT_UNFORMATTED_SMS_PP_UPD               </td><td> Unformatted Update Record EF SMS                           </td></tr>
 * <tr><td> EVENT_UNFORMATTED_SMS_CB                   </td><td> Unformatted Cell Broadcast Data Download command reception </td></tr>
 * <tr><td> EVENT_MENU_SELECTION                       </td><td> Envelope Menu Selection command reception                  </td></tr>
 * <tr><td> EVENT_MENU_SELECTION_HELP_REQUEST          </td><td> Envelope Menu Selection Help Request command reception     </td></tr>
 * <tr><td> EVENT_CALL_CONTROL_BY_SIM                  </td><td> Envelope Call Control by SIM command reception             </td></tr>
 * <tr><td> EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM      </td><td> Envelope MO Short Message Control by SIM command reception </td></tr>
 * <tr><td> EVENT_TIMER_EXPIRATION                     </td><td> Envelope Timer Expiration                                  </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_MT_CALL               </td><td> Envelope Event Download - MT call                          </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_CALL_CONNECTED        </td><td> Envelope Event Download - Call connected                   </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_CALL_DISCONNECTED     </td><td> Envelope Event Download - Call disconnected                </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_LOCATION_STATUS       </td><td> Envelope Event Download - Location status                  </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_USER_ACTIVITY         </td><td> Envelope Event Download - User activity                    </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_IDLE_SCREEN_AVAILABLE </td><td> Envelope Event Download - Idle screen available            </td></tr>
 * <tr><td> EVENT_EVENT_DOWNLOAD_CARD_READER_STATUS    </td><td> Envelope Event Download - Card Reader Status               </td></tr>
 * <tr><td> EVENT_STATUS_COMMAND                       </td><td> Status APDU command event                                  </td></tr>
 * <tr><td> EVENT_UNRECOGNIZED_ENVELOPE                </td><td> Unrecognized Envelope command reception                    </td></tr>
 * </Table><br>
 *
 * Toolkit applet example :<pre><code>
 * import javacard.framework.*;
 * import sim.toolkit.*;
 * //
 * // The HelloWorld class is a simple Toolkit applet, which may be used as an
 * // example to show how such an applet will be installed and registered and
 * // how it will be triggered.
 * //
 * public class HelloWorld extends Applet implements ToolkitInterface,ToolkitConstants {
 *     // data fields
 *     private static final byte CMD_QUALIFIER = (byte)0x80;
 *     private byte[] menuEntry = {'S','e','r','v','i','c','e','1'};
 *     private byte[] textBuf = {'H','e','l','l','o',' ','w','o','r','l','d',' ','!'};
 *     private ToolkitRegistry reg;
 *     //
 *     // Constructor of applet
 *     //
 *     public HelloWorld() {
 *         // get a Registry object...
 *         // ...and initialize it according to the applet characteristics
 *         reg.initMenuEntry(menuEntry, (short)0, (short)menuEntry.length, PRO_CMD_DISPLAY_TEXT, false, 0, 0);
 *     }
 *     //
 *     // Install method
 *     // *param bArray the array containing installation parameters
 *     // *param bOffset the starting offset in bArray
 *     // *param bLength the length in bytes of the parameter data in bArray
 *     //
 *     public static void install(byte bArray[], short bOffset, byte bLength) throws ISOException {
 *         // create and register applet
 *         HelloWorld HelloWorldApplet = new HelloWorld();
 *         HelloWorldApplet.register();
 *     }
 *     //
 *     // Process toolkit events
 *     // *param event the type of event to be processed
 *     // *exception ToolkitException
 *     //
 *     public void processToolkit(byte event) throws ToolkitException {
 *         // get the ProactiveHandler system instance
 *         ProactiveHandler proHdlr = ProactiveHandler.getTheHandler();
 *
 *         if (event == EVENT_MENU_SELECTION) {
 *             // prepare a Display Text command
 *             proHdlr.init((byte) PRO_CMD_DISPLAY_TEXT, (byte)CMD_QUALIFIER, (byte)0x02);
 *             proHdlr.appendTLV((byte)(TAG_TEXT_STRINGTAG_SET_CR), textBuf,
 *                              (short)0, (short)textBuf.length);
 *             proHdlr.send();
 *         }
 *     }
 * }
 * </code></pre>
 *
 * @version 4.3.0
 * @author 3GPP TSG-T WG3, JCF SIM API TF
 *
 * @see ToolkitRegistry
 * @see ToolkitException
 * @see ToolkitConstants
 */
public interface ToolkitInterface extends Shareable {


    // ------------------------------- Public methods -------------------------

	/** 
	 * This method is the standard toolkit event handling method of a Toolkit applet and 
	 * is called by the Toolkit Handler to process the current Toolkit event. 
	 * This method is invoked for notification of registered events.
	 * 
	 * @param event the type of event to be processed. 
	 *
     * @exception ToolkitException
	 *
	 * @see sim.toolkit.ToolkitRegistry#getEntry() 
	 */ 
	void processToolkit(byte event) throws ToolkitException; 
}
