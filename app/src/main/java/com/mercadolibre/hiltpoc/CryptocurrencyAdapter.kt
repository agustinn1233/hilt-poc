package com.mercadolibre.hiltpoc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

/**
 * Cryptocurrency adapter
 *
 * @property cryptocurrency
 * @constructor Create empty Cryptocurrency adapter
 */
class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>) :
    RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }

    override fun getItemCount() = cryptocurrency.size

    /**
     * View holder
     *
     * @constructor
     *
     * @param itemView
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        /**
         * Bind
         *
         * @param index
         */
        fun bind(index: Cryptocurrency) {
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.image))
            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }
}
