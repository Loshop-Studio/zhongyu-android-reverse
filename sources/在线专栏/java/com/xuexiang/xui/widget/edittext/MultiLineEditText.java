package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;

/* loaded from: classes.dex */
public class MultiLineEditText extends LinearLayout {
    private Drawable mContentBackground;
    private int mContentPadding;
    private String mContentText;
    private int mContentTextColor;
    private int mContentTextSize;
    private float mContentViewHeight;
    private EditText mEtInput;
    private String mHintText;
    private int mHintTextColor;
    private boolean mIgnoreCnOrEn;
    private boolean mIsFixHeight;
    private boolean mIsShowSurplusNumber;
    private int mMaxCount;
    private TextWatcher mTextWatcher;
    private TextView mTvInputNumber;

    public MultiLineEditText(Context context) {
        this(context, null);
    }

    private long calculateContentLength(String str) {
        return this.mIgnoreCnOrEn ? calculateLengthIgnoreCnOrEn(str) : calculateLength(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateLength(CharSequence charSequence) {
        double d4 = 0.0d;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char cCharAt = charSequence.charAt(i4);
            d4 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
        }
        return Math.round(d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateLengthIgnoreCnOrEn(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configCount() {
        if (this.mIgnoreCnOrEn) {
            updateCount(calculateLengthIgnoreCnOrEn(this.mEtInput.getText().toString()));
        } else {
            updateCount((int) calculateLength(this.mEtInput.getText().toString()));
        }
    }

    private int getSubStringIndex(String str) {
        if (!this.mIgnoreCnOrEn) {
            double d4 = 0.0d;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                d4 += (cCharAt <= 0 || cCharAt >= 127) ? 1.0d : 0.5d;
                if (Math.round(d4) == this.mMaxCount) {
                    return i4 + 1;
                }
            }
        }
        return this.mMaxCount;
    }

    private void init() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C2042R.layout.xui_layout_multiline_edittext, this);
        this.mEtInput = (EditText) viewInflate.findViewById(C2042R.id.mlet_input);
        this.mTvInputNumber = (TextView) viewInflate.findViewById(C2042R.id.mlet_number);
        if (getBackground() == null) {
            setBackgroundResource(C2042R.drawable.mlet_selector_bg);
        }
        this.mEtInput.addTextChangedListener(this.mTextWatcher);
        this.mEtInput.setHint(this.mHintText);
        this.mEtInput.setHintTextColor(this.mHintTextColor);
        this.mEtInput.setText(this.mContentText);
        EditText editText = this.mEtInput;
        int i4 = this.mContentPadding;
        editText.setPadding(i4, i4, i4, 0);
        Drawable drawable = this.mContentBackground;
        if (drawable != null) {
            this.mEtInput.setBackground(drawable);
        }
        this.mEtInput.setTextColor(this.mContentTextColor);
        this.mEtInput.setTextSize(0, this.mContentTextSize);
        if (this.mIsFixHeight) {
            this.mEtInput.setHeight((int) this.mContentViewHeight);
        } else {
            this.mEtInput.setMinHeight((int) this.mContentViewHeight);
        }
        this.mTvInputNumber.requestFocus();
        configCount();
        EditText editText2 = this.mEtInput;
        editText2.setSelection(editText2.length());
        this.mEtInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.edittext.MultiLineEditText.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z3) {
                MultiLineEditText.this.setSelected(z3);
            }
        });
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.MultiLineEditText, i4, 0);
        this.mMaxCount = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.MultiLineEditText_mlet_maxCount, 240);
        this.mIgnoreCnOrEn = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MultiLineEditText_mlet_ignoreCnOrEn, true);
        this.mHintText = typedArrayObtainStyledAttributes.getString(C2042R.styleable.MultiLineEditText_mlet_hintText);
        this.mHintTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MultiLineEditText_mlet_hintTextColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_hint_text));
        this.mContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.MultiLineEditText_mlet_contentPadding, DensityUtils.dp2px(context, 10.0f));
        this.mContentBackground = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.MultiLineEditText_mlet_contentBackground);
        this.mContentText = typedArrayObtainStyledAttributes.getString(C2042R.styleable.MultiLineEditText_mlet_contentText);
        this.mContentTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MultiLineEditText_mlet_contentTextColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_input_text));
        this.mContentTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.MultiLineEditText_mlet_contentTextSize, DensityUtils.sp2px(context, 14.0f));
        this.mContentViewHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.MultiLineEditText_mlet_contentViewHeight, DensityUtils.dp2px(context, 140.0f));
        this.mIsFixHeight = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MultiLineEditText_mlet_isFixHeight, true);
        this.mIsShowSurplusNumber = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MultiLineEditText_mlet_showSurplusNumber, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void updateCount(int i4) {
        if (this.mIsShowSurplusNumber) {
            this.mTvInputNumber.setText((this.mMaxCount - i4) + "/" + this.mMaxCount);
            return;
        }
        this.mTvInputNumber.setText(i4 + "/" + this.mMaxCount);
    }

    public String getContentText() {
        EditText editText = this.mEtInput;
        if (editText != null) {
            this.mContentText = editText.getText() == null ? "" : this.mEtInput.getText().toString();
        }
        return this.mContentText;
    }

    public TextView getCountTextView() {
        return this.mTvInputNumber;
    }

    public EditText getEditText() {
        return this.mEtInput;
    }

    public String getHintText() {
        EditText editText = this.mEtInput;
        if (editText != null) {
            this.mHintText = editText.getHint() == null ? "" : this.mEtInput.getHint().toString();
        }
        return this.mHintText;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getContentText());
    }

    public boolean isNotEmpty() {
        return !TextUtils.isEmpty(getContentText());
    }

    public void setContentText(String str) {
        if (str != null && calculateContentLength(str) > this.mMaxCount) {
            str = str.substring(0, getSubStringIndex(str));
        }
        this.mContentText = str;
        EditText editText = this.mEtInput;
        if (editText == null) {
            return;
        }
        editText.setText(str);
    }

    public void setContentTextColor(int i4) {
        EditText editText = this.mEtInput;
        if (editText == null) {
            return;
        }
        editText.setTextColor(i4);
    }

    public void setContentTextSize(int i4) {
        EditText editText = this.mEtInput;
        if (editText == null) {
            return;
        }
        editText.setTextSize(0, i4);
    }

    public void setHintColor(int i4) {
        EditText editText = this.mEtInput;
        if (editText == null) {
            return;
        }
        editText.setHintTextColor(i4);
    }

    public void setHintText(String str) {
        this.mHintText = str;
        EditText editText = this.mEtInput;
        if (editText == null) {
            return;
        }
        editText.setHint(str);
    }

    public MultiLineEditText setIgnoreCnOrEn(boolean z3) {
        this.mIgnoreCnOrEn = z3;
        configCount();
        return this;
    }

    public MultiLineEditText setIsShowSurplusNumber(boolean z3) {
        this.mIsShowSurplusNumber = z3;
        configCount();
        return this;
    }

    public MultiLineEditText setMaxCount(int i4) {
        this.mMaxCount = i4;
        configCount();
        return this;
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.MultiLineEditTextStyle);
    }

    public MultiLineEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mTextWatcher = new TextWatcher() { // from class: com.xuexiang.xui.widget.edittext.MultiLineEditText.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int selectionStart = MultiLineEditText.this.mEtInput.getSelectionStart();
                int selectionEnd = MultiLineEditText.this.mEtInput.getSelectionEnd();
                MultiLineEditText.this.mEtInput.removeTextChangedListener(MultiLineEditText.this.mTextWatcher);
                if (MultiLineEditText.this.mIgnoreCnOrEn) {
                    while (MultiLineEditText.this.calculateLengthIgnoreCnOrEn(editable.toString()) > MultiLineEditText.this.mMaxCount) {
                        editable.delete(selectionStart - 1, selectionEnd);
                        selectionStart--;
                        selectionEnd--;
                    }
                } else {
                    while (MultiLineEditText.this.calculateLength(editable.toString()) > MultiLineEditText.this.mMaxCount) {
                        editable.delete(selectionStart - 1, selectionEnd);
                        selectionStart--;
                        selectionEnd--;
                    }
                }
                MultiLineEditText.this.mEtInput.setSelection(selectionStart);
                MultiLineEditText.this.mEtInput.addTextChangedListener(MultiLineEditText.this.mTextWatcher);
                MultiLineEditText.this.configCount();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }
        };
        initAttrs(context, attributeSet, i4);
        init();
    }
}
