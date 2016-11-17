package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.Serializable;

/**
 * <p> .</p>
 * <p/>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2016</p>
 * Date: 11/17/2016<br>
 * Time: 10:52 AM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
@WebFilter(filterName = "AuthenticationFilter")
public class AuthenticationFilter implements Filter, Serializable {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
