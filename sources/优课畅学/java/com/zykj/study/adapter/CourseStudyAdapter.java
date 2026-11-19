package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CourseStudyAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.databinding.ItemStudyBinding;
import com.zykj.study.viewmodels.DictViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseStudyAdapter extends PagingDataAdapter<SelectModel<CourseStudyEntity>, ViewHolder> {

    /* renamed from: a */
    public final DictViewModel f10892a;

    /* renamed from: b */
    public final InterfaceC10570l f10893b;

    @StabilityInferred(parameters = 0)
    public static final class DiffCallBack extends DiffUtil.ItemCallback<SelectModel<CourseStudyEntity>> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(SelectModel oldItem, SelectModel newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(SelectModel oldItem, SelectModel newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return ((CourseStudyEntity) oldItem.getData()).getId() == ((CourseStudyEntity) newItem.getData()).getId();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object getChangePayload(SelectModel oldItem, SelectModel newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.isSelectModel() != newItem.isSelectModel()) {
                arrayList.add("isSelected");
            }
            return arrayList;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemStudyBinding f10894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemStudyBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10894a = binding;
        }

        /* renamed from: a */
        public final void m10000a(View.OnClickListener listener, SelectModel item, DictViewModel dictViewModel) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
            ItemStudyBinding itemStudyBinding = this.f10894a;
            itemStudyBinding.setClickListener(listener);
            itemStudyBinding.setEntity((CourseStudyEntity) item.getData());
            itemStudyBinding.setDictViewModel(dictViewModel);
            itemStudyBinding.setIsSelected(item.isSelectModel());
            itemStudyBinding.executePendingBindings();
        }

        /* renamed from: b */
        public final void m10001b(boolean z10) {
            this.f10894a.setIsSelected(z10);
            this.f10894a.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseStudyAdapter(DictViewModel dictViewModel, InterfaceC10570l callBack) {
        super(new DiffCallBack(), (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
        AbstractC9133u.m16133g(callBack, "callBack");
        this.f10892a = dictViewModel;
        this.f10893b = callBack;
    }

    /* renamed from: e */
    public static final void m9992e(CourseStudyAdapter courseStudyAdapter, SelectModel selectModel, View view) {
        courseStudyAdapter.f10893b.invoke(selectModel.getData());
    }

    /* renamed from: d */
    public final View.OnClickListener m9993d(final SelectModel selectModel) {
        return new View.OnClickListener() { // from class: n4.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseStudyAdapter.m9992e(this.f18596a, selectModel, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SelectModel<CourseStudyEntity> item = getItem(i10);
        if (item != null) {
            holder.m10000a(m9993d(item), item, this.f10892a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
        SelectModel<CourseStudyEntity> item = getItem(i10);
        if (item == null) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        Object objM14568n0 = AbstractC8778f0.m14568n0(payloads);
        List list = objM14568n0 instanceof List ? (List) objM14568n0 : null;
        if (list == null) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        if (list.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC9133u.m16128b(it.next(), "isSelected")) {
                holder.m10001b(item.isSelectModel());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemStudyBinding itemStudyBindingInflate = ItemStudyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemStudyBindingInflate, "inflate(...)");
        return new ViewHolder(itemStudyBindingInflate);
    }
}
