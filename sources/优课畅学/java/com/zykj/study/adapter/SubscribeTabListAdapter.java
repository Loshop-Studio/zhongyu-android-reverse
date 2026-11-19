package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.SubscribeTabListAdapter;
import com.zykj.study.bean.OtherSubscribe;
import com.zykj.study.databinding.ItemSubscribeTabBinding;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SubscribeTabListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final List f10963a;

    /* renamed from: b */
    public final InterfaceC10574p f10964b;

    /* renamed from: c */
    public int f10965c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemSubscribeTabBinding f10966a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemSubscribeTabBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10966a = binding;
        }

        /* renamed from: a */
        public final void m10129a(String title, boolean z10, View.OnClickListener listener) {
            AbstractC9133u.m16133g(title, "title");
            AbstractC9133u.m16133g(listener, "listener");
            ItemSubscribeTabBinding itemSubscribeTabBinding = this.f10966a;
            itemSubscribeTabBinding.setOnClick(listener);
            itemSubscribeTabBinding.setTitle(title);
            itemSubscribeTabBinding.setIsSelected(Boolean.valueOf(z10));
            itemSubscribeTabBinding.executePendingBindings();
        }
    }

    public SubscribeTabListAdapter(List list, InterfaceC10574p callback) {
        AbstractC9133u.m16133g(list, "list");
        AbstractC9133u.m16133g(callback, "callback");
        this.f10963a = list;
        this.f10964b = callback;
    }

    /* renamed from: e */
    public static final void m10126e(SubscribeTabListAdapter subscribeTabListAdapter, int i10, OtherSubscribe otherSubscribe, View view) {
        subscribeTabListAdapter.f10965c = i10;
        subscribeTabListAdapter.f10964b.invoke(Integer.valueOf(i10), otherSubscribe);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final OtherSubscribe otherSubscribe = (OtherSubscribe) this.f10963a.get(i10);
        holder.m10129a(otherSubscribe.getName(), i10 == this.f10965c, new View.OnClickListener() { // from class: n4.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubscribeTabListAdapter.m10126e(this.f18593a, i10, otherSubscribe, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemSubscribeTabBinding itemSubscribeTabBindingInflate = ItemSubscribeTabBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemSubscribeTabBindingInflate, "inflate(...)");
        return new ViewHolder(itemSubscribeTabBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10963a.size();
    }
}
