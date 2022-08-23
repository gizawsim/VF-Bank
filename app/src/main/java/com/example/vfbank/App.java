package com.example.vfbank;


import android.app.Application;

import com.example.vfbank.data.AppDataManager;
import com.example.vfbank.data.DataManager;

public class App extends Application {

    private DataManager dataManager;

    private static App instance;

    public  static  synchronized App getInstance(){
        return  instance;
    }


    @Override
    public void onCreate(){
        super.onCreate();
        dataManager = new AppDataManager(this);
        instance = this;


    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
