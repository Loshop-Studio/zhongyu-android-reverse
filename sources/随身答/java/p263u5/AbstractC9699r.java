package p263u5;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.r */
/* loaded from: classes4.dex */
public abstract class AbstractC9699r {
    /* renamed from: a */
    public static final RectF m16212a(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }
}
