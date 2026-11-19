package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes.dex */
public class BaseTextView extends LinearLayout implements HasTypeface {
    private LinearLayout.LayoutParams mBottomTVParams;
    private TextView mBottomTextView;
    private LinearLayout.LayoutParams mCenterTVParams;
    private TextView mCenterTextView;
    private Context mContext;
    private LinearLayout.LayoutParams mTopTVParams;
    private TextView mTopTextView;

    public BaseTextView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setOrientation(1);
        this.mContext = context;
        initView();
    }

    private void initBottomView() {
        LinearLayout.LayoutParams layoutParams = this.mBottomTVParams;
        if (layoutParams == null) {
            this.mBottomTVParams = getParams(layoutParams);
        }
        TextView textView = this.mBottomTextView;
        if (textView == null) {
            this.mBottomTextView = initTextView(this.mBottomTVParams, textView);
        }
    }

    private void initCenterView() {
        LinearLayout.LayoutParams layoutParams = this.mCenterTVParams;
        if (layoutParams == null) {
            this.mCenterTVParams = getParams(layoutParams);
        }
        TextView textView = this.mCenterTextView;
        if (textView == null) {
            this.mCenterTextView = initTextView(this.mCenterTVParams, textView);
        }
    }

    private TextView initTextView(LinearLayout.LayoutParams layoutParams, TextView textView) {
        TextView textView2 = getTextView(textView, layoutParams);
        textView2.setGravity(17);
        addView(textView2);
        return textView2;
    }

    private void initTopView() {
        LinearLayout.LayoutParams layoutParams = this.mTopTVParams;
        if (layoutParams == null) {
            this.mTopTVParams = getParams(layoutParams);
        }
        TextView textView = this.mTopTextView;
        if (textView == null) {
            this.mTopTextView = initTextView(this.mTopTVParams, textView);
        }
    }

    private void initView() {
        initTopView();
        initCenterView();
        initBottomView();
    }

    private void setTextString(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    public TextView getBottomTextView() {
        return this.mBottomTextView;
    }

    public TextView getCenterTextView() {
        return this.mCenterTextView;
    }

    public LinearLayout.LayoutParams getParams(LinearLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams;
    }

    public TextView getTextView(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(this.mContext);
        textView2.setLayoutParams(layoutParams);
        textView2.setVisibility(8);
        return textView2;
    }

    public TextView getTopTextView() {
        return this.mTopTextView;
    }

    public void setBottomTextString(CharSequence charSequence) {
        setTextString(this.mBottomTextView, charSequence);
    }

    public void setCenterSpaceHeight(int i4) {
        int i5 = i4 / 2;
        this.mTopTVParams.setMargins(0, 0, 0, i5);
        this.mCenterTVParams.setMargins(0, i5, 0, i5);
        this.mBottomTVParams.setMargins(0, i5, 0, 0);
    }

    public void setCenterTextString(CharSequence charSequence) {
        setTextString(this.mCenterTextView, charSequence);
    }

    public void setMaxEms(int i4, int i5, int i6) {
        this.mTopTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.mCenterTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.mBottomTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.mTopTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
        this.mCenterTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i5)});
        this.mBottomTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i6)});
    }

    public void setTopTextString(CharSequence charSequence) {
        setTextString(this.mTopTextView, charSequence);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.mTopTextView;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.mCenterTextView;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.mBottomTextView;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context);
    }
}
