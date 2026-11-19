package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0450a> f3104a;

    /* renamed from: b */
    private Context f3105b;

    /* renamed from: c */
    private FragmentManager f3106c;

    /* renamed from: d */
    private int f3107d;

    /* renamed from: e */
    private TabHost.OnTabChangeListener f3108e;

    /* renamed from: f */
    private C0450a f3109f;

    /* renamed from: g */
    private boolean f3110g;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0449a();

        /* renamed from: a */
        String f3111a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        class C0449a implements Parcelable.Creator<SavedState> {
            C0449a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3111a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f3111a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3111a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    static final class C0450a {

        /* renamed from: a */
        final String f3112a;

        /* renamed from: b */
        final Class<?> f3113b;

        /* renamed from: c */
        final Bundle f3114c;

        /* renamed from: d */
        Fragment f3115d;
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3104a = new ArrayList<>();
        m2537c(context, attributeSet);
    }

    /* renamed from: a */
    private AbstractC0470s m2535a(String str, AbstractC0470s abstractC0470s) {
        Fragment fragment;
        C0450a c0450aM2536b = m2536b(str);
        if (this.f3109f != c0450aM2536b) {
            if (abstractC0470s == null) {
                abstractC0470s = this.f3106c.m2489m();
            }
            C0450a c0450a = this.f3109f;
            if (c0450a != null && (fragment = c0450a.f3115d) != null) {
                abstractC0470s.mo2554l(fragment);
            }
            if (c0450aM2536b != null) {
                Fragment fragment2 = c0450aM2536b.f3115d;
                if (fragment2 == null) {
                    Fragment fragmentMo2519a = this.f3106c.m2500s0().mo2519a(this.f3105b.getClassLoader(), c0450aM2536b.f3113b.getName());
                    c0450aM2536b.f3115d = fragmentMo2519a;
                    fragmentMo2519a.setArguments(c0450aM2536b.f3114c);
                    abstractC0470s.m2700c(this.f3107d, c0450aM2536b.f3115d, c0450aM2536b.f3112a);
                } else {
                    abstractC0470s.m2704g(fragment2);
                }
            }
            this.f3109f = c0450aM2536b;
        }
        return abstractC0470s;
    }

    /* renamed from: b */
    private C0450a m2536b(String str) {
        int size = this.f3104a.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0450a c0450a = this.f3104a.get(i4);
            if (c0450a.f3112a.equals(str)) {
                return c0450a;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m2537c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f3107d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3104a.size();
        AbstractC0470s abstractC0470sM2489m = null;
        for (int i4 = 0; i4 < size; i4++) {
            C0450a c0450a = this.f3104a.get(i4);
            Fragment fragmentM2483j0 = this.f3106c.m2483j0(c0450a.f3112a);
            c0450a.f3115d = fragmentM2483j0;
            if (fragmentM2483j0 != null && !fragmentM2483j0.isDetached()) {
                if (c0450a.f3112a.equals(currentTabTag)) {
                    this.f3109f = c0450a;
                } else {
                    if (abstractC0470sM2489m == null) {
                        abstractC0470sM2489m = this.f3106c.m2489m();
                    }
                    abstractC0470sM2489m.mo2554l(c0450a.f3115d);
                }
            }
        }
        this.f3110g = true;
        AbstractC0470s abstractC0470sM2535a = m2535a(currentTabTag, abstractC0470sM2489m);
        if (abstractC0470sM2535a != null) {
            abstractC0470sM2535a.mo2550h();
            this.f3106c.m2474f0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3110g = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3111a);
    }

    @Override // android.view.View
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3111a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        AbstractC0470s abstractC0470sM2535a;
        if (this.f3110g && (abstractC0470sM2535a = m2535a(str, null)) != null) {
            abstractC0470sM2535a.mo2550h();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3108e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3108e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
