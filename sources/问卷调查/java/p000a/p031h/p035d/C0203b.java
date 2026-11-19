package p000a.p031h.p035d;

import android.graphics.Insets;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.d.b */
/* loaded from: classes.dex */
public final class C0203b {

    /* renamed from: e */
    public static final C0203b f1453e = new C0203b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f1454a;

    /* renamed from: b */
    public final int f1455b;

    /* renamed from: c */
    public final int f1456c;

    /* renamed from: d */
    public final int f1457d;

    public C0203b(int i, int i2, int i3, int i4) {
        this.f1454a = i;
        this.f1455b = i2;
        this.f1456c = i3;
        this.f1457d = i4;
    }

    /* renamed from: a */
    public static C0203b m758a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1453e : new C0203b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C0203b m759b(Insets insets) {
        return m758a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets m760c() {
        return Insets.of(this.f1454a, this.f1455b, this.f1456c, this.f1457d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0203b.class != obj.getClass()) {
            return false;
        }
        C0203b c0203b = (C0203b) obj;
        return this.f1457d == c0203b.f1457d && this.f1454a == c0203b.f1454a && this.f1456c == c0203b.f1456c && this.f1455b == c0203b.f1455b;
    }

    public int hashCode() {
        return (((((this.f1454a * 31) + this.f1455b) * 31) + this.f1456c) * 31) + this.f1457d;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("Insets{left=");
        sbM2079g.append(this.f1454a);
        sbM2079g.append(", top=");
        sbM2079g.append(this.f1455b);
        sbM2079g.append(", right=");
        sbM2079g.append(this.f1456c);
        sbM2079g.append(", bottom=");
        sbM2079g.append(this.f1457d);
        sbM2079g.append('}');
        return sbM2079g.toString();
    }
}
