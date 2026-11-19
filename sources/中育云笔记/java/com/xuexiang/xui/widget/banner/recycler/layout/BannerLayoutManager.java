package com.xuexiang.xui.widget.banner.recycler.layout;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public SparseArray f15410a;

    /* renamed from: b */
    public int f15411b;

    /* renamed from: c */
    public int f15412c;

    /* renamed from: d */
    public int f15413d;

    /* renamed from: e */
    public int f15414e;

    /* renamed from: f */
    public int f15415f;

    /* renamed from: g */
    public float f15416g;

    /* renamed from: h */
    public OrientationHelper f15417h;

    /* renamed from: i */
    public boolean f15418i;

    /* renamed from: j */
    public boolean f15419j;

    /* renamed from: k */
    public boolean f15420k;

    /* renamed from: l */
    public int f15421l;

    /* renamed from: m */
    public SavedState f15422m;

    /* renamed from: n */
    public float f15423n;

    /* renamed from: o */
    public boolean f15424o;

    /* renamed from: p */
    public boolean f15425p;

    /* renamed from: q */
    public boolean f15426q;

    /* renamed from: r */
    public int f15427r;

    /* renamed from: s */
    public int f15428s;

    /* renamed from: t */
    public int f15429t;

    /* renamed from: u */
    public Interpolator f15430u;

    /* renamed from: v */
    public int f15431v;

    /* renamed from: w */
    public View f15432w;

    /* renamed from: x */
    public int f15433x;

    /* renamed from: y */
    public float f15434y;

    /* renamed from: z */
    public float f15435z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8055a();

        /* renamed from: c */
        public int f15436c;

        /* renamed from: d */
        public float f15437d;

        /* renamed from: e */
        public boolean f15438e;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C8055a implements Parcelable.Creator {
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
            parcel.writeInt(this.f15436c);
            parcel.writeFloat(this.f15437d);
            parcel.writeInt(this.f15438e ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f15436c = parcel.readInt();
            this.f15437d = parcel.readFloat();
            this.f15438e = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f15436c = savedState.f15436c;
            this.f15437d = savedState.f15437d;
            this.f15438e = savedState.f15438e;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC8056a {
        void onPageSelected(int i10);
    }

    public BannerLayoutManager(Context context, int i10) {
        this(context, i10, false);
    }

    /* renamed from: I */
    private boolean m12300I() {
        return this.f15429t != -1;
    }

    /* renamed from: c */
    private float m12301c(float f10) {
        float fAbs = Math.abs(f10 - ((this.f15417h.getTotalSpace() - this.f15411b) / 2.0f));
        int i10 = this.f15411b;
        return (((this.f15434y - 1.0f) / i10) * (((float) i10) - fAbs > 0.0f ? i10 - fAbs : 0.0f)) + 1.0f;
    }

    /* renamed from: d */
    private int m12302d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f15420k) {
            return (int) this.f15423n;
        }
        return 1;
    }

    /* renamed from: e */
    private int m12303e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f15420k) {
            return !this.f15419j ? m12322g() : (getItemCount() - m12322g()) - 1;
        }
        float fM12306n = m12306n();
        return !this.f15419j ? (int) fM12306n : (int) (((getItemCount() - 1) * this.f15423n) + fM12306n);
    }

    /* renamed from: f */
    private int m12304f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f15420k ? getItemCount() : (int) (getItemCount() * this.f15423n);
    }

    /* renamed from: h */
    private int m12305h() {
        return Math.round(this.f15416g / this.f15423n);
    }

    /* renamed from: n */
    private float m12306n() {
        if (this.f15419j) {
            if (!this.f15425p) {
                return this.f15416g;
            }
            float f10 = this.f15416g;
            if (f10 <= 0.0f) {
                return f10 % (this.f15423n * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f15423n;
            return (itemCount * (-f11)) + (this.f15416g % (f11 * getItemCount()));
        }
        if (!this.f15425p) {
            return this.f15416g;
        }
        float f12 = this.f15416g;
        if (f12 >= 0.0f) {
            return f12 % (this.f15423n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f15423n;
        return (itemCount2 * f13) + (this.f15416g % (f13 * getItemCount()));
    }

    /* renamed from: q */
    private float m12307q(int i10) {
        return i10 * (this.f15419j ? -this.f15423n : this.f15423n);
    }

    private void resolveShouldLayoutReverse() {
        if (this.f15413d == 0 && getLayoutDirection() == 1) {
            this.f15418i = !this.f15418i;
        }
    }

    /* renamed from: s */
    private void m12308s(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        this.f15410a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM12305h = this.f15419j ? -m12305h() : m12305h();
        int i13 = iM12305h - this.f15427r;
        int i14 = this.f15428s + iM12305h;
        if (m12300I()) {
            int i15 = this.f15429t;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM12305h - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM12305h - i11;
            }
            int i16 = i12;
            i14 = i11 + iM12305h + 1;
            i13 = i16;
        }
        if (!this.f15425p) {
            if (i13 < 0) {
                if (m12300I()) {
                    i14 = this.f15429t;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m12300I() || !m12310w(m12307q(i13) - this.f15416g)) {
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
                m12311x(viewForPosition);
                float fM12307q = m12307q(i13) - this.f15416g;
                m12309t(viewForPosition, fM12307q);
                float fM12319H = this.f15426q ? m12319H(viewForPosition, fM12307q) : i10;
                if (fM12319H > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i13 == iM12305h) {
                    this.f15432w = viewForPosition;
                }
                this.f15410a.put(i13, viewForPosition);
                f10 = fM12319H;
            }
            i13++;
        }
        this.f15432w.requestFocus();
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM12323i = f10 / m12323i();
        if (Math.abs(fM12323i) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f15416g + fM12323i;
        if (!this.f15425p && f11 < m12326l()) {
            i10 = (int) (f10 - ((f11 - m12326l()) * m12323i()));
        } else if (!this.f15425p && f11 > m12325k()) {
            i10 = (int) ((m12325k() - this.f15416g) * m12323i());
        }
        this.f15416g += i10 / m12323i();
        m12308s(recycler);
        return i10;
    }

    /* renamed from: t */
    private void m12309t(View view, float f10) {
        int iM12320a = m12320a(view, f10);
        int iM12321b = m12321b(view, f10);
        if (this.f15413d == 1) {
            int i10 = this.f15415f;
            int i11 = this.f15414e;
            layoutDecorated(view, i10 + iM12320a, i11 + iM12321b, iM12320a + i10 + this.f15412c, i11 + iM12321b + this.f15411b);
        } else {
            int i12 = this.f15414e;
            int i13 = this.f15415f;
            layoutDecorated(view, i12 + iM12320a, i13 + iM12321b, iM12320a + i12 + this.f15411b, i13 + iM12321b + this.f15412c);
        }
        m12315D(view, f10);
    }

    /* renamed from: w */
    private boolean m12310w(float f10) {
        return f10 > m12331u() || f10 < m12332v();
    }

    /* renamed from: x */
    private void m12311x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: A */
    public void m12312A(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.f15425p) {
            return;
        }
        this.f15425p = z10;
        requestLayout();
    }

    /* renamed from: B */
    public float m12313B() {
        return (this.f15411b * (((this.f15434y - 1.0f) / 2.0f) + 1.0f)) + this.f15433x;
    }

    /* renamed from: C */
    public void m12314C(int i10) {
        this.f15433x = i10;
    }

    /* renamed from: D */
    public void m12315D(View view, float f10) {
        float fM12301c = m12301c(f10 + this.f15414e);
        view.setScaleX(fM12301c);
        view.setScaleY(fM12301c);
    }

    /* renamed from: E */
    public void m12316E(int i10) {
        assertNotInLayoutOrScroll(null);
        if (this.f15429t == i10) {
            return;
        }
        this.f15429t = i10;
        removeAllViews();
    }

    /* renamed from: F */
    public void m12317F(float f10) {
        assertNotInLayoutOrScroll(null);
        if (this.f15435z == f10) {
            return;
        }
        this.f15435z = f10;
    }

    /* renamed from: G */
    public void m12318G() {
    }

    /* renamed from: H */
    public float m12319H(View view, float f10) {
        return 0.0f;
    }

    /* renamed from: a */
    public int m12320a(View view, float f10) {
        if (this.f15413d == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m12321b(View view, float f10) {
        if (this.f15413d == 1) {
            return (int) f10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f15413d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f15413d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m12302d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m12303e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m12304f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m12302d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m12303e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m12304f();
    }

    public void ensureLayoutState() {
        if (this.f15417h == null) {
            this.f15417h = OrientationHelper.createOrientationHelper(this, this.f15413d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i10) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i11 = 0; i11 < this.f15410a.size(); i11++) {
            int iKeyAt = this.f15410a.keyAt(i11);
            if (iKeyAt < 0) {
                int i12 = iKeyAt % itemCount;
                if (i12 == 0) {
                    i12 = -itemCount;
                }
                if (i12 + itemCount == i10) {
                    return (View) this.f15410a.valueAt(i11);
                }
            } else if (i10 == iKeyAt % itemCount) {
                return (View) this.f15410a.valueAt(i11);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m12322g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM12305h = m12305h();
        if (!this.f15425p) {
            return Math.abs(iM12305h);
        }
        int itemCount = !this.f15419j ? iM12305h >= 0 ? iM12305h % getItemCount() : (iM12305h % getItemCount()) + getItemCount() : iM12305h > 0 ? getItemCount() - (iM12305h % getItemCount()) : (-iM12305h) % getItemCount();
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
        return this.f15413d;
    }

    public boolean getReverseLayout() {
        return this.f15418i;
    }

    /* renamed from: i */
    public float m12323i() {
        float f10 = this.f15435z;
        if (f10 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f10;
    }

    /* renamed from: j */
    public boolean m12324j() {
        return this.f15425p;
    }

    /* renamed from: k */
    public float m12325k() {
        if (this.f15419j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f15423n;
    }

    /* renamed from: l */
    public float m12326l() {
        if (this.f15419j) {
            return (-(getItemCount() - 1)) * this.f15423n;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final int m12327m(int i10) {
        boolean z10;
        if (this.f15413d == 1) {
            if (i10 != 33) {
                if (i10 == 130) {
                    return this.f15419j ? 1 : 0;
                }
                return -1;
            }
            z10 = this.f15419j;
        } else {
            if (i10 != 17) {
                if (i10 == 66) {
                    return this.f15419j ? 1 : 0;
                }
                return -1;
            }
            z10 = this.f15419j;
        }
        return !z10;
    }

    /* renamed from: o */
    public int m12328o() {
        float fM12322g;
        float fM12323i;
        if (this.f15425p) {
            fM12322g = (m12305h() * this.f15423n) - this.f15416g;
            fM12323i = m12323i();
        } else {
            fM12322g = (m12322g() * (!this.f15419j ? this.f15423n : -this.f15423n)) - this.f15416g;
            fM12323i = m12323i();
        }
        return (int) (fM12322g * fM12323i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f15416g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
        int iM12322g = m12322g();
        View viewFindViewByPosition = findViewByPosition(iM12322g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM12327m = m12327m(i10);
            if (iM12327m != -1) {
                recyclerView.smoothScrollToPosition(iM12327m == 1 ? iM12322g - 1 : iM12322g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i10, i11);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f15424o) {
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
            this.f15416g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f15411b = this.f15417h.getDecoratedMeasurement(viewForPosition);
        this.f15412c = this.f15417h.getDecoratedMeasurementInOther(viewForPosition);
        this.f15414e = (this.f15417h.getTotalSpace() - this.f15411b) / 2;
        if (this.f15431v == Integer.MAX_VALUE) {
            this.f15415f = (m12330r() - this.f15412c) / 2;
        } else {
            this.f15415f = (m12330r() - this.f15412c) - this.f15431v;
        }
        this.f15423n = m12313B();
        m12318G();
        this.f15427r = ((int) Math.abs(m12332v() / this.f15423n)) + 1;
        this.f15428s = ((int) Math.abs(m12331u() / this.f15423n)) + 1;
        SavedState savedState = this.f15422m;
        if (savedState != null) {
            this.f15419j = savedState.f15438e;
            this.f15421l = savedState.f15436c;
            this.f15416g = savedState.f15437d;
        }
        int i10 = this.f15421l;
        if (i10 != -1) {
            this.f15416g = i10 * (this.f15419j ? -this.f15423n : this.f15423n);
        }
        detachAndScrapAttachedViews(recycler);
        m12308s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f15422m = null;
        this.f15421l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f15422m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f15422m != null) {
            return new SavedState(this.f15422m);
        }
        SavedState savedState = new SavedState();
        savedState.f15436c = this.f15421l;
        savedState.f15437d = this.f15416g;
        savedState.f15438e = this.f15419j;
        return savedState;
    }

    /* renamed from: p */
    public int m12329p(int i10) {
        float fM12305h;
        float fM12323i;
        if (this.f15425p) {
            fM12305h = ((m12305h() + (!this.f15419j ? i10 - m12322g() : m12322g() - i10)) * this.f15423n) - this.f15416g;
            fM12323i = m12323i();
        } else {
            fM12305h = (i10 * (!this.f15419j ? this.f15423n : -this.f15423n)) - this.f15416g;
            fM12323i = m12323i();
        }
        return (int) (fM12305h * fM12323i);
    }

    /* renamed from: r */
    public int m12330r() {
        int width;
        int paddingRight;
        if (this.f15413d == 0) {
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
        if (this.f15413d == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        if (this.f15425p || (i10 >= 0 && i10 < getItemCount())) {
            this.f15421l = i10;
            this.f15416g = i10 * (this.f15419j ? -this.f15423n : this.f15423n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f15413d == 0) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f15413d) {
            return;
        }
        this.f15413d = i10;
        this.f15417h = null;
        this.f15431v = Integer.MAX_VALUE;
        removeAllViews();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.f15418i) {
            return;
        }
        this.f15418i = z10;
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        int iM12329p = m12329p(i10);
        if (this.f15413d == 1) {
            recyclerView.smoothScrollBy(0, iM12329p, this.f15430u);
        } else {
            recyclerView.smoothScrollBy(iM12329p, 0, this.f15430u);
        }
    }

    /* renamed from: u */
    public float m12331u() {
        return this.f15417h.getTotalSpace() - this.f15414e;
    }

    /* renamed from: v */
    public float m12332v() {
        return ((-this.f15411b) - this.f15417h.getStartAfterPadding()) - this.f15414e;
    }

    /* renamed from: y */
    public void m12333y(float f10) {
        this.f15434y = f10;
    }

    /* renamed from: z */
    public void m12334z(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.f15426q == z10) {
            return;
        }
        this.f15426q = z10;
        requestLayout();
    }

    public BannerLayoutManager(Context context, int i10, boolean z10) {
        this.f15410a = new SparseArray();
        this.f15418i = false;
        this.f15419j = false;
        this.f15420k = true;
        this.f15421l = -1;
        this.f15422m = null;
        this.f15425p = true;
        this.f15429t = -1;
        this.f15431v = Integer.MAX_VALUE;
        this.f15433x = 20;
        this.f15434y = 1.2f;
        this.f15435z = 1.0f;
        m12334z(true);
        m12316E(3);
        setOrientation(i10);
        setReverseLayout(z10);
        setAutoMeasureEnabled(true);
        setItemPrefetchEnabled(false);
    }
}
