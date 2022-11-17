package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart=1
    private var onResume=2
    private var onPause=3
    private var onStop=4
    private var onDestroy=5
    private lateinit var texto: EditText
    private lateinit var texto2: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
        texto=findViewById(R.id.etNombre)
        texto2=findViewById(R.id.etNombre2)

    }


    override fun onStart(){
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume(){
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause(){
        super.onPause()
        println("onPause $onPause")
    }
    override fun onStop(){
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        println("onDestroy $onDestroy")
    }


    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("nombre", texto.text.toString())
        savedInstanceState.putString("apellido", texto2.text.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        texto.setText(savedInstanceState.getString("nombre"))
        texto2.setText(savedInstanceState.getString("apellido"))


    }






}