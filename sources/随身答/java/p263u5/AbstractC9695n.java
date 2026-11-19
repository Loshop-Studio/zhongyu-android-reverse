package p263u5;

import android.graphics.Matrix;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.n */
/* loaded from: classes4.dex */
public abstract class AbstractC9695n {
    /* renamed from: a */
    public static final float m16199a(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }

    /* renamed from: b */
    public static final Matrix m16200b(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    /* renamed from: c */
    public static final EzyMatrix.Matrix m16201c(Matrix matrix, long j9) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        EzyMatrix.Matrix.C7109b c7109bM8839G = EzyMatrix.Matrix.m8839G();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        c7109bM8839G.m8863A(fArr[2]);
        c7109bM8839G.m8864B(fArr[5]);
        c7109bM8839G.m8885w(fArr[0]);
        c7109bM8839G.m8886x(fArr[4]);
        c7109bM8839G.m8887y(fArr[1]);
        c7109bM8839G.m8888z(fArr[3]);
        c7109bM8839G.m8881s(fArr[6]);
        c7109bM8839G.m8882t(fArr[7]);
        c7109bM8839G.m8883u(fArr[8]);
        c7109bM8839G.m8879q(j9);
        EzyMatrix.Matrix matrixBuild = c7109bM8839G.build();
        Intrinsics.checkNotNullExpressionValue(matrixBuild, "newBuilder.build()");
        return matrixBuild;
    }

    /* renamed from: d */
    public static final Matrix m16202d(EzyMatrix.Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        float fM8855E = matrix.m8855E();
        float fM8856F = matrix.m8856F();
        matrix2.setValues(new float[]{matrix.getScaleX(), matrix.m8853C(), fM8855E, matrix.m8854D(), matrix.getScaleY(), fM8856F, matrix.m8861z(), matrix.m8851A(), matrix.m8852B()});
        return matrix2;
    }
}
