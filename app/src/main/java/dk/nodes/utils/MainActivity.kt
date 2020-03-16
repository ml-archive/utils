package dk.nodes.utils

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dk.nodes.utils.android.context.shortToast
import dk.nodes.utils.android.resources.dp
import dk.nodes.utils.android.view.edittext.addDebouncedTextChangedListener
import dk.nodes.utils.kotlin.string.without
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.addDebouncedTextChangedListener(250) {
            Log.d("EditTextExtensions", "onTextChanged()")
        }

        Log.d("ResourcesExtensions", "Int dp = ${dp(1)}")
        Log.d("ResourcesExtensions", "Float dp = ${dp(1f)}")

        shortToast("Hello World".without("World").trimEnd())
    }
}
