package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.touch.DefaultItemTouchHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p306y2.C10602a;
import p306y2.C10608g;
import p306y2.InterfaceC10604c;
import p306y2.InterfaceC10605d;
import p306y2.InterfaceC10606e;
import p306y2.InterfaceC10609h;
import p317z2.InterfaceC10705b;
import p317z2.InterfaceC10706c;
import p317z2.InterfaceC10707d;

/* loaded from: classes4.dex */
public class SwipeRecyclerView extends RecyclerView {

    /* renamed from: a */
    public int f8500a;

    /* renamed from: b */
    public SwipeMenuLayout f8501b;

    /* renamed from: c */
    public int f8502c;

    /* renamed from: d */
    public int f8503d;

    /* renamed from: e */
    public int f8504e;

    /* renamed from: f */
    public boolean f8505f;

    /* renamed from: g */
    public DefaultItemTouchHelper f8506g;

    /* renamed from: h */
    public InterfaceC10609h f8507h;

    /* renamed from: i */
    public InterfaceC10606e f8508i;

    /* renamed from: j */
    public InterfaceC10604c f8509j;

    /* renamed from: k */
    public InterfaceC10605d f8510k;

    /* renamed from: l */
    public C10602a f8511l;

    /* renamed from: m */
    public boolean f8512m;

    /* renamed from: n */
    public List f8513n;

    /* renamed from: o */
    public RecyclerView.AdapterDataObserver f8514o;

    /* renamed from: p */
    public List f8515p;

    /* renamed from: q */
    public List f8516q;

    /* renamed from: r */
    public int f8517r;

    /* renamed from: s */
    public boolean f8518s;

    /* renamed from: t */
    public boolean f8519t;

    /* renamed from: u */
    public boolean f8520u;

    /* renamed from: v */
    public boolean f8521v;

    /* renamed from: w */
    public boolean f8522w;

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$a */
    public class C7022a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a */
        public final /* synthetic */ GridLayoutManager f8523a;

        /* renamed from: b */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f8524b;

        public C7022a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f8523a = gridLayoutManager;
            this.f8524b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (SwipeRecyclerView.this.f8511l.m19781m(i10) || SwipeRecyclerView.this.f8511l.m19780l(i10)) {
                return this.f8523a.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f8524b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i10 - SwipeRecyclerView.this.getHeaderCount());
            }
            return 1;
        }
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$c */
    public static class C7024c implements InterfaceC10604c {

        /* renamed from: a */
        public SwipeRecyclerView f8527a;

        /* renamed from: b */
        public InterfaceC10604c f8528b;

        public C7024c(SwipeRecyclerView swipeRecyclerView, InterfaceC10604c interfaceC10604c) {
            this.f8527a = swipeRecyclerView;
            this.f8528b = interfaceC10604c;
        }

        @Override // p306y2.InterfaceC10604c
        /* renamed from: a */
        public void mo7302a(View view, int i10) {
            int headerCount = i10 - this.f8527a.getHeaderCount();
            if (headerCount >= 0) {
                this.f8528b.mo7302a(view, headerCount);
            }
        }
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$d */
    public static class C7025d implements InterfaceC10605d {

        /* renamed from: a */
        public SwipeRecyclerView f8529a;

        /* renamed from: b */
        public InterfaceC10605d f8530b;

        public C7025d(SwipeRecyclerView swipeRecyclerView, InterfaceC10605d interfaceC10605d) {
            this.f8529a = swipeRecyclerView;
            this.f8530b = interfaceC10605d;
        }

        @Override // p306y2.InterfaceC10605d
        /* renamed from: a */
        public void mo7303a(View view, int i10) {
            int headerCount = i10 - this.f8529a.getHeaderCount();
            if (headerCount >= 0) {
                this.f8530b.mo7303a(view, headerCount);
            }
        }
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$e */
    public static class C7026e implements InterfaceC10606e {

        /* renamed from: a */
        public SwipeRecyclerView f8531a;

        /* renamed from: b */
        public InterfaceC10606e f8532b;

        public C7026e(SwipeRecyclerView swipeRecyclerView, InterfaceC10606e interfaceC10606e) {
            this.f8531a = swipeRecyclerView;
            this.f8532b = interfaceC10606e;
        }

        @Override // p306y2.InterfaceC10606e
        /* renamed from: a */
        public void mo7304a(C10608g c10608g, int i10) {
            int headerCount = i10 - this.f8531a.getHeaderCount();
            if (headerCount >= 0) {
                this.f8532b.mo7304a(c10608g, headerCount);
            }
        }
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$f */
    public interface InterfaceC7027f {
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$g */
    public interface InterfaceC7028g {
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void m7297c(String str) {
        if (this.f8511l != null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: d */
    public final void m7298d() {
        if (this.f8520u || !this.f8519t || this.f8518s || this.f8521v || !this.f8522w) {
            return;
        }
        this.f8518s = true;
    }

    /* renamed from: e */
    public final View m7299e(View view) {
        if (view instanceof SwipeMenuLayout) {
            return view;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        while (!arrayList.isEmpty()) {
            View view2 = (View) arrayList.remove(0);
            if (view2 instanceof ViewGroup) {
                if (view2 instanceof SwipeMenuLayout) {
                    return view2;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        }
        return view;
    }

    /* renamed from: f */
    public final boolean m7300f(int i10, int i11, boolean z10) {
        int i12 = this.f8503d - i10;
        int i13 = this.f8504e - i11;
        if (Math.abs(i12) > this.f8500a && Math.abs(i12) > Math.abs(i13)) {
            return false;
        }
        if (Math.abs(i13) >= this.f8500a || Math.abs(i12) >= this.f8500a) {
            return z10;
        }
        return false;
    }

    /* renamed from: g */
    public final void m7301g() {
        if (this.f8506g == null) {
            DefaultItemTouchHelper defaultItemTouchHelper = new DefaultItemTouchHelper();
            this.f8506g = defaultItemTouchHelper;
            defaultItemTouchHelper.attachToRecyclerView(this);
        }
    }

    public int getFooterCount() {
        C10602a c10602a = this.f8511l;
        if (c10602a == null) {
            return 0;
        }
        return c10602a.m19776h();
    }

    public int getHeaderCount() {
        C10602a c10602a = this.f8511l;
        if (c10602a == null) {
            return 0;
        }
        return c10602a.m19777i();
    }

    public RecyclerView.Adapter getOriginAdapter() {
        C10602a c10602a = this.f8511l;
        if (c10602a == null) {
            return null;
        }
        return c10602a.m19778j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r1 != 3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yanzhenjie.recyclerview.SwipeRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        this.f8517r = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int itemCount = layoutManager.getItemCount();
            if (itemCount > 0 && itemCount == linearLayoutManager.findLastVisibleItemPosition() + 1) {
                int i12 = this.f8517r;
                if (i12 == 1 || i12 == 2) {
                    m7298d();
                    return;
                }
                return;
            }
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int itemCount2 = layoutManager.getItemCount();
            if (itemCount2 <= 0) {
                return;
            }
            int[] iArrFindLastCompletelyVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(null);
            if (itemCount2 == iArrFindLastCompletelyVisibleItemPositions[iArrFindLastCompletelyVisibleItemPositions.length - 1] + 1) {
                int i13 = this.f8517r;
                if (i13 == 1 || i13 == 2) {
                    m7298d();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SwipeMenuLayout swipeMenuLayout;
        if (motionEvent.getAction() == 2 && (swipeMenuLayout = this.f8501b) != null && swipeMenuLayout.m7283i()) {
            this.f8501b.mo7275a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        C10602a c10602a = this.f8511l;
        if (c10602a != null) {
            c10602a.m19778j().unregisterAdapterDataObserver(this.f8514o);
        }
        if (adapter == null) {
            this.f8511l = null;
        } else {
            adapter.registerAdapterDataObserver(this.f8514o);
            C10602a c10602a2 = new C10602a(getContext(), adapter);
            this.f8511l = c10602a2;
            c10602a2.m19784p(this.f8509j);
            this.f8511l.m19785q(this.f8510k);
            this.f8511l.m19787s(this.f8507h);
            this.f8511l.m19786r(this.f8508i);
            if (this.f8515p.size() > 0) {
                Iterator it = this.f8515p.iterator();
                while (it.hasNext()) {
                    this.f8511l.m19774f((View) it.next());
                }
            }
            if (this.f8516q.size() > 0) {
                Iterator it2 = this.f8516q.iterator();
                while (it2.hasNext()) {
                    this.f8511l.m19773e((View) it2.next());
                }
            }
        }
        super.setAdapter(this.f8511l);
    }

    public void setAutoLoadMore(boolean z10) {
        this.f8519t = z10;
    }

    public void setItemViewSwipeEnabled(boolean z10) {
        m7301g();
        this.f8505f = z10;
        this.f8506g.m7318a(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new C7022a(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
        super.setLayoutManager(layoutManager);
    }

    public void setLoadMoreListener(InterfaceC7027f interfaceC7027f) {
    }

    public void setLoadMoreView(InterfaceC7028g interfaceC7028g) {
    }

    public void setLongPressDragEnabled(boolean z10) {
        m7301g();
        this.f8506g.m7319b(z10);
    }

    public void setOnItemClickListener(InterfaceC10604c interfaceC10604c) {
        if (interfaceC10604c == null) {
            return;
        }
        m7297c("Cannot set item click listener, setAdapter has already been called.");
        this.f8509j = new C7024c(this, interfaceC10604c);
    }

    public void setOnItemLongClickListener(InterfaceC10605d interfaceC10605d) {
        if (interfaceC10605d == null) {
            return;
        }
        m7297c("Cannot set item long click listener, setAdapter has already been called.");
        this.f8510k = new C7025d(this, interfaceC10605d);
    }

    public void setOnItemMenuClickListener(InterfaceC10606e interfaceC10606e) {
        if (interfaceC10606e == null) {
            return;
        }
        m7297c("Cannot set menu item click listener, setAdapter has already been called.");
        this.f8508i = new C7026e(this, interfaceC10606e);
    }

    public void setOnItemMoveListener(InterfaceC10705b interfaceC10705b) {
        m7301g();
        this.f8506g.m7320c(interfaceC10705b);
    }

    public void setOnItemMovementListener(InterfaceC10706c interfaceC10706c) {
        m7301g();
        this.f8506g.m7321d(interfaceC10706c);
    }

    public void setOnItemStateChangedListener(InterfaceC10707d interfaceC10707d) {
        m7301g();
        this.f8506g.m7322e(interfaceC10707d);
    }

    public void setSwipeItemMenuEnabled(boolean z10) {
        this.f8512m = z10;
    }

    public void setSwipeMenuCreator(InterfaceC10609h interfaceC10609h) {
        if (interfaceC10609h == null) {
            return;
        }
        m7297c("Cannot set menu creator, setAdapter has already been called.");
        this.f8507h = interfaceC10609h;
    }

    /* renamed from: com.yanzhenjie.recyclerview.SwipeRecyclerView$b */
    public class C7023b extends RecyclerView.AdapterDataObserver {
        public C7023b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            SwipeRecyclerView.this.f8511l.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            SwipeRecyclerView.this.f8511l.notifyItemRangeChanged(i10 + SwipeRecyclerView.this.getHeaderCount(), i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            SwipeRecyclerView.this.f8511l.notifyItemRangeInserted(i10 + SwipeRecyclerView.this.getHeaderCount(), i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            SwipeRecyclerView.this.f8511l.notifyItemMoved(i10 + SwipeRecyclerView.this.getHeaderCount(), i11 + SwipeRecyclerView.this.getHeaderCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            SwipeRecyclerView.this.f8511l.notifyItemRangeRemoved(i10 + SwipeRecyclerView.this.getHeaderCount(), i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            SwipeRecyclerView.this.f8511l.notifyItemRangeChanged(i10 + SwipeRecyclerView.this.getHeaderCount(), i11, obj);
        }
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8502c = -1;
        this.f8512m = true;
        this.f8513n = new ArrayList();
        this.f8514o = new C7023b();
        this.f8515p = new ArrayList();
        this.f8516q = new ArrayList();
        this.f8517r = -1;
        this.f8518s = false;
        this.f8519t = true;
        this.f8520u = false;
        this.f8521v = true;
        this.f8522w = false;
        this.f8500a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
