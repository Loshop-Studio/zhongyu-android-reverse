package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CatalogPeriodAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.PeriodEntity;
import com.zykj.study.databinding.ItemCatalogPeriodBinding;
import com.zykj.study.viewmodels.CatalogViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogPeriodAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final CatalogViewModel f10861a;

    /* renamed from: b */
    public final List f10862b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCatalogPeriodBinding f10863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCatalogPeriodBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10863a = binding;
        }

        /* renamed from: a */
        public final void m9941a(View.OnClickListener listener, SelectModel item) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            ItemCatalogPeriodBinding itemCatalogPeriodBinding = this.f10863a;
            itemCatalogPeriodBinding.setClickListener(listener);
            itemCatalogPeriodBinding.setEntity(item);
            itemCatalogPeriodBinding.executePendingBindings();
        }
    }

    public CatalogPeriodAdapter(CatalogViewModel catalogViewModel, List list) {
        AbstractC9133u.m16133g(catalogViewModel, "catalogViewModel");
        AbstractC9133u.m16133g(list, "list");
        this.f10861a = catalogViewModel;
        this.f10862b = list;
    }

    /* renamed from: d */
    private final View.OnClickListener m9937d(final SelectModel selectModel) {
        return new View.OnClickListener() { // from class: n4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogPeriodAdapter.m9938e(this.f18537a, selectModel, view);
            }
        };
    }

    /* renamed from: e */
    public static final void m9938e(CatalogPeriodAdapter catalogPeriodAdapter, SelectModel selectModel, View view) {
        List list = catalogPeriodAdapter.f10862b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC9133u.m16128b((SelectModel) obj, selectModel)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SelectModel) it.next()).setSelectModel(false);
        }
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (selectModel.isSelectModel()) {
            catalogPeriodAdapter.f10861a.m12030b().setValue(Integer.valueOf(((PeriodEntity) selectModel.getData()).getId()));
        } else {
            catalogPeriodAdapter.f10861a.m12030b().setValue(0);
        }
        catalogPeriodAdapter.f10861a.m12029a().setValue(0);
        catalogPeriodAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SelectModel selectModel = (SelectModel) this.f10862b.get(i10);
        holder.m9941a(m9937d(selectModel), selectModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCatalogPeriodBinding itemCatalogPeriodBindingInflate = ItemCatalogPeriodBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCatalogPeriodBindingInflate, "inflate(...)");
        return new ViewHolder(itemCatalogPeriodBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10862b.size();
    }
}
