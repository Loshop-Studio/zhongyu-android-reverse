package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CoverAdapter;
import com.zykj.study.bean.ImageViewInfo;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.databinding.ItemCoverBinding;
import com.zykj.study.viewmodels.EditCourseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CoverAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final EditCourseViewModel f10895a;

    /* renamed from: b */
    public final List f10896b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCoverBinding f10897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCoverBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10897a = binding;
        }

        /* renamed from: a */
        public final void m10007a(View.OnClickListener listener, SelectModel item) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            ItemCoverBinding itemCoverBinding = this.f10897a;
            itemCoverBinding.setClickListener(listener);
            itemCoverBinding.setEntity(item);
            itemCoverBinding.executePendingBindings();
        }
    }

    public CoverAdapter(EditCourseViewModel editCourseViewModel, List list) {
        Object next;
        AbstractC9133u.m16133g(editCourseViewModel, "editCourseViewModel");
        AbstractC9133u.m16133g(list, "list");
        this.f10895a = editCourseViewModel;
        this.f10896b = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SelectModel) next).isSelectModel()) {
                    break;
                }
            }
        }
        SelectModel selectModel = (SelectModel) next;
        if (selectModel != null) {
            this.f10895a.m12093k().setValue(((ImageViewInfo) selectModel.getData()).getUrl());
        }
    }

    /* renamed from: d */
    private final View.OnClickListener m10003d(final SelectModel selectModel) {
        return new View.OnClickListener() { // from class: n4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoverAdapter.m10004e(this.f18600a, selectModel, view);
            }
        };
    }

    /* renamed from: e */
    public static final void m10004e(CoverAdapter coverAdapter, SelectModel selectModel, View view) {
        List list = coverAdapter.f10896b;
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
        coverAdapter.f10895a.m12093k().setValue(((ImageViewInfo) selectModel.getData()).getUrl());
        coverAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SelectModel selectModel = (SelectModel) this.f10896b.get(i10);
        holder.m10007a(m10003d(selectModel), selectModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCoverBinding itemCoverBindingInflate = ItemCoverBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCoverBindingInflate, "inflate(...)");
        return new ViewHolder(itemCoverBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10896b.size();
    }
}
