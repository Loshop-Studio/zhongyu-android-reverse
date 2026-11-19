package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class OverFlyingLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a */
    public float f5856a;

    /* renamed from: b */
    public float f5857b;

    /* renamed from: c */
    public int f5858c;

    /* renamed from: d */
    public boolean f5859d;

    /* renamed from: e */
    public int f5860e;

    /* renamed from: f */
    public int f5861f;

    /* renamed from: g */
    public int f5862g;

    /* renamed from: h */
    public int f5863h;

    /* renamed from: i */
    public int f5864i;

    /* renamed from: j */
    public float f5865j;

    /* renamed from: k */
    public OrientationHelper f5866k;

    /* renamed from: l */
    public boolean f5867l;

    /* renamed from: m */
    public boolean f5868m;

    /* renamed from: n */
    public int f5869n;

    /* renamed from: o */
    public SavedState f5870o;

    /* renamed from: p */
    public float f5871p;

    /* renamed from: q */
    public boolean f5872q;

    /* renamed from: r */
    public boolean f5873r;

    /* renamed from: s */
    public boolean f5874s;

    /* renamed from: t */
    public int f5875t;

    /* renamed from: u */
    public int f5876u;

    /* renamed from: v */
    public int f5877v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6489a();

        /* renamed from: a */
        public int f5878a;

        /* renamed from: b */
        public float f5879b;

        /* renamed from: c */
        public boolean f5880c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C6489a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5878a);
            parcel.writeFloat(this.f5879b);
            parcel.writeInt(this.f5880c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f5878a = parcel.readInt();
            this.f5879b = parcel.readFloat();
            this.f5880c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f5878a = savedState.f5878a;
            this.f5879b = savedState.f5879b;
            this.f5880c = savedState.f5880c;
        }
    }

    /* renamed from: k */
    private float m5472k() {
        if (this.f5867l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f5871p;
    }

    /* renamed from: l */
    private float m5473l() {
        if (this.f5867l) {
            return (-(getItemCount() - 1)) * this.f5871p;
        }
        return 0.0f;
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM5485j = f10 / m5485j();
        if (Math.abs(fM5485j) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f5865j + fM5485j;
        if (!this.f5859d && f11 < m5473l()) {
            i10 = (int) (f10 - ((f11 - m5473l()) * m5485j()));
        } else if (!this.f5859d && f11 > m5472k()) {
            i10 = (int) ((m5472k() - this.f5865j) * m5485j());
        }
        float fM5485j2 = this.f5874s ? (int) (i10 / m5485j()) : i10 / m5485j();
        this.f5865j += fM5485j2;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            m5491r(childAt, m5494u(childAt) - fM5485j2);
        }
        m5490q(recycler);
        return i10;
    }

    /* renamed from: A */
    public float m5474A(View view, float f10) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m5475B() {
        return this.f5877v != -1;
    }

    /* renamed from: a */
    public int m5476a(View view, float f10) {
        if (this.f5862g == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m5477b(View view, float f10) {
        if (this.f5862g == 1) {
            return (int) f10;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m5478c(float f10) {
        return ((-this.f5857b) / this.f5871p) * f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f5862g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f5862g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m5480e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m5481f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m5482g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM5485j = ((i10 < getPosition(getChildAt(0))) == (this.f5867l ^ true) ? -1.0f : 1.0f) / m5485j();
        return this.f5862g == 0 ? new PointF(fM5485j, 0.0f) : new PointF(0.0f, fM5485j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m5480e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m5481f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m5482g();
    }

    /* renamed from: d */
    public final float m5479d(float f10) {
        return (((this.f5856a - 1.0f) * Math.abs(f10 - ((this.f5866k.getTotalSpace() - this.f5860e) / 2.0f))) / (this.f5866k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m5480e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f5868m) {
            return (int) this.f5871p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f5866k == null) {
            this.f5866k = OrientationHelper.createOrientationHelper(this, this.f5862g);
        }
    }

    /* renamed from: f */
    public final int m5481f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f5868m) {
            return !this.f5867l ? m5483h() : (getItemCount() - m5483h()) - 1;
        }
        float fM5486m = m5486m();
        return !this.f5867l ? (int) fM5486m : (int) (((getItemCount() - 1) * this.f5871p) + fM5486m);
    }

    /* renamed from: g */
    public final int m5482g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f5868m ? getItemCount() : (int) (getItemCount() * this.f5871p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f5862g;
    }

    /* renamed from: h */
    public int m5483h() {
        int iM5484i = m5484i();
        return !this.f5859d ? Math.abs(iM5484i) : !this.f5867l ? iM5484i >= 0 ? iM5484i % getItemCount() : getItemCount() + (iM5484i % getItemCount()) : iM5484i > 0 ? getItemCount() - (iM5484i % getItemCount()) : (-iM5484i) % getItemCount();
    }

    /* renamed from: i */
    public final int m5484i() {
        return Math.round(this.f5865j / this.f5871p);
    }

    /* renamed from: j */
    public float m5485j() {
        return 1.0f;
    }

    /* renamed from: m */
    public final float m5486m() {
        if (this.f5867l) {
            if (!this.f5859d) {
                return this.f5865j;
            }
            float f10 = this.f5865j;
            if (f10 <= 0.0f) {
                return f10 % (this.f5871p * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f5871p;
            return (itemCount * (-f11)) + (this.f5865j % (f11 * getItemCount()));
        }
        if (!this.f5859d) {
            return this.f5865j;
        }
        float f12 = this.f5865j;
        if (f12 >= 0.0f) {
            return f12 % (this.f5871p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f5871p;
        return (itemCount2 * f13) + (this.f5865j % (f13 * getItemCount()));
    }

    /* renamed from: n */
    public int m5487n() {
        float fM5483h;
        float fM5485j;
        if (this.f5859d) {
            fM5483h = (m5484i() * this.f5871p) - this.f5865j;
            fM5485j = m5485j();
        } else {
            fM5483h = (m5483h() * (!this.f5867l ? this.f5871p : -this.f5871p)) - this.f5865j;
            fM5485j = m5485j();
        }
        return (int) (fM5483h * fM5485j);
    }

    /* renamed from: o */
    public final float m5488o(int i10) {
        return i10 * (this.f5867l ? -this.f5871p : this.f5871p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f5865j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f5872q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f5865j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f5860e = this.f5866k.getDecoratedMeasurement(viewForPosition);
        this.f5861f = this.f5866k.getDecoratedMeasurementInOther(viewForPosition);
        this.f5863h = (this.f5866k.getTotalSpace() - this.f5860e) / 2;
        this.f5864i = (m5489p() - this.f5861f) / 2;
        this.f5871p = m5497x();
        m5499z();
        this.f5875t = ((int) Math.abs(m5493t() / this.f5871p)) + 1;
        this.f5876u = ((int) Math.abs(m5492s() / this.f5871p)) + 1;
        SavedState savedState = this.f5870o;
        if (savedState != null) {
            this.f5867l = savedState.f5880c;
            this.f5869n = savedState.f5878a;
            this.f5865j = savedState.f5879b;
        }
        int i10 = this.f5869n;
        if (i10 != -1) {
            this.f5865j = i10 * (this.f5867l ? -this.f5871p : this.f5871p);
        }
        detachAndScrapAttachedViews(recycler);
        m5490q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f5870o = null;
        this.f5869n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f5870o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f5870o != null) {
            return new SavedState(this.f5870o);
        }
        SavedState savedState = new SavedState();
        savedState.f5878a = this.f5869n;
        savedState.f5879b = this.f5865j;
        savedState.f5880c = this.f5867l;
        return savedState;
    }

    /* renamed from: p */
    public int m5489p() {
        int width;
        int paddingRight;
        if (this.f5862g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m5490q(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        int iM5484i = this.f5867l ? -m5484i() : m5484i();
        int i13 = iM5484i - this.f5875t;
        int i14 = this.f5876u + iM5484i;
        if (m5475B()) {
            int i15 = this.f5877v;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM5484i - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM5484i - i11;
            }
            int i16 = iM5484i + i11 + 1;
            i13 = i12;
            i14 = i16;
        }
        int itemCount = getItemCount();
        if (!this.f5859d) {
            if (i13 < 0) {
                if (m5475B()) {
                    i14 = this.f5877v;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m5475B() || !m5495v(m5488o(i13) - this.f5865j)) {
                if (i13 >= itemCount) {
                    i10 = i13 % itemCount;
                } else if (i13 < 0) {
                    int i17 = (-i13) % itemCount;
                    if (i17 == 0) {
                        i17 = itemCount;
                    }
                    i10 = itemCount - i17;
                } else {
                    i10 = i13;
                }
                View viewForPosition = recycler.getViewForPosition(i10);
                measureChildWithMargins(viewForPosition, 0, 0);
                m5496w(viewForPosition);
                float fM5488o = m5488o(i13) - this.f5865j;
                m5491r(viewForPosition, fM5488o);
                float fM5474A = this.f5873r ? m5474A(viewForPosition, fM5488o) : i10;
                if (fM5474A > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f10 = fM5474A;
            }
            i13++;
        }
    }

    /* renamed from: r */
    public final void m5491r(View view, float f10) {
        int iM5476a = m5476a(view, f10);
        int iM5477b = m5477b(view, f10);
        if (this.f5862g == 1) {
            int i10 = this.f5864i;
            int i11 = this.f5863h;
            layoutDecorated(view, i10 + iM5476a, i11 + iM5477b, iM5476a + i10 + this.f5861f, i11 + iM5477b + this.f5860e);
        } else {
            int i12 = this.f5863h;
            int i13 = this.f5864i;
            layoutDecorated(view, i12 + iM5476a, i13 + iM5477b, iM5476a + i12 + this.f5860e, i13 + iM5477b + this.f5861f);
        }
        m5498y(view, f10);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f5862g == 0 && getLayoutDirection() == 1) {
            this.f5867l = !this.f5867l;
        }
    }

    /* renamed from: s */
    public float m5492s() {
        return this.f5866k.getTotalSpace() - this.f5863h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5862g == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f5869n = i10;
        this.f5865j = i10 * (this.f5867l ? -this.f5871p : this.f5871p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5862g == 0) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t */
    public float m5493t() {
        return ((-this.f5860e) - this.f5866k.getStartAfterPadding()) - this.f5863h;
    }

    /* renamed from: u */
    public float m5494u(View view) {
        int left;
        int i10;
        if (this.f5862g == 1) {
            left = view.getTop();
            i10 = this.f5863h;
        } else {
            left = view.getLeft();
            i10 = this.f5863h;
        }
        return left - i10;
    }

    /* renamed from: v */
    public final boolean m5495v(float f10) {
        return f10 > m5492s() || f10 < m5493t();
    }

    /* renamed from: w */
    public final void m5496w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m5497x() {
        return this.f5860e - this.f5858c;
    }

    /* renamed from: y */
    public void m5498y(View view, float f10) {
        float fM5479d = m5479d(this.f5863h + f10);
        view.setScaleX(fM5479d);
        view.setScaleY(fM5479d);
        view.setElevation(0.0f);
        float fM5478c = m5478c(f10);
        if (getOrientation() == 0) {
            view.setRotationY(fM5478c);
        } else {
            view.setRotationX(-fM5478c);
        }
    }

    /* renamed from: z */
    public void m5499z() {
    }
}
