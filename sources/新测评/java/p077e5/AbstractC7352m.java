package p077e5;

import android.graphics.Matrix;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.m */
/* loaded from: classes4.dex */
public abstract class AbstractC7352m {
    /* renamed from: a */
    public static final float m11776a(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }

    /* renamed from: b */
    public static final Matrix m11777b(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    /* renamed from: c */
    public static final EzyMatrix.Matrix m11778c(Matrix matrix, long j10) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        EzyMatrix.Matrix.C6790b c6790bM7710D = EzyMatrix.Matrix.m7710D();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        c6790bM7710D.m7734A(fArr[2]);
        c6790bM7710D.m7735B(fArr[5]);
        c6790bM7710D.m7756w(fArr[0]);
        c6790bM7710D.m7757x(fArr[4]);
        c6790bM7710D.m7758y(fArr[1]);
        c6790bM7710D.m7759z(fArr[3]);
        c6790bM7710D.m7752s(fArr[6]);
        c6790bM7710D.m7753t(fArr[7]);
        c6790bM7710D.m7754u(fArr[8]);
        c6790bM7710D.m7750q(j10);
        EzyMatrix.Matrix matrixBuild = c6790bM7710D.build();
        Intrinsics.checkNotNullExpressionValue(matrixBuild, "newBuilder.build()");
        return matrixBuild;
    }

    /* renamed from: d */
    public static final Matrix m11779d(EzyMatrix.Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        float fM7723B = matrix.m7723B();
        float fM7724C = matrix.m7724C();
        matrix2.setValues(new float[]{matrix.getScaleX(), matrix.m7732z(), fM7723B, matrix.m7722A(), matrix.getScaleY(), fM7724C, matrix.m7729w(), matrix.m7730x(), matrix.m7731y()});
        return matrix2;
    }
}
