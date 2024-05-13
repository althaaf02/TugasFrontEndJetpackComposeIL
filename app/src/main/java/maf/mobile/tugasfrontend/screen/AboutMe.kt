package maf.mobile.tugasfrontend.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import maf.mobile.tugasfrontend.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AboutMe(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(onClick = { navController.navigate("HomeScreen") }) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    }
                    IconButton(onClick = { navController.navigate("GalleryScreen") }) {
                        Icon(imageVector = Icons.Default.List, contentDescription = "")
                    }
                    IconButton(onClick = { navController.navigate("AboutMe") }) {
                        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")
                    }
                }
            }
        },
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { navController.navigate("HomeScreen") }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = " ")
                        }
                        Text(text = "About Me")

                    }
                }, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.LightGray)
            )
        }
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.fillMaxWidth(),
                Alignment.TopCenter){
                Image(painter = painterResource(id = R.drawable.myphoto),
                    contentDescription =" ",
                    modifier = Modifier.size(200.dp))
            }
            Text(text = "Nama : Muhammad Althaaf Fadhiilah",
                fontSize = 18.sp)

            Text(text = "Email : muhammadalthaaf02@gmail.com",
                fontSize = 18.sp)

            Text(text = "Asal Perguruan Tinggi: Universitas Brawijaya",
                fontSize = 18.sp, textAlign = TextAlign.Center)

            Text(text = "Jurusan : Sistem Informasi",
                fontSize = 18.sp)

        }
    }
}