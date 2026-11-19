package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AutoFitHelper {
    private static final int DEFAULT_MIN_TEXT_SIZE = 8;
    private static final float DEFAULT_PRECISION = 0.5f;
    private boolean mEnabled;
    private boolean mIsAutoFitting;
    private ArrayList<OnTextSizeChangeListener> mListeners;
    private int mMaxLines;
    private float mMaxTextSize;
    private float mMinTextSize;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private TextPaint mPaint;
    private float mPrecision;
    private float mTextSize;
    private TextView mTextView;
    private TextWatcher mTextWatcher;

    private class AutoFitOnLayoutChangeListener implements View.OnLayoutChangeListener {
        private AutoFitOnLayoutChangeListener() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            AutoFitHelper.this.autoFit();
        }
    }

    private class AutofitTextWatcher implements TextWatcher {
        private AutofitTextWatcher() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            AutoFitHelper.this.autoFit();
        }
    }

    public interface OnTextSizeChangeListener {
        void onTextSizeChange(float f4, float f5);
    }

    private AutoFitHelper(TextView textView) {
        this.mTextWatcher = new AutofitTextWatcher();
        this.mOnLayoutChangeListener = new AutoFitOnLayoutChangeListener();
        float f4 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.mTextView = textView;
        this.mPaint = new TextPaint();
        setRawTextSize(textView.getTextSize());
        this.mMaxLines = getMaxLines(textView);
        this.mMinTextSize = f4 * 8.0f;
        this.mMaxTextSize = this.mTextSize;
        this.mPrecision = DEFAULT_PRECISION;
    }

    private static void autoFit(TextView textView, TextPaint textPaint, float f4, float f5, int i4, float f6) {
        int width;
        if (i4 <= 0 || i4 == Integer.MAX_VALUE || (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) <= 0) {
            return;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, textView);
        }
        Context context = textView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f5);
        float autoFitTextSize = ((i4 != 1 || textPaint.measureText(text, 0, text.length()) <= ((float) width)) && getLineCount(text, textPaint, f5, (float) width, displayMetrics) <= i4) ? f5 : getAutoFitTextSize(text, textPaint, width, i4, IGoodView.DEFAULT_TO_ALPHA, f5, f6, displayMetrics);
        if (autoFitTextSize < f4) {
            autoFitTextSize = f4;
        }
        textView.setTextSize(0, autoFitTextSize);
    }

    public static AutoFitHelper create(TextView textView) {
        return create(textView, null, 0);
    }

    private static float getAutoFitTextSize(CharSequence charSequence, TextPaint textPaint, float f4, int i4, float f5, float f6, float f7, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int lineCount;
        float fMeasureText;
        float f8 = (f5 + f6) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f8, displayMetrics));
        if (i4 != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f4, Layout.Alignment.ALIGN_NORMAL, 1.0f, IGoodView.DEFAULT_TO_ALPHA, true);
            lineCount = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            lineCount = 1;
        }
        if (lineCount > i4) {
            return f6 - f5 < f7 ? f5 : getAutoFitTextSize(charSequence, textPaint, f4, i4, f5, f8, f7, displayMetrics);
        }
        if (lineCount < i4) {
            return getAutoFitTextSize(charSequence, textPaint, f4, i4, f8, f6, f7, displayMetrics);
        }
        float lineWidth = IGoodView.DEFAULT_TO_ALPHA;
        if (i4 == 1) {
            fMeasureText = textPaint.measureText(charSequence, 0, charSequence.length());
        } else {
            for (int i5 = 0; i5 < lineCount; i5++) {
                if (staticLayout.getLineWidth(i5) > lineWidth) {
                    lineWidth = staticLayout.getLineWidth(i5);
                }
            }
            fMeasureText = lineWidth;
        }
        return f6 - f5 < f7 ? f5 : fMeasureText > f4 ? getAutoFitTextSize(charSequence, textPaint, f4, i4, f5, f8, f7, displayMetrics) : fMeasureText < f4 ? getAutoFitTextSize(charSequence, textPaint, f4, i4, f8, f6, f7, displayMetrics) : f8;
    }

    private static int getLineCount(CharSequence charSequence, TextPaint textPaint, float f4, float f5, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f4, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f5, Layout.Alignment.ALIGN_NORMAL, 1.0f, IGoodView.DEFAULT_TO_ALPHA, true).getLineCount();
    }

    private static int getMaxLines(TextView textView) {
        if (textView.getTransformationMethod() instanceof SingleLineTransformationMethod) {
            return 1;
        }
        return textView.getMaxLines();
    }

    private void sendTextSizeChange(float f4, float f5) {
        ArrayList<OnTextSizeChangeListener> arrayList = this.mListeners;
        if (arrayList == null) {
            return;
        }
        Iterator<OnTextSizeChangeListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onTextSizeChange(f4, f5);
        }
    }

    private void setRawMaxTextSize(float f4) {
        if (f4 != this.mMaxTextSize) {
            this.mMaxTextSize = f4;
            autoFit();
        }
    }

    private void setRawMinTextSize(float f4) {
        if (f4 != this.mMinTextSize) {
            this.mMinTextSize = f4;
            autoFit();
        }
    }

    private void setRawTextSize(float f4) {
        if (this.mTextSize != f4) {
            this.mTextSize = f4;
        }
    }

    public AutoFitHelper addOnTextSizeChangeListener(OnTextSizeChangeListener onTextSizeChangeListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(onTextSizeChangeListener);
        return this;
    }

    public float getMaxTextSize() {
        return this.mMaxTextSize;
    }

    public float getMinTextSize() {
        return this.mMinTextSize;
    }

    public float getPrecision() {
        return this.mPrecision;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public AutoFitHelper removeOnTextSizeChangeListener(OnTextSizeChangeListener onTextSizeChangeListener) {
        ArrayList<OnTextSizeChangeListener> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(onTextSizeChangeListener);
        }
        return this;
    }

    public AutoFitHelper setEnabled(boolean z3) {
        if (this.mEnabled != z3) {
            this.mEnabled = z3;
            if (z3) {
                this.mTextView.addTextChangedListener(this.mTextWatcher);
                this.mTextView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
                autoFit();
            } else {
                this.mTextView.removeTextChangedListener(this.mTextWatcher);
                this.mTextView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
                this.mTextView.setTextSize(0, this.mTextSize);
            }
        }
        return this;
    }

    public AutoFitHelper setMaxLines(int i4) {
        if (this.mMaxLines != i4) {
            this.mMaxLines = i4;
            autoFit();
        }
        return this;
    }

    public AutoFitHelper setMaxTextSize(float f4) {
        return setMaxTextSize(2, f4);
    }

    public AutoFitHelper setMinTextSize(float f4) {
        return setMinTextSize(2, f4);
    }

    public AutoFitHelper setPrecision(float f4) {
        if (this.mPrecision != f4) {
            this.mPrecision = f4;
            autoFit();
        }
        return this;
    }

    public void setTextSize(float f4) {
        setTextSize(2, f4);
    }

    public static AutoFitHelper create(TextView textView, AttributeSet attributeSet) {
        return create(textView, attributeSet, 0);
    }

    public AutoFitHelper setMaxTextSize(int i4, float f4) {
        Context context = this.mTextView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        setRawMaxTextSize(TypedValue.applyDimension(i4, f4, system.getDisplayMetrics()));
        return this;
    }

    public AutoFitHelper setMinTextSize(int i4, float f4) {
        Context context = this.mTextView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        setRawMinTextSize(TypedValue.applyDimension(i4, f4, system.getDisplayMetrics()));
        return this;
    }

    public void setTextSize(int i4, float f4) {
        if (this.mIsAutoFitting) {
            return;
        }
        Context context = this.mTextView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        setRawTextSize(TypedValue.applyDimension(i4, f4, system.getDisplayMetrics()));
    }

    public static AutoFitHelper create(TextView textView, AttributeSet attributeSet, int i4) {
        AutoFitHelper autoFitHelper = new AutoFitHelper(textView);
        boolean z3 = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int minTextSize = (int) autoFitHelper.getMinTextSize();
            float precision = autoFitHelper.getPrecision();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.AutoFitTextView, i4, 0);
            z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.AutoFitTextView_aftv_enable, true);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.AutoFitTextView_aftv_minTextSize, minTextSize);
            float f4 = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.AutoFitTextView_aftv_precision, precision);
            typedArrayObtainStyledAttributes.recycle();
            autoFitHelper.setMinTextSize(0, dimensionPixelSize).setPrecision(f4);
        }
        autoFitHelper.setEnabled(z3);
        return autoFitHelper;
    }

    public int getMaxLines() {
        return this.mMaxLines;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void autoFit() {
        float textSize = this.mTextView.getTextSize();
        this.mIsAutoFitting = true;
        autoFit(this.mTextView, this.mPaint, this.mMinTextSize, this.mMaxTextSize, this.mMaxLines, this.mPrecision);
        this.mIsAutoFitting = false;
        float textSize2 = this.mTextView.getTextSize();
        if (textSize2 != textSize) {
            sendTextSizeChange(textSize2, textSize);
        }
    }
}
