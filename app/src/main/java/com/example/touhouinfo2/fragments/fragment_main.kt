package com.example.touhouinfo2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.touhouinfo2.R
import com.example.touhouinfo2.databinding.FragmentMainBinding


class fragment_main : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.buttonList.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_main_to_fragment_list)
        }

        return binding.root
    }
}