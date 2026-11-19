package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.databinding.ItemMicroBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MicroAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10570l f10903a;

    /* renamed from: b */
    public final List f10904b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMicroBinding f10905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemMicroBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10905a = binding;
        }

        /* renamed from: a */
        public final void m10029a(MicroBean item, View.OnClickListener playClick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(playClick, "playClick");
            ItemMicroBinding itemMicroBinding = this.f10905a;
            itemMicroBinding.setUrl(item.snapshotUrl());
            itemMicroBinding.setPlayClick(playClick);
            itemMicroBinding.executePendingBindings();
        }
    }

    public MicroAdapter(InterfaceC10570l playCallBack) {
        AbstractC9133u.m16133g(playCallBack, "playCallBack");
        this.f10903a = playCallBack;
        this.f10904b = new ArrayList();
    }

    /* renamed from: e */
    public static final void m10024e(MicroAdapter microAdapter, MicroBean microBean, View view) {
        microAdapter.f10903a.invoke(microBean);
    }

    /* renamed from: d */
    public final View.OnClickListener m10025d(final MicroBean microBean) {
        return new View.OnClickListener() { // from class: n4.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroAdapter.m10024e(this.f18521a, microBean, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        MicroBean microBean = (MicroBean) this.f10904b.get(i10);
        holder.m10029a(microBean, m10025d(microBean));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemMicroBinding itemMicroBindingInflate = ItemMicroBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemMicroBindingInflate, "inflate(...)");
        return new ViewHolder(itemMicroBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10904b.size();
    }

    /* renamed from: h */
    public final void m10028h(List newList) {
        AbstractC9133u.m16133g(newList, "newList");
        this.f10904b.clear();
        this.f10904b.addAll(newList);
        notifyDataSetChanged();
    }
}
