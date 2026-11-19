package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0358u;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.i */
/* loaded from: classes.dex */
class C0730i extends ViewGroup implements InterfaceC0724f {

    /* renamed from: a */
    ViewGroup f4431a;

    /* renamed from: b */
    View f4432b;

    /* renamed from: c */
    final View f4433c;

    /* renamed from: d */
    int f4434d;

    /* renamed from: e */
    private Matrix f4435e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f4436f;

    /* renamed from: androidx.transition.i$a */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C0358u.m2033h0(C0730i.this);
            C0730i c0730i = C0730i.this;
            ViewGroup viewGroup = c0730i.f4431a;
            if (viewGroup == null || (view = c0730i.f4432b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C0358u.m2033h0(C0730i.this.f4431a);
            C0730i c0730i2 = C0730i.this;
            c0730i2.f4431a = null;
            c0730i2.f4432b = null;
            return true;
        }
    }

    C0730i(View view) {
        super(view.getContext());
        this.f4436f = new a();
        this.f4433c = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    static C0730i m3889b(View view, ViewGroup viewGroup, Matrix matrix) {
        C0726g c0726g;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        C0726g c0726gM3870b = C0726g.m3870b(viewGroup);
        C0730i c0730iM3892e = m3892e(view);
        int i4 = 0;
        if (c0730iM3892e != null && (c0726g = (C0726g) c0730iM3892e.getParent()) != c0726gM3870b) {
            i4 = c0730iM3892e.f4434d;
            c0726g.removeView(c0730iM3892e);
            c0730iM3892e = null;
        }
        if (c0730iM3892e == null) {
            if (matrix == null) {
                matrix = new Matrix();
                m3890c(view, viewGroup, matrix);
            }
            c0730iM3892e = new C0730i(view);
            c0730iM3892e.m3895h(matrix);
            if (c0726gM3870b == null) {
                c0726gM3870b = new C0726g(viewGroup);
            } else {
                c0726gM3870b.m3876g();
            }
            m3891d(viewGroup, c0726gM3870b);
            m3891d(viewGroup, c0730iM3892e);
            c0726gM3870b.m3875a(c0730iM3892e);
            c0730iM3892e.f4434d = i4;
        } else if (matrix != null) {
            c0730iM3892e.m3895h(matrix);
        }
        c0730iM3892e.f4434d++;
        return c0730iM3892e;
    }

    /* renamed from: c */
    static void m3890c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C0725f0.m3864j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        C0725f0.m3865k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m3891d(View view, View view2) {
        C0725f0.m3861g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C0730i m3892e(View view) {
        return (C0730i) view.getTag(C0742o.f4446a);
    }

    /* renamed from: f */
    static void m3893f(View view) {
        C0730i c0730iM3892e = m3892e(view);
        if (c0730iM3892e != null) {
            int i4 = c0730iM3892e.f4434d - 1;
            c0730iM3892e.f4434d = i4;
            if (i4 <= 0) {
                ((C0726g) c0730iM3892e.getParent()).removeView(c0730iM3892e);
            }
        }
    }

    /* renamed from: g */
    static void m3894g(View view, C0730i c0730i) {
        view.setTag(C0742o.f4446a, c0730i);
    }

    @Override // androidx.transition.InterfaceC0724f
    /* renamed from: a */
    public void mo3854a(ViewGroup viewGroup, View view) {
        this.f4431a = viewGroup;
        this.f4432b = view;
    }

    /* renamed from: h */
    void m3895h(Matrix matrix) {
        this.f4435e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.onAttachedToWindow();
        m3894g(this.f4433c, this);
        this.f4433c.getViewTreeObserver().addOnPreDrawListener(this.f4436f);
        C0725f0.m3863i(this.f4433c, 4);
        if (this.f4433c.getParent() != null) {
            ((View) this.f4433c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        this.f4433c.getViewTreeObserver().removeOnPreDrawListener(this.f4436f);
        C0725f0.m3863i(this.f4433c, 0);
        m3894g(this.f4433c, null);
        if (this.f4433c.getParent() != null) {
            ((View) this.f4433c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0716b.m3845a(canvas, true);
        canvas.setMatrix(this.f4435e);
        C0725f0.m3863i(this.f4433c, 0);
        this.f4433c.invalidate();
        C0725f0.m3863i(this.f4433c, 4);
        drawChild(canvas, this.f4433c, getDrawingTime());
        C0716b.m3845a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View, androidx.transition.InterfaceC0724f
    public void setVisibility(int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.setVisibility(i4);
        if (m3892e(this.f4433c) == this) {
            C0725f0.m3863i(this.f4433c, i4 == 0 ? 4 : 0);
        }
    }
}
