package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;

/* loaded from: classes.dex */
public interface TransformScope {

    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m27259transformByd4ec7I$default(TransformScope transformScope, float f10, long j10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.Companion.m30653getZeroF1C5BW0();
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        transformScope.mo27136transformByd4ec7I(f10, j10, f11);
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo27136transformByd4ec7I(float f10, long j10, float f11);
}
