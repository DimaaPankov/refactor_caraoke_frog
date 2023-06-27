package com.clement.karaokefrog.activity

import android.Manifest
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.clement.karaokefrog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
     var goBack = {}
    var onResumeCust  = {}
    var onPauseCust  = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.Bdone.isClickable = false
        binding.Bclose.isClickable = false


    }
    override fun onResume() {
        super.onResume()
        onResumeCust()
    }

    override fun onPause() {
        super.onPause()
        onPauseCust()
    }

    override fun onBackPressed() {
        goBack()
    }

     fun checkCameraPermission(){
        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.CAMERA), 12)

        } else {

        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == 12){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
            }
        }
    }

     fun isNetworkConnected(): Boolean {
        val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected
    }

}

