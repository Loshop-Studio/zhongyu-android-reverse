package androidx.media;

import android.text.TextUtils;
import p011b0.C1020c;

/* renamed from: androidx.media.h */
/* loaded from: classes.dex */
class C0544h implements InterfaceC0542f {

    /* renamed from: a */
    private String f3582a;

    /* renamed from: b */
    private int f3583b;

    /* renamed from: c */
    private int f3584c;

    C0544h(String str, int i4, int i5) {
        this.f3582a = str;
        this.f3583b = i4;
        this.f3584c = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0544h)) {
            return false;
        }
        C0544h c0544h = (C0544h) obj;
        return TextUtils.equals(this.f3582a, c0544h.f3582a) && this.f3583b == c0544h.f3583b && this.f3584c == c0544h.f3584c;
    }

    public int hashCode() {
        return C1020c.m4774b(this.f3582a, Integer.valueOf(this.f3583b), Integer.valueOf(this.f3584c));
    }
}
