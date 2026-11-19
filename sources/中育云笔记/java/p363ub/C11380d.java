package p363ub;

import android.net.Uri;
import com.canhub.cropper.CropImageOptions;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ub.d */
/* loaded from: classes6.dex */
public final class C11380d {

    /* renamed from: a */
    public final Uri f27204a;

    /* renamed from: b */
    public final CropImageOptions f27205b;

    public C11380d(Uri uri, CropImageOptions cropImageOptions) {
        AbstractC9979u.m20294g(uri, "uri");
        AbstractC9979u.m20294g(cropImageOptions, "cropImageOptions");
        this.f27204a = uri;
        this.f27205b = cropImageOptions;
    }

    /* renamed from: a */
    public final CropImageOptions m25325a() {
        return this.f27205b;
    }

    /* renamed from: b */
    public final Uri m25326b() {
        return this.f27204a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11380d)) {
            return false;
        }
        C11380d c11380d = (C11380d) obj;
        return AbstractC9979u.m20289b(this.f27204a, c11380d.f27204a) && AbstractC9979u.m20289b(this.f27205b, c11380d.f27205b);
    }

    public int hashCode() {
        return (this.f27204a.hashCode() * 31) + this.f27205b.hashCode();
    }

    public String toString() {
        return "CropRequestOptions(uri=" + this.f27204a + ", cropImageOptions=" + this.f27205b + ")";
    }
}
