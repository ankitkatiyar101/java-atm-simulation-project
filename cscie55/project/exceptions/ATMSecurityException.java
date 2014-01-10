/**
 * $Id: ATMSecurityException.java, v 1.0 18/11/13 23:08 oscarfabra Exp $
 * {@code ATMSecurityException} Represents an exception used to report issues
 * regarding the ATM Processes.
 *
 * @author <a href="mailto:fabrasuarez@g.harvard.edu">Oscar Fabra</a>
 * @version 1.0
 * @since 18/11/13
 * @see ATMImpl
 */

package cscie55.project.exceptions;

/**
 * ATMException (RemoteException) used for reporting issues related with
 * authentication of accounts and authorization of transactions.
 */
public class ATMSecurityException extends ATMException
{
    public ATMSecurityException(String msg)
    {
        super(msg);
    }
}
