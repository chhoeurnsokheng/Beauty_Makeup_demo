/*
 * SpaceDecoration.kt
 * UGamer
 *
 * Created by Sopheak Te on 08/13/2020 use by Sokheng
 * Copyright (c) 2020 ICE Electronics. All rights reserved.
 */

package com.example.music_app
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpaceDecoration(
    private val leftSpace: Int = 0,
    private val topSpace: Int = 0,
    private val rightSpace: Int = 0,
    private val bottomSpace: Int = 0,
    private val skipFirst: Boolean = true
): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)
        if ((!skipFirst && position == 0) || position > 0) {
            outRect.set(leftSpace, topSpace, rightSpace, bottomSpace)
        }
    }
}


