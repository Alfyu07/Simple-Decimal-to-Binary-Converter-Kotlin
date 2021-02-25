package com.alfyu.binaryconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtResult:TextView
    lateinit var convert:Button
    lateinit var textField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResult = findViewById(R.id.result)
        convert = findViewById(R.id.convert)
        textField = findViewById(R.id.desimalTF)

        convert.setOnClickListener {

            var input = textField.text.toString();
            var data:Int = 0;
            try{
                data = input.toInt()
            }catch (e:NumberFormatException){
                txtResult.setText("Please input the correct number format")
            }
            val binary = Integer.toBinaryString(data);
            txtResult.setText(binary)
        }
    }

}