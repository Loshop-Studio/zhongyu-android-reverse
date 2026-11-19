package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.gson.internal.g */
/* loaded from: classes2.dex */
public final class C3850g implements Iterator {

    /* renamed from: a */
    public C3853j f3032a;

    /* renamed from: b */
    public C3853j f3033b = null;

    /* renamed from: c */
    public int f3034c;

    /* renamed from: d */
    public final /* synthetic */ LinkedTreeMap f3035d;

    /* renamed from: e */
    public final /* synthetic */ int f3036e;

    public C3850g(LinkedTreeMap linkedTreeMap, int i) {
        this.f3036e = i;
        this.f3035d = linkedTreeMap;
        this.f3032a = linkedTreeMap.header.f3042d;
        this.f3034c = linkedTreeMap.modCount;
    }

    /* renamed from: a */
    public final Object m2812a() {
        return m2813b();
    }

    /* renamed from: b */
    public final C3853j m2813b() {
        C3853j c3853j = this.f3032a;
        LinkedTreeMap linkedTreeMap = this.f3035d;
        if (c3853j == linkedTreeMap.header) {
            throw new NoSuchElementException();
        }
        if (linkedTreeMap.modCount != this.f3034c) {
            throw new ConcurrentModificationException();
        }
        this.f3032a = c3853j.f3042d;
        this.f3033b = c3853j;
        return c3853j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3032a != this.f3035d.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f3036e) {
            case 1:
                return m2813b().f3044f;
            default:
                return m2812a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3853j c3853j = this.f3033b;
        if (c3853j == null) {
            throw new IllegalStateException();
        }
        LinkedTreeMap linkedTreeMap = this.f3035d;
        linkedTreeMap.removeInternal(c3853j, true);
        this.f3033b = null;
        this.f3034c = linkedTreeMap.modCount;
    }
}
