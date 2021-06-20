package com.example.toolbar102

import android.app.ActionBar
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.commit


class MainActivity : AppCompatActivity() {

    private val toolbarMain:Toolbar by lazy{findViewById(R.id.tbMain)}
    private val tvMain :TextView by lazy { findViewById(R.id.tvMainActivity) }
    private val tvScore :TextView by lazy { findViewById(R.id.tvScore) }
    private val ivActionBar :ImageView by lazy { findViewById(R.id.ivAB) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFragment = BlankFragment()

        setSupportActionBar(toolbarMain)


        tvMain.setOnClickListener{
            toolbarMain.title ="kjkjjkj"
             supportFragmentManager.commit{
                    replace(R.id.containerFragment,myFragment)
             }
         }

    }
}