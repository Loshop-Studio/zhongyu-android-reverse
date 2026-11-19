package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CatalogSubjectAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.SubjectEntity;
import com.zykj.study.databinding.ItemCatalogSubjectBinding;
import com.zykj.study.viewmodels.CatalogViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogSubjectAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final CatalogViewModel f10872a;

    /* renamed from: b */
    public final List f10873b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCatalogSubjectBinding f10874a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCatalogSubjectBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10874a = binding;
        }

        /* renamed from: a */
        public final void m9958a(View.OnClickListener listener, SelectModel item) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            ItemCatalogSubjectBinding itemCatalogSubjectBinding = this.f10874a;
            itemCatalogSubjectBinding.setClickListener(listener);
            itemCatalogSubjectBinding.setEntity(item);
            itemCatalogSubjectBinding.executePendingBindings();
        }
    }

    public CatalogSubjectAdapter(CatalogViewModel catalogViewModel, List list) {
        AbstractC9133u.m16133g(catalogViewModel, "catalogViewModel");
        AbstractC9133u.m16133g(list, "list");
        this.f10872a = catalogViewModel;
        this.f10873b = list;
    }

    /* renamed from: d */
    private final View.OnClickListener m9954d(final SelectModel selectModel) {
        return new View.OnClickListener() { // from class: n4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogSubjectAdapter.m9955e(this.f18555a, selectModel, view);
            }
        };
    }

    /* renamed from: e */
    public static final void m9955e(CatalogSubjectAdapter catalogSubjectAdapter, SelectModel selectModel, View view) {
        List list = catalogSubjectAdapter.f10873b;
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
        selectModel.setSelectModel(true);
        if (selectModel.isSelectModel()) {
            catalogSubjectAdapter.f10872a.m12031c().setValue(Integer.valueOf(((SubjectEntity) selectModel.getData()).getId()));
        }
        catalogSubjectAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SelectModel selectModel = (SelectModel) this.f10873b.get(i10);
        holder.m9958a(m9954d(selectModel), selectModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCatalogSubjectBinding itemCatalogSubjectBindingInflate = ItemCatalogSubjectBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCatalogSubjectBindingInflate, "inflate(...)");
        return new ViewHolder(itemCatalogSubjectBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10873b.size();
    }
}
