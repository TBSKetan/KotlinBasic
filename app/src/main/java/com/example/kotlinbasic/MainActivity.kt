package com.example.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinbasic.basicsyntax.*
Addimport com.example.kotlinbasic.collections.ListCollectionActivity
import com.example.kotlinbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // create instance of the ActivityMainBinding,
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create instance of the ActivityMainBinding,
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root

        // binding.root returns the root layout,
        // which is activity_main.xml file itself
        //setContentView(bindingView.root)
        setContentView(view) 
        interview()
    }

    private fun interview() {
        //binding.btnBasicSyntax.setOnClickListener(this)
        binding.btnBasicSyntax.setOnClickListener { onClick(it) }
        binding.btnDataTypes.setOnClickListener { onClick(it) }
        binding.btnOperators.setOnClickListener { onClick(it) }
        binding.btnBooleans.setOnClickListener { onClick(it) }
        binding.btnStrings.setOnClickListener { onClick(it) }
        binding.btnArrays.setOnClickListener { onClick(it) }
        binding.btnRanges.setOnClickListener(this)
        binding.btnConditionExpression.setOnClickListener(this)
        binding.btnControlFlow.setOnClickListener(this)
        binding.btnTypeCheckingSmartCast.setOnClickListener(this)
        binding.btnFunction.setOnClickListener(this)
        binding.btnCollectionList.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnBasicSyntax -> {
                val intent = Intent(this, BasicSyntaxActivity::class.java)
                startActivity(intent)
            }
            R.id.btnDataTypes -> {
                val intent = Intent(this, DataTypesActivity::class.java)
                startActivity(intent)
            }
            R.id.btnOperators -> {
                val intent = Intent(this, OperatorsActivity::class.java)
                startActivity(intent)
            }
            R.id.btnBooleans -> {
                val intent = Intent(this, BooleansActivity::class.java)
                startActivity(intent)
            }
            R.id.btnStrings -> {
                val intent = Intent(this, StringsActivity::class.java)
                startActivity(intent)
            }
            R.id.btnArrays -> {
                val intent = Intent(this, ArrayActivity::class.java)
                startActivity(intent)
            }
            R.id.btnRanges -> {
                val intent = Intent(this, RangeActivity::class.java)
                startActivity(intent)
            }
            R.id.btnConditionExpression -> {
                val intent = Intent(this, ConditionalExpressionsActivity::class.java)
                startActivity(intent)
            }
            R.id.btnControlFlow -> {
                val intent = Intent(this, ControlFlowActivity::class.java)
                startActivity(intent)
            }
            R.id.btnTypeCheckingSmartCast -> {
                val intent = Intent(this, TypeCheckingSmartCastingActivity::class.java)
                startActivity(intent)
            }
            R.id.btnFunction->{
                val intent = Intent(this, FunctionActivity::class.java)
                startActivity(intent)

            }
            R.id.btnCollectionList->{
                val intent = Intent(this, ListCollectionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}