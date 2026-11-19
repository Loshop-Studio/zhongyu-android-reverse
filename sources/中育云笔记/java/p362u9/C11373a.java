package p362u9;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p325rc.AbstractC10968r;
import p422y9.InterfaceC11937p;

/* renamed from: u9.a */
/* loaded from: classes5.dex */
public final class C11373a {

    /* renamed from: a */
    public final Matrix f27187a = new Matrix();

    /* renamed from: b */
    public final Matrix f27188b = new Matrix();

    /* renamed from: c */
    public final RectF f27189c = new RectF();

    /* renamed from: d */
    public final RectF f27190d = new RectF();

    /* renamed from: e */
    public final List f27191e = new ArrayList();

    /* renamed from: a */
    public final void m25310a(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        if (!AbstractC10351n.m21661c(matrix)) {
            LogUtils.m3887e("MatrixAdapter -> cameraMatrixConcat，拦截非法增量矩阵，matrix=" + matrix);
            return;
        }
        Matrix matrix2 = new Matrix(this.f27187a);
        matrix2.postConcat(matrix);
        if (!AbstractC10351n.m21661c(matrix2)) {
            LogUtils.m3887e("MatrixAdapter -> cameraMatrixConcat，拦截非法相机矩阵结果，matrix=" + matrix + "，camera=" + this.f27187a);
            return;
        }
        this.f27187a.set(matrix2);
        m25315f();
        System.out.println((Object) ("MatrixAdapter cameraMatrixConcat=" + matrix + "  camera=" + this.f27187a));
    }

    /* renamed from: b */
    public final Matrix m25311b() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f27187a);
        matrix.postConcat(this.f27188b);
        return matrix;
    }

    /* renamed from: c */
    public final RectF m25312c() {
        RectF rectF = new RectF();
        m25311b().mapRect(rectF, this.f27189c);
        return rectF;
    }

    /* renamed from: d */
    public final Matrix m25313d() {
        return this.f27187a;
    }

    /* renamed from: e */
    public final Matrix m25314e() {
        return this.f27188b;
    }

    /* renamed from: f */
    public final void m25315f() {
        m25316g();
        Iterator it = this.f27191e.iterator();
        while (it.hasNext()) {
            ((InterfaceC11937p) it.next()).mo13954b(m25311b());
        }
    }

    /* renamed from: g */
    public final void m25316g() {
        Iterator it = this.f27191e.iterator();
        while (it.hasNext()) {
            ((InterfaceC11937p) it.next()).mo13953a(m25312c(), this.f27190d);
        }
    }

    /* renamed from: h */
    public final void m25317h(InterfaceC11937p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f27191e.add(listener);
    }

    /* renamed from: i */
    public final void m25318i() {
        this.f27187a.reset();
        m25315f();
    }

    /* renamed from: j */
    public final void m25319j(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        if (AbstractC10351n.m21661c(matrix)) {
            this.f27187a.set(matrix);
            m25315f();
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC9979u.m20293f(stackTrace, "currentThread().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC10968r.m24044C0(stackTrace, 2);
        LogUtils.m3887e("MatrixAdapter -> setCameraMatrix，拦截非法相机矩阵，来源=" + (stackTraceElement != null ? stackTraceElement.getClassName() : null) + "，matrix=" + matrix);
        m25318i();
    }

    /* renamed from: k */
    public final void m25320k(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        this.f27188b.set(matrix);
    }

    /* renamed from: l */
    public final void m25321l(Rect rect) {
        AbstractC9979u.m20294g(rect, "rect");
        this.f27190d.set(rect);
    }

    /* renamed from: m */
    public final void m25322m(InterfaceC11937p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f27191e.remove(listener);
    }
}
