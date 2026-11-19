package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import p089l0.C4335b;

/* loaded from: classes2.dex */
public class BottomSheetItemView extends C4335b {

    /* renamed from: b */
    public AppCompatImageView f3393b;

    /* renamed from: c */
    public ViewStub f3394c;

    /* renamed from: d */
    public TextView f3395d;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f3393b;
    }

    public ViewStub getSubScript() {
        return this.f3394c;
    }

    public TextView getTextView() {
        return this.f3395d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3393b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f3394c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f3395d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f3395d.getText().toString();
    }
}
