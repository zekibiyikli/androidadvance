package com.example.study.navigationdrawer.ui.navigationdrawer3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.study.databinding.FragmentNavigationdrawer3Binding

class NavigationDrawer3Fragment : Fragment() {

    private lateinit var slideshowViewModel: NavigationDrawer3ViewModel
    private var _binding: FragmentNavigationdrawer3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel = ViewModelProvider(this).get(NavigationDrawer3ViewModel::class.java)
        _binding = FragmentNavigationdrawer3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}