/**
 * 
 */
package com.automic.capam.client;

import java.util.Arrays;

import com.automic.capam.exception.AutomicException;
import com.automic.capam.exception.AutomicRuntimeException;
import com.automic.capam.util.CommonUtil;
import com.automic.capam.util.ConsoleWriter;

/**
 * @author shrutinambiar
 *
 */
public final class Client {
    private static final int RESPONSE_OK = 0;
    private static final int RESPONSE_NOT_OK = 1;

    private static final String ERRORMSG = "Please check the input parameters.";

    private Client() {
    }

    /**
     * Main method which will start the execution of an action on CA Harvest. This method will call the ClientHelper
     * class which will trigger the execution of specific action and then if action fails this main method will handle
     * the failed scenario and print the error message and system will exit with the respective response code.
     *
     * @param params
     *            array of parameters
     */
    public static void main(String[] params) {
    	System.out.println(Arrays.asList(params));
        int responseCode = RESPONSE_NOT_OK;
        try {
            ClientHelper.executeAction(params);
            responseCode = RESPONSE_OK;
        } catch (AutomicException | AutomicRuntimeException e) {
            ConsoleWriter.writeln(CommonUtil.formatErrorMessage(e.getMessage()));
            ConsoleWriter.writeln(CommonUtil.formatErrorMessage(ERRORMSG));
        } catch (Exception e) {
            ConsoleWriter.writeln(e);
            ConsoleWriter.writeln(CommonUtil.formatErrorMessage(ERRORMSG));
        }
        ConsoleWriter.writeln("****** Execution ends with response code : " + responseCode);
        ConsoleWriter.flush();
        System.exit(responseCode);
    }
}
