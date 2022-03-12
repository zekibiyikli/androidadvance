package com.example.study.navigationdrawer.ui.navigationdrawer1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentNavigationdrawer1Binding

class NavigationDrawer1Fragment : Fragment() {

    private lateinit var navigationDrawer1ViewModel: NavigationDrawer1ViewModel
    private var _binding: FragmentNavigationdrawer1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navigationDrawer1ViewModel = ViewModelProvider(this).get(NavigationDrawer1ViewModel::class.java)
        _binding = FragmentNavigationdrawer1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        navigationDrawer1ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}