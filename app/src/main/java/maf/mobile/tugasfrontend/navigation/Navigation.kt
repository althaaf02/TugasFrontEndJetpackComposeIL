package maf.mobile.tugasfrontend.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import maf.mobile.tugasfrontend.data.Movies
import maf.mobile.tugasfrontend.screen.AboutMe
import maf.mobile.tugasfrontend.screen.GalleryScreen
import maf.mobile.tugasfrontend.screen.HomeScreen
import maf.mobile.tugasfrontend.screen.detailMovie

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeScreen") {

        composable(route = "HomeScreen") {
            HomeScreen(navController)
        }
        composable(route = "AboutMe") {
            AboutMe(navController)
        }
        composable(route = "GalleryScreen") {
            GalleryScreen(navController)
        }
//        composable(route = "DetailScreen/{index}", arguments = listOf(
//            navArgument(name = "index"){
//                type = NavType.IntType
//            }
//        )
//        ) {index ->
//            detailMovie( movies.moviesImageId,
//                movies.title,
//                movies.description,
//                itemIndex = index.arguments?.getInt("index")
//
//        )}
    }
}
