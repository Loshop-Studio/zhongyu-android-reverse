package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;

/* loaded from: classes3.dex */
public class BottomSheetItemView extends XUIAlphaLinearLayout {

    /* renamed from: b */
    public AppCompatImageView f4252b;

    /* renamed from: c */
    public ViewStub f4253c;

    /* renamed from: d */
    public TextView f4254d;

    public BottomSheetItemView(Context context) {
        super(context);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f4252b;
    }

    public ViewStub getSubScript() {
        return this.f4253c;
    }

    public TextView getTextView() {
        return this.f4254d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4252b = (AppCompatImageView) findViewById(R$id.grid_item_image);
        this.f4253c = (ViewStub) findViewById(R$id.grid_item_subscript);
        this.f4254d = (TextView) findViewById(R$id.grid_item_title);
    }

    @Override // android.view.View
    public final String toString() {
        return this.f4254d.getText().toString();
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
