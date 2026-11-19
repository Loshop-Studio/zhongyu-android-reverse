package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes3.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* renamed from: a */
    public int f3306a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f3306a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f3306a == 0) {
            this.f3306a = super.hashCode();
        }
        return this.f3306a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f3306a = 0;
        return super.put(obj, obj2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap simpleArrayMap) {
        this.f3306a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public Object removeAt(int i10) {
        this.f3306a = 0;
        return super.removeAt(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap
    public Object setValueAt(int i10, Object obj) {
        this.f3306a = 0;
        return super.setValueAt(i10, obj);
    }
}
