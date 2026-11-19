package na;

import android.graphics.Matrix;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.n */
/* loaded from: classes5.dex */
public abstract class AbstractC10351n {

    /* renamed from: a */
    public static final b f24658a = new b();

    /* renamed from: b */
    public static final a f24659b = new a();

    /* renamed from: na.n$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix initialValue() {
            return new Matrix();
        }
    }

    /* renamed from: na.n$b */
    public static final class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[9];
        }
    }

    /* renamed from: a */
    public static final float m21659a(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }

    /* renamed from: b */
    public static final Matrix m21660b(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    /* renamed from: c */
    public static final boolean m21661c(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        Object obj = f24658a.get();
        AbstractC9979u.m20291d(obj);
        float[] fArr = (float[]) obj;
        matrix.getValues(fArr);
        for (int i10 = 0; i10 < 9; i10++) {
            float f10 = fArr[i10];
            if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                return false;
            }
        }
        if (Math.abs(fArr[8]) < 1.0E-4f) {
            return false;
        }
        float fM21663e = m21663e(fArr[0], fArr[3]);
        float fM21663e2 = m21663e(fArr[1], fArr[4]);
        if (fM21663e < 1.0E-4f || fM21663e2 < 1.0E-4f) {
            return false;
        }
        Object obj2 = f24659b.get();
        AbstractC9979u.m20291d(obj2);
        Matrix matrix2 = (Matrix) obj2;
        matrix2.reset();
        return matrix.invert(matrix2);
    }

    /* renamed from: d */
    public static final boolean m21662d(EzyMatrix.Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        return m21661c(m21665g(matrix));
    }

    /* renamed from: e */
    public static final float m21663e(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    /* renamed from: f */
    public static final EzyMatrix.Matrix m21664f(Matrix matrix, long j10) {
        AbstractC9979u.m20294g(matrix, "<this>");
        EzyMatrix.Matrix.C8487b c8487bM15455D = EzyMatrix.Matrix.m15455D();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        c8487bM15455D.m15504z(fArr[2]);
        c8487bM15455D.m15479A(fArr[5]);
        c8487bM15455D.m15500v(fArr[0]);
        c8487bM15455D.m15501w(fArr[4]);
        c8487bM15455D.m15502x(fArr[1]);
        c8487bM15455D.m15503y(fArr[3]);
        c8487bM15455D.m15496r(fArr[6]);
        c8487bM15455D.m15497s(fArr[7]);
        c8487bM15455D.m15498t(fArr[8]);
        c8487bM15455D.m15494p(j10);
        EzyMatrix.Matrix matrixBuild = c8487bM15455D.build();
        AbstractC9979u.m20293f(matrixBuild, "newBuilder.build()");
        return matrixBuild;
    }

    /* renamed from: g */
    public static final Matrix m21665g(EzyMatrix.Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        float fM15467A = matrix.m15467A();
        float fM15468C = matrix.m15468C();
        matrix2.setValues(new float[]{matrix.getScaleX(), matrix.m15476y(), fM15467A, matrix.m15477z(), matrix.getScaleY(), fM15468C, matrix.m15473t(), matrix.m15474u(), matrix.m15475v()});
        return matrix2;
    }
}
