package farees.hussain.weatherapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import farees.hussain.weatherapp.R
import farees.hussain.weatherapp.databinding.ActivitySplashBinding
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(R.drawable.weathericon).into(binding.imageView)

        activityScope.launch {
            delay(3000)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}