package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    AbstractC0548b mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0547a extends AbstractC0548b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0548b
        public int getSpanIndex(int i4, int i5) {
            return i4 % i5;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0548b
        public int getSpanSize(int i4) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class AbstractC0548b {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 < 0 || i7 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i7);
        }

        int getCachedSpanGroupIndex(int i4, int i5) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i4, i5);
            }
            int i6 = this.mSpanGroupIndexCache.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int spanGroupIndex = getSpanGroupIndex(i4, i5);
            this.mSpanGroupIndexCache.put(i4, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i4, int i5) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i4, i5);
            }
            int i6 = this.mSpanIndexCache.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int spanIndex = getSpanIndex(i4, i5);
            this.mSpanIndexCache.put(i4, spanIndex);
            return spanIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.getSpanSize(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0548b.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0548b.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i4);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z3) {
            if (!z3) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z3;
        }

        public void setSpanIndexCacheEnabled(boolean z3) {
            if (!z3) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z3;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0547a();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.AbstractC0570o.getProperties(context, attributeSet, i4, i5).f3647b);
    }

    private void assignSpans(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4, boolean z3) {
        int i5;
        int i6;
        int i7 = 0;
        int i8 = -1;
        if (z3) {
            i8 = i4;
            i5 = 0;
            i6 = 1;
        } else {
            i5 = i4 - 1;
            i6 = -1;
        }
        while (i5 != i8) {
            View view = this.mSet[i5];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(c0576u, c0580y, getPosition(view));
            layoutParams.f3590f = spanSize;
            layoutParams.f3589e = i7;
            i7 += spanSize;
            i5 += i6;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            int iM3017a = layoutParams.m3017a();
            this.mPreLayoutSpanSizeCache.put(iM3017a, layoutParams.m3000f());
            this.mPreLayoutSpanIndexCache.put(iM3017a, layoutParams.m2999e());
        }
    }

    private void calculateItemBorders(int i4) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i4);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.C0580y c0580y) {
        if (getChildCount() != 0 && c0580y.m3161b() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(c0580y.m3161b() - 1, this.mSpanCount) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo3395d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3398g(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.mo3404m() - this.mOrientationHelper.mo3398g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.C0580y c0580y) {
        if (getChildCount() != 0 && c0580y.m3161b() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(c0580y.m3161b() - 1, this.mSpanCount) + 1;
                }
                int iMo3395d = this.mOrientationHelper.mo3395d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3398g(viewFindFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((iMo3395d / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(c0580y.m3161b() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, LinearLayoutManager.C0550a c0550a, int i4) {
        boolean z3 = i4 == 1;
        int spanIndex = getSpanIndex(c0576u, c0580y, c0550a.f3595b);
        if (z3) {
            while (spanIndex > 0) {
                int i5 = c0550a.f3595b;
                if (i5 <= 0) {
                    return;
                }
                int i6 = i5 - 1;
                c0550a.f3595b = i6;
                spanIndex = getSpanIndex(c0576u, c0580y, i6);
            }
            return;
        }
        int iM3161b = c0580y.m3161b() - 1;
        int i7 = c0550a.f3595b;
        while (i7 < iM3161b) {
            int i8 = i7 + 1;
            int spanIndex2 = getSpanIndex(c0576u, c0580y, i8);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i7 = i8;
            spanIndex = spanIndex2;
        }
        c0550a.f3595b = i7;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4) {
        if (!c0580y.m3164e()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i4, this.mSpanCount);
        }
        int iM3134f = c0576u.m3134f(i4);
        if (iM3134f != -1) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(iM3134f, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    private int getSpanIndex(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4) {
        if (!c0580y.m3164e()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i4, this.mSpanCount);
        }
        int i5 = this.mPreLayoutSpanIndexCache.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int iM3134f = c0576u.m3134f(i4);
        if (iM3134f != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(iM3134f, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    private int getSpanSize(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4) {
        if (!c0580y.m3164e()) {
            return this.mSpanSizeLookup.getSpanSize(i4);
        }
        int i5 = this.mPreLayoutSpanSizeCache.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int iM3134f = c0576u.m3134f(i4);
        if (iM3134f != -1) {
            return this.mSpanSizeLookup.getSpanSize(iM3134f);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    private void guessMeasurement(float f4, int i4) {
        calculateItemBorders(Math.max(Math.round(f4 * this.mSpanCount), i4));
    }

    private void measureChild(View view, int i4, boolean z3) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f3617b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.f3589e, layoutParams.f3590f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC0570o.getChildMeasureSpec(spaceForSpanRange, i4, i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.AbstractC0570o.getChildMeasureSpec(this.mOrientationHelper.mo3405n(), getHeightMode(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC0570o.getChildMeasureSpec(spaceForSpanRange, i4, i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC0570o.getChildMeasureSpec(this.mOrientationHelper.mo3405n(), getWidthMode(), i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z3);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i4, int i5, boolean z3) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z3 ? shouldReMeasureChild(view, i4, i5, layoutParams) : shouldMeasureChild(view, i4, i5, layoutParams)) {
            view.measure(i4, i5);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.C0580y c0580y, LinearLayoutManager.C0552c c0552c, RecyclerView.AbstractC0570o.c cVar) {
        int spanSize = this.mSpanCount;
        for (int i4 = 0; i4 < this.mSpanCount && c0552c.m3014c(c0580y) && spanSize > 0; i4++) {
            int i5 = c0552c.f3606d;
            cVar.mo3096a(i5, Math.max(0, c0552c.f3609g));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i5);
            c0552c.f3606d += c0552c.f3607e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollOffset(RecyclerView.C0580y c0580y) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(c0580y) : super.computeHorizontalScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollRange(RecyclerView.C0580y c0580y) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(c0580y) : super.computeHorizontalScrollRange(c0580y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollOffset(RecyclerView.C0580y c0580y) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(c0580y) : super.computeVerticalScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollRange(RecyclerView.C0580y c0580y) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(c0580y) : super.computeVerticalScrollRange(c0580y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4, int i5, int i6) {
        ensureLayoutState();
        int iMo3404m = this.mOrientationHelper.mo3404m();
        int iMo3400i = this.mOrientationHelper.mo3400i();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            int position = getPosition(childAt);
            if (position >= 0 && position < i6 && getSpanIndex(c0576u, c0580y, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).m3019c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo3398g(childAt) < iMo3400i && this.mOrientationHelper.mo3395d(childAt) >= iMo3404m) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i4 += i7;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int getColumnCountForAccessibility(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (c0580y.m3161b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0576u, c0580y, c0580y.m3161b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int getRowCountForAccessibility(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (c0580y.m3161b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0576u, c0580y, c0580y.m3161b() - 1) + 1;
    }

    int getSpaceForSpanRange(int i4, int i5) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.mCachedBorders;
        int i6 = this.mSpanCount;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public AbstractC0548b getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.C0576u r18, androidx.recyclerview.widget.RecyclerView.C0580y r19, androidx.recyclerview.widget.LinearLayoutManager.C0552c r20, androidx.recyclerview.widget.LinearLayoutManager.C0551b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, LinearLayoutManager.C0550a c0550a, int i4) {
        super.onAnchorReady(c0576u, c0580y, c0550a, i4);
        updateMeasurements();
        if (c0580y.m3161b() > 0 && !c0580y.m3164e()) {
            ensureAnchorIsInCorrectSpan(c0576u, c0580y, c0550a, i4);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0576u r26, androidx.recyclerview.widget.RecyclerView.C0580y r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, View view, C1050c c1050c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1050c);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(c0576u, c0580y, layoutParams2.m3017a());
        if (this.mOrientation == 0) {
            c1050c.m4884f0(C1050c.c.m4923a(layoutParams2.m2999e(), layoutParams2.m3000f(), spanGroupIndex, 1, false, false));
        } else {
            c1050c.m4884f0(C1050c.c.m4923a(spanGroupIndex, 1, layoutParams2.m2999e(), layoutParams2.m3000f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (c0580y.m3164e()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(c0576u, c0580y);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutCompleted(RecyclerView.C0580y c0580y) {
        super.onLayoutCompleted(c0580y);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollHorizontallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollVerticallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i4, i5);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC0570o.chooseSize(i5, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            iChooseSize = RecyclerView.AbstractC0570o.chooseSize(i4, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0570o.chooseSize(i4, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            iChooseSize2 = RecyclerView.AbstractC0570o.chooseSize(i5, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i4) {
        if (i4 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i4 >= 1) {
            this.mSpanCount = i4;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    public void setSpanSizeLookup(AbstractC0548b abstractC0548b) {
        this.mSpanSizeLookup = abstractC0548b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z3) {
        this.mUsingSpansToEstimateScrollBarDimensions = z3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    static int[] calculateItemBorders(int[] iArr, int i4, int i5) {
        int i6;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i4 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i5 / i4;
        int i9 = i5 % i4;
        int i10 = 0;
        for (int i11 = 1; i11 <= i4; i11++) {
            i7 += i9;
            if (i7 <= 0 || i4 - i7 >= i9) {
                i6 = i8;
            } else {
                i6 = i8 + 1;
                i7 -= i4;
            }
            i10 += i6;
            iArr[i11] = i10;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        int f3589e;

        /* renamed from: f */
        int f3590f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3589e = -1;
            this.f3590f = 0;
        }

        /* renamed from: e */
        public int m2999e() {
            return this.f3589e;
        }

        /* renamed from: f */
        public int m3000f() {
            return this.f3590f;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f3589e = -1;
            this.f3590f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3589e = -1;
            this.f3590f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3589e = -1;
            this.f3590f = 0;
        }
    }

    public GridLayoutManager(Context context, int i4) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0547a();
        this.mDecorInsets = new Rect();
        setSpanCount(i4);
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z3) {
        super(context, i5, z3);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0547a();
        this.mDecorInsets = new Rect();
        setSpanCount(i4);
    }
}
