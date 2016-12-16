package core;

import dao.Dao;

/**
 * Created by s.sergienko on 16.12.2016.
 */
public class Core {
    public String getHi() {
        return "Hi, I am Core)";
    }

    public String getHiFromDao() {
        return new Dao().getHi();
    }
}
