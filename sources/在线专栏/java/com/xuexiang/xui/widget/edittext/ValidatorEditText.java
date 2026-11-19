package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.RegexpValidator;
import com.xuexiang.xui.widget.popupwindow.ViewTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {
    private Drawable mErrorDrawable;
    private CharSequence mErrorMsg;
    private int mExtraClickArea;
    private boolean mIsAutoValidate;
    private boolean mIsShowErrorIcon;
    private boolean mIsValid;
    private OnValidateListener mOnValidateListener;
    private int mPosition;
    private List<METValidator> mValidators;

    public interface OnValidateListener {
        void onValidateError(String str, String str2);
    }

    public ValidatorEditText(Context context) {
        this(context, null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        this.mExtraClickArea = DensityUtils.dp2px(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ValidatorEditText, i4, 0);
        String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.ValidatorEditText_vet_regexp);
        if (!TextUtils.isEmpty(string)) {
            this.mValidators = new ArrayList();
            String string2 = typedArrayObtainStyledAttributes.getString(C2042R.styleable.ValidatorEditText_vet_errorMessage);
            if (TextUtils.isEmpty(string2)) {
                this.mValidators.add(new RegexpValidator(ResUtils.getString(C2042R.string.xui_met_input_error), string));
            } else {
                this.mValidators.add(new RegexpValidator(string2, string));
            }
        }
        this.mIsAutoValidate = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.ValidatorEditText_vet_autoValidate, true);
        this.mIsShowErrorIcon = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.ValidatorEditText_vet_showErrorIcon, true);
        Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.ValidatorEditText_vet_errorIcon);
        this.mErrorDrawable = drawableAttrRes;
        if (drawableAttrRes == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            this.mErrorDrawable = drawable;
            if (drawable == null) {
                this.mErrorDrawable = ResUtils.getDrawable(getContext(), C2042R.drawable.xui_ic_default_tip_btn);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ValidatorEditText_vet_errorIconSize, 0);
        if (dimensionPixelSize != 0) {
            this.mErrorDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            Drawable drawable2 = this.mErrorDrawable;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mErrorDrawable.getIntrinsicHeight());
        }
        this.mPosition = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ValidatorEditText_vet_tipPosition, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initTextWatcher() {
        addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.edittext.ValidatorEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (ValidatorEditText.this.mIsAutoValidate) {
                    ValidatorEditText.this.updateValid();
                } else {
                    ValidatorEditText.this.setError(null);
                }
                ValidatorEditText.this.postInvalidate();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
    }

    private void initView() {
        setErrorIconVisible(false);
        super.setOnFocusChangeListener(this);
        initTextWatcher();
        if (this.mIsAutoValidate) {
            updateValid();
        }
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private boolean isTouchable(MotionEvent motionEvent) {
        return isRtl() ? motionEvent.getX() > ((float) (getPaddingStart() - this.mExtraClickArea)) && motionEvent.getX() < ((float) ((getPaddingStart() + this.mErrorDrawable.getIntrinsicWidth()) + this.mExtraClickArea)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingEnd()) - this.mErrorDrawable.getIntrinsicWidth()) - this.mExtraClickArea)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingEnd()) + this.mExtraClickArea));
    }

    private void onValidateError(String str) {
        setErrorIconVisible(true);
        OnValidateListener onValidateListener = this.mOnValidateListener;
        if (onValidateListener != null) {
            onValidateListener.onValidateError(getText() != null ? getText().toString() : "", str);
        }
    }

    public static ViewTooltip.Position parsePosition(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? ViewTooltip.Position.TOP : ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP : ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
    }

    private void setErrorIconVisible(boolean z3) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], (z3 && this.mIsShowErrorIcon) ? this.mErrorDrawable : null, getCompoundDrawablesRelative()[3]);
    }

    private void showErrorMsg() {
        if (this.mIsValid) {
            return;
        }
        ViewTooltip.m7972on(this).color(ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_error_text)).position(parsePosition(this.mPosition)).text(this.mErrorMsg.toString()).show();
    }

    public ValidatorEditText addValidator(METValidator mETValidator) {
        if (mETValidator != null) {
            if (this.mValidators == null) {
                this.mValidators = new ArrayList();
            }
            this.mValidators.add(mETValidator);
        }
        return this;
    }

    public void clearValidators() {
        List<METValidator> list = this.mValidators;
        if (list != null) {
            list.clear();
        }
    }

    public CharSequence getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getInputValue());
    }

    public boolean isInputValid() {
        return this.mIsAutoValidate ? this.mIsValid : validate();
    }

    public boolean isNotEmpty() {
        return !TextUtils.isEmpty(getInputValue());
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z3) {
        if (!this.mIsAutoValidate || z3) {
            return;
        }
        updateValid();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && isTouchable(motionEvent)) {
            showErrorMsg();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setFocusable(z3);
        super.setFocusableInTouchMode(z3);
        super.setEnabled(z3);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.mErrorMsg = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(ResUtils.getDrawable(getContext(), C2042R.drawable.xui_config_bg_edittext));
        } else {
            onValidateError(charSequence.toString());
            setBackground(ResUtils.getDrawable(getContext(), C2042R.drawable.xui_config_color_edittext_error));
        }
    }

    public ValidatorEditText setExtraClickAreaSize(int i4) {
        this.mExtraClickArea = i4;
        return this;
    }

    public ValidatorEditText setOnValidateListener(OnValidateListener onValidateListener) {
        this.mOnValidateListener = onValidateListener;
        return this;
    }

    public void updateValid() {
        this.mIsValid = validate();
    }

    public boolean validate() {
        List<METValidator> list = this.mValidators;
        boolean z3 = true;
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            Iterator<METValidator> it = this.mValidators.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                METValidator next = it.next();
                boolean zIsValid = next.isValid(text, zIsEmpty);
                if (!zIsValid) {
                    setError(next.getErrorMessage());
                    z3 = zIsValid;
                    break;
                }
                z3 = zIsValid;
            }
            if (z3) {
                setError(null);
            }
            postInvalidate();
        }
        return z3;
    }

    public ValidatorEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.ValidatorEditTextStyle);
    }

    public ValidatorEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIsValid = true;
        this.mIsShowErrorIcon = true;
        initAttrs(context, attributeSet, i4);
        initView();
    }
}
