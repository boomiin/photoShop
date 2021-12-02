package com.example.photoshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.photoshop.databinding.ActivityMainBinding
import com.example.photoshop.databinding.ActivityShowProductBinding

class ShowProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_product)


        // retour a la page de presentation du produit
        binding.closeBtn.setOnClickListener({
            finish()
        })
    }
}