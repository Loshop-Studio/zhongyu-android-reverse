package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class MatrixExtKt {
    public static final float getScaleX(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }

    public static final Matrix invert(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    public static final RectF mapRect(RectF rectF, Matrix matrix) {
        AbstractC9133u.m16133g(rectF, "<this>");
        AbstractC9133u.m16133g(matrix, "matrix");
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    public static final EzyMatrix.Matrix toEzyMatrix(Matrix matrix, long j10) {
        AbstractC9133u.m16133g(matrix, "<this>");
        EzyMatrix.Matrix.C7219b c7219bM8226u = EzyMatrix.Matrix.m8226u();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        c7219bM8226u.m8239A(fArr[2]);
        c7219bM8226u.m8240B(fArr[5]);
        c7219bM8226u.m8261w(fArr[0]);
        c7219bM8226u.m8262x(fArr[4]);
        c7219bM8226u.m8263y(fArr[1]);
        c7219bM8226u.m8264z(fArr[3]);
        c7219bM8226u.m8257s(fArr[6]);
        c7219bM8226u.m8258t(fArr[7]);
        c7219bM8226u.m8259u(fArr[8]);
        c7219bM8226u.m8255q(j10);
        EzyMatrix.Matrix matrixBuild = c7219bM8226u.build();
        AbstractC9133u.m16132f(matrixBuild, "newBuilder.build()");
        return matrixBuild;
    }

    public static final Matrix toMatrix(EzyMatrix.Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        float fM8233s = matrix.m8233s();
        float fM8234t = matrix.m8234t();
        matrix2.setValues(new float[]{matrix.getScaleX(), matrix.m8231q(), fM8233s, matrix.m8232r(), matrix.getScaleY(), fM8234t, matrix.m8228n(), matrix.m8229o(), matrix.m8230p()});
        return matrix2;
    }
}
