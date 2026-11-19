package p000a.p029g.p030b;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.g.b.b */
/* loaded from: classes.dex */
public class C0184b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f1394a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f1395b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m685a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m685a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
