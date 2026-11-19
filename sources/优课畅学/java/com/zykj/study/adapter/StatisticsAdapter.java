package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.bean.teach.SuperviseGroupMemberProgress;
import com.zykj.study.databinding.ItemStatisticsBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StatisticsAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final List f10937a = new ArrayList();

    /* renamed from: b */
    public boolean f10938b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemStatisticsBinding f10939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemStatisticsBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10939a = binding;
        }

        /* renamed from: a */
        public final void m10085a(SuperviseGroupMemberProgress item, boolean z10) {
            AbstractC9133u.m16133g(item, "item");
            ItemStatisticsBinding itemStatisticsBinding = this.f10939a;
            itemStatisticsBinding.setEntity(item);
            itemStatisticsBinding.setIsLeaf(z10);
            itemStatisticsBinding.executePendingBindings();
        }
    }

    /* renamed from: c */
    public final void m10081c(boolean z10) {
        this.f10938b = z10;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m10085a((SuperviseGroupMemberProgress) this.f10937a.get(i10), this.f10938b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemStatisticsBinding itemStatisticsBindingInflate = ItemStatisticsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemStatisticsBindingInflate, "inflate(...)");
        return new ViewHolder(itemStatisticsBindingInflate);
    }

    /* renamed from: f */
    public final void m10084f(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10937a.clear();
        this.f10937a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10937a.size();
    }
}
