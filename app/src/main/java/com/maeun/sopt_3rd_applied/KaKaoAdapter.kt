package com.maeun.sopt_3rd_applied


import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class KaKaoAdapter(var kakaoItems : ArrayList<KaKaoItem>) : RecyclerView.Adapter<KaKaoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KaKaoViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.kakao_item, parent, false)

        return KaKaoViewHolder(mainView)
    }

    override fun getItemCount(): Int = kakaoItems.size

    override fun onBindViewHolder(holder: KaKaoViewHolder, position: Int) {
        holder.kakaoProfile.setImageResource(kakaoItems[position].profile)
        holder.kakaoName.text = kakaoItems[position].name
        holder.kakaoPreview.text = kakaoItems[position].preView
        holder.kakaoDate.text = kakaoItems[position].date

        holder.kakaoProfile.setOnClickListener{
            val intent = Intent(holder.kakaoProfile.context, ProfileActivity::class.java)
            intent.putExtra("profile_image",kakaoItems[position].profile)
            intent.putExtra("profile_name",kakaoItems[position].name)
            holder.kakaoProfile.context.startActivity(intent)
        }

        holder.kakaoPreview.setOnClickListener {
            Toast.makeText(holder.kakaoPreview.context,kakaoItems[position].preView.toString(),Toast.LENGTH_SHORT).show()
        }
    }

}