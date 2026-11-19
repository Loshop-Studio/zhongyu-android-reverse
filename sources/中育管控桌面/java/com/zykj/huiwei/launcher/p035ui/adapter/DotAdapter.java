package com.zykj.huiwei.launcher.p035ui.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/DotAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Landroidx/fragment/app/Fragment;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "holder", "item", "", "f", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroidx/fragment/app/Fragment;)V", "", RequestParameters.POSITION, "g", "(I)V", "a", "I", "currentPosition", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class DotAdapter extends BaseQuickAdapter<Fragment, BaseViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public DotAdapter() {
        super(R.layout.hw_item_dot, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, Fragment item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.itemView.setSelected(this.currentPosition == holder.getBindingAdapterPosition());
    }

    /* renamed from: g */
    public final void m5608g(int position) {
        this.currentPosition = position;
        notifyDataSetChanged();
    }
}
