package com.metehanbolat.mvvmroomdatabasecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.mvvmroomdatabasecompose.ui.theme.MVVMRoomDatabaseComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMRoomDatabaseComposeTheme {

            }
        }
    }
}
