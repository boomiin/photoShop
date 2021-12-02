package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.photoshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // on charge la premiere photo sur l'app
        var defaultImg: Int = R.drawable.photo_1
        binding.imagePreview.setImageResource(defaultImg)

        var PhotoProduct: ArrayList<PhotoProduct> = ArrayList<PhotoProduct>()



        // naviguer sur la deuxieme page
        binding.buyBtn.setOnClickListener({
            val intent = Intent(this, ShowProductActivity::class.java)
            startActivity(intent)
        })

    }
}