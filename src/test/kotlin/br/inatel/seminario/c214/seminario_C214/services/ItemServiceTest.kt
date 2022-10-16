package br.inatel.seminario.c214.seminario_C214.services

import br.inatel.seminario.c214.seminario_C214.components.Calculadora
import br.inatel.seminario.c214.seminario_C214.entities.Item
import br.inatel.seminario.c214.seminario_C214.repository.ItemRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ItemServiceTest() {

    private lateinit var itemService: ItemService;

    @Mock
    private lateinit var itemRepository: ItemRepository;

    @BeforeEach
    fun before() {
        this.itemService = ItemService(this.itemRepository)
    }

    @Test
    fun testShouldCreateNewItem(){
        // Given
        val id = 1L;
        val name = "cafe test"
        val desc = "desc"
        val price = 10.5F
        val item: Item = Item(id, name, desc, price);

        // When
        `when`(this.itemRepository.save(item)).thenReturn(item)
        val actual = this.itemService.create(item);

        // Then
        assertEquals(id, actual.id)
        assertEquals(name, actual.name)
        assertEquals(desc, actual.desc)
        assertEquals(price, actual.price)
        verify(this.itemRepository).save(item)
    }

}