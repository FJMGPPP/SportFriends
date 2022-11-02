package com.example.sportfriends.novedades.model

import com.example.sportfriends.types.NovedadType

class NovedadesProvider
{
    companion object
    {

            fun getData() : NovedadModel
            {
                return model
            }
            private val model = NovedadModel(listOf<NovedadType>(
                NovedadType("Mantenimiento","""El sabado 22 agoto
                    Entre las 10:00 - 12:00 hora española
                    Se llevara acabo un mantenimiento"""),

                NovedadType("Atualizacion:","""En Esta actualizacion se añadieron:
                    nuevos tipos de competencias
                    nuevos tipos de quedadas
                    arreglados bugs"""))
            )
    }


}