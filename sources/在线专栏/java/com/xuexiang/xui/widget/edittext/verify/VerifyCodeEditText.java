package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.edittext.verify.TInputConnection;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class VerifyCodeEditText extends FrameLayout {
    private static final int DEFAULT_EDIT_TEXT_SIZE = 4;
    private static final int DEFAULT_HEIGHT = 50;
    private Drawable mBackgroundFocus;
    private Drawable mBackgroundNormal;
    private PwdEditText mEditText;
    private Drawable mEtDivider;
    private int mEtNumber;
    private int mEtTextColor;
    private float mEtTextSize;
    private int mEtWidth;
    private boolean mIsDivideEqually;
    private boolean mIsPwd;
    private LinearLayout mLlContainer;
    private OnInputListener mOnInputListener;
    private float mPwdRadius;
    private PwdTextView[] mPwdTextViews;
    private InputNumberTextWatcher mTextWatcher;

    private class InputNumberTextWatcher implements TextWatcher {
        private InputNumberTextWatcher() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split("");
            for (int i4 = 0; i4 < strArrSplit.length && i4 <= VerifyCodeEditText.this.mEtNumber; i4++) {
                VerifyCodeEditText.this.setText(strArrSplit[i4], false);
                VerifyCodeEditText.this.mEditText.setText("");
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    public interface OnInputListener {
        void onChange(String str);

        void onClear();

        void onComplete(String str);
    }

    public VerifyCodeEditText(Context context) {
        this(context, null);
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_verify_code, this);
        this.mLlContainer = (LinearLayout) findViewById(C2042R.id.ll_container);
        this.mEditText = (PwdEditText) findViewById(C2042R.id.et_input);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.VerifyCodeEditText, i4, 0);
        this.mEtNumber = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.VerifyCodeEditText_vcet_number, 4);
        this.mEtWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.VerifyCodeEditText_vcet_width, ResUtils.getDimensionPixelSize(C2042R.dimen.default_vcet_width));
        this.mIsDivideEqually = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.VerifyCodeEditText_vcet_is_divide_equally, false);
        this.mEtDivider = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.VerifyCodeEditText_vcet_divider);
        this.mEtTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.VerifyCodeEditText_vcet_text_size, ResUtils.getDimensionPixelSize(C2042R.dimen.default_vcet_text_size));
        this.mEtTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.VerifyCodeEditText_vcet_text_color, IGoodView.DEFAULT_TEXT_COLOR);
        this.mBackgroundFocus = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.VerifyCodeEditText_vcet_bg_focus);
        this.mBackgroundNormal = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.VerifyCodeEditText_vcet_bg_normal);
        this.mIsPwd = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.VerifyCodeEditText_vcet_is_pwd, false);
        this.mPwdRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.VerifyCodeEditText_vcet_pwd_radius, ResUtils.getDimensionPixelSize(C2042R.dimen.default_vcet_pwd_radius));
        typedArrayObtainStyledAttributes.recycle();
        if (this.mEtDivider == null) {
            this.mEtDivider = ResUtils.getDrawable(context, C2042R.drawable.vcet_shape_divider);
        }
        if (this.mBackgroundFocus == null) {
            this.mBackgroundFocus = ResUtils.getDrawable(context, C2042R.drawable.vcet_shape_bg_focus);
        }
        if (this.mBackgroundNormal == null) {
            this.mBackgroundNormal = ResUtils.getDrawable(context, C2042R.drawable.vcet_shape_bg_normal);
        }
        if (this.mIsDivideEqually) {
            post(new Runnable() { // from class: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText.1
                @Override // java.lang.Runnable
                public void run() {
                    VerifyCodeEditText.this.refreshEditSizeWhenDivideEqually();
                    VerifyCodeEditText verifyCodeEditText = VerifyCodeEditText.this;
                    verifyCodeEditText.initView(verifyCodeEditText.getContext());
                }
            });
        } else {
            initView(context);
        }
    }

    private void initEtContainer(TextView[] textViewArr) {
        int i4 = 0;
        if (!this.mIsDivideEqually) {
            int length = textViewArr.length;
            while (i4 < length) {
                this.mLlContainer.addView(textViewArr[i4]);
                i4++;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mLlContainer.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
        } else {
            layoutParams.width = -1;
        }
        this.mLlContainer.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        int length2 = textViewArr.length;
        while (i4 < length2) {
            this.mLlContainer.addView(textViewArr[i4], layoutParams2);
            i4++;
        }
    }

    private void initTextViews(Context context, int i4, int i5, Drawable drawable, float f4, int i6) {
        this.mEditText.setCursorVisible(false);
        this.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.mLlContainer.setDividerDrawable(drawable);
        }
        this.mPwdTextViews = new PwdTextView[i4];
        for (int i7 = 0; i7 < this.mPwdTextViews.length; i7++) {
            PwdTextView pwdTextView = new PwdTextView(context);
            pwdTextView.setTextSize(0, f4);
            pwdTextView.setTextColor(i6);
            if (!this.mIsDivideEqually) {
                pwdTextView.setWidth(i5);
            }
            pwdTextView.setHeight(i5);
            if (i7 == 0) {
                pwdTextView.setBackgroundDrawable(this.mBackgroundFocus);
            } else {
                pwdTextView.setBackgroundDrawable(this.mBackgroundNormal);
            }
            pwdTextView.setGravity(17);
            pwdTextView.setFocusable(false);
            this.mPwdTextViews[i7] = pwdTextView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initView(Context context) {
        initTextViews(context, this.mEtNumber, this.mEtWidth, this.mEtDivider, this.mEtTextSize, this.mEtTextColor);
        initEtContainer(this.mPwdTextViews);
        setListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyDelete() {
        OnInputListener onInputListener;
        for (int length = this.mPwdTextViews.length - 1; length >= 0; length--) {
            PwdTextView pwdTextView = this.mPwdTextViews[length];
            if (!"".equals(pwdTextView.getText().toString().trim())) {
                if (this.mIsPwd) {
                    pwdTextView.clearPassword();
                }
                pwdTextView.setText("");
                pwdTextView.setBackgroundDrawable(this.mBackgroundFocus);
                int i4 = this.mEtNumber;
                if (length >= i4 - 1) {
                    if (length != i4 - 1 || (onInputListener = this.mOnInputListener) == null) {
                        return;
                    }
                    onInputListener.onChange(getInputValue());
                    return;
                }
                this.mPwdTextViews[length + 1].setBackgroundDrawable(this.mBackgroundNormal);
                if (length == 0) {
                    OnInputListener onInputListener2 = this.mOnInputListener;
                    if (onInputListener2 != null) {
                        onInputListener2.onClear();
                        return;
                    }
                    return;
                }
                OnInputListener onInputListener3 = this.mOnInputListener;
                if (onInputListener3 != null) {
                    onInputListener3.onChange(getInputValue());
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshEditSizeWhenDivideEqually() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        Drawable drawable = this.mEtDivider;
        this.mEtWidth = (((((DensityUtils.getDisplayWidth(getContext(), true) - ((drawable != null ? drawable.getMinimumWidth() : 0) * (this.mEtNumber - 1))) - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) / this.mEtNumber;
    }

    private void restoreView(Context context, String str) {
        initTextViews(context, this.mEtNumber, this.mEtWidth, this.mEtDivider, this.mEtTextSize, this.mEtTextColor);
        initEtContainer(this.mPwdTextViews);
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("");
            for (int i4 = 0; i4 < strArrSplit.length && i4 <= this.mEtNumber; i4++) {
                setText(strArrSplit[i4], true);
            }
        }
        setListener();
    }

    private void setListener() {
        this.mEditText.addTextChangedListener(this.mTextWatcher);
        this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i4, KeyEvent keyEvent) {
                if (i4 != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                VerifyCodeEditText.this.onKeyDelete();
                return true;
            }
        });
        this.mEditText.setBackSpaceListener(new TInputConnection.BackspaceListener() { // from class: com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText.3
            @Override // com.xuexiang.xui.widget.edittext.verify.TInputConnection.BackspaceListener
            public boolean onBackspace() {
                VerifyCodeEditText.this.onKeyDelete();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str, boolean z3) {
        OnInputListener onInputListener;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i4 = 0;
        while (true) {
            PwdTextView[] pwdTextViewArr = this.mPwdTextViews;
            if (i4 >= pwdTextViewArr.length) {
                return;
            }
            PwdTextView pwdTextView = pwdTextViewArr[i4];
            if ("".equals(pwdTextView.getText().toString().trim())) {
                if (this.mIsPwd) {
                    pwdTextView.drawPassword(this.mPwdRadius);
                }
                pwdTextView.setText(str);
                pwdTextView.setBackgroundDrawable(this.mBackgroundNormal);
                int i5 = this.mEtNumber;
                if (i4 >= i5 - 1) {
                    if (i4 != i5 - 1 || (onInputListener = this.mOnInputListener) == null || z3) {
                        return;
                    }
                    onInputListener.onComplete(getInputValue());
                    return;
                }
                this.mPwdTextViews[i4 + 1].setBackgroundDrawable(this.mBackgroundFocus);
                OnInputListener onInputListener2 = this.mOnInputListener;
                if (onInputListener2 == null || z3) {
                    return;
                }
                onInputListener2.onChange(getInputValue());
                return;
            }
            i4++;
        }
    }

    public void clearInputValue() {
        int i4 = 0;
        while (true) {
            PwdTextView[] pwdTextViewArr = this.mPwdTextViews;
            if (i4 >= pwdTextViewArr.length) {
                break;
            }
            if (i4 == 0) {
                pwdTextViewArr[i4].setBackgroundDrawable(this.mBackgroundFocus);
            } else {
                pwdTextViewArr[i4].setBackgroundDrawable(this.mBackgroundNormal);
            }
            if (this.mIsPwd) {
                this.mPwdTextViews[i4].clearPassword();
            }
            this.mPwdTextViews[i4].setText("");
            i4++;
        }
        OnInputListener onInputListener = this.mOnInputListener;
        if (onInputListener != null) {
            onInputListener.onClear();
        }
    }

    public float dp2px(float f4, Context context) {
        return TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics());
    }

    public EditText getEditText() {
        return this.mEditText;
    }

    public int getEtNumber() {
        return this.mEtNumber;
    }

    public String getInputValue() {
        StringBuilder sb = new StringBuilder();
        for (PwdTextView pwdTextView : this.mPwdTextViews) {
            sb.append(pwdTextView.getText().toString().trim());
        }
        return sb.toString();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mIsDivideEqually) {
            String inputValue = getInputValue();
            this.mEditText.removeTextChangedListener(this.mTextWatcher);
            this.mLlContainer.removeAllViews();
            refreshEditSizeWhenDivideEqually();
            restoreView(getContext(), inputValue);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int iDp2px;
        if (View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && this.mEtWidth < (iDp2px = (int) dp2px(50.0f, getContext()))) {
            i5 = View.MeasureSpec.makeMeasureSpec(iDp2px, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    public void setEtNumber(int i4) {
        this.mEtNumber = i4;
        this.mEditText.removeTextChangedListener(this.mTextWatcher);
        this.mLlContainer.removeAllViews();
        if (this.mIsDivideEqually) {
            refreshEditSizeWhenDivideEqually();
        }
        initView(getContext());
    }

    public void setOnInputListener(OnInputListener onInputListener) {
        this.mOnInputListener = onInputListener;
    }

    public void setPwdMode(boolean z3) {
        this.mIsPwd = z3;
    }

    public float sp2px(float f4, Context context) {
        return TypedValue.applyDimension(2, f4, context.getResources().getDisplayMetrics());
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.VerifyCodeEditTextStyle);
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mTextWatcher = new InputNumberTextWatcher();
        init(context, attributeSet, i4);
    }
}
