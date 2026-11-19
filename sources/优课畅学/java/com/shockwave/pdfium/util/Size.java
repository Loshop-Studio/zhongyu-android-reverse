package com.shockwave.pdfium.util;

/* loaded from: classes4.dex */
public class Size {

    /* renamed from: a */
    public final int f4319a;

    /* renamed from: b */
    public final int f4320b;

    public Size(int i10, int i11) {
        this.f4319a = i10;
        this.f4320b = i11;
    }

    /* renamed from: a */
    public int m4106a() {
        return this.f4320b;
    }

    /* renamed from: b */
    public int m4107b() {
        return this.f4319a;
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
            if (this.f4319a == size.f4319a && this.f4320b == size.f4320b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f4320b;
        int i11 = this.f4319a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f4319a + "x" + this.f4320b;
    }
}
