//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.Shareable;

/**
 * The <b>SIMView interface</b> is the interface between the GSM System Services
 * and any applet (SIM Toolkit or other). It offers some methods to communicate
 * with the GSM System Services without compromising the GSM file system integrity 
 * (e.g. ME file context, conflicting access to files ...).
 * All the methods are based on the commands of the GSM 51.011 specification.
 * This interface shall be implemented by a JCRE owned object. This 
 * interface is not intended for the activation of a SIM Toolkit applet.<p>
 *
 * @version 4.2.0
 * @author 3GPP TSG-T WG3, JCF SIM API TF 
 *
 * @see javacard.framework.Shareable
 * @see SIMViewException
 */
public interface SIMView extends Shareable {

    // ------------------------------- Constants ------------------------------
    /** File identifier : MF = 0x3F00                                        */
    public static final short FID_MF                = (short)0x3F00;

    /** DF under MF                                                          */
    /** File identifier : DF TELECOM = 0x7F10                                */
    public static final short FID_DF_TELECOM        = (short)0x7F10;
    /** File identifier : DF GSM = 0x7F20                                    */
    public static final short FID_DF_GSM            = (short)0x7F20;
    /** File identifier : DF DCS-1800 = 0x7F21                               */
    public static final short FID_DF_DCS_1800       = (short)0x7F21;
    /** File identifier : DF IS-41 = 0x7F22                                  */
    public static final short FID_DF_IS_41          = (short)0x7F22;
    /** File identifier : DF FP-CTS = 0x7F23                                 */
    public static final short FID_DF_FP_CTS         = (short)0x7F23;
    /** File identifier : DF PDC = 0x7F80                                    */
    public static final short FID_DF_PDC            = (short)0x7F80;
    /** File identifier : DF TETRA = 0x7F90                                  */
    public static final short FID_DF_TETRA          = (short)0x7F90;
    /** File identifier : DF TIA-EIA-136 = 0x7F24                            */
    public static final short FID_DF_TIA_EIA_136    = (short)0x7F24;
    /** File identifier : DF TIA-EIA-95 = 0x7F25                             */
    public static final short FID_DF_TIA_EIA_95     = (short)0x7F25;


    /** DF under DF TELECOM                                                  */
    /** @deprecated Replaced by {@link #FID_DF_GRAPHICS} in version 7.4.0    */ 
    public static final short FID_DF_Graphics       = (short)0x5F50;
    /** File identifier : DF Graphics = 0x5F50 (under DF TELECOM)            */
    public static final short FID_DF_GRAPHICS       = (short)0x5F50;


    /** DF under DF GSM                                                      */
    /** File identifier : DF IRIDIUM = 0x5F30 (under DF GSM)                 */
    public static final short FID_DF_IRIDIUM        = (short)0x5F30;
    /** File identifier : DF Globalstar = 0x5F31 (under DF GSM)              */
    public static final short FID_DF_GLOBALSTAR     = (short)0x5F31;
    /** File identifier : DF ICO = 0x5F32 (under DF GSM)                     */
    public static final short FID_DF_ICO            = (short)0x5F32;
    /** File identifier : DF ACeS = 0x5F33 (under DF GSM)                    */
    public static final short FID_DF_ACES           = (short)0x5F33;
    /** File identifier : DF PCS-1900 = 0x5F40 (under DF GSM)                */
    public static final short FID_DF_PCS_1900       = (short)0x5F40;
    /** File identifier : DF CTS = 0x5F60 (under DF GSM)                     */
    public static final short FID_DF_CTS            = (short)0x5F60;
    /** File identifier : DF SoLSA = 0x5F70 (under DF GSM)                   */
    public static final short FID_DF_SOLSA          = (short)0x5F70;
    /** File identifier : DF TIA-EIA-553= 0x5F40 (under DF GSM)              */
    public static final short FID_DF_TIA_EIA_553    = (short)0x5F40;
    /** File identifier : DF MExE = 0x5F3C (under DF GSM)                    */
    public static final short FID_DF_MEXE           = (short)0x5F3C;


    /** EF under MF                                                          */
    /** File identifier : EF ICCID = 0x2FE2 (under MF)                       */
    public static final short FID_EF_ICCID          = (short)0x2FE2;
    /** File identifier : EF ELP = 0x2F05 (under MF)                         */
    public static final short FID_EF_ELP            = (short)0x2F05;

    /** EF under DF TELECOM                                                  */
    /** File identifier : EF ADN = 0x6F3A (under DF TELECOM)                 */
    public static final short FID_EF_ADN            = (short)0x6F3A;
    /** File identifier : EF FDN = 0x6F3B (under DF TELECOM)                 */
    public static final short FID_EF_FDN            = (short)0x6F3B;
    /** File identifier : EF SMS = 0x6F3C (under DF TELECOM)                 */
    public static final short FID_EF_SMS            = (short)0x6F3C;
    /** File identifier : EF CCP = 0x6F3D (under DF TELECOM)                 */
    public static final short FID_EF_CCP            = (short)0x6F3D;
    /** File identifier : EF MSISDN = 0x6F40 (under DF TELECOM)              */
    public static final short FID_EF_MSISDN         = (short)0x6F40;
    /** File identifier : EF SMSP = 0x6F42 (under DF TELECOM)                */
    public static final short FID_EF_SMSP           = (short)0x6F42;
    /** File identifier : EF SMSS = 0x6F43 (under DF TELECOM)                */
    public static final short FID_EF_SMSS           = (short)0x6F43;
    /** File identifier : EF LND = 0x6F44 (under DF TELECOM)                 */
    public static final short FID_EF_LND            = (short)0x6F44;
    /** File identifier : EF SDN = 0x6F49 (under DF TELECOM)                 */
    public static final short FID_EF_SDN            = (short)0x6F49;
    /** File identifier : EF EXT1 = 0x6F4A (under DF TELECOM)                */
    public static final short FID_EF_EXT1           = (short)0x6F4A;
    /** File identifier : EF EXT2 = 0x6F4B (under DF TELECOM)                */
    public static final short FID_EF_EXT2           = (short)0x6F4B;
    /** File identifier : EF EXT3 = 0x6F4C (under DF TELECOM)                */
    public static final short FID_EF_EXT3           = (short)0x6F4C;
    /** File identifier : EF BDN = 0x6F4D (under DF TELECOM)                 */
    public static final short FID_EF_BDN            = (short)0x6F4D;
    /** File identifier : EF EXT4 = 0x6F4E (under DF TELECOM)                */
    public static final short FID_EF_EXT4           = (short)0x6F4E;
    /** File identifier : EF SMSR = 0x6F47 (under DF TELECOM)                */
    public static final short FID_EF_SMSR           = (short)0x6F47;
    /** File identifier : EF ECCP = 0x6F4F (under DF TELECOM)                */
    public static final short FID_EF_ECCP           = (short)0x6F4F;
    /** File identifier : EF CMI = 0x6F58 (under DF TELECOM)                 */
    public static final short FID_EF_CMI            = (short)0x6F58;


    /** EF under DF Graphics under DF TELECOM                                */
    /** File identifier : EF IMG = 0x4F20 (under DF Graphics)                */
    public static final short FID_EF_IMG            = (short)0x4F20;

    /** EF under DF GSM                                                      */
    /** File identifier : EF LP = 0x6F05 (under DF GSM)                      */
    public static final short FID_EF_LP             = (short)0x6F05;
    /** File identifier : EF IMSI = 0x6F07 (under DF GSM)                    */
    public static final short FID_EF_IMSI           = (short)0x6F07;
    /** File identifier : EF Kc = 0x6F20 (under DF GSM)                      */
    public static final short FID_EF_KC             = (short)0x6F20;
    /** File identifier : EF PLMNsel = 0x6F30 (under DF GSM)                 */
    public static final short FID_EF_PLMNSEL        = (short)0x6F30;
    /** File identifier : EF HPLMN = 0x6F31 (under DF GSM)                   */
    public static final short FID_EF_HPLMN          = (short)0x6F31;
    /** File identifier : EF ACMmax = 0x6F37 (under DF GSM)                  */
    public static final short FID_EF_ACMMAX         = (short)0x6F37;
    /** File identifier : EF SST = 0x6F38 (under DF GSM)                     */
    public static final short FID_EF_SST            = (short)0x6F38;
    /** File identifier : EF ACM = 0x6F39 (under DF GSM)                     */
    public static final short FID_EF_ACM            = (short)0x6F39;
    /** File identifier : EF GID1 = 0x6F3E (under DF GSM)                    */
    public static final short FID_EF_GID1           = (short)0x6F3E;
    /** File identifier : EF GID2 = 0x6F3F (under DF GSM)                    */
    public static final short FID_EF_GID2           = (short)0x6F3F;
    /** File identifier : EF SPN = 0x6F46 (under DF GSM)                     */
    public static final short FID_EF_SPN            = (short)0x6F46;
    /** File identifier : EF PUCT = 0x6F41 (under DF GSM)                    */
    public static final short FID_EF_PUCT           = (short)0x6F41;
    /** File identifier : EF CBMI = 0x6F45 (under DF GSM)                    */
    public static final short FID_EF_CBMI           = (short)0x6F45;
    /** File identifier : EF BCCH = 0x6F74 (under DF GSM)                    */
    public static final short FID_EF_BCCH           = (short)0x6F74;
    /** File identifier : EF ACC = 0x6F78 (under DF GSM)                     */
    public static final short FID_EF_ACC            = (short)0x6F78;
    /** File identifier : EF FPLMN = 0x6F7B (under DF GSM)                   */
    public static final short FID_EF_FPLMN          = (short)0x6F7B;
    /** File identifier : EF LOCI = 0x6F7E (under DF GSM)                    */
    public static final short FID_EF_LOCI           = (short)0x6F7E;
    /** File identifier : EF AD = 0x6FAD (under DF GSM)                      */
    public static final short FID_EF_AD             = (short)0x6FAD;
    /** File identifier : EF Phase = 0x6FAE (under DF GSM)                   */
    public static final short FID_EF_PHASE          = (short)0x6FAE;
    /** File identifier : EF VGCS = 0x6FB1 (under DF GSM)                    */
    public static final short FID_EF_VGCS           = (short)0x6FB1;
    /** File identifier : EF VGCSS = 0x6FB2 (under DF GSM)                   */
    public static final short FID_EF_VGCSS          = (short)0x6FB2;
    /** File identifier : EF VBS = 0x6FB3 (under DF GSM)                     */
    public static final short FID_EF_VBS            = (short)0x6FB3;
    /** File identifier : EF VBSS = 0x6FB4 (under DF GSM)                    */
    public static final short FID_EF_VBSS           = (short)0x6FB4;
    /** File identifier : EF eMLPP = 0x6FB5 (under DF GSM)                   */
    public static final short FID_EF_EMLPP          = (short)0x6FB5;
    /** File identifier : EF AAeM = 0x6FB6 (under DF GSM)                    */
    public static final short FID_EF_AAEM           = (short)0x6FB6;
    /** File identifier : EF CBMID = 0x6F48 (under DF GSM)                   */
    public static final short FID_EF_CBMID          = (short)0x6F48;
    /** File identifier : EF ECC = 0x6FB7 (under DF GSM)                     */
    public static final short FID_EF_ECC            = (short)0x6FB7;
    /** File identifier : EF CBMIR = 0x6F50 (under DF GSM)                   */
    public static final short FID_EF_CBMIR          = (short)0x6F50;
    /** File identifier : EF DCK = 0x6F2C (under DF GSM)                     */
    public static final short FID_EF_DCK            = (short)0x6F2C;
    /** File identifier : EF CNL = 0x6F32 (under DF GSM)                     */
    public static final short FID_EF_CNL            = (short)0x6F32;
    /** File identifier : EF NIA = 0x6F51 (under DF GSM)                     */
    public static final short FID_EF_NIA            = (short)0x6F51;
    /** File identifier : EF KcGPRS = 0x6F52 (under DF GSM)                  */
    public static final short FID_EF_KCGPRS         = (short)0x6F52;
    /** File identifier : EF LOCIGPRS = 0x6F53 (under DF GSM)                */
    public static final short FID_EF_LOCIGPRS       = (short)0x6F53;
    /** File identifier : EF SUME = 0x6F54 (under DF GSM)                    */
    public static final short FID_EF_SUME           = (short)0x6F54;

    /** File identifier : EF PLMNwAcT= 0x6F60 (under DF GSM)                 */
    public static final short FID_EF_PLMNWACT       = (short)0x6F60;
    /** File identifier : EF OPLMNwAcT= 0x6F61  (under DF GSM)               */
    public static final short FID_EF_OPLMNWACT      = (short)0x6F61;
    /** File identifier : EF HPLMNwAcT= 0x6F62 (under DF GSM)                 */
    public static final short FID_EF_HPLMNWACT       = (short)0x6F62;
    /** File identifier : EF CPBCCH= 0x6F63(under DF GSM)                    */
    public static final short FID_EF_CPBCCH         = (short)0x6F63;
    /** File identifier : EF InvScan= 0x6F64(under DF GSM)                   */
    public static final short FID_EF_INVSCAN        = (short)0x6F64;


    /** EF under DF SoLSA (under DF GSM)                                      */
    /** File identifier : EF SAI = 0x4F30 (under DF SoLSA)                   */
    public static final short FID_EF_SAI            = (short)0x4F30;
    /** File identifier : EF SLL = 0x4F31 (under DF SoLSA)                   */
    public static final short FID_EF_SLL            = (short)0x4F31;

    /** EF under DF TIA-EIA-553(under DF GSM)                                */
    /** File identifier : EF SID = 0x4F80 (under DF TIA-EIA-553)             */
    public static final short FID_EF_SID            = (short)0x4F80;
    /** File identifier : EF GPI = 0x4F81 (under DF TIA-EIA-553)             */
    public static final short FID_EF_GPI            = (short)0x4F81;
    /** File identifier : EF IPC = 0x4F82 (under DF TIA-EIA-553)             */
    public static final short FID_EF_IPC            = (short)0x4F82;
    /** File identifier : EF COUNT = 0x4F83 (under DF TIA-EIA-553)           */
    public static final short FID_EF_COUNT          = (short)0x4F83;
    /** File identifier : EF NSID = 0x4F84 (under DF TIA-EIA-553)            */
    public static final short FID_EF_NSID           = (short)0x4F84;
    /** File identifier : EF PSID = 0x4F85 (under DF TIA-EIA-553)            */
    public static final short FID_EF_PSID           = (short)0x4F85;
    /** File identifier : EF NETSEL = 0x4F86 (under DF TIA-EIA-553)          */
    public static final short FID_EF_NETSEL         = (short)0x4F86;
    /** File identifier : EF SPL = 0x4F87 (under DF TIA-EIA-553)             */
    public static final short FID_EF_SPL            = (short)0x4F87;
    /** File identifier : EF MIN = 0x4F88 (under DF TIA-EIA-553)             */
    public static final short FID_EF_MIN            = (short)0x4F88;
    /** File identifier : EF ACCOLC = 0x4F89 (under DF TIA-EIA-553)          */
    public static final short FID_EF_ACCOLC         = (short)0x4F89;
    /** File identifier : EF FC1= 0x4F8A (under DF TIA-EIA-553)              */
    public static final short FID_EF_FC1            = (short)0x4F8A;
    /** File identifier : EF S_ESN = 0x4F8B (under DF TIA-EIA-553)           */
    public static final short FID_EF_S_ESN          = (short)0x4F8B;
    /** File identifier : EF CSID= 0x4F8C (under DF TIA-EIA-553)             */
    public static final short FID_EF_CSID           = (short)0x4F8C;
    /** File identifier : EF REG_THRESH = 0x4F8D (under DF TIA-EIA-553)      */
    public static final short FID_EF_REG_THRESH     = (short)0x4F8D;
    /** File identifier : EF CCCH = 0x4F8E (under DF TIA-EIA-553)            */
    public static final short FID_EF_CCCH           = (short)0x4F8E;
    /** File identifier : EF LDCC = 0x4F8F (under DF TIA-EIA-553)            */
    public static final short FID_EF_LDCC           = (short)0x4F8F;
    /** File identifier : EF GSM_RECON = 0x4F90 (under DF TIA-EIA-553)       */
    public static final short FID_EF_GSM_RECON      = (short)0x4F90;
    /** File identifier : EF AMPS_2_GSM = 0x4F91 (under DF TIA-EIA-553)      */
    public static final short FID_EF_AMPS_2_GSM     = (short)0x4F91;
    /** File identifier : EF AMPS_UI = 0x4F93 (under DF TIA-EIA-553)         */
    public static final short FID_EF_AMPS_UI        = (short)0x4F93;


    /** EF under DF MExE (under DF GSM)                                      */
    /** File identifier : EF MExE_ST= 0x4F40 (under DF MExE)                 */
    public static final short FID_EF_MEXE_ST        = (short)0x4F40;
    /** File identifier : EF ORPK= 0x4F41 (under DF MExE)                    */
    public static final short FID_EF_ORPK           = (short)0x4F41;
    /** File identifier : EF ARPK= 0x4F42 (under DF MExE)                    */
    public static final short FID_EF_ARPK           = (short)0x4F42;
    /** File identifier : EF TPRPK = 0x4F43 (under DF MExE)                  */
    public static final short FID_EF_TPRPK          = (short)0x4F43;


    /** Record access mode : next record = 0x02                              */
    public static final byte REC_ACC_MODE_NEXT              = (byte)0x02;
    /** Record access mode : previous record = 0x03                          */
    public static final byte REC_ACC_MODE_PREVIOUS          = (byte)0x03;
    /** Record access mode : absolute/current record = 0x04                  */
    public static final byte REC_ACC_MODE_ABSOLUTE_CURRENT  = (byte)0x04;

    /** Seek mode : from the beginning forward = 0x00                        */
    public static final byte SEEK_FROM_BEGINNING_FORWARD = (byte)0x00;
    /** Seek mode : from the end backward = 0x01                             */
    public static final byte SEEK_FROM_END_BACKWARD      = (byte)0x01;
    /** Seek mode : from the next location forward = 0x02                    */
    public static final byte SEEK_FROM_NEXT_FORWARD      = (byte)0x02;
    /** Seek mode : from the previous location backward = 0x03               */
    public static final byte SEEK_FROM_PREVIOUS_BACKWARD = (byte)0x03;


    // ------------------------------- API methods ----------------------------
    /**
     * SELECT command as defined in GSM 11.11 standard.<br>
     * By default, the MF is selected at the beginning of each applet activation
     * (current file = MF). This method selects a file of the GSM file system.
     * The file search starts at the current DF of the applet according to
     * the file search method described in GSM 11.11 specification. The current
     * DF or current EF and the current record pointer of the calling applet will
     * be changed after successful execution.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>fciOffset</code><em> or </em><code>fciLength</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no read is performed.</em>
     * <li><em>If </em><code>fciOffset+fciLength</code><em> is greater than </em><code>fci.length</code><em>, the length
     * of the </em><code>fci</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no status request is performed.</em> 
     * </ul> 
     *
     *
     * @param fid is the File Identifier of the file to be selected.
     * @param fci is the reference to the target byte array for FCI (File Control
     *        Information) of current file, coding is according to GSM 11.11.
     *        If <code>fci</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     * @param fciOffset is the offset in the <code>fci</code> buffer for the response data.
     * @param fciLength is the length of the required data in the <code>fci</code> byte array. 
     *        If the <code>fciLength</code> is greater than the length of the response, the whole 
     *	      response is copied into the <code>fci</code> buffer and the length of the response 
     *        is returned by the method. If the <code>fcilength</code> is smaller than the length 
     *	      of the response, the first part of the response is copied into the <code>fci</code>
     *        buffer and the <code>fciLength</code> is returned by the method.
     *
     * @return length of the data which have been written in the <code>fci</code> buffer
     *         (cannot be greater than <code>fciLength</code> parameter)
     *
     * @exception NullPointerException if <code>fci</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if operation would cause access of data outside 
     *         array bounds.
     * @exception SIMViewException in case of error<ul>
     *          <li><code>FILE_NOT_FOUND</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *          <li><code>INTERNAL_ERROR</code></ul>
     */
    public short select(short fid,
                        byte  fci[],
                        short fciOffset,
                        short fciLength) throws NullPointerException,
                                                ArrayIndexOutOfBoundsException,
                                                SIMViewException;

    /**
     * SELECT command as defined in GSM 11.11 standard.<br>
     * This SELECT method allows to update the current file without handling the
     * Select Response.
     * By default, the MF is selected at the beginning of each applet activation
     * (current file = MF). This method selects a file of the common GSM file
     * system. The file search starts at the current DF of the applet according
     * to the file search method described in GSM 11.11 specification. The current
     * DF or current EF and the current record pointer of the calling applet will
     * be changed after successful execution.
     *
     * @param fid is the File Identifier of the file to be selected.
     *
     * @exception SIMViewException in case of error <ul>
     *     		<li><code>FILE_NOT_FOUND</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *     		<li><code>INTERNAL_ERROR</code></ul>
     */
    public void select(short fid) throws SIMViewException;

    /**
     * STATUS command as defined in GSM 11.11 standard.<br>
     * This method returns the FCI (File Control Information) of the current DF
     * (or MF) of the calling applet.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>fciOffset</code><em> or </em><code>fciLength</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no read is performed.</em>
     * <li><em>If </em><code>fciOffset+fciLength</code><em> is greater than </em><code>fci.length</code><em>, the length
     * of the </em><code>fci</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no status request is performed.</em> 
     * </ul> 
     *
     * @param fci is the reference to the target byte array for FCI (File Control
     *        Information) of current DF (or MF), coding is according to GSM 11.11.
     *        If <code>fci</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     * @param fciOffset is the offset in the <code>fci</code> buffer for the response data.
     * @param fciLength is the length of the required data in the <code>fci</code> byte array.
     *	      If the <code>fciLength</code> is greater than the length of the response, the whole 
     *	      response is copied into the <code>fci</code> buffer and the length of the response 
     *        is returned by the method. If the <code>fcilength</code> is smaller than the length 
     *	      of the response, the first part of the response is copied into the <code>fci</code>
     *        buffer and the <code>fciLength</code> is returned by the method.
     *
     * @return length of the data which have been written in the <code>fci</code> buffer
     *         (cannot be greater than <code>fciLength</code> parameter)
     *
     * @exception NullPointerException if <code>fci</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if operation would cause access of data outside 
     *         array bounds.
     * @exception SIMViewException in case of error <ul>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short status(byte  fci[],
                        short fciOffset,
                        short fciLength) throws NullPointerException,
                                                ArrayIndexOutOfBoundsException,
                                                SIMViewException;

    /**
     * READ BINARY command as defined in GSM 11.11 standard.<br>
     * This method reads the data bytes of the current transparent EF of the
     * calling applet.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>respOffset</code><em> or </em><code>respLength</code><em> parameter is negative a </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no read is performed.</em>
     * <li><em>If </em><code>respOffset+respLength</code><em>is greater than </em><code>resp.length</code><em>, the length
     * of the </em><code>resp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no select is performed.</em> 
     * </ul> 
     *
     * @param fileOffset is the offset in the source transparent file.
     * @param resp is the reference to the response byte array for read data.
     * @param respOffset is the offset in the response byte array.
     * @param respLength is the number of bytes to read.
     *
     * @return <code>respOffset+respLength</code>
     *
     * @exception NullPointerException if <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if reading would cause access of data outside array bounds
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_FILE_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short readBinary(short fileOffset,
                            byte  resp[],
                            short respOffset,
                            short respLength) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     SIMViewException;

    /**
     * UPDATE BINARY command as defined in GSM 11.11 standard.<br>
     * This method updates the data bytes of the current transparent EF of
     * the calling applet.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>dataOffset</code><em> or </em><code>dataLength</code><em> parameter is negative a </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no update is performed.</em>
     * <li><em>If </em><code>dataOffset+dataLength</code><em> is greater than </em><code>data.length</code><em>, the length
     * of the </em><code>data</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no update is performed.</em> 
     * </ul> 
     *
     * @param fileOffset is the offset in the destination transparent file.
     * @param data is the reference to the source byte array for data to update.
     * @param dataOffset is the offset in the source byte array.
     * @param dataLength is the number of bytes to update.
     *
     * @exception NullPointerException if <code>data</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if updating would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_FILE_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void updateBinary(short fileOffset,
                             byte  data[],
                             short dataOffset,
                             short dataLength) throws   NullPointerException,
                                                        ArrayIndexOutOfBoundsException,
                                                        SIMViewException;

    /**
     * READ RECORD command as defined in GSM 11.11 standard.<br>
     * This method reads the data bytes of the current linear fixed/cyclic EF
     * of the calling applet. The current record pointer can be changed due to
     * the choosen mode.
     *     
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>respOffset</code><em> or </em><code>respLength</code><em> parameter is negative a </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no read is performed.</em>
     * <li><em>If </em><code>respOffset+respLength</code><em> is greater than </em><code>resp.length</code><em>, the length
     * of the </em><code>resp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no select is performed.</em> 
     * </ul> 
     *
     * @param recNumber is the record number.
     * @param mode is the mode for reading record, according to GSM 11.11.
     *        If <code>mode</code> is <code>REC_ACC_MODE_NEXT</code> and the record pointer is at the last record 
     *        the <code>RECORD_NUMBER_NOT_AVAILABLE SIMViewException</code> shall be thrown.
     *        If <code>mode</code> is <code>REC_ACC_MODE_PREVIOUS</code> and the record pointer is at the first record,
     *        the <code>RECORD_NUMBER_NOT_AVAILABLE SIMViewException</code> shall be thrown.
     * @param recOffset is the offset in the record for the data to read.
     * @param resp is the reference to the response byte array for read data.
     * @param respOffset is the offset in the response byte array.
     * @param respLength is the number of bytes to read.
     *
     * @return <code>respOffset+respLength</code>
     *
     * @exception NullPointerException if <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if reading would cause access of data outside array bounds
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *      	<li><code>RECORD_NUMBER_NOT_AVAILABLE</code>
     *      	<li><code>INVALID_MODE</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short readRecord(short recNumber,
                            byte  mode,
                            short recOffset,
                            byte  resp[],
                            short respOffset,
                            short respLength) throws     NullPointerException,
                                                         ArrayIndexOutOfBoundsException,
                                                         SIMViewException;

    /**
     * UPDATE RECORD command as defined in GSM 11.11 standard.<br>
     * This method updates the data bytes of the current linear fixed/cyclic EF
     * of the calling applet. The current record pointer can be changed due to
     * the choosen mode.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>dataOffset</code><em> or </em><code>dataLength</code><em> parameter is negative a </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no select is performed.</em>
     * <li><em>If </em><code>dataOffset+dataLength</code><em> is greater than </em><code>data.length</code><em>, the length
     * of the </em><code>data</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no update is performed.</em> 
     * </ul> 
     *
     * @param recNumber is the record number.
     * @param mode is the mode for updating record, according to GSM 11.11.
     *        If <code>mode</code> is <code>REC_ACC_MODE_NEXT</code> and the record pointer is at the last record 
     *        the <code>RECORD_NUMBER_NOT_AVAILABLE SIMViewException</code> shall be thrown.
     *        If <code>mode</code> is <code>REC_ACC_MODE_PREVIOUS</code> and the record pointer is at the first record,
     *        the <code>RECORD_NUMBER_NOT_AVAILABLE SIMViewException</code> shall be thrown.
     * @param recOffset is the offset in the record for the data to update.
     * @param data is the reference to the source byte array for data to update.
     * @param dataOffset is the offset in the source byte array.
     * @param dataLength is the number of bytes to update.
     *
     * @exception NullPointerException if <code>data</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if updating would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *      	<li><code>RECORD_NUMBER_NOT_AVAILABLE</code>
     *      	<li><code>INVALID_MODE</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void updateRecord(short recNumber,
                             byte  mode,
                             short recOffset,
                             byte  data[],
                             short dataOffset,
                             short dataLength) throws   NullPointerException,
                                                        ArrayIndexOutOfBoundsException,
                                                        SIMViewException;

    /**
     * SEEK command as defined in GSM 11.11 standard.<br>
     * This method seeks a pattern in the current linear fixed EF of the calling
     * applet.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>pattOffset</code><em> or </em><code>pattLength</code><em> parameter is negative a </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no seek is performed.</em>
     * <li><em>If </em><code>pattOffset+pattLength</code><em> is greater than </em><code>patt.length</code><em>, the length
     * of the </em><code>patt</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no seek is performed.</em> 
     * </ul> 
     *
     * @param mode is the seek mode, according to GSM 11.11 (no type information).
     *        If <code>mode</code> is <code>SEEK_FROM_NEXT_FORWARD</code> and the record pointer is at the last record 
     *        the <code>PATTERN_NOT_FOUND SIMViewException</code> shall be thrown.
     *        If <code>mode</code> is <code>SEEK_FROM_PREVIOUS_BACKWARD</code> and the record pointer is at the first record,
     *        the <code>PATTERN_NOT_FOUND SIMViewException</code> shall be thrown.
     * @param patt is the reference to the byte array containing the seek pattern.
     * @param pattOffset is the offset of the seek pattern in the byte array.
     * @param pattLength is the length of the seek pattern.
     *        If <code>pattLength</code> is greater than the current record size than 
     *        the <code>OUT_OF_RECORD_BOUNDARIES SIMViewException</code> shall be thrown.
     *        If <code>pattLength</code> is <code>zero</code> than <code>PATTERN_NOT_FOUND SIMViewException</code> shall be thrown.
     *
     * @return record number if pattern found
     *
     * @exception NullPointerException if <code>patt</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if seeking would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>PATTERN_NOT_FOUND</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>INVALID_MODE</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short seek(byte   mode,
                      byte[] patt,
                      short  pattOffset,
                      short  pattLength) throws  NullPointerException,
                                                ArrayIndexOutOfBoundsException,
                                                SIMViewException;

    /**
     * INCREASE command as defined in GSM 11.11 standard.<br>
     * This method increases the current cyclic EF record of the calling applet.
     * The response buffer will only contain the value of the increased record.
     *
     * <p>
     * Notes:<ul>
     * <li><em>If </em><code>incrOffset</code><em> or </em><code>respOffset</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
     * <em> exception is thrown and no increase is performed.</em>
     * <li><em>If </em><code>incrOffset</code><em> is greater than </em><code>incr.length</code><em>, the length
     * of the </em><code>incr</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no increase is performed.</em> 
     * <li><em>If </em><code>respOffset</code><em> is greater than </em><code>resp.length</code><em>, the length
     * of the </em><code>resp</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
     * and no increase is performed.</em> 
     * </ul> 
     *
     * @param incr is the reference to the source byte array, containing the
     *        value to add, on 3 bytes.
     * @param incrOffset is the offset in the source byte array.
     * @param resp is the reference to the response byte array for new record value.
     *        If <code>resp</code> buffer is smaller than the record size, the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     *        If <code>resp</code> buffer is bigger than the record size, the <code>resp</code> buffer is filled
     *        with the record value and left justified
     * @param respOffset is the offset in the response byte array.
     *
     * @return length of the valid data in the <code>resp</code> buffer
     *      (cannot be greater than the record size)
     *
     * @exception NullPointerException if <code>incr</code> or <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if increasing would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>MAX_VALUE_REACHED</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short increase(byte[] incr,
                          short  incrOffset,
                          byte[] resp,
                          short  respOffset) throws  NullPointerException,
                                                    ArrayIndexOutOfBoundsException,
                                                    SIMViewException;

    /**
     * INVALIDATE command as defined in GSM 11.11 standard.<br>
     * This method invalidates the currently selected EF of the calling applet.
     *
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void invalidate() throws SIMViewException;

    /**
     * REHABILITATE command as defined in GSM 11.11 standard.<br>
     * This method rehabilitates the currently selected EF of the calling applet.
     *
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void rehabilitate() throws SIMViewException;
}
