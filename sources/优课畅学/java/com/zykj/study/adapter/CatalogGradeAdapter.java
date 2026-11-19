package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CatalogGradeAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.GradeEntity;
import com.zykj.study.databinding.ItemCatalogGradeBinding;
import com.zykj.study.viewmodels.CatalogViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogGradeAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final CatalogViewModel f10858a;

    /* renamed from: b */
    public final List f10859b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCatalogGradeBinding f10860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCatalogGradeBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10860a = binding;
        }

        /* renamed from: a */
        public final void m9935a(View.OnClickListener listener, SelectModel item) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            ItemCatalogGradeBinding itemCatalogGradeBinding = this.f10860a;
            itemCatalogGradeBinding.setClickListener(listener);
            itemCatalogGradeBinding.setEntity(item);
            itemCatalogGradeBinding.executePendingBindings();
        }
    }

    public CatalogGradeAdapter(CatalogViewModel catalogViewModel, List list) {
        AbstractC9133u.m16133g(catalogViewModel, "catalogViewModel");
        AbstractC9133u.m16133g(list, "list");
        this.f10858a = catalogViewModel;
        this.f10859b = list;
    }

    /* renamed from: d */
    private final View.OnClickListener m9931d(final SelectModel selectModel) {
        return new View.OnClickListener() { // from class: n4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogGradeAdapter.m9932e(this.f18533a, selectModel, view);
            }
        };
    }

    /* renamed from: e */
    public static final void m9932e(CatalogGradeAdapter catalogGradeAdapter, SelectModel selectModel, View view) {
        List list = catalogGradeAdapter.f10859b;
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
            catalogGradeAdapter.f10858a.m12029a().setValue(Integer.valueOf(((GradeEntity) selectModel.getData()).getId()));
        } else {
            catalogGradeAdapter.f10858a.m12029a().setValue(0);
        }
        catalogGradeAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SelectModel selectModel = (SelectModel) this.f10859b.get(i10);
        holder.m9935a(m9931d(selectModel), selectModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCatalogGradeBinding itemCatalogGradeBindingInflate = ItemCatalogGradeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCatalogGradeBindingInflate, "inflate(...)");
        return new ViewHolder(itemCatalogGradeBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10859b.size();
    }
}
