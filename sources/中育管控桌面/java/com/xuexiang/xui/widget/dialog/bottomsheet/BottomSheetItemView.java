package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import p147s1.C7688b;

/* loaded from: classes3.dex */
public class BottomSheetItemView extends C7688b {

    /* renamed from: b */
    public AppCompatImageView f4779b;

    /* renamed from: c */
    public ViewStub f4780c;

    /* renamed from: d */
    public TextView f4781d;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f4779b;
    }

    public ViewStub getSubScript() {
        return this.f4780c;
    }

    public TextView getTextView() {
        return this.f4781d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4779b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f4780c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f4781d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f4781d.getText().toString();
    }
}
