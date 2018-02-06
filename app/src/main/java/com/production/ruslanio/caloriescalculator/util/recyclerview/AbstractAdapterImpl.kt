package com.production.ruslanio.caloriescalculator.util.recyclerview

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by Ruslanio on 02.02.2018.
 */
class AbstractAdapterImpl<I>(items: List<I>, layoutId: Int, private val bindHolder: View.(I) -> Unit)
    : AbstractAdapter<I>(items, layoutId) {

    private var itemClick: I.() -> Unit = {}

    constructor(items: List<I>,
                layoutId: Int,
                bindHolder: View.(I) -> Unit,
                itemClick: I.() -> Unit = {}) : this(items, layoutId, bindHolder) {
        this.itemClick = itemClick
    }


    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.itemView?.bindHolder(itemList[position])
    }

    fun <I> RecyclerView.setUp(items: List<I>,
                               layoutId: Int,
                               bindHolder: View.(I) -> Unit,
                               manager: LinearLayoutManager): AbstractAdapterImpl<I> {

        return AbstractAdapterImpl(items, layoutId, {
            bindHolder(it)
        }).apply {
            layoutManager = manager
            adapter = this
        }
    }
}