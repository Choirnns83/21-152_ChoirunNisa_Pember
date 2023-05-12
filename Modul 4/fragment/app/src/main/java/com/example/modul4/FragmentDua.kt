package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentDua : Fragment() {
    // TODO: Rename and change types of parameters
    var name: String? = null
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragsatu = FragmentSatu()
        val kembali: Button = view.findViewById(R.id.btnback)
        val fragmentManager = parentFragmentManager
        kembali.setOnClickListener{
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragsatu, FragmentSatu::class.java.simpleName)
                    .commit()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null){
            val nama = savedInstanceState.getString(EXTRA_NAME)
            name = nama
        }

        if (arguments != null){
            val top = arguments?.getString(EXTRA_TOP)
            val texttop: TextView? = view?.findViewById(R.id.outawal)
            val textname: TextView? = view?.findViewById(R.id.outnama)
            texttop?.text = top
            textname?.text = name
        }
    }

    companion object {
        val EXTRA_TOP = "extra_top"
        val EXTRA_NAME = "extra_name"
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentDua().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}