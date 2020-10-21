package dk.nodes.utils.android.view.clicklistener

import android.view.View

/**
 * A special [View.OnClickListener] for preventing quick double clicks.
 *
 * This class also helps avoiding a popular NavController IllegalArgumentException where a navigation destination
 * gets deemed unknown to a NavController when a user quickly triggers two navigation actions in a row.
 */
class OnSingleClickListener : View.OnClickListener {

    private val onClickListener: View.OnClickListener

    constructor(listener: View.OnClickListener) {
        onClickListener = listener
    }

    constructor(listener: (View) -> Unit) {
        onClickListener = View.OnClickListener(listener::invoke)
    }

    override fun onClick(v: View) {
        val currentTimeMillis = System.currentTimeMillis()
        if (currentTimeMillis >= previousClickTimeMillis + DELAY_MILLIS) {
            previousClickTimeMillis = currentTimeMillis
            onClickListener.onClick(v)
        }
    }

    companion object {
        // 300 milliseconds is the typical duration of a transition animation.
        private const val DELAY_MILLIS = 300L

        private var previousClickTimeMillis = 0L
    }
}