package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i) {
        setInternalState(i);
    }

    public static Hct from(double d9, double d10, double d11) {
        return new Hct(HctSolver.solveToInt(d9, d10, d11));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    private void setInternalState(int i) {
        this.argb = i;
        Cam16 cam16FromInt = Cam16.fromInt(i);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    public void setChroma(double d9) {
        setInternalState(HctSolver.solveToInt(this.hue, d9, this.tone));
    }

    public void setHue(double d9) {
        setInternalState(HctSolver.solveToInt(d9, this.chroma, this.tone));
    }

    public void setTone(double d9) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d9));
    }

    public int toInt() {
        return this.argb;
    }
}
