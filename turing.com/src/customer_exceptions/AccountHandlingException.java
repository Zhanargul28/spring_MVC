package customer_exceptions;

@SuppressWarnings("serial")
public class AccountHandlingException extends Exception {
	public AccountHandlingException(String errMesg) {
		super(errMesg);
	}
}
