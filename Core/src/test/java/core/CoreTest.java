package core;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by s.sergienko on 16.12.2016.
 */
public class CoreTest {
    @Test
    public void isDependencyFromDaoIsWorkTest() throws Exception {
        Assert.assertThat(new Core().getHiFromDao(), Is.is("Hi, I am Dao)"));
    }
}