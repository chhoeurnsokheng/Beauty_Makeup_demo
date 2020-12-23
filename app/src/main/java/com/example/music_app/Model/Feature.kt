package com.example.music_app.Model

class Feature(
    val imageView: String,
    val description: String
) {
    companion object {
        fun getfeature(): List<Feature> {
            val list = mutableListOf<Feature>()
            for (i in 1..80) {
                val data = Feature(
                    "https://source.unsplash.com/collection/${i + 900}/500x500",
                    "Welcome to our Menu"
                )
                list.add(data)
            }
            return list
        }
    }
}
