package com.metehanbolat.mvvmroomdatabasecompose

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.metehanbolat.mvvmroomdatabasecompose.ui.theme.MVVMRoomDatabaseComposeTheme
import com.metehanbolat.mvvmroomdatabasecompose.viewmodel.SampleViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.metehanbolat.mvvmroomdatabasecompose.entity.SampleEntity
import com.metehanbolat.mvvmroomdatabasecompose.viewmodel.SampleViewModelFactory
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMRoomDatabaseComposeTheme {
                CallDatabase()
            }
        }
    }
}

val date = SimpleDateFormat("dd-MM-yyyy", Locale.US)
val strDate: String = date.format(Date())

val insertSampleData = listOf(
    SampleEntity(1, "Sample 1", "Descending 1", "Image Url 1", strDate),
    SampleEntity(2, "Sample 2", "Descending 2", "Image Url 2", strDate),
    SampleEntity(3, "Sample 3", "Descending 3", "Image Url 3", strDate),
    SampleEntity(4, "Sample 4", "Descending 4", "Image Url 4", strDate),
    SampleEntity(5, "Sample 5", "Descending 5", "Image Url 5", strDate),
    SampleEntity(6, "Sample 6", "Descending 6", "Image Url 6", strDate),
    SampleEntity(7, "Sample 7", "Descending 7", "Image Url 7", strDate),
    SampleEntity(8, "Sample 8", "Descending 8", "Image Url 8", strDate),
    SampleEntity(9, "Sample 9", "Descending 9", "Image Url 9", strDate),
)

@Composable
fun CallDatabase() {
    val context = LocalContext.current
    val sampleViewModel: SampleViewModel = viewModel(
        factory = SampleViewModelFactory(context.applicationContext as Application)
    )
    sampleViewModel.addSample(insertSampleData)
}
