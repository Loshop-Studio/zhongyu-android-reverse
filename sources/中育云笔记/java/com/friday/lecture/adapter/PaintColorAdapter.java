package com.friday.lecture.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$id;
import com.friday.lecture.model.PaintColorEntity;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaintColorAdapter extends BaseQuickAdapter<PaintColorEntity, BaseViewHolder> {
    public PaintColorAdapter(int i10) {
        super(i10, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, PaintColorEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        ImageView imageView = (ImageView) holder.getView(R$id.iv_color);
        if (item.getSelected()) {
            AbstractC9979u.m20291d(((C5815g) ComponentCallbacks2C5810b.m3947u(imageView).m4014r(Integer.valueOf(R$drawable.paint_color_selected)).m26555k()).m3981A0(imageView));
        } else {
            imageView.setImageResource(0);
        }
        imageView.setBackgroundColor(item.getColor());
    }
}
