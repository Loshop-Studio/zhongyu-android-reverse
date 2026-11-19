package p285p1;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Collections;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p268o1.InterfaceC10428e;

/* renamed from: p1.a */
/* loaded from: classes3.dex */
public class C10599a {

    /* renamed from: k */
    public static final a f25576k = new a(null);

    /* renamed from: a */
    public final BaseQuickAdapter f25577a;

    /* renamed from: b */
    public boolean f25578b;

    /* renamed from: c */
    public boolean f25579c;

    /* renamed from: d */
    public int f25580d;

    /* renamed from: e */
    public ItemTouchHelper f25581e;

    /* renamed from: f */
    public DragAndSwipeCallback f25582f;

    /* renamed from: g */
    public View.OnTouchListener f25583g;

    /* renamed from: h */
    public View.OnLongClickListener f25584h;

    /* renamed from: i */
    public InterfaceC10428e f25585i;

    /* renamed from: j */
    public boolean f25586j;

    /* renamed from: p1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10599a(BaseQuickAdapter baseQuickAdapter) {
        AbstractC9979u.m20294g(baseQuickAdapter, "baseQuickAdapter");
        this.f25577a = baseQuickAdapter;
        m22427g();
        this.f25586j = true;
    }

    /* renamed from: a */
    public final void m22421a(RecyclerView recyclerView) {
        AbstractC9979u.m20294g(recyclerView, "recyclerView");
        m22422b().attachToRecyclerView(recyclerView);
    }

    /* renamed from: b */
    public final ItemTouchHelper m22422b() {
        ItemTouchHelper itemTouchHelper = this.f25581e;
        if (itemTouchHelper != null) {
            return itemTouchHelper;
        }
        AbstractC9979u.m20312y("itemTouchHelper");
        return null;
    }

    /* renamed from: c */
    public final DragAndSwipeCallback m22423c() {
        DragAndSwipeCallback dragAndSwipeCallback = this.f25582f;
        if (dragAndSwipeCallback != null) {
            return dragAndSwipeCallback;
        }
        AbstractC9979u.m20312y("itemTouchHelperCallback");
        return null;
    }

    /* renamed from: d */
    public final int m22424d(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - this.f25577a.getHeaderLayoutCount();
    }

    /* renamed from: e */
    public boolean m22425e() {
        return this.f25580d != 0;
    }

    /* renamed from: f */
    public final boolean m22426f(int i10) {
        return i10 >= 0 && i10 < this.f25577a.getData().size();
    }

    /* renamed from: g */
    public final void m22427g() {
        m22441u(new DragAndSwipeCallback(this));
        m22440t(new ItemTouchHelper(m22423c()));
    }

    /* renamed from: h */
    public final void m22428h(BaseViewHolder holder) {
        View viewFindViewById;
        AbstractC9979u.m20294g(holder, "holder");
        if (this.f25578b && m22425e() && (viewFindViewById = holder.itemView.findViewById(this.f25580d)) != null) {
            viewFindViewById.setTag(R$id.BaseQuickAdapter_viewholder_support, holder);
            if (m22430j()) {
                viewFindViewById.setOnLongClickListener(this.f25584h);
            } else {
                viewFindViewById.setOnTouchListener(this.f25583g);
            }
        }
    }

    /* renamed from: i */
    public final boolean m22429i() {
        return this.f25578b;
    }

    /* renamed from: j */
    public boolean m22430j() {
        return this.f25586j;
    }

    /* renamed from: k */
    public final boolean m22431k() {
        return this.f25579c;
    }

    /* renamed from: l */
    public void m22432l(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        InterfaceC10428e interfaceC10428e = this.f25585i;
        if (interfaceC10428e != null) {
            interfaceC10428e.mo7473a(viewHolder, m22424d(viewHolder));
        }
    }

    /* renamed from: m */
    public void m22433m(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        int iM22424d = m22424d(source);
        int iM22424d2 = m22424d(target);
        if (m22426f(iM22424d) && m22426f(iM22424d2)) {
            if (iM22424d < iM22424d2) {
                int i10 = iM22424d;
                while (i10 < iM22424d2) {
                    int i11 = i10 + 1;
                    Collections.swap(this.f25577a.getData(), i10, i11);
                    i10 = i11;
                }
            } else {
                int i12 = iM22424d2 + 1;
                if (i12 <= iM22424d) {
                    int i13 = iM22424d;
                    while (true) {
                        Collections.swap(this.f25577a.getData(), i13, i13 - 1);
                        if (i13 == i12) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                }
            }
            this.f25577a.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        InterfaceC10428e interfaceC10428e = this.f25585i;
        if (interfaceC10428e != null) {
            interfaceC10428e.mo7474b(source, iM22424d, target, iM22424d2);
        }
    }

    /* renamed from: n */
    public void m22434n(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        InterfaceC10428e interfaceC10428e = this.f25585i;
        if (interfaceC10428e != null) {
            interfaceC10428e.mo7475c(viewHolder, m22424d(viewHolder));
        }
    }

    /* renamed from: o */
    public void m22435o(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
    }

    /* renamed from: p */
    public void m22436p(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
    }

    /* renamed from: q */
    public void m22437q(RecyclerView.ViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        int iM22424d = m22424d(viewHolder);
        if (m22426f(iM22424d)) {
            this.f25577a.getData().remove(iM22424d);
            this.f25577a.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }

    /* renamed from: s */
    public final void m22439s(boolean z10) {
        this.f25578b = z10;
    }

    /* renamed from: t */
    public final void m22440t(ItemTouchHelper itemTouchHelper) {
        AbstractC9979u.m20294g(itemTouchHelper, "<set-?>");
        this.f25581e = itemTouchHelper;
    }

    /* renamed from: u */
    public final void m22441u(DragAndSwipeCallback dragAndSwipeCallback) {
        AbstractC9979u.m20294g(dragAndSwipeCallback, "<set-?>");
        this.f25582f = dragAndSwipeCallback;
    }

    /* renamed from: v */
    public void m22442v(InterfaceC10428e interfaceC10428e) {
        this.f25585i = interfaceC10428e;
    }

    /* renamed from: r */
    public void m22438r(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f10, float f11, boolean z10) {
    }
}
