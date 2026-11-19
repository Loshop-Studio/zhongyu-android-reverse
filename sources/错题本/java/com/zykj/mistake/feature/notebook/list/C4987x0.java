package com.zykj.mistake.feature.notebook.list;

/* renamed from: com.zykj.mistake.feature.notebook.list.x0 */
/* loaded from: classes3.dex */
public final class C4987x0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final int f7623a;

    /* renamed from: b */
    public final boolean f7624b;

    public C4987x0(int i, boolean z8) {
        this.f7623a = i;
        this.f7624b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4987x0)) {
            return false;
        }
        C4987x0 c4987x0 = (C4987x0) obj;
        return this.f7623a == c4987x0.f7623a && this.f7624b == c4987x0.f7624b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7624b) + (Integer.hashCode(this.f7623a) * 31);
    }

    public final String toString() {
        return "RemoveMistakeLocally(itemId=" + this.f7623a + ", isMastered=" + this.f7624b + ")";
    }
}
