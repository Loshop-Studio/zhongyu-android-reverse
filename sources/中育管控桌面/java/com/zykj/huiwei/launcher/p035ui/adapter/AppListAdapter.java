package com.zykj.huiwei.launcher.p035ui.adapter;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.huiwei.launcher.bean.resp.AppData;
import com.zykj.huiwei.launcher.databinding.HwItemAppBinding;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6541k;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/chad/library/adapter/base/module/DraggableModule;", "<init>", "()V", "viewHolder", "", "viewType", "", "onItemViewHolderCreated", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "holder", "item", "f", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)V", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class AppListAdapter extends BaseQuickAdapter<AppData, BaseViewHolder> implements DraggableModule {
    /* JADX WARN: Multi-variable type inference failed */
    public AppListAdapter() {
        super(R.layout.hw_item_app, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.module.DraggableModule
    public BaseDraggableModule addDraggableModule(BaseQuickAdapter baseQuickAdapter) {
        return DraggableModule.DefaultImpls.addDraggableModule(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, AppData item) {
        AppCompatImageView appCompatImageView;
        TextView textView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        HwItemAppBinding hwItemAppBinding = (HwItemAppBinding) DataBindingUtil.getBinding(holder.itemView);
        if (hwItemAppBinding != null && (textView = hwItemAppBinding.tvName) != null) {
            textView.setText(item.getAppInfo().getLabel());
        }
        HwItemAppBinding hwItemAppBinding2 = (HwItemAppBinding) DataBindingUtil.getBinding(holder.itemView);
        if (hwItemAppBinding2 == null || (appCompatImageView = hwItemAppBinding2.ivIcon) == null) {
            return;
        }
        AbstractC6541k.m7330a(appCompatImageView).mo2543s(item.getAppInfo().getIcon()).m2527w0(appCompatImageView);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onItemViewHolderCreated(BaseViewHolder viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        DataBindingUtil.bind(viewHolder.itemView);
    }
}
