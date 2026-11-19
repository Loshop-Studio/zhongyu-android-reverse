package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public SparseArray f7145a;

    /* renamed from: b */
    public int f7146b;

    /* renamed from: c */
    public int f7147c;

    /* renamed from: d */
    public int f7148d;

    /* renamed from: e */
    public int f7149e;

    /* renamed from: f */
    public int f7150f;

    /* renamed from: g */
    public float f7151g;

    /* renamed from: h */
    public OrientationHelper f7152h;

    /* renamed from: i */
    public boolean f7153i;

    /* renamed from: j */
    public boolean f7154j;

    /* renamed from: k */
    public boolean f7155k;

    /* renamed from: l */
    public int f7156l;

    /* renamed from: m */
    public SavedState f7157m;

    /* renamed from: n */
    public float f7158n;

    /* renamed from: o */
    public boolean f7159o;

    /* renamed from: p */
    public boolean f7160p;

    /* renamed from: q */
    public boolean f7161q;

    /* renamed from: r */
    public int f7162r;

    /* renamed from: s */
    public int f7163s;

    /* renamed from: t */
    public int f7164t;

    /* renamed from: u */
    public Interpolator f7165u;

    /* renamed from: v */
    public int f7166v;

    /* renamed from: w */
    public View f7167w;

    /* renamed from: x */
    public int f7168x;

    /* renamed from: y */
    public float f7169y;

    /* renamed from: z */
    public float f7170z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6885a();

        /* renamed from: a */
        public int f7171a;

        /* renamed from: b */
        public float f7172b;

        /* renamed from: c */
        public boolean f7173c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C6885a implements Parcelable.Creator {
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
            parcel.writeInt(this.f7171a);
            parcel.writeFloat(this.f7172b);
            parcel.writeInt(this.f7173c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f7171a = parcel.readInt();
            this.f7172b = parcel.readFloat();
            this.f7173c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f7171a = savedState.f7171a;
            this.f7172b = savedState.f7172b;
            this.f7173c = savedState.f7173c;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC6886a {
        void onPageSelected(int i10);
    }

    /* renamed from: C */
    private boolean m6559C() {
        return this.f7164t != -1;
    }

    /* renamed from: c */
    private float m6560c(float f10) {
        float fAbs = Math.abs(f10 - ((this.f7152h.getTotalSpace() - this.f7146b) / 2.0f));
        int i10 = this.f7146b;
        return (((this.f7169y - 1.0f) / i10) * (((float) i10) - fAbs > 0.0f ? i10 - fAbs : 0.0f)) + 1.0f;
    }

    /* renamed from: d */
    private int m6561d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f7155k) {
            return (int) this.f7158n;
        }
        return 1;
    }

    /* renamed from: e */
    private int m6562e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f7155k) {
            return !this.f7154j ? m6575g() : (getItemCount() - m6575g()) - 1;
        }
        float fM6565n = m6565n();
        return !this.f7154j ? (int) fM6565n : (int) (((getItemCount() - 1) * this.f7158n) + fM6565n);
    }

    /* renamed from: f */
    private int m6563f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f7155k ? getItemCount() : (int) (getItemCount() * this.f7158n);
    }

    /* renamed from: h */
    private int m6564h() {
        return Math.round(this.f7151g / this.f7158n);
    }

    /* renamed from: n */
    private float m6565n() {
        if (this.f7154j) {
            if (!this.f7160p) {
                return this.f7151g;
            }
            float f10 = this.f7151g;
            if (f10 <= 0.0f) {
                return f10 % (this.f7158n * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f7158n;
            return (itemCount * (-f11)) + (this.f7151g % (f11 * getItemCount()));
        }
        if (!this.f7160p) {
            return this.f7151g;
        }
        float f12 = this.f7151g;
        if (f12 >= 0.0f) {
            return f12 % (this.f7158n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f7158n;
        return (itemCount2 * f13) + (this.f7151g % (f13 * getItemCount()));
    }

    /* renamed from: q */
    private float m6566q(int i10) {
        return i10 * (this.f7154j ? -this.f7158n : this.f7158n);
    }

    private void resolveShouldLayoutReverse() {
        if (this.f7148d == 0 && getLayoutDirection() == 1) {
            this.f7153i = !this.f7153i;
        }
    }

    /* renamed from: s */
    private void m6567s(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        this.f7145a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM6564h = this.f7154j ? -m6564h() : m6564h();
        int i13 = iM6564h - this.f7162r;
        int i14 = this.f7163s + iM6564h;
        if (m6559C()) {
            int i15 = this.f7164t;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM6564h - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM6564h - i11;
            }
            int i16 = i12;
            i14 = i11 + iM6564h + 1;
            i13 = i16;
        }
        if (!this.f7160p) {
            if (i13 < 0) {
                if (m6559C()) {
                    i14 = this.f7164t;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m6559C() || !m6569w(m6566q(i13) - this.f7151g)) {
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
                m6570x(viewForPosition);
                float fM6566q = m6566q(i13) - this.f7151g;
                m6568t(viewForPosition, fM6566q);
                float fM6572B = this.f7161q ? m6572B(viewForPosition, fM6566q) : i10;
                if (fM6572B > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i13 == iM6564h) {
                    this.f7167w = viewForPosition;
                }
                this.f7145a.put(i13, viewForPosition);
                f10 = fM6572B;
            }
            i13++;
        }
        this.f7167w.requestFocus();
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM6576i = f10 / m6576i();
        if (Math.abs(fM6576i) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f7151g + fM6576i;
        if (!this.f7160p && f11 < m6579l()) {
            i10 = (int) (f10 - ((f11 - m6579l()) * m6576i()));
        } else if (!this.f7160p && f11 > m6578k()) {
            i10 = (int) ((m6578k() - this.f7151g) * m6576i());
        }
        this.f7151g += i10 / m6576i();
        m6567s(recycler);
        return i10;
    }

    /* renamed from: t */
    private void m6568t(View view, float f10) {
        int iM6573a = m6573a(view, f10);
        int iM6574b = m6574b(view, f10);
        if (this.f7148d == 1) {
            int i10 = this.f7150f;
            int i11 = this.f7149e;
            layoutDecorated(view, i10 + iM6573a, i11 + iM6574b, iM6573a + i10 + this.f7147c, i11 + iM6574b + this.f7146b);
        } else {
            int i12 = this.f7149e;
            int i13 = this.f7150f;
            layoutDecorated(view, i12 + iM6573a, i13 + iM6574b, iM6573a + i12 + this.f7146b, i13 + iM6574b + this.f7147c);
        }
        m6587z(view, f10);
    }

    /* renamed from: w */
    private boolean m6569w(float f10) {
        return f10 > m6584u() || f10 < m6585v();
    }

    /* renamed from: x */
    private void m6570x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: A */
    public void m6571A() {
    }

    /* renamed from: B */
    public float m6572B(View view, float f10) {
        return 0.0f;
    }

    /* renamed from: a */
    public int m6573a(View view, float f10) {
        if (this.f7148d == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m6574b(View view, float f10) {
        if (this.f7148d == 1) {
            return (int) f10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f7148d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f7148d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m6561d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m6562e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m6563f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m6561d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m6562e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m6563f();
    }

    public void ensureLayoutState() {
        if (this.f7152h == null) {
            this.f7152h = OrientationHelper.createOrientationHelper(this, this.f7148d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i10) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i11 = 0; i11 < this.f7145a.size(); i11++) {
            int iKeyAt = this.f7145a.keyAt(i11);
            if (iKeyAt < 0) {
                int i12 = iKeyAt % itemCount;
                if (i12 == 0) {
                    i12 = -itemCount;
                }
                if (i12 + itemCount == i10) {
                    return (View) this.f7145a.valueAt(i11);
                }
            } else if (i10 == iKeyAt % itemCount) {
                return (View) this.f7145a.valueAt(i11);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m6575g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM6564h = m6564h();
        if (!this.f7160p) {
            return Math.abs(iM6564h);
        }
        int itemCount = !this.f7154j ? iM6564h >= 0 ? iM6564h % getItemCount() : (iM6564h % getItemCount()) + getItemCount() : iM6564h > 0 ? getItemCount() - (iM6564h % getItemCount()) : (-iM6564h) % getItemCount();
        if (itemCount == getItemCount()) {
            return 0;
        }
        return itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f7148d;
    }

    public boolean getReverseLayout() {
        return this.f7153i;
    }

    /* renamed from: i */
    public float m6576i() {
        float f10 = this.f7170z;
        if (f10 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f10;
    }

    /* renamed from: j */
    public boolean m6577j() {
        return this.f7160p;
    }

    /* renamed from: k */
    public float m6578k() {
        if (this.f7154j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f7158n;
    }

    /* renamed from: l */
    public float m6579l() {
        if (this.f7154j) {
            return (-(getItemCount() - 1)) * this.f7158n;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final int m6580m(int i10) {
        boolean z10;
        if (this.f7148d == 1) {
            if (i10 != 33) {
                if (i10 == 130) {
                    return this.f7154j ? 1 : 0;
                }
                return -1;
            }
            z10 = this.f7154j;
        } else {
            if (i10 != 17) {
                if (i10 == 66) {
                    return this.f7154j ? 1 : 0;
                }
                return -1;
            }
            z10 = this.f7154j;
        }
        return !z10;
    }

    /* renamed from: o */
    public int m6581o() {
        float fM6575g;
        float fM6576i;
        if (this.f7160p) {
            fM6575g = (m6564h() * this.f7158n) - this.f7151g;
            fM6576i = m6576i();
        } else {
            fM6575g = (m6575g() * (!this.f7154j ? this.f7158n : -this.f7158n)) - this.f7151g;
            fM6576i = m6576i();
        }
        return (int) (fM6575g * fM6576i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f7151g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
        int iM6575g = m6575g();
        View viewFindViewByPosition = findViewByPosition(iM6575g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM6580m = m6580m(i10);
            if (iM6580m != -1) {
                recyclerView.smoothScrollToPosition(iM6580m == 1 ? iM6575g - 1 : iM6575g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i10, i11);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f7159o) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f7151g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f7146b = this.f7152h.getDecoratedMeasurement(viewForPosition);
        this.f7147c = this.f7152h.getDecoratedMeasurementInOther(viewForPosition);
        this.f7149e = (this.f7152h.getTotalSpace() - this.f7146b) / 2;
        if (this.f7166v == Integer.MAX_VALUE) {
            this.f7150f = (m6583r() - this.f7147c) / 2;
        } else {
            this.f7150f = (m6583r() - this.f7147c) - this.f7166v;
        }
        this.f7158n = m6586y();
        m6571A();
        this.f7162r = ((int) Math.abs(m6585v() / this.f7158n)) + 1;
        this.f7163s = ((int) Math.abs(m6584u() / this.f7158n)) + 1;
        SavedState savedState = this.f7157m;
        if (savedState != null) {
            this.f7154j = savedState.f7173c;
            this.f7156l = savedState.f7171a;
            this.f7151g = savedState.f7172b;
        }
        int i10 = this.f7156l;
        if (i10 != -1) {
            this.f7151g = i10 * (this.f7154j ? -this.f7158n : this.f7158n);
        }
        detachAndScrapAttachedViews(recycler);
        m6567s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f7157m = null;
        this.f7156l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7157m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f7157m != null) {
            return new SavedState(this.f7157m);
        }
        SavedState savedState = new SavedState();
        savedState.f7171a = this.f7156l;
        savedState.f7172b = this.f7151g;
        savedState.f7173c = this.f7154j;
        return savedState;
    }

    /* renamed from: p */
    public int m6582p(int i10) {
        float fM6564h;
        float fM6576i;
        if (this.f7160p) {
            fM6564h = ((m6564h() + (!this.f7154j ? i10 - m6575g() : m6575g() - i10)) * this.f7158n) - this.f7151g;
            fM6576i = m6576i();
        } else {
            fM6564h = (i10 * (!this.f7154j ? this.f7158n : -this.f7158n)) - this.f7151g;
            fM6576i = m6576i();
        }
        return (int) (fM6564h * fM6576i);
    }

    /* renamed from: r */
    public int m6583r() {
        int width;
        int paddingRight;
        if (this.f7148d == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7148d == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        if (this.f7160p || (i10 >= 0 && i10 < getItemCount())) {
            this.f7156l = i10;
            this.f7151g = i10 * (this.f7154j ? -this.f7158n : this.f7158n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7148d == 0) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        int iM6582p = m6582p(i10);
        if (this.f7148d == 1) {
            recyclerView.smoothScrollBy(0, iM6582p, this.f7165u);
        } else {
            recyclerView.smoothScrollBy(iM6582p, 0, this.f7165u);
        }
    }

    /* renamed from: u */
    public float m6584u() {
        return this.f7152h.getTotalSpace() - this.f7149e;
    }

    /* renamed from: v */
    public float m6585v() {
        return ((-this.f7146b) - this.f7152h.getStartAfterPadding()) - this.f7149e;
    }

    /* renamed from: y */
    public float m6586y() {
        return (this.f7146b * (((this.f7169y - 1.0f) / 2.0f) + 1.0f)) + this.f7168x;
    }

    /* renamed from: z */
    public void m6587z(View view, float f10) {
        float fM6560c = m6560c(f10 + this.f7149e);
        view.setScaleX(fM6560c);
        view.setScaleY(fM6560c);
    }
}
