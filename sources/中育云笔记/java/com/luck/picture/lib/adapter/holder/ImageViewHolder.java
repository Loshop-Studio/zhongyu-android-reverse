package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0082o;
import p235l6.AbstractC10149c;

/* loaded from: classes5.dex */
public class ImageViewHolder extends BaseRecyclerMediaHolder {

    /* renamed from: n */
    public final ImageView f12194n;

    /* renamed from: o */
    public final TextView f12195o;

    public ImageViewHolder(View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        this.f12195o = (TextView) view.findViewById(R$id.tv_media_tag);
        ImageView imageView = (ImageView) view.findViewById(R$id.ivEditor);
        this.f12194n = imageView;
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        int iM9541o = selectMainStyleM26627c.m9541o();
        if (AbstractC0082o.m228c(iM9541o)) {
            imageView.setImageResource(iM9541o);
        }
        int[] iArrM9540n = selectMainStyleM26627c.m9540n();
        if (AbstractC0082o.m226a(iArrM9540n) && (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).removeRule(12);
            for (int i10 : iArrM9540n) {
                ((RelativeLayout.LayoutParams) this.f12194n.getLayoutParams()).addRule(i10);
            }
        }
        int[] iArrM9551y = selectMainStyleM26627c.m9551y();
        if (AbstractC0082o.m226a(iArrM9551y) && (this.f12195o.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) this.f12195o.getLayoutParams()).removeRule(21);
            ((RelativeLayout.LayoutParams) this.f12195o.getLayoutParams()).removeRule(12);
            for (int i11 : iArrM9551y) {
                ((RelativeLayout.LayoutParams) this.f12195o.getLayoutParams()).addRule(i11);
            }
        }
        int iM9550x = selectMainStyleM26627c.m9550x();
        if (AbstractC0082o.m228c(iM9550x)) {
            this.f12195o.setBackgroundResource(iM9550x);
        }
        int iM9504A = selectMainStyleM26627c.m9504A();
        if (AbstractC0082o.m227b(iM9504A)) {
            this.f12195o.setTextSize(iM9504A);
        }
        int iM9552z = selectMainStyleM26627c.m9552z();
        if (AbstractC0082o.m228c(iM9552z)) {
            this.f12195o.setTextColor(iM9552z);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    /* renamed from: d */
    public void mo9158d(LocalMedia localMedia, int i10) {
        super.mo9158d(localMedia, i10);
        if (localMedia.m9347H() && localMedia.m9346G()) {
            this.f12194n.setVisibility(0);
        } else {
            this.f12194n.setVisibility(8);
        }
        this.f12195o.setVisibility(0);
        if (AbstractC10149c.m21177f(localMedia.m9397t())) {
            this.f12195o.setText(this.f12177f.getString(R$string.ps_gif_tag));
            return;
        }
        if (AbstractC10149c.m21181j(localMedia.m9397t())) {
            this.f12195o.setText(this.f12177f.getString(R$string.ps_webp_tag));
        } else if (AbstractC0075h.m190m(localMedia.m9343D(), localMedia.m9393r())) {
            this.f12195o.setText(this.f12177f.getString(R$string.ps_long_chart));
        } else {
            this.f12195o.setVisibility(8);
        }
    }
}
