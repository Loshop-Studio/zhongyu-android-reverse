package p026b7;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.c1 */
/* loaded from: classes4.dex */
public final class C4997c1 {

    /* renamed from: a */
    public final boolean f2493a;

    /* renamed from: b */
    public final Bitmap f2494b;

    /* renamed from: c */
    public final List f2495c;

    public C4997c1(boolean z9, Bitmap bitmap, List points) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f2493a = z9;
        this.f2494b = bitmap;
        this.f2495c = points;
    }

    /* renamed from: a */
    public final Bitmap m2473a() {
        return this.f2494b;
    }

    /* renamed from: b */
    public final List m2474b() {
        return this.f2495c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4997c1)) {
            return false;
        }
        C4997c1 c4997c1 = (C4997c1) obj;
        return this.f2493a == c4997c1.f2493a && Intrinsics.areEqual(this.f2494b, c4997c1.f2494b) && Intrinsics.areEqual(this.f2495c, c4997c1.f2495c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f2493a) * 31) + this.f2494b.hashCode()) * 31) + this.f2495c.hashCode();
    }

    public String toString() {
        return "SheetResult(result=" + this.f2493a + ", bitmap=" + this.f2494b + ", points=" + this.f2495c + ")";
    }
}
