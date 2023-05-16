package com.example.roomdb.fragmentlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.roomdb.R

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     val view = return inflater.inflate(R.layout.fragment_list, container, false)

      view.floatingActionButton.setOnclickListener{
    findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        return view

    }

}