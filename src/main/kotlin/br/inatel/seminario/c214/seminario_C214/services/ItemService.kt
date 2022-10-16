package br.inatel.seminario.c214.seminario_C214.services

import br.inatel.seminario.c214.seminario_C214.controllers.exceptions.ItemAlreadyExistException
import br.inatel.seminario.c214.seminario_C214.entities.Item
import br.inatel.seminario.c214.seminario_C214.repository.ItemRepository
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service
import org.webjars.NotFoundException
import java.util.*

@Service
class ItemService(private val itemRepository: ItemRepository) {
    fun create(item: Item): Item {
        try {
            return itemRepository.save(item)
        } catch (e: DataIntegrityViolationException) {
            throw ItemAlreadyExistException("Item com Nome [" + item.name + "] já existe!");
        }
    }


    fun getAllItem(): List<Item> {
        return itemRepository.findAll();
    }

    fun getById(id: Long): Item {
        val opItem: Optional<Item> = itemRepository.findById(id);
        if (opItem.isEmpty)
            throw NotFoundException("Item com id [" + id + "] não encontrado!")

        return opItem.get();
    }

    fun getByEmail(name: String): Item {
        val opItem: Optional<Item> = itemRepository.findByName(name);
        if (opItem.isEmpty)
            throw NotFoundException("Item com nome [" + name + "] não encontrado!")

        return opItem.get();
    }

}