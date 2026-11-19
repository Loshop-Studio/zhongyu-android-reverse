package p171l7;

import android.net.Uri;
import com.canhub.cropper.CropImageOptions;
import com.zykj.view.p077ui.crop.EzyCropTheme;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7.d */
/* loaded from: classes5.dex */
public final class C8900d {

    /* renamed from: a */
    public final Uri f14708a;

    /* renamed from: b */
    public final CropImageOptions f14709b;

    /* renamed from: c */
    public final EzyCropTheme f14710c;

    public C8900d(Uri uri, CropImageOptions cropImageOptions, EzyCropTheme cropTheme) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cropImageOptions, "cropImageOptions");
        Intrinsics.checkNotNullParameter(cropTheme, "cropTheme");
        this.f14708a = uri;
        this.f14709b = cropImageOptions;
        this.f14710c = cropTheme;
    }

    /* renamed from: a */
    public final CropImageOptions m13830a() {
        return this.f14709b;
    }

    /* renamed from: b */
    public final EzyCropTheme m13831b() {
        return this.f14710c;
    }

    /* renamed from: c */
    public final Uri m13832c() {
        return this.f14708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8900d)) {
            return false;
        }
        C8900d c8900d = (C8900d) obj;
        return Intrinsics.areEqual(this.f14708a, c8900d.f14708a) && Intrinsics.areEqual(this.f14709b, c8900d.f14709b) && this.f14710c == c8900d.f14710c;
    }

    public int hashCode() {
        return (((this.f14708a.hashCode() * 31) + this.f14709b.hashCode()) * 31) + this.f14710c.hashCode();
    }

    public String toString() {
        return "CropRequestOptions(uri=" + this.f14708a + ", cropImageOptions=" + this.f14709b + ", cropTheme=" + this.f14710c + ")";
    }
}
