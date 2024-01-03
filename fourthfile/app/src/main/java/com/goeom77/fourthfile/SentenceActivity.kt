package com.goeom77.fourthfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

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

        val adapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceViewItem)

        listview.adapter = adapter
    }

}