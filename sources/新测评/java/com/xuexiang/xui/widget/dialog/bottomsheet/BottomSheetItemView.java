package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import p219r2.C9001b;

/* loaded from: classes4.dex */
public class BottomSheetItemView extends C9001b {

    /* renamed from: b */
    public AppCompatImageView f6055b;

    /* renamed from: c */
    public ViewStub f6056c;

    /* renamed from: d */
    public TextView f6057d;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f6055b;
    }

    public ViewStub getSubScript() {
        return this.f6056c;
    }

    public TextView getTextView() {
        return this.f6057d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6055b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f6056c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f6057d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f6057d.getText().toString();
    }
}
