package dk.nodes.utils.android.text

import android.os.Build
import android.text.*
import android.text.style.ClickableSpan
import android.view.View

fun String.fromHtml(): Spanned {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        @Suppress("DEPRECATION")
        return Html.fromHtml(this)
    }
}


fun SpannableString.setClickableSpan(link: String, underline: Boolean = true, onClick: () -> Unit) {
    val startingPosition = indexOf(link)
    val endingPosition = startingPosition + link.length
    if (startingPosition != -1) {
        setSpan(object : ClickableSpan() {

            override fun onClick(p0: View) {
                onClick.invoke()
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = underline
            }

        }, startingPosition, endingPosition, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    }
}