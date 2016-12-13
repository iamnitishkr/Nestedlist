package com.iamnits.test;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetRequest {
    public InternetRequest(){}
    public static boolean isConnectedToInternet(Context context){
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null )
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
            {
                for (int i = 0; i < info.length; i++)
                {

                    if (info[i].getState() == NetworkInfo.State.CONNECTED && info[i].isConnectedOrConnecting())
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
