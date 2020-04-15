package dk.nodes.utils.android.activity

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import dk.nodes.utils.android.window.setLightStatusBar
import dk.nodes.utils.android.window.setStatusBarColor

fun Activity.hideKeyboard() {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val windowToken = window.decorView.windowToken
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}

fun Activity.showKeyboard() {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val view = currentFocus ?: View(this)
    inputMethodManager.showSoftInput(view, 0)
}

fun Activity.setStatusBarColor(color: Int, setLightStatusBarAutomatically: Boolean = true) {
    window.setStatusBarColor(color, setLightStatusBarAutomatically)
}

fun Activity.setLightStatusBar(isEnabled: Boolean) {
    window.setLightStatusBar(isEnabled)
}