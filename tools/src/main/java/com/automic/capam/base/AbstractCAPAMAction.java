package com.automic.capam.base;

import com.automic.capam.exception.AutomicException;

/**
 * This class defines the execution of any action.It provides some
 * initializations and validations on common inputs .The child actions will
 * implement its executeSpecific() method as per their own need.
 */
public abstract class AbstractCAPAMAction extends AbstractAction {

	

	/**
	 * Json File Path
	 */
	//protected String  caPamHome;
	

	public AbstractCAPAMAction() {
		//addOption(Constants.CA_PAM_HOME, true, "CA PAM Home Dir");
	}

	/**
	 * This method initializes the arguments and calls the execute method.
	 *
	 * @throws AutomicException
	 *             exception while executing an action
	 */
	public final void execute() throws AutomicException {
		prepareCommonInputs();
		executeSpecific();
	}

	private void prepareCommonInputs() throws AutomicException {
		/*caPamHome = getOptionValue(Constants.CA_PAM_HOME);
		if (!CommonUtil.checkNotEmpty(caPamHome)) {
			throw new AutomicException(String.format(ExceptionConstants.INVALID_INPUT_PARAMETER, "CA PAM Home", temp));
		}*/
		

	}

	/**
	 * Method to execute the action.
	 *
	 * @throws AutomicException
	 */
	protected abstract void executeSpecific() throws AutomicException;

}
