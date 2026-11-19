package p249t0;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Collections;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p238s0.InterfaceC9966e;

/* renamed from: t0.a */
/* loaded from: classes3.dex */
public class C10085a {

    /* renamed from: k */
    public static final a f20135k = new a(null);

    /* renamed from: a */
    public final BaseQuickAdapter f20136a;

    /* renamed from: b */
    public boolean f20137b;

    /* renamed from: c */
    public boolean f20138c;

    /* renamed from: d */
    public int f20139d;

    /* renamed from: e */
    public ItemTouchHelper f20140e;

    /* renamed from: f */
    public DragAndSwipeCallback f20141f;

    /* renamed from: g */
    public View.OnTouchListener f20142g;

    /* renamed from: h */
    public View.OnLongClickListener f20143h;

    /* renamed from: i */
    public InterfaceC9966e f20144i;

    /* renamed from: j */
    public boolean f20145j;

    /* renamed from: t0.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C10085a(BaseQuickAdapter baseQuickAdapter) {
        AbstractC9133u.m16133g(baseQuickAdapter, "baseQuickAdapter");
        this.f20136a = baseQuickAdapter;
        m18827g();
        this.f20145j = true;
    }

    /* renamed from: a */
    public final void m18821a(RecyclerView recyclerView) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        m18822b().attachToRecyclerView(recyclerView);
    }

    /* renamed from: b */
    public final ItemTouchHelper m18822b() {
        ItemTouchHelper itemTouchHelper = this.f20140e;
        if (itemTouchHelper != null) {
            return itemTouchHelper;
        }
        AbstractC9133u.m16151y("itemTouchHelper");
        return null;
    }

    /* renamed from: c */
    public final DragAndSwipeCallback m18823c() {
        DragAndSwipeCallback dragAndSwipeCallback = this.f20141f;
        if (dragAndSwipeCallback != null) {
            return dragAndSwipeCallback;
        }
        AbstractC9133u.m16151y("itemTouchHelperCallback");
        return null;
    }

    /* renamed from: d */
    public final int m18824d(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - this.f20136a.m3514u();
    }

    /* renamed from: e */
    public boolean m18825e() {
        return this.f20139d != 0;
    }

    /* renamed from: f */
    public final boolean m18826f(int i10) {
        return i10 >= 0 && i10 < this.f20136a.m3509o().size();
    }

    /* renamed from: g */
    public final void m18827g() {
        m18841u(new DragAndSwipeCallback(this));
        m18840t(new ItemTouchHelper(m18823c()));
    }

    /* renamed from: h */
    public final void m18828h(BaseViewHolder holder) {
        View viewFindViewById;
        AbstractC9133u.m16133g(holder, "holder");
        if (this.f20137b && m18825e() && (viewFindViewById = holder.itemView.findViewById(this.f20139d)) != null) {
            viewFindViewById.setTag(R$id.BaseQuickAdapter_viewholder_support, holder);
            if (m18830j()) {
                viewFindViewById.setOnLongClickListener(this.f20143h);
            } else {
                viewFindViewById.setOnTouchListener(this.f20142g);
            }
        }
    }

    /* renamed from: i */
    public final boolean m18829i() {
        return this.f20137b;
    }

    /* renamed from: j */
    public boolean m18830j() {
        return this.f20145j;
    }

    /* renamed from: k */
    public final boolean m18831k() {
        return this.f20138c;
    }

    /* renamed from: l */
    public void m18832l(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        InterfaceC9966e interfaceC9966e = this.f20144i;
        if (interfaceC9966e != null) {
            interfaceC9966e.mo11540a(viewHolder, m18824d(viewHolder));
        }
    }

    /* renamed from: m */
    public void m18833m(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(target, "target");
        int iM18824d = m18824d(source);
        int iM18824d2 = m18824d(target);
        if (m18826f(iM18824d) && m18826f(iM18824d2)) {
            if (iM18824d < iM18824d2) {
                int i10 = iM18824d;
                while (i10 < iM18824d2) {
                    int i11 = i10 + 1;
                    Collections.swap(this.f20136a.m3509o(), i10, i11);
                    i10 = i11;
                }
            } else {
                int i12 = iM18824d2 + 1;
                if (i12 <= iM18824d) {
                    int i13 = iM18824d;
                    while (true) {
                        Collections.swap(this.f20136a.m3509o(), i13, i13 - 1);
                        if (i13 == i12) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                }
            }
            this.f20136a.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        InterfaceC9966e interfaceC9966e = this.f20144i;
        if (interfaceC9966e != null) {
            interfaceC9966e.mo11541b(source, iM18824d, target, iM18824d2);
        }
    }

    /* renamed from: n */
    public void m18834n(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        InterfaceC9966e interfaceC9966e = this.f20144i;
        if (interfaceC9966e != null) {
            interfaceC9966e.mo11542c(viewHolder, m18824d(viewHolder));
        }
    }

    /* renamed from: o */
    public void m18835o(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
    }

    /* renamed from: p */
    public void m18836p(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
    }

    /* renamed from: q */
    public void m18837q(RecyclerView.ViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        int iM18824d = m18824d(viewHolder);
        if (m18826f(iM18824d)) {
            this.f20136a.m3509o().remove(iM18824d);
            this.f20136a.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }

    /* renamed from: s */
    public final void m18839s(boolean z10) {
        this.f20137b = z10;
    }

    /* renamed from: t */
    public final void m18840t(ItemTouchHelper itemTouchHelper) {
        AbstractC9133u.m16133g(itemTouchHelper, "<set-?>");
        this.f20140e = itemTouchHelper;
    }

    /* renamed from: u */
    public final void m18841u(DragAndSwipeCallback dragAndSwipeCallback) {
        AbstractC9133u.m16133g(dragAndSwipeCallback, "<set-?>");
        this.f20141f = dragAndSwipeCallback;
    }

    /* renamed from: v */
    public void m18842v(InterfaceC9966e interfaceC9966e) {
        this.f20144i = interfaceC9966e;
    }

    /* renamed from: r */
    public void m18838r(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f10, float f11, boolean z10) {
    }
}
