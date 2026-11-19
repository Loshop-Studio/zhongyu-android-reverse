package androidx.compose.p006ui.graphics;

/* renamed from: androidx.compose.ui.graphics.i1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1328i1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m518a(PathMeasure pathMeasure, float f4, float f5, Path path, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i4 & 8) != 0) {
            z3 = true;
        }
        return pathMeasure.getSegment(f4, f5, path, z3);
    }
}
