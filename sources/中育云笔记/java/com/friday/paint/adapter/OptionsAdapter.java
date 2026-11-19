package com.friday.paint.adapter;

import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.OptionEntity;
import com.friday.paint.R$color;
import com.friday.paint.R$id;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OptionsAdapter extends BaseQuickAdapter<OptionEntity, BaseViewHolder> {
    public OptionsAdapter(int i10) {
        super(i10, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, OptionEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        CardView cardView = (CardView) holder.getView(R$id.cv_option);
        TextView textView = (TextView) holder.getView(R$id.tv_option);
        textView.setText(item.getOption());
        if (item.isSelected()) {
            cardView.setCardBackgroundColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
            textView.setTextColor(ContextCompat.getColor(getContext(), R$color.white));
        } else {
            cardView.setCardBackgroundColor(ContextCompat.getColor(getContext(), R$color.white));
            textView.setTextColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
        }
    }
}
