package farees.hussain.weatherapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import farees.hussain.weatherapp.R
import farees.hussain.weatherapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(R.drawable.weathericon).into(binding.imageView)

        //TODO(use coroutines to change the activity)
    }
}