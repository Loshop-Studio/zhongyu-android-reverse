package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import p125h3.C8094b;

/* loaded from: classes4.dex */
public class BottomSheetItemView extends C8094b {

    /* renamed from: b */
    public AppCompatImageView f7308b;

    /* renamed from: c */
    public ViewStub f7309c;

    /* renamed from: d */
    public TextView f7310d;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f7308b;
    }

    public ViewStub getSubScript() {
        return this.f7309c;
    }

    public TextView getTextView() {
        return this.f7310d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7308b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f7309c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f7310d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f7310d.getText().toString();
    }
}
