package com.example.xand0

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Compiler.disable

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var firstscore: TextView
    private lateinit var secondscore: TextView
    private lateinit var reflesh: Button
    private var activePlayer = 1
    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()
    private var firstscore1 = 0
    private var secondscore2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Init()

    }

    override fun onClick(clickedView: View?) {
        if(clickedView is Button){
            var buttonNumber = 0
            when(clickedView.id){
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
                R.id.refresh -> reflesh()
            }
            if(buttonNumber !=0){
                playGame(clickedView , buttonNumber)

            }
        }
        firstscore.text=firstscore1.toString()
        secondscore.text=secondscore2.toString()
    }

    private fun playGame(clickedView: Button, buttonNumber: Int) {
        if(activePlayer == 1) {
            clickedView.text = "X"
            clickedView.setBackgroundColor(Color.GREEN)
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        }
        else{
            clickedView.text = "O"
            clickedView.setBackgroundColor(Color.BLUE)
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }
        clickedView.isEnabled=false
        check()

    }

    private fun check() {
        var winnerPlayer = 0
        if(firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(4) && firstPlayer.contains(1) && firstPlayer.contains(7)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(4) && secondPlayer.contains(1) && secondPlayer.contains(7)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(5) && firstPlayer.contains(2) && firstPlayer.contains(8)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(5) && secondPlayer.contains(2) && secondPlayer.contains(8)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(6) && firstPlayer.contains(3) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(6) && secondPlayer.contains(3) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if(firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)){
            winnerPlayer = 1
        }
        if(secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)){
            winnerPlayer = 2
        }
        if(winnerPlayer == 1){
            Toast.makeText(this,"first player win", Toast.LENGTH_LONG).show()
            firstscore1+=1
        }
        else if(winnerPlayer == 2){
            Toast.makeText(this,"second player win", Toast.LENGTH_LONG).show()
            secondscore2+=1
        }

    }
    private fun Init(){
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        firstscore = findViewById(R.id.firstscore)
        secondscore = findViewById(R.id.secondscore)
        reflesh = findViewById(R.id.refresh)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        reflesh.setOnClickListener(this)

    }
    fun reflesh(){
        firstPlayer.clear()
        secondPlayer.clear()

        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true

        button1.text=""
        button2.text=""
        button3.text=""
        button4.text=""
        button5.text=""
        button6.text=""
        button7.text=""
        button8.text=""
        button9.text=""
    }
}



