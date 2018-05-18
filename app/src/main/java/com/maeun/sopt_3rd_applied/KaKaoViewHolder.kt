package com.maeun.sopt_3rd_applied

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class KaKaoViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
    var kakaoProfile : ImageView = itemView!!.findViewById(R.id.item_tv_profile) as ImageView
    var kakaoName : TextView = itemView!!.findViewById(R.id.item_tv_name) as TextView
    var kakaoPreview : TextView = itemView!!.findViewById(R.id.item_tv_preview) as TextView
    var kakaoDate : TextView = itemView!!.findViewById(R.id.item_tv_date) as TextView
}