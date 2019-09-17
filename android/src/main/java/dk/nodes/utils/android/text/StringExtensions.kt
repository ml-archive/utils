package dk.nodes.utils.android.text

import android.text.Spanned
import androidx.core.text.HtmlCompat


fun String.fromHtml(flags: Int = HtmlCompat.FROM_HTML_MODE_LEGACY): Spanned {
    return HtmlCompat.fromHtml(this, flags)
}