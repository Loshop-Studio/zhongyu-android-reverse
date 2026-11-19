package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.SuperviseGroupAddAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.CourseBindBean;
import com.zykj.study.databinding.ItemSuperviseGroupAddBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SuperviseGroupAddAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final List f10967a;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemSuperviseGroupAddBinding f10968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemSuperviseGroupAddBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10968a = binding;
        }

        /* renamed from: a */
        public final void m10135a(SelectModel item, View.OnClickListener onclick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(onclick, "onclick");
            ItemSuperviseGroupAddBinding itemSuperviseGroupAddBinding = this.f10968a;
            itemSuperviseGroupAddBinding.setEntity(item);
            itemSuperviseGroupAddBinding.setOnclick(onclick);
            itemSuperviseGroupAddBinding.executePendingBindings();
        }
    }

    public SuperviseGroupAddAdapter(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10967a = list;
    }

    /* renamed from: f */
    public static final void m10131f(SuperviseGroupAddAdapter superviseGroupAddAdapter, int i10, View view) {
        SelectModel selectModel = (SelectModel) superviseGroupAddAdapter.f10967a.get(i10);
        List list = superviseGroupAddAdapter.f10967a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SelectModel selectModel2 = (SelectModel) obj;
            if (selectModel2.isSelectModel() && !AbstractC9133u.m16128b(selectModel2, selectModel)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SelectModel) it.next()).setSelectModel(false);
        }
        selectModel.setSelectModel(!selectModel.isSelectModel());
        superviseGroupAddAdapter.notifyDataSetChanged();
    }

    /* renamed from: d */
    public final List m10132d() {
        List list = this.f10967a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SelectModel) obj).isSelectModel()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((CourseBindBean) ((SelectModel) it.next()).getData());
        }
        return AbstractC8778f0.m14544U0(arrayList2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m10135a((SelectModel) this.f10967a.get(i10), new View.OnClickListener() { // from class: n4.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperviseGroupAddAdapter.m10131f(this.f18598a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemSuperviseGroupAddBinding itemSuperviseGroupAddBindingInflate = ItemSuperviseGroupAddBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemSuperviseGroupAddBindingInflate, "inflate(...)");
        return new ViewHolder(itemSuperviseGroupAddBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10967a.size();
    }
}
