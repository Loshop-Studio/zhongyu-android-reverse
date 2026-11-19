package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private Object[] entries;
    private int entriesSize;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private Map<K, V> overflowEntries;
    private Map<K, V> overflowEntriesDescending;

    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = SmallSortedMap.this.entriesSize;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.pos;
            return (i10 > 0 && i10 <= SmallSortedMap.this.entriesSize) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (getOverflowIterator().hasNext()) {
                return getOverflowIterator().next();
            }
            Object[] objArr = SmallSortedMap.this.entries;
            int i10 = this.pos - 1;
            this.pos = i10;
            return (Entry) objArr[i10];
        }
    }

    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // com.google.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new DescendingEntryIterator();
        }
    }

    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        private final K key;
        private V value;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.key;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.value;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            SmallSortedMap.this.checkMutable();
            V v11 = this.value;
            this.value = v10;
            return v11;
        }

        public String toString() {
            return this.key + ContainerUtils.KEY_VALUE_DELIMITER + this.value;
        }

        public Entry(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        @Override // java.lang.Comparable
        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < SmallSortedMap.this.entriesSize || (!SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            SmallSortedMap.this.checkMutable();
            if (this.pos >= SmallSortedMap.this.entriesSize) {
                getOverflowIterator().remove();
                return;
            }
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i10 = this.pos;
            this.pos = i10 - 1;
            smallSortedMap.removeArrayEntryAt(i10);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i10 = this.pos + 1;
            this.pos = i10;
            return i10 < SmallSortedMap.this.entriesSize ? (Entry) SmallSortedMap.this.entries[this.pos] : getOverflowIterator().next();
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((SmallSortedMap) entry.getKey(), (K) entry.getValue());
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int binarySearchInArray(K r5) {
        /*
            r4 = this;
            int r0 = r4.entriesSize
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1d
            java.lang.Object[] r2 = r4.entries
            r2 = r2[r1]
            com.google.protobuf.SmallSortedMap$Entry r2 = (com.google.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1a
            int r0 = r0 + 1
        L18:
            int r5 = -r0
            return r5
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            if (r0 > r1) goto L3f
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.entries
            r3 = r3[r2]
            com.google.protobuf.SmallSortedMap$Entry r3 = (com.google.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L38
            int r2 = r2 + (-1)
            r1 = r2
            goto L1e
        L38:
            if (r3 <= 0) goto L3e
            int r2 = r2 + 1
            r0 = r2
            goto L1e
        L3e:
            return r2
        L3f:
            int r0 = r0 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.SmallSortedMap.binarySearchInArray(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entries == null) {
            this.entries = new Object[16];
        }
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorT extends FieldSet.FieldDescriptorLite<FieldDescriptorT>> SmallSortedMap<FieldDescriptorT, Object> newFieldMap() {
        return (SmallSortedMap<FieldDescriptorT, Object>) new SmallSortedMap<FieldDescriptorT, Object>() { // from class: com.google.protobuf.SmallSortedMap.1
            @Override // com.google.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                        Map.Entry<FieldDescriptorT, Object> arrayEntryAt = getArrayEntryAt(i10);
                        if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorT, Object> entry : getOverflowEntries()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((C71771<FieldDescriptorT>) obj, (Comparable) obj2);
            }
        };
    }

    public static <K extends Comparable<K>, V> SmallSortedMap<K, V> newInstanceForTest() {
        return new SmallSortedMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i10) {
        checkMutable();
        V v10 = (V) ((Entry) this.entries[i10]).getValue();
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.entriesSize - i10) - 1);
        this.entriesSize--;
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entries[this.entriesSize] = new Entry(this, it.next());
            this.entriesSize++;
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (this.entriesSize != 0) {
            this.entries = null;
            this.entriesSize = 0;
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> descendingEntrySet() {
        return new DescendingEntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet();
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!getArrayEntryAt(i10).equals(smallSortedMap.getArrayEntryAt(i10))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(smallSortedMap.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? (V) ((Entry) this.entries[iBinarySearchInArray]).getValue() : this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i10) {
        if (i10 < this.entriesSize) {
            return (Entry) this.entries[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public int getNumArrayEntries() {
        return this.entriesSize;
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? Collections.EMPTY_SET : this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            iHashCode += this.entries[i10].hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.overflowEntries.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntries);
        this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntriesDescending);
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((SmallSortedMap<K, V>) obj, (Comparable) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entriesSize + this.overflowEntries.size();
    }

    private SmallSortedMap() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V put(K k10, V v10) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k10);
        if (iBinarySearchInArray >= 0) {
            return (V) ((Entry) this.entries[iBinarySearchInArray]).setValue(v10);
        }
        ensureEntryArrayMutable();
        int i10 = -(iBinarySearchInArray + 1);
        if (i10 >= 16) {
            return getOverflowEntriesMutable().put(k10, v10);
        }
        int i11 = this.entriesSize;
        if (i11 == 16) {
            Entry entry = (Entry) this.entries[15];
            this.entriesSize = i11 - 1;
            getOverflowEntriesMutable().put(entry.getKey(), entry.getValue());
        }
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.entries[i10] = new Entry(k10, v10);
        this.entriesSize++;
        return null;
    }
}
