package com.example.formapp

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.formapp.data.ContactUIState

@Composable
fun HalamanDua(
    ContactUIState: ContactUIState,
    onClickedButton: ()-> Unit
){
    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        )
    {
        Text(text = "Nama")
        Text(text = ContactUIState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = ContactUIState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "No Telepon")
        Text(text = ContactUIState.noTelp)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = onClickedButton){
            Text(text = stringResource(id = R.string.btnback))
        }
    }
}