/**
 * Created on 2013-3-22
 * 
 */
package com.frame.common.collections;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.frame.common.exception.ArgumentErrorException;
import com.frame.common.reflect.ReflectHelper;

@SuppressWarnings({"rawtypes", "unchecked"})
public class GenericCollections {

	public final static Map EMPTY_MAP = map();
	public final static List EMPTY_LIST = list();

	public static <T> Set<T> newHashSet(T... arrays) {
		Set<T> sets = new HashSet<T>(arrays.length);
		for (T t : arrays) {
			sets.add(t);
		}
		return sets;
	}

	public static Map selectMap(Map map, String... keys) {
		Map temp = new HashMap();
		for (String key : keys) {
			temp.put(key, map.get(key));
		}
		return temp;
	}

	public static Map map(Object... arrays) {
		Map maps = new HashMap();
		if (arrays.length % 2 != 0)
			throw new ArgumentErrorException("arrays 长度 必须为偶数");
		for (int i = 0; i < arrays.length; i++) {
			maps.put(arrays[i], arrays[++i]);
		}
		return maps;
	}

	public static <T> List<T> list(T... arrays) {
		List<T> list = new ArrayList<T>(arrays.length);
		for (T t : arrays) {
			list.add(t);
		}
		return list;
	}

	public static <T> List<T> projectionColumn(List<Map> maps, String column) {
		List<T> lists = new ArrayList<T>(maps.size());
		for (Map temp : maps) {
			lists.add((T) temp.get(column));
		}
		return lists;
	}

	public static String join(Collection collection, String split) {
		if (collection.size() == 0)
			return null;
		if (split.isEmpty()) {
			return join(collection);
		}
		Iterator ite = collection.iterator();
		StringBuffer stringBuffer = new StringBuffer();
		while (ite.hasNext()) {
			stringBuffer.append(ite.next() + split);
		}

		return stringBuffer.substring(0, stringBuffer.length() - split.length());
	}

	public static String join(Collection collection) {
		if (collection.size() == 0)
			return null;
		Iterator ite = collection.iterator();
		StringBuffer stringBuffer = new StringBuffer();
		while (ite.hasNext()) {
			stringBuffer.append(ite.next());
		}
		return stringBuffer.toString();
	}

	public static List project(List<Map> list, String key) {
		List list1 = new ArrayList(list.size());
		for (Map map : list) {
			list1.add(map.get(key));
		}
		return list1;
	}

	public static List projectByMethod(List list, String method) {
		List list1 = new ArrayList(list.size());
		for (Object obj : list) {
			list1.add(ReflectHelper.method(obj, method));
		}
		return list1;
	}

	public static Map double_list_to_map(List keys, List values) {
		Map map = new HashMap();
		int keys_size = keys.size();
		int values_size = values.size();
		assert keys_size == values_size;
		for (int i = 0; i < keys_size; i++) {
			map.put(keys.get(i), values.get(i));
		}
		return map;
	}

	public static String join(Collection collection, String split, String wrapper) {
		if (collection.size() == 0)
			return null;
		Iterator ite = collection.iterator();
		StringBuffer stringBuffer = new StringBuffer();
		while (ite.hasNext()) {
			stringBuffer.append(wrapper + ite.next() + wrapper + split);
		}
		stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		return stringBuffer.toString();
	}

	public static String join(Object[] collection, String split, String wrapper) {
		if (collection.length == 0)
			return null;
		StringBuffer stringBuffer = new StringBuffer();
		for (Object obj : collection) {
			stringBuffer.append(wrapper + obj + wrapper + split);
		}
		stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		return stringBuffer.toString();
	}

	public static String getString(Map map, String key) {
		return (String) map.get(key);
	}

	public static String getStringNoNull(Map map, String key) {
		String s = (String) map.get(key);
		if (s == null)
			return "";
		return s;
	}

	public static Date getDate(Map map, String key) {
		return new Date(((Timestamp) map.get(key)).getTime());
	}

	public static long getDateAsLong(Map map, String key) {
		return ((Timestamp) map.get(key)).getTime();
	}

	public static int getInt(Map map, String key) {
		return ((Integer) map.get(key)).intValue();
	}

	public static long getLong(Map map, String key) {
		return ((Long) map.get(key)).longValue();
	}

	public static Set hashSet(Object[] array) {
		Set sets = new HashSet();
		for (Object obj : array) {
			sets.add(obj);
		}
		return sets;
	}

	public static List toList(Object[] array) {
		List lists = new ArrayList();
		for (Object obj : array) {
			lists.add(obj);
		}
		return lists;
	}

	public static Set hashSet(int[] array) {
		Set sets = new HashSet();
		for (int obj : array) {
			sets.add(obj);
		}
		return sets;
	}

	public static String join(Object[] arrays, String split) {
		if (arrays == null || arrays.length == 0)
			return "";
		StringBuffer stringBuffer = new StringBuffer();
		for (Object obj : arrays) {
			stringBuffer.append(obj + split);
		}
		stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		return stringBuffer.toString();
	}

	public static String join(int[] arrays, String split) {

		StringBuffer stringBuffer = new StringBuffer();
		for (int obj : arrays) {
			stringBuffer.append(obj + split);
		}
		stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		return stringBuffer.toString();
	}

	public static <K, V> List iterate_map(Map<K, V> map, MapIterator mapIterator) {
		List list = list();
		for (Map.Entry<K, V> entry : map.entrySet()) {
			list.add(mapIterator.iterate(entry.getKey(), entry.getValue()));
		}
		return list;
	}

	public interface MapIterator<K, V> {
		public Object iterate(K key, V value);
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0) {
					if (k1 instanceof Comparable) {
						return ((Comparable) k1).compareTo((Comparable) k2);
					} else
						return 1;
				} else
					return compare;
			}
		};
		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public static <T> T getData(List<T> list, T data) {
		T ret = null;
		if (list != null && data != null) {
			int index = -1;
			if ((index = list.indexOf(data)) > -1)
				ret = list.get(index);
		}
		return ret;
	}
}
