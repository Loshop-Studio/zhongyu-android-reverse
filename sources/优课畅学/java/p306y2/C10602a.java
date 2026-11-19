package p306y2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.SwipeMenuLayout;
import com.yanzhenjie.recyclerview.SwipeMenuView;
import com.yanzhenjie.recyclerview.p061x.R$id;
import com.yanzhenjie.recyclerview.p061x.R$layout;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: y2.a */
/* loaded from: classes4.dex */
public class C10602a extends RecyclerView.Adapter {

    /* renamed from: a */
    public SparseArrayCompat f21005a = new SparseArrayCompat();

    /* renamed from: b */
    public SparseArrayCompat f21006b = new SparseArrayCompat();

    /* renamed from: c */
    public RecyclerView.Adapter f21007c;

    /* renamed from: d */
    public LayoutInflater f21008d;

    /* renamed from: e */
    public InterfaceC10609h f21009e;

    /* renamed from: f */
    public InterfaceC10606e f21010f;

    /* renamed from: g */
    public InterfaceC10604c f21011g;

    /* renamed from: h */
    public InterfaceC10605d f21012h;

    /* renamed from: y2.a$a */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f21013a;

        public a(RecyclerView.ViewHolder viewHolder) {
            this.f21013a = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10602a.this.f21011g.mo7302a(view, this.f21013a.getAdapterPosition());
        }
    }

    /* renamed from: y2.a$b */
    public class b implements View.OnLongClickListener {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f21015a;

        public b(RecyclerView.ViewHolder viewHolder) {
            this.f21015a = viewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C10602a.this.f21012h.mo7303a(view, this.f21015a.getAdapterPosition());
            return true;
        }
    }

    /* renamed from: y2.a$c */
    public class c extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a */
        public final /* synthetic */ GridLayoutManager f21017a;

        /* renamed from: b */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f21018b;

        public c(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f21017a = gridLayoutManager;
            this.f21018b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (C10602a.this.m19782n(i10)) {
                return this.f21017a.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f21018b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i10);
            }
            return 1;
        }
    }

    /* renamed from: y2.a$d */
    public static class d extends RecyclerView.ViewHolder {
        public d(View view) {
            super(view);
        }
    }

    public C10602a(Context context, RecyclerView.Adapter adapter) {
        this.f21008d = LayoutInflater.from(context);
        this.f21007c = adapter;
    }

    /* renamed from: e */
    public void m19773e(View view) {
        this.f21006b.put(m19776h() + 200000, view);
    }

    /* renamed from: f */
    public void m19774f(View view) {
        this.f21005a.put(m19777i() + 100000, view);
    }

    /* renamed from: g */
    public final int m19775g() {
        return this.f21007c.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return m19777i() + m19775g() + m19776h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        if (m19782n(i10)) {
            return (-i10) - 1;
        }
        return this.f21007c.getItemId(i10 - m19777i());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return m19781m(i10) ? this.f21005a.keyAt(i10) : m19780l(i10) ? this.f21006b.keyAt((i10 - m19777i()) - m19775g()) : this.f21007c.getItemViewType(i10 - m19777i());
    }

    /* renamed from: h */
    public int m19776h() {
        return this.f21006b.size();
    }

    /* renamed from: i */
    public int m19777i() {
        return this.f21005a.size();
    }

    /* renamed from: j */
    public RecyclerView.Adapter m19778j() {
        return this.f21007c;
    }

    /* renamed from: k */
    public final Class m19779k(Class cls) {
        Class superclass = cls.getSuperclass();
        return (superclass == null || superclass.equals(Object.class)) ? cls : m19779k(superclass);
    }

    /* renamed from: l */
    public boolean m19780l(int i10) {
        return i10 >= m19777i() + m19775g();
    }

    /* renamed from: m */
    public boolean m19781m(int i10) {
        return i10 >= 0 && i10 < m19777i();
    }

    /* renamed from: n */
    public boolean m19782n(int i10) {
        return m19781m(i10) || m19780l(i10);
    }

    /* renamed from: o */
    public boolean m19783o(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof d) {
            return true;
        }
        return m19782n(viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f21007c.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new c(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        View view = (View) this.f21005a.get(i10);
        if (view != null) {
            return new d(view);
        }
        View view2 = (View) this.f21006b.get(i10);
        if (view2 != null) {
            return new d(view2);
        }
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.f21007c.onCreateViewHolder(viewGroup, i10);
        if (this.f21011g != null) {
            viewHolderOnCreateViewHolder.itemView.setOnClickListener(new a(viewHolderOnCreateViewHolder));
        }
        if (this.f21012h != null) {
            viewHolderOnCreateViewHolder.itemView.setOnLongClickListener(new b(viewHolderOnCreateViewHolder));
        }
        if (this.f21009e == null) {
            return viewHolderOnCreateViewHolder;
        }
        View viewInflate = this.f21008d.inflate(R$layout.x_recycler_view_item, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(R$id.swipe_content)).addView(viewHolderOnCreateViewHolder.itemView);
        try {
            Field declaredField = m19779k(viewHolderOnCreateViewHolder.getClass()).getDeclaredField("itemView");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            declaredField.set(viewHolderOnCreateViewHolder, viewInflate);
        } catch (Exception unused) {
        }
        return viewHolderOnCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f21007c.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (m19783o(viewHolder)) {
            return false;
        }
        return this.f21007c.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (!m19783o(viewHolder)) {
            this.f21007c.onViewAttachedToWindow(viewHolder);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (m19783o(viewHolder)) {
            return;
        }
        this.f21007c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (m19783o(viewHolder)) {
            return;
        }
        this.f21007c.onViewRecycled(viewHolder);
    }

    /* renamed from: p */
    public void m19784p(InterfaceC10604c interfaceC10604c) {
        this.f21011g = interfaceC10604c;
    }

    /* renamed from: q */
    public void m19785q(InterfaceC10605d interfaceC10605d) {
        this.f21012h = interfaceC10605d;
    }

    /* renamed from: r */
    public void m19786r(InterfaceC10606e interfaceC10606e) {
        this.f21010f = interfaceC10606e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    /* renamed from: s */
    public void m19787s(InterfaceC10609h interfaceC10609h) {
        this.f21009e = interfaceC10609h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        RecyclerView.ViewHolder viewHolder2;
        if (m19783o(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        int iM19777i = i10 - m19777i();
        if (!(view instanceof SwipeMenuLayout) || this.f21009e == null) {
            viewHolder2 = viewHolder;
        } else {
            SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
            C10607f c10607f = new C10607f(swipeMenuLayout);
            C10607f c10607f2 = new C10607f(swipeMenuLayout);
            this.f21009e.mo11809a(c10607f, c10607f2, iM19777i);
            SwipeMenuView swipeMenuView = (SwipeMenuView) swipeMenuLayout.getChildAt(0);
            if (c10607f.m19791d()) {
                swipeMenuView.setOrientation(c10607f.m19790c());
                viewHolder2 = viewHolder;
                swipeMenuView.m7294b(viewHolder2, c10607f, swipeMenuLayout, 1, this.f21010f);
            } else {
                viewHolder2 = viewHolder;
                if (swipeMenuView.getChildCount() > 0) {
                    swipeMenuView.removeAllViews();
                }
            }
            SwipeMenuView swipeMenuView2 = (SwipeMenuView) swipeMenuLayout.getChildAt(2);
            if (c10607f2.m19791d()) {
                swipeMenuView2.setOrientation(c10607f2.m19790c());
                swipeMenuView2.m7294b(viewHolder2, c10607f2, swipeMenuLayout, -1, this.f21010f);
            } else if (swipeMenuView2.getChildCount() > 0) {
                swipeMenuView2.removeAllViews();
            }
        }
        this.f21007c.onBindViewHolder(viewHolder2, iM19777i, list);
    }
}
