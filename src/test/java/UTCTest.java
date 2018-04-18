import org.junit.Rule;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UTCTest {

    @Rule public TZRule tzRule = new TZRule(TimeZone.getTimeZone("Etc/UTC"));

    @Test
    public void checkDefaultTimeZone() {

        assertThat(TimeZone.getDefault(), equalTo(TimeZone.getTimeZone("Etc/UTC")));
    }
}
