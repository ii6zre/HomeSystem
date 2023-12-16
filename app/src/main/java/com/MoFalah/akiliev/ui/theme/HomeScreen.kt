package com.MoFalah.akiliev.ui.theme

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.MoFalah.akiliev.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var navState by remember { mutableStateOf("Home") }
    Scaffold (
        bottomBar = {
            BottomAppBar(modifier = Modifier
                .padding(40.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
                tonalElevation = 30.dp,
                containerColor = Color.White)
            {
                NavigationBarItem(selected = navState =="Home",
                    onClick = {navState ="Home"},
                    icon = { Icon(imageVector = Icons.Default.Home,
                        contentDescription = null)},
                    label = { Text(
                        text = "Home",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp)
                    }
                )
                NavigationBarItem(selected = navState =="Face",
                    onClick = {navState ="Face"},
                    icon = { Icon(imageVector = Icons.Default.Face,
                        contentDescription = null)},
                    label = { Text(
                        text = "Person",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp)
                    }
                )
                NavigationBarItem(selected = navState =="Info",
                    onClick = {navState ="Info"},
                    icon = { Icon(imageVector = Icons.Default.Info,
                        contentDescription = null)},
                    label = { Text(
                        text = "Info",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp)
                    }
                )
            }
        }
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF016B8B))
                .padding(
                    top = 46.dp,
                    start = 35.dp,
                    end = 20.dp,
                    bottom = 10.dp
                )) {
            Image(painter = painterResource(id = R.drawable.house),
                contentDescription ="house",
                Modifier
                    .size(120.dp)
                    .align(CenterHorizontally))
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Hello,\n I wish you a happy life!",
                textAlign = TextAlign.Left,
                fontSize = 30.sp,
                color = Color.White,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(10.dp))
            Divider()
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                text = "My Room",
                fontSize = 22.sp,
                color = Color.White)
            Spacer(modifier = Modifier.size(15.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Card(
                    onClick = { Log.d("Click","Bedroom: Card Click")},
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .padding(start = 15.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(25.dp),
                    shape = RoundedCornerShape(
                        topEnd = 5.dp,
                        bottomEnd = 70.dp,
                        topStart = 20.dp,
                        bottomStart = 5.dp))
                {
                    Column(
                        modifier = Modifier
                            .size(117.dp)
                            .align(Alignment.Start)
                            .padding(start = 10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.bedroomm),
                            contentDescription = "Room")
                    }
                    Column(modifier = Modifier
                        .padding(start = 10.dp)) {
                        Text(
                            text = "Bed room",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold)
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))

                Card(
                    onClick = { Log.d("Click","Tv Room: Card Click")},
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .padding(start = 15.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(25.dp),
                    shape = RoundedCornerShape(
                        topEnd = 5.dp,
                        bottomEnd = 70.dp,
                        topStart = 20.dp,
                        bottomStart = 5.dp))
                {
                    Column(
                        modifier = Modifier
                            .size(99.dp)
                            .align(Alignment.Start)
                            .padding(start = 10.dp, top = 10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.tvv),
                            contentDescription = "Room")
                    }

                    Spacer(modifier = Modifier.size(15.dp))

                    Column(modifier = Modifier.padding(start = 10.dp)) {
                        Text(
                            text = "Tv Room",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold)
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    onClick = { Log.d("Click","Kitchen: Card Click")},
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .padding(start = 15.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(25.dp),
                    shape = RoundedCornerShape(
                        topEnd = 5.dp,
                        bottomEnd = 70.dp,
                        topStart = 20.dp,
                        bottomStart = 5.dp
                    )
                )
                {
                    Column(
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.Start)
                            .padding(start = 10.dp, top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.kitchenn),
                            contentDescription = "kitchen"
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Column(modifier = Modifier.padding(start = 10.dp)) {
                        Text(
                            text = "Kitchen",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold) }
                }
                Spacer(modifier = Modifier.size(20.dp))

                Card(
                    onClick = { Log.d("Click","Shower: Card Click")},
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .padding(start = 15.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(25.dp),
                    shape = RoundedCornerShape(
                        topEnd = 5.dp,
                        bottomEnd = 70.dp,
                        topStart = 20.dp,
                        bottomStart = 5.dp))
                {
                    Column(
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.Start)
                            .padding(start = 10.dp, top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.showerr),
                            contentDescription = "shower")
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Column(modifier = Modifier.padding(start = 10.dp)) {
                        Text(
                            text = "Shower",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold)
                    }
                }
            }
        }
    }

}


@Composable
@Preview
fun HomePreview(){
    HomeScreen()
}