package br.inatel.seminario.c214.seminario_C214.repository

import br.inatel.seminario.c214.seminario_C214.entities.Item
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ItemRepository : JpaRepository<Item, Long> {
    fun findByName(name: String): Optional<Item>;
}