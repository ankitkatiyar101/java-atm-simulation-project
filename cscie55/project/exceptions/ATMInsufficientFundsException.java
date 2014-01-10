/**
 * $Id: ATMInsufficientFundsException.java, v 1.0 18/11/13 23:08 oscarfabra Exp $
 * {@code ATMInsufficientFundsException} Represents an exception used to report }
 * issues regarding the ATM Processes.
 *
 * @author <a href="mailto:fabrasuarez@g.harvard.edu">Oscar Fabra</a>
 * @version 1.0
 * @since 26/12/13
 * @see ATMImpl
 */

package cscie55.project.exceptions;

/**
 * ATMException used for reporting issues related with insufficient funds.
 */
public class ATMInsufficientFundsException extends ATMException
{
    public ATMInsufficientFundsException(String msg)
    {
        super(msg);
    }
}
