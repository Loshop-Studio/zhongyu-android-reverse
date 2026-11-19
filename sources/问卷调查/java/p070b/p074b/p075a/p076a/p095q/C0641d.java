package p070b.p074b.p075a.p076a.p095q;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p080c.C0574e;
import p070b.p074b.p075a.p076a.p080c.C0575f;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p096r.C0652g;
import p070b.p074b.p075a.p076a.p100v.InterfaceC0668b;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.q.d */
/* loaded from: classes.dex */
public class C0641d {

    /* renamed from: a */
    public C0678j f3842a;

    /* renamed from: b */
    public boolean f3843b;

    /* renamed from: d */
    public float f3845d;

    /* renamed from: e */
    public float f3846e;

    /* renamed from: f */
    public float f3847f;

    /* renamed from: g */
    public final C0652g f3848g;

    /* renamed from: h */
    public C0576g f3849h;

    /* renamed from: i */
    public C0576g f3850i;

    /* renamed from: j */
    public Animator f3851j;

    /* renamed from: k */
    public C0576g f3852k;

    /* renamed from: l */
    public C0576g f3853l;

    /* renamed from: m */
    public float f3854m;

    /* renamed from: p */
    public ArrayList<Animator.AnimatorListener> f3857p;

    /* renamed from: q */
    public ArrayList<Animator.AnimatorListener> f3858q;

    /* renamed from: r */
    public ArrayList<e> f3859r;

    /* renamed from: s */
    public final FloatingActionButton f3860s;

    /* renamed from: t */
    public final InterfaceC0668b f3861t;

    /* renamed from: y */
    public ViewTreeObserver.OnPreDrawListener f3866y;

    /* renamed from: z */
    public static final TimeInterpolator f3841z = C0570a.f3536c;

    /* renamed from: A */
    public static final int[] f3835A = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: B */
    public static final int[] f3836B = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: C */
    public static final int[] f3837C = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: D */
    public static final int[] f3838D = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: E */
    public static final int[] f3839E = {R.attr.state_enabled};

    /* renamed from: F */
    public static final int[] f3840F = new int[0];

    /* renamed from: c */
    public boolean f3844c = true;

    /* renamed from: n */
    public float f3855n = 1.0f;

    /* renamed from: o */
    public int f3856o = 0;

    /* renamed from: u */
    public final Rect f3862u = new Rect();

    /* renamed from: v */
    public final RectF f3863v = new RectF();

    /* renamed from: w */
    public final RectF f3864w = new RectF();

    /* renamed from: x */
    public final Matrix f3865x = new Matrix();

    /* renamed from: b.b.a.a.q.d$a */
    public class a extends C0575f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            C0641d.this.f3855n = f2;
            matrix.getValues(this.f3544a);
            matrix2.getValues(this.f3545b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f3545b;
                float f3 = fArr[i];
                float[] fArr2 = this.f3544a;
                fArr[i] = ((f3 - fArr2[i]) * f2) + fArr2[i];
            }
            this.f3546c.setValues(this.f3545b);
            return this.f3546c;
        }
    }

    /* renamed from: b.b.a.a.q.d$b */
    public class b extends h {
        public b(C0641d c0641d) {
            super(null);
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.h
        /* renamed from: a */
        public float mo2238a() {
            return 0.0f;
        }
    }

    /* renamed from: b.b.a.a.q.d$c */
    public class c extends h {
        public c() {
            super(null);
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.h
        /* renamed from: a */
        public float mo2238a() {
            C0641d c0641d = C0641d.this;
            return c0641d.f3845d + c0641d.f3846e;
        }
    }

    /* renamed from: b.b.a.a.q.d$d */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.h
        /* renamed from: a */
        public float mo2238a() {
            C0641d c0641d = C0641d.this;
            return c0641d.f3845d + c0641d.f3847f;
        }
    }

    /* renamed from: b.b.a.a.q.d$e */
    public interface e {
        /* renamed from: a */
        void mo2239a();

        /* renamed from: b */
        void mo2240b();
    }

    /* renamed from: b.b.a.a.q.d$f */
    public interface f {
    }

    /* renamed from: b.b.a.a.q.d$g */
    public class g extends h {
        public g() {
            super(null);
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.h
        /* renamed from: a */
        public float mo2238a() {
            return C0641d.this.f3845d;
        }
    }

    /* renamed from: b.b.a.a.q.d$h */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f3871a;

        /* renamed from: b */
        public float f3872b;

        public h(C0639b c0639b) {
        }

        /* renamed from: a */
        public abstract float mo2238a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(C0641d.this);
            this.f3871a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f3871a) {
                Objects.requireNonNull(C0641d.this);
                this.f3872b = mo2238a();
                this.f3871a = true;
            }
            C0641d c0641d = C0641d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(c0641d);
        }
    }

    public C0641d(FloatingActionButton floatingActionButton, InterfaceC0668b interfaceC0668b) {
        this.f3860s = floatingActionButton;
        this.f3861t = interfaceC0668b;
        C0652g c0652g = new C0652g();
        this.f3848g = c0652g;
        c0652g.m2262a(f3835A, m2219b(new d()));
        c0652g.m2262a(f3836B, m2219b(new c()));
        c0652g.m2262a(f3837C, m2219b(new c()));
        c0652g.m2262a(f3838D, m2219b(new c()));
        c0652g.m2262a(f3839E, m2219b(new g()));
        c0652g.m2262a(f3840F, m2219b(new b(this)));
        this.f3854m = floatingActionButton.getRotation();
    }

    /* renamed from: a */
    public final AnimatorSet m2218a(C0576g c0576g, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3860s, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        c0576g.m2104d("opacity").m2105a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f3860s, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c0576g.m2104d("scale").m2105a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new C0642e(this));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f3860s, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c0576g.m2104d("scale").m2105a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new C0642e(this));
        }
        arrayList.add(objectAnimatorOfFloat3);
        this.f3865x.reset();
        this.f3860s.getDrawable();
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f3860s, new C0574e(), new a(), new Matrix(this.f3865x));
        c0576g.m2104d("iconScale").m2105a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0562a.m2093n(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: b */
    public final ValueAnimator m2219b(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f3841z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: c */
    public float mo2220c() {
        throw null;
    }

    /* renamed from: d */
    public void mo2221d(Rect rect) {
        int sizeDimension = this.f3843b ? (0 - this.f3860s.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f3844c ? mo2220c() + this.f3847f : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r0 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* renamed from: e */
    public boolean m2222e() {
        return this.f3860s.getVisibility() == 0 ? this.f3856o == 1 : this.f3856o != 2;
    }

    /* renamed from: f */
    public boolean m2223f() {
        return this.f3860s.getVisibility() != 0 ? this.f3856o == 2 : this.f3856o != 1;
    }

    /* renamed from: g */
    public void mo2224g() {
        throw null;
    }

    /* renamed from: h */
    public void mo2225h() {
        throw null;
    }

    /* renamed from: i */
    public void mo2226i(int[] iArr) {
        throw null;
    }

    /* renamed from: j */
    public void mo2227j(float f2, float f3, float f4) {
        throw null;
    }

    /* renamed from: k */
    public void m2228k() {
        ArrayList<e> arrayList = this.f3859r;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2239a();
            }
        }
    }

    /* renamed from: l */
    public void m2229l() {
        ArrayList<e> arrayList = this.f3859r;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2240b();
            }
        }
    }

    /* renamed from: m */
    public boolean mo2230m() {
        throw null;
    }

    /* renamed from: n */
    public final void m2231n(float f2) {
        this.f3855n = f2;
        Matrix matrix = this.f3865x;
        matrix.reset();
        this.f3860s.getDrawable();
        this.f3860s.setImageMatrix(matrix);
    }

    /* renamed from: o */
    public void mo2232o(ColorStateList colorStateList) {
        throw null;
    }

    /* renamed from: p */
    public boolean mo2233p() {
        throw null;
    }

    /* renamed from: q */
    public final boolean m2234q() {
        FloatingActionButton floatingActionButton = this.f3860s;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return floatingActionButton.isLaidOut() && !this.f3860s.isInEditMode();
    }

    /* renamed from: r */
    public final boolean m2235r() {
        return !this.f3843b || this.f3860s.getSizeDimension() >= 0;
    }

    /* renamed from: s */
    public void mo2236s() {
        throw null;
    }

    /* renamed from: t */
    public final void m2237t() {
        Rect rect = this.f3862u;
        mo2221d(rect);
        C0190e.m711f(null, "Didn't initialize content background");
        if (mo2233p()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.C0937b c0937b = (FloatingActionButton.C0937b) this.f3861t;
            Objects.requireNonNull(c0937b);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.C0937b) this.f3861t);
        }
        InterfaceC0668b interfaceC0668b = this.f3861t;
        int i = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
