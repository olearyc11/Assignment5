package com.coderscampus.Assignment5;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];
	int indexCount = 0;
	
	
	@Override
	public boolean add(T item) {
		if (indexCount == items.length) {
			Object[] newItemsList = Arrays.copyOf(items, items.length * 2);
			items = newItemsList;
		}
		items[indexCount] = item;
		indexCount++;
		return true;
	}

	@Override
	public int getSize() {
		return indexCount;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

}
