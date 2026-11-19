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
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6796b;
import com.xuexiang.xui.utils.AbstractC6797c;
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.utils.AbstractC6802h;
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
import p093e3.AbstractC7843b;
import p241s3.C9469a;

@Keep
/* loaded from: classes4.dex */
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
        float f10 = iMax;
        if (this.bottomLines != f10) {
            getBottomLinesAnimator(f10).start();
        }
        this.bottomLines = f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCharactersCount() {
        int i9;
        boolean z9 = true;
        if ((!this.firstShown && !this.checkCharactersCountAtBeginning) || !hasCharactersCounter()) {
            this.charactersCountValid = true;
            return;
        }
        Editable text = getText();
        int iCheckLength = text == null ? 0 : checkLength(text);
        if (iCheckLength < this.minCharacters || ((i9 = this.maxCharacters) > 0 && iCheckLength > i9)) {
            z9 = false;
        }
        this.charactersCountValid = z9;
    }

    private int checkLength(CharSequence charSequence) {
        METLengthChecker mETLengthChecker = this.lengthChecker;
        return mETLengthChecker == null ? charSequence.length() : mETLengthChecker.getLength(charSequence);
    }

    private void correctPaddings() {
        int buttonsCount = this.iconOuterWidth * getButtonsCount();
        int i9 = 0;
        if (!isRTL()) {
            i9 = buttonsCount;
            buttonsCount = 0;
        }
        super.setPaddingRelative(this.innerPaddingLeft + this.extraPaddingLeft + buttonsCount, this.innerPaddingTop + this.extraPaddingTop, this.innerPaddingRight + this.extraPaddingRight + i9, this.innerPaddingBottom + this.extraPaddingBottom);
    }

    private void drawActionButton(@NonNull Canvas canvas, int i9, int i10, int i11) {
        if (hasFocus() && isEnabled() && !TextUtils.isEmpty(getText())) {
            if (this.showClearButton || this.showPasswordButton) {
                this.paint.setAlpha(255);
                if (!isRTL()) {
                    i9 = i10 - this.iconOuterWidth;
                }
                Bitmap bitmap = this.showClearButton ? this.clearButtonBitmaps[0] : this.passwordVisible ? this.showPwIconBitmaps[0] : this.hidePwIconBitmaps[0];
                int i12 = i11 + this.bottomSpacing;
                int i13 = this.iconOuterHeight;
                canvas.drawBitmap(bitmap, i9, (i12 - i13) + ((i13 - bitmap.getHeight()) / 2), this.paint);
            }
        }
    }

    private void drawBottomEllipsis(@NonNull Canvas canvas, int i9, int i10, int i11) {
        if (hasFocus() && this.singleLineEllipsis && getScrollX() != 0) {
            this.paint.setColor(isInternalValid() ? this.primaryColor : this.errorColor);
            float f10 = i11 + this.bottomSpacing;
            if (isRTL()) {
                i9 = i10;
            }
            int i12 = isRTL() ? -1 : 1;
            float f11 = i9;
            int i13 = this.bottomEllipsisSize;
            canvas.drawCircle(((i12 * i13) / 2.0f) + f11, (i13 / 2.0f) + f10, i13 / 2.0f, this.paint);
            int i14 = this.bottomEllipsisSize;
            canvas.drawCircle((((i12 * i14) * 5) / 2.0f) + f11, (i14 / 2.0f) + f10, i14 / 2.0f, this.paint);
            int i15 = this.bottomEllipsisSize;
            canvas.drawCircle(f11 + (((i12 * i15) * 9) / 2.0f), f10 + (i15 / 2.0f), i15 / 2.0f, this.paint);
        }
    }

    private void drawBottomText(@NonNull Canvas canvas, int i9, int i10, int i11, float f10) {
        int i12;
        if (this.textLayout != null) {
            if (this.tempErrorText != null || ((this.helperTextAlwaysShown || hasFocus()) && !TextUtils.isEmpty(this.helperText))) {
                TextPaint textPaint = this.textPaint;
                if (this.tempErrorText != null) {
                    i12 = this.errorColor;
                } else {
                    i12 = this.helperTextColor;
                    if (i12 == -1) {
                        i12 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
                    }
                }
                textPaint.setColor(i12);
                canvas.save();
                if (isRTL()) {
                    canvas.translate(i10 - this.textLayout.getWidth(), (i11 + this.bottomSpacing) - f10);
                } else {
                    canvas.translate(i9 + getBottomTextLeftOffset(), (i11 + this.bottomSpacing) - f10);
                }
                this.textLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void drawFloatingLabel(@NonNull Canvas canvas, int i9, int i10) {
        if (!this.floatingLabelEnabled || TextUtils.isEmpty(this.floatingLabelText)) {
            return;
        }
        this.textPaint.setTextSize(this.floatingLabelTextSize);
        TextPaint textPaint = this.textPaint;
        ArgbEvaluator argbEvaluator = this.focusEvaluator;
        float f10 = this.focusFraction * (isEnabled() ? 1.0f : 0.0f);
        int i11 = this.floatingLabelTextColor;
        if (i11 == -1) {
            i11 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
        }
        textPaint.setColor(((Integer) argbEvaluator.evaluate(f10, Integer.valueOf(i11), Integer.valueOf(this.primaryColor))).intValue());
        float fMeasureText = this.textPaint.measureText(this.floatingLabelText.toString());
        if ((getGravity() & 5) == 5 || isRTL()) {
            i9 = (int) (i10 - fMeasureText);
        } else if ((getGravity() & 3) != 3) {
            i9 += (int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f));
        }
        int scrollY = (int) ((((this.innerPaddingTop + this.floatingLabelTextSize) + r9) - (this.floatingLabelPadding * (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction))) + getScrollY());
        this.textPaint.setAlpha((int) ((this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction) * 255.0f * ((this.focusFraction * 0.74f * (isEnabled() ? 1.0f : 0.0f)) + 0.26f) * (this.floatingLabelTextColor == -1 ? Color.alpha(r3) / 255.0f : 1.0f)));
        canvas.drawText(this.floatingLabelText.toString(), i9, scrollY, this.textPaint);
    }

    private void drawIcons(@NonNull Canvas canvas, int i9, int i10, int i11) {
        this.paint.setAlpha(255);
        char c10 = 0;
        if (getStartIcon() != null) {
            Bitmap bitmap = getStartIcon()[!isInternalValid() ? (char) 3 : !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0];
            int i12 = i9 - this.iconPadding;
            int i13 = this.iconOuterWidth;
            int width = (i12 - i13) + ((i13 - bitmap.getWidth()) / 2);
            int i14 = this.bottomSpacing + i11;
            int i15 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap, width, (i14 - i15) + ((i15 - bitmap.getHeight()) / 2), this.paint);
        }
        if (getEndIcon() != null) {
            Bitmap[] endIcon = getEndIcon();
            if (!isInternalValid()) {
                c10 = 3;
            } else if (!isEnabled()) {
                c10 = 2;
            } else if (hasFocus()) {
                c10 = 1;
            }
            Bitmap bitmap2 = endIcon[c10];
            int width2 = i10 + this.iconPadding + ((this.iconOuterWidth - bitmap2.getWidth()) / 2);
            int i16 = i11 + this.bottomSpacing;
            int i17 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap2, width2, (i16 - i17) + ((i17 - bitmap2.getHeight()) / 2), this.paint);
        }
    }

    private int drawUnderline(@NonNull Canvas canvas, int i9, int i10, int i11) {
        if (this.hideUnderline) {
            return i11;
        }
        int i12 = i11 + this.bottomSpacing;
        if (!isInternalValid()) {
            this.paint.setColor(this.errorColor);
            canvas.drawRect(i9, i12, i10, this.underlineHeightFocused + i12, this.paint);
            return i12;
        }
        if (isEnabled()) {
            if (hasFocus()) {
                this.paint.setColor(this.primaryColor);
                canvas.drawRect(i9, i12, i10, this.underlineHeightFocused + i12, this.paint);
                return i12;
            }
            Paint paint = this.paint;
            int i13 = this.underlineColor;
            if (i13 == -1) {
                i13 = (16777215 & this.baseColor) | 503316480;
            }
            paint.setColor(i13);
            canvas.drawRect(i9, i12, i10, this.underlineHeight + i12, this.paint);
            return i12;
        }
        Paint paint2 = this.paint;
        int i14 = this.underlineColor;
        if (i14 == -1) {
            i14 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
        }
        paint2.setColor(i14);
        float pixel = getPixel(1);
        for (float f10 = 0.0f; f10 < getWidth(); f10 += 3.0f * pixel) {
            float f11 = i9 + f10;
            canvas.drawRect(f11, i12, f11 + pixel, this.underlineHeight + i12, this.paint);
        }
        return i12;
    }

    private Bitmap[] generateIconBitmaps(@DrawableRes int i9) {
        if (i9 == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i10 = this.iconSize;
        options.inSampleSize = iMax > i10 ? iMax / i10 : 1;
        options.inJustDecodeBounds = false;
        return generateIconBitmaps(BitmapFactory.decodeResource(getResources(), i9, options));
    }

    private int getBottomEllipsisWidth() {
        if (this.singleLineEllipsis) {
            return (this.bottomEllipsisSize * 5) + getPixel(4);
        }
        return 0;
    }

    private ObjectAnimator getBottomLinesAnimator(float f10) {
        ObjectAnimator objectAnimator = this.bottomLinesAnimator;
        if (objectAnimator == null) {
            this.bottomLinesAnimator = ObjectAnimator.ofFloat(this, "currentBottomLines", f10);
        } else {
            objectAnimator.cancel();
            this.bottomLinesAnimator.setFloatValues(f10);
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
            if (isRTL()) {
                return "+" + this.minCharacters + " / " + checkLength(getText());
            }
            return checkLength(getText()) + " / " + this.minCharacters + "+";
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

    private int getPixel(int i9) {
        return AbstractC6796b.m6442b(getContext(), i9);
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

    private void init(Context context, AttributeSet attributeSet, int i9) {
        this.iconSize = getPixel(32);
        this.iconOuterWidth = getPixel(24);
        this.iconOuterHeight = getPixel(32);
        this.bottomSpacing = getResources().getDimensionPixelSize(R$dimen.default_edittext_components_spacing);
        this.bottomEllipsisSize = getResources().getDimensionPixelSize(R$dimen.default_bottom_ellipsis_height);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialEditText, i9, 0);
        this.textColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColor);
        this.textColorHintStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColorHint);
        this.baseColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_baseColor, ViewCompat.MEASURED_STATE_MASK);
        this.primaryColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_primaryColor, AbstractC6801g.m6480m(getContext(), R$attr.colorPrimary, this.baseColor));
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_floatingLabel, 0));
        this.errorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_errorColor, AbstractC6801g.m6479l(getContext(), R$attr.xui_config_color_error_text));
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_allowEmpty, true)) {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorEmpty);
            if (TextUtils.isEmpty(string)) {
                this.validators.add(new NotAllowEmptyValidator(AbstractC6799e.m6463h(R$string.xui_met_not_allow_empty)));
            } else {
                this.validators.add(new NotAllowEmptyValidator(string));
            }
        }
        this.minCharacters = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minCharacters, 0);
        this.maxCharacters = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_maxCharacters, 0);
        this.singleLineEllipsis = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_singleLineEllipsis, false);
        this.helperText = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_helperText);
        this.helperTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_helperTextColor, -1);
        this.minBottomTextLines = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minBottomTextLines, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_accentTypeface);
        if (string2 != null) {
            Typeface typefaceM12293d = AbstractC7843b.m12293d(string2);
            this.accentTypeface = typefaceM12293d;
            this.textPaint.setTypeface(typefaceM12293d);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_typeface);
        if (string3 != null) {
            setTypeface(AbstractC7843b.m12293d(string3));
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
        this.clearButtonBitmaps = generateIconBitmaps(AbstractC6797c.m6445b(getContext(), R$drawable.xui_ic_default_clear_btn));
        this.showPasswordButton = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_passWordButton, false);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_isAsteriskStyle, false)) {
            this.mTransformationMethod = C9469a.getInstance();
        } else {
            this.mTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        if (this.showPasswordButton) {
            handleSwitchPasswordInputVisibility();
        }
        this.showPwIconBitmaps = generateIconBitmaps(AbstractC6797c.m6445b(getContext(), R$drawable.pet_icon_visibility_24dp));
        this.hidePwIconBitmaps = generateIconBitmaps(AbstractC6797c.m6445b(getContext(), R$drawable.pet_icon_visibility_off_24dp));
        String string5 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_regexp);
        if (!TextUtils.isEmpty(string5)) {
            String string6 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorMessage);
            if (TextUtils.isEmpty(string6)) {
                this.validators.add(new RegexpValidator(AbstractC6799e.m6463h(R$string.xui_met_input_error), string5));
            } else {
                this.validators.add(new RegexpValidator(string6, string5));
            }
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
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }
        });
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                if (MaterialEditText.this.floatingLabelEnabled && MaterialEditText.this.highlightFloatingLabel) {
                    if (z9) {
                        MaterialEditText.this.getLabelFocusAnimator().start();
                    } else {
                        MaterialEditText.this.getLabelFocusAnimator().reverse();
                    }
                }
                if (MaterialEditText.this.validateOnFocusLost && !z9) {
                    MaterialEditText.this.validate();
                }
                View.OnFocusChangeListener onFocusChangeListener2 = MaterialEditText.this.outerFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z9);
                }
            }
        };
        this.innerFocusChangeListener = onFocusChangeListener;
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void initMinBottomLines() {
        int i9 = 1;
        boolean z9 = this.minCharacters > 0 || this.maxCharacters > 0 || this.singleLineEllipsis || this.tempErrorText != null || this.helperText != null;
        int i10 = this.minBottomTextLines;
        if (i10 > 0) {
            i9 = i10;
        } else if (!z9) {
            i9 = 0;
        }
        this.minBottomLines = i9;
        this.currentBottomLines = i9;
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
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }
        });
    }

    private boolean insideActionButton(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int i9 = getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding;
        int width = getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding;
        if (!isRTL()) {
            i9 = width - this.iconOuterWidth;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.bottomSpacing;
        int i10 = this.iconOuterHeight;
        int i11 = scrollY - i10;
        return x9 >= ((float) i9) && x9 < ((float) (i9 + this.iconOuterWidth)) && y9 >= ((float) i11) && y9 < ((float) (i11 + i10));
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
        int i9 = this.baseColor;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i9 & ViewCompat.MEASURED_SIZE_MASK) | (-553648128), (i9 & ViewCompat.MEASURED_SIZE_MASK) | 1140850688});
        this.textColorStateList = colorStateList2;
        setTextColor(colorStateList2);
    }

    private Bitmap scaleIcon(Bitmap bitmap) {
        int i9;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i10 = this.iconSize;
        if (iMax == i10 || iMax <= i10) {
            return bitmap;
        }
        if (width > i10) {
            i9 = (int) (i10 * (height / width));
        } else {
            i10 = (int) (i10 * (width / height));
            i9 = i10;
        }
        return Bitmap.createScaledBitmap(bitmap, i10, i9, false);
    }

    private void setFloatingLabelInternal(int i9) {
        if (i9 == 1) {
            this.floatingLabelEnabled = true;
            this.highlightFloatingLabel = false;
        } else if (i9 != 2) {
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
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        drawIcons(canvas, scrollX, scrollX2, scrollY);
        drawActionButton(canvas, scrollX, scrollX2, scrollY);
        int iDrawUnderline = drawUnderline(canvas, scrollX, scrollX2, scrollY);
        this.textPaint.setTextSize(this.bottomTextSize);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f10 = fontMetrics.ascent;
        float f11 = fontMetrics.descent;
        float f12 = (-f10) - f11;
        float f13 = this.bottomTextSize + f10 + f11;
        if ((hasFocus() && hasCharactersCounter()) || !isCharactersCountValid()) {
            this.textPaint.setColor(isCharactersCountValid() ? (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688 : this.errorColor);
            String charactersCounterText = getCharactersCounterText();
            canvas.drawText(charactersCounterText, isRTL() ? scrollX : (getPaddingEnd() + scrollX2) - this.textPaint.measureText(charactersCounterText), this.bottomSpacing + iDrawUnderline + f12, this.textPaint);
        }
        drawBottomText(canvas, scrollX, scrollX2, iDrawUnderline, f13);
        drawFloatingLabel(canvas, scrollX, scrollX2);
        drawBottomEllipsis(canvas, scrollX, scrollX2, iDrawUnderline);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (z9) {
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText setAllowEmpty(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r0 = r3.validators
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator r1 = (com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator) r1
            boolean r2 = r1 instanceof com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            if (r2 == 0) goto L6
            if (r4 == 0) goto L1c
            r0.remove()
            goto L31
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L26
            r1.setErrorMessage(r5)
            goto L2f
        L26:
            int r0 = com.xuexiang.xui.R$string.xui_met_not_allow_empty
            java.lang.String r0 = com.xuexiang.xui.utils.AbstractC6799e.m6463h(r0)
            r1.setErrorMessage(r0)
        L2f:
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            if (r4 != 0) goto L57
            if (r0 != 0) goto L57
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L47
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r4 = r3.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r0 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            r0.<init>(r5)
            r4.add(r0)
            return r3
        L47:
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r4 = r3.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r5 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            int r0 = com.xuexiang.xui.R$string.xui_met_not_allow_empty
            java.lang.String r0 = com.xuexiang.xui.utils.AbstractC6799e.m6463h(r0)
            r5.<init>(r0)
            r4.add(r5)
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.setAllowEmpty(boolean, java.lang.String):com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText");
    }

    public MaterialEditText setAutoValidate(boolean z9) {
        this.autoValidate = z9;
        if (z9) {
            validate();
        }
        return this;
    }

    public MaterialEditText setBaseColor(int i9) {
        if (this.baseColor != i9) {
            this.baseColor = i9;
        }
        initText();
        postInvalidate();
        return this;
    }

    public void setBottomTextSize(int i9) {
        this.bottomTextSize = i9;
        initPadding();
    }

    public MaterialEditText setCurrentBottomLines(float f10) {
        this.currentBottomLines = f10;
        initPadding();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setFocusable(z9);
        super.setFocusableInTouchMode(z9);
        super.setEnabled(z9);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.tempErrorText = charSequence == null ? null : charSequence.toString();
        if (adjustBottomLines()) {
            postInvalidate();
        }
    }

    public MaterialEditText setErrorColor(int i9) {
        this.errorColor = i9;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabel(int i9) {
        setFloatingLabelInternal(i9);
        initPadding();
        return this;
    }

    public MaterialEditText setFloatingLabelAlwaysShown(boolean z9) {
        this.floatingLabelAlwaysShown = z9;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelAnimating(boolean z9) {
        this.floatingLabelAnimating = z9;
        return this;
    }

    public MaterialEditText setFloatingLabelFraction(float f10) {
        this.floatingLabelFraction = f10;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelPadding(int i9) {
        this.floatingLabelPadding = i9;
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

    public MaterialEditText setFloatingLabelTextColor(int i9) {
        this.floatingLabelTextColor = i9;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelTextSize(int i9) {
        this.floatingLabelTextSize = i9;
        initPadding();
        return this;
    }

    public MaterialEditText setFocusFraction(float f10) {
        this.focusFraction = f10;
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

    public MaterialEditText setHelperTextAlwaysShown(boolean z9) {
        this.helperTextAlwaysShown = z9;
        invalidate();
        return this;
    }

    public MaterialEditText setHelperTextColor(int i9) {
        this.helperTextColor = i9;
        postInvalidate();
        return this;
    }

    public MaterialEditText setHideUnderline(boolean z9) {
        this.hideUnderline = z9;
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setIconLeft(@DrawableRes int i9) {
        this.iconLeftBitmaps = generateIconBitmaps(i9);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(@DrawableRes int i9) {
        this.iconRightBitmaps = generateIconBitmaps(i9);
        initPadding();
        return this;
    }

    public MaterialEditText setLengthChecker(METLengthChecker mETLengthChecker) {
        this.lengthChecker = mETLengthChecker;
        return this;
    }

    public MaterialEditText setMaxCharacters(int i9) {
        this.maxCharacters = i9;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMetHintTextColor(int i9) {
        this.textColorHintStateList = ColorStateList.valueOf(i9);
        resetHintTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(int i9) {
        this.textColorStateList = ColorStateList.valueOf(i9);
        resetTextColor();
        return this;
    }

    public MaterialEditText setMinBottomTextLines(int i9) {
        this.minBottomTextLines = i9;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMinCharacters(int i9) {
        this.minCharacters = i9;
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
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(i9, i10, i11, i12);
    }

    public MaterialEditText setPaddings(int i9, int i10, int i11, int i12) {
        this.innerPaddingTop = i10;
        this.innerPaddingBottom = i12;
        this.innerPaddingLeft = i9;
        this.innerPaddingRight = i11;
        correctPaddings();
        return this;
    }

    public MaterialEditText setPasswordTransformationMethod(PasswordTransformationMethod passwordTransformationMethod) {
        this.mTransformationMethod = passwordTransformationMethod;
        return this;
    }

    public MaterialEditText setPrimaryColor(int i9) {
        this.primaryColor = i9;
        postInvalidate();
        return this;
    }

    public MaterialEditText setShowClearButton(boolean z9) {
        this.showClearButton = z9;
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

    public MaterialEditText setUnderlineColor(int i9) {
        this.underlineColor = i9;
        postInvalidate();
        return this;
    }

    public MaterialEditText setValidateOnFocusLost(boolean z9) {
        this.validateOnFocusLost = z9;
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

    public MaterialEditText setSingleLineEllipsis(boolean z9) {
        this.singleLineEllipsis = z9;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.helperTextColor = -1;
        this.focusEvaluator = new ArgbEvaluator();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.validators = new ArrayList();
        init(context, attributeSet, i9);
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
        boolean z9 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            METValidator next = it.next();
            z9 = z9 && next.isValid(text, zIsEmpty);
            if (!z9) {
                setError(next.getErrorMessage());
                break;
            }
        }
        if (z9) {
            setError(null);
        }
        postInvalidate();
        return z9;
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
        int i9 = this.iconSize;
        return generateIconBitmaps(Bitmap.createScaledBitmap(bitmapCreateBitmap, i9, i9, false));
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
        int i9 = this.baseColor;
        int i10 = (AbstractC6802h.m6498j(i9) ? ViewCompat.MEASURED_STATE_MASK : -1979711488) | (i9 & ViewCompat.MEASURED_SIZE_MASK);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i10, mode);
        bitmapArr[1] = bitmapScaleIcon.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.primaryColor, mode);
        bitmapArr[2] = bitmapScaleIcon.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i11 = this.baseColor;
        canvas2.drawColor((AbstractC6802h.m6498j(i11) ? 1275068416 : 1107296256) | (16777215 & i11), mode);
        bitmapArr[3] = bitmapScaleIcon.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.errorColor, mode);
        return bitmapArr;
    }
}
