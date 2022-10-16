package br.inatel.seminario.c214.seminario_C214.entities

import io.swagger.v3.oas.annotations.media.Schema
import javax.persistence.*

@Entity
@Table(name = "items")
data class Item(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
    val id: Long? = null,
    @Column(unique = true)
    val name: String,
    val desc: String,
    val price: Float
)