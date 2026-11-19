package androidx.collection;

import id.InterfaceC9628e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, InterfaceC9628e.a {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i10) {
        AbstractC9979u.m20294g(keys, "keys");
        AbstractC9979u.m20294g(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i10;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        Object[] objArr = this.values;
        int i10 = this.index;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }
}
