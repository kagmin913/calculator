package com.example.calculator

import android.app.Activity
import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNum = findViewById<EditText>(R.id.num1)
        var secondNum = findViewById<EditText>(R.id.num2)
        var answer = findViewById<TextView>(R.id.answer)
        val plusButton = findViewById<Button>(R.id.Plus)
        val minusButton = findViewById<Button>(R.id.Minus)
        val divideButton = findViewById<Button>(R.id.Divide)
        val multiplyButton = findViewById<Button>(R.id.multiply)

        var first = "?"
        var second = "!"

        plusButton.setOnClickListener{
            //firstNum.toString().toInt() + secondNum.toString().toInt()
//            Log.d(TAG, "first = ${firstNum.text.toString().toInt()} second = ${secondNum.text.toString().toInt()}")
//            first = firstNum.text.toString()
//            second = secondNum.text.toString()
//            Log.d(TAG, "first = ${first}")
            var ans : Int = firstNum.text.toString().toInt() + secondNum.text.toString().toInt()
            answer.text =ans.toString()
        }
        minusButton.setOnClickListener{
            //firstNum.toString().toInt() - secondNum.toString().toInt()
            var ans : Int = firstNum.text.toString().toInt() - secondNum.text.toString().toInt()
            answer.text =ans.toString()

            answer.text =ans.toString()
        }
        divideButton.setOnClickListener{
            //firstNum.toString().toInt() / secondNum.toString().toInt()
            var ans : Float = firstNum.text.toString().toFloat() / secondNum.text.toString().toFloat()
            answer.text =ans.toString()
            answer.text =ans.toString()
        }
        multiplyButton.setOnClickListener{
            //firstNum.toString().toInt() * secondNum.toString().toInt()
            var ans : Int = firstNum.text.toString().toInt() * secondNum.text.toString().toInt()
            answer.text =ans.toString()
            answer.text =ans.toString()
        }


    }


}