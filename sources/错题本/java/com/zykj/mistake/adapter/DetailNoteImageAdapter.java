package com.zykj.mistake.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.mistake.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DetailNoteImageAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public DetailNoteImageAdapter() {
        super(R.layout.item_list_note_image);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public final void mo2494b(BaseViewHolder holder, Object obj) {
        String item = (String) obj;
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(item, "item");
        ImageView imageView = (ImageView) holder.getView(R.id.iv_image);
        if (item.length() > 0) {
            ((C3412f) ComponentCallbacks2C3408b.m2362e(imageView.getContext()).m2386l(item).m6087h(R.mipmap.pic_error)).m2378y(imageView);
        } else {
            imageView.setImageDrawable(null);
        }
    }
}
