package net.iceice666.kusa.parcticeandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import net.iceice666.kusa.parcticeandroid.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private var counter = 0
    private lateinit var counterText: TextView
    private lateinit var addButton: Button
    private lateinit var subButton: Button
    private lateinit var resetButton: Button
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        counterText = binding.counter
        addButton = binding.btnAdd
        subButton = binding.btnSub
        resetButton = binding.btnReset


        addButton.setOnClickListener {
            counter++
            counterText.text = counter.toString()
        }
        subButton.setOnClickListener {
            counter--
            counterText.text = counter.toString()
        }
        resetButton.setOnClickListener {
            counter = 0
            counterText.text = counter.toString()
        }

    }
}



