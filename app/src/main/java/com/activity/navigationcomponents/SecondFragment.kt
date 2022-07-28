package com.activity.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.activity.navigationcomponents.databinding.FragmentHomeBinding
import com.activity.navigationcomponents.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        //fetch data from the previous fragment
        val inputName = requireArguments().getString("user_name")
        val inputEmail = requireArguments().getString("user_email")
        binding.tvName.text = inputName
        binding.tvEmail.text = inputEmail

        binding.btnViewTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondFragment_to_termAndCondition)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}