package dk.nodes.utils.android.window

import android.os.Build
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.graphics.ColorUtils

fun Window.setStatusBarColor(color: Int, setLightStatusBarAutomatically: Boolean = true) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        statusBarColor = color
    }
    if (setLightStatusBarAutomatically) {
        setLightStatusBar(ColorUtils.calculateLuminance(color) > 0.5)
    }
}

fun Window.setLightStatusBar(isEnabled: Boolean) {
    if (isEnabled) {
        applyLightStatusBar()
    } else {
        clearLightStatusBar()
    }
}

fun Window.applyLightStatusBar() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        var flags = decorView.systemUiVisibility
        flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        decorView.systemUiVisibility = flags
    }
}

fun Window.clearLightStatusBar() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        var flags = decorView.systemUiVisibility
        flags = flags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
        decorView.systemUiVisibility = flags
    }
}