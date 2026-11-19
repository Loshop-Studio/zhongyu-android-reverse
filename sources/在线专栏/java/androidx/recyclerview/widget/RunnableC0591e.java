package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p172y.C3485d;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
final class RunnableC0591e implements Runnable {

    /* renamed from: e */
    static final ThreadLocal<RunnableC0591e> f3849e = new ThreadLocal<>();

    /* renamed from: f */
    static Comparator<c> f3850f = new a();

    /* renamed from: b */
    long f3852b;

    /* renamed from: c */
    long f3853c;

    /* renamed from: a */
    ArrayList<RecyclerView> f3851a = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<c> f3854d = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3862d;
            if ((recyclerView == null) != (cVar2.f3862d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z3 = cVar.f3859a;
            if (z3 != cVar2.f3859a) {
                return z3 ? -1 : 1;
            }
            int i4 = cVar2.f3860b - cVar.f3860b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f3861c - cVar2.f3861c;
            if (i5 != 0) {
                return i5;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    static class b implements RecyclerView.AbstractC0570o.c {

        /* renamed from: a */
        int f3855a;

        /* renamed from: b */
        int f3856b;

        /* renamed from: c */
        int[] f3857c;

        /* renamed from: d */
        int f3858d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o.c
        /* renamed from: a */
        public void mo3096a(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i6 = this.f3858d * 2;
            int[] iArr = this.f3857c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3857c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[i6 * 2];
                this.f3857c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3857c;
            iArr4[i6] = i4;
            iArr4[i6 + 1] = i5;
            this.f3858d++;
        }

        /* renamed from: b */
        void m3370b() {
            int[] iArr = this.f3857c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3858d = 0;
        }

        /* renamed from: c */
        void m3371c(RecyclerView recyclerView, boolean z3) {
            this.f3858d = 0;
            int[] iArr = this.f3857c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0570o abstractC0570o = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC0570o == null || !abstractC0570o.isItemPrefetchEnabled()) {
                return;
            }
            if (z3) {
                if (!recyclerView.mAdapterHelper.m3287p()) {
                    abstractC0570o.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC0570o.collectAdjacentPrefetchPositions(this.f3855a, this.f3856b, recyclerView.mState, this);
            }
            int i4 = this.f3858d;
            if (i4 > abstractC0570o.mPrefetchMaxCountObserved) {
                abstractC0570o.mPrefetchMaxCountObserved = i4;
                abstractC0570o.mPrefetchMaxObservedInInitialPrefetch = z3;
                recyclerView.mRecycler.m3127K();
            }
        }

        /* renamed from: d */
        boolean m3372d(int i4) {
            if (this.f3857c != null) {
                int i5 = this.f3858d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f3857c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m3373e(int i4, int i5) {
            this.f3855a = i4;
            this.f3856b = i5;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    static class c {

        /* renamed from: a */
        public boolean f3859a;

        /* renamed from: b */
        public int f3860b;

        /* renamed from: c */
        public int f3861c;

        /* renamed from: d */
        public RecyclerView f3862d;

        /* renamed from: e */
        public int f3863e;

        c() {
        }

        /* renamed from: a */
        public void m3374a() {
            this.f3859a = false;
            this.f3860b = 0;
            this.f3861c = 0;
            this.f3862d = null;
            this.f3863e = 0;
        }
    }

    RunnableC0591e() {
    }

    /* renamed from: b */
    private void m3359b() {
        c cVar;
        int size = this.f3851a.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = this.f3851a.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m3371c(recyclerView, false);
                i4 += recyclerView.mPrefetchRegistry.f3858d;
            }
        }
        this.f3854d.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = this.f3851a.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f3855a) + Math.abs(bVar.f3856b);
                for (int i8 = 0; i8 < bVar.f3858d * 2; i8 += 2) {
                    if (i6 >= this.f3854d.size()) {
                        cVar = new c();
                        this.f3854d.add(cVar);
                    } else {
                        cVar = this.f3854d.get(i6);
                    }
                    int[] iArr = bVar.f3857c;
                    int i9 = iArr[i8 + 1];
                    cVar.f3859a = i9 <= iAbs;
                    cVar.f3860b = iAbs;
                    cVar.f3861c = i9;
                    cVar.f3862d = recyclerView2;
                    cVar.f3863e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f3854d, f3850f);
    }

    /* renamed from: c */
    private void m3360c(c cVar, long j4) {
        RecyclerView.AbstractC0557b0 abstractC0557b0M3364i = m3364i(cVar.f3862d, cVar.f3863e, cVar.f3859a ? Long.MAX_VALUE : j4);
        if (abstractC0557b0M3364i == null || abstractC0557b0M3364i.mNestedRecyclerView == null || !abstractC0557b0M3364i.isBound() || abstractC0557b0M3364i.isInvalid()) {
            return;
        }
        m3363h(abstractC0557b0M3364i.mNestedRecyclerView.get(), j4);
    }

    /* renamed from: d */
    private void m3361d(long j4) {
        for (int i4 = 0; i4 < this.f3854d.size(); i4++) {
            c cVar = this.f3854d.get(i4);
            if (cVar.f3862d == null) {
                return;
            }
            m3360c(cVar, j4);
            cVar.m3374a();
        }
    }

    /* renamed from: e */
    static boolean m3362e(RecyclerView recyclerView, int i4) {
        int iM3308j = recyclerView.mChildHelper.m3308j();
        for (int i5 = 0; i5 < iM3308j; i5++) {
            RecyclerView.AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m3307i(i5));
            if (childViewHolderInt.mPosition == i4 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m3363h(RecyclerView recyclerView, long j4) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m3308j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.m3371c(recyclerView, true);
        if (bVar.f3858d != 0) {
            try {
                C3485d.m10560a("RV Nested Prefetch");
                recyclerView.mState.m3165f(recyclerView.mAdapter);
                for (int i4 = 0; i4 < bVar.f3858d * 2; i4 += 2) {
                    m3364i(recyclerView, bVar.f3857c[i4], j4);
                }
            } finally {
                C3485d.m10561b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0557b0 m3364i(RecyclerView recyclerView, int i4, long j4) {
        if (m3362e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.C0576u c0576u = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0557b0 abstractC0557b0M3125I = c0576u.m3125I(i4, false, j4);
            if (abstractC0557b0M3125I != null) {
                if (!abstractC0557b0M3125I.isBound() || abstractC0557b0M3125I.isInvalid()) {
                    c0576u.m3130a(abstractC0557b0M3125I, false);
                } else {
                    c0576u.m3119B(abstractC0557b0M3125I.itemView);
                }
            }
            return abstractC0557b0M3125I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m3365a(RecyclerView recyclerView) {
        this.f3851a.add(recyclerView);
    }

    /* renamed from: f */
    void m3366f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow() && this.f3852b == 0) {
            this.f3852b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m3373e(i4, i5);
    }

    /* renamed from: g */
    void m3367g(long j4) {
        m3359b();
        m3361d(j4);
    }

    /* renamed from: j */
    public void m3368j(RecyclerView recyclerView) {
        this.f3851a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C3485d.m10560a("RV Prefetch");
            if (!this.f3851a.isEmpty()) {
                int size = this.f3851a.size();
                long jMax = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = this.f3851a.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m3367g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3853c);
                }
            }
        } finally {
            this.f3852b = 0L;
            C3485d.m10561b();
        }
    }
}
