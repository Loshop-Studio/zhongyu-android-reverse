package p000a.p052k.p053b;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0277z;
import p000a.p052k.C0293a;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.w */
/* loaded from: classes.dex */
public final class C0340w extends FrameLayout {

    /* renamed from: b */
    public ArrayList<View> f2108b;

    /* renamed from: c */
    public ArrayList<View> f2109c;

    /* renamed from: d */
    public View.OnApplyWindowInsetsListener f2110d;

    /* renamed from: e */
    public boolean f2111e;

    public C0340w(Context context, AttributeSet attributeSet, AbstractC0301c0 abstractC0301c0) {
        View view;
        super(context, attributeSet);
        this.f2111e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0293a.f1761b);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC0320m componentCallbacksC0320mM1013H = abstractC0301c0.m1013H(id);
        if (classAttribute != null && componentCallbacksC0320mM1013H == null) {
            if (id <= 0) {
                throw new IllegalStateException(C0561a.m2077e("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? C0561a.m2076d(" with tag ", string) : BuildConfig.FLAVOR));
            }
            ComponentCallbacksC0320m componentCallbacksC0320mMo1069a = abstractC0301c0.m1016K().mo1069a(context.getClassLoader(), classAttribute);
            componentCallbacksC0320mMo1069a.m1147W(attributeSet, null);
            C0294a c0294a = new C0294a(abstractC0301c0);
            c0294a.f1947o = true;
            componentCallbacksC0320mMo1069a.f1962F = this;
            c0294a.mo974c(getId(), componentCallbacksC0320mMo1069a, string, 1);
            if (c0294a.f1939g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0294a.f1762p.m1009D(c0294a, true);
        }
        Iterator it = ((ArrayList) abstractC0301c0.f1808c.m1106f()).iterator();
        while (it.hasNext()) {
            C0315j0 c0315j0 = (C0315j0) it.next();
            ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
            if (componentCallbacksC0320m.f2000y == getId() && (view = componentCallbacksC0320m.f1963G) != null && view.getParent() == null) {
                componentCallbacksC0320m.f1962F = this;
                c0315j0.m1085b();
            }
        }
    }

    /* renamed from: a */
    public final void m1242a(View view) {
        ArrayList<View> arrayList = this.f2109c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2108b == null) {
            this.f2108b = new ArrayList<>();
        }
        this.f2108b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(C1088R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC0320m ? (ComponentCallbacksC0320m) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(C1088R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC0320m ? (ComponentCallbacksC0320m) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0277z c0277zM895j = C0277z.m895j(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2110d;
        C0277z c0277zM894i = onApplyWindowInsetsListener != null ? C0277z.m894i(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C0266o.m870i(this, c0277zM895j);
        if (!c0277zM894i.m900f()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0266o.m863b(getChildAt(i), c0277zM894i);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f2111e && this.f2108b != null) {
            for (int i = 0; i < this.f2108b.size(); i++) {
                super.drawChild(canvas, this.f2108b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f2111e || (arrayList = this.f2108b) == null || arrayList.size() <= 0 || !this.f2108b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2109c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2108b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2111e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m1242a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m1242a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m1242a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m1242a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m1242a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m1242a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m1242a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2111e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2110d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2109c == null) {
                this.f2109c = new ArrayList<>();
            }
            this.f2109c.add(view);
        }
        super.startViewTransition(view);
    }
}
