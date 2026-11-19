package com.xuexiang.xui.widget.progress.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;

/* loaded from: classes.dex */
class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    private static void calculateXYValues(Path path, float[] fArr, float[] fArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr3 = new float[2];
        for (int i4 = 0; i4 < 201; i4++) {
            pathMeasure.getPosTan((i4 * length) / 200.0f, fArr3, null);
            fArr[i4] = fArr3[0];
            fArr2[i4] = fArr3[1];
        }
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(obj, str, iArr);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        return objectAnimatorOfInt;
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat(str, fArr), PropertyValuesHolder.ofFloat(str2, fArr2));
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofInt(str, iArr), PropertyValuesHolder.ofInt(str2, iArr2));
    }

    public static <T> ObjectAnimator ofArgb(T t3, Property<T, Integer> property, int... iArr) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(t3, property, iArr);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        return objectAnimatorOfInt;
    }

    public static <T> ObjectAnimator ofFloat(T t3, Property<T, Float> property, Property<T, Float> property2, Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t3, PropertyValuesHolder.ofFloat((Property<?, Float>) property, fArr), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr2));
    }

    public static <T> ObjectAnimator ofInt(T t3, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t3, PropertyValuesHolder.ofInt((Property<?, Integer>) property, iArr), PropertyValuesHolder.ofInt((Property<?, Integer>) property2, iArr2));
    }

    private static void calculateXYValues(Path path, int[] iArr, int[] iArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        for (int i4 = 0; i4 < 201; i4++) {
            pathMeasure.getPosTan((i4 * length) / 200.0f, fArr, null);
            iArr[i4] = Math.round(fArr[0]);
            iArr2[i4] = Math.round(fArr[1]);
        }
    }
}
