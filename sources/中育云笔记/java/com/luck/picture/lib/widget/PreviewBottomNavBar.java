package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import p008a7.AbstractC0082o;
import p260n6.InterfaceC10322a;

/* loaded from: classes5.dex */
public class PreviewBottomNavBar extends BottomNavBar {
    public PreviewBottomNavBar(Context context) {
        super(context);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    /* renamed from: c */
    public void mo9605c() {
        this.f12604c.setVisibility(8);
        this.f12605d.setOnClickListener(this);
        TextView textView = this.f12605d;
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        textView.setVisibility(8);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    /* renamed from: f */
    public void mo9608f() {
        super.mo9608f();
        BottomNavBarStyle bottomNavBarStyleM26626b = PictureSelectionConfig.f12295P0.m26626b();
        if (AbstractC0082o.m228c(bottomNavBarStyleM26626b.m9489m())) {
            setBackgroundColor(bottomNavBarStyleM26626b.m9489m());
        } else if (AbstractC0082o.m227b(bottomNavBarStyleM26626b.m9483g())) {
            setBackgroundColor(bottomNavBarStyleM26626b.m9483g());
        }
    }

    public TextView getEditor() {
        return this.f12605d;
    }

    /* renamed from: i */
    public void m9621i(boolean z10) {
        TextView textView = this.f12605d;
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        textView.setVisibility(8);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar, android.view.View.OnClickListener
    public void onClick(View view) {
        BottomNavBar.C7508b c7508b;
        super.onClick(view);
        if (view.getId() != R$id.ps_tv_editor || (c7508b = this.f12608g) == null) {
            return;
        }
        c7508b.mo9092b();
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
