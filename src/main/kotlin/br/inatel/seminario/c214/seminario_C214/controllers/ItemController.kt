package br.inatel.seminario.c214.seminario_C214.controllers

import br.inatel.seminario.c214.seminario_C214.entities.Item
import br.inatel.seminario.c214.seminario_C214.services.ItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse

@RestController
@RequestMapping("/item")
class ItemController(private val itemService: ItemService) {

    @PostMapping
    fun addNewItem(item: Item): ResponseEntity<Item> =
        ResponseEntity.status(HttpStatus.CREATED).body(itemService.create(item));

    @GetMapping
    fun getAllItem(): ResponseEntity<List<Item>> = ResponseEntity.ok().body(itemService.getAllItem());

    @GetMapping("/{id}")
    fun getAllItem(id: Long): Item = itemService.getById(id);
}