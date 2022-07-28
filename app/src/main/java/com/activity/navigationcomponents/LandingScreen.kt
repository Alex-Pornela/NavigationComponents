package com.activity.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.activity.navigationcomponents.databinding.FragmentLandingScreenBinding

class LandingScreen : Fragment() {

    private lateinit var binding: FragmentLandingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLandingScreenBinding.inflate(inflater,container,false)

        binding.apply {
            btnSignUp.setOnClickListener {
                it.findNavController().navigate(R.id.action_landingScreen_to_homeFragment)
            }

            btnTerms.setOnClickListener{
                it.findNavController().navigate(R.id.action_landingScreen_to_termAndCondition)
            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}