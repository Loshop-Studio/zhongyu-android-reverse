package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;

/* loaded from: classes.dex */
public class BottomSheetItemView extends XUIAlphaLinearLayout {
    private AppCompatImageView mAppCompatImageView;
    private ViewStub mSubScript;
    private TextView mTextView;

    public BottomSheetItemView(Context context) {
        super(context);
    }

    public AppCompatImageView getAppCompatImageView() {
        return this.mAppCompatImageView;
    }

    public ViewStub getSubScript() {
        return this.mSubScript;
    }

    public TextView getTextView() {
        return this.mTextView;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mAppCompatImageView = (AppCompatImageView) findViewById(C2042R.id.grid_item_image);
        this.mSubScript = (ViewStub) findViewById(C2042R.id.grid_item_subscript);
        this.mTextView = (TextView) findViewById(C2042R.id.grid_item_title);
    }

    @Override // android.view.View
    public String toString() {
        return this.mTextView.getText().toString();
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
