package com.example.mysurahapp.ui.Surah

import com.example.mysurahapp.R

//
//import android.os.Bundle
//import android.os.Parcel
//import android.os.Parcelable
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.ViewModelProvider
//import com.example.mysurahapp.R
//import com.example.mysurahapp.databinding.FragmentSettingsBinding
//import com.example.mysurahapp.databinding.FragmentSurahBinding
//import com.example.mysurahapp.ui.Settings.SettingsFragment
//import com.example.mysurahapp.ui.Settings.SettingsViewModel
//
//class SurahFragment() : Fragment(), Parcelable {
//
//    private var _binding: FragmentSurahBinding? = null
//
//
//    override fun describeContents(): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun writeToParcel(dest: Parcel, flags: Int) {
//        TODO("Not yet implemented")
//    }
//}

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SurahFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_surah, container, false)
    }

}