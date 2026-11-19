package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public SparseArray f4544a;

    /* renamed from: b */
    public int f4545b;

    /* renamed from: c */
    public int f4546c;

    /* renamed from: d */
    public int f4547d;

    /* renamed from: e */
    public int f4548e;

    /* renamed from: f */
    public int f4549f;

    /* renamed from: g */
    public float f4550g;

    /* renamed from: h */
    public OrientationHelper f4551h;

    /* renamed from: i */
    public boolean f4552i;

    /* renamed from: j */
    public boolean f4553j;

    /* renamed from: k */
    public boolean f4554k;

    /* renamed from: l */
    public int f4555l;

    /* renamed from: m */
    public SavedState f4556m;

    /* renamed from: n */
    public float f4557n;

    /* renamed from: o */
    public boolean f4558o;

    /* renamed from: p */
    public boolean f4559p;

    /* renamed from: q */
    public boolean f4560q;

    /* renamed from: r */
    public int f4561r;

    /* renamed from: s */
    public int f4562s;

    /* renamed from: t */
    public int f4563t;

    /* renamed from: u */
    public Interpolator f4564u;

    /* renamed from: v */
    public int f4565v;

    /* renamed from: w */
    public View f4566w;

    /* renamed from: x */
    public int f4567x;

    /* renamed from: y */
    public float f4568y;

    /* renamed from: z */
    public float f4569z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5864a();

        /* renamed from: a */
        public int f4570a;

        /* renamed from: b */
        public float f4571b;

        /* renamed from: c */
        public boolean f4572c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C5864a implements Parcelable.Creator {
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
            parcel.writeInt(this.f4570a);
            parcel.writeFloat(this.f4571b);
            parcel.writeInt(this.f4572c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f4570a = parcel.readInt();
            this.f4571b = parcel.readFloat();
            this.f4572c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f4570a = savedState.f4570a;
            this.f4571b = savedState.f4571b;
            this.f4572c = savedState.f4572c;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC5865a {
        void onPageSelected(int i6);
    }

    /* renamed from: C */
    private boolean m4448C() {
        return this.f4563t != -1;
    }

    /* renamed from: c */
    private float m4449c(float f6) {
        float fAbs = Math.abs(f6 - ((this.f4551h.getTotalSpace() - this.f4545b) / 2.0f));
        int i6 = this.f4545b;
        return (((this.f4568y - 1.0f) / i6) * (((float) i6) - fAbs > 0.0f ? i6 - fAbs : 0.0f)) + 1.0f;
    }

    /* renamed from: d */
    private int m4450d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f4554k) {
            return (int) this.f4557n;
        }
        return 1;
    }

    /* renamed from: e */
    private int m4451e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f4554k) {
            return !this.f4553j ? m4464g() : (getItemCount() - m4464g()) - 1;
        }
        float fM4454n = m4454n();
        return !this.f4553j ? (int) fM4454n : (int) (((getItemCount() - 1) * this.f4557n) + fM4454n);
    }

    /* renamed from: f */
    private int m4452f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f4554k ? getItemCount() : (int) (getItemCount() * this.f4557n);
    }

    /* renamed from: h */
    private int m4453h() {
        return Math.round(this.f4550g / this.f4557n);
    }

    /* renamed from: n */
    private float m4454n() {
        if (this.f4553j) {
            if (!this.f4559p) {
                return this.f4550g;
            }
            float f6 = this.f4550g;
            if (f6 <= 0.0f) {
                return f6 % (this.f4557n * getItemCount());
            }
            float itemCount = getItemCount();
            float f7 = this.f4557n;
            return (itemCount * (-f7)) + (this.f4550g % (f7 * getItemCount()));
        }
        if (!this.f4559p) {
            return this.f4550g;
        }
        float f8 = this.f4550g;
        if (f8 >= 0.0f) {
            return f8 % (this.f4557n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f9 = this.f4557n;
        return (itemCount2 * f9) + (this.f4550g % (f9 * getItemCount()));
    }

    /* renamed from: q */
    private float m4455q(int i6) {
        return i6 * (this.f4553j ? -this.f4557n : this.f4557n);
    }

    private void resolveShouldLayoutReverse() {
        if (this.f4547d == 0 && getLayoutDirection() == 1) {
            this.f4552i = !this.f4552i;
        }
    }

    /* renamed from: s */
    private void m4456s(RecyclerView.Recycler recycler) {
        int i6;
        int i7;
        int i8;
        detachAndScrapAttachedViews(recycler);
        this.f4544a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM4453h = this.f4553j ? -m4453h() : m4453h();
        int i9 = iM4453h - this.f4561r;
        int i10 = this.f4562s + iM4453h;
        if (m4448C()) {
            int i11 = this.f4563t;
            if (i11 % 2 == 0) {
                i7 = i11 / 2;
                i8 = (iM4453h - i7) + 1;
            } else {
                i7 = (i11 - 1) / 2;
                i8 = iM4453h - i7;
            }
            int i12 = i8;
            i10 = i7 + iM4453h + 1;
            i9 = i12;
        }
        if (!this.f4559p) {
            if (i9 < 0) {
                if (m4448C()) {
                    i10 = this.f4563t;
                }
                i9 = 0;
            }
            if (i10 > itemCount) {
                i10 = itemCount;
            }
        }
        float f6 = Float.MIN_VALUE;
        while (i9 < i10) {
            if (m4448C() || !m4458w(m4455q(i9) - this.f4550g)) {
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
                m4459x(viewForPosition);
                float fM4455q = m4455q(i9) - this.f4550g;
                m4457t(viewForPosition, fM4455q);
                float fM4461B = this.f4560q ? m4461B(viewForPosition, fM4455q) : i6;
                if (fM4461B > f6) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i9 == iM4453h) {
                    this.f4566w = viewForPosition;
                }
                this.f4544a.put(i9, viewForPosition);
                f6 = fM4461B;
            }
            i9++;
        }
        this.f4566w.requestFocus();
    }

    private int scrollBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i6 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f6 = i6;
        float fM4465i = f6 / m4465i();
        if (Math.abs(fM4465i) < 1.0E-8f) {
            return 0;
        }
        float f7 = this.f4550g + fM4465i;
        if (!this.f4559p && f7 < m4468l()) {
            i6 = (int) (f6 - ((f7 - m4468l()) * m4465i()));
        } else if (!this.f4559p && f7 > m4467k()) {
            i6 = (int) ((m4467k() - this.f4550g) * m4465i());
        }
        this.f4550g += i6 / m4465i();
        m4456s(recycler);
        return i6;
    }

    /* renamed from: t */
    private void m4457t(View view, float f6) {
        int iM4462a = m4462a(view, f6);
        int iM4463b = m4463b(view, f6);
        if (this.f4547d == 1) {
            int i6 = this.f4549f;
            int i7 = this.f4548e;
            layoutDecorated(view, i6 + iM4462a, i7 + iM4463b, iM4462a + i6 + this.f4546c, i7 + iM4463b + this.f4545b);
        } else {
            int i8 = this.f4548e;
            int i9 = this.f4549f;
            layoutDecorated(view, i8 + iM4462a, i9 + iM4463b, iM4462a + i8 + this.f4545b, i9 + iM4463b + this.f4546c);
        }
        m4476z(view, f6);
    }

    /* renamed from: w */
    private boolean m4458w(float f6) {
        return f6 > m4473u() || f6 < m4474v();
    }

    /* renamed from: x */
    private void m4459x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: A */
    public void m4460A() {
    }

    /* renamed from: B */
    public float m4461B(View view, float f6) {
        return 0.0f;
    }

    /* renamed from: a */
    public int m4462a(View view, float f6) {
        if (this.f4547d == 1) {
            return 0;
        }
        return (int) f6;
    }

    /* renamed from: b */
    public int m4463b(View view, float f6) {
        if (this.f4547d == 1) {
            return (int) f6;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f4547d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f4547d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m4450d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m4451e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m4452f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m4450d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m4451e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m4452f();
    }

    public void ensureLayoutState() {
        if (this.f4551h == null) {
            this.f4551h = OrientationHelper.createOrientationHelper(this, this.f4547d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i6) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i7 = 0; i7 < this.f4544a.size(); i7++) {
            int iKeyAt = this.f4544a.keyAt(i7);
            if (iKeyAt < 0) {
                int i8 = iKeyAt % itemCount;
                if (i8 == 0) {
                    i8 = -itemCount;
                }
                if (i8 + itemCount == i6) {
                    return (View) this.f4544a.valueAt(i7);
                }
            } else if (i6 == iKeyAt % itemCount) {
                return (View) this.f4544a.valueAt(i7);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m4464g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM4453h = m4453h();
        if (!this.f4559p) {
            return Math.abs(iM4453h);
        }
        int itemCount = !this.f4553j ? iM4453h >= 0 ? iM4453h % getItemCount() : (iM4453h % getItemCount()) + getItemCount() : iM4453h > 0 ? getItemCount() - (iM4453h % getItemCount()) : (-iM4453h) % getItemCount();
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
        return this.f4547d;
    }

    public boolean getReverseLayout() {
        return this.f4552i;
    }

    /* renamed from: i */
    public float m4465i() {
        float f6 = this.f4569z;
        if (f6 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f6;
    }

    /* renamed from: j */
    public boolean m4466j() {
        return this.f4559p;
    }

    /* renamed from: k */
    public float m4467k() {
        if (this.f4553j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f4557n;
    }

    /* renamed from: l */
    public float m4468l() {
        if (this.f4553j) {
            return (-(getItemCount() - 1)) * this.f4557n;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final int m4469m(int i6) {
        boolean z6;
        if (this.f4547d == 1) {
            if (i6 != 33) {
                if (i6 == 130) {
                    return this.f4553j ? 1 : 0;
                }
                return -1;
            }
            z6 = this.f4553j;
        } else {
            if (i6 != 17) {
                if (i6 == 66) {
                    return this.f4553j ? 1 : 0;
                }
                return -1;
            }
            z6 = this.f4553j;
        }
        return !z6;
    }

    /* renamed from: o */
    public int m4470o() {
        float fM4464g;
        float fM4465i;
        if (this.f4559p) {
            fM4464g = (m4453h() * this.f4557n) - this.f4550g;
            fM4465i = m4465i();
        } else {
            fM4464g = (m4464g() * (!this.f4553j ? this.f4557n : -this.f4557n)) - this.f4550g;
            fM4465i = m4465i();
        }
        return (int) (fM4464g * fM4465i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f4550g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i6, int i7) {
        int iM4464g = m4464g();
        View viewFindViewByPosition = findViewByPosition(iM4464g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM4469m = m4469m(i6);
            if (iM4469m != -1) {
                recyclerView.smoothScrollToPosition(iM4469m == 1 ? iM4464g - 1 : iM4464g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i6, i7);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f4558o) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f4550g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f4545b = this.f4551h.getDecoratedMeasurement(viewForPosition);
        this.f4546c = this.f4551h.getDecoratedMeasurementInOther(viewForPosition);
        this.f4548e = (this.f4551h.getTotalSpace() - this.f4545b) / 2;
        if (this.f4565v == Integer.MAX_VALUE) {
            this.f4549f = (m4472r() - this.f4546c) / 2;
        } else {
            this.f4549f = (m4472r() - this.f4546c) - this.f4565v;
        }
        this.f4557n = m4475y();
        m4460A();
        this.f4561r = ((int) Math.abs(m4474v() / this.f4557n)) + 1;
        this.f4562s = ((int) Math.abs(m4473u() / this.f4557n)) + 1;
        SavedState savedState = this.f4556m;
        if (savedState != null) {
            this.f4553j = savedState.f4572c;
            this.f4555l = savedState.f4570a;
            this.f4550g = savedState.f4571b;
        }
        int i6 = this.f4555l;
        if (i6 != -1) {
            this.f4550g = i6 * (this.f4553j ? -this.f4557n : this.f4557n);
        }
        detachAndScrapAttachedViews(recycler);
        m4456s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4556m = null;
        this.f4555l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4556m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f4556m != null) {
            return new SavedState(this.f4556m);
        }
        SavedState savedState = new SavedState();
        savedState.f4570a = this.f4555l;
        savedState.f4571b = this.f4550g;
        savedState.f4572c = this.f4553j;
        return savedState;
    }

    /* renamed from: p */
    public int m4471p(int i6) {
        float fM4453h;
        float fM4465i;
        if (this.f4559p) {
            fM4453h = ((m4453h() + (!this.f4553j ? i6 - m4464g() : m4464g() - i6)) * this.f4557n) - this.f4550g;
            fM4465i = m4465i();
        } else {
            fM4453h = (i6 * (!this.f4553j ? this.f4557n : -this.f4557n)) - this.f4550g;
            fM4465i = m4465i();
        }
        return (int) (fM4453h * fM4465i);
    }

    /* renamed from: r */
    public int m4472r() {
        int width;
        int paddingRight;
        if (this.f4547d == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4547d == 1) {
            return 0;
        }
        return scrollBy(i6, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i6) {
        if (this.f4559p || (i6 >= 0 && i6 < getItemCount())) {
            this.f4555l = i6;
            this.f4550g = i6 * (this.f4553j ? -this.f4557n : this.f4557n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4547d == 0) {
            return 0;
        }
        return scrollBy(i6, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i6) {
        int iM4471p = m4471p(i6);
        if (this.f4547d == 1) {
            recyclerView.smoothScrollBy(0, iM4471p, this.f4564u);
        } else {
            recyclerView.smoothScrollBy(iM4471p, 0, this.f4564u);
        }
    }

    /* renamed from: u */
    public float m4473u() {
        return this.f4551h.getTotalSpace() - this.f4548e;
    }

    /* renamed from: v */
    public float m4474v() {
        return ((-this.f4545b) - this.f4551h.getStartAfterPadding()) - this.f4548e;
    }

    /* renamed from: y */
    public float m4475y() {
        return (this.f4545b * (((this.f4568y - 1.0f) / 2.0f) + 1.0f)) + this.f4567x;
    }

    /* renamed from: z */
    public void m4476z(View view, float f6) {
        float fM4449c = m4449c(f6 + this.f4548e);
        view.setScaleX(fM4449c);
        view.setScaleY(fM4449c);
    }
}
