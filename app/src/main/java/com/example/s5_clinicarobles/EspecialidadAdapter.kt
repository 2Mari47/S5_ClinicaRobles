package com.example.s5_clinicarobles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.s5_clinicarobles.Especialidad


class EspecialidadAdapter(private val lista: List<Especialidad>) : RecyclerView.Adapter<EspecialidadAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre = view.findViewById<TextView>(R.id.txtEspecialidad)
        val doctor = view.findViewById<TextView>(R.id.txtDoctor)
        val horario = view.findViewById<TextView>(R.id.txtHorario)
        val imagen = view.findViewById<ImageView>(R.id.imageIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lista[position]
        holder.nombre.text = item.nombre
        holder.doctor.text = item.doctor
        holder.horario.text = item.horario
        holder.imagen.setImageResource(item.iconResId)
    }

    override fun getItemCount(): Int = lista.size
}