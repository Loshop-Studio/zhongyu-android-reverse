package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.a */
/* loaded from: classes2.dex */
public final class C3423a {

    /* renamed from: a */
    public final Bitmap f2534a;

    /* renamed from: b */
    public final Uri f2535b;

    /* renamed from: c */
    public final Exception f2536c;

    /* renamed from: d */
    public final int f2537d;

    public C3423a(Bitmap bitmap, Uri uri, Exception exc, int i) {
        this.f2534a = bitmap;
        this.f2535b = uri;
        this.f2536c = exc;
        this.f2537d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3423a)) {
            return false;
        }
        C3423a c3423a = (C3423a) obj;
        return AbstractC5830k.m5325b(this.f2534a, c3423a.f2534a) && AbstractC5830k.m5325b(this.f2535b, c3423a.f2535b) && AbstractC5830k.m5325b(this.f2536c, c3423a.f2536c) && this.f2537d == c3423a.f2537d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f2534a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Uri uri = this.f2535b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Exception exc = this.f2536c;
        return Integer.hashCode(this.f2537d) + ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Result(bitmap=" + this.f2534a + ", uri=" + this.f2535b + ", error=" + this.f2536c + ", sampleSize=" + this.f2537d + ")";
    }
}
