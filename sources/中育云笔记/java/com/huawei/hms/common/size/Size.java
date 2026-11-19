package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;

/* loaded from: classes5.dex */
public class Size {

    /* renamed from: a */
    public final int f11594a;

    /* renamed from: b */
    public final int f11595b;

    public Size(int i10, int i11) {
        this.f11594a = i10;
        this.f11595b = i11;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf("*");
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f11594a == size.f11594a && this.f11595b == size.f11595b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f11595b;
    }

    public final int getWidth() {
        return this.f11594a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return "Width is " + this.f11594a + " Height is " + this.f11595b;
    }
}
