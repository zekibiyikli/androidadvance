package com.example.study.bottomnavigation.ui.bottomnavigation2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentBottomnavigation2Binding

class BottomNavigation2Fragment : Fragment() {

    private lateinit var bottomNavigation2ViewModel: BottomNavigation2ViewModel
    private var _binding: FragmentBottomnavigation2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bottomNavigation2ViewModel = ViewModelProvider(this).get(BottomNavigation2ViewModel::class.java)
        _binding = FragmentBottomnavigation2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBottomnavigation2
        bottomNavigation2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}