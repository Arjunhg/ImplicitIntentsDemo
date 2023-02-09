package com.example.implicitintents
/* We will se implicit function and also card view
* Match parent means it occupied whole area */
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weButton  = findViewById<CardView>(R.id.cardWeb) // Type os id is CardView
        val cameraButton = findViewById<CardView>(R.id.cardCamera)
        val ProfileButton = findViewById<CardView>(R.id.cardProfile)

        weButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW) //Action view means the information provided will be viewable by user
            intent.data = Uri.parse("https://developer.android.com/guide/components/intents-filters") //This is the information we will provide to user. Can provide any website name
            startActivity(intent)
        }
        cameraButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
        ProfileButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Arjunhg/ImplicitIntentsDemo")
            startActivity(intent)
        }
    }
}