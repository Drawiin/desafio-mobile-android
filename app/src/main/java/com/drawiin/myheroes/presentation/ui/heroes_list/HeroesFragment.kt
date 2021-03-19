package com.drawiin.myheroes.presentation.ui.heroes_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.drawiin.myheroes.databinding.FragmentHeroesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroesFragment : Fragment() {
    private lateinit var binding: FragmentHeroesBinding

    val viewModel: HeroesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHeroesBinding.inflate(inflater, container, false)
        viewModel
        subscribeUi()
        return binding.root
    }

    private fun subscribeUi() {
        viewModel.heroes.observe(viewLifecycleOwner) {
            binding.text.text = it.map { it.name }.reduce { acc, s -> acc + "\n" + s }
        }
    }
}