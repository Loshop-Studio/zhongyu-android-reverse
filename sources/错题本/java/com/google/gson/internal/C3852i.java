package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.gson.internal.i */
/* loaded from: classes2.dex */
public final class C3852i extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ LinkedTreeMap f3038a;

    public C3852i(LinkedTreeMap linkedTreeMap) {
        this.f3038a = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3038a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3038a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3850g(this.f3038a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f3038a.removeInternalByKey(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3038a.size;
    }
}
