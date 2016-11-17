package utils; /**
 * <p> .</p>
 * <p/>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2016</p>
 * Date: 11/16/2016<br>
 * Time: 5:46 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */

import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtils {

    private final static String RESOURCE_BUNDLE_FILE = "resources/application";

    private final static ResourceBundle RESOURCE_BUNDLE = getBundle();

    public static String getMessage(String aKey) {
        return RESOURCE_BUNDLE.getString(aKey);
    }

    /**
     * @param params positional parameters to be inserted in "{0}, {1}, etc."
     */
    public static String getMessage(String aKey, Object... params) {
        return MessageFormat.format(RESOURCE_BUNDLE.getString(aKey), params);
    }

    public static void addMessage(String clientId, FacesMessage msg) {
        FacesContext.getCurrentInstance().addMessage(clientId, msg);
    }

    public static void addMessage(String aMsgId) {
        addMessage(null, new FacesMessage(getMessage(aMsgId)));
    }

    public static void addMessage(String aMsgId, Object... params) {
        addMessage(null, new FacesMessage(getMessage(aMsgId, params)));
    }

    public static void addErrorMessage(String aMsgId) {
        addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, getMessage(aMsgId), null));
    }

    public static void addErrorMessage(String aMsgId, Object... params) {
        addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, getMessage(aMsgId, params), null));
    }

    public static void addErrorMessage(String clientId, String aMsgId, Object... params) {
        addMessage(clientId, new FacesMessage(FacesMessage.SEVERITY_ERROR, getMessage(aMsgId, params), null));
    }

    private static ResourceBundle getBundle() {

        if (FacesContext.getCurrentInstance() != null) {
            return ResourceBundle.getBundle(FacesContext.getCurrentInstance().getApplication().getMessageBundle());
        }

        return ResourceBundle.getBundle(RESOURCE_BUNDLE_FILE);
    }
}

