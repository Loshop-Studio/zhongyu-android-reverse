package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AutoFitLayout extends FrameLayout {
    private boolean mEnabled;
    private WeakHashMap<View, AutoFitHelper> mHelpers;
    private float mMinTextSize;
    private float mPrecision;

    public AutoFitLayout(Context context) {
        super(context);
        this.mHelpers = new WeakHashMap<>();
        init(context, null, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        boolean z3 = true;
        int dimensionPixelSize = -1;
        float f4 = -1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.AutoFitTextView, i4, 0);
            z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.AutoFitTextView_aftv_enable, true);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.AutoFitTextView_aftv_minTextSize, -1);
            f4 = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.AutoFitTextView_aftv_precision, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mEnabled = z3;
        this.mMinTextSize = dimensionPixelSize;
        this.mPrecision = f4;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            AutoFitHelper enabled = AutoFitHelper.create(textView).setEnabled(this.mEnabled);
            float f4 = this.mPrecision;
            if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                enabled.setPrecision(f4);
            }
            float f5 = this.mMinTextSize;
            if (f5 > IGoodView.DEFAULT_TO_ALPHA) {
                enabled.setMinTextSize(0, f5);
            }
            this.mHelpers.put(textView, enabled);
        }
    }

    public AutoFitHelper getAutofitHelper(TextView textView) {
        return this.mHelpers.get(textView);
    }

    public AutoFitHelper getAutofitHelper(int i4) {
        return this.mHelpers.get(getChildAt(i4));
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHelpers = new WeakHashMap<>();
        init(context, attributeSet, 0);
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mHelpers = new WeakHashMap<>();
        init(context, attributeSet, i4);
    }
}
