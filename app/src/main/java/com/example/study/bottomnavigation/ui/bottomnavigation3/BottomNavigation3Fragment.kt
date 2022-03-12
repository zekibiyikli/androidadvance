package com.example.study.bottomnavigation.ui.bottomnavigation3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentBottomnavigation3Binding

class BottomNavigation3Fragment : Fragment() {

    private lateinit var bottomNavigation3ViewModel: BottomNavigation3ViewModel
    private var _binding: FragmentBottomnavigation3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bottomNavigation3ViewModel = ViewModelProvider(this).get(BottomNavigation3ViewModel::class.java)
        _binding = FragmentBottomnavigation3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBottomnavigation3
        bottomNavigation3ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}