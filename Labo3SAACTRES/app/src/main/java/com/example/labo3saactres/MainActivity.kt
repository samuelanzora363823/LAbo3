package com.example.labo3saactres

import AppNavigation
import HomeScreen
import SensorScreen
import TodoScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.labo3saactres.ui.theme.Labo3SAACTRESTheme


// MainActivity con navegación
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Labo3SAACTRESTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppNavigation()
                }
            }
        }
    }
}






@Preview(showBackground = true, name = "Preview TODO Screen")
@Composable
fun TodoScreenPreview() {
    Labo3SAACTRESTheme {
        TodoScreen()
    }
}

@Preview(showBackground = true, name = "Preview Home Screen")
@Composable
fun HomeScreenPreview() {
    Labo3SAACTRESTheme {
        HomeScreen(navController = rememberNavController())
    }
}

@Preview(showBackground = true, name = "Preview Sensor Screen")
@Composable
fun SensorScreenPreview() {
    Labo3SAACTRESTheme {
        SensorScreen()
    }
}

