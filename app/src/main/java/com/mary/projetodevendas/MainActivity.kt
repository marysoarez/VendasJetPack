package com.mary.projetodevendas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mary.projetodevendas.ui.theme.ProjetoDeVendasTheme
import com.mary.projetodevendas.ui.theme.view.ChairList
import com.mary.projetodevendas.ui.theme.view.SofaList
import com.mary.projetodevendas.ui.theme.view.TableList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoDeVendasTheme {
                run {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        route = Graph.ROOT,
                        startDestination = Graph.CHAIRS
                    ) {

                        composable(route = Graph.CHAIRS) {
                            ChairList(navController = navController)
                        }
                        composable(route = Graph.TABLES) {
                            TableList(navController = navController)
                        }
                        composable(route = Graph.SOFA) {
                            SofaList(navController = navController)
                        }
                    }
                }
            }
        }
    }
}

object Graph{
    const val ROOT = "root_graph"
    const val CHAIRS = "chairs_graph"
    const val TABLES = "tables_graph"
    const val SOFA = "sofa_graph"
}
