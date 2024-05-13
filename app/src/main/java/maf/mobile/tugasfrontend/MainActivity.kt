package maf.mobile.tugasfrontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import maf.mobile.tugasfrontend.data.Movies
import maf.mobile.tugasfrontend.navigation.Nav
import maf.mobile.tugasfrontend.screen.HomeScreen
import maf.mobile.tugasfrontend.ui.theme.TugasFrontEndTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasFrontEndTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Nav()
                }
            }
        }
    }
}

//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun Tiqz(navigateToProfile: (Movies) -> Unit) {
//    Scaffold(
//        content = {
//            TiqzHomeScreen(navigateToProfile = navigateToProfile)
//        }
//    )
//}
