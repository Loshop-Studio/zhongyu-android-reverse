package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import p206p1.C9637b;

/* loaded from: classes4.dex */
public class BottomSheetItemView extends C9637b {

    /* renamed from: b */
    public AppCompatImageView f7436b;

    /* renamed from: c */
    public ViewStub f7437c;

    /* renamed from: d */
    public TextView f7438d;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f7436b;
    }

    public ViewStub getSubScript() {
        return this.f7437c;
    }

    public TextView getTextView() {
        return this.f7438d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7436b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f7437c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f7438d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f7438d.getText().toString();
    }
}
