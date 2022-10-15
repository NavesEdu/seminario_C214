package br.inatel.seminario.c214.seminario_C214.entities

import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
    private val id: Long? = null,
    private val name: String,
    private val desc: String,
    private val price: Float
)