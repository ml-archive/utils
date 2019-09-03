package dk.nodes.utils

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dk.nodes.utils.android.resources.dp
import dk.nodes.utils.android.view.edittext.addDebouncedTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.addDebouncedTextChangedListener(250) {
            Log.d("EditTextExtensions", "onTextChanged()")
        }

        Log.d("ResourcesExtensions", "Int.dp = ${2.dp}")
        Log.d("ResourcesExtensions", "Float.dp = ${2f.dp}")
    }
}
