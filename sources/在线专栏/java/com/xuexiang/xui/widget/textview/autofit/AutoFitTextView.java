package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.widget.textview.autofit.AutoFitHelper;

/* loaded from: classes.dex */
public class AutoFitTextView extends AppCompatTextView implements AutoFitHelper.OnTextSizeChangeListener {
    private AutoFitHelper mHelper;

    public AutoFitTextView(Context context) {
        this(context, null);
    }

    private void init(AttributeSet attributeSet, int i4) {
        this.mHelper = AutoFitHelper.create(this, attributeSet, i4).addOnTextSizeChangeListener(this);
    }

    public void enableFit() {
        setEnableFit(true);
    }

    public AutoFitHelper getAutofitHelper() {
        return this.mHelper;
    }

    public float getMaxTextSize() {
        return this.mHelper.getMaxTextSize();
    }

    public float getMinTextSize() {
        return this.mHelper.getMinTextSize();
    }

    public float getPrecision() {
        return this.mHelper.getPrecision();
    }

    public boolean isEnableFit() {
        return this.mHelper.isEnabled();
    }

    @Override // com.xuexiang.xui.widget.textview.autofit.AutoFitHelper.OnTextSizeChangeListener
    public void onTextSizeChange(float f4, float f5) {
    }

    public void setEnableFit(boolean z3) {
        this.mHelper.setEnabled(z3);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        super.setLines(i4);
        AutoFitHelper autoFitHelper = this.mHelper;
        if (autoFitHelper != null) {
            autoFitHelper.setMaxLines(i4);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        super.setMaxLines(i4);
        AutoFitHelper autoFitHelper = this.mHelper;
        if (autoFitHelper != null) {
            autoFitHelper.setMaxLines(i4);
        }
    }

    public void setMaxTextSize(float f4) {
        this.mHelper.setMaxTextSize(f4);
    }

    public void setMinTextSize(int i4) {
        this.mHelper.setMinTextSize(2, i4);
    }

    public void setPrecision(float f4) {
        this.mHelper.setPrecision(f4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i4, float f4) {
        super.setTextSize(i4, f4);
        AutoFitHelper autoFitHelper = this.mHelper;
        if (autoFitHelper != null) {
            autoFitHelper.setTextSize(i4, f4);
        }
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public void setMaxTextSize(int i4, float f4) {
        this.mHelper.setMaxTextSize(i4, f4);
    }

    public void setMinTextSize(int i4, float f4) {
        this.mHelper.setMinTextSize(i4, f4);
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(attributeSet, i4);
    }
}
