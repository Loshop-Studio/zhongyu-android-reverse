package p024c0;

import android.graphics.Bitmap;
import p180v0.AbstractC6664k;

/* renamed from: c0.k */
/* loaded from: classes2.dex */
public final class C3214k implements InterfaceC3212i {

    /* renamed from: a */
    public final C3209f f1767a;

    /* renamed from: b */
    public int f1768b;

    /* renamed from: c */
    public Bitmap.Config f1769c;

    public C3214k(C3209f c3209f) {
        this.f1767a = c3209f;
    }

    @Override // p024c0.InterfaceC3212i
    /* renamed from: a */
    public final void mo2149a() {
        this.f1767a.m2139a(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3214k) {
            C3214k c3214k = (C3214k) obj;
            if (this.f1768b == c3214k.f1768b && AbstractC6664k.m6321a(this.f1769c, c3214k.f1769c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1768b * 31;
        Bitmap.Config config = this.f1769c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C3215l.m2164c(this.f1768b, this.f1769c);
    }
}
