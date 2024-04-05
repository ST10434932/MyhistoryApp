package com.example.st10434932.mymov
import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.st10434932.mymovieapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the button using the id we set on the user interface
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

        //add code to the button that happens when it is clicked
        clickMeButton?.setOnClickListener {
            Toast.makeText( this@MainActivity,
                 "Button clicked", Toast.LENGTH_LONG).show()

class MainActivity : AppCompatActivity(){
    @SuppressLint("MissingInflaredId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButyon = findViewById<Button>(R.id.clickMeButton)

        val welcomeTextView=
            findViewById<TextView>(R.id.welcomeTextView)
        val nameEditText = findViewById<EditText>(R.id.editText)

        clickMeButton?.setOnClickListener { it:View!
        welcomeTextView.text= "welcome,${nameEditText.text}!"}
    }


    }
}
    }


    }

}
}