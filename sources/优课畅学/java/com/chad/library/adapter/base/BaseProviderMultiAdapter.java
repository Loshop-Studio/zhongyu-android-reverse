package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    /* renamed from: v */
    public final InterfaceC8724d f3638v;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProviderMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: b0 */
    public static final void m3472b0(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v10) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        AbstractC9133u.m16132f(v10, "v");
        provider.m3533j(viewHolder, v10, this$0.m3509o().get(iM3514u), iM3514u);
    }

    /* renamed from: c0 */
    public static final boolean m3473c0(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v10) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        AbstractC9133u.m16132f(v10, "v");
        return provider.m3534k(viewHolder, v10, this$0.m3509o().get(iM3514u), iM3514u);
    }

    /* renamed from: e0 */
    public static final void m3474e0(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        BaseItemProvider baseItemProvider = (BaseItemProvider) this$0.m3480i0().get(viewHolder.getItemViewType());
        AbstractC9133u.m16132f(it, "it");
        baseItemProvider.m3535l(viewHolder, it, this$0.m3509o().get(iM3514u), iM3514u);
    }

    /* renamed from: f0 */
    public static final boolean m3475f0(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        BaseItemProvider baseItemProvider = (BaseItemProvider) this$0.m3480i0().get(viewHolder.getItemViewType());
        AbstractC9133u.m16132f(it, "it");
        return baseItemProvider.m3537n(viewHolder, it, this$0.m3509o().get(iM3514u), iM3514u);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: K */
    public BaseViewHolder mo3440K(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        BaseItemProvider baseItemProviderM3478g0 = m3478g0(i10);
        if (baseItemProviderM3478g0 == null) {
            throw new IllegalStateException(("ViewType: " + i10 + " no such provider found，please use addItemProvider() first!").toString());
        }
        Context context = parent.getContext();
        AbstractC9133u.m16132f(context, "parent.context");
        baseItemProviderM3478g0.m3542s(context);
        BaseViewHolder baseViewHolderM3536m = baseItemProviderM3478g0.m3536m(parent, i10);
        baseItemProviderM3478g0.mo3540q(baseViewHolderM3536m, i10);
        return baseViewHolderM3536m;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        BaseItemProvider baseItemProviderM3478g0 = m3478g0(holder.getItemViewType());
        if (baseItemProviderM3478g0 != null) {
            baseItemProviderM3478g0.m3538o(holder);
        }
    }

    /* renamed from: Z */
    public void mo3460Z(BaseItemProvider provider) {
        AbstractC9133u.m16133g(provider, "provider");
        provider.m3541r(this);
        m3480i0().put(provider.mo3530g(), provider);
    }

    /* renamed from: a0 */
    public void m3476a0(final BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        m3519z();
        final BaseItemProvider baseItemProviderM3478g0 = m3478g0(i10);
        if (baseItemProviderM3478g0 == null) {
            return;
        }
        Iterator<T> it = baseItemProviderM3478g0.m3527d().iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
            if (viewFindViewById != null) {
                AbstractC9133u.m16132f(viewFindViewById, "findViewById<View>(id)");
                if (!viewFindViewById.isClickable()) {
                    viewFindViewById.setClickable(true);
                }
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseProviderMultiAdapter.m3472b0(viewHolder, this, baseItemProviderM3478g0, view);
                    }
                });
            }
        }
        m3486A();
        final BaseItemProvider baseItemProviderM3478g02 = m3478g0(i10);
        if (baseItemProviderM3478g02 == null) {
            return;
        }
        Iterator<T> it2 = baseItemProviderM3478g02.m3528e().iterator();
        while (it2.hasNext()) {
            View viewFindViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (viewFindViewById2 != null) {
                AbstractC9133u.m16132f(viewFindViewById2, "findViewById<View>(id)");
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: l0.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return BaseProviderMultiAdapter.m3473c0(viewHolder, this, baseItemProviderM3478g02, view);
                    }
                });
            }
        }
    }

    /* renamed from: d0 */
    public void m3477d0(final BaseViewHolder viewHolder) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        m3487B();
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: l0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseProviderMultiAdapter.m3474e0(viewHolder, this, view);
            }
        });
        if (m3488C() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l0.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseProviderMultiAdapter.m3475f0(viewHolder, this, view);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f */
    public void mo3447f(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        super.mo3447f(viewHolder, i10);
        m3477d0(viewHolder);
        m3476a0(viewHolder, i10);
    }

    /* renamed from: g0 */
    public BaseItemProvider m3478g0(int i10) {
        return (BaseItemProvider) m3480i0().get(i10);
    }

    /* renamed from: h0 */
    public abstract int mo3479h0(List list, int i10);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i */
    public void mo3450i(BaseViewHolder holder, Object obj) {
        AbstractC9133u.m16133g(holder, "holder");
        BaseItemProvider baseItemProviderM3478g0 = m3478g0(holder.getItemViewType());
        AbstractC9133u.m16130d(baseItemProviderM3478g0);
        baseItemProviderM3478g0.mo3524a(holder, obj);
    }

    /* renamed from: i0 */
    public final SparseArray m3480i0() {
        return (SparseArray) this.f3638v.getValue();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j */
    public void mo3451j(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
        BaseItemProvider baseItemProviderM3478g0 = m3478g0(holder.getItemViewType());
        AbstractC9133u.m16130d(baseItemProviderM3478g0);
        baseItemProviderM3478g0.m3525b(holder, obj, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        BaseItemProvider baseItemProviderM3478g0 = m3478g0(holder.getItemViewType());
        if (baseItemProviderM3478g0 != null) {
            baseItemProviderM3478g0.m3539p(holder);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: q */
    public int mo3452q(int i10) {
        return mo3479h0(m3509o(), i10);
    }

    public /* synthetic */ BaseProviderMultiAdapter(List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseProviderMultiAdapter(List list) {
        super(0, list);
        this.f3638v = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$mItemProviders$2
            @Override // p300x7.InterfaceC10559a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SparseArray invoke() {
                return new SparseArray();
            }
        });
    }
}
