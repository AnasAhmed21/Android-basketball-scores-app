package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A3P :Button=findViewById(R.id.A3P)
        val A2P :Button=findViewById(R.id.A2P)
        val A1P :Button=findViewById(R.id.A1P)
        val B3P :Button=findViewById(R.id.B3P)
        val B2P :Button=findViewById(R.id.B2P)
        val B1P :Button=findViewById(R.id.B1P)

        val Reset:Button=findViewById(R.id.RESET)

        val AScoreView :TextView=findViewById(R.id.AScore)
        val BScoreView :TextView=findViewById(R.id.BScore)

        var AScore:Int=0
        var BScore:Int=0

        AScoreView.text="$AScore"
        BScoreView.text="$BScore"

        A3P.setOnClickListener {
            AScore=AScore+3
            AScoreView.text="$AScore"
        }
        A2P.setOnClickListener {
            AScore=AScore+2
            AScoreView.text="$AScore"
        }
        A1P.setOnClickListener {
            AScore=AScore+1
            AScoreView.text="$AScore"
        }

        B3P.setOnClickListener {
            BScore=BScore+3
            BScoreView.text="$BScore"
        }
        B2P.setOnClickListener {
            BScore=BScore+2
            BScoreView.text="$BScore"
        }
        B1P.setOnClickListener {
            BScore=BScore+1
            BScoreView.text="$BScore"
        }


        Reset.setOnClickListener {
            AScore=0
            BScore=0
            AScoreView.text="$AScore"
            BScoreView.text="$BScore"
        }
    }

}