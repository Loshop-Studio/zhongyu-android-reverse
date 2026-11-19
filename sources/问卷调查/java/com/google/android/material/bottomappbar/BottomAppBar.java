package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p083f.C0589a;
import p070b.p074b.p075a.p076a.p083f.C0590b;
import p070b.p074b.p075a.p076a.p083f.C0591c;
import p070b.p074b.p075a.p076a.p083f.C0592d;
import p070b.p074b.p075a.p076a.p083f.C0593e;
import p070b.p074b.p075a.p076a.p083f.C0594f;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0502b {

    /* renamed from: W */
    public static final /* synthetic */ int f4815W = 0;

    /* renamed from: O */
    public Animator f4816O;

    /* renamed from: P */
    public Animator f4817P;

    /* renamed from: Q */
    public int f4818Q;

    /* renamed from: R */
    public int f4819R;

    /* renamed from: S */
    public boolean f4820S;

    /* renamed from: T */
    public int f4821T;

    /* renamed from: U */
    public boolean f4822U;

    /* renamed from: V */
    public Behavior f4823V;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f4824e;

        /* renamed from: f */
        public WeakReference<BottomAppBar> f4825f;

        /* renamed from: g */
        public int f4826g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f4827h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC0916a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0916a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (Behavior.this.f4825f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                } else {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Behavior.this.f4824e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
            }
        }

        public Behavior() {
            this.f4827h = new ViewOnLayoutChangeListenerC0916a();
            this.f4824e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4827h = new ViewOnLayoutChangeListenerC0916a();
            this.f4824e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: k */
        public boolean mo1674k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f4825f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f4815W;
            View viewM2619y = bottomAppBar.m2619y();
            if (viewM2619y != null) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (!viewM2619y.isLaidOut()) {
                    CoordinatorLayout.C0506f c0506f = (CoordinatorLayout.C0506f) viewM2619y.getLayoutParams();
                    c0506f.f3117d = 49;
                    this.f4826g = ((ViewGroup.MarginLayoutParams) c0506f).bottomMargin;
                    if (viewM2619y instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewM2619y;
                        floatingActionButton.addOnLayoutChangeListener(this.f4827h);
                        floatingActionButton.m2666d(null);
                        floatingActionButton.m2667e(new C0593e(bottomAppBar));
                        floatingActionButton.m2668f(null);
                    }
                    bottomAppBar.m2616C();
                    throw null;
                }
            }
            coordinatorLayout.m1655r(bottomAppBar, i);
            this.f4797a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: x */
        public boolean mo1687x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C0917a extends AbstractC0287a {
        public static final Parcelable.Creator<C0917a> CREATOR = new a();

        /* renamed from: d */
        public int f4829d;

        /* renamed from: e */
        public boolean f4830e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0917a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0917a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0917a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0917a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0917a(parcel, classLoader);
            }
        }

        public C0917a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4829d = parcel.readInt();
            this.f4830e = parcel.readInt() != 0;
        }

        public C0917a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f4829d);
            parcel.writeInt(this.f4830e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return m2614A(this.f4818Q);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f3600d;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private C0594f getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: v */
    public static void m2613v(BottomAppBar bottomAppBar) {
        bottomAppBar.f4821T--;
    }

    /* renamed from: A */
    public final float m2614A(int i) {
        boolean zM2089j = C0562a.m2089j(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (zM2089j ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: B */
    public final boolean m2615B() {
        FloatingActionButton floatingActionButtonM2618x = m2618x();
        return floatingActionButtonM2618x != null && floatingActionButtonM2618x.m2673k();
    }

    /* renamed from: C */
    public final void m2616C() {
        getTopEdgeTreatment().f3601e = getFabTranslationX();
        m2619y();
        if (this.f4822U) {
            m2615B();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0502b
    public Behavior getBehavior() {
        if (this.f4823V == null) {
            this.f4823V = new Behavior();
        }
        return this.f4823V;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f3600d;
    }

    public int getFabAlignmentMode() {
        return this.f4818Q;
    }

    public int getFabAnimationMode() {
        return this.f4819R;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f3599c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f3598b;
    }

    public boolean getHideOnScroll() {
        return this.f4820S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                actionMenuView.setAlpha(1.0f);
                actionMenuView.setTranslationX(!m2615B() ? m2620z(actionMenuView, 0, false) : m2620z(actionMenuView, this.f4818Q, this.f4822U));
                return;
            }
            return;
        }
        Animator animator = this.f4817P;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f4816O;
        if (animator2 != null) {
            animator2.cancel();
        }
        m2616C();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0917a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0917a c0917a = (C0917a) parcelable;
        super.onRestoreInstanceState(c0917a.f1718b);
        this.f4818Q = c0917a.f4829d;
        this.f4822U = c0917a.f4830e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C0917a c0917a = new C0917a(super.onSaveInstanceState());
        c0917a.f4829d = this.f4818Q;
        c0917a.f4830e = this.f4822U;
        return c0917a;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            C0594f topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.f3600d = f2;
            throw null;
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        if (this.f4818Q != i) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (isLaidOut()) {
                Animator animator = this.f4816O;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f4819R == 1) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m2618x(), "translationX", m2614A(i));
                    objectAnimatorOfFloat.setDuration(300L);
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    m2617w(i);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f4816O = animatorSet;
                animatorSet.addListener(new C0589a(this));
                this.f4816O.start();
            }
        }
        boolean z = this.f4822U;
        WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
        if (isLaidOut()) {
            Animator animator2 = this.f4817P;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (m2615B()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - m2620z(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat3.addListener(new C0592d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(objectAnimatorOfFloat3, objectAnimatorOfFloat2);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(objectAnimatorOfFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f4817P = animatorSet3;
            animatorSet3.addListener(new C0591c(this));
            this.f4817P.start();
        }
        this.f4818Q = i;
    }

    public void setFabAnimationMode(int i) {
        this.f4819R = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f3599c = f2;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f3598b = f2;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f4820S = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: w */
    public void m2617w(int i) {
        FloatingActionButton floatingActionButtonM2618x = m2618x();
        if (floatingActionButtonM2618x == null || floatingActionButtonM2618x.m2672j()) {
            return;
        }
        this.f4821T++;
        floatingActionButtonM2618x.m2671i(new C0590b(this, i), true);
    }

    /* renamed from: x */
    public final FloatingActionButton m2618x() {
        View viewM2619y = m2619y();
        if (viewM2619y instanceof FloatingActionButton) {
            return (FloatingActionButton) viewM2619y;
        }
        return null;
    }

    /* renamed from: y */
    public final View m2619y() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1648e(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: z */
    public int m2620z(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zM2089j = C0562a.m2089j(this);
        int measuredWidth = zM2089j ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0495e) && (((Toolbar.C0495e) childAt.getLayoutParams()).f52a & 8388615) == 8388611) {
                measuredWidth = zM2089j ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zM2089j ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }
}
