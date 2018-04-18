import org.junit.Rule;
import org.junit.Test;

import java.util.TimeZone;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EuropeMadridTest {

    @Rule public TZRule tzRule = new TZRule(TimeZone.getTimeZone("Europe/Madrid"));

    @Test
    public void checkDefaultTimeZone() {

        assertThat(TimeZone.getDefault(), equalTo(TimeZone.getTimeZone("Europe/Madrid")));
    }
}
