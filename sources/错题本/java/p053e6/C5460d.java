package p053e6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6563d;

/* renamed from: e6.d */
/* loaded from: classes2.dex */
public final class C5460d implements Map.Entry, InterfaceC6563d {

    /* renamed from: a */
    public final MapBuilder f8428a;

    /* renamed from: b */
    public final int f8429b;

    /* renamed from: c */
    public final int f8430c;

    public C5460d(MapBuilder mapBuilder, int i) {
        this.f8428a = mapBuilder;
        this.f8429b = i;
        this.f8430c = mapBuilder.modCount;
    }

    /* renamed from: a */
    public final void m4822a() {
        if (this.f8428a.modCount != this.f8430c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC5830k.m5325b(entry.getKey(), getKey()) && AbstractC5830k.m5325b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m4822a();
        return this.f8428a.keysArray[this.f8429b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m4822a();
        Object[] objArr = this.f8428a.valuesArray;
        AbstractC5830k.m5327d(objArr);
        return objArr[this.f8429b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m4822a();
        MapBuilder mapBuilder = this.f8428a;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        Object[] objArrAccess$allocateValuesArray = MapBuilder.access$allocateValuesArray(mapBuilder);
        int i = this.f8429b;
        Object obj2 = objArrAccess$allocateValuesArray[i];
        objArrAccess$allocateValuesArray[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
