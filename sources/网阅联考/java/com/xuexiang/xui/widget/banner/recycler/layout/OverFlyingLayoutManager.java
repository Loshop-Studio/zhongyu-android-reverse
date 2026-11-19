package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class OverFlyingLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a */
    public float f3196a;

    /* renamed from: b */
    public float f3197b;

    /* renamed from: c */
    public int f3198c;

    /* renamed from: d */
    public boolean f3199d;

    /* renamed from: e */
    public int f3200e;

    /* renamed from: f */
    public int f3201f;

    /* renamed from: g */
    public int f3202g;

    /* renamed from: h */
    public int f3203h;

    /* renamed from: i */
    public int f3204i;

    /* renamed from: j */
    public float f3205j;

    /* renamed from: k */
    public OrientationHelper f3206k;

    /* renamed from: l */
    public boolean f3207l;

    /* renamed from: m */
    public boolean f3208m;

    /* renamed from: n */
    public int f3209n;

    /* renamed from: o */
    public SavedState f3210o;

    /* renamed from: p */
    public float f3211p;

    /* renamed from: q */
    public boolean f3212q;

    /* renamed from: r */
    public boolean f3213r;

    /* renamed from: s */
    public boolean f3214s;

    /* renamed from: t */
    public int f3215t;

    /* renamed from: u */
    public int f3216u;

    /* renamed from: v */
    public int f3217v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3538a();

        /* renamed from: a */
        public int f3218a;

        /* renamed from: b */
        public float f3219b;

        /* renamed from: c */
        public boolean f3220c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C3538a implements Parcelable.Creator {
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

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f3218a);
            parcel.writeFloat(this.f3219b);
            parcel.writeInt(this.f3220c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f3218a = parcel.readInt();
            this.f3219b = parcel.readFloat();
            this.f3220c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3218a = savedState.f3218a;
            this.f3219b = savedState.f3219b;
            this.f3220c = savedState.f3220c;
        }
    }

    /* renamed from: A */
    public float m4158A(View view, float f4) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m4159B() {
        return this.f3217v != -1;
    }

    /* renamed from: a */
    public int m4160a(View view, float f4) {
        if (this.f3202g == 1) {
            return 0;
        }
        return (int) f4;
    }

    /* renamed from: b */
    public int m4161b(View view, float f4) {
        if (this.f3202g == 1) {
            return (int) f4;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m4162c(float f4) {
        return ((-this.f3197b) / this.f3211p) * f4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f3202g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f3202g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m4164e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m4165f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m4166g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i4) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM4169j = ((i4 < getPosition(getChildAt(0))) == (this.f3207l ^ true) ? -1.0f : 1.0f) / m4169j();
        return this.f3202g == 0 ? new PointF(fM4169j, 0.0f) : new PointF(0.0f, fM4169j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m4164e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m4165f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m4166g();
    }

    /* renamed from: d */
    public final float m4163d(float f4) {
        return (((this.f3196a - 1.0f) * Math.abs(f4 - ((this.f3206k.getTotalSpace() - this.f3200e) / 2.0f))) / (this.f3206k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m4164e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f3208m) {
            return (int) this.f3211p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f3206k == null) {
            this.f3206k = OrientationHelper.createOrientationHelper(this, this.f3202g);
        }
    }

    /* renamed from: f */
    public final int m4165f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f3208m) {
            return !this.f3207l ? m4167h() : (getItemCount() - m4167h()) - 1;
        }
        float fM4172m = m4172m();
        return !this.f3207l ? (int) fM4172m : (int) (((getItemCount() - 1) * this.f3211p) + fM4172m);
    }

    /* renamed from: g */
    public final int m4166g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f3208m ? getItemCount() : (int) (getItemCount() * this.f3211p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f3202g;
    }

    /* renamed from: h */
    public int m4167h() {
        int iM4168i = m4168i();
        if (!this.f3199d) {
            return Math.abs(iM4168i);
        }
        if (this.f3207l) {
            return iM4168i > 0 ? getItemCount() - (iM4168i % getItemCount()) : (-iM4168i) % getItemCount();
        }
        if (iM4168i >= 0) {
            return iM4168i % getItemCount();
        }
        return (iM4168i % getItemCount()) + getItemCount();
    }

    /* renamed from: i */
    public final int m4168i() {
        return Math.round(this.f3205j / this.f3211p);
    }

    /* renamed from: j */
    public float m4169j() {
        return 1.0f;
    }

    /* renamed from: k */
    public final float m4170k() {
        if (this.f3207l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f3211p;
    }

    /* renamed from: l */
    public final float m4171l() {
        if (this.f3207l) {
            return (-(getItemCount() - 1)) * this.f3211p;
        }
        return 0.0f;
    }

    /* renamed from: m */
    public final float m4172m() {
        if (this.f3207l) {
            if (!this.f3199d) {
                return this.f3205j;
            }
            float f4 = this.f3205j;
            if (f4 <= 0.0f) {
                return f4 % (this.f3211p * getItemCount());
            }
            float itemCount = getItemCount();
            float f5 = this.f3211p;
            return (itemCount * (-f5)) + (this.f3205j % (f5 * getItemCount()));
        }
        if (!this.f3199d) {
            return this.f3205j;
        }
        float f6 = this.f3205j;
        if (f6 >= 0.0f) {
            return f6 % (this.f3211p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f7 = this.f3211p;
        return (itemCount2 * f7) + (this.f3205j % (f7 * getItemCount()));
    }

    /* renamed from: n */
    public int m4173n() {
        float fM4167h;
        float fM4169j;
        if (this.f3199d) {
            fM4167h = (m4168i() * this.f3211p) - this.f3205j;
            fM4169j = m4169j();
        } else {
            fM4167h = (m4167h() * (!this.f3207l ? this.f3211p : -this.f3211p)) - this.f3205j;
            fM4169j = m4169j();
        }
        return (int) (fM4167h * fM4169j);
    }

    /* renamed from: o */
    public final float m4174o(int i4) {
        return i4 * (this.f3207l ? -this.f3211p : this.f3211p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f3205j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f3212q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f3205j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f3200e = this.f3206k.getDecoratedMeasurement(viewForPosition);
        this.f3201f = this.f3206k.getDecoratedMeasurementInOther(viewForPosition);
        this.f3203h = (this.f3206k.getTotalSpace() - this.f3200e) / 2;
        this.f3204i = (m4175p() - this.f3201f) / 2;
        this.f3211p = m4183x();
        m4185z();
        this.f3215t = ((int) Math.abs(m4179t() / this.f3211p)) + 1;
        this.f3216u = ((int) Math.abs(m4178s() / this.f3211p)) + 1;
        SavedState savedState = this.f3210o;
        if (savedState != null) {
            this.f3207l = savedState.f3220c;
            this.f3209n = savedState.f3218a;
            this.f3205j = savedState.f3219b;
        }
        int i4 = this.f3209n;
        if (i4 != -1) {
            this.f3205j = i4 * (this.f3207l ? -this.f3211p : this.f3211p);
        }
        detachAndScrapAttachedViews(recycler);
        m4176q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f3210o = null;
        this.f3209n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3210o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f3210o != null) {
            return new SavedState(this.f3210o);
        }
        SavedState savedState = new SavedState();
        savedState.f3218a = this.f3209n;
        savedState.f3219b = this.f3205j;
        savedState.f3220c = this.f3207l;
        return savedState;
    }

    /* renamed from: p */
    public int m4175p() {
        int width;
        int paddingRight;
        if (this.f3202g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m4176q(RecyclerView.Recycler recycler) {
        int i4;
        int i5;
        int i6;
        detachAndScrapAttachedViews(recycler);
        int iM4168i = this.f3207l ? -m4168i() : m4168i();
        int i7 = iM4168i - this.f3215t;
        int i8 = this.f3216u + iM4168i;
        if (m4159B()) {
            int i9 = this.f3217v;
            if (i9 % 2 == 0) {
                i5 = i9 / 2;
                i6 = (iM4168i - i5) + 1;
            } else {
                i5 = (i9 - 1) / 2;
                i6 = iM4168i - i5;
            }
            int i10 = iM4168i + i5 + 1;
            i7 = i6;
            i8 = i10;
        }
        int itemCount = getItemCount();
        if (!this.f3199d) {
            if (i7 < 0) {
                if (m4159B()) {
                    i8 = this.f3217v;
                }
                i7 = 0;
            }
            if (i8 > itemCount) {
                i8 = itemCount;
            }
        }
        float f4 = Float.MIN_VALUE;
        while (i7 < i8) {
            if (m4159B() || !m4181v(m4174o(i7) - this.f3205j)) {
                if (i7 >= itemCount) {
                    i4 = i7 % itemCount;
                } else if (i7 < 0) {
                    int i11 = (-i7) % itemCount;
                    if (i11 == 0) {
                        i11 = itemCount;
                    }
                    i4 = itemCount - i11;
                } else {
                    i4 = i7;
                }
                View viewForPosition = recycler.getViewForPosition(i4);
                measureChildWithMargins(viewForPosition, 0, 0);
                m4182w(viewForPosition);
                float fM4174o = m4174o(i7) - this.f3205j;
                m4177r(viewForPosition, fM4174o);
                float fM4158A = this.f3213r ? m4158A(viewForPosition, fM4174o) : i4;
                if (fM4158A > f4) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f4 = fM4158A;
            }
            i7++;
        }
    }

    /* renamed from: r */
    public final void m4177r(View view, float f4) {
        int iM4160a = m4160a(view, f4);
        int iM4161b = m4161b(view, f4);
        if (this.f3202g == 1) {
            int i4 = this.f3204i;
            int i5 = this.f3203h;
            layoutDecorated(view, i4 + iM4160a, i5 + iM4161b, i4 + iM4160a + this.f3201f, i5 + iM4161b + this.f3200e);
        } else {
            int i6 = this.f3203h;
            int i7 = this.f3204i;
            layoutDecorated(view, i6 + iM4160a, i7 + iM4161b, i6 + iM4160a + this.f3200e, i7 + iM4161b + this.f3201f);
        }
        m4184y(view, f4);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f3202g == 0 && getLayoutDirection() == 1) {
            this.f3207l = !this.f3207l;
        }
    }

    /* renamed from: s */
    public float m4178s() {
        return this.f3206k.getTotalSpace() - this.f3203h;
    }

    public final int scrollBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f4 = i4;
        float fM4169j = f4 / m4169j();
        if (Math.abs(fM4169j) < 1.0E-8f) {
            return 0;
        }
        float f5 = this.f3205j + fM4169j;
        if (!this.f3199d && f5 < m4171l()) {
            i4 = (int) (f4 - ((f5 - m4171l()) * m4169j()));
        } else if (!this.f3199d && f5 > m4170k()) {
            i4 = (int) ((m4170k() - this.f3205j) * m4169j());
        }
        float fM4169j2 = this.f3214s ? (int) (i4 / m4169j()) : i4 / m4169j();
        this.f3205j += fM4169j2;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            m4177r(childAt, m4180u(childAt) - fM4169j2);
        }
        m4176q(recycler);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f3202g == 1) {
            return 0;
        }
        return scrollBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        this.f3209n = i4;
        this.f3205j = i4 * (this.f3207l ? -this.f3211p : this.f3211p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f3202g == 0) {
            return 0;
        }
        return scrollBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i4);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t */
    public float m4179t() {
        return ((-this.f3200e) - this.f3206k.getStartAfterPadding()) - this.f3203h;
    }

    /* renamed from: u */
    public float m4180u(View view) {
        int left;
        int i4;
        if (this.f3202g == 1) {
            left = view.getTop();
            i4 = this.f3203h;
        } else {
            left = view.getLeft();
            i4 = this.f3203h;
        }
        return left - i4;
    }

    /* renamed from: v */
    public final boolean m4181v(float f4) {
        return f4 > m4178s() || f4 < m4179t();
    }

    /* renamed from: w */
    public final void m4182w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m4183x() {
        return this.f3200e - this.f3198c;
    }

    /* renamed from: y */
    public void m4184y(View view, float f4) {
        float fM4163d = m4163d(this.f3203h + f4);
        view.setScaleX(fM4163d);
        view.setScaleY(fM4163d);
        view.setElevation(0.0f);
        float fM4162c = m4162c(f4);
        if (getOrientation() == 0) {
            view.setRotationY(fM4162c);
        } else {
            view.setRotationX(-fM4162c);
        }
    }

    /* renamed from: z */
    public void m4185z() {
    }
}
