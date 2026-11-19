package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.internal.h */
/* loaded from: classes2.dex */
public final class C3851h extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ LinkedTreeMap f3037a;

    public C3851h(LinkedTreeMap linkedTreeMap) {
        this.f3037a = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3037a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f3037a.findByEntry((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3850g(this.f3037a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        LinkedTreeMap linkedTreeMap;
        C3853j c3853jFindByEntry;
        if (!(obj instanceof Map.Entry) || (c3853jFindByEntry = (linkedTreeMap = this.f3037a).findByEntry((Map.Entry) obj)) == null) {
            return false;
        }
        linkedTreeMap.removeInternal(c3853jFindByEntry, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3037a.size;
    }
}
