package com.gerry.medialogtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class Media_ScannerStartReceiver extends BroadcastReceiver {
	static final String ACTION = "Intent.ACTION_MEDIA_SCANNER_STARTED";
	private static final String ACTIVITY_TAG = "LogDemo";

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String action = intent.getAction();
		Uri uri = intent.getData();
		Log.v(ACTIVITY_TAG, "BsptestActivity-------------------->" + action);
		Log.v(ACTIVITY_TAG, "BsptestActivity-------------------->" + uri);

	}
}
