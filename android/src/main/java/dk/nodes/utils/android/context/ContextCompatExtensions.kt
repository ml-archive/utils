package dk.nodes.utils.android.context

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat

fun ContextCompat.getNonNullDrawable(
    context: Context,
    @DrawableRes id: Int,
    @ColorInt fallbackColor: Int = Color.TRANSPARENT
): Drawable {
    return ContextCompat.getDrawable(context, id) ?: ColorDrawable(fallbackColor)
}