package com.yanzhenjie.recyclerview;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.ExpandableAdapter.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class ExpandableAdapter<VH extends ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public final SparseBooleanArray f8472a = new SparseBooleanArray();

    /* renamed from: b */
    public final List f8473b = new ArrayList();

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
    }

    /* renamed from: com.yanzhenjie.recyclerview.ExpandableAdapter$a */
    public class C7021a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a */
        public final /* synthetic */ GridLayoutManager f8474a;

        /* renamed from: b */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f8475b;

        public C7021a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f8474a = gridLayoutManager;
            this.f8475b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (ExpandableAdapter.this.m7267n(i10)) {
                return this.f8474a.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f8475b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i10);
            }
            return 1;
        }
    }

    /* renamed from: c */
    public abstract void m7256c(ViewHolder viewHolder, int i10, int i11);

    /* renamed from: d */
    public void m7257d(ViewHolder viewHolder, int i10, int i11, List list) {
        m7256c(viewHolder, i10, i11);
    }

    /* renamed from: e */
    public abstract void m7258e(ViewHolder viewHolder, int i10);

    /* renamed from: f */
    public void m7259f(ViewHolder viewHolder, int i10, List list) {
        m7258e(viewHolder, i10);
    }

    /* renamed from: g */
    public final void m7260g(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(String.format(Locale.US, "The value [%d] is reserved, please replace it with other values.", Integer.valueOf(i10)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int iM7272s = m7272s();
        for (int i10 = 0; i10 < iM7272s; i10++) {
            if (m7266m(i10)) {
                iM7272s += m7261h(i10);
            }
        }
        return iM7272s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        int iM7273t = m7273t(i10);
        if (!m7267n(i10)) {
            int iM7263j = m7263j(iM7273t, m7262i(i10));
            m7260g(iM7263j);
            return iM7263j;
        }
        int iM7274u = m7274u(iM7273t);
        m7260g(iM7274u);
        if (!this.f8473b.contains(Integer.valueOf(iM7274u))) {
            this.f8473b.add(Integer.valueOf(iM7274u));
        }
        return iM7274u;
    }

    /* renamed from: h */
    public abstract int m7261h(int i10);

    /* renamed from: i */
    public final int m7262i(int i10) {
        int iM7261h;
        int iM7272s = m7272s();
        int iM7261h2 = 0;
        for (int i11 = 0; i11 < iM7272s; i11++) {
            iM7261h2++;
            if (m7266m(i11) && i10 < (iM7261h2 = iM7261h2 + (iM7261h = m7261h(i11)))) {
                return iM7261h - (iM7261h2 - i10);
            }
        }
        throw new IllegalStateException("The adapter position is invalid: " + i10);
    }

    /* renamed from: j */
    public int m7263j(int i10, int i11) {
        return 2;
    }

    /* renamed from: k */
    public abstract ViewHolder m7264k(ViewGroup viewGroup, int i10);

    /* renamed from: l */
    public abstract ViewHolder m7265l(ViewGroup viewGroup, int i10);

    /* renamed from: m */
    public final boolean m7266m(int i10) {
        return this.f8472a.get(i10, false);
    }

    /* renamed from: n */
    public final boolean m7267n(int i10) {
        int iM7272s = m7272s();
        int iM7261h = 0;
        for (int i11 = 0; i11 < iM7272s; i11++) {
            if (iM7261h == i10) {
                return true;
            }
            iM7261h++;
            if (m7266m(i11)) {
                iM7261h += m7261h(i11);
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(ViewHolder viewHolder, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new C7021a(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(ViewHolder viewHolder, int i10, List list) {
        int iM7273t = m7273t(i10);
        if (m7267n(i10)) {
            m7259f(viewHolder, iM7273t, list);
        } else {
            m7257d(viewHolder, iM7273t, m7262i(i10), list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f8473b.contains(Integer.valueOf(i10)) ? m7265l(viewGroup, i10) : m7264k(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(ViewHolder viewHolder) {
        if (m7267n(viewHolder.getAdapterPosition())) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    /* renamed from: s */
    public abstract int m7272s();

    /* renamed from: t */
    public final int m7273t(int i10) {
        int iM7261h = 0;
        for (int i11 = 0; i11 < m7272s(); i11++) {
            iM7261h++;
            if (m7266m(i11)) {
                iM7261h += m7261h(i11);
            }
            if (i10 < iM7261h) {
                return i11;
            }
        }
        throw new IllegalStateException("The adapter position is not a parent type: " + i10);
    }

    /* renamed from: u */
    public int m7274u(int i10) {
        return 1;
    }
}
