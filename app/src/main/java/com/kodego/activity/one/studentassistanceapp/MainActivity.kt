package com.kodego.activity.one.studentassistanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.activity.one.studentassistanceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //login
        binding.containedButton.setOnClickListener(){
            var userName :String = binding.txtInput.text.toString()
            var password :String = binding.txtInput2.text.toString()
            checkCredential(userName, password)
    }
}

    private fun checkCredential(userName:String, password:String):Boolean{
        val correctUserName :String = "Ruel"
        val correctPassword :String = "pass123"
        val userProfile :String = "R.B. Hamor"
        val userCourse :String = "B.S. I. T."
        val userYear :String = "R.B. Hamor"
        val userSection :String = "B.S. I. T."

        val correctUserName2 :String = "Peter"
        val correctPassword2 :String = "pass456"

        if((correctUserName==userName)&&(correctPassword==password)){
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("nameID", userName)
            intent.putExtra("profileID", userProfile)
            intent.putExtra("courseID", userCourse)
            intent.putExtra("yearID", userYear)
            intent.putExtra("sectionID", userSection)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext, "logging in...", Toast.LENGTH_SHORT).show()
            return true
        }else if((correctUserName2==userName)&&(correctPassword2==password)){
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("nameID", userName)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext, "logging in...", Toast.LENGTH_SHORT).show()
            return true
        }else{
            Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            return false
        }
    }

}
