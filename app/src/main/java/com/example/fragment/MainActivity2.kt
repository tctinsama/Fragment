package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.fragment.fragmentThree.Companion.newInstance
class ParamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_two)
        val ft: FragmentTransaction =
            supportFragmentManager.beginTransaction()
        val fragmentDemo = newInstance("Fragment", "Android")
        ft.replace(R.id.your_placeholder, fragmentDemo)
        ft.commit()
    }
}
