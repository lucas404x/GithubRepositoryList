package com.noti0ns.githubrepolist.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.noti0ns.githubrepolist.databinding.FragmentGithubLoginBinding

class GithubLoginFragment : Fragment() {
    private lateinit var binding: FragmentGithubLoginBinding
    private val viewModel: GithubLoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGithubLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnGithubLogin.setOnClickListener {
            binding.btnGithubLogin.visibility = View.GONE
            binding.pgbrGeneratingGithubCode.visibility = View.VISIBLE
        }
        super.onViewCreated(view, savedInstanceState)
    }

}