package com.production.ruslanio.caloriescalculator.util.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Ruslanio on 01.02.2018.
 */
abstract class AbstractAdapter<I>
constructor(protected var itemList: List<I>
            , private val layoutId: Int)
    : RecyclerView.Adapter<AbstractAdapter.Holder>() {


    override fun getItemCount() = itemList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val holder =  Holder(LayoutInflater.from(parent?.context).inflate(layoutId, parent, false))
        holder.itemView.setOnClickListener {
            val adapterPosition = holder.adapterPosition
            if (adapterPosition != RecyclerView.NO_POSITION)
                onItemClick(holder.itemView, adapterPosition)
        }
        return holder
    }


    override open fun onBindViewHolder(holder: Holder?, position: Int) {
        val item = itemList[position]
        holder?.itemView?.bind(item)
    }

    protected open fun onItemClick(itemView: View, position: Int) {
    }

    protected fun View.bind(item : I) {}

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView)
}