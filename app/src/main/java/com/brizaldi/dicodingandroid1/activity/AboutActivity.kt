package com.brizaldi.dicodingandroid1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.brizaldi.dicodingandroid1.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        initActionBar()
        initData()
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.about)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    private fun initData() {
        val imageAbout: ImageView = findViewById(R.id.img_item_photo)

        val tImg = "https://avatars3.githubusercontent.com/u/41714881"

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imageAbout)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}