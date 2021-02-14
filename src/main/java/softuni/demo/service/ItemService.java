package softuni.demo.service;

import softuni.demo.model.service.ItemServiceModel;
import softuni.demo.model.view.ItemViewModel;

import java.util.List;

public interface ItemService {
    void addItem(ItemServiceModel itemServiceModel);

    List<ItemViewModel> findAllItems();
    ItemViewModel findById(String id);

    void delete(String id);
}
