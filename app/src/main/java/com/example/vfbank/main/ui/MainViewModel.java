package com.example.vfbank.main.ui;

import com.example.vfbank.App;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel  extends ViewModel {

        public MutableLiveData<String> txtName = new MutableLiveData<>();

        public MainViewModel(){
                setName();
        }
        public void setName(){
                String name = "Gizaw";
                if (App.getInstance().getDataManager().getNameState())
                        name = "Simeon";
                txtName.setValue(name);
        }
        public  void onClickName(){
                Boolean isFather = App.getInstance().getDataManager().getNameState();
                App.getInstance().getDataManager().setNameState(!isFather);
                setName();
        }
}
