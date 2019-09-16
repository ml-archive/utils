package dk.nodes.utils.android.view.checkbox

import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.CheckBox
import dk.nodes.utils.android.text.setClickableSpan

fun CheckBox.setTextWithLink(text: String, clickableText: String, block: () -> Unit)  {
    val spannableString = SpannableString(text)
    spannableString.setClickableSpan(clickableText, true, block)
    setText(spannableString)
    movementMethod = LinkMovementMethod.getInstance()
}
