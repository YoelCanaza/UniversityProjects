package com.example.laboratorio4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun ConstraintExample3() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (cajaRed, cajaBlue, cajaMagenta, cajaGreen, cajaYellow, cajaCyan, cajaBlack1, cajaBlack2) = createRefs()

        // cajaRed
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(cajaRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })
        //cajaBlue
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(cajaBlue) {
                bottom.linkTo(cajaRed.top)
                end.linkTo(cajaRed.start)
            })
        // cajaMagenta
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(cajaMagenta) {
                bottom.linkTo(cajaRed.top)
                start.linkTo(cajaRed.end)
            })
        // cajaYellow
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(cajaYellow) {
                top.linkTo(cajaRed.bottom)
                end.linkTo(cajaRed.start)
            })
        // cajaGreen
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Green)
            .constrainAs(cajaGreen) {
                top.linkTo(cajaRed.bottom)
                start.linkTo(cajaRed.end)
            })

        // cajaCyan
        Box(modifier = Modifier
            .size(41.6.dp)
            .background(Color.Cyan)
            .constrainAs(cajaCyan) {
                bottom.linkTo(cajaRed.top)
                start.linkTo(cajaRed.start)
            })
        // cajaBlack1
        Box(modifier = Modifier
            .size(41.6.dp)
            .background(Color.Black)
            .constrainAs(cajaBlack1) {
                bottom.linkTo(cajaCyan.top)
                start.linkTo(cajaCyan.end)
            })
        // cajaBlack2
        Box(modifier = Modifier
            .size(41.6.dp)
            .background(Color.Black)
            .constrainAs(cajaBlack2) {
                top.linkTo(cajaMagenta.top)
                end.linkTo(cajaMagenta.start)
            })
    }
}
