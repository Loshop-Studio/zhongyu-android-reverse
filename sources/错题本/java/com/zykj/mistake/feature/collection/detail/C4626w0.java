package com.zykj.mistake.feature.collection.detail;

/* renamed from: com.zykj.mistake.feature.collection.detail.w0 */
/* loaded from: classes3.dex */
public final class C4626w0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final long f6531a;

    public C4626w0(long j7) {
        this.f6531a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4626w0) && this.f6531a == ((C4626w0) obj).f6531a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6531a);
    }

    public final String toString() {
        return "ToggleSubject(bookId=" + this.f6531a + ")";
    }
}
