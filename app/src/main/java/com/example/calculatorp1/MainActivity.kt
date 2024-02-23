package com.example.calculatorp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculatorp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var displayText = "";
        val screen = findViewById<TextView>(R.id.textView);
        var previous: Double = 0.0;
        var operand = "=";

        val equal = findViewById<Button>(R.id.ButtonRes);
        equal.setOnClickListener{
            val currentValue = screen.text.toString().toDouble();
            if(operand == "="){
                previous = currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "+"){
                previous += currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "-"){
                previous -= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "*"){
                previous *= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "/"){
                if(currentValue == 0.0){
                    screen.text = "Syntax Error: Cannot divide by 0";
                    previous = 0.0;
                }
                else{
                    previous /= currentValue;
                    screen.text = previous.toString();
                }

            }
            displayText = "";
            operand = "="
        }

        val sum = findViewById<Button>(R.id.ButtonSum);
        sum.setOnClickListener{
            val currentValue = screen.text.toString().toDouble();
            if(operand == "="){
                previous = currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "+"){
                previous += currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "-"){
                previous -= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "*"){
                previous *= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "/"){
                if(currentValue == 0.0){
                    screen.text = "Syntax Error: Cannot divide by 0";
                    previous = 0.0;
                }
                else{
                    previous /= currentValue;
                    screen.text = previous.toString();
                }

            }
            displayText = "";
            operand = "+"
        }

        val subtract = findViewById<Button>(R.id.ButtonSub);
        subtract.setOnClickListener{
            val currentValue = screen.text.toString().toDouble();
            if(operand == "="){
                previous = currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "+"){
                previous += currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "-"){
                previous -= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "*"){
                previous *= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "/"){
                if(currentValue == 0.0){
                    screen.text = "Syntax Error: Cannot divide by 0";
                    previous = 0.0;
                }
                else{
                    previous /= currentValue;
                    screen.text = previous.toString();
                }

            }
            displayText = "";
            operand = "-"
        }

        val times = findViewById<Button>(R.id.ButtonMul);
        times.setOnClickListener{
            val currentValue = screen.text.toString().toDouble();
            if(operand == "="){
                previous = currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "+"){
                previous += currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "-"){
                previous -= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "*"){
                previous *= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "/"){
                if(currentValue == 0.0){
                    screen.text = "Syntax Error: Cannot divide by 0";
                    previous = 0.0;
                }
                else{
                    previous /= currentValue;
                    screen.text = previous.toString();
                }

            }
            displayText = "";
            operand = "*"
        }

        val divide = findViewById<Button>(R.id.ButtonDiv);
        divide.setOnClickListener{
            val currentValue = screen.text.toString().toDouble();
            if(operand == "="){
                previous = currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "+"){
                previous += currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "-"){
                previous -= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "*"){
                previous *= currentValue;
                screen.text = previous.toString();
            }
            else if(operand == "/"){
                if(currentValue == 0.0){
                    screen.text = "Error";
                    previous = 0.0;
                }
                else{
                    previous /= currentValue;
                    screen.text = previous.toString();
                }

            }
            displayText = "";
            operand = "/"
        }


        val del = findViewById<Button>(R.id.ButtonDel);
        del.setOnClickListener{
            if(displayText.length > 0){
                displayText = displayText.dropLast(1);
            }
            if(displayText.length == 0){
                screen.text = "0";
            }
            else{
                screen.text = displayText;
            }
        }

        val clear = findViewById<Button>(R.id.ButtonC);
        clear.setOnClickListener{
            displayText = "";
            screen.text = "0";
        }

        val clearE = findViewById<Button>(R.id.ButtonCE);
        clearE.setOnClickListener{
            displayText = "";
            operand = "=";
            previous = 0.0;
            screen.text = "0";
        }


        val one = findViewById<Button>(R.id.Button1);
        one.setOnClickListener{
            displayText += "1";
            screen.text = displayText;
        }

        val two = findViewById<Button>(R.id.Button2);
        two.setOnClickListener{
            displayText += "2";
            screen.text = displayText;
        }

        val three = findViewById<Button>(R.id.Button3);
        three.setOnClickListener{
            displayText += "3";
            screen.text = displayText;
        }

        val four = findViewById<Button>(R.id.Button4);
        four.setOnClickListener{
            displayText += "4";
            screen.text = displayText;
        }

        val five = findViewById<Button>(R.id.Button5);
        five.setOnClickListener{
            displayText += "5";
            screen.text = displayText;
        }

        val six = findViewById<Button>(R.id.Button6);
        six.setOnClickListener{
            displayText += "6";
            screen.text = displayText;
        }

        val seven = findViewById<Button>(R.id.Button7);
        seven.setOnClickListener{
            displayText += "7";
            screen.text = displayText;
        }

        val eight = findViewById<Button>(R.id.Button8);
        eight.setOnClickListener{
            displayText += "8";
            screen.text = displayText;
        }

        val nine = findViewById<Button>(R.id.Button9);
        nine.setOnClickListener{
            displayText += "9";
            screen.text = displayText;
        }

        val zero = findViewById<Button>(R.id.Button0);
        zero.setOnClickListener{
            if(displayText.length > 0 || previous != 0.0){
                displayText += "0";
                screen.text = displayText;
            }

        }

        val zero2 = findViewById<Button>(R.id.Button00);
        zero2.setOnClickListener{
            if(displayText.length > 0 || previous != 0.0){
                displayText += "00";
                screen.text = displayText;
            }
        }

        val dot = findViewById<Button>(R.id.ButtonDot);
        dot.setOnClickListener{
            if(displayText.length == 0){
                displayText += "0.";
            }
            else if(!displayText.contains(".")){
                displayText += ".";
            }
            screen.text = displayText;
        }
    }
}