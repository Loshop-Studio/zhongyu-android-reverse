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
import com.xuexiang.xui.utils.AbstractC3527b;
import com.xuexiang.xui.utils.AbstractC3528c;
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.utils.AbstractC3532g;
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
import p077j0.AbstractC3799b;
import p123t0.C4581a;

@Keep
/* loaded from: classes2.dex */
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
        float f4 = iMax;
        if (this.bottomLines != f4) {
            getBottomLinesAnimator(f4).start();
        }
        this.bottomLines = f4;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCharactersCount() {
        int i4;
        boolean z3 = true;
        if ((!this.firstShown && !this.checkCharactersCountAtBeginning) || !hasCharactersCounter()) {
            this.charactersCountValid = true;
            return;
        }
        Editable text = getText();
        int iCheckLength = text == null ? 0 : checkLength(text);
        if (iCheckLength < this.minCharacters || ((i4 = this.maxCharacters) > 0 && iCheckLength > i4)) {
            z3 = false;
        }
        this.charactersCountValid = z3;
    }

    private int checkLength(CharSequence charSequence) {
        METLengthChecker mETLengthChecker = this.lengthChecker;
        return mETLengthChecker == null ? charSequence.length() : mETLengthChecker.getLength(charSequence);
    }

    private void correctPaddings() {
        int buttonsCount = this.iconOuterWidth * getButtonsCount();
        int i4 = 0;
        if (!isRTL()) {
            i4 = buttonsCount;
            buttonsCount = 0;
        }
        super.setPaddingRelative(this.innerPaddingLeft + this.extraPaddingLeft + buttonsCount, this.innerPaddingTop + this.extraPaddingTop, this.innerPaddingRight + this.extraPaddingRight + i4, this.innerPaddingBottom + this.extraPaddingBottom);
    }

    private void drawActionButton(@NonNull Canvas canvas, int i4, int i5, int i6) {
        if (hasFocus() && isEnabled() && !TextUtils.isEmpty(getText())) {
            if (this.showClearButton || this.showPasswordButton) {
                this.paint.setAlpha(255);
                if (!isRTL()) {
                    i4 = i5 - this.iconOuterWidth;
                }
                Bitmap bitmap = this.showClearButton ? this.clearButtonBitmaps[0] : this.passwordVisible ? this.showPwIconBitmaps[0] : this.hidePwIconBitmaps[0];
                int i7 = i6 + this.bottomSpacing;
                int i8 = this.iconOuterHeight;
                canvas.drawBitmap(bitmap, i4, (i7 - i8) + ((i8 - bitmap.getHeight()) / 2), this.paint);
            }
        }
    }

    private void drawBottomEllipsis(@NonNull Canvas canvas, int i4, int i5, int i6) {
        if (hasFocus() && this.singleLineEllipsis && getScrollX() != 0) {
            this.paint.setColor(isInternalValid() ? this.primaryColor : this.errorColor);
            float f4 = i6 + this.bottomSpacing;
            if (isRTL()) {
                i4 = i5;
            }
            int i7 = isRTL() ? -1 : 1;
            float f5 = i4;
            int i8 = this.bottomEllipsisSize;
            canvas.drawCircle(((i7 * i8) / 2.0f) + f5, (i8 / 2.0f) + f4, i8 / 2.0f, this.paint);
            int i9 = this.bottomEllipsisSize;
            canvas.drawCircle((((i7 * i9) * 5) / 2.0f) + f5, (i9 / 2.0f) + f4, i9 / 2.0f, this.paint);
            int i10 = this.bottomEllipsisSize;
            canvas.drawCircle(f5 + (((i7 * i10) * 9) / 2.0f), f4 + (i10 / 2.0f), i10 / 2.0f, this.paint);
        }
    }

    private void drawBottomText(@NonNull Canvas canvas, int i4, int i5, int i6, float f4) {
        int i7;
        if (this.textLayout != null) {
            if (this.tempErrorText != null || ((this.helperTextAlwaysShown || hasFocus()) && !TextUtils.isEmpty(this.helperText))) {
                TextPaint textPaint = this.textPaint;
                if (this.tempErrorText != null) {
                    i7 = this.errorColor;
                } else {
                    i7 = this.helperTextColor;
                    if (i7 == -1) {
                        i7 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
                    }
                }
                textPaint.setColor(i7);
                canvas.save();
                if (isRTL()) {
                    canvas.translate(i5 - this.textLayout.getWidth(), (i6 + this.bottomSpacing) - f4);
                } else {
                    canvas.translate(i4 + getBottomTextLeftOffset(), (i6 + this.bottomSpacing) - f4);
                }
                this.textLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void drawFloatingLabel(@NonNull Canvas canvas, int i4, int i5) {
        if (!this.floatingLabelEnabled || TextUtils.isEmpty(this.floatingLabelText)) {
            return;
        }
        this.textPaint.setTextSize(this.floatingLabelTextSize);
        TextPaint textPaint = this.textPaint;
        ArgbEvaluator argbEvaluator = this.focusEvaluator;
        float f4 = this.focusFraction * (isEnabled() ? 1.0f : 0.0f);
        int i6 = this.floatingLabelTextColor;
        if (i6 == -1) {
            i6 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
        }
        textPaint.setColor(((Integer) argbEvaluator.evaluate(f4, Integer.valueOf(i6), Integer.valueOf(this.primaryColor))).intValue());
        float fMeasureText = this.textPaint.measureText(this.floatingLabelText.toString());
        if ((getGravity() & 5) == 5 || isRTL()) {
            i4 = (int) (i5 - fMeasureText);
        } else if ((getGravity() & 3) != 3) {
            i4 += (int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f));
        }
        int scrollY = (int) ((((this.innerPaddingTop + this.floatingLabelTextSize) + r9) - (this.floatingLabelPadding * (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction))) + getScrollY());
        this.textPaint.setAlpha((int) ((this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction) * 255.0f * ((this.focusFraction * 0.74f * (isEnabled() ? 1.0f : 0.0f)) + 0.26f) * (this.floatingLabelTextColor == -1 ? Color.alpha(r3) / 255.0f : 1.0f)));
        canvas.drawText(this.floatingLabelText.toString(), i4, scrollY, this.textPaint);
    }

    private void drawIcons(@NonNull Canvas canvas, int i4, int i5, int i6) {
        this.paint.setAlpha(255);
        char c4 = 1;
        if (getStartIcon() != null) {
            Bitmap bitmap = getStartIcon()[!isInternalValid() ? (char) 3 : !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0];
            int i7 = i4 - this.iconPadding;
            int i8 = this.iconOuterWidth;
            int width = (i7 - i8) + ((i8 - bitmap.getWidth()) / 2);
            int i9 = this.bottomSpacing + i6;
            int i10 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap, width, (i9 - i10) + ((i10 - bitmap.getHeight()) / 2), this.paint);
        }
        if (getEndIcon() != null) {
            Bitmap[] endIcon = getEndIcon();
            if (!isInternalValid()) {
                c4 = 3;
            } else if (!isEnabled()) {
                c4 = 2;
            } else if (!hasFocus()) {
                c4 = 0;
            }
            Bitmap bitmap2 = endIcon[c4];
            int width2 = i5 + this.iconPadding + ((this.iconOuterWidth - bitmap2.getWidth()) / 2);
            int i11 = i6 + this.bottomSpacing;
            int i12 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap2, width2, (i11 - i12) + ((i12 - bitmap2.getHeight()) / 2), this.paint);
        }
    }

    private int drawUnderline(@NonNull Canvas canvas, int i4, int i5, int i6) {
        if (!this.hideUnderline) {
            i6 += this.bottomSpacing;
            if (!isInternalValid()) {
                this.paint.setColor(this.errorColor);
                canvas.drawRect(i4, i6, i5, this.underlineHeightFocused + i6, this.paint);
            } else if (!isEnabled()) {
                Paint paint = this.paint;
                int i7 = this.underlineColor;
                if (i7 == -1) {
                    i7 = (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688;
                }
                paint.setColor(i7);
                float pixel = getPixel(1);
                for (float f4 = 0.0f; f4 < getWidth(); f4 += 3.0f * pixel) {
                    float f5 = i4 + f4;
                    canvas.drawRect(f5, i6, f5 + pixel, this.underlineHeight + i6, this.paint);
                }
            } else if (hasFocus()) {
                this.paint.setColor(this.primaryColor);
                canvas.drawRect(i4, i6, i5, this.underlineHeightFocused + i6, this.paint);
            } else {
                Paint paint2 = this.paint;
                int i8 = this.underlineColor;
                if (i8 == -1) {
                    i8 = (16777215 & this.baseColor) | 503316480;
                }
                paint2.setColor(i8);
                canvas.drawRect(i4, i6, i5, this.underlineHeight + i6, this.paint);
            }
        }
        return i6;
    }

    private Bitmap[] generateIconBitmaps(@DrawableRes int i4) {
        if (i4 == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i5 = this.iconSize;
        options.inSampleSize = iMax > i5 ? iMax / i5 : 1;
        options.inJustDecodeBounds = false;
        return generateIconBitmaps(BitmapFactory.decodeResource(getResources(), i4, options));
    }

    private int getBottomEllipsisWidth() {
        if (this.singleLineEllipsis) {
            return (this.bottomEllipsisSize * 5) + getPixel(4);
        }
        return 0;
    }

    private ObjectAnimator getBottomLinesAnimator(float f4) {
        ObjectAnimator objectAnimator = this.bottomLinesAnimator;
        if (objectAnimator == null) {
            this.bottomLinesAnimator = ObjectAnimator.ofFloat(this, "currentBottomLines", f4);
        } else {
            objectAnimator.cancel();
            this.bottomLinesAnimator.setFloatValues(f4);
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
        StringBuilder sb;
        int iCheckLength;
        StringBuilder sb2;
        StringBuilder sb3;
        int iCheckLength2;
        if (this.minCharacters <= 0) {
            if (isRTL()) {
                sb3 = new StringBuilder();
                sb3.append(this.maxCharacters);
                sb3.append(" / ");
                iCheckLength2 = checkLength(getText());
            } else {
                sb3 = new StringBuilder();
                sb3.append(checkLength(getText()));
                sb3.append(" / ");
                iCheckLength2 = this.maxCharacters;
            }
            sb3.append(iCheckLength2);
            return sb3.toString();
        }
        if (this.maxCharacters <= 0) {
            if (isRTL()) {
                sb2 = new StringBuilder();
                sb2.append("+");
                sb2.append(this.minCharacters);
                sb2.append(" / ");
                sb2.append(checkLength(getText()));
            } else {
                sb2 = new StringBuilder();
                sb2.append(checkLength(getText()));
                sb2.append(" / ");
                sb2.append(this.minCharacters);
                sb2.append("+");
            }
            return sb2.toString();
        }
        if (isRTL()) {
            sb = new StringBuilder();
            sb.append(this.maxCharacters);
            sb.append("-");
            sb.append(this.minCharacters);
            sb.append(" / ");
            iCheckLength = checkLength(getText());
        } else {
            sb = new StringBuilder();
            sb.append(checkLength(getText()));
            sb.append(" / ");
            sb.append(this.minCharacters);
            sb.append("-");
            iCheckLength = this.maxCharacters;
        }
        sb.append(iCheckLength);
        return sb.toString();
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

    private int getPixel(int i4) {
        return AbstractC3527b.m4048b(getContext(), i4);
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

    private void init(Context context, AttributeSet attributeSet, int i4) {
        this.iconSize = getPixel(32);
        this.iconOuterWidth = getPixel(24);
        this.iconOuterHeight = getPixel(32);
        this.bottomSpacing = getResources().getDimensionPixelSize(R$dimen.default_edittext_components_spacing);
        this.bottomEllipsisSize = getResources().getDimensionPixelSize(R$dimen.default_bottom_ellipsis_height);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialEditText, i4, 0);
        this.textColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColor);
        this.textColorHintStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColorHint);
        this.baseColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_baseColor, ViewCompat.MEASURED_STATE_MASK);
        this.primaryColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_primaryColor, AbstractC3531f.m4072e(getContext(), R$attr.colorPrimary, this.baseColor));
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_floatingLabel, 0));
        this.errorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_errorColor, AbstractC3531f.m4071d(getContext(), R$attr.xui_config_color_error_text));
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_allowEmpty, true)) {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorEmpty);
            if (TextUtils.isEmpty(string)) {
                this.validators.add(new NotAllowEmptyValidator(AbstractC3530e.m4066g(R$string.xui_met_not_allow_empty)));
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
            Typeface typefaceM4960c = AbstractC3799b.m4960c(string2);
            this.accentTypeface = typefaceM4960c;
            this.textPaint.setTypeface(typefaceM4960c);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_typeface);
        if (string3 != null) {
            setTypeface(AbstractC3799b.m4960c(string3));
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
        this.clearButtonBitmaps = generateIconBitmaps(AbstractC3528c.m4051b(getContext(), R$drawable.xui_ic_default_clear_btn));
        this.showPasswordButton = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_passWordButton, false);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_isAsteriskStyle, false)) {
            this.mTransformationMethod = C4581a.getInstance();
        } else {
            this.mTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        if (this.showPasswordButton) {
            handleSwitchPasswordInputVisibility();
        }
        this.showPwIconBitmaps = generateIconBitmaps(AbstractC3528c.m4051b(getContext(), R$drawable.pet_icon_visibility_24dp));
        this.hidePwIconBitmaps = generateIconBitmaps(AbstractC3528c.m4051b(getContext(), R$drawable.pet_icon_visibility_off_24dp));
        String string5 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_regexp);
        if (!TextUtils.isEmpty(string5)) {
            String string6 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_errorMessage);
            if (TextUtils.isEmpty(string6)) {
                this.validators.add(new RegexpValidator(AbstractC3530e.m4066g(R$string.xui_met_input_error), string5));
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
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z3) {
                if (MaterialEditText.this.floatingLabelEnabled && MaterialEditText.this.highlightFloatingLabel) {
                    if (z3) {
                        MaterialEditText.this.getLabelFocusAnimator().start();
                    } else {
                        MaterialEditText.this.getLabelFocusAnimator().reverse();
                    }
                }
                if (MaterialEditText.this.validateOnFocusLost && !z3) {
                    MaterialEditText.this.validate();
                }
                View.OnFocusChangeListener onFocusChangeListener2 = MaterialEditText.this.outerFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z3);
                }
            }
        };
        this.innerFocusChangeListener = onFocusChangeListener;
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void initMinBottomLines() {
        int i4 = 0;
        boolean z3 = this.minCharacters > 0 || this.maxCharacters > 0 || this.singleLineEllipsis || this.tempErrorText != null || this.helperText != null;
        int i5 = this.minBottomTextLines;
        if (i5 > 0) {
            i4 = i5;
        } else if (z3) {
            i4 = 1;
        }
        this.minBottomLines = i4;
        this.currentBottomLines = i4;
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
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
    }

    private boolean insideActionButton(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i4 = getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding;
        int width = getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding;
        if (!isRTL()) {
            i4 = width - this.iconOuterWidth;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.bottomSpacing;
        int i5 = this.iconOuterHeight;
        int i6 = scrollY - i5;
        return x3 >= ((float) i4) && x3 < ((float) (i4 + this.iconOuterWidth)) && y3 >= ((float) i6) && y3 < ((float) (i6 + i5));
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
        int i4 = this.baseColor;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i4 & ViewCompat.MEASURED_SIZE_MASK) | (-553648128), (i4 & ViewCompat.MEASURED_SIZE_MASK) | 1140850688});
        this.textColorStateList = colorStateList2;
        setTextColor(colorStateList2);
    }

    private Bitmap scaleIcon(Bitmap bitmap) {
        int i4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i5 = this.iconSize;
        if (iMax == i5 || iMax <= i5) {
            return bitmap;
        }
        if (width > i5) {
            i4 = (int) (i5 * (height / width));
        } else {
            i5 = (int) (i5 * (width / height));
            i4 = i5;
        }
        return Bitmap.createScaledBitmap(bitmap, i5, i4, false);
    }

    private void setFloatingLabelInternal(int i4) {
        if (i4 == 1) {
            this.floatingLabelEnabled = true;
            this.highlightFloatingLabel = false;
        } else if (i4 != 2) {
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
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.bottomTextSize + f4 + f5;
        if ((hasFocus() && hasCharactersCounter()) || !isCharactersCountValid()) {
            this.textPaint.setColor(isCharactersCountValid() ? (this.baseColor & ViewCompat.MEASURED_SIZE_MASK) | 1140850688 : this.errorColor);
            String charactersCounterText = getCharactersCounterText();
            canvas.drawText(charactersCounterText, isRTL() ? scrollX : (getPaddingEnd() + scrollX2) - this.textPaint.measureText(charactersCounterText), this.bottomSpacing + iDrawUnderline + f6, this.textPaint);
        }
        drawBottomText(canvas, scrollX, scrollX2, iDrawUnderline, f7);
        drawFloatingLabel(canvas, scrollX, scrollX2);
        drawBottomEllipsis(canvas, scrollX, scrollX2, iDrawUnderline);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
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
            java.lang.String r0 = com.xuexiang.xui.utils.AbstractC3530e.m4066g(r0)
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
            goto L57
        L47:
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r4 = r3.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r5 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            int r0 = com.xuexiang.xui.R$string.xui_met_not_allow_empty
            java.lang.String r0 = com.xuexiang.xui.utils.AbstractC3530e.m4066g(r0)
            r5.<init>(r0)
            r4.add(r5)
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.setAllowEmpty(boolean, java.lang.String):com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText");
    }

    public MaterialEditText setAutoValidate(boolean z3) {
        this.autoValidate = z3;
        if (z3) {
            validate();
        }
        return this;
    }

    public MaterialEditText setBaseColor(int i4) {
        if (this.baseColor != i4) {
            this.baseColor = i4;
        }
        initText();
        postInvalidate();
        return this;
    }

    public void setBottomTextSize(int i4) {
        this.bottomTextSize = i4;
        initPadding();
    }

    public MaterialEditText setCurrentBottomLines(float f4) {
        this.currentBottomLines = f4;
        initPadding();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setFocusable(z3);
        super.setFocusableInTouchMode(z3);
        super.setEnabled(z3);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.tempErrorText = charSequence == null ? null : charSequence.toString();
        if (adjustBottomLines()) {
            postInvalidate();
        }
    }

    public MaterialEditText setErrorColor(int i4) {
        this.errorColor = i4;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabel(int i4) {
        setFloatingLabelInternal(i4);
        initPadding();
        return this;
    }

    public MaterialEditText setFloatingLabelAlwaysShown(boolean z3) {
        this.floatingLabelAlwaysShown = z3;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelAnimating(boolean z3) {
        this.floatingLabelAnimating = z3;
        return this;
    }

    public MaterialEditText setFloatingLabelFraction(float f4) {
        this.floatingLabelFraction = f4;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelPadding(int i4) {
        this.floatingLabelPadding = i4;
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

    public MaterialEditText setFloatingLabelTextColor(int i4) {
        this.floatingLabelTextColor = i4;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelTextSize(int i4) {
        this.floatingLabelTextSize = i4;
        initPadding();
        return this;
    }

    public MaterialEditText setFocusFraction(float f4) {
        this.focusFraction = f4;
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

    public MaterialEditText setHelperTextAlwaysShown(boolean z3) {
        this.helperTextAlwaysShown = z3;
        invalidate();
        return this;
    }

    public MaterialEditText setHelperTextColor(int i4) {
        this.helperTextColor = i4;
        postInvalidate();
        return this;
    }

    public MaterialEditText setHideUnderline(boolean z3) {
        this.hideUnderline = z3;
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setIconLeft(@DrawableRes int i4) {
        this.iconLeftBitmaps = generateIconBitmaps(i4);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(@DrawableRes int i4) {
        this.iconRightBitmaps = generateIconBitmaps(i4);
        initPadding();
        return this;
    }

    public MaterialEditText setLengthChecker(METLengthChecker mETLengthChecker) {
        this.lengthChecker = mETLengthChecker;
        return this;
    }

    public MaterialEditText setMaxCharacters(int i4) {
        this.maxCharacters = i4;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMetHintTextColor(int i4) {
        this.textColorHintStateList = ColorStateList.valueOf(i4);
        resetHintTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(int i4) {
        this.textColorStateList = ColorStateList.valueOf(i4);
        resetTextColor();
        return this;
    }

    public MaterialEditText setMinBottomTextLines(int i4) {
        this.minBottomTextLines = i4;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setMinCharacters(int i4) {
        this.minCharacters = i4;
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
    public final void setPadding(int i4, int i5, int i6, int i7) {
        super.setPadding(i4, i5, i6, i7);
    }

    public MaterialEditText setPaddings(int i4, int i5, int i6, int i7) {
        this.innerPaddingTop = i5;
        this.innerPaddingBottom = i7;
        this.innerPaddingLeft = i4;
        this.innerPaddingRight = i6;
        correctPaddings();
        return this;
    }

    public MaterialEditText setPasswordTransformationMethod(PasswordTransformationMethod passwordTransformationMethod) {
        this.mTransformationMethod = passwordTransformationMethod;
        return this;
    }

    public MaterialEditText setPrimaryColor(int i4) {
        this.primaryColor = i4;
        postInvalidate();
        return this;
    }

    public MaterialEditText setShowClearButton(boolean z3) {
        this.showClearButton = z3;
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

    public MaterialEditText setUnderlineColor(int i4) {
        this.underlineColor = i4;
        postInvalidate();
        return this;
    }

    public MaterialEditText setValidateOnFocusLost(boolean z3) {
        this.validateOnFocusLost = z3;
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

    public MaterialEditText setSingleLineEllipsis(boolean z3) {
        this.singleLineEllipsis = z3;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.helperTextColor = -1;
        this.focusEvaluator = new ArgbEvaluator();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.validators = new ArrayList();
        init(context, attributeSet, i4);
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
        boolean z3 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            METValidator next = it.next();
            z3 = z3 && next.isValid(text, zIsEmpty);
            if (!z3) {
                setError(next.getErrorMessage());
                break;
            }
        }
        if (z3) {
            setError(null);
        }
        postInvalidate();
        return z3;
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
        int i4 = this.iconSize;
        return generateIconBitmaps(Bitmap.createScaledBitmap(bitmapCreateBitmap, i4, i4, false));
    }

    private Bitmap[] generateIconBitmaps(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapScaleIcon = scaleIcon(bitmap);
        bitmapArr[0] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i4 = this.baseColor;
        canvas.drawColor((AbstractC3532g.m4088j(i4) ? ViewCompat.MEASURED_STATE_MASK : -1979711488) | (i4 & ViewCompat.MEASURED_SIZE_MASK), PorterDuff.Mode.SRC_IN);
        bitmapArr[1] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArr[1]).drawColor(this.primaryColor, PorterDuff.Mode.SRC_IN);
        bitmapArr[2] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i5 = this.baseColor;
        canvas2.drawColor((AbstractC3532g.m4088j(i5) ? 1275068416 : 1107296256) | (16777215 & i5), PorterDuff.Mode.SRC_IN);
        bitmapArr[3] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArr[3]).drawColor(this.errorColor, PorterDuff.Mode.SRC_IN);
        return bitmapArr;
    }
}
