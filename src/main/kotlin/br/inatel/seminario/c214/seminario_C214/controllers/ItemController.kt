package br.inatel.seminario.c214.seminario_C214.controllers

import br.inatel.seminario.c214.seminario_C214.entities.Item
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse

@RestController
@RequestMapping("/item")
class ItemController {

    @PostMapping
    fun addNewItem(item: Item): ResponseEntity<Item> = ResponseEntity.ok().body(item);
}