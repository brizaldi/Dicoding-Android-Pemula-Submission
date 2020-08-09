package com.brizaldi.dicodingandroid1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.brizaldi.dicodingandroid1.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initData()
    }

    private fun initData() {
        val tvName: TextView = findViewById(R.id.cocktail_name)
        val imgCocktail: ImageView = findViewById(R.id.cocktail_image)
        val tvIngredients: TextView = findViewById(R.id.cocktail_ingredients)
        val tvInstructions: TextView = findViewById(R.id.cocktail_instructions)

        val name = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getStringExtra(EXTRA_IMAGE)
        val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        val instructions = intent.getStringExtra(EXTRA_INSTRUCTIONS)

        initActionBar(name ?: "Detail")

        tvName.text = name
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgCocktail)
        tvIngredients.text = ingredients
        tvInstructions.text = instructions
    }

    private fun initActionBar(name: String) {
        val actionbar = supportActionBar
        actionbar!!.title = name
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_INGREDIENTS = "extra_ingredients"
        const val EXTRA_INSTRUCTIONS = "extra_instructions"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}