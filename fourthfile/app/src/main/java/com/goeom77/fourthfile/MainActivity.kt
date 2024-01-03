package com.goeom77.fourthfile

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.goeom77.fourthfile.databinding.ActivityMainBinding


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private var isDouble = false
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검은 화면에 흰글씨 1")
        sentenceList.add("검은 화면에 흰글씨 2")
        sentenceList.add("검은 화면에 흰글씨 3")
        sentenceList.add("검은 화면에 흰글씨 4")
        sentenceList.add("검은 화면에 흰글씨 5")
        sentenceList.add("검은 화면에 흰글씨 6")
        sentenceList.add("검은 화면에 흰글씨 7")
        sentenceList.add("검은 화면에 흰글씨 8")
        sentenceList.add("검은 화면에 흰글씨 9")
        sentenceList.add("검은 화면에 흰글씨 10")
        sentenceList.add("검은 화면에 흰글씨 11")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentence.setOnClickListener{
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.goodWordTextArea.text = sentenceList.random()
    }
    // 기본 화면
    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {

        if(isDouble) {
            finish()
        }
        isDouble = true
        Toast.makeText(this, "종료하실려면 한번 더 눌려주세요",Toast.LENGTH_LONG).show()

        Handler().postDelayed({
            isDouble = false
        },2000)
    }
}