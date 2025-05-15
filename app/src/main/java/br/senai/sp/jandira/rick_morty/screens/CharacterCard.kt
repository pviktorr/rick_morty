package br.senai.sp.jandira.rick_morty.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.rick_morty.model.Character
import coil.compose.AsyncImage

@Composable
fun CharacterCard(
    name: String = "Nome do personagem",
    specie: String = "Espécie do personagem",
    status: String = "Status do personagem",
    iamge: String = "Url do personagem",
) {
    Card(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(80.dp),
                shape = CircleShape
            ) {
                AsyncImage(
                    model = "",
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Column {
                Text(text = name)
                Text(text = specie)
                Text(text = status)

            }
        }
    }
}

@Preview
@Composable
private fun CharacterCardPreview() {
    CharacterCard()
}