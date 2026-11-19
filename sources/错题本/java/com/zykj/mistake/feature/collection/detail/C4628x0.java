package com.zykj.mistake.feature.collection.detail;

/* renamed from: com.zykj.mistake.feature.collection.detail.x0 */
/* loaded from: classes3.dex */
public final class C4628x0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final long f6533a;

    public C4628x0(long j7) {
        this.f6533a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4628x0) && this.f6533a == ((C4628x0) obj).f6533a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6533a);
    }

    public final String toString() {
        return "ToggleTag(tagId=" + this.f6533a + ")";
    }
}
