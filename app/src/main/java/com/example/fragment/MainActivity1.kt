package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_one)
        val ft: FragmentTransaction =
            supportFragmentManager.beginTransaction()
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.your_placeholder1, fragmentOne())
        ft.replace(R.id.your_placeholder2, fragmentTwo())
        // Complete the changes added above
        ft.commit()
    }
}