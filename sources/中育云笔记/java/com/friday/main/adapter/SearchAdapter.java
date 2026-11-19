package com.friday.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.entity.FileEntity;
import com.friday.main.R$id;
import com.friday.main.adapter.SearchAdapter;
import com.friday.main.databinding.ItemSearchBinding;
import com.friday.main.model.FileDiffCallback;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9796n;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SearchAdapter extends PagingDataAdapter<FileEntity, SearchViewHolder> {

    /* renamed from: a */
    public InterfaceC9544p f9147a;

    @StabilityInferred(parameters = 0)
    public static final class SearchViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemSearchBinding f9148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchViewHolder(ItemSearchBinding binding) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            this.f9148c = binding;
        }

        /* renamed from: a */
        public final ItemSearchBinding m6932a() {
            return this.f9148c;
        }
    }

    public SearchAdapter() {
        super(new FileDiffCallback(), (InterfaceC9945d) null, (InterfaceC9945d) null, 6, (AbstractC9972n) null);
    }

    /* renamed from: g */
    public static final void m6927g(SearchAdapter searchAdapter, FileEntity fileEntity, View view) {
        InterfaceC9544p interfaceC9544p = searchAdapter.f9147a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Integer.valueOf(R$id.iv_go), fileEntity);
        }
    }

    /* renamed from: h */
    public static final void m6928h(SearchAdapter searchAdapter, FileEntity fileEntity, View view) {
        InterfaceC9544p interfaceC9544p = searchAdapter.f9147a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Integer.valueOf(R$id.ll_container), fileEntity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SearchViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        final FileEntity item = getItem(i10);
        if (item != null) {
            holder.m6932a().f9196f.setText(item.getFileName());
            holder.m6932a().f9197g.setText(item.getUpdateTime());
            holder.m6932a().f9194d.setImageResource(AbstractC9796n.f22990a.m19792d(item.getFileType()));
            holder.m6932a().f9193c.setOnClickListener(new View.OnClickListener() { // from class: s3.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchAdapter.m6927g(this.f26682c, item, view);
                }
            });
            holder.m6932a().f9195e.setOnClickListener(new View.OnClickListener() { // from class: s3.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchAdapter.m6928h(this.f26684c, item, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemSearchBinding itemSearchBindingM6942a = ItemSearchBinding.m6942a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemSearchBindingM6942a, "inflate(...)");
        return new SearchViewHolder(itemSearchBindingM6942a);
    }

    /* renamed from: j */
    public final void m6931j(InterfaceC9544p interfaceC9544p) {
        this.f9147a = interfaceC9544p;
    }
}
