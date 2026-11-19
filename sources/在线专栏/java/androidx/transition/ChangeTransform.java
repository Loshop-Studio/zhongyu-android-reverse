package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import p148s.C3369g;

/* loaded from: classes.dex */
public class ChangeTransform extends Transition {

    /* renamed from: d */
    private static final String[] f4309d = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: e */
    private static final Property<C0689e, float[]> f4310e = new C0685a(float[].class, "nonTranslations");

    /* renamed from: f */
    private static final Property<C0689e, PointF> f4311f = new C0686b(PointF.class, "translations");

    /* renamed from: g */
    private static final boolean f4312g = true;

    /* renamed from: a */
    boolean f4313a;

    /* renamed from: b */
    private boolean f4314b;

    /* renamed from: c */
    private Matrix f4315c;

    /* renamed from: androidx.transition.ChangeTransform$a */
    static class C0685a extends Property<C0689e, float[]> {
        C0685a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(C0689e c0689e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0689e c0689e, float[] fArr) {
            c0689e.m3804d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    static class C0686b extends Property<C0689e, PointF> {
        C0686b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C0689e c0689e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0689e c0689e, PointF pointF) {
            c0689e.m3803c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    class C0687c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4316a;

        /* renamed from: b */
        private Matrix f4317b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f4318c;

        /* renamed from: d */
        final /* synthetic */ Matrix f4319d;

        /* renamed from: e */
        final /* synthetic */ View f4320e;

        /* renamed from: f */
        final /* synthetic */ C0690f f4321f;

        /* renamed from: g */
        final /* synthetic */ C0689e f4322g;

        C0687c(boolean z3, Matrix matrix, View view, C0690f c0690f, C0689e c0689e) {
            this.f4318c = z3;
            this.f4319d = matrix;
            this.f4320e = view;
            this.f4321f = c0690f;
            this.f4322g = c0689e;
        }

        /* renamed from: a */
        private void m3800a(Matrix matrix) {
            this.f4317b.set(matrix);
            this.f4320e.setTag(C0742o.f4452g, this.f4317b);
            this.f4321f.m3805a(this.f4320e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4316a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4316a) {
                if (this.f4318c && ChangeTransform.this.f4313a) {
                    m3800a(this.f4319d);
                } else {
                    this.f4320e.setTag(C0742o.f4452g, null);
                    this.f4320e.setTag(C0742o.f4448c, null);
                }
            }
            C0725f0.m3860f(this.f4320e, null);
            this.f4321f.m3805a(this.f4320e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m3800a(this.f4322g.m3802a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.m3793d(this.f4320e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    private static class C0688d extends C0748t {

        /* renamed from: a */
        private View f4324a;

        /* renamed from: b */
        private InterfaceC0724f f4325b;

        C0688d(View view, InterfaceC0724f interfaceC0724f) {
            this.f4324a = view;
            this.f4325b = interfaceC0724f;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            transition.removeListener(this);
            C0732j.m3898b(this.f4324a);
            this.f4324a.setTag(C0742o.f4452g, null);
            this.f4324a.setTag(C0742o.f4448c, null);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
            this.f4325b.setVisibility(4);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
            this.f4325b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    private static class C0689e {

        /* renamed from: a */
        private final Matrix f4326a = new Matrix();

        /* renamed from: b */
        private final View f4327b;

        /* renamed from: c */
        private final float[] f4328c;

        /* renamed from: d */
        private float f4329d;

        /* renamed from: e */
        private float f4330e;

        C0689e(View view, float[] fArr) {
            this.f4327b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f4328c = fArr2;
            this.f4329d = fArr2[2];
            this.f4330e = fArr2[5];
            m3801b();
        }

        /* renamed from: b */
        private void m3801b() {
            float[] fArr = this.f4328c;
            fArr[2] = this.f4329d;
            fArr[5] = this.f4330e;
            this.f4326a.setValues(fArr);
            C0725f0.m3860f(this.f4327b, this.f4326a);
        }

        /* renamed from: a */
        Matrix m3802a() {
            return this.f4326a;
        }

        /* renamed from: c */
        void m3803c(PointF pointF) {
            this.f4329d = pointF.x;
            this.f4330e = pointF.y;
            m3801b();
        }

        /* renamed from: d */
        void m3804d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f4328c, 0, fArr.length);
            m3801b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    private static class C0690f {

        /* renamed from: a */
        final float f4331a;

        /* renamed from: b */
        final float f4332b;

        /* renamed from: c */
        final float f4333c;

        /* renamed from: d */
        final float f4334d;

        /* renamed from: e */
        final float f4335e;

        /* renamed from: f */
        final float f4336f;

        /* renamed from: g */
        final float f4337g;

        /* renamed from: h */
        final float f4338h;

        C0690f(View view) {
            this.f4331a = view.getTranslationX();
            this.f4332b = view.getTranslationY();
            this.f4333c = C0358u.m2004N(view);
            this.f4334d = view.getScaleX();
            this.f4335e = view.getScaleY();
            this.f4336f = view.getRotationX();
            this.f4337g = view.getRotationY();
            this.f4338h = view.getRotation();
        }

        /* renamed from: a */
        public void m3805a(View view) {
            ChangeTransform.m3795f(view, this.f4331a, this.f4332b, this.f4333c, this.f4334d, this.f4335e, this.f4336f, this.f4337g, this.f4338h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0690f)) {
                return false;
            }
            C0690f c0690f = (C0690f) obj;
            return c0690f.f4331a == this.f4331a && c0690f.f4332b == this.f4332b && c0690f.f4333c == this.f4333c && c0690f.f4334d == this.f4334d && c0690f.f4335e == this.f4335e && c0690f.f4336f == this.f4336f && c0690f.f4337g == this.f4337g && c0690f.f4338h == this.f4338h;
        }

        public int hashCode() {
            float f4 = this.f4331a;
            int iFloatToIntBits = (f4 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f4) : 0) * 31;
            float f5 = this.f4332b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f5 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f4333c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f6 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f4334d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f7 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f4335e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f8 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f4336f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f9 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.f4337g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f10 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f4338h;
            return iFloatToIntBits7 + (f11 != IGoodView.DEFAULT_TO_ALPHA ? Float.floatToIntBits(f11) : 0);
        }
    }

    public ChangeTransform() {
        this.f4313a = true;
        this.f4314b = true;
        this.f4315c = new Matrix();
    }

    /* renamed from: a */
    private void m3790a(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        View view = c0752x2.f4483b;
        Matrix matrix = new Matrix((Matrix) c0752x2.f4482a.get("android:changeTransform:parentMatrix"));
        C0725f0.m3865k(viewGroup, matrix);
        InterfaceC0724f interfaceC0724fM3897a = C0732j.m3897a(view, viewGroup, matrix);
        if (interfaceC0724fM3897a == null) {
            return;
        }
        interfaceC0724fM3897a.mo3854a((ViewGroup) c0752x.f4482a.get("android:changeTransform:parent"), c0752x.f4483b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.mParent;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.addListener(new C0688d(view, interfaceC0724fM3897a));
        if (f4312g) {
            View view2 = c0752x.f4483b;
            if (view2 != c0752x2.f4483b) {
                C0725f0.m3862h(view2, IGoodView.DEFAULT_TO_ALPHA);
            }
            C0725f0.m3862h(view, 1.0f);
        }
    }

    /* renamed from: b */
    private ObjectAnimator m3791b(C0752x c0752x, C0752x c0752x2, boolean z3) {
        Matrix matrix = (Matrix) c0752x.f4482a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) c0752x2.f4482a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C0736l.f4441a;
        }
        if (matrix2 == null) {
            matrix2 = C0736l.f4441a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C0690f c0690f = (C0690f) c0752x2.f4482a.get("android:changeTransform:transforms");
        View view = c0752x2.f4483b;
        m3793d(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C0689e c0689e = new C0689e(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c0689e, PropertyValuesHolder.ofObject(f4310e, new C0720d(new float[9]), fArr, fArr2), C0740n.m3910a(f4311f, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C0687c c0687c = new C0687c(z3, matrix3, view, c0690f, c0689e);
        objectAnimatorOfPropertyValuesHolder.addListener(c0687c);
        C0714a.m3842a(objectAnimatorOfPropertyValuesHolder, c0687c);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3792c(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.x r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f4483b
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m3792c(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    private void captureValues(C0752x c0752x) {
        View view = c0752x.f4483b;
        if (view.getVisibility() == 8) {
            return;
        }
        c0752x.f4482a.put("android:changeTransform:parent", view.getParent());
        c0752x.f4482a.put("android:changeTransform:transforms", new C0690f(view));
        Matrix matrix = view.getMatrix();
        c0752x.f4482a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f4314b) {
            Matrix matrix2 = new Matrix();
            C0725f0.m3864j((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            c0752x.f4482a.put("android:changeTransform:parentMatrix", matrix2);
            c0752x.f4482a.put("android:changeTransform:intermediateMatrix", view.getTag(C0742o.f4452g));
            c0752x.f4482a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0742o.f4448c));
        }
    }

    /* renamed from: d */
    static void m3793d(View view) {
        m3795f(view, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, 1.0f, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
    }

    /* renamed from: e */
    private void m3794e(C0752x c0752x, C0752x c0752x2) {
        Matrix matrix = (Matrix) c0752x2.f4482a.get("android:changeTransform:parentMatrix");
        c0752x2.f4483b.setTag(C0742o.f4448c, matrix);
        Matrix matrix2 = this.f4315c;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) c0752x.f4482a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            c0752x.f4482a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) c0752x.f4482a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: f */
    static void m3795f(View view, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        C0358u.m1997J0(view, f6);
        view.setScaleX(f7);
        view.setScaleY(f8);
        view.setRotationX(f9);
        view.setRotationY(f10);
        view.setRotation(f11);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        captureValues(c0752x);
        if (f4312g) {
            return;
        }
        ((ViewGroup) c0752x.f4483b.getParent()).startViewTransition(c0752x.f4483b);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        if (c0752x == null || c0752x2 == null || !c0752x.f4482a.containsKey("android:changeTransform:parent") || !c0752x2.f4482a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) c0752x.f4482a.get("android:changeTransform:parent");
        boolean z3 = this.f4314b && !m3792c(viewGroup2, (ViewGroup) c0752x2.f4482a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) c0752x.f4482a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            c0752x.f4482a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) c0752x.f4482a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            c0752x.f4482a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            m3794e(c0752x, c0752x2);
        }
        ObjectAnimator objectAnimatorM3791b = m3791b(c0752x, c0752x2, z3);
        if (z3 && objectAnimatorM3791b != null && this.f4313a) {
            m3790a(viewGroup, c0752x, c0752x2);
        } else if (!f4312g) {
            viewGroup2.endViewTransition(c0752x.f4483b);
        }
        return objectAnimatorM3791b;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f4309d;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4313a = true;
        this.f4314b = true;
        this.f4315c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4464g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f4313a = C3369g.m10245a(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f4314b = C3369g.m10245a(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
