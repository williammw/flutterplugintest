package io.flutter.borningmessage.borningmessage;

import android.app.Activity;
import android.app.Dialog;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;





/** BorningmessagePlugin s*/
public class BorningmessagePlugin implements MethodCallHandler {

    Activity context;
    MethodChannel methodChannel;

  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "borningmessage");
    channel.setMethodCallHandler(new BorningmessagePlugin(registrar.activity(), channel));
  }

    public BorningmessagePlugin(Activity activity, MethodChannel methodChannel) {
        this.context = activity;
        this.methodChannel = methodChannel;
        this.methodChannel.setMethodCallHandler(this);
    }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    }else if(call.method.equals("showAlertDialog")){
        Dialog dialog = new  Dialog(context);
        dialog.setTitle("Hi, My Name is Flutter from javaCode");
        dialog.show();
    } else {
      result.notImplemented();
    }
  }
}
