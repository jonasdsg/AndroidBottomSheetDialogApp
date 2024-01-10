package io.github.jonasdsg.androidbottomsheetdialogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import io.github.jonasdsg.androidbottomsheetdialogapp.databinding.ActivityMainBinding
import io.github.jonasdsg.androidbottomsheetdialogapp.databinding.BottomSheetModalBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
        activityMainBinding.button.setOnClickListener{
            show()
        }
    }

    private fun show(){
        val dialog = BottomSheetDialog(this)
        val bottomSheet = BottomSheetModalBinding.inflate(layoutInflater,null, false)
        dialog.setContentView(bottomSheet.root)
        dialog.show()
        bottomSheet.button.setOnClickListener {
            dialog.dismiss()
        }
    }
}