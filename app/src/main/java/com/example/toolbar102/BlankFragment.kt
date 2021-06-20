package com.example.toolbar102

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class BlankFragment : Fragment(R.layout.fragment_blank) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       ( activity as AppCompatActivity).supportActionBar?.title = "this is success"



        val conter =  parentFragmentManager.backStackEntryCount
        val tv = view.findViewById<TextView>(R.id.tvFragment)
        tv.text = conter.toString()
    }
}