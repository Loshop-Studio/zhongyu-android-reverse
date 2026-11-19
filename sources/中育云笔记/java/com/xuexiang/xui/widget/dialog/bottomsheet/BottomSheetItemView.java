package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;

/* loaded from: classes5.dex */
public class BottomSheetItemView extends XUIAlphaLinearLayout {

    /* renamed from: d */
    public AppCompatImageView f15824d;

    /* renamed from: e */
    public ViewStub f15825e;

    /* renamed from: f */
    public TextView f15826f;

    public BottomSheetItemView(Context context) {
        super(context);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f15824d;
    }

    public ViewStub getSubScript() {
        return this.f15825e;
    }

    public TextView getTextView() {
        return this.f15826f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f15824d = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f15825e = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f15826f = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f15826f.getText().toString();
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
