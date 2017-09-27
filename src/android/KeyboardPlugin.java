/**
 */
package com.example;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KeyboardPlugin extends CordovaPlugin {

  private InputMethodManager imm;
  private Boolean status;
  private Context context;

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    context = this.cordova.getActivity().getApplicationContext();
    imm = (InputMethodManager)getSystemService(context.INPUT_METHOD_SERVICE);
  }

  @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

      if (action.equals("enable")) {
        status = true;
        imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, 0);
      } else if (action.equals("disable")){
        status = true;
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
      }
    }

}
