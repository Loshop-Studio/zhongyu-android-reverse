package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public abstract class AbstractC0601o extends RecyclerView.AbstractC0572q {

    /* renamed from: a */
    RecyclerView f3885a;

    /* renamed from: b */
    private Scroller f3886b;

    /* renamed from: c */
    private final RecyclerView.AbstractC0574s f3887c = new a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    class a extends RecyclerView.AbstractC0574s {

        /* renamed from: a */
        boolean f3888a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0 && this.f3888a) {
                this.f3888a = false;
                AbstractC0601o.this.m3443h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            if (i4 == 0 && i5 == 0) {
                return;
            }
            this.f3888a = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    class b extends C0593g {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0593g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0593g, androidx.recyclerview.widget.RecyclerView.AbstractC0579x
        protected void onTargetFound(View view, RecyclerView.C0580y c0580y, RecyclerView.AbstractC0579x.a aVar) {
            AbstractC0601o abstractC0601o = AbstractC0601o.this;
            RecyclerView recyclerView = abstractC0601o.f3885a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrMo3383a = abstractC0601o.mo3383a(recyclerView.getLayoutManager(), view);
            int i4 = iArrMo3383a[0];
            int i5 = iArrMo3383a[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3159d(i4, i5, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void destroyCallbacks() {
        this.f3885a.removeOnScrollListener(this.f3887c);
        this.f3885a.setOnFlingListener(null);
    }

    /* renamed from: g */
    private boolean m3440g(RecyclerView.AbstractC0570o abstractC0570o, int i4, int i5) {
        RecyclerView.AbstractC0579x abstractC0579xM3442c;
        int iMo3385f;
        if (!(abstractC0570o instanceof RecyclerView.AbstractC0579x.b) || (abstractC0579xM3442c = m3442c(abstractC0570o)) == null || (iMo3385f = mo3385f(abstractC0570o, i4, i5)) == -1) {
            return false;
        }
        abstractC0579xM3442c.setTargetPosition(iMo3385f);
        abstractC0570o.startSmoothScroll(abstractC0579xM3442c);
        return true;
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.f3885a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3885a.addOnScrollListener(this.f3887c);
        this.f3885a.setOnFlingListener(this);
    }

    /* renamed from: a */
    public abstract int[] mo3383a(RecyclerView.AbstractC0570o abstractC0570o, View view);

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3885a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.f3885a = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.f3886b = new Scroller(this.f3885a.getContext(), new DecelerateInterpolator());
            m3443h();
        }
    }

    /* renamed from: b */
    public int[] m3441b(int i4, int i5) {
        this.f3886b.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f3886b.getFinalX(), this.f3886b.getFinalY()};
    }

    /* renamed from: c */
    protected RecyclerView.AbstractC0579x m3442c(RecyclerView.AbstractC0570o abstractC0570o) {
        return mo3418d(abstractC0570o);
    }

    @Deprecated
    /* renamed from: d */
    protected C0593g mo3418d(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o instanceof RecyclerView.AbstractC0579x.b) {
            return new b(this.f3885a.getContext());
        }
        return null;
    }

    /* renamed from: e */
    public abstract View mo3384e(RecyclerView.AbstractC0570o abstractC0570o);

    /* renamed from: f */
    public abstract int mo3385f(RecyclerView.AbstractC0570o abstractC0570o, int i4, int i5);

    /* renamed from: h */
    void m3443h() {
        RecyclerView.AbstractC0570o layoutManager;
        View viewMo3384e;
        RecyclerView recyclerView = this.f3885a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo3384e = mo3384e(layoutManager)) == null) {
            return;
        }
        int[] iArrMo3383a = mo3383a(layoutManager, viewMo3384e);
        if (iArrMo3383a[0] == 0 && iArrMo3383a[1] == 0) {
            return;
        }
        this.f3885a.smoothScrollBy(iArrMo3383a[0], iArrMo3383a[1]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0572q
    public boolean onFling(int i4, int i5) {
        RecyclerView.AbstractC0570o layoutManager = this.f3885a.getLayoutManager();
        if (layoutManager == null || this.f3885a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3885a.getMinFlingVelocity();
        return (Math.abs(i5) > minFlingVelocity || Math.abs(i4) > minFlingVelocity) && m3440g(layoutManager, i4, i5);
    }
}
