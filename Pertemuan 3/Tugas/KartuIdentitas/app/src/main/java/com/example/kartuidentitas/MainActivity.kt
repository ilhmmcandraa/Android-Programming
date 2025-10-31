package com.example.kartuidentitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuIdentitasMahasiswa()
        }
    }
}

@Composable
fun KartuIdentitasMahasiswa() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0E0E0)), // latar belakang abu aplikasi
        contentAlignment = Alignment.Center
    ) {
        // Kartu utama
        Box(
            modifier = Modifier
                .width(290.dp)
                .height(440.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .padding(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Bagian Logo & Nama Universitas
                Image(
                    painter = painterResource(id = R.drawable.logo_mardira), // logo kampus
                    contentDescription = "Logo STMIK Mardira Indonesia",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(top = 8.dp),
                    contentScale = ContentScale.Fit
                )

                Text(
                    text = "STMIK MARDIRA\nINDONESIA",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    lineHeight = 20.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Foto dengan latar merah
                Box(
                    modifier = Modifier
                        .width(140.dp)
                        .height(180.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFFFFF)), // merah khas ID
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.foto_profil), // ganti fotomu
                        contentDescription = "Foto Mahasiswa",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp)
                            .clip(RoundedCornerShape(6.dp)),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Data Identitas
                Text(
                    text = "Ilham Candra",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "23020040",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "MANAJEMEN INFORMATIKA D3",
                    fontSize = 15.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }

            // Aksen hijau di kiri bawah
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .width(35.dp)
                    .height(25.dp)
                    .background(Color(0xFF2ECC71)) // warna hijau
                    .zIndex(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKartuIdentitasMahasiswa() {
    KartuIdentitasMahasiswa()
}
