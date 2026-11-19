package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.databinding.ItemStuNameBinding;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StuNameAdapter extends ListAdapter<String, ViewHolder> {

    /* renamed from: a */
    public static final C7610a f10940a = new C7610a(null);

    /* renamed from: b */
    public static final int f10941b = 8;

    /* renamed from: c */
    public static final DiffUtil.ItemCallback f10942c = new DiffUtil.ItemCallback<String>() { // from class: com.zykj.study.adapter.StuNameAdapter$Companion$diffCallback$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(String oldItem, String newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(String oldItem, String newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }
    };

    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemStuNameBinding f10943a;

        /* renamed from: b */
        public final /* synthetic */ StuNameAdapter f10944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(StuNameAdapter stuNameAdapter, ItemStuNameBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10944b = stuNameAdapter;
            this.f10943a = binding;
        }

        /* renamed from: a */
        public final void m10090a(String data) {
            AbstractC9133u.m16133g(data, "data");
            this.f10943a.tvName.setText(data);
        }
    }

    /* renamed from: com.zykj.study.adapter.StuNameAdapter$a */
    public static final class C7610a {
        public /* synthetic */ C7610a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7610a() {
        }
    }

    public StuNameAdapter() {
        super(f10942c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        String item = getItem(i10);
        AbstractC9133u.m16130d(item);
        holder.m10090a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemStuNameBinding itemStuNameBindingInflate = ItemStuNameBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemStuNameBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemStuNameBindingInflate);
    }
}
