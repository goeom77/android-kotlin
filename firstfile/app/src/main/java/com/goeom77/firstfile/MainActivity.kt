package com.goeom77.firstfile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭돠었다는 것을 인식 + 메시지 올리기
        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여준다.
            var intent = Intent(this, BlogActivity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()
            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여준다.
            var intent = Intent(this, Blog2Activity::class.java)
            startActivity(intent)
        }


    }
}