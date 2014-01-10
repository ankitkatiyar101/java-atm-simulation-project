/**
 * $Id: ATMInvalidAmountException.java, v 1.0 18/11/13 23:08 oscarfabra Exp $
 * {@code ATMInvalidAmountException} Represents an exception used to report
 * issues regarding the ATM Processes.
 *
 * @author <a href="mailto:fabrasuarez@g.harvard.edu">Oscar Fabra</a>
 * @version 1.0
 * @since 26/12/13
 * @see ATMImpl
 */

package cscie55.project.exceptions;

/**
 * ATMException used for reporting issues related with invalid amounts.
 */
public class ATMInvalidAmountException extends ATMException
{
    public ATMInvalidAmountException(String msg)
    {
        super(msg);
    }
}
