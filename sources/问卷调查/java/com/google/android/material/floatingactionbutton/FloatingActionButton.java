package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p014h.C0085i;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p080c.InterfaceC0579j;
import p070b.p074b.p075a.p076a.p094p.InterfaceC0637a;
import p070b.p074b.p075a.p076a.p095q.C0638a;
import p070b.p074b.p075a.p076a.p095q.C0639b;
import p070b.p074b.p075a.p076a.p095q.C0640c;
import p070b.p074b.p075a.p076a.p095q.C0641d;
import p070b.p074b.p075a.p076a.p095q.C0644g;
import p070b.p074b.p075a.p076a.p095q.ViewTreeObserverOnPreDrawListenerC0643f;
import p070b.p074b.p075a.p076a.p096r.C0649d;
import p070b.p074b.p075a.p076a.p096r.C0660o;
import p070b.p074b.p075a.p076a.p100v.InterfaceC0668b;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p101w.InterfaceC0682n;
import p070b.p074b.p075a.p076a.p103y.C0688a;

/* loaded from: classes.dex */
public class FloatingActionButton extends C0660o implements InterfaceC0637a, InterfaceC0682n, CoordinatorLayout.InterfaceC0502b {

    /* renamed from: c */
    public ColorStateList f4940c;

    /* renamed from: d */
    public PorterDuff.Mode f4941d;

    /* renamed from: e */
    public ColorStateList f4942e;

    /* renamed from: f */
    public PorterDuff.Mode f4943f;

    /* renamed from: g */
    public ColorStateList f4944g;

    /* renamed from: h */
    public int f4945h;

    /* renamed from: i */
    public int f4946i;

    /* renamed from: j */
    public int f4947j;

    /* renamed from: k */
    public boolean f4948k;

    /* renamed from: l */
    public C0641d f4949l;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0503c<T> {

        /* renamed from: a */
        public Rect f4950a;

        /* renamed from: b */
        public boolean f4951b;

        public BaseBehavior() {
            this.f4951b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3511f);
            this.f4951b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: B */
        public boolean m2676B(FloatingActionButton floatingActionButton, Rect rect) {
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        /* renamed from: C */
        public final boolean m2677C(View view, FloatingActionButton floatingActionButton) {
            return this.f4951b && ((CoordinatorLayout.C0506f) floatingActionButton.getLayoutParams()).f3119f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: D */
        public final boolean m2678D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m2677C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f4950a == null) {
                this.f4950a = new Rect();
            }
            Rect rect = this.f4950a;
            C0649d.m2259a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m2671i(null, false);
                return true;
            }
            floatingActionButton.m2675m(null, false);
            return true;
        }

        /* renamed from: E */
        public final boolean m2679E(View view, FloatingActionButton floatingActionButton) {
            if (!m2677C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0506f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m2671i(null, false);
                return true;
            }
            floatingActionButton.m2675m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1664a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return m2676B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: f */
        public void mo1669f(CoordinatorLayout.C0506f c0506f) {
            if (c0506f.f3121h == 0) {
                c0506f.f3121h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: g */
        public boolean mo1670g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m2678D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0506f ? ((CoordinatorLayout.C0506f) layoutParams).f3114a instanceof BottomSheetBehavior : false) {
                    m2679E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: k */
        public boolean mo1674k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> listM1647d = coordinatorLayout.m1647d(floatingActionButton);
            int size = listM1647d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = listM1647d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0506f ? ((CoordinatorLayout.C0506f) layoutParams).f3114a instanceof BottomSheetBehavior : false) && m2679E(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m2678D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1655r(floatingActionButton, i);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC0936a {
        /* renamed from: a */
        public void mo2118a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo2119b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C0937b implements InterfaceC0668b {
        public C0937b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C0938c<T extends FloatingActionButton> implements C0641d.e {

        /* renamed from: a */
        public final InterfaceC0579j<T> f4953a;

        public C0938c(InterfaceC0579j<T> interfaceC0579j) {
            this.f4953a = interfaceC0579j;
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.e
        /* renamed from: a */
        public void mo2239a() {
            this.f4953a.m2107a(FloatingActionButton.this);
        }

        @Override // p070b.p074b.p075a.p076a.p095q.C0641d.e
        /* renamed from: b */
        public void mo2240b() {
            this.f4953a.m2108b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0938c) && ((C0938c) obj).f4953a.equals(this.f4953a);
        }

        public int hashCode() {
            return this.f4953a.hashCode();
        }
    }

    private C0641d getImpl() {
        if (this.f4949l == null) {
            this.f4949l = new C0644g(this, new C0937b());
        }
        return this.f4949l;
    }

    @Override // p070b.p074b.p075a.p076a.p094p.InterfaceC0637a
    /* renamed from: a */
    public boolean mo2217a() {
        throw null;
    }

    /* renamed from: d */
    public void m2666d(Animator.AnimatorListener animatorListener) {
        C0641d impl = getImpl();
        if (impl.f3858q == null) {
            impl.f3858q = new ArrayList<>();
        }
        impl.f3858q.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo2226i(getDrawableState());
    }

    /* renamed from: e */
    public void m2667e(Animator.AnimatorListener animatorListener) {
        C0641d impl = getImpl();
        if (impl.f3857p == null) {
            impl.f3857p = new ArrayList<>();
        }
        impl.f3857p.add(animatorListener);
    }

    /* renamed from: f */
    public void m2668f(InterfaceC0579j<? extends FloatingActionButton> interfaceC0579j) {
        C0641d impl = getImpl();
        C0938c c0938c = new C0938c(null);
        if (impl.f3859r == null) {
            impl.f3859r = new ArrayList<>();
        }
        impl.f3859r.add(c0938c);
    }

    @Deprecated
    /* renamed from: g */
    public boolean m2669g(Rect rect) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f4940c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f4941d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0502b
    public CoordinatorLayout.AbstractC0503c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo2220c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3846e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3847f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f4946i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C0576g getHideMotionSpec() {
        return getImpl().f3853l;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f4944g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f4944g;
    }

    public C0678j getShapeAppearanceModel() {
        C0678j c0678j = getImpl().f3842a;
        Objects.requireNonNull(c0678j);
        return c0678j;
    }

    public C0576g getShowMotionSpec() {
        return getImpl().f3852k;
    }

    public int getSize() {
        return this.f4945h;
    }

    public int getSizeDimension() {
        return m2670h(this.f4945h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f4942e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f4943f;
    }

    public boolean getUseCompatPadding() {
        return this.f4948k;
    }

    /* renamed from: h */
    public final int m2670h(int i) {
        int i2 = this.f4946i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C1088R.dimen.design_fab_size_normal : C1088R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m2670h(1) : m2670h(0);
    }

    /* renamed from: i */
    public void m2671i(AbstractC0936a abstractC0936a, boolean z) {
        C0641d impl = getImpl();
        C0638a c0638a = abstractC0936a == null ? null : new C0638a(this, abstractC0936a);
        if (impl.m2222e()) {
            return;
        }
        Animator animator = impl.f3851j;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m2234q()) {
            impl.f3860s.m2270b(z ? 8 : 4, z);
            if (c0638a != null) {
                c0638a.f3826a.mo2118a(c0638a.f3827b);
                return;
            }
            return;
        }
        C0576g c0576g = impl.f3853l;
        if (c0576g == null) {
            if (impl.f3850i == null) {
                impl.f3850i = C0576g.m2102b(impl.f3860s.getContext(), C1088R.animator.design_fab_hide_motion_spec);
            }
            c0576g = impl.f3850i;
            Objects.requireNonNull(c0576g);
        }
        AnimatorSet animatorSetM2218a = impl.m2218a(c0576g, 0.0f, 0.0f, 0.0f);
        animatorSetM2218a.addListener(new C0639b(impl, z, c0638a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f3858q;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM2218a.addListener(it.next());
            }
        }
        animatorSetM2218a.start();
    }

    /* renamed from: j */
    public boolean m2672j() {
        return getImpl().m2222e();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo2224g();
    }

    /* renamed from: k */
    public boolean m2673k() {
        return getImpl().m2223f();
    }

    /* renamed from: l */
    public final void m2674l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f4942e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f4943f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0085i.m334c(colorForState, mode));
    }

    /* renamed from: m */
    public void m2675m(AbstractC0936a abstractC0936a, boolean z) {
        C0641d impl = getImpl();
        C0638a c0638a = abstractC0936a == null ? null : new C0638a(this, abstractC0936a);
        if (impl.m2223f()) {
            return;
        }
        Animator animator = impl.f3851j;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m2234q()) {
            impl.f3860s.m2270b(0, z);
            impl.f3860s.setAlpha(1.0f);
            impl.f3860s.setScaleY(1.0f);
            impl.f3860s.setScaleX(1.0f);
            impl.m2231n(1.0f);
            if (c0638a != null) {
                c0638a.f3826a.mo2119b(c0638a.f3827b);
                return;
            }
            return;
        }
        if (impl.f3860s.getVisibility() != 0) {
            impl.f3860s.setAlpha(0.0f);
            impl.f3860s.setScaleY(0.0f);
            impl.f3860s.setScaleX(0.0f);
            impl.m2231n(0.0f);
        }
        C0576g c0576g = impl.f3852k;
        if (c0576g == null) {
            if (impl.f3849h == null) {
                impl.f3849h = C0576g.m2102b(impl.f3860s.getContext(), C1088R.animator.design_fab_show_motion_spec);
            }
            c0576g = impl.f3849h;
            Objects.requireNonNull(c0576g);
        }
        AnimatorSet animatorSetM2218a = impl.m2218a(c0576g, 1.0f, 1.0f, 1.0f);
        animatorSetM2218a.addListener(new C0640c(impl, z, c0638a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f3857p;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM2218a.addListener(it.next());
            }
        }
        animatorSetM2218a.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0641d impl = getImpl();
        if (impl.mo2230m()) {
            ViewTreeObserver viewTreeObserver = impl.f3860s.getViewTreeObserver();
            if (impl.f3866y == null) {
                impl.f3866y = new ViewTreeObserverOnPreDrawListenerC0643f(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f3866y);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0641d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3860s.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f3866y;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f3866y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        this.f4947j = (getSizeDimension() + 0) / 2;
        getImpl().m2237t();
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0688a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0688a c0688a = (C0688a) parcelable;
        super.onRestoreInstanceState(c0688a.f1718b);
        Objects.requireNonNull(c0688a.f4115d.getOrDefault("expandableWidgetHelper", null));
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        AbstractC0287a abstractC0287a = AbstractC0287a.f1717c;
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m2669g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4940c != colorStateList) {
            this.f4940c = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f4941d != mode) {
            this.f4941d = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        C0641d impl = getImpl();
        if (impl.f3845d != f2) {
            impl.f3845d = f2;
            impl.mo2227j(f2, impl.f3846e, impl.f3847f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        C0641d impl = getImpl();
        if (impl.f3846e != f2) {
            impl.f3846e = f2;
            impl.mo2227j(impl.f3845d, f2, impl.f3847f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f2) {
        C0641d impl = getImpl();
        if (impl.f3847f != f2) {
            impl.f3847f = f2;
            impl.mo2227j(impl.f3845d, impl.f3846e, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f4946i) {
            this.f4946i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f3843b) {
            getImpl().f3843b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C0576g c0576g) {
        getImpl().f3853l = c0576g;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0576g.m2102b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C0641d impl = getImpl();
            impl.m2231n(impl.f3855n);
            if (this.f4942e != null) {
                m2674l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f4944g != colorStateList) {
            this.f4944g = colorStateList;
            getImpl().mo2232o(this.f4944g);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().m2228k();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().m2228k();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C0641d impl = getImpl();
        impl.f3844c = z;
        impl.m2237t();
        throw null;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0682n
    public void setShapeAppearanceModel(C0678j c0678j) {
        getImpl().f3842a = c0678j;
    }

    public void setShowMotionSpec(C0576g c0576g) {
        getImpl().f3852k = c0576g;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0576g.m2102b(getContext(), i));
    }

    public void setSize(int i) {
        this.f4946i = 0;
        if (i != this.f4945h) {
            this.f4945h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f4942e != colorStateList) {
            this.f4942e = colorStateList;
            m2674l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f4943f != mode) {
            this.f4943f = mode;
            m2674l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().m2229l();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().m2229l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().m2229l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4948k != z) {
            this.f4948k = z;
            getImpl().mo2225h();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p096r.C0660o, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
