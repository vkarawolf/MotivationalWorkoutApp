package com.example.motivationalworkoutapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.motivationalworkoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Display a random affirmation when the app launches
        val randomAffirmation = AffirmationList.affirmations.random()
        binding.textViewAffirmation.text = randomAffirmation.text

        // Populate the list of exercises
        val exercises = ExerciseList.exercises.filter { it.category == "Strength" } // Example filter
        val exerciseNames = exercises.map { it.name }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, exerciseNames)
        binding.listViewExercises.adapter = adapter

        // Set click listener for the "See Workout for Today" button
        binding.buttonSeeWorkout.setOnClickListener {
            // Show the list of exercises
            binding.listViewExercises.visibility = android.view.View.VISIBLE
        }
    }
}