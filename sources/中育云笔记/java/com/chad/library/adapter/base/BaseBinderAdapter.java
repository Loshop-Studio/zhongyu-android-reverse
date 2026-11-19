package com.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p199j1.AbstractC9660a;
import p212k.AbstractC9764r;

/* loaded from: classes3.dex */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {

    /* renamed from: a */
    public final HashMap f5401a;

    /* renamed from: b */
    public final HashMap f5402b;

    /* renamed from: c */
    public final SparseArray f5403c;

    /* renamed from: com.chad.library.adapter.base.BaseBinderAdapter$a */
    public final class C5907a extends DiffUtil.ItemCallback {
        public C5907a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            if (!AbstractC9979u.m20289b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f5401a.get(oldItem.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return (!AbstractC9979u.m20289b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f5401a.get(oldItem.getClass())) == null) ? AbstractC9979u.m20289b(oldItem, newItem) : itemCallback.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public Object getChangePayload(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            if (!AbstractC9979u.m20289b(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.f5401a.get(oldItem.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: n */
    public static final void m4640n(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        this$0.m4645q(viewHolder.getItemViewType());
        AbstractC9979u.m20293f(it, "it");
        this$0.getData().get(headerLayoutCount);
        throw null;
    }

    /* renamed from: o */
    public static final boolean m4641o(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        this$0.m4645q(viewHolder.getItemViewType());
        AbstractC9979u.m20293f(it, "it");
        this$0.getData().get(headerLayoutCount);
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void bindViewClickListener(BaseViewHolder viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, i10);
        m4643m(viewHolder);
        m4642l(viewHolder, i10);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        m4645q(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i10) {
        return m4644p(getData().get(i10).getClass());
    }

    /* renamed from: l */
    public void m4642l(BaseViewHolder viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            m4645q(i10);
            throw null;
        }
        getOnItemChildLongClickListener();
        m4645q(i10);
        throw null;
    }

    /* renamed from: m */
    public void m4643m(final BaseViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: h1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseBinderAdapter.m4640n(viewHolder, this, view);
                }
            });
        }
        getOnItemLongClickListener();
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: h1.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return BaseBinderAdapter.m4641o(viewHolder, this, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        m4645q(i10);
        getContext();
        throw null;
    }

    /* renamed from: p */
    public final int m4644p(Class clazz) {
        AbstractC9979u.m20294g(clazz, "clazz");
        Integer num = (Integer) this.f5402b.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + clazz + " Not Find!").toString());
    }

    /* renamed from: q */
    public AbstractC9660a m4645q(int i10) {
        AbstractC9764r.m19682a(this.f5403c.get(i10));
        throw new IllegalStateException(("getItemBinder: viewType '" + i10 + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    /* renamed from: r */
    public AbstractC9660a m4646r(int i10) {
        AbstractC9764r.m19682a(this.f5403c.get(i10));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        m4646r(holder.getItemViewType());
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        m4646r(holder.getItemViewType());
    }

    public BaseBinderAdapter(List list) {
        super(0, list);
        this.f5401a = new HashMap();
        this.f5402b = new HashMap();
        this.f5403c = new SparseArray();
        setDiffCallback(new C5907a());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object item, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        AbstractC9979u.m20294g(payloads, "payloads");
        m4645q(holder.getItemViewType());
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        super.onViewAttachedToWindow((BaseBinderAdapter) holder);
        m4646r(holder.getItemViewType());
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : list);
    }
}
