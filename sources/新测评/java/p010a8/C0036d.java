package p010a8;

import android.net.Uri;
import com.canhub.cropper.CropImageOptions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a8.d */
/* loaded from: classes5.dex */
public final class C0036d {

    /* renamed from: a */
    public final Uri f81a;

    /* renamed from: b */
    public final CropImageOptions f82b;

    public C0036d(Uri uri, CropImageOptions cropImageOptions) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cropImageOptions, "cropImageOptions");
        this.f81a = uri;
        this.f82b = cropImageOptions;
    }

    /* renamed from: a */
    public final CropImageOptions m72a() {
        return this.f82b;
    }

    /* renamed from: b */
    public final Uri m73b() {
        return this.f81a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0036d)) {
            return false;
        }
        C0036d c0036d = (C0036d) obj;
        return Intrinsics.areEqual(this.f81a, c0036d.f81a) && Intrinsics.areEqual(this.f82b, c0036d.f82b);
    }

    public int hashCode() {
        return (this.f81a.hashCode() * 31) + this.f82b.hashCode();
    }

    public String toString() {
        return "CropRequestOptions(uri=" + this.f81a + ", cropImageOptions=" + this.f82b + ")";
    }
}
