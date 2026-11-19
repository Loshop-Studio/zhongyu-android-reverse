package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.MicroEditAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.databinding.ItemMicroAddBinding;
import com.zykj.study.databinding.ItemMicroEditBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MicroEditAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10570l f10906a;

    /* renamed from: b */
    public final InterfaceC10570l f10907b;

    /* renamed from: c */
    public final InterfaceC10559a f10908c;

    /* renamed from: d */
    public final List f10909d;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMicroEditBinding f10910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemMicroEditBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10910a = binding;
        }

        /* renamed from: a */
        public final void m10037a(MicroBean item, View.OnClickListener playClick, View.OnClickListener deleteClick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(playClick, "playClick");
            AbstractC9133u.m16133g(deleteClick, "deleteClick");
            ItemMicroEditBinding itemMicroEditBinding = this.f10910a;
            itemMicroEditBinding.setUrl(item.snapshotUrl());
            itemMicroEditBinding.setPlayClick(playClick);
            itemMicroEditBinding.setDeleteClick(deleteClick);
            itemMicroEditBinding.executePendingBindings();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderAdd extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMicroAddBinding f10911a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderAdd(ItemMicroAddBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10911a = binding;
        }

        /* renamed from: a */
        public final void m10038a(View.OnClickListener addClick) {
            AbstractC9133u.m16133g(addClick, "addClick");
            ItemMicroAddBinding itemMicroAddBinding = this.f10911a;
            itemMicroAddBinding.setAddClick(addClick);
            itemMicroAddBinding.executePendingBindings();
        }
    }

    public MicroEditAdapter(InterfaceC10570l playCallBack, InterfaceC10570l deleteCallBack, InterfaceC10559a addCallBack) {
        AbstractC9133u.m16133g(playCallBack, "playCallBack");
        AbstractC9133u.m16133g(deleteCallBack, "deleteCallBack");
        AbstractC9133u.m16133g(addCallBack, "addCallBack");
        this.f10906a = playCallBack;
        this.f10907b = deleteCallBack;
        this.f10908c = addCallBack;
        this.f10909d = new ArrayList();
    }

    /* renamed from: f */
    public static final void m10033f(MicroEditAdapter microEditAdapter, View view) {
        microEditAdapter.f10908c.invoke();
    }

    /* renamed from: g */
    public static final void m10034g(MicroEditAdapter microEditAdapter, MicroBean microBean, View view) {
        microEditAdapter.f10906a.invoke(microBean);
    }

    /* renamed from: h */
    public static final void m10035h(MicroEditAdapter microEditAdapter, MicroBean microBean, View view) {
        microEditAdapter.f10907b.invoke(microBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10909d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f10909d.size() == i10 ? 0 : 1;
    }

    /* renamed from: i */
    public final void m10036i(List newList) {
        AbstractC9133u.m16133g(newList, "newList");
        this.f10909d.clear();
        this.f10909d.addAll(newList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        if (getItemViewType(i10) == 0) {
            ((ViewHolderAdd) holder).m10038a(new View.OnClickListener() { // from class: n4.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MicroEditAdapter.m10033f(this.f18525a, view);
                }
            });
        } else {
            final MicroBean microBean = (MicroBean) this.f10909d.get(i10);
            ((ViewHolder) holder).m10037a(microBean, new View.OnClickListener() { // from class: n4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MicroEditAdapter.m10034g(this.f18528a, microBean, view);
                }
            }, new View.OnClickListener() { // from class: n4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MicroEditAdapter.m10035h(this.f18531a, microBean, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        if (i10 == 0) {
            ItemMicroAddBinding itemMicroAddBindingInflate = ItemMicroAddBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemMicroAddBindingInflate, "inflate(...)");
            return new ViewHolderAdd(itemMicroAddBindingInflate);
        }
        ItemMicroEditBinding itemMicroEditBindingInflate = ItemMicroEditBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemMicroEditBindingInflate, "inflate(...)");
        return new ViewHolder(itemMicroEditBindingInflate);
    }
}
