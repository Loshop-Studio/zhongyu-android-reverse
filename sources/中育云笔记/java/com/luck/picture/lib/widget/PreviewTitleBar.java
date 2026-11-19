package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;
import p008a7.AbstractC0082o;

/* loaded from: classes5.dex */
public class PreviewTitleBar extends TitleBar {
    public PreviewTitleBar(Context context) {
        super(context);
    }

    @Override // com.luck.picture.lib.widget.TitleBar
    /* renamed from: d */
    public void mo9622d() {
        super.mo9622d();
        TitleBarStyle titleBarStyleM26628d = PictureSelectionConfig.f12295P0.m26628d();
        if (AbstractC0082o.m228c(titleBarStyleM26628d.m9556b())) {
            setBackgroundColor(titleBarStyleM26628d.m9556b());
        } else if (AbstractC0082o.m227b(titleBarStyleM26628d.m9559h())) {
            setBackgroundColor(titleBarStyleM26628d.m9559h());
        }
        if (AbstractC0082o.m228c(titleBarStyleM26628d.m9568q())) {
            this.f12660d.setImageResource(titleBarStyleM26628d.m9568q());
        } else if (AbstractC0082o.m228c(titleBarStyleM26628d.m9557c())) {
            this.f12660d.setImageResource(titleBarStyleM26628d.m9557c());
        }
        this.f12659c.setOnClickListener(null);
        this.f12666j.setOnClickListener(null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12659c.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.f12659c.setBackgroundResource(R$drawable.ps_ic_trans_1px);
        this.f12664h.setVisibility(8);
        this.f12661e.setVisibility(8);
        this.f12666j.setVisibility(8);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
