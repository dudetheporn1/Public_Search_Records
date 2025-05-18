package com.example.publicsearchrecords.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Cyberpunk neon colors
val NeonGreen = Color(0xFF39FF14)
val NeonOrange = Color(0xFFFF6700)
val DarkPurple = Color(0xFF1A0536)
val BlackBackground = Color(0xFF0D0D0D)

private val DarkColorPalette = darkColors(
    primary = NeonGreen,
    primaryVariant = NeonGreen.copy(alpha = 0.7f),
    secondary = NeonOrange,
    background = BlackBackground,
    surface = DarkPurple,
    onPrimary = BlackBackground,
    onSecondary = BlackBackground,
    onBackground = NeonGreen,
    onSurface = NeonGreen
)

private val LightColorPalette = lightColors(
    primary = NeonGreen,
    primaryVariant = NeonGreen.copy(alpha = 0.7f),
    secondary = NeonOrange,
    background = DarkPurple,
    surface = BlackBackground,
    onPrimary = BlackBackground,
    onSecondary = BlackBackground,
    onBackground = NeonGreen,
    onSurface = NeonGreen
)

@Composable
fun CyberpunkTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
