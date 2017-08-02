package com.example.okutech.alarmmanagerexample;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Description
 *
 * @author Abhilash Chikara
 * @version 1.0
 * @since 7/15/17
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Alarm called", ""+System.currentTimeMillis());
        Toast.makeText(context, "Me hu don",
                Toast.LENGTH_SHORT).show();
    }
}
