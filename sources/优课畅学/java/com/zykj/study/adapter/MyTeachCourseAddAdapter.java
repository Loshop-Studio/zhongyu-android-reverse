package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.MyTeachCourseAddAdapter;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.ItemCourseTeachAddBinding;
import com.zykj.study.viewmodels.DictViewModel;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MyTeachCourseAddAdapter extends PagingDataAdapter<MyCourseEntity, ViewHolder> {

    /* renamed from: c */
    public static final C7609a f10928c = new C7609a(null);

    /* renamed from: d */
    public static final int f10929d = 8;

    /* renamed from: e */
    public static final DiffUtil.ItemCallback f10930e = new DiffUtil.ItemCallback<MyCourseEntity>() { // from class: com.zykj.study.adapter.MyTeachCourseAddAdapter$Companion$POST_COMPARATOR$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(MyCourseEntity oldItem, MyCourseEntity newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(MyCourseEntity oldItem, MyCourseEntity newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    };

    /* renamed from: a */
    public final DictViewModel f10931a;

    /* renamed from: b */
    public MyCourseEntity f10932b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemCourseTeachAddBinding f10933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemCourseTeachAddBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10933a = binding;
        }

        /* renamed from: a */
        public final void m10070a(View.OnClickListener listener, MyCourseEntity item, boolean z10, DictViewModel dictViewModel) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
            ItemCourseTeachAddBinding itemCourseTeachAddBinding = this.f10933a;
            itemCourseTeachAddBinding.setClickListener(listener);
            itemCourseTeachAddBinding.setEntity(item);
            itemCourseTeachAddBinding.setIsSelected(z10);
            itemCourseTeachAddBinding.setDictViewModel(dictViewModel);
            itemCourseTeachAddBinding.executePendingBindings();
        }
    }

    /* renamed from: com.zykj.study.adapter.MyTeachCourseAddAdapter$a */
    public static final class C7609a {
        public /* synthetic */ C7609a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7609a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTeachCourseAddAdapter(DictViewModel dictViewModel) {
        super(f10930e, (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
        this.f10931a = dictViewModel;
    }

    /* renamed from: e */
    public static final void m10063e(MyTeachCourseAddAdapter myTeachCourseAddAdapter, int i10, View view) {
        MyCourseEntity item = myTeachCourseAddAdapter.getItem(i10);
        if (item != null) {
            myTeachCourseAddAdapter.f10932b = item;
            myTeachCourseAddAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public final View.OnClickListener m10064d(final int i10) {
        return new View.OnClickListener() { // from class: n4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTeachCourseAddAdapter.m10063e(this.f18549a, i10, view);
            }
        };
    }

    /* renamed from: f */
    public final Object m10065f(InterfaceC9324c interfaceC9324c) {
        return this.f10932b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        MyCourseEntity item = getItem(i10);
        if (item != null) {
            holder.m10070a(m10064d(i10), item, AbstractC9133u.m16128b(item, this.f10932b), this.f10931a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemCourseTeachAddBinding itemCourseTeachAddBindingInflate = ItemCourseTeachAddBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemCourseTeachAddBindingInflate, "inflate(...)");
        return new ViewHolder(itemCourseTeachAddBindingInflate);
    }
}
