package com.zykj.huiwei.launcher.p035ui.adapter;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.huiwei.launcher.bean.AvatarItem;
import com.zykj.huiwei.launcher.databinding.HwItemAvatarBinding;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/zykj/huiwei/launcher/bean/AvatarItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "viewHolder", "", "viewType", "", "onItemViewHolderCreated", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "holder", "item", "f", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/zykj/huiwei/launcher/bean/AvatarItem;)V", "", "a", "J", "g", "()J", "h", "(J)V", "selectId", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAvatarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarAdapter.kt\ncom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,28:1\n257#2,2:29\n*S KotlinDebug\n*F\n+ 1 AvatarAdapter.kt\ncom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter\n*L\n25#1:29,2\n*E\n"})
/* loaded from: classes4.dex */
public final class AvatarAdapter extends BaseQuickAdapter<AvatarItem, BaseViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public long selectId;

    public AvatarAdapter() {
        super(R.layout.hw_item_avatar, null, 2, null);
        this.selectId = -1L;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, AvatarItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        HwItemAvatarBinding hwItemAvatarBinding = (HwItemAvatarBinding) DataBindingUtil.getBinding(holder.itemView);
        if (hwItemAvatarBinding != null) {
            AppCompatImageView ivAvatar = hwItemAvatarBinding.ivAvatar;
            Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
            CommonExtKt.m5314g(ivAvatar, item.getUrl(), R.drawable.hw_ic_default_person, R.drawable.hw_ic_default_person);
            AppCompatImageView ivChecked = hwItemAvatarBinding.ivChecked;
            Intrinsics.checkNotNullExpressionValue(ivChecked, "ivChecked");
            ivChecked.setVisibility((this.selectId > item.getId() ? 1 : (this.selectId == item.getId() ? 0 : -1)) == 0 ? 0 : 8);
        }
    }

    /* renamed from: g, reason: from getter */
    public final long getSelectId() {
        return this.selectId;
    }

    /* renamed from: h */
    public final void m5606h(long j6) {
        this.selectId = j6;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onItemViewHolderCreated(BaseViewHolder viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        DataBindingUtil.bind(viewHolder.itemView);
    }
}
