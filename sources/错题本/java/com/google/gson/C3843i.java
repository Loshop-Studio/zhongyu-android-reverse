package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.gson.i */
/* loaded from: classes2.dex */
public final class C3843i extends AbstractC3863j implements Iterable {

    /* renamed from: a */
    public final ArrayList f3013a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3843i) && ((C3843i) obj).f3013a.equals(this.f3013a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3013a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3013a.iterator();
    }
}
