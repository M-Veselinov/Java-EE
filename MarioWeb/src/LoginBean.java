import org.apache.commons.lang3.StringUtils;
import utils.MessageUtils;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * <p> .</p>
 * <p/>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2016</p>
 * Date: 11/16/2016<br>
 * Time: 3:29 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

    private static final String SUCCESS_LOGIN_REDIRECT = "/pages/success?faces-redirect=true";
    private static final String LOGIN_PAGE_REDIRECT = "/pages/login?faces-redirect=true";

    private static final long serialVersionUID = 1L;

    @Inject
    private HttpServletRequest request;

    private String username;
    private String password;

    @PostConstruct
    public void init() {
        //TODO
    }

    public String login() {
//        username = "";
//        password = "";
//        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Invalid Credentials"));
//            return "";
//        } else if ("admin".equals(username) && "123".equals(password)) {
//            request.getSession().setAttribute("LOGGED_USER", username);
//            return SUCCESS_LOGIN_REDIRECT;
//        }
//
//        MessageUtils.addErrorMessage("login.error.invalid.credentials");
        return "";
    }

    public String logout() {
        request.getSession().invalidate();
        return LOGIN_PAGE_REDIRECT;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
