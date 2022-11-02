package com.example.sportfriends.novedades

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.sportfriends.novedades.model.NovedadModel
import com.example.sportfriends.R
import com.example.sportfriends.databinding.ItemNovedadesBinding
import com.example.sportfriends.types.NovedadType

class NovedadesAdapter(val novedadModel : NovedadModel) : RecyclerView.Adapter<NovedadesAdapter.NovedadesViewHolder>()
{
    private val novedadList = novedadModel.novedades;
    class NovedadesViewHolder(view: View) : ViewHolder(view)
    {
        private val binding = ItemNovedadesBinding.bind(view);

        fun render(novedad: NovedadType)
        {
            binding.tituloTxt.text = novedad.title
            binding.descripcionTxt.text = novedad.desciption
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : NovedadesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NovedadesViewHolder(layoutInflater.inflate(R.layout.item_novedades,parent,false))
    }

    override fun onBindViewHolder(holder: NovedadesViewHolder, position: Int) = holder.render(novedadList[position])

    override fun getItemCount() = novedadList.size;

}


