package com.example.vfbank.data;

import android.content.Context;

import com.example.vfbank.Framework.util.AppConstants;
import com.example.vfbank.data.local.prefs.AppPreferencesHelper;
import com.example.vfbank.data.local.prefs.PreferencesHelper;

public class AppDataManager implements  DataManager {

    private PreferencesHelper mPrefHelper;

    public AppDataManager(Context context) {
        mPrefHelper = new AppPreferencesHelper(context, AppConstants.PREF_NAME);
    }

    @Override
    public void setNameState(Boolean isFather) {
        mPrefHelper.setNameState(isFather);
    }

    @Override
    public Boolean getNameState() {
        return mPrefHelper.getNameState();
    }

    @Override
    public void clear() {
        mPrefHelper.clear();
    }
}
