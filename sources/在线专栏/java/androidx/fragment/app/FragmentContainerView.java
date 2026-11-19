package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import java.util.ArrayList;
import p099i0.C2664c;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    private ArrayList<View> f3010a;

    /* renamed from: b */
    private ArrayList<View> f3011b;

    /* renamed from: c */
    private View.OnApplyWindowInsetsListener f3012c;

    /* renamed from: d */
    private boolean f3013d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m2386a(View view) {
        ArrayList<View> arrayList = this.f3011b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3010a == null) {
            this.f3010a = new ArrayList<>();
        }
        this.f3010a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m2387B0(view) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        if (FragmentManager.m2387B0(view) != null) {
            return super.addViewInLayout(view, i4, layoutParams, z3);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0340c0 c0340c0M1861w = C0340c0.m1861w(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3012c;
        C0340c0 c0340c0M1861w2 = onApplyWindowInsetsListener != null ? C0340c0.m1861w(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C0358u.m2023c0(this, c0340c0M1861w);
        if (!c0340c0M1861w2.m1877p()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0358u.m2030g(getChildAt(i4), c0340c0M1861w2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f3013d && this.f3010a != null) {
            for (int i4 = 0; i4 < this.f3010a.size(); i4++) {
                super.drawChild(canvas, this.f3010a.get(i4), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        ArrayList<View> arrayList;
        if (!this.f3013d || (arrayList = this.f3010a) == null || arrayList.size() <= 0 || !this.f3010a.contains(view)) {
            return super.drawChild(canvas, view, j4);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3011b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3010a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3013d = true;
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
            m2386a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z3) {
        if (z3) {
            m2386a(view);
        }
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m2386a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i4) {
        m2386a(getChildAt(i4));
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m2386a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            m2386a(getChildAt(i6));
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            m2386a(getChildAt(i6));
        }
        super.removeViewsInLayout(i4, i5);
    }

    void setDrawDisappearingViewsLast(boolean z3) {
        this.f3013d = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3012c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3011b == null) {
                this.f3011b = new ArrayList<>();
            }
            this.f3011b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i4) {
        String str;
        super(context, attributeSet, i4);
        this.f3013d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2664c.f10595h);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C2664c.f10596i);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        this.f3013d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2664c.f10595h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C2664c.f10596i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C2664c.f10597j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM2481i0 = fragmentManager.m2481i0(id);
        if (classAttribute != null && fragmentM2481i0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentMo2519a = fragmentManager.m2500s0().mo2519a(context.getClassLoader(), classAttribute);
            fragmentMo2519a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m2489m().m2708t(true).m2701d(this, fragmentMo2519a, string).mo2553k();
        }
        fragmentManager.m2461W0(this);
    }
}
