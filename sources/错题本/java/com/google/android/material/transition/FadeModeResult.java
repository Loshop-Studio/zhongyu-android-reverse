package com.google.android.material.transition;

/* loaded from: classes2.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i, int i8, boolean z8) {
        this.startAlpha = i;
        this.endAlpha = i8;
        this.endOnTop = z8;
    }

    public static FadeModeResult endOnTop(int i, int i8) {
        return new FadeModeResult(i, i8, true);
    }

    public static FadeModeResult startOnTop(int i, int i8) {
        return new FadeModeResult(i, i8, false);
    }
}
