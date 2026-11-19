package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.GroupStatisticAdapter;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.databinding.ItemGroupStatisticBinding;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GroupStatisticAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final List f10899a;

    /* renamed from: b */
    public final InterfaceC10570l f10900b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemGroupStatisticBinding f10901a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemGroupStatisticBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10901a = binding;
        }

        /* renamed from: a */
        public final void m10022a(int i10, QuestionBean item, View.OnClickListener click) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(click, "click");
            ItemGroupStatisticBinding itemGroupStatisticBinding = this.f10901a;
            itemGroupStatisticBinding.setIndex(i10 + 1);
            itemGroupStatisticBinding.setBean(item);
            itemGroupStatisticBinding.setOnClick(click);
            itemGroupStatisticBinding.executePendingBindings();
        }
    }

    public GroupStatisticAdapter(List list, InterfaceC10570l onClickListener) {
        AbstractC9133u.m16133g(list, "list");
        AbstractC9133u.m16133g(onClickListener, "onClickListener");
        this.f10899a = list;
        this.f10900b = onClickListener;
    }

    /* renamed from: e */
    public static final void m10019e(GroupStatisticAdapter groupStatisticAdapter, QuestionBean questionBean, View view) {
        groupStatisticAdapter.f10900b.invoke(questionBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final QuestionBean questionBean = (QuestionBean) this.f10899a.get(i10);
        holder.m10022a(i10, questionBean, new View.OnClickListener() { // from class: n4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupStatisticAdapter.m10019e(this.f18510a, questionBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemGroupStatisticBinding itemGroupStatisticBindingInflate = ItemGroupStatisticBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemGroupStatisticBindingInflate, "inflate(...)");
        return new ViewHolder(itemGroupStatisticBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10899a.size();
    }
}
