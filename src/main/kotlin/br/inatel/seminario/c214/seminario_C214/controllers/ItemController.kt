package br.inatel.seminario.c214.seminario_C214.controllers

import br.inatel.seminario.c214.seminario_C214.entities.Item
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/item")
class ItemController {

    @PostMapping
    fun addNewItem(item: Item){

    }
}