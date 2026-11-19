package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import androidx.navigation.ViewKt;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.FreeSubscribeAdapter;
import com.zykj.study.bean.FreeSubscribe;
import com.zykj.study.databinding.ItemFreeSubscribeBinding;
import com.zykj.study.p065ui.home.p066my.AbstractC8102h;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p121h5.C8716c;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FreeSubscribeAdapter extends PagingDataAdapter<FreeSubscribe, ViewHolder> {

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemFreeSubscribeBinding f10898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemFreeSubscribeBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10898a = binding;
        }

        /* renamed from: a */
        public final void m10015a(FreeSubscribe item, View.OnClickListener listener) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(listener, "listener");
            ItemFreeSubscribeBinding itemFreeSubscribeBinding = this.f10898a;
            itemFreeSubscribeBinding.setData(item);
            this.f10898a.setDeleteClick(listener);
            itemFreeSubscribeBinding.executePendingBindings();
        }
    }

    public FreeSubscribeAdapter() {
        super(new FreeSubscribeDiffCallback(), (InterfaceC9100d) null, (InterfaceC9100d) null, 6, (AbstractC9126n) null);
    }

    /* renamed from: f */
    public static final void m10010f(final String str, final View view) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: n4.a0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return FreeSubscribeAdapter.m10011g(str, view);
            }
        });
    }

    /* renamed from: g */
    public static final C8736p m10011g(String str, View view) {
        NavDirections navDirectionsM11801c = AbstractC8102h.f13554a.m11801c(str);
        AbstractC9133u.m16130d(view);
        ViewKt.findNavController(view).navigate(navDirectionsM11801c);
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public final View.OnClickListener m10012e(final String str) {
        return new View.OnClickListener() { // from class: n4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreeSubscribeAdapter.m10010f(str, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        FreeSubscribe item = getItem(i10);
        if (item != null) {
            holder.m10015a(item, m10012e(item.getId()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemFreeSubscribeBinding itemFreeSubscribeBindingInflate = ItemFreeSubscribeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemFreeSubscribeBindingInflate, "inflate(...)");
        return new ViewHolder(itemFreeSubscribeBindingInflate);
    }
}
