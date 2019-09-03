package dk.nodes.utils.android.fragment

import androidx.fragment.app.Fragment
import dk.nodes.utils.android.activity.hideKeyboard
import dk.nodes.utils.android.activity.showKeyboard

fun Fragment.hideKeyboard() {
    activity?.hideKeyboard()
}

fun Fragment.showKeyboard() {
    activity?.showKeyboard()
}