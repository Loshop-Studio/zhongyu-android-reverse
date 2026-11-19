package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0071d;
import p008a7.AbstractC0082o;

/* loaded from: classes5.dex */
public class AudioViewHolder extends BaseRecyclerMediaHolder {

    /* renamed from: n */
    public final TextView f12166n;

    public AudioViewHolder(View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        TextView textView = (TextView) view.findViewById(R$id.tv_duration);
        this.f12166n = textView;
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        int iM9536j = selectMainStyleM26627c.m9536j();
        if (AbstractC0082o.m228c(iM9536j)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(iM9536j, 0, 0, 0);
        }
        int iM9539m = selectMainStyleM26627c.m9539m();
        if (AbstractC0082o.m227b(iM9539m)) {
            textView.setTextSize(iM9539m);
        }
        int iM9538l = selectMainStyleM26627c.m9538l();
        if (AbstractC0082o.m228c(iM9538l)) {
            textView.setTextColor(iM9538l);
        }
        int iM9535i = selectMainStyleM26627c.m9535i();
        if (AbstractC0082o.m228c(iM9535i)) {
            textView.setBackgroundResource(iM9535i);
        }
        int[] iArrM9537k = selectMainStyleM26627c.m9537k();
        if (AbstractC0082o.m226a(iArrM9537k) && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).removeRule(12);
            for (int i10 : iArrM9537k) {
                ((RelativeLayout.LayoutParams) this.f12166n.getLayoutParams()).addRule(i10);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    /* renamed from: d */
    public void mo9158d(LocalMedia localMedia, int i10) {
        super.mo9158d(localMedia, i10);
        this.f12166n.setText(AbstractC0071d.m153b(localMedia.m9389p()));
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    /* renamed from: h */
    public void mo9159h(String str) {
        this.f12174c.setImageResource(R$drawable.ps_audio_placeholder);
    }
}
