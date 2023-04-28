package com.mary.projetodevendas.ui.theme.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mary.projetodevendas.Graph
import com.mary.projetodevendas.ui.theme.BLACK
import com.mary.projetodevendas.ui.theme.GRAY
import com.mary.projetodevendas.ui.theme.MEDIUM_GRAY

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable

fun SofaList(navController: NavController){
    val bottomState by remember {
        mutableStateOf("sofa")
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
                    Icon(
                        Icons.Filled.ArrowBack
                        , contentDescription = null,
                        tint = BLACK )
                }


                Spacer(modifier = Modifier.padding(100.dp))


                IconButton(
                    onClick = {
                        /*TODO*/ }
                ) {
                    Icon(
                        Icons.Filled.ShoppingCart
                        , contentDescription = null,
                        tint = BLACK )
                }

                IconButton(
                    onClick = {
                        /*TODO*/ }
                ) {
                    Icon(
                        Icons.Filled.Menu
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
                        Text(text = "Chairs")
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
                        Text(text = "Tables")
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
                        Text(text = "sofa")
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
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Sofa List")
        }
    }
}