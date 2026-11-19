package com.zykj.mistake.feature.ask;

import java.util.ArrayList;

/* renamed from: com.zykj.mistake.feature.ask.h */
/* loaded from: classes3.dex */
public final class C4524h extends AbstractC4528j {

    /* renamed from: a */
    public final ArrayList f6247a;

    public C4524h(ArrayList arrayList) {
        this.f6247a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4524h) && this.f6247a.equals(((C4524h) obj).f6247a);
    }

    public final int hashCode() {
        return this.f6247a.hashCode();
    }

    public final String toString() {
        return "ResolveAndOpenAsk(items=" + this.f6247a + ")";
    }
}
