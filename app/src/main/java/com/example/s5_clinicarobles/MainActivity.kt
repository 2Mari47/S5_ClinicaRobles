package com.example.s5_clinicarobles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val especialidades = listOf(
            Especialidad("TRAUMATOLOGÍA", "Dr. Alberto García Cerna", "Lun-Vie: 8am-2pm", R.drawable.doctor_icon),
            Especialidad("CARDIOLOGÍA", "Dr. Roberto Chavesta Bernal", "Lun-Vie: 9am-3pm", R.drawable.doctor2_icon),
            Especialidad("CIRUGÍA GENERAL", "Dr. Beto Miranda Sevillano", "Lun-Sab: 10am-4pm", R.drawable.doctor_icon),
            Especialidad("DERMATOLOGÍA", "Dr. Jaime Vega Chavez", "Lun-Vie: 8am-1pm", R.drawable.doctor3_icon),
            Especialidad("ENDOCRINOLOGÍA", "Dra. Kelly Casanova Lau", "Lun-Jue: 10am-2pm", R.drawable.doctora_icon),
            Especialidad("GINECOLOGÍA", "Dr. Jose Luis Espinoza Decena", "Lun-Vie: 2pm-7pm", R.drawable.doctor_icon),
            Especialidad("MEDICINA INTERNA", "Dr. Luis Cabrera Cipiran", "Lun-Sab: 7am-12pm", R.drawable.doctor3_icon),
            Especialidad("NEUROLOGÍA", "Dra. Willy Caballero Grados", "Lun-Vie: 3pm-8pm", R.drawable.doctora2_icon),
            Especialidad("NUTRICIÓN", "Lic. Carmela Carbajal", "Lun-Mie: 10am-1pm", R.drawable.doctora_icon),
            Especialidad("ODONTOLOGÍA", "Dr. Pedro Cipriano Alegre", "Lun-Sab: 9am-5pm", R.drawable.doctor2_icon),
            Especialidad("PSIQUIATRÍA", "Dra. Celmira Lazaro Loyola", "Lun-Vie: 11am-4pm", R.drawable.doctora_icon)
        )

        recyclerView.adapter = EspecialidadAdapter(especialidades)
    }
}