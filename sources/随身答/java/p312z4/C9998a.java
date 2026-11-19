package p312z4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import p084d5.InterfaceC7753m;

/* renamed from: z4.a */
/* loaded from: classes4.dex */
public final class C9998a {

    /* renamed from: a */
    public final Matrix f18009a = new Matrix();

    /* renamed from: b */
    public final Matrix f18010b = new Matrix();

    /* renamed from: c */
    public final RectF f18011c = new RectF();

    /* renamed from: d */
    public final RectF f18012d = new RectF();

    /* renamed from: e */
    public final List f18013e = new ArrayList();

    /* renamed from: a */
    public final void m17343a(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f18009a.postConcat(matrix);
        m17348f();
        System.out.println((Object) ("MatrixAdapter cameraMatrixConcat=" + matrix + "  camera=" + this.f18009a));
    }

    /* renamed from: b */
    public final Matrix m17344b() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f18009a);
        matrix.postConcat(this.f18010b);
        return matrix;
    }

    /* renamed from: c */
    public final RectF m17345c() {
        RectF rectF = new RectF();
        m17344b().mapRect(rectF, this.f18011c);
        return rectF;
    }

    /* renamed from: d */
    public final Matrix m17346d() {
        return this.f18009a;
    }

    /* renamed from: e */
    public final Matrix m17347e() {
        return this.f18010b;
    }

    /* renamed from: f */
    public final void m17348f() {
        m17349g();
        Iterator it = this.f18013e.iterator();
        while (it.hasNext()) {
            ((InterfaceC7753m) it.next()).mo7339b(m17344b());
        }
    }

    /* renamed from: g */
    public final void m17349g() {
        Iterator it = this.f18013e.iterator();
        while (it.hasNext()) {
            ((InterfaceC7753m) it.next()).mo7338a(m17345c(), this.f18012d);
        }
    }

    /* renamed from: h */
    public final void m17350h(InterfaceC7753m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18013e.add(listener);
    }

    /* renamed from: i */
    public final void m17351i() {
        this.f18009a.reset();
        m17348f();
    }

    /* renamed from: j */
    public final void m17352j(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f18009a.set(matrix);
        m17348f();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (fArr[0] == 0.0f) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "currentThread().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTrace, 2);
            LogUtils.m2956i("MatrixAdapter -> " + (stackTraceElement != null ? stackTraceElement.getClassName() : null));
        }
    }

    /* renamed from: k */
    public final void m17353k(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f18010b.set(matrix);
    }

    /* renamed from: l */
    public final void m17354l(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f18012d.set(rect);
    }

    /* renamed from: m */
    public final void m17355m(InterfaceC7753m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18013e.remove(listener);
    }
}
