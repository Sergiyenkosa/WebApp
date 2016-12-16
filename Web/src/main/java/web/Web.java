package web;

import core.Core;

/**
 * Created by s.sergienko on 16.12.2016.
 */
public class Web {
    public String getHiFromCore() {
        return new Core().getHi();
    }
}
