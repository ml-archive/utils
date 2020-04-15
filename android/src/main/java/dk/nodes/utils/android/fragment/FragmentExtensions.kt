package dk.nodes.utils.android.fragment

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import dk.nodes.utils.android.activity.hideKeyboard
import dk.nodes.utils.android.activity.setLightStatusBar
import dk.nodes.utils.android.activity.setStatusBarColor
import dk.nodes.utils.android.activity.showKeyboard
import dk.nodes.utils.android.context.longToast
import dk.nodes.utils.android.context.shortToast

fun Fragment.hideKeyboard() {
    activity?.hideKeyboard()
}

fun Fragment.showKeyboard() {
    activity?.showKeyboard()
}

fun Fragment.shortToast(text: CharSequence) {
    activity?.shortToast(text)
}

fun Fragment.shortToast(@StringRes id: Int) {
    activity?.shortToast(id)
}

fun Fragment.longToast(text: CharSequence) {
    activity?.longToast(text)
}

fun Fragment.longToast(@StringRes id: Int) {
    activity?.longToast(id)
}

fun Fragment.setStatusBarColor(color: Int, setLightStatusBarAutomatically: Boolean = true) {
    activity?.setStatusBarColor(color, setLightStatusBarAutomatically)
}

fun Fragment.setLightStatusBar(isEnabled: Boolean) {
    activity?.setLightStatusBar(isEnabled)
}