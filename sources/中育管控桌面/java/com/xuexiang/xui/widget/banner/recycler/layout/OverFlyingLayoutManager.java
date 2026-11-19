package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class OverFlyingLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a */
    public float f4580a;

    /* renamed from: b */
    public float f4581b;

    /* renamed from: c */
    public int f4582c;

    /* renamed from: d */
    public boolean f4583d;

    /* renamed from: e */
    public int f4584e;

    /* renamed from: f */
    public int f4585f;

    /* renamed from: g */
    public int f4586g;

    /* renamed from: h */
    public int f4587h;

    /* renamed from: i */
    public int f4588i;

    /* renamed from: j */
    public float f4589j;

    /* renamed from: k */
    public OrientationHelper f4590k;

    /* renamed from: l */
    public boolean f4591l;

    /* renamed from: m */
    public boolean f4592m;

    /* renamed from: n */
    public int f4593n;

    /* renamed from: o */
    public SavedState f4594o;

    /* renamed from: p */
    public float f4595p;

    /* renamed from: q */
    public boolean f4596q;

    /* renamed from: r */
    public boolean f4597r;

    /* renamed from: s */
    public boolean f4598s;

    /* renamed from: t */
    public int f4599t;

    /* renamed from: u */
    public int f4600u;

    /* renamed from: v */
    public int f4601v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5867a();

        /* renamed from: a */
        public int f4602a;

        /* renamed from: b */
        public float f4603b;

        /* renamed from: c */
        public boolean f4604c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C5867a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i6) {
                return new SavedState[i6];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f4602a);
            parcel.writeFloat(this.f4603b);
            parcel.writeInt(this.f4604c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f4602a = parcel.readInt();
            this.f4603b = parcel.readFloat();
            this.f4604c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f4602a = savedState.f4602a;
            this.f4603b = savedState.f4603b;
            this.f4604c = savedState.f4604c;
        }
    }

    /* renamed from: k */
    private float m4482k() {
        if (this.f4591l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f4595p;
    }

    /* renamed from: l */
    private float m4483l() {
        if (this.f4591l) {
            return (-(getItemCount() - 1)) * this.f4595p;
        }
        return 0.0f;
    }

    private int scrollBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i6 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f6 = i6;
        float fM4495j = f6 / m4495j();
        if (Math.abs(fM4495j) < 1.0E-8f) {
            return 0;
        }
        float f7 = this.f4589j + fM4495j;
        if (!this.f4583d && f7 < m4483l()) {
            i6 = (int) (f6 - ((f7 - m4483l()) * m4495j()));
        } else if (!this.f4583d && f7 > m4482k()) {
            i6 = (int) ((m4482k() - this.f4589j) * m4495j());
        }
        float fM4495j2 = this.f4598s ? (int) (i6 / m4495j()) : i6 / m4495j();
        this.f4589j += fM4495j2;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            m4501r(childAt, m4504u(childAt) - fM4495j2);
        }
        m4500q(recycler);
        return i6;
    }

    /* renamed from: A */
    public float m4484A(View view, float f6) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m4485B() {
        return this.f4601v != -1;
    }

    /* renamed from: a */
    public int m4486a(View view, float f6) {
        if (this.f4586g == 1) {
            return 0;
        }
        return (int) f6;
    }

    /* renamed from: b */
    public int m4487b(View view, float f6) {
        if (this.f4586g == 1) {
            return (int) f6;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m4488c(float f6) {
        return ((-this.f4581b) / this.f4595p) * f6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f4586g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f4586g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m4490e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m4491f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m4492g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i6) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM4495j = ((i6 < getPosition(getChildAt(0))) == (this.f4591l ^ true) ? -1.0f : 1.0f) / m4495j();
        return this.f4586g == 0 ? new PointF(fM4495j, 0.0f) : new PointF(0.0f, fM4495j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m4490e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m4491f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m4492g();
    }

    /* renamed from: d */
    public final float m4489d(float f6) {
        return (((this.f4580a - 1.0f) * Math.abs(f6 - ((this.f4590k.getTotalSpace() - this.f4584e) / 2.0f))) / (this.f4590k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m4490e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f4592m) {
            return (int) this.f4595p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f4590k == null) {
            this.f4590k = OrientationHelper.createOrientationHelper(this, this.f4586g);
        }
    }

    /* renamed from: f */
    public final int m4491f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f4592m) {
            return !this.f4591l ? m4493h() : (getItemCount() - m4493h()) - 1;
        }
        float fM4496m = m4496m();
        return !this.f4591l ? (int) fM4496m : (int) (((getItemCount() - 1) * this.f4595p) + fM4496m);
    }

    /* renamed from: g */
    public final int m4492g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f4592m ? getItemCount() : (int) (getItemCount() * this.f4595p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f4586g;
    }

    /* renamed from: h */
    public int m4493h() {
        int iM4494i = m4494i();
        return !this.f4583d ? Math.abs(iM4494i) : !this.f4591l ? iM4494i >= 0 ? iM4494i % getItemCount() : getItemCount() + (iM4494i % getItemCount()) : iM4494i > 0 ? getItemCount() - (iM4494i % getItemCount()) : (-iM4494i) % getItemCount();
    }

    /* renamed from: i */
    public final int m4494i() {
        return Math.round(this.f4589j / this.f4595p);
    }

    /* renamed from: j */
    public float m4495j() {
        return 1.0f;
    }

    /* renamed from: m */
    public final float m4496m() {
        if (this.f4591l) {
            if (!this.f4583d) {
                return this.f4589j;
            }
            float f6 = this.f4589j;
            if (f6 <= 0.0f) {
                return f6 % (this.f4595p * getItemCount());
            }
            float itemCount = getItemCount();
            float f7 = this.f4595p;
            return (itemCount * (-f7)) + (this.f4589j % (f7 * getItemCount()));
        }
        if (!this.f4583d) {
            return this.f4589j;
        }
        float f8 = this.f4589j;
        if (f8 >= 0.0f) {
            return f8 % (this.f4595p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f9 = this.f4595p;
        return (itemCount2 * f9) + (this.f4589j % (f9 * getItemCount()));
    }

    /* renamed from: n */
    public int m4497n() {
        float fM4493h;
        float fM4495j;
        if (this.f4583d) {
            fM4493h = (m4494i() * this.f4595p) - this.f4589j;
            fM4495j = m4495j();
        } else {
            fM4493h = (m4493h() * (!this.f4591l ? this.f4595p : -this.f4595p)) - this.f4589j;
            fM4495j = m4495j();
        }
        return (int) (fM4493h * fM4495j);
    }

    /* renamed from: o */
    public final float m4498o(int i6) {
        return i6 * (this.f4591l ? -this.f4595p : this.f4595p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f4589j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f4596q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f4589j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f4584e = this.f4590k.getDecoratedMeasurement(viewForPosition);
        this.f4585f = this.f4590k.getDecoratedMeasurementInOther(viewForPosition);
        this.f4587h = (this.f4590k.getTotalSpace() - this.f4584e) / 2;
        this.f4588i = (m4499p() - this.f4585f) / 2;
        this.f4595p = m4507x();
        m4509z();
        this.f4599t = ((int) Math.abs(m4503t() / this.f4595p)) + 1;
        this.f4600u = ((int) Math.abs(m4502s() / this.f4595p)) + 1;
        SavedState savedState = this.f4594o;
        if (savedState != null) {
            this.f4591l = savedState.f4604c;
            this.f4593n = savedState.f4602a;
            this.f4589j = savedState.f4603b;
        }
        int i6 = this.f4593n;
        if (i6 != -1) {
            this.f4589j = i6 * (this.f4591l ? -this.f4595p : this.f4595p);
        }
        detachAndScrapAttachedViews(recycler);
        m4500q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4594o = null;
        this.f4593n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4594o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f4594o != null) {
            return new SavedState(this.f4594o);
        }
        SavedState savedState = new SavedState();
        savedState.f4602a = this.f4593n;
        savedState.f4603b = this.f4589j;
        savedState.f4604c = this.f4591l;
        return savedState;
    }

    /* renamed from: p */
    public int m4499p() {
        int width;
        int paddingRight;
        if (this.f4586g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m4500q(RecyclerView.Recycler recycler) {
        int i6;
        int i7;
        int i8;
        detachAndScrapAttachedViews(recycler);
        int iM4494i = this.f4591l ? -m4494i() : m4494i();
        int i9 = iM4494i - this.f4599t;
        int i10 = this.f4600u + iM4494i;
        if (m4485B()) {
            int i11 = this.f4601v;
            if (i11 % 2 == 0) {
                i7 = i11 / 2;
                i8 = (iM4494i - i7) + 1;
            } else {
                i7 = (i11 - 1) / 2;
                i8 = iM4494i - i7;
            }
            int i12 = iM4494i + i7 + 1;
            i9 = i8;
            i10 = i12;
        }
        int itemCount = getItemCount();
        if (!this.f4583d) {
            if (i9 < 0) {
                if (m4485B()) {
                    i10 = this.f4601v;
                }
                i9 = 0;
            }
            if (i10 > itemCount) {
                i10 = itemCount;
            }
        }
        float f6 = Float.MIN_VALUE;
        while (i9 < i10) {
            if (m4485B() || !m4505v(m4498o(i9) - this.f4589j)) {
                if (i9 >= itemCount) {
                    i6 = i9 % itemCount;
                } else if (i9 < 0) {
                    int i13 = (-i9) % itemCount;
                    if (i13 == 0) {
                        i13 = itemCount;
                    }
                    i6 = itemCount - i13;
                } else {
                    i6 = i9;
                }
                View viewForPosition = recycler.getViewForPosition(i6);
                measureChildWithMargins(viewForPosition, 0, 0);
                m4506w(viewForPosition);
                float fM4498o = m4498o(i9) - this.f4589j;
                m4501r(viewForPosition, fM4498o);
                float fM4484A = this.f4597r ? m4484A(viewForPosition, fM4498o) : i6;
                if (fM4484A > f6) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f6 = fM4484A;
            }
            i9++;
        }
    }

    /* renamed from: r */
    public final void m4501r(View view, float f6) {
        int iM4486a = m4486a(view, f6);
        int iM4487b = m4487b(view, f6);
        if (this.f4586g == 1) {
            int i6 = this.f4588i;
            int i7 = this.f4587h;
            layoutDecorated(view, i6 + iM4486a, i7 + iM4487b, iM4486a + i6 + this.f4585f, i7 + iM4487b + this.f4584e);
        } else {
            int i8 = this.f4587h;
            int i9 = this.f4588i;
            layoutDecorated(view, i8 + iM4486a, i9 + iM4487b, iM4486a + i8 + this.f4584e, i9 + iM4487b + this.f4585f);
        }
        m4508y(view, f6);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f4586g == 0 && getLayoutDirection() == 1) {
            this.f4591l = !this.f4591l;
        }
    }

    /* renamed from: s */
    public float m4502s() {
        return this.f4590k.getTotalSpace() - this.f4587h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4586g == 1) {
            return 0;
        }
        return scrollBy(i6, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i6) {
        this.f4593n = i6;
        this.f4589j = i6 * (this.f4591l ? -this.f4595p : this.f4595p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4586g == 0) {
            return 0;
        }
        return scrollBy(i6, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i6) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i6);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t */
    public float m4503t() {
        return ((-this.f4584e) - this.f4590k.getStartAfterPadding()) - this.f4587h;
    }

    /* renamed from: u */
    public float m4504u(View view) {
        int left;
        int i6;
        if (this.f4586g == 1) {
            left = view.getTop();
            i6 = this.f4587h;
        } else {
            left = view.getLeft();
            i6 = this.f4587h;
        }
        return left - i6;
    }

    /* renamed from: v */
    public final boolean m4505v(float f6) {
        return f6 > m4502s() || f6 < m4503t();
    }

    /* renamed from: w */
    public final void m4506w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m4507x() {
        return this.f4584e - this.f4582c;
    }

    /* renamed from: y */
    public void m4508y(View view, float f6) {
        float fM4489d = m4489d(this.f4587h + f6);
        view.setScaleX(fM4489d);
        view.setScaleY(fM4489d);
        view.setElevation(0.0f);
        float fM4488c = m4488c(f6);
        if (getOrientation() == 0) {
            view.setRotationY(fM4488c);
        } else {
            view.setRotationX(-fM4488c);
        }
    }

    /* renamed from: z */
    public void m4509z() {
    }
}
