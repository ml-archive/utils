package dk.nodes.utils.android.view

import android.graphics.Outline
import android.graphics.Rect
import android.view.TouchDelegate
import android.view.View
import android.view.ViewOutlineProvider
import androidx.annotation.Dimension
import androidx.core.view.doOnLayout

fun View.increaseTouchTarget(@Dimension size: Int) {
    val parent = parent as View
    parent.doOnLayout {
        val touchArea = Rect()
        getHitRect(touchArea)
        touchArea.top -= size
        touchArea.bottom += size
        touchArea.left -= size
        touchArea.right += size
        parent.touchDelegate = TouchDelegate(touchArea, this)
    }
}

fun View.setCircularOutline(clipToOutline: Boolean = true) {
    outlineProvider = object : ViewOutlineProvider() {
        override fun getOutline(view: View, outline: Outline) {
            outline.setOval(Rect(0, 0, view.width, view.height))
            view.clipToOutline = clipToOutline
        }
    }
}

fun View.setRoundRectOutline(@Dimension radius: Float, clipToOutline: Boolean = true) {
    outlineProvider = object : ViewOutlineProvider() {
        override fun getOutline(view: View, outline: Outline) {
            outline.setRoundRect(0, 0, view.width, view.height, radius)
            view.clipToOutline = clipToOutline
        }
    }
}