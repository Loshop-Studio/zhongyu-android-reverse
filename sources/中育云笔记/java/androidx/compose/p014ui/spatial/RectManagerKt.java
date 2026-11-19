package androidx.compose.p014ui.spatial;

import androidx.compose.p014ui.unit.IntOffset;

/* loaded from: classes2.dex */
public final class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m32758analyzeComponents58bKbWc(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    private static final boolean getHasNonTranslationComponents(int i10) {
        return (i10 & 2) == 0;
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i10) {
    }

    private static final boolean isIdentity(int i10) {
        return i10 == 3;
    }

    private static /* synthetic */ void isIdentity$annotations(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m32759isSetgyyYBs(long j10) {
        return !IntOffset.m33628equalsimpl0(j10, IntOffset.Companion.m33639getMaxnOccac());
    }

    private static final int toInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
