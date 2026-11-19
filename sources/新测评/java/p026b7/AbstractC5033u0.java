package p026b7;

import android.graphics.Bitmap;
import android.graphics.Point;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p110h5.C7629a;

/* renamed from: b7.u0 */
/* loaded from: classes4.dex */
public abstract class AbstractC5033u0 {
    /* renamed from: a */
    public static final C4997c1 m2514a(C7629a c7629a) {
        Intrinsics.checkNotNullParameter(c7629a, "<this>");
        boolean z9 = c7629a.f12816a;
        Bitmap srcBitmap = c7629a.f12818c;
        Intrinsics.checkNotNullExpressionValue(srcBitmap, "srcBitmap");
        Point[] points = c7629a.f12820e;
        Intrinsics.checkNotNullExpressionValue(points, "points");
        return new C4997c1(z9, srcBitmap, CollectionsKt.toList(ArraysKt.filterNotNull(points)));
    }

    /* renamed from: b */
    public static final C4997c1 m2515b(C7629a c7629a) {
        Intrinsics.checkNotNullParameter(c7629a, "<this>");
        boolean z9 = c7629a.f12816a;
        Bitmap bitmap = c7629a.f12819d;
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        Point[] points = c7629a.f12820e;
        Intrinsics.checkNotNullExpressionValue(points, "points");
        return new C4997c1(z9, bitmap, CollectionsKt.toList(ArraysKt.filterNotNull(points)));
    }
}
