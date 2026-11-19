package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import io.github.inflationx.calligraphy3.HasTypeface;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class SuperTextView extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public GradientDrawable f5103a;

    public SuperTextView(Context context) {
        super(context);
        AbstractC6582a.m6217a();
        throw null;
    }

    private void setDefaultCenterViewClickListener(BaseTextView baseTextView) {
    }

    private void setDefaultLeftViewClickListener(BaseTextView baseTextView) {
    }

    private void setDefaultRightViewClickListener(BaseTextView baseTextView) {
    }

    /* renamed from: a */
    public final GradientDrawable m3623a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f5103a = gradientDrawable;
        gradientDrawable.setShape(0);
        if (i == 16842910 || i != 16842919) {
            this.f5103a.setColor(0);
        } else {
            this.f5103a.setColor(0);
        }
        this.f5103a.setStroke(0, 0, 0.0f, 0.0f);
        this.f5103a.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        return this.f5103a;
    }

    public String getCenterBottomString() {
        return "";
    }

    public TextView getCenterBottomTextView() {
        return null;
    }

    @Nullable
    public EditText getCenterEditText() {
        return null;
    }

    public String getCenterEditValue() {
        return "";
    }

    public String getCenterString() {
        return "";
    }

    public TextView getCenterTextView() {
        return null;
    }

    public String getCenterTopString() {
        return "";
    }

    public TextView getCenterTopTextView() {
        return null;
    }

    public boolean getCheckBoxIsChecked() {
        return false;
    }

    public String getLeftBottomString() {
        return "";
    }

    public TextView getLeftBottomTextView() {
        return null;
    }

    public ImageView getLeftIconIV() {
        throw null;
    }

    public String getLeftString() {
        return "";
    }

    public TextView getLeftTextView() {
        return null;
    }

    public String getLeftTopString() {
        return "";
    }

    public TextView getLeftTopTextView() {
        return null;
    }

    public String getRightBottomString() {
        return "";
    }

    public TextView getRightBottomTextView() {
        return null;
    }

    public ImageView getRightIconIV() {
        throw null;
    }

    public String getRightString() {
        return "";
    }

    public TextView getRightTextView() {
        return null;
    }

    public String getRightTopString() {
        return "";
    }

    public TextView getRightTopTextView() {
        return null;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m3623a(R.attr.state_pressed));
        stateListDrawable.addState(new int[0], m3623a(R.attr.state_enabled));
        return stateListDrawable;
    }

    public boolean getSwitchIsChecked() {
        return false;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
    }

    public SuperTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC6582a.m6217a();
        throw null;
    }

    public SuperTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC6582a.m6217a();
        throw null;
    }
}
