package androidx.compose.foundation.gestures;

import androidx.compose.p006ui.geometry.Offset;

/* renamed from: androidx.compose.foundation.gestures.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0507d {
    /* renamed from: a */
    public static /* synthetic */ void m182a(TransformScope transformScope, float f4, long j4, float f5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            j4 = Offset.INSTANCE.m8961getZeroF1C5BW0();
        }
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        transformScope.mo7142transformByd4ec7I(f4, j4, f5);
    }
}
