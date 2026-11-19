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
    public float f7111a;

    /* renamed from: b */
    public float f7112b;

    /* renamed from: c */
    public int f7113c;

    /* renamed from: d */
    public boolean f7114d;

    /* renamed from: e */
    public int f7115e;

    /* renamed from: f */
    public int f7116f;

    /* renamed from: g */
    public int f7117g;

    /* renamed from: h */
    public int f7118h;

    /* renamed from: i */
    public int f7119i;

    /* renamed from: j */
    public float f7120j;

    /* renamed from: k */
    public OrientationHelper f7121k;

    /* renamed from: l */
    public boolean f7122l;

    /* renamed from: m */
    public boolean f7123m;

    /* renamed from: n */
    public int f7124n;

    /* renamed from: o */
    public SavedState f7125o;

    /* renamed from: p */
    public float f7126p;

    /* renamed from: q */
    public boolean f7127q;

    /* renamed from: r */
    public boolean f7128r;

    /* renamed from: s */
    public boolean f7129s;

    /* renamed from: t */
    public int f7130t;

    /* renamed from: u */
    public int f7131u;

    /* renamed from: v */
    public int f7132v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6808a();

        /* renamed from: a */
        public int f7133a;

        /* renamed from: b */
        public float f7134b;

        /* renamed from: c */
        public boolean f7135c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C6808a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i9) {
                return new SavedState[i9];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f7133a);
            parcel.writeFloat(this.f7134b);
            parcel.writeInt(this.f7135c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f7133a = parcel.readInt();
            this.f7134b = parcel.readFloat();
            this.f7135c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f7133a = savedState.f7133a;
            this.f7134b = savedState.f7134b;
            this.f7135c = savedState.f7135c;
        }
    }

    /* renamed from: k */
    private float m6568k() {
        if (this.f7122l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f7126p;
    }

    /* renamed from: l */
    private float m6569l() {
        if (this.f7122l) {
            return (-(getItemCount() - 1)) * this.f7126p;
        }
        return 0.0f;
    }

    private int scrollBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i9;
        float fM6581j = f10 / m6581j();
        if (Math.abs(fM6581j) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f7120j + fM6581j;
        if (!this.f7114d && f11 < m6569l()) {
            i9 = (int) (f10 - ((f11 - m6569l()) * m6581j()));
        } else if (!this.f7114d && f11 > m6568k()) {
            i9 = (int) ((m6568k() - this.f7120j) * m6581j());
        }
        float fM6581j2 = this.f7129s ? (int) (i9 / m6581j()) : i9 / m6581j();
        this.f7120j += fM6581j2;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            m6587r(childAt, m6590u(childAt) - fM6581j2);
        }
        m6586q(recycler);
        return i9;
    }

    /* renamed from: A */
    public float m6570A(View view, float f10) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m6571B() {
        return this.f7132v != -1;
    }

    /* renamed from: a */
    public int m6572a(View view, float f10) {
        if (this.f7117g == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m6573b(View view, float f10) {
        if (this.f7117g == 1) {
            return (int) f10;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m6574c(float f10) {
        return ((-this.f7112b) / this.f7126p) * f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f7117g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f7117g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m6576e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m6577f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m6578g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i9) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM6581j = ((i9 < getPosition(getChildAt(0))) == (this.f7122l ^ true) ? -1.0f : 1.0f) / m6581j();
        return this.f7117g == 0 ? new PointF(fM6581j, 0.0f) : new PointF(0.0f, fM6581j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m6576e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m6577f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m6578g();
    }

    /* renamed from: d */
    public final float m6575d(float f10) {
        return (((this.f7111a - 1.0f) * Math.abs(f10 - ((this.f7121k.getTotalSpace() - this.f7115e) / 2.0f))) / (this.f7121k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m6576e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f7123m) {
            return (int) this.f7126p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f7121k == null) {
            this.f7121k = OrientationHelper.createOrientationHelper(this, this.f7117g);
        }
    }

    /* renamed from: f */
    public final int m6577f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f7123m) {
            return !this.f7122l ? m6579h() : (getItemCount() - m6579h()) - 1;
        }
        float fM6582m = m6582m();
        return !this.f7122l ? (int) fM6582m : (int) (((getItemCount() - 1) * this.f7126p) + fM6582m);
    }

    /* renamed from: g */
    public final int m6578g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f7123m ? getItemCount() : (int) (getItemCount() * this.f7126p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f7117g;
    }

    /* renamed from: h */
    public int m6579h() {
        int iM6580i = m6580i();
        return !this.f7114d ? Math.abs(iM6580i) : !this.f7122l ? iM6580i >= 0 ? iM6580i % getItemCount() : getItemCount() + (iM6580i % getItemCount()) : iM6580i > 0 ? getItemCount() - (iM6580i % getItemCount()) : (-iM6580i) % getItemCount();
    }

    /* renamed from: i */
    public final int m6580i() {
        return Math.round(this.f7120j / this.f7126p);
    }

    /* renamed from: j */
    public float m6581j() {
        return 1.0f;
    }

    /* renamed from: m */
    public final float m6582m() {
        if (this.f7122l) {
            if (!this.f7114d) {
                return this.f7120j;
            }
            float f10 = this.f7120j;
            if (f10 <= 0.0f) {
                return f10 % (this.f7126p * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f7126p;
            return (itemCount * (-f11)) + (this.f7120j % (f11 * getItemCount()));
        }
        if (!this.f7114d) {
            return this.f7120j;
        }
        float f12 = this.f7120j;
        if (f12 >= 0.0f) {
            return f12 % (this.f7126p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f7126p;
        return (itemCount2 * f13) + (this.f7120j % (f13 * getItemCount()));
    }

    /* renamed from: n */
    public int m6583n() {
        float fM6579h;
        float fM6581j;
        if (this.f7114d) {
            fM6579h = (m6580i() * this.f7126p) - this.f7120j;
            fM6581j = m6581j();
        } else {
            fM6579h = (m6579h() * (!this.f7122l ? this.f7126p : -this.f7126p)) - this.f7120j;
            fM6581j = m6581j();
        }
        return (int) (fM6579h * fM6581j);
    }

    /* renamed from: o */
    public final float m6584o(int i9) {
        return i9 * (this.f7122l ? -this.f7126p : this.f7126p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f7120j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f7127q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f7120j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f7115e = this.f7121k.getDecoratedMeasurement(viewForPosition);
        this.f7116f = this.f7121k.getDecoratedMeasurementInOther(viewForPosition);
        this.f7118h = (this.f7121k.getTotalSpace() - this.f7115e) / 2;
        this.f7119i = (m6585p() - this.f7116f) / 2;
        this.f7126p = m6593x();
        m6595z();
        this.f7130t = ((int) Math.abs(m6589t() / this.f7126p)) + 1;
        this.f7131u = ((int) Math.abs(m6588s() / this.f7126p)) + 1;
        SavedState savedState = this.f7125o;
        if (savedState != null) {
            this.f7122l = savedState.f7135c;
            this.f7124n = savedState.f7133a;
            this.f7120j = savedState.f7134b;
        }
        int i9 = this.f7124n;
        if (i9 != -1) {
            this.f7120j = i9 * (this.f7122l ? -this.f7126p : this.f7126p);
        }
        detachAndScrapAttachedViews(recycler);
        m6586q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f7125o = null;
        this.f7124n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7125o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f7125o != null) {
            return new SavedState(this.f7125o);
        }
        SavedState savedState = new SavedState();
        savedState.f7133a = this.f7124n;
        savedState.f7134b = this.f7120j;
        savedState.f7135c = this.f7122l;
        return savedState;
    }

    /* renamed from: p */
    public int m6585p() {
        int width;
        int paddingRight;
        if (this.f7117g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m6586q(RecyclerView.Recycler recycler) {
        int i9;
        int i10;
        int i11;
        detachAndScrapAttachedViews(recycler);
        int iM6580i = this.f7122l ? -m6580i() : m6580i();
        int i12 = iM6580i - this.f7130t;
        int i13 = this.f7131u + iM6580i;
        if (m6571B()) {
            int i14 = this.f7132v;
            if (i14 % 2 == 0) {
                i10 = i14 / 2;
                i11 = (iM6580i - i10) + 1;
            } else {
                i10 = (i14 - 1) / 2;
                i11 = iM6580i - i10;
            }
            int i15 = iM6580i + i10 + 1;
            i12 = i11;
            i13 = i15;
        }
        int itemCount = getItemCount();
        if (!this.f7114d) {
            if (i12 < 0) {
                if (m6571B()) {
                    i13 = this.f7132v;
                }
                i12 = 0;
            }
            if (i13 > itemCount) {
                i13 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i12 < i13) {
            if (m6571B() || !m6591v(m6584o(i12) - this.f7120j)) {
                if (i12 >= itemCount) {
                    i9 = i12 % itemCount;
                } else if (i12 < 0) {
                    int i16 = (-i12) % itemCount;
                    if (i16 == 0) {
                        i16 = itemCount;
                    }
                    i9 = itemCount - i16;
                } else {
                    i9 = i12;
                }
                View viewForPosition = recycler.getViewForPosition(i9);
                measureChildWithMargins(viewForPosition, 0, 0);
                m6592w(viewForPosition);
                float fM6584o = m6584o(i12) - this.f7120j;
                m6587r(viewForPosition, fM6584o);
                float fM6570A = this.f7128r ? m6570A(viewForPosition, fM6584o) : i9;
                if (fM6570A > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f10 = fM6570A;
            }
            i12++;
        }
    }

    /* renamed from: r */
    public final void m6587r(View view, float f10) {
        int iM6572a = m6572a(view, f10);
        int iM6573b = m6573b(view, f10);
        if (this.f7117g == 1) {
            int i9 = this.f7119i;
            int i10 = this.f7118h;
            layoutDecorated(view, i9 + iM6572a, i10 + iM6573b, iM6572a + i9 + this.f7116f, i10 + iM6573b + this.f7115e);
        } else {
            int i11 = this.f7118h;
            int i12 = this.f7119i;
            layoutDecorated(view, i11 + iM6572a, i12 + iM6573b, iM6572a + i11 + this.f7115e, i12 + iM6573b + this.f7116f);
        }
        m6594y(view, f10);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f7117g == 0 && getLayoutDirection() == 1) {
            this.f7122l = !this.f7122l;
        }
    }

    /* renamed from: s */
    public float m6588s() {
        return this.f7121k.getTotalSpace() - this.f7118h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7117g == 1) {
            return 0;
        }
        return scrollBy(i9, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i9) {
        this.f7124n = i9;
        this.f7120j = i9 * (this.f7122l ? -this.f7126p : this.f7126p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7117g == 0) {
            return 0;
        }
        return scrollBy(i9, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i9) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i9);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t */
    public float m6589t() {
        return ((-this.f7115e) - this.f7121k.getStartAfterPadding()) - this.f7118h;
    }

    /* renamed from: u */
    public float m6590u(View view) {
        int left;
        int i9;
        if (this.f7117g == 1) {
            left = view.getTop();
            i9 = this.f7118h;
        } else {
            left = view.getLeft();
            i9 = this.f7118h;
        }
        return left - i9;
    }

    /* renamed from: v */
    public final boolean m6591v(float f10) {
        return f10 > m6588s() || f10 < m6589t();
    }

    /* renamed from: w */
    public final void m6592w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m6593x() {
        return this.f7115e - this.f7113c;
    }

    /* renamed from: y */
    public void m6594y(View view, float f10) {
        float fM6575d = m6575d(this.f7118h + f10);
        view.setScaleX(fM6575d);
        view.setScaleY(fM6575d);
        view.setElevation(0.0f);
        float fM6574c = m6574c(f10);
        if (getOrientation() == 0) {
            view.setRotationY(fM6574c);
        } else {
            view.setRotationX(-fM6574c);
        }
    }

    /* renamed from: z */
    public void m6595z() {
    }
}
