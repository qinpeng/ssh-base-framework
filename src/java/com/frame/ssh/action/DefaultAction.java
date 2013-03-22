/**
 * Created on 2013-3-22
 * 
 */
package com.frame.ssh.action;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.frame.common.collections.GenericCollections;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({"rawtypes", "serial"})
public class DefaultAction extends ActionSupport {

	public static <T> Set<T> newHashSet(T... arrays) {
		return GenericCollections.newHashSet(arrays);
	}

	public static Map selectMap(Map map, String... keys) {
		return GenericCollections.selectMap(map, keys);
	}

	public static Map map(Object... arrays) {
		return GenericCollections.map(arrays);
	}

	public static <T> List<T> list(T... arrays) {
		return GenericCollections.list(arrays);
	}

	public static <T> List<T> projectionColumn(List<Map> maps, String column) {
		return GenericCollections.projectionColumn(maps, column);
	}

	public static String join(Collection collection, String split) {
		return GenericCollections.join(collection, split);
	}

	public static String join(Collection collection) {
		return GenericCollections.join(collection);
	}

	public static List project(List<Map> list, String key) {
		return GenericCollections.project(list, key);
	}

	public static List projectByMethod(List list, String method) {
		return GenericCollections.projectByMethod(list, method);
	}

	public static Map double_list_to_map(List keys, List values) {
		return GenericCollections.double_list_to_map(keys, values);
	}

	public static String join(Collection collection, String split, String wrapper) {
		return GenericCollections.join(collection, split, wrapper);
	}

	public static String join(Object[] collection, String split, String wrapper) {
		return GenericCollections.join(collection, split, wrapper);
	}

	public static String getString(Map map, String key) {
		return GenericCollections.getString(map, key);
	}

	public static String getStringNoNull(Map map, String key) {
		return GenericCollections.getStringNoNull(map, key);
	}

	public static Date getDate(Map map, String key) {
		return GenericCollections.getDate(map, key);
	}

	public static long getDateAsLong(Map map, String key) {
		return GenericCollections.getDateAsLong(map, key);
	}

	public static int getInt(Map map, String key) {
		return GenericCollections.getInt(map, key);
	}

	public static long getLong(Map map, String key) {
		return GenericCollections.getLong(map, key);
	}

	public static Set hashSet(Object[] array) {
		return GenericCollections.hashSet(array);
	}

	public static List toList(Object[] array) {
		return GenericCollections.toList(array);
	}

	public static Set hashSet(int[] array) {
		return GenericCollections.hashSet(array);
	}

	public static String join(Object[] arrays, String split) {
		return GenericCollections.join(arrays, split);
	}

	public static String join(int[] arrays, String split) {
		return GenericCollections.join(arrays, split);
	}
	
}
