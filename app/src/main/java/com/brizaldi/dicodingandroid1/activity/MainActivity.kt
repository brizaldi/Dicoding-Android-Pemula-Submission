package com.brizaldi.dicodingandroid1.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brizaldi.dicodingandroid1.R
import com.brizaldi.dicodingandroid1.adapter.ListCocktailAdapter
import com.brizaldi.dicodingandroid1.model.Cocktail
import com.brizaldi.dicodingandroid1.model.CocktailData


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var listCocktail: ArrayList<Cocktail> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initActionBar()
        initRecyclerView()
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title= getString(R.string.app_name)
    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_widget)
        recyclerView.setHasFixedSize(true)

        listCocktail.addAll(CocktailData.cocktailListData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListCocktailAdapter(listCocktail)
        recyclerView.adapter = listAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}