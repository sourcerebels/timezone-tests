import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.TimeZone;

public class TZRule extends TestWatcher {

    private final TimeZone defaultTimeZone;

    private final TimeZone timeZone;

    public TZRule(TimeZone timeZone) {
        defaultTimeZone = TimeZone.getDefault();
        this.timeZone = timeZone;
    }

    @Override
    protected void starting(Description description) {
        TimeZone.setDefault(timeZone);
    }

    @Override
    protected void finished(Description description) {
        TimeZone.setDefault(defaultTimeZone);
    }
}
