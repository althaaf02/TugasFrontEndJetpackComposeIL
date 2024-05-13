package maf.mobile.tugasfrontend.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import maf.mobile.tugasfrontend.data.DataMoviesProvider
import maf.mobile.tugasfrontend.data.Movies

@Composable
fun MovieGridItem(movies: Movies) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(200.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(corner = CornerSize(12.dp))

    ) {
            Image(
                painter = painterResource(id = movies.moviesImageId),
                contentDescription = "movie",
                modifier = Modifier
                    .padding(0.dp, 16.dp)
                    .fillMaxSize()
            )
    }
}

