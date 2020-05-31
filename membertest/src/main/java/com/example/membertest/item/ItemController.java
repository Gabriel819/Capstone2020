package com.example.membertest.item;

import java.util.List;

import com.example.membertest.item.Item;
import com.example.membertest.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/item")
    public List ItemList(){
        System.out.println("Item Connect Succeed.");
        List<Item> list = itemRepository.findAll();

        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("item_idx : " + list.get(i).getItem_idx()
                    +"\nitem_name : " + list.get(i).getItem_name()
                    +"\ncategory_idx : "+list.get(i).getCategory_idx()
                    +"\nitem_num : " + list.get(i).getItem_num()
                    +"\nrent_price : " + list.get(i).getRent_price());
        }

        return list;
    }

}