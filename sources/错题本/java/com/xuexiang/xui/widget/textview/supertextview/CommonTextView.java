package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xuexiang.xui.R$id;
import io.github.inflationx.calligraphy3.HasTypeface;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class CommonTextView extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public final Context f5069a;

    /* renamed from: b */
    public ImageView f5070b;

    public CommonTextView(Context context) {
        super(context);
        this.f5069a = context;
        AbstractC6582a.m6217a();
        throw null;
    }

    public CharSequence getCenterBottomTextString() {
        return "";
    }

    public CharSequence getCenterTextString() {
        return "";
    }

    public CharSequence getCenterTopTextString() {
        return "";
    }

    public CharSequence getLeftBottomTextString() {
        return "";
    }

    public ImageView getLeftImageView() {
        if (this.f5070b == null) {
            this.f5070b = new ImageView(this.f5069a);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9, -1);
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(0, 0, 0, 0);
            this.f5070b.setScaleType(ImageView.ScaleType.CENTER);
            this.f5070b.setId(R$id.cLeftImageViewId);
            this.f5070b.setLayoutParams(layoutParams);
            addView(this.f5070b);
        }
        return this.f5070b;
    }

    public CharSequence getLeftTextString() {
        return "";
    }

    public CharSequence getLeftTopTextString() {
        return "";
    }

    public CharSequence getRightBottomTextString() {
        return "";
    }

    public CharSequence getRightTextString() {
        return "";
    }

    public CharSequence getRightTopTextString() {
        return "";
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
    }

    public CommonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5069a = context;
        AbstractC6582a.m6217a();
        throw null;
    }

    public CommonTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5069a = context;
        AbstractC6582a.m6217a();
        throw null;
    }
}
