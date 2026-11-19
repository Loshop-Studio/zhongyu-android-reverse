package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class OverFlyingLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a */
    public float f15446a;

    /* renamed from: b */
    public float f15447b;

    /* renamed from: c */
    public int f15448c;

    /* renamed from: d */
    public boolean f15449d;

    /* renamed from: e */
    public int f15450e;

    /* renamed from: f */
    public int f15451f;

    /* renamed from: g */
    public int f15452g;

    /* renamed from: h */
    public int f15453h;

    /* renamed from: i */
    public int f15454i;

    /* renamed from: j */
    public float f15455j;

    /* renamed from: k */
    public OrientationHelper f15456k;

    /* renamed from: l */
    public boolean f15457l;

    /* renamed from: m */
    public boolean f15458m;

    /* renamed from: n */
    public int f15459n;

    /* renamed from: o */
    public SavedState f15460o;

    /* renamed from: p */
    public float f15461p;

    /* renamed from: q */
    public boolean f15462q;

    /* renamed from: r */
    public boolean f15463r;

    /* renamed from: s */
    public boolean f15464s;

    /* renamed from: t */
    public int f15465t;

    /* renamed from: u */
    public int f15466u;

    /* renamed from: v */
    public int f15467v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8058a();

        /* renamed from: c */
        public int f15468c;

        /* renamed from: d */
        public float f15469d;

        /* renamed from: e */
        public boolean f15470e;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C8058a implements Parcelable.Creator {
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
            parcel.writeInt(this.f15468c);
            parcel.writeFloat(this.f15469d);
            parcel.writeInt(this.f15470e ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f15468c = parcel.readInt();
            this.f15469d = parcel.readFloat();
            this.f15470e = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f15468c = savedState.f15468c;
            this.f15469d = savedState.f15469d;
            this.f15470e = savedState.f15470e;
        }
    }

    /* renamed from: k */
    private float m12340k() {
        if (this.f15457l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f15461p;
    }

    /* renamed from: l */
    private float m12341l() {
        if (this.f15457l) {
            return (-(getItemCount() - 1)) * this.f15461p;
        }
        return 0.0f;
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM12353j = f10 / m12353j();
        if (Math.abs(fM12353j) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f15455j + fM12353j;
        if (!this.f15449d && f11 < m12341l()) {
            i10 = (int) (f10 - ((f11 - m12341l()) * m12353j()));
        } else if (!this.f15449d && f11 > m12340k()) {
            i10 = (int) ((m12340k() - this.f15455j) * m12353j());
        }
        float fM12353j2 = this.f15464s ? (int) (i10 / m12353j()) : i10 / m12353j();
        this.f15455j += fM12353j2;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            m12359r(childAt, m12362u(childAt) - fM12353j2);
        }
        m12358q(recycler);
        return i10;
    }

    /* renamed from: A */
    public float m12342A(View view, float f10) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m12343B() {
        return this.f15467v != -1;
    }

    /* renamed from: a */
    public int m12344a(View view, float f10) {
        if (this.f15452g == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m12345b(View view, float f10) {
        if (this.f15452g == 1) {
            return (int) f10;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m12346c(float f10) {
        return ((-this.f15447b) / this.f15461p) * f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f15452g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f15452g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m12348e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m12349f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m12350g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM12353j = ((i10 < getPosition(getChildAt(0))) == (this.f15457l ^ true) ? -1.0f : 1.0f) / m12353j();
        return this.f15452g == 0 ? new PointF(fM12353j, 0.0f) : new PointF(0.0f, fM12353j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m12348e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m12349f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m12350g();
    }

    /* renamed from: d */
    public final float m12347d(float f10) {
        return (((this.f15446a - 1.0f) * Math.abs(f10 - ((this.f15456k.getTotalSpace() - this.f15450e) / 2.0f))) / (this.f15456k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m12348e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f15458m) {
            return (int) this.f15461p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f15456k == null) {
            this.f15456k = OrientationHelper.createOrientationHelper(this, this.f15452g);
        }
    }

    /* renamed from: f */
    public final int m12349f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f15458m) {
            return !this.f15457l ? m12351h() : (getItemCount() - m12351h()) - 1;
        }
        float fM12354m = m12354m();
        return !this.f15457l ? (int) fM12354m : (int) (((getItemCount() - 1) * this.f15461p) + fM12354m);
    }

    /* renamed from: g */
    public final int m12350g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f15458m ? getItemCount() : (int) (getItemCount() * this.f15461p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f15452g;
    }

    /* renamed from: h */
    public int m12351h() {
        int iM12352i = m12352i();
        return !this.f15449d ? Math.abs(iM12352i) : !this.f15457l ? iM12352i >= 0 ? iM12352i % getItemCount() : getItemCount() + (iM12352i % getItemCount()) : iM12352i > 0 ? getItemCount() - (iM12352i % getItemCount()) : (-iM12352i) % getItemCount();
    }

    /* renamed from: i */
    public final int m12352i() {
        return Math.round(this.f15455j / this.f15461p);
    }

    /* renamed from: j */
    public float m12353j() {
        return 1.0f;
    }

    /* renamed from: m */
    public final float m12354m() {
        if (this.f15457l) {
            if (!this.f15449d) {
                return this.f15455j;
            }
            float f10 = this.f15455j;
            if (f10 <= 0.0f) {
                return f10 % (this.f15461p * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f15461p;
            return (itemCount * (-f11)) + (this.f15455j % (f11 * getItemCount()));
        }
        if (!this.f15449d) {
            return this.f15455j;
        }
        float f12 = this.f15455j;
        if (f12 >= 0.0f) {
            return f12 % (this.f15461p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f15461p;
        return (itemCount2 * f13) + (this.f15455j % (f13 * getItemCount()));
    }

    /* renamed from: n */
    public int m12355n() {
        float fM12351h;
        float fM12353j;
        if (this.f15449d) {
            fM12351h = (m12352i() * this.f15461p) - this.f15455j;
            fM12353j = m12353j();
        } else {
            fM12351h = (m12351h() * (!this.f15457l ? this.f15461p : -this.f15461p)) - this.f15455j;
            fM12353j = m12353j();
        }
        return (int) (fM12351h * fM12353j);
    }

    /* renamed from: o */
    public final float m12356o(int i10) {
        return i10 * (this.f15457l ? -this.f15461p : this.f15461p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f15455j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f15462q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f15455j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f15450e = this.f15456k.getDecoratedMeasurement(viewForPosition);
        this.f15451f = this.f15456k.getDecoratedMeasurementInOther(viewForPosition);
        this.f15453h = (this.f15456k.getTotalSpace() - this.f15450e) / 2;
        this.f15454i = (m12357p() - this.f15451f) / 2;
        this.f15461p = m12365x();
        m12367z();
        this.f15465t = ((int) Math.abs(m12361t() / this.f15461p)) + 1;
        this.f15466u = ((int) Math.abs(m12360s() / this.f15461p)) + 1;
        SavedState savedState = this.f15460o;
        if (savedState != null) {
            this.f15457l = savedState.f15470e;
            this.f15459n = savedState.f15468c;
            this.f15455j = savedState.f15469d;
        }
        int i10 = this.f15459n;
        if (i10 != -1) {
            this.f15455j = i10 * (this.f15457l ? -this.f15461p : this.f15461p);
        }
        detachAndScrapAttachedViews(recycler);
        m12358q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f15460o = null;
        this.f15459n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f15460o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f15460o != null) {
            return new SavedState(this.f15460o);
        }
        SavedState savedState = new SavedState();
        savedState.f15468c = this.f15459n;
        savedState.f15469d = this.f15455j;
        savedState.f15470e = this.f15457l;
        return savedState;
    }

    /* renamed from: p */
    public int m12357p() {
        int width;
        int paddingRight;
        if (this.f15452g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m12358q(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        int iM12352i = this.f15457l ? -m12352i() : m12352i();
        int i13 = iM12352i - this.f15465t;
        int i14 = this.f15466u + iM12352i;
        if (m12343B()) {
            int i15 = this.f15467v;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM12352i - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM12352i - i11;
            }
            int i16 = iM12352i + i11 + 1;
            i13 = i12;
            i14 = i16;
        }
        int itemCount = getItemCount();
        if (!this.f15449d) {
            if (i13 < 0) {
                if (m12343B()) {
                    i14 = this.f15467v;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m12343B() || !m12363v(m12356o(i13) - this.f15455j)) {
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
                m12364w(viewForPosition);
                float fM12356o = m12356o(i13) - this.f15455j;
                m12359r(viewForPosition, fM12356o);
                float fM12342A = this.f15463r ? m12342A(viewForPosition, fM12356o) : i10;
                if (fM12342A > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f10 = fM12342A;
            }
            i13++;
        }
    }

    /* renamed from: r */
    public final void m12359r(View view, float f10) {
        int iM12344a = m12344a(view, f10);
        int iM12345b = m12345b(view, f10);
        if (this.f15452g == 1) {
            int i10 = this.f15454i;
            int i11 = this.f15453h;
            layoutDecorated(view, i10 + iM12344a, i11 + iM12345b, iM12344a + i10 + this.f15451f, i11 + iM12345b + this.f15450e);
        } else {
            int i12 = this.f15453h;
            int i13 = this.f15454i;
            layoutDecorated(view, i12 + iM12344a, i13 + iM12345b, iM12344a + i12 + this.f15450e, i13 + iM12345b + this.f15451f);
        }
        m12366y(view, f10);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f15452g == 0 && getLayoutDirection() == 1) {
            this.f15457l = !this.f15457l;
        }
    }

    /* renamed from: s */
    public float m12360s() {
        return this.f15456k.getTotalSpace() - this.f15453h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f15452g == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f15459n = i10;
        this.f15455j = i10 * (this.f15457l ? -this.f15461p : this.f15461p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f15452g == 0) {
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
    public float m12361t() {
        return ((-this.f15450e) - this.f15456k.getStartAfterPadding()) - this.f15453h;
    }

    /* renamed from: u */
    public float m12362u(View view) {
        int left;
        int i10;
        if (this.f15452g == 1) {
            left = view.getTop();
            i10 = this.f15453h;
        } else {
            left = view.getLeft();
            i10 = this.f15453h;
        }
        return left - i10;
    }

    /* renamed from: v */
    public final boolean m12363v(float f10) {
        return f10 > m12360s() || f10 < m12361t();
    }

    /* renamed from: w */
    public final void m12364w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m12365x() {
        return this.f15450e - this.f15448c;
    }

    /* renamed from: y */
    public void m12366y(View view, float f10) {
        float fM12347d = m12347d(this.f15453h + f10);
        view.setScaleX(fM12347d);
        view.setScaleY(fM12347d);
        view.setElevation(0.0f);
        float fM12346c = m12346c(f10);
        if (getOrientation() == 0) {
            view.setRotationY(fM12346c);
        } else {
            view.setRotationX(-fM12346c);
        }
    }

    /* renamed from: z */
    public void m12367z() {
    }
}
