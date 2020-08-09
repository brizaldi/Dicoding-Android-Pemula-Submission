package com.brizaldi.dicodingandroid1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.brizaldi.dicodingandroid1.R
import com.brizaldi.dicodingandroid1.activity.DetailActivity
import com.brizaldi.dicodingandroid1.model.Cocktail
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/*
 * DicodingPemula
 * ListAdapter
 * Created by Bahri Rizaldi on 09/08/2020 14:51
 *
 */

class ListCocktailAdapter(private val listCocktail: ArrayList<Cocktail>) : RecyclerView.Adapter<ListCocktailAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCocktail.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, image, ingredients, instructions) = listCocktail[position]

        Glide.with(holder.itemView.context)
            .load(image)
            .apply(RequestOptions())
            .into(holder.img)

        holder.tvName.text = name

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_IMAGE, image)
            moveDetail.putExtra(DetailActivity.EXTRA_INGREDIENTS, ingredients)
            moveDetail.putExtra(DetailActivity.EXTRA_INSTRUCTIONS, instructions)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var img: ImageView = itemView.findViewById(R.id.img_item_image)
    }

}