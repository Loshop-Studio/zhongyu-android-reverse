package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p099i0.C2664c;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C0460i implements LayoutInflater.Factory2 {

    /* renamed from: a */
    final FragmentManager f3192a;

    /* renamed from: androidx.fragment.app.i$a */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C0467p f3193a;

        a(C0467p c0467p) {
            this.f3193a = c0467p;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM2664k = this.f3193a.m2664k();
            this.f3193a.m2665m();
            AbstractC0476y.m2776n((ViewGroup) fragmentM2664k.mView.getParent(), LayoutInflaterFactory2C0460i.this.f3192a).m2784j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    LayoutInflaterFactory2C0460i(FragmentManager fragmentManager) {
        this.f3192a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0467p c0467pM2506w;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3192a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2664c.f10591d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(C2664c.f10592e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2664c.f10593f, -1);
        String string = typedArrayObtainStyledAttributes.getString(C2664c.f10594g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0458g.m2615b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM2481i0 = resourceId != -1 ? this.f3192a.m2481i0(resourceId) : null;
        if (fragmentM2481i0 == null && string != null) {
            fragmentM2481i0 = this.f3192a.m2483j0(string);
        }
        if (fragmentM2481i0 == null && id != -1) {
            fragmentM2481i0 = this.f3192a.m2481i0(id);
        }
        if (fragmentM2481i0 == null) {
            fragmentM2481i0 = this.f3192a.m2500s0().mo2519a(context.getClassLoader(), attributeValue);
            fragmentM2481i0.mFromLayout = true;
            fragmentM2481i0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM2481i0.mContainerId = id;
            fragmentM2481i0.mTag = string;
            fragmentM2481i0.mInLayout = true;
            FragmentManager fragmentManager = this.f3192a;
            fragmentM2481i0.mFragmentManager = fragmentManager;
            fragmentM2481i0.mHost = fragmentManager.m2505v0();
            fragmentM2481i0.onInflate(this.f3192a.m2505v0().m2619f(), attributeSet, fragmentM2481i0.mSavedFragmentState);
            c0467pM2506w = this.f3192a.m2476g(fragmentM2481i0);
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentM2481i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentM2481i0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM2481i0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f3192a;
            fragmentM2481i0.mFragmentManager = fragmentManager2;
            fragmentM2481i0.mHost = fragmentManager2.m2505v0();
            fragmentM2481i0.onInflate(this.f3192a.m2505v0().m2619f(), attributeSet, fragmentM2481i0.mSavedFragmentState);
            c0467pM2506w = this.f3192a.m2506w(fragmentM2481i0);
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentM2481i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        fragmentM2481i0.mContainer = (ViewGroup) view;
        c0467pM2506w.m2665m();
        c0467pM2506w.m2663j();
        View view2 = fragmentM2481i0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM2481i0.mView.getTag() == null) {
            fragmentM2481i0.mView.setTag(string);
        }
        fragmentM2481i0.mView.addOnAttachStateChangeListener(new a(c0467pM2506w));
        return fragmentM2481i0.mView;
    }
}
