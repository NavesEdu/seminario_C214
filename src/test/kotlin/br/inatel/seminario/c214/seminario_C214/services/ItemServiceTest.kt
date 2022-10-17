package br.inatel.seminario.c214.seminario_C214.services

import br.inatel.seminario.c214.seminario_C214.entities.Item
import br.inatel.seminario.c214.seminario_C214.repository.ItemRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ItemServiceTest() {

    private final val ID_ITEM_1 = 1L;
    private final val NAME_ITEM_1 = "Chocolate quente"
    private final val DESCRIPTION_ITEM_1 = "Feito com chocolate de verdade derretido com leite"
    private final val PRICE_ITEM_1 = 10.5F
    private final val ID_ITEM_2 = 2L;
    private final val NAME_ITEM_2 = "Irish Coffee"
    private final val DESCRIPTION_ITEM_2 = "Café simples com uma boa dose de whiskey"
    private final val PRICE_ITEM_2 = 15F

    private lateinit var itemService: ItemService

    @Mock
    private lateinit var itemRepository: ItemRepository

    @BeforeEach
    fun before() {
        this.itemService = ItemService(this.itemRepository)
    }

    @Test
    fun `test Should Create New Item`(){
        // Given
        val item: Item = getItem(ID_ITEM_1, NAME_ITEM_1, DESCRIPTION_ITEM_1, PRICE_ITEM_1)

        // When
        `when`(this.itemRepository.save(item)).thenReturn(item)
        val actual = this.itemService.create(item)

        // Then
        assertEquals(item.id, actual.id)
        assertEquals(item.name, actual.name)
        assertEquals(item.desc, actual.desc)
        assertEquals(item.price, actual.price)
        verify(this.itemRepository, times(1)).save(item)
    }

    @Test
    fun `should Find All Items`(){
        `when`(this.itemRepository.findAll()).thenReturn(getAllItems())

        val expectedList: List<Item> = getAllItems()
        val actualList: List<Item> = this.itemService.getAllItems()

        assertEquals(expectedList, actualList)
    }

    fun getItem(id: Long, name: String, desc: String, price: Float): Item{
        return Item(id, name, desc, price)
    }

    fun getAllItems(): List<Item>{
        val itemList: ArrayList<Item> = ArrayList()
        itemList.add(getItem(ID_ITEM_1, NAME_ITEM_1, DESCRIPTION_ITEM_1, PRICE_ITEM_1))
        itemList.add(getItem(ID_ITEM_2, NAME_ITEM_2, DESCRIPTION_ITEM_2, PRICE_ITEM_2))

        return itemList
    }
}