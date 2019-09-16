package dk.nodes.utils.android.view.textview

import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.TextView
import dk.nodes.utils.android.text.setClickableSpan

fun TextView.setTextWithLink(text: String, clickableText: String, block: () -> Unit)  {
    val spannableString = SpannableString(text)
    spannableString.setClickableSpan(clickableText, true, block)
    setText(spannableString)
    movementMethod = LinkMovementMethod.getInstance()
}