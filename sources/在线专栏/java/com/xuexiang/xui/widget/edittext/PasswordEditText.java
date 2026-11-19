package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class PasswordEditText extends AppCompatEditText {
    private static final int ALPHA_ICON_DISABLED = 96;
    private static final int ALPHA_ICON_ENABLED = 137;
    private int mExtraClickArea;
    private boolean mHandlingHoverEvent;
    private Drawable mHidePwDrawable;
    private boolean mHoverShowsPw;
    private boolean mPasswordVisible;
    private boolean mSetErrorCalled;
    private Drawable mShowPwDrawable;
    private boolean mShowingIcon;
    private PasswordTransformationMethod mTransformationMethod;

    public PasswordEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePasswordInputVisibility() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.mPasswordVisible) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.mTransformationMethod);
        }
        setSelection(selectionStart, selectionEnd);
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private boolean isTouchable(MotionEvent motionEvent) {
        if (isRtl()) {
            if (motionEvent.getX() > getPaddingLeft() - this.mExtraClickArea && motionEvent.getX() < getPaddingLeft() + this.mShowPwDrawable.getIntrinsicWidth() + this.mExtraClickArea) {
                return true;
            }
        } else if (motionEvent.getX() > ((getWidth() - getPaddingRight()) - this.mShowPwDrawable.getIntrinsicWidth()) - this.mExtraClickArea && motionEvent.getX() < (getWidth() - getPaddingRight()) + this.mExtraClickArea) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPasswordVisibilityIndicator(boolean z3) {
        if (!z3) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.mShowingIcon = false;
        } else {
            Drawable drawable = this.mPasswordVisible ? this.mShowPwDrawable : this.mHidePwDrawable;
            this.mShowingIcon = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private void togglePasswordIconVisibility() {
        this.mPasswordVisible = !this.mPasswordVisible;
        handlePasswordInputVisibility();
        showPasswordVisibilityIndicator(true);
    }

    public void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        this.mExtraClickArea = DensityUtils.dp2px(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.PasswordEditText, i4, 0);
        try {
            Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.PasswordEditText_pet_iconShow);
            this.mShowPwDrawable = drawableAttrRes;
            if (drawableAttrRes == null) {
                this.mShowPwDrawable = ResUtils.getVectorDrawable(getContext(), C2042R.drawable.pet_icon_visibility_24dp);
            }
            Drawable drawableAttrRes2 = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.PasswordEditText_pet_iconHide);
            this.mHidePwDrawable = drawableAttrRes2;
            if (drawableAttrRes2 == null) {
                this.mHidePwDrawable = ResUtils.getVectorDrawable(getContext(), C2042R.drawable.pet_icon_visibility_off_24dp);
            }
            this.mHoverShowsPw = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.PasswordEditText_pet_hoverShowsPw, false);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.PasswordEditText_pet_nonMonospaceFont, false);
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.PasswordEditText_pet_enableIconAlpha, true);
            if (typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.PasswordEditText_pet_isAsteriskStyle, false)) {
                this.mTransformationMethod = AsteriskPasswordTransformationMethod.getInstance();
            } else {
                this.mTransformationMethod = PasswordTransformationMethod.getInstance();
            }
            if (z4) {
                this.mHidePwDrawable.setAlpha(ALPHA_ICON_ENABLED);
                this.mShowPwDrawable.setAlpha(96);
            }
            if (z3) {
                setTypeface(Typeface.DEFAULT);
            }
            addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.edittext.PasswordEditText.1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable.length() <= 0) {
                        PasswordEditText.this.mPasswordVisible = false;
                        PasswordEditText.this.handlePasswordInputVisibility();
                        PasswordEditText.this.showPasswordVisibilityIndicator(false);
                        return;
                    }
                    if (PasswordEditText.this.mSetErrorCalled) {
                        PasswordEditText.this.setCompoundDrawablesRelative(null, null, null, null);
                        PasswordEditText.this.mSetErrorCalled = false;
                        PasswordEditText.this.showPasswordVisibilityIndicator(true);
                    }
                    if (PasswordEditText.this.mShowingIcon) {
                        return;
                    }
                    PasswordEditText.this.showPasswordVisibilityIndicator(true);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }
            });
            handlePasswordInputVisibility();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mShowingIcon = savedState.isShowingIcon();
        this.mPasswordVisible = savedState.isPasswordVisible();
        handlePasswordInputVisibility();
        showPasswordVisibilityIndicator(this.mShowingIcon);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mShowingIcon, this.mPasswordVisible);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mShowingIcon) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zIsTouchable = isTouchable(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.mHandlingHoverEvent || zIsTouchable)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.mHandlingHoverEvent = false;
            }
        } else if (this.mHoverShowsPw && zIsTouchable) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.mHandlingHoverEvent = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.mSetErrorCalled = true;
    }

    public PasswordEditText setExtraClickAreaSize(int i4) {
        this.mExtraClickArea = i4;
        return this;
    }

    public PasswordEditText setIsAsteriskStyle(boolean z3) {
        if (z3) {
            this.mTransformationMethod = AsteriskPasswordTransformationMethod.getInstance();
        } else {
            this.mTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        return this;
    }

    public PasswordEditText setPasswordTransformationMethod(PasswordTransformationMethod passwordTransformationMethod) {
        this.mTransformationMethod = passwordTransformationMethod;
        return this;
    }

    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xuexiang.xui.widget.edittext.PasswordEditText.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        };
        private final boolean mPasswordVisible;
        private final boolean mShowingIcon;

        public boolean isPasswordVisible() {
            return this.mPasswordVisible;
        }

        public boolean isShowingIcon() {
            return this.mShowingIcon;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.mShowingIcon ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mPasswordVisible ? (byte) 1 : (byte) 0);
        }

        private SavedState(Parcelable parcelable, boolean z3, boolean z4) {
            super(parcelable);
            this.mShowingIcon = z3;
            this.mPasswordVisible = z4;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mShowingIcon = parcel.readByte() != 0;
            this.mPasswordVisible = parcel.readByte() != 0;
        }
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.PasswordEditTextStyle);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.mSetErrorCalled = true;
    }
}
