package com.firehook.expandablelayout

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.firehook.expandablelayout.ui.theme.ExpandableLayoutTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expandableLayout = findViewById<ExpandableLayout>(R.id.expandable_layout)

        findViewById<TextView>(R.id.toggle_tv).setOnClickListener {
            expandableLayout.toggle()
        }
    }
}