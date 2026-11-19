package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes2.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i4, int i5, boolean z3) {
        this.startAlpha = i4;
        this.endAlpha = i5;
        this.endOnTop = z3;
    }

    public static FadeModeResult endOnTop(int i4, int i5) {
        return new FadeModeResult(i4, i5, true);
    }

    public static FadeModeResult startOnTop(int i4, int i5) {
        return new FadeModeResult(i4, i5, false);
    }
}
