package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Item;

public interface IServices {
	boolean insert(Item item);
	List<Item> getAll();

}
