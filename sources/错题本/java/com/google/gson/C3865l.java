package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* renamed from: com.google.gson.l */
/* loaded from: classes2.dex */
public final class C3865l extends AbstractC3863j {

    /* renamed from: a */
    public final LinkedTreeMap f3057a = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3865l) && ((C3865l) obj).f3057a.equals(this.f3057a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3057a.hashCode();
    }
}
