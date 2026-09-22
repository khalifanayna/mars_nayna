package com.example.mars_nayna.Pertemuan_4

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mars_nayna.R
import com.example.mars_nayna.databinding.ActivityFourthBinding
import com.example.mars_nayna.databinding.ActivityFourthResultBinding

class FourthResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityFourthResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        binding.button.setOnClickListener {
            val balik = binding.Balik.text.toString()
            Toast.makeText(
                this,
                "Pesan berhasil dikirim ke $balik",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}