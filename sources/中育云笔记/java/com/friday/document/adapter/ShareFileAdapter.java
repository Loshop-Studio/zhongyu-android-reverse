package com.friday.document.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.TimeUtils;
import com.friday.document.R$color;
import com.friday.document.R$string;
import com.friday.document.adapter.ShareFileAdapter;
import com.friday.document.databinding.ItemListTeacherFileShareBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.model.ShareListEntity;
import java.util.List;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p215k2.AbstractC9796n;
import p325rc.AbstractC10947g0;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareFileAdapter extends ListAdapter<ShareListEntity, ViewHolder> {

    /* renamed from: a */
    public final InterfaceC9540l f6260a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PayloadKey {

        /* renamed from: c */
        public static final PayloadKey f6261c = new PayloadKey("SELECTED", 0);

        /* renamed from: d */
        public static final /* synthetic */ PayloadKey[] f6262d;

        /* renamed from: e */
        public static final /* synthetic */ InterfaceC11943a f6263e;

        static {
            PayloadKey[] payloadKeyArrM5493a = m5493a();
            f6262d = payloadKeyArrM5493a;
            f6263e = AbstractC9953a.m20230a(payloadKeyArrM5493a);
        }

        public PayloadKey(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ PayloadKey[] m5493a() {
            return new PayloadKey[]{f6261c};
        }

        public static PayloadKey valueOf(String str) {
            return (PayloadKey) Enum.valueOf(PayloadKey.class, str);
        }

        public static PayloadKey[] values() {
            return (PayloadKey[]) f6262d.clone();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ShareFileDiffUtilCallback extends DiffUtil.ItemCallback<ShareListEntity> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(ShareListEntity oldItem, ShareListEntity newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return AbstractC9979u.m20289b(oldItem.getShareFile().getFileId(), newItem.getShareFile().getFileId()) && AbstractC9979u.m20289b(oldItem.getShareFile().getFileName(), newItem.getShareFile().getFileName()) && AbstractC9979u.m20289b(oldItem.getShareFile().getShareTime(), newItem.getShareFile().getShareTime()) && AbstractC9979u.m20289b(oldItem.getShareFile().getUpdateTime(), newItem.getShareFile().getUpdateTime()) && oldItem.isSelected() == newItem.isSelected() && oldItem.getRoot() == newItem.getRoot();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(ShareListEntity oldItem, ShareListEntity newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return AbstractC9979u.m20289b(oldItem.getShareFile().getFileId(), newItem.getShareFile().getFileId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object getChangePayload(ShareListEntity oldItem, ShareListEntity newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            if (oldItem.isSelected() != newItem.isSelected()) {
                return PayloadKey.f6261c;
            }
            return null;
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemListTeacherFileShareBinding f6264c;

        /* renamed from: d */
        public final InterfaceC9540l f6265d;

        /* renamed from: e */
        public final /* synthetic */ ShareFileAdapter f6266e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final ShareFileAdapter shareFileAdapter, ItemListTeacherFileShareBinding binding, InterfaceC9540l onItemClick) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            AbstractC9979u.m20294g(onItemClick, "onItemClick");
            this.f6266e = shareFileAdapter;
            this.f6264c = binding;
            this.f6265d = onItemClick;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o2.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareFileAdapter.ViewHolder.m5498b(shareFileAdapter, this, view);
                }
            });
        }

        /* renamed from: b */
        public static final void m5498b(ShareFileAdapter shareFileAdapter, ViewHolder viewHolder, View view) {
            List<ShareListEntity> currentList = shareFileAdapter.getCurrentList();
            AbstractC9979u.m20293f(currentList, "getCurrentList(...)");
            ShareListEntity shareListEntity = (ShareListEntity) AbstractC10947g0.m23947p0(currentList, viewHolder.getBindingAdapterPosition());
            if (shareListEntity != null) {
                viewHolder.f6265d.invoke(shareListEntity);
            }
        }

        /* renamed from: c */
        public final void m5499c(ShareListEntity item) {
            AbstractC9979u.m20294g(item, "item");
            ShareFile shareFile = item.getShareFile();
            this.f6264c.f6477d.setImageResource(AbstractC9796n.f22990a.m19792d(shareFile.getType()));
            ItemListTeacherFileShareBinding itemListTeacherFileShareBinding = this.f6264c;
            itemListTeacherFileShareBinding.f6480g.setText(itemListTeacherFileShareBinding.getRoot().getContext().getString(R$string.share_by_owner, shareFile.getOwnerName()));
            this.f6264c.f6478e.setText(shareFile.getFileName());
            this.f6264c.f6479f.setText(item.getRoot() ? TimeUtils.millis2String(item.getShareFile().getLatestTimestamp()) : shareFile.getUpdateTime());
            m5500d(item);
        }

        /* renamed from: d */
        public final void m5500d(ShareListEntity item) {
            AbstractC9979u.m20294g(item, "item");
            int i10 = item.isSelected() ? R$color.select : R$color.transparent;
            ItemListTeacherFileShareBinding itemListTeacherFileShareBinding = this.f6264c;
            itemListTeacherFileShareBinding.f6476c.setBackgroundColor(ContextCompat.getColor(itemListTeacherFileShareBinding.getRoot().getContext(), i10));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileAdapter(InterfaceC9540l onItemClick) {
        super(new ShareFileDiffUtilCallback());
        AbstractC9979u.m20294g(onItemClick, "onItemClick");
        this.f6260a = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        ShareListEntity item = getItem(i10);
        AbstractC9979u.m20291d(item);
        holder.m5499c(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        ShareListEntity item = getItem(i10);
        if (payloads.isEmpty()) {
            AbstractC9979u.m20291d(item);
            holder.m5499c(item);
        } else if (payloads.contains(PayloadKey.f6261c)) {
            AbstractC9979u.m20291d(item);
            holder.m5500d(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemListTeacherFileShareBinding itemListTeacherFileShareBindingM5529a = ItemListTeacherFileShareBinding.m5529a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemListTeacherFileShareBindingM5529a, "inflate(...)");
        return new ViewHolder(this, itemListTeacherFileShareBindingM5529a, this.f6260a);
    }
}
