package com.reactnativenatanaelvichcamera

import android.content.Intent
import android.provider.MediaStore
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class NatanaelvichCameraModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    private var reactContext: ReactApplicationContext = reactContext

    override fun getName(): String {
        return "NatanaelvichCamera"
    }

    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    fun openPickerImage(promise: Promise) {

      val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)

      reactContext.startActivityForResult(intent, 100, null)

      promise.resolve("Open Picker successful")

    }


}
