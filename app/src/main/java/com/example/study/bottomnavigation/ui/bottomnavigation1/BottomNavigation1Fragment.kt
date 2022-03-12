package com.example.study.bottomnavigation.ui.bottomnavigation1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentBottomnavigation1Binding

class BottomNavigation1Fragment : Fragment() {

    private lateinit var viewModel: BottomNavigation1ViewModel
    private var _binding: FragmentBottomnavigation1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(BottomNavigation1ViewModel::class.java)
        _binding = FragmentBottomnavigation1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBottomnavigation1
        viewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}