package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p113c.p114a.p116e.p117a.C0792b;

/* loaded from: classes.dex */
public class BottomSheetItemView extends C0792b {

    /* renamed from: c */
    public AppCompatImageView f5156c;

    /* renamed from: d */
    public ViewStub f5157d;

    /* renamed from: e */
    public TextView f5158e;

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.f5156c;
    }

    public ViewStub getSubScript() {
        return this.f5157d;
    }

    public TextView getTextView() {
        return this.f5158e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5156c = (AppCompatImageView) findViewById(C1088R.id.grid_item_image);
        this.f5157d = (ViewStub) findViewById(C1088R.id.grid_item_subscript);
        this.f5158e = (TextView) findViewById(C1088R.id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.f5158e.getText().toString();
    }
}
