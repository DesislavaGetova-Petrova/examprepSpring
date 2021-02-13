package softuni.demo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.demo.model.entity.Item;
import softuni.demo.model.service.CategoryServiceModel;
import softuni.demo.model.service.ItemServiceModel;
import softuni.demo.repository.ItemRepository;
import softuni.demo.service.CategoryService;
import softuni.demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public ItemServiceImpl(ItemRepository itemRepository, CategoryService categoryService, ModelMapper modelMapper) {
        this.itemRepository = itemRepository;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addItem(ItemServiceModel itemServiceModel) {

        Item item=this.modelMapper.map(itemServiceModel, Item.class);
        item.setCategory(this.categoryService.findByCategoryName(itemServiceModel.getCategory().getName()));
        this.itemRepository.saveAndFlush(item);

    }
}
