import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.*;
import javax.servlet.*;

// Stateless objects are always thread-safe
@ThreadSafe
public class StatelessFactorizer implements Servlet{
    // ... More implementation needed
    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(resp, factors);
    }
}
