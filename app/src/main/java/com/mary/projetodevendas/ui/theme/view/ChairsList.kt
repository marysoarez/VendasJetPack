package com.mary.projetodevendas.ui.theme.view

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mary.projetodevendas.Graph
import com.mary.projetodevendas.R
import com.mary.projetodevendas.model.Chair
import com.mary.projetodevendas.ui.theme.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun ChairList(navController: NavController){
    var bottomState by remember {
        mutableStateOf("chair")
    }

    Scaffold (
        backgroundColor = GRAY,
        topBar = {
            TopAppBar(backgroundColor = GRAY,
            elevation = 8.dp
            ) {
            IconButton(
                onClick = {
                /*TODO*/ }
            ) {
                Icon(Icons.Filled.ArrowBack
                    , contentDescription = null,
               tint = BLACK )
            }


                Spacer(modifier = Modifier.padding(100.dp))


                IconButton(
                    onClick = {
                        /*TODO*/ }
                ) {
                    Icon(Icons.Filled.ShoppingCart
                        , contentDescription = null,
                        tint = BLACK )
                }

                IconButton(
                    onClick = {
                        /*TODO*/ }
                ) {
                    Icon(Icons.Filled.Menu
                        , contentDescription = null,
                        tint = BLACK )
                }
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = GRAY
            ) {


              BottomNavigationItem(
                  selected = bottomState=="chair" ,
              onClick = {
                        navController.navigate(Graph.CHAIRS)
                },
                  label = {
                  Text(text = "Cadeiras")
              },
                  icon = {
                      Icon(Icons.Filled.Home, contentDescription = null)
                  },

                  unselectedContentColor = MEDIUM_GRAY,
                  selectedContentColor = BLACK
              )

                BottomNavigationItem(
                    selected = bottomState=="tables" ,
                    onClick = {
                        navController.navigate(Graph.TABLES)
                    },
                    label = {
                        Text(text = "Mesas")
                    },
                    icon = {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    },

                    unselectedContentColor = MEDIUM_GRAY,
                    selectedContentColor = BLACK
                )

                BottomNavigationItem(
                    selected = bottomState=="sofa" ,
                    onClick = {
                        navController.navigate(Graph.SOFA)

                    },
                    label = {
                        Text(text = "Sofás")
                    },
                    icon = {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    },

                    unselectedContentColor = MEDIUM_GRAY,
                    selectedContentColor = BLACK
                )




            }
        }
            ){
        var chairList: MutableList<Chair> = mutableListOf(
            Chair(
                image =R.drawable.img1,
                title = "Amos Chair",
                description = "A modern takes on tradition",
                price = "$680"
            ),
            Chair(
                image =R.drawable.img2,
                title = "Kew Chair",
                description = "A modern takes on tradition",
                price = "$580"
            ),
            Chair(
                image =R.drawable.img3,
                title = "Gamer Chair",
                description = "A modern takes on tradition",
                price = "$680"
            ),
            Chair(
                image =R.drawable.img4,
                title = "Office Chair",
                description = "A modern takes on tradition",
                price = "$980"
            ),
            Chair(
                image =R.drawable.img3,
                title = "Gamer Chair",
                description = "A modern takes on tradition",
                price = "$680"
            ),
            Chair(
                image =R.drawable.img4,
                title = "Office Chair",
                description = "A modern takes on tradition",
                price = "$980"
            ),
            Chair(
                image =R.drawable.img1,
                title = "Amos Chair",
                description = "A modern takes on tradition",
                price = "$680"
            )
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2) ,
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.Center
        ){
            itemsIndexed(chairList) { position, _ ->
                val image = chairList[position].image
                val title = chairList[position].title
                val description = chairList[position].description
                val price = chairList[position].price


                Card(
                    backgroundColor = WHITE,
                    shape = CardShapeList.small,
                    elevation = 8.dp,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {
                        Image(
                            painter = painterResource(id = image!!),
                            contentDescription = null,
                            alignment = Alignment.Center,
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .width(200.dp)
                                .height(100.dp)
                        )
                        Text(
                            text = title!!,
                            color = BLACK,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
                        )
                        Text(
                            text = description!!,
                            color = LIGHT_GRAY,
                            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = price!!,
                            color = MEDIUM_GRAY,
                            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp),
                            fontWeight = FontWeight.Bold
                        )


                    }
                }
            }

        }
    }
}