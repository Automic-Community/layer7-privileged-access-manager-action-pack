package com.automic.capam.actions;

import com.automic.capam.base.AbstractCAPAMAction;
import com.automic.capam.constants.Constants;
import com.automic.capam.constants.ExceptionConstants;
import com.automic.capam.exception.AutomicException;
import com.automic.capam.util.CommonUtil;
import com.automic.capam.util.ConsoleWriter;
import com.cloakware.cspm.client.CSPMClient;

/**
 * 
 * Fetch the value for provided alias
 * 
 * @author Vatsal
 *
 */
public class GetCredential extends AbstractCAPAMAction {

	/**
	 * Path to the key to retrieve its value.
	 */
	private String alias;


	/**
	 * Initializes a newly created {@code GetDataAction}
	 */
	public GetCredential() {
		addOption(Constants.ALIAS, true, "Alias");
	}

	@Override
	protected void executeSpecific() throws AutomicException {
		prepareAndValidateInputs();

		

			CSPMClient testInterface = new CSPMClient();
			testInterface.retrieveCredentials(alias);
			// get the result
						String statusCode = testInterface.getStatusCode();
			System.out.println("Status Code: " + statusCode);

			//set the return value
			if (statusCode.equals("400")) {
				ConsoleWriter.writeln("UsedId:	     " + testInterface.getUserId());
				ConsoleWriter.writeln("Password:    " + testInterface.getPassword());
			} 

			

		

	}

	public void prepareAndValidateInputs() throws AutomicException {
		alias = getOptionValue(Constants.ALIAS);
		if (!CommonUtil.checkNotEmpty(alias)) {
			throw new AutomicException(String.format(ExceptionConstants.INVALID_INPUT_PARAMETER, "Alias Name", alias));
		}

		
	}
}
