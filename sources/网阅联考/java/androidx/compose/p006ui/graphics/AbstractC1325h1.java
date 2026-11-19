package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.graphics.h1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1325h1 {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    /* renamed from: a */
    public static void m513a(Path path, Rect rect, float f4, float f5, boolean z3) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f4), DegreesKt.degrees(f5), z3);
    }

    /* renamed from: c */
    public static /* synthetic */ void m515c(Path path, Path path2, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i4 & 2) != 0) {
            j4 = Offset.INSTANCE.m8961getZeroF1C5BW0();
        }
        path.mo9077addPathUv8p0NA(path2, j4);
    }
}
