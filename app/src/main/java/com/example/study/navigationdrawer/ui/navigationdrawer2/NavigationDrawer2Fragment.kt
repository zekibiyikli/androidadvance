package com.example.study.navigationdrawer.ui.navigationdrawer2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentNavigationdrawer2Binding

class NavigationDrawer2Fragment : Fragment() {

    private lateinit var navigationDrawer2ViewModel: NavigationDrawer2ViewModel
    private var _binding: FragmentNavigationdrawer2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navigationDrawer2ViewModel = ViewModelProvider(this).get(NavigationDrawer2ViewModel::class.java)
        _binding = FragmentNavigationdrawer2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        navigationDrawer2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}