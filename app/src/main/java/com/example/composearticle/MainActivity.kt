package com.example.composearticle

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleContent(title = stringResource(id = R.string.article_title),
                        paragraphOne = stringResource(id = R.string.paragraph_one) ,
                        paragraphTwo = stringResource(id = R.string.paragraph_two)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ArticleContent(title: String, paragraphOne: String, paragraphTwo: String ){
    Column {
        val image = painterResource(R.drawable.bg_compose_background)
        Box{
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = paragraphOne,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = paragraphTwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        Greeting("Android")
    }
}