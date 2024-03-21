package com.example.mysurahapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysurahapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Model>
    private lateinit var nameSurah: Array<String>
    private lateinit var numberSurah: Array<String>
    private lateinit var arabicName: Array<String>
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        nameSurah = arrayOf(
            "Al - Fatihah (7 verses)",
            "Ash - Sharh (8 verses)",
            "At - Tin (8 verses)",
            "Al - Qadr (5 verses)",
            "Al - Bayyinah (8 verses)",
            "Al - Zilzala (8 verses)",
            "Al-Adiyat (11 verses)",
            "Al-Qariah (11 verses)",
            "At - Takathur (8 verses)",
            "Al-Asr (3 verses)",
            "Al - Humazah (9 verses)",
            "Al - Fil (5 verses)",
            "Quraish (4 verses)",
            "Al - Ma'an (7 verses)",
            "Al - Kauthar (4 verses)",
            "Al - Kafirun (6 verses)",
            "An - Nasr (3 verses)",
            "Al - Masad (5 verses)",
            "Al - Ikhlas (4 verses)",
            "Al - Falaq (5 verses)",
            "An - Nas (6 verses)"
        )
        numberSurah = arrayOf(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21"
        )
        arabicName = arrayOf(
            " سورة الفاتحة", //1
            "الشرح ", //2
            "في التين", //3
            "سورة القدر", //4
            "سورة البينة", //5
            "سورة الزلزالة", //6
            "الْعَادِيَاتِ", //7
            "الْقَارِعَةُ", // 8
            "التكاثر", //9
            "الْعَصْرِ", //10
            "الهمزة", //11
            "سورة الفيل", //12
            "قريش", //13
            "سورة المعاني", //14
            "سورة الكوثر", //15
            "سورة الكافرون", //16
            "سورة النصر", //17
            "المسد", //18
            "سورة الإخلاص", //19
            "سورة الفلق", //20
            "الناس" //21
        )



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Model>()
        getUserdata()

    }
    private fun getUserdata() {

        for (i in nameSurah.indices){
            val model = Model(nameSurah[i], numberSurah[i], arabicName[i])
            newArrayList.add(model)
        }

        binding.recyclerView.adapter = RecyclerAdapter(newArrayList)
    }

}
