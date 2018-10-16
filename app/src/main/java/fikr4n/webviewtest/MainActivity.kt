package fikr4n.webviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView.loadData(generateContent(), "text/html", "utf-8")
    }

    private fun generateContent() = "Start<br>Start<br>Start" + (1..100).joinToString("") { "<h1>$it</h1>" }
}
