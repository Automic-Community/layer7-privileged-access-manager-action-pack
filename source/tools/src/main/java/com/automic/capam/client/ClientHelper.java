package com.automic.capam.client;

import com.automic.capam.base.AbstractAction;
import com.automic.capam.cli.Cli;
import com.automic.capam.cli.CliOptions;
import com.automic.capam.constants.Constants;
import com.automic.capam.constants.ExceptionConstants;
import com.automic.capam.exception.AutomicException;
import com.automic.capam.util.ConsoleWriter;

/**
 * Class to delegate the parameters to the respective classes based on the Action parameter.
 *
 */
public class ClientHelper {
    private static final String ABSOLUTEPATH = "com.automic.capam.actions";

    private ClientHelper() {
    }

    /**
     * Method to delegate parameters to an instance of {@link AbstractAction} based on the value of Action parameter.
     *
     * @param actionParameters
     *            of options with key as option name and value is option value
     * @throws AutomicException
     */

    public static void executeAction(String[] actionParameters) throws AutomicException{
        String actionName = new Cli(new CliOptions(), actionParameters).getOptionValue(Constants.ACTION);

        AbstractAction action = null;
        try {
            Class<?> classDefinition = Class.forName(getCanonicalName(actionName));
            action = (AbstractAction) classDefinition.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            ConsoleWriter.writeln(e);
            String msg = String.format(ExceptionConstants.INVALID_INPUT_PARAMETER, Constants.ACTION, actionName);
            throw new AutomicException(msg);
        }
        action.executeAction(actionParameters);
    }

    private static String getCanonicalName(String clsName) {
        return ABSOLUTEPATH + "." + clsName;
    }
}
