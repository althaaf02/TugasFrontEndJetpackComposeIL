package maf.mobile.tugasfrontend.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import maf.mobile.tugasfrontend.component.MovieGridItem
import maf.mobile.tugasfrontend.component.MovieListItem
import maf.mobile.tugasfrontend.data.DataMoviesProvider

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GalleryScreen(navController: NavController) {
    Scaffold(
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
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        IconButton(onClick = { navController.navigate("HomeScreen") }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = " ")
                        }
                        Text(text = "Galerry")

                    }
                },colors = smallTopAppBarColors(containerColor = LightGray)
            )
        }
    ) {
        val moviess = remember { DataMoviesProvider.movieList }
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 60.dp)
                .fillMaxSize()
        ) {
            Text(text = "Gallery Poster Movie", style = MaterialTheme.typography.headlineMedium)
            LazyVerticalGrid(
                contentPadding = PaddingValues(16.dp, 8.dp),
                verticalArrangement = spacedBy(16.dp),
                horizontalArrangement = spacedBy(16.dp),
                columns = GridCells.Fixed(2)
            ) {
                items( items = moviess,
                    itemContent = {
                        MovieGridItem(movies = it)
                    }
                )

            }
        }
    }
}