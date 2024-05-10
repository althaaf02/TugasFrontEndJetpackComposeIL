package maf.mobile.tugasfrontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default
import maf.mobile.tugasfrontend.data.DataMoviesProvider
import maf.mobile.tugasfrontend.data.DataMoviesProvider.movie
import maf.mobile.tugasfrontend.data.Movies

@Composable
fun MovieListItem(movies: Movies, navigateToProfile: (Movies) -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(400.dp, 120.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(corner = CornerSize(12.dp))

    ) {
        Row(
            Modifier.clickable { navigateToProfile(movie) }
        ){
            MovieImage(movies = movies)
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(8.dp)
            ) {
                Text(text = movies.title, style = typography.titleLarge)
                Text(text = "View Detail", style = typography.bodyLarge)
            }
        }
    }
}

@Composable
fun MovieImage(movies: Movies) {
    Image(
        painter = painterResource(id = movies.moviesImageId),
        contentDescription = "movie",
        modifier = Modifier
            .padding(0.dp,16.dp)
            .size(95.dp)
    )
}