package dk.nodes.utils.android.resources

import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment

fun Context.dp(value : Int) = (value * resources.displayMetrics.density).toInt()

fun Context.dp(value : Float) = value * resources.displayMetrics.density

fun Context.sp(value : Int) = (value * resources.displayMetrics.scaledDensity).toInt()

fun Context.sp(value : Float) = value * resources.displayMetrics.scaledDensity


fun Fragment.dp(value : Int) = (value * resources.displayMetrics.density).toInt()

fun Fragment.dp(value : Float) = value * resources.displayMetrics.density

fun Fragment.sp(value : Int) = (value * resources.displayMetrics.scaledDensity).toInt()

fun Fragment.sp(value : Float) = value * resources.displayMetrics.scaledDensity


fun View.dp(value : Int) = (value * resources.displayMetrics.density).toInt()

fun View.dp(value : Float) = value * resources.displayMetrics.density

fun View.sp(value : Int) = (value * resources.displayMetrics.scaledDensity).toInt()

fun View.sp(value : Float) = value * resources.displayMetrics.scaledDensity