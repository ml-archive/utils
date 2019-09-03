package dk.nodes.utils.android.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(
    @LayoutRes layoutRes: Int,
    attachToRoot: Boolean = false
) = LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)

operator fun ViewGroup.get(pos: Int): View = getChildAt(pos)

val ViewGroup.children: List<View> get() = (0 until childCount).map { getChildAt(it) }