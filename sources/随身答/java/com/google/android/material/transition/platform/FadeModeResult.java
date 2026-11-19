package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i9, int i10, boolean z9) {
        this.startAlpha = i9;
        this.endAlpha = i10;
        this.endOnTop = z9;
    }

    public static FadeModeResult endOnTop(int i9, int i10) {
        return new FadeModeResult(i9, i10, true);
    }

    public static FadeModeResult startOnTop(int i9, int i10) {
        return new FadeModeResult(i9, i10, false);
    }
}
