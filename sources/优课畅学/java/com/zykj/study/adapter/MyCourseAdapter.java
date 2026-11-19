package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.adapter.MyCourseAdapter;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.ItemMyCourseBinding;
import com.zykj.study.viewmodels.DictViewModel;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MyCourseAdapter extends PagingDataAdapter<MyCourseEntity, ViewHolder> {

    /* renamed from: d */
    public static final C7607a f10915d = new C7607a(null);

    /* renamed from: e */
    public static final int f10916e = 8;

    /* renamed from: f */
    public static final DiffUtil.ItemCallback f10917f = new DiffUtil.ItemCallback<MyCourseEntity>() { // from class: com.zykj.study.adapter.MyCourseAdapter$Companion$POST_COMPARATOR$1
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
    public final DictViewModel f10918a;

    /* renamed from: b */
    public final InterfaceC10570l f10919b;

    /* renamed from: c */
    public UserBean f10920c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemMyCourseBinding f10921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemMyCourseBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10921a = binding;
        }

        /* renamed from: a */
        public final void m10053a(View.OnClickListener listener, MyCourseEntity item, UserBean userBean, DictViewModel dictViewModel) {
            AbstractC9133u.m16133g(listener, "listener");
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
            ItemMyCourseBinding itemMyCourseBinding = this.f10921a;
            itemMyCourseBinding.setClickListener(listener);
            itemMyCourseBinding.setEntity(item);
            itemMyCourseBinding.setUserInfo(userBean);
            itemMyCourseBinding.setDictViewModel(dictViewModel);
            itemMyCourseBinding.executePendingBindings();
        }
    }

    /* renamed from: com.zykj.study.adapter.MyCourseAdapter$a */
    public static final class C7607a {
        public /* synthetic */ C7607a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7607a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseAdapter(DictViewModel dictViewModel, InterfaceC10570l interfaceC10570l) {
        super(f10917f, (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(dictViewModel, "dictViewModel");
        this.f10918a = dictViewModel;
        this.f10919b = interfaceC10570l;
    }

    /* renamed from: e */
    public static final void m10046e(MyCourseAdapter myCourseAdapter, MyCourseEntity myCourseEntity, View view) {
        InterfaceC10570l interfaceC10570l = myCourseAdapter.f10919b;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(myCourseEntity);
        }
    }

    /* renamed from: d */
    public final View.OnClickListener m10047d(final MyCourseEntity myCourseEntity) {
        return new View.OnClickListener() { // from class: n4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseAdapter.m10046e(this.f18539a, myCourseEntity, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        MyCourseEntity item = getItem(i10);
        if (item != null) {
            holder.m10053a(m10047d(item), item, this.f10920c, this.f10918a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemMyCourseBinding itemMyCourseBindingInflate = ItemMyCourseBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemMyCourseBindingInflate, "inflate(...)");
        return new ViewHolder(itemMyCourseBindingInflate);
    }

    /* renamed from: h */
    public final void m10050h(UserBean userInfo) {
        AbstractC9133u.m16133g(userInfo, "userInfo");
        this.f10920c = userInfo;
        notifyDataSetChanged();
    }
}
