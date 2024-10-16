package io.github.deltacv.papervision.gui.style

interface ImNodesStyleTemplate : Style {
    val nodeBackground: Int
    val nodeBackgroundHovered: Int
    val nodeBackgroundSelected: Int
    val nodeOutline: Int

    val titleBar: Int
    val titleBarHovered: Int
    val titleBarSelected: Int

    val link: Int
    val linkHovered: Int
    val linkSelected: Int

    val pin: Int
    val pinHovered: Int

    val boxSelector: Int
    val boxSelectorOutline: Int
}