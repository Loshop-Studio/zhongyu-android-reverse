package com.zykj.mistake.feature.collection.filter;

/* renamed from: com.zykj.mistake.feature.collection.filter.q0 */
/* loaded from: classes3.dex */
public final class C4672q0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final long f6672a;

    public C4672q0(long j7) {
        this.f6672a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4672q0) && this.f6672a == ((C4672q0) obj).f6672a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6672a);
    }

    public final String toString() {
        return "ToggleTag(tagId=" + this.f6672a + ")";
    }
}
