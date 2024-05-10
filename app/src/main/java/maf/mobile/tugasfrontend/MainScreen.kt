package maf.mobile.tugasfrontend

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import maf.mobile.tugasfrontend.data.DataMoviesProvider
import maf.mobile.tugasfrontend.data.Movies

@Composable
fun Tiqz(navigateToProfile: (Movies) -> Unit) {
    val moviess = remember { DataMoviesProvider.movieList }
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()

    ) {
        Text(text = "Movies", style = typography.headlineMedium)
        LazyRow(
            contentPadding = PaddingValues(16.dp,8.dp)
        ){
            items(
                items = moviess,
                itemContent = {
                    MovieListItem(movies = it, navigateToProfile)
                }
            )
        }
        LazyColumn(
            contentPadding = PaddingValues(16.dp,8.dp)
        ) {
            items(
                items = moviess,
                itemContent = {
                    MovieListItem(movies = it, navigateToProfile)
                }
            )
        }
    }

}