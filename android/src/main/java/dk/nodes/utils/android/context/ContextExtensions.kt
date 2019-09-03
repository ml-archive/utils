package dk.nodes.utils.android.context

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

fun Context.shortToast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Context.shortToast(@StringRes id: Int) {
    Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Context.longToast(@StringRes id: Int) {
    Toast.makeText(this, id, Toast.LENGTH_LONG).show()
}