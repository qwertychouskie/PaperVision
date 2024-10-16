package io.github.deltacv.papervision.node

import io.github.deltacv.papervision.gui.style.CurrentStyles.imnodesStyle
import io.github.deltacv.papervision.gui.style.hexColor

enum class Category(val properName: String,
                    val color: Int = imnodesStyle.titleBar,
                    val colorSelected: Int = imnodesStyle.titleBarHovered) {

    FLOW("cat_pipeline_flow",
        hexColor("#00838f"), // material cyan
        hexColor("#00acc1")),

    CODE("cat_coding"),
    HIGH_LEVEL_CV("cat_high_level_cv"),

    IMAGE_PROC("cat_image_proc",
        hexColor("#ff6f00"), // material amber
        hexColor("#ffa000")),

    FEATURE_DET("cat_feature_det",
        hexColor("#3949ab"), // material indigo
        hexColor("#5c6bc0")),


    CLASSIFICATION("cat_class",
        hexColor("#3949ab"), // material indigo
        hexColor("#5c6bc0")),

    OVERLAY("cat_overlay",
        hexColor("#00897b"), // material teal
        hexColor("#26a69a")),

    MATH("cat_math"),
    MISC("cat_misc")

}