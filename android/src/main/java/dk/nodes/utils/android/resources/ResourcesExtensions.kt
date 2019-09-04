package dk.nodes.utils.android.resources

import android.content.res.Resources
import kotlin.math.roundToInt

val Int.dp: Int get() = (this * Resources.getSystem().displayMetrics.density).roundToInt()

val Float.dp: Float get() = (this * Resources.getSystem().displayMetrics.density)

val Int.sp: Int get() = (this * Resources.getSystem().displayMetrics.scaledDensity).roundToInt()

val Float.sp: Float get() = (this * Resources.getSystem().displayMetrics.scaledDensity)