package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.SearchHistoryAdapter;
import com.zykj.study.data.SearchHistoryEntity;
import com.zykj.study.databinding.ItemHistorySearchBinding;
import com.zykj.study.viewmodels.SearchViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SearchHistoryAdapter extends RecyclerView.Adapter<ViewHolderHistory> {

    /* renamed from: a */
    public final SearchViewModel f10934a;

    /* renamed from: b */
    public final List f10935b;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderHistory extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemHistorySearchBinding f10936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderHistory(ItemHistorySearchBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10936a = binding;
        }

        /* renamed from: a */
        public final void m10080a(SearchHistoryEntity item, View.OnClickListener deleteClickListener, View.OnClickListener clickListener) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(deleteClickListener, "deleteClickListener");
            AbstractC9133u.m16133g(clickListener, "clickListener");
            ItemHistorySearchBinding itemHistorySearchBinding = this.f10936a;
            itemHistorySearchBinding.setEntity(item);
            itemHistorySearchBinding.setDeleteClickListener(deleteClickListener);
            itemHistorySearchBinding.setClickListener(clickListener);
            itemHistorySearchBinding.executePendingBindings();
        }
    }

    public SearchHistoryAdapter(SearchViewModel searchViewModel) {
        AbstractC9133u.m16133g(searchViewModel, "searchViewModel");
        this.f10934a = searchViewModel;
        this.f10935b = new ArrayList();
    }

    /* renamed from: f */
    public static final void m10073f(SearchHistoryAdapter searchHistoryAdapter, SearchHistoryEntity searchHistoryEntity, View view) {
        searchHistoryAdapter.f10934a.m12246c(searchHistoryEntity);
    }

    /* renamed from: h */
    public static final void m10074h(SearchHistoryAdapter searchHistoryAdapter, SearchHistoryEntity searchHistoryEntity, View view) {
        searchHistoryAdapter.f10934a.m12249f().setValue(searchHistoryEntity.getSearchKey());
        searchHistoryAdapter.f10934a.m12253k();
    }

    /* renamed from: e */
    public final View.OnClickListener m10075e(final SearchHistoryEntity searchHistoryEntity) {
        return new View.OnClickListener() { // from class: n4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchHistoryAdapter.m10073f(this.f18557a, searchHistoryEntity, view);
            }
        };
    }

    /* renamed from: g */
    public final View.OnClickListener m10076g(final SearchHistoryEntity searchHistoryEntity) {
        return new View.OnClickListener() { // from class: n4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchHistoryAdapter.m10074h(this.f18553a, searchHistoryEntity, view);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10935b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolderHistory holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        SearchHistoryEntity searchHistoryEntity = (SearchHistoryEntity) this.f10935b.get(i10);
        holder.m10080a(searchHistoryEntity, m10075e(searchHistoryEntity), m10076g(searchHistoryEntity));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ViewHolderHistory onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemHistorySearchBinding itemHistorySearchBindingInflate = ItemHistorySearchBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemHistorySearchBindingInflate, "inflate(...)");
        return new ViewHolderHistory(itemHistorySearchBindingInflate);
    }

    /* renamed from: k */
    public final void m10079k(List newList) {
        AbstractC9133u.m16133g(newList, "newList");
        this.f10935b.clear();
        this.f10935b.addAll(newList);
        notifyDataSetChanged();
    }
}
