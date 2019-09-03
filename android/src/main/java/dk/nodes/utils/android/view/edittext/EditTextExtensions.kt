package dk.nodes.utils.android.view.edittext

import android.text.Editable
import android.view.View
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import kotlinx.coroutines.*

fun EditText.addDebouncedTextChangedListener(
    thresholdMillis: Long = 300,
    action: (Editable?) -> Unit
) {
    var debouncedJob: Job? = null
    addTextChangedListener {
        debouncedJob?.cancel()
        debouncedJob = GlobalScope.launch(Dispatchers.Main) {
            delay(thresholdMillis)
            action.invoke(it)
        }
    }
    addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
        override fun onViewDetachedFromWindow(view: View?) {
            debouncedJob?.cancel()
        }

        override fun onViewAttachedToWindow(view: View?) {
            // Do nothing
        }
    })
}