package com.kodego.activity.one.studentassistanceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.activity.one.studentassistanceapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get data from another screen
        var name: String? = intent.getStringExtra("nameID")
//        var profile: String? = intent.getStringExtra("profileID")
//        var course: String? = intent.getStringExtra("courseID")
//        var level: String? = intent.getStringExtra("yearID")
//        var section: String? = intent.getStringExtra("sectionID")

        binding.tvWelcome.text = "Welcome back $name"
//        binding.txtProfile.text = "Profile: $profile"
//        binding.txtCourse.text = "Course: $course"
//        binding.txtYear.text = "Profile: $level"
//        binding.txtSection.text = "Course: $section"
    }
}