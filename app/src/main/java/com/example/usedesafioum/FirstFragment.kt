package com.use.desafio1_perguntados

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.navigation.fragment.findNavController
import com.example.usedesafioum.databinding.ActivityMainBinding.inflate
import com.example.usedesafioum.databinding.FragmentEighthBinding.inflate
import com.example.usedesafioum.databinding.FragmentFifthBinding.inflate
import com.example.usedesafioum.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.StartBtn.setOnClickListener {
            findNavController().navigate(
               FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            )
        }
    }

}