package com.shockwave.pdfium.util;

/* loaded from: classes5.dex */
public class Size {

    /* renamed from: a */
    public final int f12772a;

    /* renamed from: b */
    public final int f12773b;

    public Size(int i10, int i11) {
        this.f12772a = i10;
        this.f12773b = i11;
    }

    /* renamed from: a */
    public int m9719a() {
        return this.f12773b;
    }

    /* renamed from: b */
    public int m9720b() {
        return this.f12772a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f12772a == size.f12772a && this.f12773b == size.f12773b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f12773b;
        int i11 = this.f12772a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f12772a + "x" + this.f12773b;
    }
}
