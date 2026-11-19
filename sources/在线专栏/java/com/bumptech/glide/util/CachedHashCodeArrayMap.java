package com.bumptech.glide.util;

import androidx.collection.C0247a;
import androidx.collection.C0253g;

/* loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends C0247a<K, V> {
    private int hashCode;

    @Override // androidx.collection.C0253g, java.util.Map
    public void clear() {
        this.hashCode = 0;
        super.clear();
    }

    @Override // androidx.collection.C0253g, java.util.Map
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    @Override // androidx.collection.C0253g, java.util.Map
    public V put(K k4, V v3) {
        this.hashCode = 0;
        return (V) super.put(k4, v3);
    }

    @Override // androidx.collection.C0253g
    public void putAll(C0253g<? extends K, ? extends V> c0253g) {
        this.hashCode = 0;
        super.putAll(c0253g);
    }

    @Override // androidx.collection.C0253g
    public V removeAt(int i4) {
        this.hashCode = 0;
        return (V) super.removeAt(i4);
    }

    @Override // androidx.collection.C0253g
    public V setValueAt(int i4, V v3) {
        this.hashCode = 0;
        return (V) super.setValueAt(i4, v3);
    }
}
