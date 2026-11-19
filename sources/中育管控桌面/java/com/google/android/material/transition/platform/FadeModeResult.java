package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i6, int i7, boolean z6) {
        this.startAlpha = i6;
        this.endAlpha = i7;
        this.endOnTop = z6;
    }

    public static FadeModeResult endOnTop(int i6, int i7) {
        return new FadeModeResult(i6, i7, true);
    }

    public static FadeModeResult startOnTop(int i6, int i7) {
        return new FadeModeResult(i6, i7, false);
    }
}
