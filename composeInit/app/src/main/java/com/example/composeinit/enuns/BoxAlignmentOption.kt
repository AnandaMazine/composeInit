package com.example.composeinit.enuns

import androidx.compose.ui.Alignment

enum class BoxAlignmentOption(
    val label:String,
    val value: Alignment
){
    TOP_START("TopStart", Alignment.TopStart),
    TOP_CENTER("TopCenter", Alignment.TopCenter),
    TOP_END("TopEnd", Alignment.TopEnd),
    CENTER("Center", Alignment.Center),
    CENTER_START("CenterStart", Alignment.CenterStart),
    CENTER_END("CenterEnd", Alignment.CenterEnd),
    BOTTOM_START("BottomStart", Alignment.BottomStart),
    BOTTOM_CENTER("BottomCenter", Alignment.BottomCenter),
    BOTTOM_END("BottomEnd", Alignment.BottomEnd),
}