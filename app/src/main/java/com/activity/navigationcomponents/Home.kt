package com.activity.navigationcomponents

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.activity.navigationcomponents.databinding.FragmentHomeBinding

class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.btnSubmit.setOnClickListener {
            //to avoid null inputs
            if(!TextUtils.isEmpty(binding.etName.text.toString()) && !TextUtils.isEmpty(binding.etEmail.text.toString())){
                //pass data to next fragments as bundle
                val bundleName = bundleOf("user_name" to binding.etName.text.toString(), "user_email" to binding.etEmail.text.toString())
                val bundleEmail = bundleOf("user_email" to binding.etEmail.text.toString())
                //action to navigate to 2nd fragment
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundleName)

            }else{
                Toast.makeText(activity,"Please input your details",Toast.LENGTH_LONG).show()
            }

        }

        return binding.root
    }
}


