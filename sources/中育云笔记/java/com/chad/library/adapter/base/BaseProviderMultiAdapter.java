package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes3.dex */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    /* renamed from: a */
    public final InterfaceC10773d f5408a;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProviderMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: o */
    public static final void m4670o(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v10) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        AbstractC9979u.m20293f(v10, "v");
        provider.m4711j(viewHolder, v10, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* renamed from: p */
    public static final boolean m4671p(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v10) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        AbstractC9979u.m20293f(v10, "v");
        return provider.m4712k(viewHolder, v10, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* renamed from: r */
    public static final void m4672r(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemProvider baseItemProvider = (BaseItemProvider) this$0.m4678v().get(viewHolder.getItemViewType());
        AbstractC9979u.m20293f(it, "it");
        baseItemProvider.m4713l(viewHolder, it, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* renamed from: s */
    public static final boolean m4673s(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemProvider baseItemProvider = (BaseItemProvider) this$0.m4678v().get(viewHolder.getItemViewType());
        AbstractC9979u.m20293f(it, "it");
        return baseItemProvider.m4715n(viewHolder, it, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void bindViewClickListener(BaseViewHolder viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, i10);
        m4675q(viewHolder);
        m4674n(viewHolder, i10);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object obj) {
        AbstractC9979u.m20294g(holder, "holder");
        BaseItemProvider baseItemProviderM4676t = m4676t(holder.getItemViewType());
        AbstractC9979u.m20291d(baseItemProviderM4676t);
        baseItemProviderM4676t.mo4702a(holder, obj);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i10) {
        return mo4677u(getData(), i10);
    }

    /* renamed from: m */
    public void mo4662m(BaseItemProvider provider) {
        AbstractC9979u.m20294g(provider, "provider");
        provider.m4719r(this);
        m4678v().put(provider.mo4708g(), provider);
    }

    /* renamed from: n */
    public void m4674n(final BaseViewHolder viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        int i11 = 0;
        if (getOnItemChildClickListener() == null) {
            final BaseItemProvider baseItemProviderM4676t = m4676t(i10);
            if (baseItemProviderM4676t == null) {
                return;
            }
            ArrayList arrayListM4704c = baseItemProviderM4676t.m4704c();
            int size = arrayListM4704c.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListM4704c.get(i12);
                i12++;
                View viewFindViewById = viewHolder.itemView.findViewById(((Number) obj).intValue());
                if (viewFindViewById != null) {
                    AbstractC9979u.m20293f(viewFindViewById, "findViewById<View>(id)");
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: h1.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseProviderMultiAdapter.m4670o(viewHolder, this, baseItemProviderM4676t, view);
                        }
                    });
                }
            }
        }
        getOnItemChildLongClickListener();
        final BaseItemProvider baseItemProviderM4676t2 = m4676t(i10);
        if (baseItemProviderM4676t2 == null) {
            return;
        }
        ArrayList arrayListM4705d = baseItemProviderM4676t2.m4705d();
        int size2 = arrayListM4705d.size();
        while (i11 < size2) {
            Object obj2 = arrayListM4705d.get(i11);
            i11++;
            View viewFindViewById2 = viewHolder.itemView.findViewById(((Number) obj2).intValue());
            if (viewFindViewById2 != null) {
                AbstractC9979u.m20293f(viewFindViewById2, "findViewById<View>(id)");
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: h1.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return BaseProviderMultiAdapter.m4671p(viewHolder, this, baseItemProviderM4676t2, view);
                    }
                });
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        BaseItemProvider baseItemProviderM4676t = m4676t(i10);
        if (baseItemProviderM4676t == null) {
            throw new IllegalStateException(("ViewType: " + i10 + " no such provider found，please use addItemProvider() first!").toString());
        }
        Context context = parent.getContext();
        AbstractC9979u.m20293f(context, "parent.context");
        baseItemProviderM4676t.m4720s(context);
        BaseViewHolder baseViewHolderM4714m = baseItemProviderM4676t.m4714m(parent, i10);
        baseItemProviderM4676t.m4718q(baseViewHolderM4714m, i10);
        return baseViewHolderM4714m;
    }

    /* renamed from: q */
    public void m4675q(final BaseViewHolder viewHolder) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: h1.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseProviderMultiAdapter.m4672r(viewHolder, this, view);
                }
            });
        }
        getOnItemLongClickListener();
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: h1.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return BaseProviderMultiAdapter.m4673s(viewHolder, this, view);
            }
        });
    }

    /* renamed from: t */
    public BaseItemProvider m4676t(int i10) {
        return (BaseItemProvider) m4678v().get(i10);
    }

    /* renamed from: u */
    public abstract int mo4677u(List list, int i10);

    /* renamed from: v */
    public final SparseArray m4678v() {
        return (SparseArray) this.f5408a.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        BaseItemProvider baseItemProviderM4676t = m4676t(holder.getItemViewType());
        if (baseItemProviderM4676t != null) {
            baseItemProviderM4676t.m4717p(holder);
        }
    }

    public /* synthetic */ BaseProviderMultiAdapter(List list, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        BaseItemProvider baseItemProviderM4676t = m4676t(holder.getItemViewType());
        AbstractC9979u.m20291d(baseItemProviderM4676t);
        baseItemProviderM4676t.mo4703b(holder, obj, payloads);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        super.onViewAttachedToWindow((BaseProviderMultiAdapter<T>) holder);
        BaseItemProvider baseItemProviderM4676t = m4676t(holder.getItemViewType());
        if (baseItemProviderM4676t != null) {
            baseItemProviderM4676t.m4716o(holder);
        }
    }

    public BaseProviderMultiAdapter(List list) {
        super(0, list);
        this.f5408a = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$mItemProviders$2
            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SparseArray invoke() {
                return new SparseArray();
            }
        });
    }
}
