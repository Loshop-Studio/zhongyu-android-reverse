package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.tempEndValues;
            float f7 = fArr[i];
            float f8 = this.tempStartValues[i];
            fArr[i] = AbstractC0037f.m77b(f7, f8, f, f8);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
