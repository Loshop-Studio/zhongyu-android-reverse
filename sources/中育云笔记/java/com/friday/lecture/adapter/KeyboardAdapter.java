package com.friday.lecture.adapter;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.model.ConnectMode;
import com.friday.lecture.model.KeyboardData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class KeyboardAdapter extends BaseMultiItemQuickAdapter<KeyboardData, BaseViewHolder> {

    /* renamed from: b */
    public int f8483b;

    public KeyboardAdapter() {
        super(null, 1, null);
        m4650i(0, R$layout.item_keyboard_number);
        m4650i(1, R$layout.item_keyboard_backspace);
        this.f8483b = Utils.getApp().getResources().getDimensionPixelSize(R$dimen.view_32);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, KeyboardData item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        View view = holder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.f8483b;
        view.setLayoutParams(layoutParams);
        if (item.getItemType() == 0) {
            holder.setText(R$id.tv_number, item.getValue());
        }
    }

    /* renamed from: l */
    public final void m6496l(ConnectMode connectMode) throws Resources.NotFoundException {
        int dimensionPixelSize;
        AbstractC9979u.m20294g(connectMode, "connectMode");
        if (AbstractC9979u.m20289b(connectMode, ConnectMode.Code.INSTANCE)) {
            dimensionPixelSize = Utils.getApp().getResources().getDimensionPixelSize(R$dimen.view_32);
        } else {
            if (!AbstractC9979u.m20289b(connectMode, ConnectMode.C6153IP.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = Utils.getApp().getResources().getDimensionPixelSize(R$dimen.view_26);
        }
        this.f8483b = dimensionPixelSize;
        notifyDataSetChanged();
    }
}
