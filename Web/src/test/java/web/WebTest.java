package web;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by s.sergienko on 16.12.2016.
 */
public class WebTest {
    @Test
    public void testIsDependencyFromCoreIsWork() throws Exception {
        Assert.assertThat(new Web().getHiFromCore(), Is.is("Hi, I am Core)"));
    }
}