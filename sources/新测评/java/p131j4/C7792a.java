package p131j4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import p177n4.InterfaceC8631k;

/* renamed from: j4.a */
/* loaded from: classes4.dex */
public final class C7792a {

    /* renamed from: a */
    public final Matrix f13439a = new Matrix();

    /* renamed from: b */
    public final Matrix f13440b = new Matrix();

    /* renamed from: c */
    public final RectF f13441c = new RectF();

    /* renamed from: d */
    public final RectF f13442d = new RectF();

    /* renamed from: e */
    public final List f13443e = new ArrayList();

    /* renamed from: a */
    public final void m13187a(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f13439a.postConcat(matrix);
        m13192f();
        System.out.println((Object) ("MatrixAdapter cameraMatrixConcat=" + matrix + "  camera=" + this.f13439a));
    }

    /* renamed from: b */
    public final Matrix m13188b() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f13439a);
        matrix.postConcat(this.f13440b);
        return matrix;
    }

    /* renamed from: c */
    public final RectF m13189c() {
        RectF rectF = new RectF();
        m13188b().mapRect(rectF, this.f13441c);
        return rectF;
    }

    /* renamed from: d */
    public final Matrix m13190d() {
        return this.f13439a;
    }

    /* renamed from: e */
    public final Matrix m13191e() {
        return this.f13440b;
    }

    /* renamed from: f */
    public final void m13192f() {
        m13193g();
        Iterator it = this.f13443e.iterator();
        while (it.hasNext()) {
            ((InterfaceC8631k) it.next()).mo6243b(m13188b());
        }
    }

    /* renamed from: g */
    public final void m13193g() {
        Iterator it = this.f13443e.iterator();
        while (it.hasNext()) {
            ((InterfaceC8631k) it.next()).mo6242a(m13189c(), this.f13442d);
        }
    }

    /* renamed from: h */
    public final void m13194h(InterfaceC8631k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13443e.add(listener);
    }

    /* renamed from: i */
    public final void m13195i() {
        this.f13439a.reset();
        m13192f();
    }

    /* renamed from: j */
    public final void m13196j(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f13439a.set(matrix);
        m13192f();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (fArr[0] == 0.0f) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "currentThread().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTrace, 2);
            LogUtils.m3239i("MatrixAdapter -> " + (stackTraceElement != null ? stackTraceElement.getClassName() : null));
        }
    }

    /* renamed from: k */
    public final void m13197k(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f13440b.set(matrix);
    }

    /* renamed from: l */
    public final void m13198l(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f13442d.set(rect);
    }

    /* renamed from: m */
    public final void m13199m(InterfaceC8631k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13443e.remove(listener);
    }
}
