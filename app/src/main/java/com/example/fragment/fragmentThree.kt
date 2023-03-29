package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class fragmentThree : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    lateinit var tv1: TextView
    lateinit var tv2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        6
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_fragment_three,
            container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState:
    Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv1 = requireView().findViewById<View>(R.id.tv1) as
                TextView
        tv2 = requireView().findViewById<View>(R.id.tv2) as
                TextView
        tv1.text = param1
        tv2.text = param2
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragmentThree().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
