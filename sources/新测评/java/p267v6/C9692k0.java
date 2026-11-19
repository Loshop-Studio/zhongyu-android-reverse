package p267v6;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v6.k0 */
/* loaded from: classes4.dex */
public final class C9692k0 {

    /* renamed from: a */
    public final Bitmap f16998a;

    /* renamed from: b */
    public final List f16999b;

    public C9692k0(Bitmap bitmap, List pointList) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        this.f16998a = bitmap;
        this.f16999b = pointList;
    }

    /* renamed from: b */
    public static /* synthetic */ C9692k0 m16203b(C9692k0 c9692k0, Bitmap bitmap, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = c9692k0.f16998a;
        }
        if ((i10 & 2) != 0) {
            list = c9692k0.f16999b;
        }
        return c9692k0.m16204a(bitmap, list);
    }

    /* renamed from: a */
    public final C9692k0 m16204a(Bitmap bitmap, List pointList) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        return new C9692k0(bitmap, pointList);
    }

    /* renamed from: c */
    public final Bitmap m16205c() {
        return this.f16998a;
    }

    /* renamed from: d */
    public final List m16206d() {
        return this.f16999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9692k0)) {
            return false;
        }
        C9692k0 c9692k0 = (C9692k0) obj;
        return Intrinsics.areEqual(this.f16998a, c9692k0.f16998a) && Intrinsics.areEqual(this.f16999b, c9692k0.f16999b);
    }

    public int hashCode() {
        return (this.f16998a.hashCode() * 31) + this.f16999b.hashCode();
    }

    public String toString() {
        return "ManualPointState(bitmap=" + this.f16998a + ", pointList=" + this.f16999b + ")";
    }

    public /* synthetic */ C9692k0(Bitmap bitmap, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : bitmap, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
