package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;
import p000a.p049j.p050a.AbstractC0287a;
import p000a.p049j.p051b.C0292e;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p084g.C0595a;
import p070b.p074b.p075a.p076a.p084g.C0596b;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p096r.C0656k;
import p070b.p074b.p075a.p076a.p096r.C0659n;
import p070b.p074b.p075a.p076a.p096r.ViewOnAttachStateChangeListenerC0657l;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0503c<V> {

    /* renamed from: A */
    public boolean f4831A;

    /* renamed from: B */
    public int f4832B;

    /* renamed from: C */
    public boolean f4833C;

    /* renamed from: D */
    public int f4834D;

    /* renamed from: E */
    public int f4835E;

    /* renamed from: F */
    public int f4836F;

    /* renamed from: G */
    public WeakReference<V> f4837G;

    /* renamed from: H */
    public WeakReference<View> f4838H;

    /* renamed from: I */
    public final ArrayList<AbstractC0921d> f4839I;

    /* renamed from: J */
    public VelocityTracker f4840J;

    /* renamed from: K */
    public int f4841K;

    /* renamed from: L */
    public int f4842L;

    /* renamed from: M */
    public boolean f4843M;

    /* renamed from: N */
    public Map<View, Integer> f4844N;

    /* renamed from: O */
    public final C0292e.c f4845O;

    /* renamed from: a */
    public int f4846a;

    /* renamed from: b */
    public boolean f4847b;

    /* renamed from: c */
    public float f4848c;

    /* renamed from: d */
    public int f4849d;

    /* renamed from: e */
    public boolean f4850e;

    /* renamed from: f */
    public int f4851f;

    /* renamed from: g */
    public int f4852g;

    /* renamed from: h */
    public boolean f4853h;

    /* renamed from: i */
    public C0675g f4854i;

    /* renamed from: j */
    public int f4855j;

    /* renamed from: k */
    public boolean f4856k;

    /* renamed from: l */
    public C0678j f4857l;

    /* renamed from: m */
    public boolean f4858m;

    /* renamed from: n */
    public BottomSheetBehavior<V>.RunnableC0923f f4859n;

    /* renamed from: o */
    public ValueAnimator f4860o;

    /* renamed from: p */
    public int f4861p;

    /* renamed from: q */
    public int f4862q;

    /* renamed from: r */
    public int f4863r;

    /* renamed from: s */
    public float f4864s;

    /* renamed from: t */
    public int f4865t;

    /* renamed from: u */
    public float f4866u;

    /* renamed from: v */
    public boolean f4867v;

    /* renamed from: w */
    public boolean f4868w;

    /* renamed from: x */
    public boolean f4869x;

    /* renamed from: y */
    public int f4870y;

    /* renamed from: z */
    public C0292e f4871z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC0918a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f4872b;

        /* renamed from: c */
        public final /* synthetic */ int f4873c;

        public RunnableC0918a(View view, int i) {
            this.f4872b = view;
            this.f4873c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m2631L(this.f4872b, this.f4873c);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C0919b extends C0292e.c {
        public C0919b() {
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: a */
        public int mo964a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: b */
        public int mo965b(View view, int i, int i2) {
            int iM2627H = BottomSheetBehavior.this.m2627H();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0190e.m713h(i, iM2627H, bottomSheetBehavior.f4867v ? bottomSheetBehavior.f4836F : bottomSheetBehavior.f4865t);
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: d */
        public int mo967d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f4867v ? bottomSheetBehavior.f4836F : bottomSheetBehavior.f4865t;
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: f */
        public void mo969f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f4869x) {
                    bottomSheetBehavior.m2630K(1);
                }
            }
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: g */
        public void mo970g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m2625F(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f4875a.f4861p) < java.lang.Math.abs(r8.getTop() - r7.f4875a.f4863r)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r9 = r7.f4875a.f4861p;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f4875a.f4863r) < java.lang.Math.abs(r9 - r7.f4875a.f4865t)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.f4865t)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
        
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - r7.f4875a.f4865t)) goto L42;
         */
        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo971h(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0919b.mo971h(android.view.View, float, float):void");
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: i */
        public boolean mo972i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f4870y;
            if (i2 == 1 || bottomSheetBehavior.f4843M) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f4841K == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f4838H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f4837G;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C0920c implements InterfaceC0247d {

        /* renamed from: a */
        public final /* synthetic */ int f4876a;

        public C0920c(int i) {
            this.f4876a = i;
        }

        @Override // p000a.p031h.p043j.p044a0.InterfaceC0247d
        /* renamed from: a */
        public boolean mo832a(View view, InterfaceC0247d.a aVar) {
            BottomSheetBehavior.this.m2629J(this.f4876a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class AbstractC0921d {
        /* renamed from: a */
        public abstract void m2639a(View view, float f2);

        /* renamed from: b */
        public abstract void m2640b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C0922e extends AbstractC0287a {
        public static final Parcelable.Creator<C0922e> CREATOR = new a();

        /* renamed from: d */
        public final int f4878d;

        /* renamed from: e */
        public int f4879e;

        /* renamed from: f */
        public boolean f4880f;

        /* renamed from: g */
        public boolean f4881g;

        /* renamed from: h */
        public boolean f4882h;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0922e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0922e(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0922e[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0922e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0922e(parcel, classLoader);
            }
        }

        public C0922e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4878d = parcel.readInt();
            this.f4879e = parcel.readInt();
            this.f4880f = parcel.readInt() == 1;
            this.f4881g = parcel.readInt() == 1;
            this.f4882h = parcel.readInt() == 1;
        }

        public C0922e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f4878d = bottomSheetBehavior.f4870y;
            this.f4879e = bottomSheetBehavior.f4849d;
            this.f4880f = bottomSheetBehavior.f4847b;
            this.f4881g = bottomSheetBehavior.f4867v;
            this.f4882h = bottomSheetBehavior.f4868w;
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f4878d);
            parcel.writeInt(this.f4879e);
            parcel.writeInt(this.f4880f ? 1 : 0);
            parcel.writeInt(this.f4881g ? 1 : 0);
            parcel.writeInt(this.f4882h ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class RunnableC0923f implements Runnable {

        /* renamed from: b */
        public final View f4883b;

        /* renamed from: c */
        public boolean f4884c;

        /* renamed from: d */
        public int f4885d;

        public RunnableC0923f(View view, int i) {
            this.f4883b = view;
            this.f4885d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0292e c0292e = BottomSheetBehavior.this.f4871z;
            if (c0292e == null || !c0292e.m950i(true)) {
                BottomSheetBehavior.this.m2630K(this.f4885d);
            } else {
                View view = this.f4883b;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.postOnAnimation(this);
            }
            this.f4884c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f4846a = 0;
        this.f4847b = true;
        this.f4859n = null;
        this.f4864s = 0.5f;
        this.f4866u = -1.0f;
        this.f4869x = true;
        this.f4870y = 4;
        this.f4839I = new ArrayList<>();
        this.f4845O = new C0919b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i;
        super(context, attributeSet);
        this.f4846a = 0;
        this.f4847b = true;
        this.f4859n = null;
        this.f4864s = 0.5f;
        this.f4866u = -1.0f;
        this.f4869x = true;
        this.f4870y = 4;
        this.f4839I = new ArrayList<>();
        this.f4845O = new C0919b();
        this.f4852g = context.getResources().getDimensionPixelSize(C1088R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3507b);
        this.f4853h = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(1);
        if (zHasValue) {
            m2624E(context, attributeSet, zHasValue, C0562a.m2086g(context, typedArrayObtainStyledAttributes, 1));
        } else {
            m2624E(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4860o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f4860o.addUpdateListener(new C0595a(this));
        this.f4866u = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m2628I(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            m2628I(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
        if (this.f4867v != z) {
            this.f4867v = z;
            if (!z && this.f4870y == 5) {
                m2629J(4);
            }
            m2635P();
        }
        this.f4856k = typedArrayObtainStyledAttributes.getBoolean(10, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        if (this.f4847b != z2) {
            this.f4847b = z2;
            if (this.f4837G != null) {
                m2622C();
            }
            m2630K((this.f4847b && this.f4870y == 6) ? 3 : this.f4870y);
            m2635P();
        }
        this.f4868w = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f4869x = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f4846a = typedArrayObtainStyledAttributes.getInt(8, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f4864s = f2;
        if (this.f4837G != null) {
            this.f4863r = (int) ((1.0f - f2) * this.f4836F);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(3);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            dimensionPixelOffset = typedValuePeekValue2.data;
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f4861p = dimensionPixelOffset;
        typedArrayObtainStyledAttributes.recycle();
        this.f4848c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: A */
    public boolean mo1663A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4870y == 1 && actionMasked == 0) {
            return true;
        }
        C0292e c0292e = this.f4871z;
        if (c0292e != null) {
            c0292e.m955n(motionEvent);
        }
        if (actionMasked == 0) {
            this.f4841K = -1;
            VelocityTracker velocityTracker = this.f4840J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4840J = null;
            }
        }
        if (this.f4840J == null) {
            this.f4840J = VelocityTracker.obtain();
        }
        this.f4840J.addMovement(motionEvent);
        if (this.f4871z != null && actionMasked == 2 && !this.f4831A) {
            float fAbs = Math.abs(this.f4842L - motionEvent.getY());
            C0292e c0292e2 = this.f4871z;
            if (fAbs > c0292e2.f1739b) {
                c0292e2.m943b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4831A;
    }

    /* renamed from: B */
    public final void m2621B(V v, C0245b.a aVar, int i) {
        C0266o.m873l(v, aVar, null, new C0920c(i));
    }

    /* renamed from: C */
    public final void m2622C() {
        int iM2623D = m2623D();
        if (this.f4847b) {
            this.f4865t = Math.max(this.f4836F - iM2623D, this.f4862q);
        } else {
            this.f4865t = this.f4836F - iM2623D;
        }
    }

    /* renamed from: D */
    public final int m2623D() {
        int i;
        return this.f4850e ? Math.min(Math.max(this.f4851f, this.f4836F - ((this.f4835E * 9) / 16)), this.f4834D) : (this.f4856k || (i = this.f4855j) <= 0) ? this.f4849d : Math.max(this.f4849d, i + this.f4852g);
    }

    /* renamed from: E */
    public final void m2624E(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f4853h) {
            this.f4857l = C0678j.m2305b(context, attributeSet, C1088R.attr.bottomSheetStyle, C1088R.style.Widget_Design_BottomSheet_Modal).m2310a();
            C0675g c0675g = new C0675g(this.f4857l);
            this.f4854i = c0675g;
            c0675g.f3998b.f4022b = new C0636a(context);
            c0675g.m2303w();
            if (z && colorStateList != null) {
                this.f4854i.m2296p(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f4854i.setTint(typedValue.data);
        }
    }

    /* renamed from: F */
    public void m2625F(int i) {
        float f2;
        float fM2627H;
        V v = this.f4837G.get();
        if (v == null || this.f4839I.isEmpty()) {
            return;
        }
        int i2 = this.f4865t;
        if (i > i2 || i2 == m2627H()) {
            int i3 = this.f4865t;
            f2 = i3 - i;
            fM2627H = this.f4836F - i3;
        } else {
            int i4 = this.f4865t;
            f2 = i4 - i;
            fM2627H = i4 - m2627H();
        }
        float f3 = f2 / fM2627H;
        for (int i5 = 0; i5 < this.f4839I.size(); i5++) {
            this.f4839I.get(i5).m2639a(v, f3);
        }
    }

    /* renamed from: G */
    public View m2626G(View view) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM2626G = m2626G(viewGroup.getChildAt(i));
            if (viewM2626G != null) {
                return viewM2626G;
            }
        }
        return null;
    }

    /* renamed from: H */
    public int m2627H() {
        return this.f4847b ? this.f4862q : this.f4861p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2628I(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto Lc
            boolean r4 = r3.f4850e
            if (r4 != 0) goto L15
            r3.f4850e = r0
            goto L1f
        Lc:
            boolean r1 = r3.f4850e
            if (r1 != 0) goto L17
            int r1 = r3.f4849d
            if (r1 == r4) goto L15
            goto L17
        L15:
            r0 = r2
            goto L1f
        L17:
            r3.f4850e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f4849d = r4
        L1f:
            if (r0 == 0) goto L24
            r3.m2638S(r2)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2628I(int):void");
    }

    /* renamed from: J */
    public void m2629J(int i) {
        if (i == this.f4870y) {
            return;
        }
        if (this.f4837G != null) {
            m2632M(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.f4867v && i == 5)) {
            this.f4870y = i;
        }
    }

    /* renamed from: K */
    public void m2630K(int i) {
        V v;
        if (this.f4870y == i) {
            return;
        }
        this.f4870y = i;
        WeakReference<V> weakReference = this.f4837G;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m2637R(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m2637R(false);
        }
        m2636Q(i);
        for (int i2 = 0; i2 < this.f4839I.size(); i2++) {
            this.f4839I.get(i2).m2640b(v, i);
        }
        m2635P();
    }

    /* renamed from: L */
    public void m2631L(View view, int i) {
        int iM2627H;
        int i2;
        if (i == 4) {
            iM2627H = this.f4865t;
        } else if (i == 6) {
            int i3 = this.f4863r;
            if (!this.f4847b || i3 > (i2 = this.f4862q)) {
                iM2627H = i3;
            } else {
                i = 3;
                iM2627H = i2;
            }
        } else if (i == 3) {
            iM2627H = m2627H();
        } else {
            if (!this.f4867v || i != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i);
            }
            iM2627H = this.f4836F;
        }
        m2634O(view, i, iM2627H, false);
    }

    /* renamed from: M */
    public final void m2632M(int i) {
        V v = this.f4837G.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (v.isAttachedToWindow()) {
                v.post(new RunnableC0918a(v, i));
                return;
            }
        }
        m2631L(v, i);
    }

    /* renamed from: N */
    public boolean m2633N(View view, float f2) {
        if (this.f4868w) {
            return true;
        }
        if (view.getTop() < this.f4865t) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.f4865t)) / ((float) m2623D()) > 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2634O(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            a.j.b.e r0 = r4.f4871z
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r8 == 0) goto L13
            int r8 = r5.getLeft()
            boolean r7 = r0.m961t(r8, r7)
            if (r7 == 0) goto L30
            goto L2f
        L13:
            int r8 = r5.getLeft()
            r0.f1755r = r5
            r3 = -1
            r0.f1740c = r3
            boolean r7 = r0.m953l(r8, r7, r2, r2)
            if (r7 != 0) goto L2d
            int r8 = r0.f1738a
            if (r8 != 0) goto L2d
            android.view.View r8 = r0.f1755r
            if (r8 == 0) goto L2d
            r8 = 0
            r0.f1755r = r8
        L2d:
            if (r7 == 0) goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L56
            r7 = 2
            r4.m2630K(r7)
            r4.m2636Q(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f4859n
            if (r7 != 0) goto L44
            com.google.android.material.bottomsheet.BottomSheetBehavior$f r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$f
            r7.<init>(r5, r6)
            r4.f4859n = r7
        L44:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f4859n
            boolean r8 = r7.f4884c
            r7.f4885d = r6
            if (r8 != 0) goto L59
            java.util.WeakHashMap<android.view.View, a.h.j.v> r6 = p000a.p031h.p043j.C0266o.f1616a
            r5.postOnAnimation(r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r5 = r4.f4859n
            r5.f4884c = r1
            goto L59
        L56:
            r4.m2630K(r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2634O(android.view.View, int, int, boolean):void");
    }

    /* renamed from: P */
    public final void m2635P() {
        V v;
        int i;
        C0245b.a aVar;
        WeakReference<V> weakReference = this.f4837G;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0266o.m872k(524288, v);
        C0266o.m869h(v, 0);
        C0266o.m872k(262144, v);
        C0266o.m869h(v, 0);
        C0266o.m872k(1048576, v);
        C0266o.m869h(v, 0);
        if (this.f4867v && this.f4870y != 5) {
            m2621B(v, C0245b.a.f1571j, 5);
        }
        int i2 = this.f4870y;
        if (i2 == 3) {
            i = this.f4847b ? 4 : 6;
            aVar = C0245b.a.f1570i;
        } else {
            if (i2 != 4) {
                if (i2 != 6) {
                    return;
                }
                m2621B(v, C0245b.a.f1570i, 4);
                m2621B(v, C0245b.a.f1569h, 3);
                return;
            }
            i = this.f4847b ? 3 : 6;
            aVar = C0245b.a.f1569h;
        }
        m2621B(v, aVar, i);
    }

    /* renamed from: Q */
    public final void m2636Q(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f4858m != z) {
            this.f4858m = z;
            if (this.f4854i == null || (valueAnimator = this.f4860o) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f4860o.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.f4860o.setFloatValues(1.0f - f2, f2);
            this.f4860o.start();
        }
    }

    /* renamed from: R */
    public final void m2637R(boolean z) {
        WeakReference<V> weakReference = this.f4837G;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f4844N != null) {
                    return;
                } else {
                    this.f4844N = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f4837G.get() && z) {
                    this.f4844N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f4844N = null;
        }
    }

    /* renamed from: S */
    public final void m2638S(boolean z) {
        V v;
        if (this.f4837G != null) {
            m2622C();
            if (this.f4870y != 4 || (v = this.f4837G.get()) == null) {
                return;
            }
            if (z) {
                m2632M(this.f4870y);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: f */
    public void mo1669f(CoordinatorLayout.C0506f c0506f) {
        this.f4837G = null;
        this.f4871z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: i */
    public void mo1672i() {
        this.f4837G = null;
        this.f4871z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: j */
    public boolean mo1673j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0292e c0292e;
        if (!v.isShown() || !this.f4869x) {
            this.f4831A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4841K = -1;
            VelocityTracker velocityTracker = this.f4840J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4840J = null;
            }
        }
        if (this.f4840J == null) {
            this.f4840J = VelocityTracker.obtain();
        }
        this.f4840J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f4842L = (int) motionEvent.getY();
            if (this.f4870y != 2) {
                WeakReference<View> weakReference = this.f4838H;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m1653p(view, x, this.f4842L)) {
                    this.f4841K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f4843M = true;
                }
            }
            this.f4831A = this.f4841K == -1 && !coordinatorLayout.m1653p(v, x, this.f4842L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4843M = false;
            this.f4841K = -1;
            if (this.f4831A) {
                this.f4831A = false;
                return false;
            }
        }
        if (!this.f4831A && (c0292e = this.f4871z) != null && c0292e.m962u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f4838H;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f4831A || this.f4870y == 1 || coordinatorLayout.m1653p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f4871z == null || Math.abs(((float) this.f4842L) - motionEvent.getY()) <= ((float) this.f4871z.f1739b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: k */
    public boolean mo1674k(CoordinatorLayout coordinatorLayout, V v, int i) {
        int iM2627H;
        C0675g c0675g;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.f4837G == null) {
            this.f4851f = coordinatorLayout.getResources().getDimensionPixelSize(C1088R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f4856k && !this.f4850e) {
                C0266o.m876o(v, new C0656k(new C0596b(this), new C0659n(v.getPaddingStart(), v.getPaddingTop(), v.getPaddingEnd(), v.getPaddingBottom())));
                if (v.isAttachedToWindow()) {
                    v.requestApplyInsets();
                } else {
                    v.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0657l());
                }
            }
            this.f4837G = new WeakReference<>(v);
            if (this.f4853h && (c0675g = this.f4854i) != null) {
                v.setBackground(c0675g);
            }
            C0675g c0675g2 = this.f4854i;
            if (c0675g2 != null) {
                float elevation = this.f4866u;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                c0675g2.m2295o(elevation);
                boolean z = this.f4870y == 3;
                this.f4858m = z;
                this.f4854i.m2297q(z ? 0.0f : 1.0f);
            }
            m2635P();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.f4871z == null) {
            this.f4871z = new C0292e(coordinatorLayout.getContext(), coordinatorLayout, this.f4845O);
        }
        int top = v.getTop();
        coordinatorLayout.m1655r(v, i);
        this.f4835E = coordinatorLayout.getWidth();
        this.f4836F = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f4834D = height;
        this.f4862q = Math.max(0, this.f4836F - height);
        this.f4863r = (int) ((1.0f - this.f4864s) * this.f4836F);
        m2622C();
        int i2 = this.f4870y;
        if (i2 == 3) {
            iM2627H = m2627H();
        } else if (i2 == 6) {
            iM2627H = this.f4863r;
        } else if (this.f4867v && i2 == 5) {
            iM2627H = this.f4836F;
        } else {
            if (i2 != 4) {
                if (i2 == 1 || i2 == 2) {
                    v.offsetTopAndBottom(top - v.getTop());
                }
                this.f4838H = new WeakReference<>(m2626G(v));
                return true;
            }
            iM2627H = this.f4865t;
        }
        v.offsetTopAndBottom(iM2627H);
        this.f4838H = new WeakReference<>(m2626G(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: n */
    public boolean mo1677n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.f4838H;
        return (weakReference == null || view != weakReference.get() || this.f4870y == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: p */
    public void mo1679p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f4838H;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m2627H()) {
                iArr[1] = top - m2627H();
                int i6 = -iArr[1];
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                v.offsetTopAndBottom(i6);
                i4 = 3;
                m2630K(i4);
            } else {
                if (!this.f4869x) {
                    return;
                }
                iArr[1] = i2;
                int i7 = -i2;
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                v.offsetTopAndBottom(i7);
                m2630K(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i8 = this.f4865t;
            if (i5 > i8 && !this.f4867v) {
                iArr[1] = top - i8;
                int i9 = -iArr[1];
                WeakHashMap<View, C0273v> weakHashMap3 = C0266o.f1616a;
                v.offsetTopAndBottom(i9);
                i4 = 4;
                m2630K(i4);
            } else {
                if (!this.f4869x) {
                    return;
                }
                iArr[1] = i2;
                int i72 = -i2;
                WeakHashMap<View, C0273v> weakHashMap22 = C0266o.f1616a;
                v.offsetTopAndBottom(i72);
                m2630K(1);
            }
        }
        m2625F(v.getTop());
        this.f4832B = i2;
        this.f4833C = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: r */
    public void mo1681r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: u */
    public void mo1684u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0922e c0922e = (C0922e) parcelable;
        int i = this.f4846a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f4849d = c0922e.f4879e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f4847b = c0922e.f4880f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f4867v = c0922e.f4881g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f4868w = c0922e.f4882h;
            }
        }
        int i2 = c0922e.f4878d;
        if (i2 == 1 || i2 == 2) {
            this.f4870y = 4;
        } else {
            this.f4870y = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: v */
    public Parcelable mo1685v(CoordinatorLayout coordinatorLayout, V v) {
        return new C0922e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: x */
    public boolean mo1687x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f4832B = 0;
        this.f4833C = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r4 < java.lang.Math.abs(r4 - r3.f4865t)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f4865t)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (java.lang.Math.abs(r4 - r3.f4863r) < java.lang.Math.abs(r4 - r3.f4865t)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1689z(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.m2627H()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.m2630K(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f4838H
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lc0
            boolean r4 = r3.f4833C
            if (r4 != 0) goto L1f
            goto Lc0
        L1f:
            int r4 = r3.f4832B
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L34
            boolean r4 = r3.f4847b
            if (r4 == 0) goto L2a
            goto L74
        L2a:
            int r4 = r5.getTop()
            int r6 = r3.f4863r
            if (r4 <= r6) goto L85
            goto Lb4
        L34:
            boolean r4 = r3.f4867v
            if (r4 == 0) goto L57
            android.view.VelocityTracker r4 = r3.f4840J
            if (r4 != 0) goto L3e
            r4 = 0
            goto L4d
        L3e:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f4848c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f4840J
            int r1 = r3.f4841K
            float r4 = r4.getYVelocity(r1)
        L4d:
            boolean r4 = r3.m2633N(r5, r4)
            if (r4 == 0) goto L57
            int r4 = r3.f4836F
            r0 = 5
            goto Lba
        L57:
            int r4 = r3.f4832B
            if (r4 != 0) goto L98
            int r4 = r5.getTop()
            boolean r1 = r3.f4847b
            if (r1 == 0) goto L77
            int r7 = r3.f4862q
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.f4865t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto Lb7
        L74:
            int r4 = r3.f4862q
            goto Lba
        L77:
            int r1 = r3.f4863r
            if (r4 >= r1) goto L88
            int r6 = r3.f4865t
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto Lb2
        L85:
            int r4 = r3.f4861p
            goto Lba
        L88:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f4865t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Lb7
            goto Lb2
        L98:
            boolean r4 = r3.f4847b
            if (r4 == 0) goto L9d
            goto Lb7
        L9d:
            int r4 = r5.getTop()
            int r0 = r3.f4863r
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f4865t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Lb7
        Lb2:
            int r6 = r3.f4863r
        Lb4:
            r4 = r6
            r0 = r7
            goto Lba
        Lb7:
            int r4 = r3.f4865t
            r0 = r6
        Lba:
            r6 = 0
            r3.m2634O(r5, r0, r4, r6)
            r3.f4833C = r6
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1689z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
