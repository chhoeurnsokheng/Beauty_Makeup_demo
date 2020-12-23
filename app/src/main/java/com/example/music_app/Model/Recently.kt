package com.example.music_app.Model

data class Recently(
    val image: String,
    val title: String,
    val title_1: String
) {
    companion object {
    }
}
fun getRecently(): List<Recently> {
    val list = mutableListOf<Recently>()
    for (i in 1..100) {
        val data = Recently(
            "https://source.unsplash.com/collection/${i + 100}/500x500",
            "Sok pise $i", "Radom ${i + 2}"
        )
        list.add(data)
    }
    return list
}
