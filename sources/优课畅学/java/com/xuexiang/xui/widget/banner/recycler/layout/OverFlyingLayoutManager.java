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
    public float f7181a;

    /* renamed from: b */
    public float f7182b;

    /* renamed from: c */
    public int f7183c;

    /* renamed from: d */
    public boolean f7184d;

    /* renamed from: e */
    public int f7185e;

    /* renamed from: f */
    public int f7186f;

    /* renamed from: g */
    public int f7187g;

    /* renamed from: h */
    public int f7188h;

    /* renamed from: i */
    public int f7189i;

    /* renamed from: j */
    public float f7190j;

    /* renamed from: k */
    public OrientationHelper f7191k;

    /* renamed from: l */
    public boolean f7192l;

    /* renamed from: m */
    public boolean f7193m;

    /* renamed from: n */
    public int f7194n;

    /* renamed from: o */
    public SavedState f7195o;

    /* renamed from: p */
    public float f7196p;

    /* renamed from: q */
    public boolean f7197q;

    /* renamed from: r */
    public boolean f7198r;

    /* renamed from: s */
    public boolean f7199s;

    /* renamed from: t */
    public int f7200t;

    /* renamed from: u */
    public int f7201u;

    /* renamed from: v */
    public int f7202v;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6888a();

        /* renamed from: a */
        public int f7203a;

        /* renamed from: b */
        public float f7204b;

        /* renamed from: c */
        public boolean f7205c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager$SavedState$a */
        public static class C6888a implements Parcelable.Creator {
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
            parcel.writeInt(this.f7203a);
            parcel.writeFloat(this.f7204b);
            parcel.writeInt(this.f7205c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f7203a = parcel.readInt();
            this.f7204b = parcel.readFloat();
            this.f7205c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f7203a = savedState.f7203a;
            this.f7204b = savedState.f7204b;
            this.f7205c = savedState.f7205c;
        }
    }

    /* renamed from: k */
    private float m6593k() {
        if (this.f7192l) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f7196p;
    }

    /* renamed from: l */
    private float m6594l() {
        if (this.f7192l) {
            return (-(getItemCount() - 1)) * this.f7196p;
        }
        return 0.0f;
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM6606j = f10 / m6606j();
        if (Math.abs(fM6606j) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f7190j + fM6606j;
        if (!this.f7184d && f11 < m6594l()) {
            i10 = (int) (f10 - ((f11 - m6594l()) * m6606j()));
        } else if (!this.f7184d && f11 > m6593k()) {
            i10 = (int) ((m6593k() - this.f7190j) * m6606j());
        }
        float fM6606j2 = this.f7199s ? (int) (i10 / m6606j()) : i10 / m6606j();
        this.f7190j += fM6606j2;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            m6612r(childAt, m6615u(childAt) - fM6606j2);
        }
        m6611q(recycler);
        return i10;
    }

    /* renamed from: A */
    public float m6595A(View view, float f10) {
        return view.getScaleX() * 5.0f;
    }

    /* renamed from: B */
    public final boolean m6596B() {
        return this.f7202v != -1;
    }

    /* renamed from: a */
    public int m6597a(View view, float f10) {
        if (this.f7187g == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m6598b(View view, float f10) {
        if (this.f7187g == 1) {
            return (int) f10;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m6599c(float f10) {
        return ((-this.f7182b) / this.f7196p) * f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f7187g == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f7187g == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m6601e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m6602f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m6603g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        float fM6606j = ((i10 < getPosition(getChildAt(0))) == (this.f7192l ^ true) ? -1.0f : 1.0f) / m6606j();
        return this.f7187g == 0 ? new PointF(fM6606j, 0.0f) : new PointF(0.0f, fM6606j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m6601e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m6602f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m6603g();
    }

    /* renamed from: d */
    public final float m6600d(float f10) {
        return (((this.f7181a - 1.0f) * Math.abs(f10 - ((this.f7191k.getTotalSpace() - this.f7185e) / 2.0f))) / (this.f7191k.getTotalSpace() / 2.0f)) + 1.0f;
    }

    /* renamed from: e */
    public final int m6601e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f7193m) {
            return (int) this.f7196p;
        }
        return 1;
    }

    public void ensureLayoutState() {
        if (this.f7191k == null) {
            this.f7191k = OrientationHelper.createOrientationHelper(this, this.f7187g);
        }
    }

    /* renamed from: f */
    public final int m6602f() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f7193m) {
            return !this.f7192l ? m6604h() : (getItemCount() - m6604h()) - 1;
        }
        float fM6607m = m6607m();
        return !this.f7192l ? (int) fM6607m : (int) (((getItemCount() - 1) * this.f7196p) + fM6607m);
    }

    /* renamed from: g */
    public final int m6603g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f7193m ? getItemCount() : (int) (getItemCount() * this.f7196p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f7187g;
    }

    /* renamed from: h */
    public int m6604h() {
        int iM6605i = m6605i();
        return !this.f7184d ? Math.abs(iM6605i) : !this.f7192l ? iM6605i >= 0 ? iM6605i % getItemCount() : getItemCount() + (iM6605i % getItemCount()) : iM6605i > 0 ? getItemCount() - (iM6605i % getItemCount()) : (-iM6605i) % getItemCount();
    }

    /* renamed from: i */
    public final int m6605i() {
        return Math.round(this.f7190j / this.f7196p);
    }

    /* renamed from: j */
    public float m6606j() {
        return 1.0f;
    }

    /* renamed from: m */
    public final float m6607m() {
        if (this.f7192l) {
            if (!this.f7184d) {
                return this.f7190j;
            }
            float f10 = this.f7190j;
            if (f10 <= 0.0f) {
                return f10 % (this.f7196p * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f7196p;
            return (itemCount * (-f11)) + (this.f7190j % (f11 * getItemCount()));
        }
        if (!this.f7184d) {
            return this.f7190j;
        }
        float f12 = this.f7190j;
        if (f12 >= 0.0f) {
            return f12 % (this.f7196p * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f7196p;
        return (itemCount2 * f13) + (this.f7190j % (f13 * getItemCount()));
    }

    /* renamed from: n */
    public int m6608n() {
        float fM6604h;
        float fM6606j;
        if (this.f7184d) {
            fM6604h = (m6605i() * this.f7196p) - this.f7190j;
            fM6606j = m6606j();
        } else {
            fM6604h = (m6604h() * (!this.f7192l ? this.f7196p : -this.f7196p)) - this.f7190j;
            fM6606j = m6606j();
        }
        return (int) (fM6604h * fM6606j);
    }

    /* renamed from: o */
    public final float m6609o(int i10) {
        return i10 * (this.f7192l ? -this.f7196p : this.f7196p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f7190j = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f7197q) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f7190j = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f7185e = this.f7191k.getDecoratedMeasurement(viewForPosition);
        this.f7186f = this.f7191k.getDecoratedMeasurementInOther(viewForPosition);
        this.f7188h = (this.f7191k.getTotalSpace() - this.f7185e) / 2;
        this.f7189i = (m6610p() - this.f7186f) / 2;
        this.f7196p = m6618x();
        m6620z();
        this.f7200t = ((int) Math.abs(m6614t() / this.f7196p)) + 1;
        this.f7201u = ((int) Math.abs(m6613s() / this.f7196p)) + 1;
        SavedState savedState = this.f7195o;
        if (savedState != null) {
            this.f7192l = savedState.f7205c;
            this.f7194n = savedState.f7203a;
            this.f7190j = savedState.f7204b;
        }
        int i10 = this.f7194n;
        if (i10 != -1) {
            this.f7190j = i10 * (this.f7192l ? -this.f7196p : this.f7196p);
        }
        detachAndScrapAttachedViews(recycler);
        m6611q(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f7195o = null;
        this.f7194n = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7195o = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f7195o != null) {
            return new SavedState(this.f7195o);
        }
        SavedState savedState = new SavedState();
        savedState.f7203a = this.f7194n;
        savedState.f7204b = this.f7190j;
        savedState.f7205c = this.f7192l;
        return savedState;
    }

    /* renamed from: p */
    public int m6610p() {
        int width;
        int paddingRight;
        if (this.f7187g == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    /* renamed from: q */
    public final void m6611q(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        int iM6605i = this.f7192l ? -m6605i() : m6605i();
        int i13 = iM6605i - this.f7200t;
        int i14 = this.f7201u + iM6605i;
        if (m6596B()) {
            int i15 = this.f7202v;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM6605i - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM6605i - i11;
            }
            int i16 = iM6605i + i11 + 1;
            i13 = i12;
            i14 = i16;
        }
        int itemCount = getItemCount();
        if (!this.f7184d) {
            if (i13 < 0) {
                if (m6596B()) {
                    i14 = this.f7202v;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m6596B() || !m6616v(m6609o(i13) - this.f7190j)) {
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
                m6617w(viewForPosition);
                float fM6609o = m6609o(i13) - this.f7190j;
                m6612r(viewForPosition, fM6609o);
                float fM6595A = this.f7198r ? m6595A(viewForPosition, fM6609o) : i10;
                if (fM6595A > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                f10 = fM6595A;
            }
            i13++;
        }
    }

    /* renamed from: r */
    public final void m6612r(View view, float f10) {
        int iM6597a = m6597a(view, f10);
        int iM6598b = m6598b(view, f10);
        if (this.f7187g == 1) {
            int i10 = this.f7189i;
            int i11 = this.f7188h;
            layoutDecorated(view, i10 + iM6597a, i11 + iM6598b, iM6597a + i10 + this.f7186f, i11 + iM6598b + this.f7185e);
        } else {
            int i12 = this.f7188h;
            int i13 = this.f7189i;
            layoutDecorated(view, i12 + iM6597a, i13 + iM6598b, iM6597a + i12 + this.f7185e, i13 + iM6598b + this.f7186f);
        }
        m6619y(view, f10);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f7187g == 0 && getLayoutDirection() == 1) {
            this.f7192l = !this.f7192l;
        }
    }

    /* renamed from: s */
    public float m6613s() {
        return this.f7191k.getTotalSpace() - this.f7188h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7187g == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f7194n = i10;
        this.f7190j = i10 * (this.f7192l ? -this.f7196p : this.f7196p);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7187g == 0) {
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
    public float m6614t() {
        return ((-this.f7185e) - this.f7191k.getStartAfterPadding()) - this.f7188h;
    }

    /* renamed from: u */
    public float m6615u(View view) {
        int left;
        int i10;
        if (this.f7187g == 1) {
            left = view.getTop();
            i10 = this.f7188h;
        } else {
            left = view.getLeft();
            i10 = this.f7188h;
        }
        return left - i10;
    }

    /* renamed from: v */
    public final boolean m6616v(float f10) {
        return f10 > m6613s() || f10 < m6614t();
    }

    /* renamed from: w */
    public final void m6617w(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: x */
    public float m6618x() {
        return this.f7185e - this.f7183c;
    }

    /* renamed from: y */
    public void m6619y(View view, float f10) {
        float fM6600d = m6600d(this.f7188h + f10);
        view.setScaleX(fM6600d);
        view.setScaleY(fM6600d);
        view.setElevation(0.0f);
        float fM6599c = m6599c(f10);
        if (getOrientation() == 0) {
            view.setRotationY(fM6599c);
        } else {
            view.setRotationX(-fM6599c);
        }
    }

    /* renamed from: z */
    public void m6620z() {
    }
}
