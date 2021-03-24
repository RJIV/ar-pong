package com.hamilton.arpong.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.fragment.app.Fragment
import com.hamilton.arpong.R
import com.hamilton.arpong.activity.ARPongGameActivity
import com.hamilton.arpong.databinding.FragmentMainMenuBinding
import com.hamilton.arpong.utils.DifficultyLevel

class MainMenuFragment : Fragment() {

    private var _binding: FragmentMainMenuBinding? = null
    private val binding get() = _binding!!

    private var username = ""
    private var difficultyLevel: DifficultyLevel = DifficultyLevel.EASY

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.difficultyLevelText.text = getString(R.string.difficulty_level, "Easy")
        difficultyLevel = DifficultyLevel.EASY

        initializeButtons()
        setUsername()
        setDifficultyLevelListener()

    }

    private fun setUsername() {
        this.username = arguments!!.getString("username")!!
        binding.welcomeText.text = getString(R.string.welcomeMessage, username)
    }

    private fun setDifficultyLevelListener() {
        binding.difficultyBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {

                when (progress) {
                    0 -> {
                        setDifficultyLevel(DifficultyLevel.EASY)
                    }
                    1 -> {
                        setDifficultyLevel(DifficultyLevel.NORMAL)
                    }
                    2 -> {
                        setDifficultyLevel(DifficultyLevel.HARD)
                    }
                }
            }
        })
    }

    private fun setDifficultyLevel(difficultyLevel: DifficultyLevel) {
        when (difficultyLevel) {
            DifficultyLevel.EASY -> {
                binding.difficultyLevelText.text =
                    getString(R.string.difficulty_level, getString(R.string.difficulty_level_easy))
                this.difficultyLevel = difficultyLevel
            }
            DifficultyLevel.NORMAL -> {
                binding.difficultyLevelText.text = getString(
                    R.string.difficulty_level,
                    getString(R.string.difficulty_level_normal)
                )
                this.difficultyLevel = difficultyLevel
            }
            DifficultyLevel.HARD -> {
                binding.difficultyLevelText.text =
                    getString(R.string.difficulty_level, getString(R.string.difficulty_level_hard))
                this.difficultyLevel = difficultyLevel
            }
        }
    }

    private fun initializeButtons() {
        binding.newGameBtn.setOnClickListener {
            val arPongGameIntent = Intent(context!!, ARPongGameActivity::class.java)
            arPongGameIntent.putExtra("DIFFICULTY", difficultyLevel)
            startActivity(arPongGameIntent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
