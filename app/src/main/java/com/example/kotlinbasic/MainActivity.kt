package com.example.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlinbasic.basicsyntax.BasicSyntaxActivity
import com.example.kotlinbasic.basicsyntax.DataTypesActivity

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var btnBasicSyntax: Button
    private lateinit var btnDataTypes: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        interview()
    }

    private fun interview() {
        //TODO("Not yet implemented")
        btnBasicSyntax = findViewById(R.id.btnBasicSyntax)
        btnDataTypes = findViewById(R.id.btnDataTypes)
        btnBasicSyntax.setOnClickListener (this)
        btnDataTypes.setOnClickListener (this)
    }

    override fun onClick(view: View?) {
        //TODO("Not yet implemented")
        when(view?.id){
            R.id.btnBasicSyntax->{
                val intent = Intent(this, BasicSyntaxActivity::class.java)
                startActivity(intent)
            }
            R.id.btnDataTypes->{
                val  intent = Intent(this, DataTypesActivity::class.java)
                startActivity(intent)
            }
        }
    }
}