package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.MicroViewAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.databinding.ItemMicroViewBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MicroViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10570l f10912a;

    /* renamed from: b */
    public final List f10913b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMicroViewBinding f10914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemMicroViewBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10914a = binding;
        }

        /* renamed from: a */
        public final void m10044a(MicroBean item, View.OnClickListener playClick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(playClick, "playClick");
            ItemMicroViewBinding itemMicroViewBinding = this.f10914a;
            itemMicroViewBinding.setUrl(item.snapshotUrl());
            itemMicroViewBinding.setPlayClick(playClick);
            itemMicroViewBinding.executePendingBindings();
        }
    }

    public MicroViewAdapter(InterfaceC10570l playCallBack) {
        AbstractC9133u.m16133g(playCallBack, "playCallBack");
        this.f10912a = playCallBack;
        this.f10913b = new ArrayList();
    }

    /* renamed from: e */
    public static final void m10040e(MicroViewAdapter microViewAdapter, MicroBean microBean, View view) {
        microViewAdapter.f10912a.invoke(microBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final MicroBean microBean = (MicroBean) this.f10913b.get(i10);
        holder.m10044a(microBean, new View.OnClickListener() { // from class: n4.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroViewAdapter.m10040e(this.f18535a, microBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemMicroViewBinding itemMicroViewBindingInflate = ItemMicroViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemMicroViewBindingInflate, "inflate(...)");
        return new ViewHolder(itemMicroViewBindingInflate);
    }

    /* renamed from: g */
    public final void m10043g(List newList) {
        AbstractC9133u.m16133g(newList, "newList");
        this.f10913b.clear();
        this.f10913b.addAll(newList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10913b.size();
    }
}
