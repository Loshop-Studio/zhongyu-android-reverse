package com.friday.document.view.share;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.document.R$id;
import com.friday.document.databinding.ItemShareSearchBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.view.share.ShareSearchAdapter;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9796n;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareSearchAdapter extends ListAdapter<ShareFile, SearchViewHolder> {

    /* renamed from: a */
    public InterfaceC9544p f7653a;

    @StabilityInferred(parameters = 0)
    public static final class SearchViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemShareSearchBinding f7654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchViewHolder(ItemShareSearchBinding binding) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            this.f7654c = binding;
        }

        /* renamed from: a */
        public final ItemShareSearchBinding m6099a() {
            return this.f7654c;
        }
    }

    public ShareSearchAdapter() {
        super(new DiffUtil.ItemCallback<ShareFile>() { // from class: com.friday.document.view.share.ShareSearchAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(ShareFile oldItem, ShareFile newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(ShareFile oldItem, ShareFile newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem.getFileId(), newItem.getFileId());
            }
        });
    }

    /* renamed from: d */
    public static final void m6092d(ShareSearchAdapter shareSearchAdapter, ShareFile shareFile, View view) {
        InterfaceC9544p interfaceC9544p = shareSearchAdapter.f7653a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Integer.valueOf(R$id.iv_go), shareFile);
        }
    }

    /* renamed from: e */
    public static final void m6093e(ShareSearchAdapter shareSearchAdapter, ShareFile shareFile, View view) {
        InterfaceC9544p interfaceC9544p = shareSearchAdapter.f7653a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(Integer.valueOf(R$id.ll_container), shareFile);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SearchViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        final ShareFile item = getItem(i10);
        if (item != null) {
            holder.m6099a().f6515f.setText(item.getFileName());
            holder.m6099a().f6516g.setText(item.getUpdateTime());
            holder.m6099a().f6513d.setImageResource(AbstractC9796n.f22990a.m19792d(item.getType()));
            holder.m6099a().f6512c.setOnClickListener(new View.OnClickListener() { // from class: x2.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareSearchAdapter.m6092d(this.f27957c, item, view);
                }
            });
            holder.m6099a().f6514e.setOnClickListener(new View.OnClickListener() { // from class: x2.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareSearchAdapter.m6093e(this.f27959c, item, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemShareSearchBinding itemShareSearchBindingM5539a = ItemShareSearchBinding.m5539a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemShareSearchBindingM5539a, "inflate(...)");
        return new SearchViewHolder(itemShareSearchBindingM5539a);
    }

    /* renamed from: g */
    public final void m6096g(InterfaceC9544p interfaceC9544p) {
        this.f7653a = interfaceC9544p;
    }
}
