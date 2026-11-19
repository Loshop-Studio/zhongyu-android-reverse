package com.xuexiang.xui.widget.edittext.materialedittext;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.media.AbstractC0037f;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.collection.AbstractC0584a;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC4151a;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METLengthChecker;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.RegexpValidator;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.AbstractC5806u;
import p073h4.AbstractC5625a;
import p105l2.C6049b;
import p164t1.AbstractC6582a;
import p169t6.AbstractC6600a;

/* loaded from: classes3.dex */
public class MaterialEditText extends AppCompatEditText implements HasTypeface {
    public static final int FLOATING_LABEL_HIGHLIGHT = 2;
    public static final int FLOATING_LABEL_NONE = 0;
    public static final int FLOATING_LABEL_NORMAL = 1;
    private Typeface accentTypeface;
    private boolean actionButtonClicking;
    private boolean actionButtonTouched;
    private boolean autoValidate;
    private int baseColor;
    private int bottomEllipsisSize;
    private float bottomLines;
    ObjectAnimator bottomLinesAnimator;
    private int bottomSpacing;
    private int bottomTextSize;
    private boolean charactersCountValid;
    private boolean checkCharactersCountAtBeginning;
    private Bitmap[] clearButtonBitmaps;
    private float currentBottomLines;
    private int errorColor;
    private int extraPaddingBottom;
    private int extraPaddingLeft;
    private int extraPaddingRight;
    private int extraPaddingTop;
    private boolean firstShown;
    private boolean floatingLabelAlwaysShown;
    private boolean floatingLabelAnimating;
    private boolean floatingLabelEnabled;
    private float floatingLabelFraction;
    private int floatingLabelPadding;
    private boolean floatingLabelShown;
    private CharSequence floatingLabelText;
    private int floatingLabelTextColor;
    private int floatingLabelTextSize;
    private ArgbEvaluator focusEvaluator;
    private float focusFraction;
    private String helperText;
    private boolean helperTextAlwaysShown;
    private int helperTextColor;
    private Bitmap[] hidePwIconBitmaps;
    private boolean hideUnderline;
    private boolean highlightFloatingLabel;
    private Bitmap[] iconLeftBitmaps;
    private int iconOuterHeight;
    private int iconOuterWidth;
    private int iconPadding;
    private Bitmap[] iconRightBitmaps;
    private int iconSize;
    View.OnFocusChangeListener innerFocusChangeListener;
    private int innerPaddingBottom;
    private int innerPaddingLeft;
    private int innerPaddingRight;
    private int innerPaddingTop;
    ObjectAnimator labelAnimator;
    ObjectAnimator labelFocusAnimator;
    private METLengthChecker lengthChecker;
    private PasswordTransformationMethod mTransformationMethod;
    private int maxCharacters;
    private int minBottomLines;
    private int minBottomTextLines;
    private int minCharacters;
    View.OnFocusChangeListener outerFocusChangeListener;
    Paint paint;
    private boolean passwordVisible;
    private int primaryColor;
    private boolean showClearButton;
    private boolean showPasswordButton;
    private Bitmap[] showPwIconBitmaps;
    private boolean singleLineEllipsis;
    private String tempErrorText;
    private ColorStateList textColorHintStateList;
    private ColorStateList textColorStateList;
    StaticLayout textLayout;
    TextPaint textPaint;
    private int underlineColor;
    private int underlineHeight;
    private int underlineHeightFocused;
    private boolean validateOnFocusLost;
    private List<METValidator> validators;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FloatingLabelType {
    }

    public MaterialEditText(Context context) {
        this(context, null);
    }

    private boolean adjustBottomLines() {
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.textPaint.setTextSize(this.bottomTextSize);
        if (this.tempErrorText == null && this.helperText == null) {
            iMax = this.minBottomLines;
        } else {
            Layout.Alignment alignment = ((getGravity() & GravityCompat.END) == 8388613 || isRTL()) ? Layout.Alignment.ALIGN_OPPOSITE : (getGravity() & GravityCompat.START) == 8388611 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            String str = this.tempErrorText;
            if (str == null) {
                str = this.helperText;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.textPaint, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment, 1.0f, 0.0f, true);
            this.textLayout = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.minBottomTextLines);
        }
        float f = iMax;
        if (this.bottomLines != f) {
            getBottomLinesAnimator(f).start();
        }
        this.bottomLines = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCharactersCount() {
        int i;
        boolean z8 = true;
        if ((!this.firstShown && !this.checkCharactersCountAtBeginning) || !hasCharactersCounter()) {
            this.charactersCountValid = true;
            return;
        }
        Editable text = getText();
        int iCheckLength = text == null ? 0 : checkLength(text);
        if (iCheckLength < this.minCharacters || ((i = this.maxCharacters) > 0 && iCheckLength > i)) {
            z8 = false;
        }
        this.charactersCountValid = z8;
    }

    private int checkLength(CharSequence charSequence) {
        METLengthChecker mETLengthChecker = this.lengthChecker;
        return mETLengthChecker == null ? charSequence.length() : mETLengthChecker.getLength(charSequence);
    }

    private void correctPaddings() {
        int buttonsCount = this.iconOuterWidth * getButtonsCount();
        int i = 0;
        if (!isRTL()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPaddingRelative(this.innerPaddingLeft + this.extraPaddingLeft + buttonsCount, this.innerPaddingTop + this.extraPaddingTop, this.innerPaddingRight + this.extraPaddingRight + i, this.innerPaddingBottom + this.extraPaddingBottom);
    }

    private void drawActionButton(@NonNull Canvas canvas, int i, int i8, int i9) {
        if (hasFocus() && isEnabled() && !TextUtils.isEmpty(getText())) {
            if (this.showClearButton || this.showPasswordButton) {
                this.paint.setAlpha(255);
                if (!isRTL()) {
                    i = i8 - this.iconOuterWidth;
                }
                Bitmap bitmap = this.showClearButton ? this.clearButtonBitmaps[0] : this.passwordVisible ? this.showPwIconBitmaps[0] : this.hidePwIconBitmaps[0];
                int i10 = i9 + this.bottomSpacing;
                int i11 = this.iconOuterHeight;
                canvas.drawBitmap(bitmap, i, ((i11 - bitmap.getHeight()) / 2) + (i10 - i11), this.paint);
            }
        }
    }

    private void drawBottomEllipsis(@NonNull Canvas canvas, int i, int i8, int i9) {
        if (hasFocus() && this.singleLineEllipsis && getScrollX() != 0) {
            this.paint.setColor(isInternalValid() ? this.primaryColor : this.errorColor);
            float f = i9 + this.bottomSpacing;
            if (isRTL()) {
                i = i8;
            }
            int i10 = isRTL() ? -1 : 1;
            float f7 = i;
            int i11 = this.bottomEllipsisSize;
            canvas.drawCircle(((i10 * i11) / 2.0f) + f7, (i11 / 2.0f) + f, i11 / 2.0f, this.paint);
            int i12 = this.bottomEllipsisSize;
            canvas.drawCircle((((i10 * i12) * 5) / 2.0f) + f7, (i12 / 2.0f) + f, i12 / 2.0f, this.paint);
            int i13 = this.bottomEllipsisSize;
            canvas.drawCircle((((i10 * i13) * 9) / 2.0f) + f7, (i13 / 2.0f) + f, i13 / 2.0f, this.paint);
        }
    }

    private void drawBottomText(@NonNull Canvas canvas, int i, int i8, int i9, float f) {
        int i10;
        if (this.textLayout != null) {
            if (this.tempErrorText != null || ((this.helperTextAlwaysShown || hasFocus()) && !TextUtils.isEmpty(this.helperText))) {
                TextPaint textPaint = this.textPaint;
                if (this.tempErrorText != null) {
                    i10 = this.errorColor;
                } else {
                    i10 = this.helperTextColor;
                    if (i10 == -1) {
                        i10 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
                    }
                }
                textPaint.setColor(i10);
                canvas.save();
                if (isRTL()) {
                    canvas.translate(i8 - this.textLayout.getWidth(), (i9 + this.bottomSpacing) - f);
                } else {
                    canvas.translate(i + getBottomTextLeftOffset(), (i9 + this.bottomSpacing) - f);
                }
                this.textLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void drawFloatingLabel(@NonNull Canvas canvas, int i, int i8) {
        if (!this.floatingLabelEnabled || TextUtils.isEmpty(this.floatingLabelText)) {
            return;
        }
        this.textPaint.setTextSize(this.floatingLabelTextSize);
        TextPaint textPaint = this.textPaint;
        ArgbEvaluator argbEvaluator = this.focusEvaluator;
        float f = this.focusFraction * (isEnabled() ? 1.0f : 0.0f);
        int i9 = this.floatingLabelTextColor;
        if (i9 == -1) {
            i9 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
        }
        textPaint.setColor(((Integer) argbEvaluator.evaluate(f, Integer.valueOf(i9), Integer.valueOf(this.primaryColor))).intValue());
        float fMeasureText = this.textPaint.measureText(this.floatingLabelText.toString());
        if ((getGravity() & 5) == 5 || isRTL()) {
            i = (int) (i8 - fMeasureText);
        } else if ((getGravity() & 3) != 3) {
            i += (int) AbstractC0584a.m900a((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight(), fMeasureText, 2.0f, getInnerPaddingLeft());
        }
        int scrollY = (int) ((((this.innerPaddingTop + this.floatingLabelTextSize) + r10) - (this.floatingLabelPadding * (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction))) + getScrollY());
        this.textPaint.setAlpha((int) (AbstractC0584a.m925z(this.focusFraction * 0.74f, isEnabled() ? 1.0f : 0.0f, 0.26f, (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction) * 255.0f) * (this.floatingLabelTextColor == -1 ? Color.alpha(r3) / 255.0f : 1.0f)));
        canvas.drawText(this.floatingLabelText.toString(), i, scrollY, this.textPaint);
    }

    private void drawIcons(@NonNull Canvas canvas, int i, int i8, int i9) {
        this.paint.setAlpha(255);
        char c = 0;
        if (getStartIcon() != null) {
            Bitmap bitmap = getStartIcon()[!isInternalValid() ? (char) 3 : !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0];
            int i10 = i - this.iconPadding;
            int i11 = this.iconOuterWidth;
            int width = ((i11 - bitmap.getWidth()) / 2) + (i10 - i11);
            int i12 = this.bottomSpacing + i9;
            int i13 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap, width, ((i13 - bitmap.getHeight()) / 2) + (i12 - i13), this.paint);
        }
        if (getEndIcon() != null) {
            Bitmap[] endIcon = getEndIcon();
            if (!isInternalValid()) {
                c = 3;
            } else if (!isEnabled()) {
                c = 2;
            } else if (hasFocus()) {
                c = 1;
            }
            Bitmap bitmap2 = endIcon[c];
            int width2 = ((this.iconOuterWidth - bitmap2.getWidth()) / 2) + i8 + this.iconPadding;
            int i14 = i9 + this.bottomSpacing;
            int i15 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap2, width2, ((i15 - bitmap2.getHeight()) / 2) + (i14 - i15), this.paint);
        }
    }

    private int drawUnderline(@NonNull Canvas canvas, int i, int i8, int i9) {
        if (this.hideUnderline) {
            return i9;
        }
        int i10 = i9 + this.bottomSpacing;
        if (!isInternalValid()) {
            this.paint.setColor(this.errorColor);
            canvas.drawRect(i, i10, i8, this.underlineHeightFocused + i10, this.paint);
            return i10;
        }
        if (isEnabled()) {
            if (hasFocus()) {
                this.paint.setColor(this.primaryColor);
                canvas.drawRect(i, i10, i8, this.underlineHeightFocused + i10, this.paint);
                return i10;
            }
            Paint paint = this.paint;
            int i11 = this.underlineColor;
            if (i11 == -1) {
                i11 = (16777215 & this.baseColor) | 503316480;
            }
            paint.setColor(i11);
            canvas.drawRect(i, i10, i8, this.underlineHeight + i10, this.paint);
            return i10;
        }
        Paint paint2 = this.paint;
        int i12 = this.underlineColor;
        if (i12 == -1) {
            i12 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
        }
        paint2.setColor(i12);
        float pixel = getPixel(1);
        for (float f = 0.0f; f < getWidth(); f += 3.0f * pixel) {
            float f7 = i + f;
            canvas.drawRect(f7, i10, f7 + pixel, this.underlineHeight + i10, this.paint);
        }
        return i10;
    }

    private Bitmap[] generateIconBitmaps(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i8 = this.iconSize;
        options.inSampleSize = iMax > i8 ? iMax / i8 : 1;
        options.inJustDecodeBounds = false;
        return generateIconBitmaps(BitmapFactory.decodeResource(getResources(), i, options));
    }

    private int getBottomEllipsisWidth() {
        if (this.singleLineEllipsis) {
            return (this.bottomEllipsisSize * 5) + getPixel(4);
        }
        return 0;
    }

    private ObjectAnimator getBottomLinesAnimator(float f) {
        ObjectAnimator objectAnimator = this.bottomLinesAnimator;
        if (objectAnimator == null) {
            this.bottomLinesAnimator = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.bottomLinesAnimator.setFloatValues(f);
        }
        return this.bottomLinesAnimator;
    }

    private int getBottomTextLeftOffset() {
        return isRTL() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return isRTL() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return (isShowClearButton() || isShowPasswordButton()) ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.minCharacters <= 0) {
            if (isRTL()) {
                return this.maxCharacters + " / " + checkLength(getText());
            }
            return checkLength(getText()) + " / " + this.maxCharacters;
        }
        if (this.maxCharacters <= 0) {
            if (!isRTL()) {
                StringBuilder sb = new StringBuilder();
                sb.append(checkLength(getText()));
                sb.append(" / ");
                return AbstractC0037f.m90o(sb, "+", this.minCharacters);
            }
            return "+" + this.minCharacters + " / " + checkLength(getText());
        }
        if (isRTL()) {
            return this.maxCharacters + "-" + this.minCharacters + " / " + checkLength(getText());
        }
        return checkLength(getText()) + " / " + this.minCharacters + "-" + this.maxCharacters;
    }

    private int getCharactersCounterWidth() {
        if (hasCharactersCounter()) {
            return (int) this.textPaint.measureText(getCharactersCounterText());
        }
        return 0;
    }

    private Bitmap[] getEndIcon() {
        return isRTL() ? this.iconLeftBitmaps : this.iconRightBitmaps;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.labelAnimator == null) {
            this.labelAnimator = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.labelAnimator.setDuration(this.floatingLabelAnimating ? 300L : 0L);
        return this.labelAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.labelFocusAnimator == null) {
            this.labelFocusAnimator = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.labelFocusAnimator;
    }

    private int getPixel(int i) {
        return AbstractC5625a.m4948h(getContext(), i);
    }

    private Bitmap[] getStartIcon() {
        return isRTL() ? this.iconRightBitmaps : this.iconLeftBitmaps;
    }

    private void handleSwitchPasswordInputVisibility() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.passwordVisible) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.mTransformationMethod);
        }
        setSelection(selectionStart, selectionEnd);
    }

    private boolean hasCharactersCounter() {
        return this.minCharacters > 0 || this.maxCharacters > 0;
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        this.iconSize = getPixel(32);
        this.iconOuterWidth = getPixel(24);
        this.iconOuterHeight = getPixel(32);
        this.bottomSpacing = getResources().getDimensionPixelSize(R$dimen.default_edittext_components_spacing);
        this.bottomEllipsisSize = getResources().getDimensionPixelSize(R$dimen.default_bottom_ellipsis_height);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialEditText, i, 0);
        this.textColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColor);
        this.textColorHintStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColorHint);
        this.baseColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_baseColor, ViewCompat.MEASURED_STATE_MASK);
        this.primaryColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_primaryColor, AbstractC5806u.m5252F(getContext(), R$attr.colorPrimary, this.baseColor));
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_floatingLabel, 0));
        this.errorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_errorColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_config_color_error_text, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_allowEmpty, true)) {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorEmpty);
            if (TextUtils.isEmpty(string)) {
                AbstractC6582a.m6217a();
                throw null;
            }
            this.validators.add(new NotAllowEmptyValidator(string));
        }
        this.minCharacters = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minCharacters, 0);
        this.maxCharacters = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_maxCharacters, 0);
        this.singleLineEllipsis = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_singleLineEllipsis, false);
        this.helperText = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_helperText);
        this.helperTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_helperTextColor, -1);
        this.minBottomTextLines = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minBottomTextLines, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_accentTypeface);
        if (string2 != null) {
            AbstractC6582a.m6219c(string2);
            this.accentTypeface = null;
            this.textPaint.setTypeface(null);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_typeface);
        if (string3 != null) {
            AbstractC6582a.m6219c(string3);
            setTypeface(null);
        }
        String string4 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_floatingLabelText);
        this.floatingLabelText = string4;
        if (string4 == null) {
            this.floatingLabelText = getHint();
        }
        this.floatingLabelPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_floatingLabelPadding, this.bottomSpacing);
        this.floatingLabelTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_floatingLabelTextSize, getResources().getDimensionPixelSize(R$dimen.default_floating_label_text_size));
        this.floatingLabelTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_floatingLabelTextColor, -1);
        this.floatingLabelAnimating = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_floatingLabelAnimating, true);
        this.bottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_bottomTextSize, getResources().getDimensionPixelSize(R$dimen.default_bottom_text_size));
        this.hideUnderline = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_hideUnderline, false);
        this.underlineColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_underlineColor, -1);
        this.underlineHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_underlineHeight, getPixel(1));
        this.underlineHeightFocused = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_underlineHeightFocused, getPixel(2));
        this.autoValidate = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_autoValidate, false);
        this.iconLeftBitmaps = generateIconBitmaps(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialEditText_met_iconLeft, -1));
        this.iconRightBitmaps = generateIconBitmaps(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialEditText_met_iconRight, -1));
        this.showClearButton = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_clearButton, false);
        this.clearButtonBitmaps = generateIconBitmaps(AbstractC4151a.m3429a(getContext(), R$drawable.xui_ic_default_clear_btn));
        this.showPasswordButton = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_passWordButton, false);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_isAsteriskStyle, false)) {
            C6049b c6049b = C6049b.f9640a;
            if (c6049b == null) {
                c6049b = new C6049b();
                C6049b.f9640a = c6049b;
            }
            this.mTransformationMethod = c6049b;
        } else {
            this.mTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        if (this.showPasswordButton) {
            handleSwitchPasswordInputVisibility();
        }
        this.showPwIconBitmaps = generateIconBitmaps(AbstractC4151a.m3429a(getContext(), R$drawable.pet_icon_visibility_24dp));
        this.hidePwIconBitmaps = generateIconBitmaps(AbstractC4151a.m3429a(getContext(), R$drawable.pet_icon_visibility_off_24dp));
        String string5 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_regexp);
        if (!TextUtils.isEmpty(string5)) {
            String string6 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorMessage);
            if (TextUtils.isEmpty(string6)) {
                AbstractC6582a.m6217a();
                throw null;
            }
            this.validators.add(new RegexpValidator(string6, string5));
        }
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_iconPadding, getPixel(8));
        this.floatingLabelAlwaysShown = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_floatingLabelAlwaysShown, false);
        this.helperTextAlwaysShown = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_helperTextAlwaysShown, false);
        this.validateOnFocusLost = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_validateOnFocusLost, false);
        this.checkCharactersCountAtBeginning = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_checkCharactersCountAtBeginning, true);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.innerPaddingLeft = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.innerPaddingTop = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.innerPaddingRight = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.innerPaddingBottom = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.singleLineEllipsis) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        initMinBottomLines();
        initPadding();
        initText();
        initFloatingLabel();
        initTextWatcher();
        checkCharactersCount();
    }

    private void initFloatingLabel() {
        addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (MaterialEditText.this.floatingLabelEnabled) {
                    if (editable.length() == 0) {
                        if (MaterialEditText.this.floatingLabelShown) {
                            MaterialEditText.this.floatingLabelShown = false;
                            MaterialEditText.this.getLabelAnimator().reverse();
                            return;
                        }
                        return;
                    }
                    if (MaterialEditText.this.floatingLabelShown) {
                        return;
                    }
                    MaterialEditText.this.floatingLabelShown = true;
                    MaterialEditText.this.getLabelAnimator().start();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }
        });
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z8) {
                if (MaterialEditText.this.floatingLabelEnabled && MaterialEditText.this.highlightFloatingLabel) {
                    if (z8) {
                        MaterialEditText.this.getLabelFocusAnimator().start();
                    } else {
                        MaterialEditText.this.getLabelFocusAnimator().reverse();
                    }
                }
                if (MaterialEditText.this.validateOnFocusLost && !z8) {
                    MaterialEditText.this.validate();
                }
                View.OnFocusChangeListener onFocusChangeListener2 = MaterialEditText.this.outerFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z8);
                }
            }
        };
        this.innerFocusChangeListener = onFocusChangeListener;
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void initMinBottomLines() {
        int i = 1;
        boolean z8 = this.minCharacters > 0 || this.maxCharacters > 0 || this.singleLineEllipsis || this.tempErrorText != null || this.helperText != null;
        int i8 = this.minBottomTextLines;
        if (i8 > 0) {
            i = i8;
        } else if (!z8) {
            i = 0;
        }
        this.minBottomLines = i;
        this.currentBottomLines = i;
    }

    private void initPadding() {
        this.extraPaddingTop = this.floatingLabelEnabled ? this.floatingLabelTextSize + this.floatingLabelPadding : this.floatingLabelPadding;
        this.textPaint.setTextSize(this.bottomTextSize);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        this.extraPaddingBottom = ((int) ((fontMetrics.descent - fontMetrics.ascent) * this.currentBottomLines)) + (this.hideUnderline ? this.bottomSpacing : this.bottomSpacing * 2);
        this.extraPaddingLeft = getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding;
        this.extraPaddingRight = getEndIcon() != null ? this.iconPadding + this.iconOuterWidth : 0;
        correctPaddings();
    }

    private void initText() {
        if (TextUtils.isEmpty(getText())) {
            resetHintTextColor();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            resetHintTextColor();
            setText(text);
            setSelection(text != null ? text.length() : 0);
            this.floatingLabelFraction = 1.0f;
            this.floatingLabelShown = true;
        }
        resetTextColor();
    }

    private void initTextWatcher() {
        addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                MaterialEditText.this.checkCharactersCount();
                if (MaterialEditText.this.autoValidate) {
                    MaterialEditText.this.validate();
                } else {
                    MaterialEditText.this.setError(null);
                }
                MaterialEditText.this.postInvalidate();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }
        });
    }

    private boolean insideActionButton(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int i = getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding;
        int width = getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding;
        if (!isRTL()) {
            i = width - this.iconOuterWidth;
        }
        int height = ((getHeight() + getScrollY()) - getPaddingBottom()) + this.bottomSpacing;
        int i8 = this.iconOuterHeight;
        int i9 = height - i8;
        return x3 >= ((float) i) && x3 < ((float) (i + this.iconOuterWidth)) && y2 >= ((float) i9) && y2 < ((float) (i9 + i8));
    }

    private boolean isInternalValid() {
        return this.tempErrorText == null && isCharactersCountValid();
    }

    private boolean isRTL() {
        return getLayoutDirection() == 1;
    }

    private void resetHintTextColor() {
        ColorStateList colorStateList = this.textColorHintStateList;
        if (colorStateList == null) {
            setHintTextColor((this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    private void resetTextColor() {
        ColorStateList colorStateList = this.textColorStateList;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
        int i = this.baseColor;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & ViewCompat.MEASURED_SIZE_MASK) | (-553648128), (i & ViewCompat.MEASURED_SIZE_MASK) | 1140850688});
        this.textColorStateList = colorStateList2;
        setTextColor(colorStateList2);
    }

    private Bitmap scaleIcon(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i8 = this.iconSize;
        if (iMax == i8 || iMax <= i8) {
            return bitmap;
        }
        if (width > i8) {
            i = (int) ((height / width) * i8);
        } else {
            i8 = (int) ((width / height) * i8);
            i = i8;
        }
        return Bitmap.createScaledBitmap(bitmap, i8, i, false);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.floatingLabelEnabled = true;
            this.highlightFloatingLabel = false;
        } else if (i != 2) {
            this.floatingLabelEnabled = false;
            this.highlightFloatingLabel = false;
        } else {
            this.floatingLabelEnabled = true;
            this.highlightFloatingLabel = true;
        }
    }

    private void togglePasswordIconVisibility() {
        this.passwordVisible = !this.passwordVisible;
        handleSwitchPasswordInputVisibility();
    }

    public MaterialEditText addValidator(METValidator mETValidator) {
        if (this.validators == null) {
            this.validators = new ArrayList();
        }
        this.validators.add(mETValidator);
        return this;
    }

    public void clear() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        setText((CharSequence) null);
    }

    public MaterialEditText clearValidators() {
        List<METValidator> list = this.validators;
        if (list != null) {
            list.clear();
        }
        return this;
    }

    @Nullable
    public Typeface getAccentTypeface() {
        return this.accentTypeface;
    }

    public int getBottomTextSize() {
        return this.bottomTextSize;
    }

    public float getCurrentBottomLines() {
        return this.currentBottomLines;
    }

    public String getEditValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.tempErrorText;
    }

    public int getErrorColor() {
        return this.errorColor;
    }

    public float getFloatingLabelFraction() {
        return this.floatingLabelFraction;
    }

    public int getFloatingLabelPadding() {
        return this.floatingLabelPadding;
    }

    public CharSequence getFloatingLabelText() {
        return this.floatingLabelText;
    }

    public int getFloatingLabelTextColor() {
        return this.floatingLabelTextColor;
    }

    public int getFloatingLabelTextSize() {
        return this.floatingLabelTextSize;
    }

    public float getFocusFraction() {
        return this.focusFraction;
    }

    public String getHelperText() {
        return this.helperText;
    }

    public int getHelperTextColor() {
        return this.helperTextColor;
    }

    public int getInnerPaddingBottom() {
        return this.innerPaddingBottom;
    }

    public int getInnerPaddingLeft() {
        return this.innerPaddingLeft;
    }

    public int getInnerPaddingRight() {
        return this.innerPaddingRight;
    }

    public int getInnerPaddingTop() {
        return this.innerPaddingTop;
    }

    public int getMaxCharacters() {
        return this.maxCharacters;
    }

    public int getMinBottomTextLines() {
        return this.minBottomTextLines;
    }

    public int getMinCharacters() {
        return this.minCharacters;
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    @Nullable
    public List<METValidator> getValidators() {
        return this.validators;
    }

    public boolean hasValidators() {
        List<METValidator> list = this.validators;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isAutoValidate() {
        return this.autoValidate;
    }

    public boolean isCharactersCountValid() {
        return this.charactersCountValid;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getEditValue());
    }

    public boolean isFloatingLabelAlwaysShown() {
        return this.floatingLabelAlwaysShown;
    }

    public boolean isFloatingLabelAnimating() {
        return this.floatingLabelAnimating;
    }

    public boolean isHelperTextAlwaysShown() {
        return this.helperTextAlwaysShown;
    }

    public boolean isHideUnderline() {
        return this.hideUnderline;
    }

    public boolean isNotEmpty() {
        return !TextUtils.isEmpty(getEditValue());
    }

    public boolean isShowClearButton() {
        return this.showClearButton;
    }

    public boolean isShowPasswordButton() {
        return this.showPasswordButton;
    }

    @Deprecated
    public boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile(str).matcher(getText()).matches();
    }

    public boolean isValidateOnFocusLost() {
        return this.validateOnFocusLost;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.firstShown) {
            return;
        }
        this.firstShown = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int scrollX = getScrollX() + (getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding);
        int scrollX2 = getScrollX() + (getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding);
        int height = (getHeight() + getScrollY()) - getPaddingBottom();
        drawIcons(canvas, scrollX, scrollX2, height);
        drawActionButton(canvas, scrollX, scrollX2, height);
        int iDrawUnderline = drawUnderline(canvas, scrollX, scrollX2, height);
        this.textPaint.setTextSize(this.bottomTextSize);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f = fontMetrics.ascent;
        float f7 = fontMetrics.descent;
        float f8 = (-f) - f7;
        float f9 = this.bottomTextSize + f + f7;
        if ((hasFocus() && hasCharactersCounter()) || !isCharactersCountValid()) {
            this.textPaint.setColor(isCharactersCountValid() ? (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688 : this.errorColor);
            String charactersCounterText = getCharactersCounterText();
            canvas.drawText(charactersCounterText, isRTL() ? scrollX : (getPaddingEnd() + scrollX2) - this.textPaint.measureText(charactersCounterText), this.bottomSpacing + iDrawUnderline + f8, this.textPaint);
        }
        drawBottomText(canvas, scrollX, scrollX2, iDrawUnderline, f9);
        drawFloatingLabel(canvas, scrollX, scrollX2);
        drawBottomEllipsis(canvas, scrollX, scrollX2, iDrawUnderline);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (z8) {
            adjustBottomLines();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.singleLineEllipsis && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < getPixel(20) && motionEvent.getY() > (getHeight() - this.extraPaddingBottom) - this.innerPaddingBottom && motionEvent.getY() < getHeight() - this.innerPaddingBottom) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && ((this.showClearButton || this.showPasswordButton) && isEnabled())) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.actionButtonClicking) {
                        if (!this.showClearButton) {
                            togglePasswordIconVisibility();
                        } else if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.actionButtonClicking = false;
                    }
                    if (this.actionButtonTouched) {
                        this.actionButtonTouched = false;
                        return true;
                    }
                    this.actionButtonTouched = false;
                } else if (action != 2) {
                    if (action == 3) {
                        this.actionButtonTouched = false;
                        this.actionButtonClicking = false;
                    }
                }
            } else if (insideActionButton(motionEvent)) {
                this.actionButtonTouched = true;
                this.actionButtonClicking = true;
                return true;
            }
            if (this.actionButtonClicking && !insideActionButton(motionEvent)) {
                this.actionButtonClicking = false;
            }
            if (this.actionButtonTouched) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public MaterialEditText setAccentTypeface(Typeface typeface) {
        this.accentTypeface = typeface;
        this.textPaint.setTypeface(typeface);
        postInvalidate();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r4.validators.add(new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        p164t1.AbstractC6582a.m6217a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText setAllowEmpty(boolean r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r0 = r4.validators
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator r1 = (com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator) r1
            boolean r3 = r1 instanceof com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            if (r3 == 0) goto L6
            if (r5 == 0) goto L1d
            r0.remove()
            goto L2c
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L28
            r1.setErrorMessage(r6)
            r0 = 1
            goto L2d
        L28:
            p164t1.AbstractC6582a.m6217a()
            throw r2
        L2c:
            r0 = 0
        L2d:
            if (r5 != 0) goto L46
            if (r0 != 0) goto L46
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L42
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r5 = r4.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r0 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            r0.<init>(r6)
            r5.add(r0)
            return r4
        L42:
            p164t1.AbstractC6582a.m6217a()
            throw r2
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.setAllowEmpty(boolean, java.lang.String):com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText");
    }

    public MaterialEditText setAutoValidate(boolean z8) {
        this.autoValidate = z8;
        if (z8) {
            validate();
        }
        return this;
    }

    public MaterialEditText setBaseColor(int i) {
        if (this.baseColor != i) {
            this.baseColor = i;
        }
        initText();
        postInvalidate();
        return this;
    }

    public void setBottomTextSize(int i) {
        this.bottomTextSize = i;
        initPadding();
    }

    public MaterialEditText setCurrentBottomLines(float f) {
        this.currentBottomLines = f;
        initPadding();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setFocusable(z8);
        super.setFocusableInTouchMode(z8);
        super.setEnabled(z8);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.tempErrorText = charSequence == null ? null : charSequence.toString();
        if (adjustBottomLines()) {
            postInvalidate();
        }
    }

    public MaterialEditText setErrorColor(int i) {
        this.errorColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        initPadding();
        return this;
    }

    public MaterialEditText setFloatingLabelAlwaysShown(boolean z8) {
        this.floatingLabelAlwaysShown = z8;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelAnimating(boolean z8) {
        this.floatingLabelAnimating = z8;
        return this;
    }

    public MaterialEditText setFloatingLabelFraction(float f) {
        this.floatingLabelFraction = f;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelPadding(int i) {
        this.floatingLabelPadding = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.floatingLabelText = charSequence;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelTextColor(int i) {
        this.floatingLabelTextColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelTextSize(int i) {
        this.floatingLabelTextSize = i;
        initPadding();
        return this;
    }

    public MaterialEditText setFocusFraction(float f) {
        this.focusFraction = f;
        invalidate();
        return this;
    }

    public MaterialEditText setHelperText(CharSequence charSequence) {
        this.helperText = charSequence == null ? null : charSequence.toString();
        if (adjustBottomLines()) {
            postInvalidate();
        }
        return this;
    }

    public MaterialEditText setHelperTextAlwaysShown(boolean z8) {
        this.helperTextAlwaysShown = z8;
        invalidate();
        return this;
    }

    public MaterialEditText setHelperTextColor(int i) {
        this.helperTextColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setHideUnderline(boolean z8) {
        this.hideUnderline = z8;
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setIconLeft(@DrawableRes int i) {
        this.iconLeftBitmaps = generateIconBitmaps(i);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(@DrawableRes int i) {
        this.iconRightBitmaps = generateIconBitmaps(i);
        initPadding();
        return this;
    }

    public MaterialEditText setLengthChecker(METLengthChecker mETLengthChecker) {
        this.lengthChecker = mETLengthChecker;
        return this;
    }

    public MaterialEditText setMaxCharacters(int i) {
        this.maxCharacters = i;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMetHintTextColor(int i) {
        this.textColorHintStateList = ColorStateList.valueOf(i);
        resetHintTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(int i) {
        this.textColorStateList = ColorStateList.valueOf(i);
        resetTextColor();
        return this;
    }

    public MaterialEditText setMinBottomTextLines(int i) {
        this.minBottomTextLines = i;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMinCharacters(int i) {
        this.minCharacters = i;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.innerFocusChangeListener == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.outerFocusChangeListener = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i8, int i9, int i10) {
        super.setPadding(i, i8, i9, i10);
    }

    public MaterialEditText setPaddings(int i, int i8, int i9, int i10) {
        this.innerPaddingTop = i8;
        this.innerPaddingBottom = i10;
        this.innerPaddingLeft = i;
        this.innerPaddingRight = i9;
        correctPaddings();
        return this;
    }

    public MaterialEditText setPasswordTransformationMethod(PasswordTransformationMethod passwordTransformationMethod) {
        this.mTransformationMethod = passwordTransformationMethod;
        return this;
    }

    public MaterialEditText setPrimaryColor(int i) {
        this.primaryColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setShowClearButton(boolean z8) {
        this.showClearButton = z8;
        correctPaddings();
        return this;
    }

    public MaterialEditText setSingleLineEllipsis() {
        return setSingleLineEllipsis(true);
    }

    @Override // android.widget.TextView, io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.textPaint;
        if (textPaint != null) {
            textPaint.setTypeface(typeface);
        }
    }

    public MaterialEditText setUnderlineColor(int i) {
        this.underlineColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setValidateOnFocusLost(boolean z8) {
        this.validateOnFocusLost = z8;
        return this;
    }

    @Deprecated
    public boolean validate(String str, CharSequence charSequence) {
        boolean zIsValid = isValid(str);
        if (!zIsValid) {
            setError(charSequence);
        }
        postInvalidate();
        return zIsValid;
    }

    public boolean validateWith(@NonNull METValidator mETValidator) {
        Editable text = getText();
        boolean zIsValid = mETValidator.isValid(text, text.length() == 0);
        if (!zIsValid) {
            setError(mETValidator.getErrorMessage());
        }
        postInvalidate();
        return zIsValid;
    }

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MaterialEditTextStyle);
    }

    public MaterialEditText setSingleLineEllipsis(boolean z8) {
        this.singleLineEllipsis = z8;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.helperTextColor = -1;
        this.focusEvaluator = new ArgbEvaluator();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.validators = new ArrayList();
        init(context, attributeSet, i);
    }

    public MaterialEditText setIconLeft(Drawable drawable) {
        this.iconLeftBitmaps = generateIconBitmaps(drawable);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(Drawable drawable) {
        this.iconRightBitmaps = generateIconBitmaps(drawable);
        initPadding();
        return this;
    }

    public MaterialEditText setMetHintTextColor(ColorStateList colorStateList) {
        this.textColorHintStateList = colorStateList;
        resetHintTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(ColorStateList colorStateList) {
        this.textColorStateList = colorStateList;
        resetTextColor();
        return this;
    }

    public boolean validate() {
        List<METValidator> list = this.validators;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        Iterator<METValidator> it = this.validators.iterator();
        boolean z8 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            METValidator next = it.next();
            z8 = z8 && next.isValid(text, zIsEmpty);
            if (!z8) {
                setError(next.getErrorMessage());
                break;
            }
        }
        if (z8) {
            setError(null);
        }
        postInvalidate();
        return z8;
    }

    public MaterialEditText setIconLeft(Bitmap bitmap) {
        this.iconLeftBitmaps = generateIconBitmaps(bitmap);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(Bitmap bitmap) {
        this.iconRightBitmaps = generateIconBitmaps(bitmap);
        initPadding();
        return this;
    }

    private Bitmap[] generateIconBitmaps(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        int i = this.iconSize;
        return generateIconBitmaps(Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i, false));
    }

    private Bitmap[] generateIconBitmaps(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapScaleIcon = scaleIcon(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapScaleIcon.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.baseColor;
        int i8 = (AbstractC6600a.m6236l(i) ? ViewCompat.MEASURED_STATE_MASK : -1979711488) | (i & ViewCompat.MEASURED_SIZE_MASK);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i8, mode);
        bitmapArr[1] = bitmapScaleIcon.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.primaryColor, mode);
        bitmapArr[2] = bitmapScaleIcon.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i9 = this.baseColor;
        canvas2.drawColor((AbstractC6600a.m6236l(i9) ? 1275068416 : 1107296256) | (16777215 & i9), mode);
        bitmapArr[3] = bitmapScaleIcon.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.errorColor, mode);
        return bitmapArr;
    }
}
