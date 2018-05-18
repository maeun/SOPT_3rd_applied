package com.maeun.sopt_3rd_applied

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.profile.*

class ProfileActivity : AppCompatActivity() {

    var image : Int = 0
    var name : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        image = intent.getIntExtra("profile_image",0)
        name = intent.getStringExtra("profile_name")
        profile_image.setImageResource(image)
        profile_name.setText(name)
    }
}