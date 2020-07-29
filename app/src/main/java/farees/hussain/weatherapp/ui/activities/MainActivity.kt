package farees.hussain.weatherapp.ui.activities

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import farees.hussain.weatherapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //TODO(old method instead use easy permissions dependency)
    fun checkPermissions(permissions : Array<String>) {
        var permissionNeeded : Int = 0
        if(Build.VERSION.SDK_INT>=23){
            for(permission in permissions){
                var result : Int = ContextCompat.checkSelfPermission(this,permission)
                if(result.equals(PackageManager.PERMISSION_DENIED)){
                    permissionNeeded++
                }
            }
        }

    }
}