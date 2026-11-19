package com.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.blankj.utilcode.util.AbstractC5379p;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p183n0.AbstractC9360a;

/* loaded from: classes3.dex */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {

    /* renamed from: v */
    public final HashMap f3631v;

    /* renamed from: w */
    public final HashMap f3632w;

    /* renamed from: x */
    public final SparseArray f3633x;

    /* renamed from: com.chad.library.adapter.base.BaseBinderAdapter$a */
    public final class C5488a extends DiffUtil.ItemCallback {
        public C5488a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            if (!AbstractC9133u.m16128b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f3631v.get(oldItem.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return (!AbstractC9133u.m16128b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f3631v.get(oldItem.getClass())) == null) ? AbstractC9133u.m16128b(oldItem, newItem) : itemCallback.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public Object getChangePayload(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            if (!AbstractC9133u.m16128b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f3631v.get(oldItem.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a0 */
    public static final void m3438a0(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        this$0.m3445d0(viewHolder.getItemViewType());
        if (AbstractC8778f0.m14569o0(this$0.m3509o(), iM3514u) == null) {
            return;
        }
        AbstractC9133u.m16132f(it, "it");
        this$0.m3509o().get(iM3514u);
        throw null;
    }

    /* renamed from: b0 */
    public static final boolean m3439b0(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        this$0.m3445d0(viewHolder.getItemViewType());
        if (AbstractC8778f0.m14569o0(this$0.m3509o(), iM3514u) == null) {
            return false;
        }
        AbstractC9133u.m16132f(it, "it");
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: K */
    public BaseViewHolder mo3440K(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        m3445d0(i10);
        m3508n();
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        m3446e0(holder.getItemViewType());
    }

    /* renamed from: Y */
    public void m3442Y(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        m3519z();
        m3445d0(i10);
        throw null;
    }

    /* renamed from: Z */
    public void m3443Z(final BaseViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        m3487B();
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: l0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBinderAdapter.m3438a0(viewHolder, this, view);
            }
        });
        if (m3488C() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l0.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseBinderAdapter.m3439b0(viewHolder, this, view);
                }
            });
        }
    }

    /* renamed from: c0 */
    public final int m3444c0(Class clazz) {
        AbstractC9133u.m16133g(clazz, "clazz");
        Integer num = (Integer) this.f3632w.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + clazz + " Not Find!").toString());
    }

    /* renamed from: d0 */
    public AbstractC9360a m3445d0(int i10) {
        AbstractC5379p.m2596a(this.f3633x.get(i10));
        throw new IllegalStateException(("getItemBinder: viewType '" + i10 + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    /* renamed from: e0 */
    public AbstractC9360a m3446e0(int i10) {
        AbstractC5379p.m2596a(this.f3633x.get(i10));
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f */
    public void mo3447f(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        super.mo3447f(viewHolder, i10);
        m3443Z(viewHolder);
        m3442Y(viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        m3446e0(holder.getItemViewType());
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        m3446e0(holder.getItemViewType());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i */
    public void mo3450i(BaseViewHolder holder, Object item) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(item, "item");
        m3445d0(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j */
    public void mo3451j(BaseViewHolder holder, Object item, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(item, "item");
        AbstractC9133u.m16133g(payloads, "payloads");
        m3445d0(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: q */
    public int mo3452q(int i10) {
        return m3444c0(m3509o().get(i10).getClass());
    }

    public BaseBinderAdapter(List list) {
        super(0, list);
        this.f3631v = new HashMap();
        this.f3632w = new HashMap();
        this.f3633x = new SparseArray();
        m3497O(new C5488a());
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : list);
    }
}
