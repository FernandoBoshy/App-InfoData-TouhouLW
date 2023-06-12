package com.example.touhouinfo2.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.touhouinfo2.Model.CHAR_ID_EXTRA
import com.example.touhouinfo2.Model.Characters

import com.example.touhouinfo2.R
import com.example.touhouinfo2.adapter.AdapterList
import com.example.touhouinfo2.adapter.DetailList
import com.example.touhouinfo2.databinding.FragmentListBinding
import com.example.touhouinfo2.interfaces.CharClickListener

class fragment_list : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: AdapterList
    private lateinit var characterList: MutableList<com.example.touhouinfo2.Model.Characters>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener {
            view?.findNavController()?.navigateUp() ?: R.id.fragment_main
//            activity?.onBackPressedDispatcher?.onBackPressed()
        }

        characterList = ArrayList<Characters>()
        getCharacter()

        adapter = AdapterList(characterList)

        binding.recyclerList.apply {
            layoutManager =GridLayoutManager(context, 3)
            setHasFixedSize(true)
            adapter = this@fragment_list.adapter
        }

        return binding.root
    }

    fun getCharacter(){

        //Mock
        val char1 = Characters(
            imageId = R.drawable.reimu1,
            name = "Reimu Hakurei",
            world = "L1",
            type = "Defense",
            weakness = arrayOf("Moon", "Metal"),
            strongness = arrayOf("Water", "Star")
        )

        val char2 = Characters(
            imageId = R.drawable.marisa,
             name = "Marisa Kirisame",
             world = "L1",
             type = "Attack",
             weakness = arrayOf("Moon", "Metal"),
             strongness = arrayOf("Water", "Star")
        )

        val char3 = Characters(
            imageId = R.drawable.sakuya,
            name = "Sakuya Izayoi",
            world = "L1",
            type = "Speed",
            weakness = arrayOf("Moon", "Metal"),
            strongness = arrayOf("Water", "Star")
        )

        val char4 = Characters(
            imageId = R.drawable.alice,
            name = "Alice Margatroid",
            world = "L1",
            type = "Tech",
            weakness = arrayOf("Moon", "Metal"),
            strongness = arrayOf("Water", "Star")
        )

        val char5 = Characters(
            imageId = R.drawable.reisen,
            name = "Reisen U Inaba",
            world = "L1",
            type = "Debuff",
            weakness = arrayOf("Moon", "Metal"),
            strongness = arrayOf("Water", "Star")
        )

        val char6 = Characters(
            imageId = R.drawable.suika,
            name = "Suika Ibuki",
            world = "L1",
            type = "Tech",
            weakness = arrayOf("Moon", "Metal"),
            strongness = arrayOf("Water", "Star")
        )

        for(x in 0..10){
            characterList.add(char1)
            characterList.add(char2)
            characterList.add(char3)
            characterList.add(char4)
            characterList.add(char5)
            characterList.add(char6)
        }

    }
    }
