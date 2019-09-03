package dk.nodes.utils.android.activity

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager

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