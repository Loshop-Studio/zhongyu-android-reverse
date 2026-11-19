package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p095q.InterfaceC0645h;
import p070b.p074b.p075a.p076a.p096r.C0649d;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0502b {

    /* renamed from: r */
    public static final /* synthetic */ int f4936r = 0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0503c<T> {

        /* renamed from: a */
        public Rect f4937a;

        /* renamed from: b */
        public boolean f4938b;

        /* renamed from: c */
        public boolean f4939c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f4938b = false;
            this.f4939c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3510e);
            this.f4938b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f4939c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: B */
        public final boolean m2662B(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f4938b || this.f4939c) && ((CoordinatorLayout.C0506f) extendedFloatingActionButton.getLayoutParams()).f3119f == view.getId();
        }

        /* renamed from: C */
        public final boolean m2663C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m2662B(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f4937a == null) {
                this.f4937a = new Rect();
            }
            Rect rect = this.f4937a;
            C0649d.m2259a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f4939c) {
                    int i = ExtendedFloatingActionButton.f4936r;
                    Objects.requireNonNull(extendedFloatingActionButton);
                } else {
                    int i2 = ExtendedFloatingActionButton.f4936r;
                    Objects.requireNonNull(extendedFloatingActionButton);
                }
                ExtendedFloatingActionButton.m2661e(extendedFloatingActionButton, null);
                return true;
            }
            if (this.f4939c) {
                int i3 = ExtendedFloatingActionButton.f4936r;
                Objects.requireNonNull(extendedFloatingActionButton);
            } else {
                int i4 = ExtendedFloatingActionButton.f4936r;
                Objects.requireNonNull(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.m2661e(extendedFloatingActionButton, null);
            return true;
        }

        /* renamed from: D */
        public final boolean m2664D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m2662B(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0506f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (this.f4939c) {
                    int i = ExtendedFloatingActionButton.f4936r;
                } else {
                    int i2 = ExtendedFloatingActionButton.f4936r;
                }
                ExtendedFloatingActionButton.m2661e(extendedFloatingActionButton, null);
                return true;
            }
            if (this.f4939c) {
                int i3 = ExtendedFloatingActionButton.f4936r;
            } else {
                int i4 = ExtendedFloatingActionButton.f4936r;
            }
            ExtendedFloatingActionButton.m2661e(extendedFloatingActionButton, null);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1664a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m2663C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0506f ? ((CoordinatorLayout.C0506f) layoutParams).f3114a instanceof BottomSheetBehavior : false) {
                    m2664D(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: k */
        public boolean mo1674k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> listM1647d = coordinatorLayout.m1647d(extendedFloatingActionButton);
            int size = listM1647d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = listM1647d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0506f ? ((CoordinatorLayout.C0506f) layoutParams).f3114a instanceof BottomSheetBehavior : false) && m2664D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m2663C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1655r(extendedFloatingActionButton, i);
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C0934a extends Property<View, Float> {
        public C0934a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().width = f2.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C0935b extends Property<View, Float> {
        public C0935b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().height = f2.intValue();
            view2.requestLayout();
        }
    }

    static {
        new C0934a(Float.class, "width");
        new C0935b(Float.class, "height");
    }

    /* renamed from: e */
    public static void m2661e(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC0645h interfaceC0645h) {
        Objects.requireNonNull(extendedFloatingActionButton);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0502b
    public CoordinatorLayout.AbstractC0503c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public C0576g getExtendMotionSpec() {
        throw null;
    }

    public C0576g getHideMotionSpec() {
        throw null;
    }

    public C0576g getShowMotionSpec() {
        throw null;
    }

    public C0576g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C0576g c0576g) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C0576g.m2102b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C0576g c0576g) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0576g.m2102b(getContext(), i));
    }

    public void setShowMotionSpec(C0576g c0576g) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0576g.m2102b(getContext(), i));
    }

    public void setShrinkMotionSpec(C0576g c0576g) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C0576g.m2102b(getContext(), i));
    }
}
