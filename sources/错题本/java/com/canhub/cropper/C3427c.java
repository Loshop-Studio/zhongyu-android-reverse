package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.c */
/* loaded from: classes2.dex */
public final class C3427c {

    /* renamed from: a */
    public final Uri f2559a;

    /* renamed from: b */
    public final Bitmap f2560b;

    /* renamed from: c */
    public final int f2561c;

    /* renamed from: d */
    public final int f2562d;

    /* renamed from: e */
    public final boolean f2563e;

    /* renamed from: f */
    public final boolean f2564f;

    /* renamed from: g */
    public final Exception f2565g;

    public C3427c(Uri uri, Bitmap bitmap, int i, int i8, boolean z8, boolean z9, Exception exc) {
        this.f2559a = uri;
        this.f2560b = bitmap;
        this.f2561c = i;
        this.f2562d = i8;
        this.f2563e = z8;
        this.f2564f = z9;
        this.f2565g = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3427c)) {
            return false;
        }
        C3427c c3427c = (C3427c) obj;
        return AbstractC5830k.m5325b(this.f2559a, c3427c.f2559a) && AbstractC5830k.m5325b(this.f2560b, c3427c.f2560b) && this.f2561c == c3427c.f2561c && this.f2562d == c3427c.f2562d && this.f2563e == c3427c.f2563e && this.f2564f == c3427c.f2564f && AbstractC5830k.m5325b(this.f2565g, c3427c.f2565g);
    }

    public final int hashCode() {
        int iHashCode = this.f2559a.hashCode() * 31;
        Bitmap bitmap = this.f2560b;
        int iM908i = AbstractC0584a.m908i(this.f2564f, AbstractC0584a.m908i(this.f2563e, AbstractC0584a.m902c(this.f2562d, AbstractC0584a.m902c(this.f2561c, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31), 31), 31);
        Exception exc = this.f2565g;
        return iM908i + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(uri=");
        sb.append(this.f2559a);
        sb.append(", bitmap=");
        sb.append(this.f2560b);
        sb.append(", loadSampleSize=");
        AbstractC1923c.m1059w(sb, this.f2561c, ", degreesRotated=", this.f2562d, ", flipHorizontally=");
        AbstractC1923c.m1058v(", flipVertically=", ", error=", sb, this.f2563e, this.f2564f);
        sb.append(this.f2565g);
        sb.append(")");
        return sb.toString();
    }
}
