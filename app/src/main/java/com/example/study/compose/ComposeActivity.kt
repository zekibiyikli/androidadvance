package com.example.study.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.study.compose.ui.CryptoCrazyComposeTheme
import com.example.study.compose.view.CryptoDetailScreen
import com.example.study.compose.view.CryptoListScreen
import com.example.study.compose.viewmodel.CryptoListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CryptoCrazyComposeTheme {
                val navController= rememberNavController()
                NavHost(navController = navController, startDestination = "crypto_list_screen"){
                    composable("crypto_list_screen"){
                        CryptoListScreen(navController = navController)
                    }
                    composable("crypto_detail_screen/{id}/{price}", arguments = listOf(
                        navArgument("id") {
                            type = NavType.StringType
                        },
                        navArgument("price"){
                            type = NavType.StringType
                        }
                    )){
                        val id=remember{
                            it.arguments?.getString("id")
                        }
                        val price=remember{
                            it.arguments?.getString("price")
                        }

                        CryptoDetailScreen(
                            id ?:"",
                            price ?:"",
                            navController = navController)

                    }
                }
            }

        }
    }
}

/*
* XML yerine kod yazarak ekranları oluşturmak için kullanılıyor yeni bir design
* https://developer.android.com/jetpack/compose/side-effects
* */