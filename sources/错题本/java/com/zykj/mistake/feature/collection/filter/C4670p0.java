package com.zykj.mistake.feature.collection.filter;

/* renamed from: com.zykj.mistake.feature.collection.filter.p0 */
/* loaded from: classes3.dex */
public final class C4670p0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final long f6671a;

    public C4670p0(long j7) {
        this.f6671a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4670p0) && this.f6671a == ((C4670p0) obj).f6671a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6671a);
    }

    public final String toString() {
        return "ToggleSubject(bookId=" + this.f6671a + ")";
    }
}
