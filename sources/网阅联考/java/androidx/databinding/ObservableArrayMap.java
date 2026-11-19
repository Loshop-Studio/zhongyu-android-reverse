package androidx.databinding;

import androidx.collection.ArrayMap;
import androidx.databinding.ObservableMap;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ObservableArrayMap<K, V> extends ArrayMap<K, V> implements ObservableMap<K, V> {
    private transient MapChangeRegistry mListeners;

    private void notifyChange(Object obj) {
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, obj);
        }
    }

    @Override // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        if (this.mListeners == null) {
            this.mListeners = new MapChangeRegistry();
        }
        this.mListeners.add(onMapChangedCallback);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        notifyChange(null);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k4, V v3) {
        super.put(k4, v3);
        notifyChange(k4);
        return v3;
    }

    @Override // androidx.collection.ArrayMap
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            int iIndexOfKey = indexOfKey(it.next());
            if (iIndexOfKey >= 0) {
                removeAt(iIndexOfKey);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i4) {
        K kKeyAt = keyAt(i4);
        V v3 = (V) super.removeAt(i4);
        if (v3 != null) {
            notifyChange(kKeyAt);
        }
        return v3;
    }

    @Override // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.remove(onMapChangedCallback);
        }
    }

    @Override // androidx.collection.ArrayMap
    public boolean retainAll(Collection<?> collection) {
        boolean z3 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i4, V v3) {
        K kKeyAt = keyAt(i4);
        V v4 = (V) super.setValueAt(i4, v3);
        notifyChange(kKeyAt);
        return v4;
    }
}
