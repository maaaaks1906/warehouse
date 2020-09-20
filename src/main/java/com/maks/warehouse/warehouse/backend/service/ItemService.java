package com.maks.warehouse.warehouse.backend.service;

import com.maks.warehouse.warehouse.backend.entities.Item;
import com.maks.warehouse.warehouse.backend.repositories.ItemRepository;
import com.maks.warehouse.warehouse.backend.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private ItemRepository itemRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.itemRepository = itemRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    public List<Item> findAllOrderByNumberOfModifications() {
        return itemRepository.findAll(Sort.by(Sort.Direction.DESC, "numberOfModifications"));
    }

    public List<Item> findAllByNameIgnoreCaseContaining(String phrase) {
        return itemRepository.findAllByNameIgnoreCaseContaining(phrase);
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

}
