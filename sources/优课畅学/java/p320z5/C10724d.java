package p320z5;

import android.net.Uri;
import com.canhub.cropper.CropImageOptions;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: z5.d */
/* loaded from: classes5.dex */
public final class C10724d {

    /* renamed from: a */
    public final Uri f21266a;

    /* renamed from: b */
    public final CropImageOptions f21267b;

    public C10724d(Uri uri, CropImageOptions cropImageOptions) {
        AbstractC9133u.m16133g(uri, "uri");
        AbstractC9133u.m16133g(cropImageOptions, "cropImageOptions");
        this.f21266a = uri;
        this.f21267b = cropImageOptions;
    }

    /* renamed from: a */
    public final CropImageOptions m20023a() {
        return this.f21267b;
    }

    /* renamed from: b */
    public final Uri m20024b() {
        return this.f21266a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10724d)) {
            return false;
        }
        C10724d c10724d = (C10724d) obj;
        return AbstractC9133u.m16128b(this.f21266a, c10724d.f21266a) && AbstractC9133u.m16128b(this.f21267b, c10724d.f21267b);
    }

    public int hashCode() {
        return (this.f21266a.hashCode() * 31) + this.f21267b.hashCode();
    }

    public String toString() {
        return "CropRequestOptions(uri=" + this.f21266a + ", cropImageOptions=" + this.f21267b + ")";
    }
}
