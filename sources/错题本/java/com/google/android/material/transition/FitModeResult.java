package com.google.android.material.transition;

/* loaded from: classes2.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f, float f7, float f8, float f9, float f10, float f11) {
        this.startScale = f;
        this.endScale = f7;
        this.currentStartWidth = f8;
        this.currentStartHeight = f9;
        this.currentEndWidth = f10;
        this.currentEndHeight = f11;
    }
}
