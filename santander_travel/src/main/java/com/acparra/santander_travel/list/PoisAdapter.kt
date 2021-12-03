package com.acparra.santander_travel.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.acparra.santander_travel.R
import com.acparra.santander_travel.model.PoiItem
import com.squareup.picasso.Picasso

class PoisAdapter(
    private val poisList: ArrayList<PoiItem>,
    private val onItemClicked: (PoiItem) -> Unit
) :

    RecyclerView.Adapter<PoisAdapter.poiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): poiViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_poi_item, parent, false)
        return poiViewHolder(view)
    }

    override fun onBindViewHolder(holder: poiViewHolder, position: Int) {
        val poi = poisList[position]
        holder.itemView.setOnClickListener { onItemClicked(poisList[position]) }
        holder.bind(poi)
    }

    override fun getItemCount(): Int = poisList.size

    class poiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var namePoiTextView: TextView = itemView.findViewById(R.id.name_poi_text_view)
        private var shortDetailPoiTextView: TextView =
            itemView.findViewById(R.id.short_detail_poi_text_view)
        private var punctuationPoiTextView: RatingBar =
            itemView.findViewById(R.id.punctuation_poi_text_view)
        private var pictureImageView: ImageView = itemView.findViewById(R.id.picture_image_view)

        fun bind(poi: PoiItem) {
            namePoiTextView.text = poi.name
            shortDetailPoiTextView.text = poi.shortDetail
            punctuationPoiTextView.rating = poi.score.toFloat()
            Picasso.get().load(poi.urlPicture).into(pictureImageView)
            //pictureImageView
        }
    }
}