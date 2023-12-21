package kr.ac.kumoh.ce.s20191064.s23movielist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import kr.ac.kumoh.ce.s20191064.s23movielist.ui.theme.S23MovieListTheme

class MainActivity : ComponentActivity() {
    // MovieViewModel 인스턴스 생성
    private val viewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // MainScreen 호출 및 MovieViewModel 전달
            MainScreen(viewModel)
        }
    }
}

@Composable
fun MainScreen(viewModel: MovieViewModel) {
    // MovieList 상태를 가져옴
    val movieList by viewModel.movieList.observeAsState(emptyList())

    // 앱 테마 설정
    S23MovieListTheme {
        // 화면 Surface에 적용
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // MovieApp 호출 및 MovieList 전달
            MovieApp(movieList)
        }
    }
}