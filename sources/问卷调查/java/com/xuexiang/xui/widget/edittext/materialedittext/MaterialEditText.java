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
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METLengthChecker;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator;
import com.xuexiang.xui.widget.edittext.materialedittext.validation.RegexpValidator;
import io.github.inflationx.calligraphy3.C1088R;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p115d.C0790a;
import p070b.p113c.p114a.p116e.p126e.C0807a;

@Keep
/* loaded from: classes.dex */
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
    public ObjectAnimator bottomLinesAnimator;
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
    public View.OnFocusChangeListener innerFocusChangeListener;
    private int innerPaddingBottom;
    private int innerPaddingLeft;
    private int innerPaddingRight;
    private int innerPaddingTop;
    public ObjectAnimator labelAnimator;
    public ObjectAnimator labelFocusAnimator;
    private METLengthChecker lengthChecker;
    private PasswordTransformationMethod mTransformationMethod;
    private int maxCharacters;
    private int minBottomLines;
    private int minBottomTextLines;
    private int minCharacters;
    public View.OnFocusChangeListener outerFocusChangeListener;
    public Paint paint;
    private boolean passwordVisible;
    private int primaryColor;
    private boolean showClearButton;
    private boolean showPasswordButton;
    private Bitmap[] showPwIconBitmaps;
    private boolean singleLineEllipsis;
    private String tempErrorText;
    private ColorStateList textColorHintStateList;
    private ColorStateList textColorStateList;
    public StaticLayout textLayout;
    public TextPaint textPaint;
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

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.MaterialEditTextStyle);
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

    private boolean adjustBottomLines() {
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.textPaint.setTextSize(this.bottomTextSize);
        if (this.tempErrorText == null && this.helperText == null) {
            iMax = this.minBottomLines;
        } else {
            Layout.Alignment alignment = ((getGravity() & 8388613) == 8388613 || isRTL()) ? Layout.Alignment.ALIGN_OPPOSITE : (getGravity() & 8388611) == 8388611 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            String str = this.tempErrorText;
            if (str == null) {
                str = this.helperText;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.textPaint, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment, 1.0f, 0.0f, true);
            this.textLayout = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.minBottomTextLines);
        }
        float f2 = iMax;
        if (this.bottomLines != f2) {
            getBottomLinesAnimator(f2).start();
        }
        this.bottomLines = f2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCharactersCount() {
        int i;
        boolean z = true;
        if ((this.firstShown || this.checkCharactersCountAtBeginning) && hasCharactersCounter()) {
            Editable text = getText();
            int iCheckLength = text == null ? 0 : checkLength(text);
            if (iCheckLength < this.minCharacters || ((i = this.maxCharacters) > 0 && iCheckLength > i)) {
                z = false;
            }
        }
        this.charactersCountValid = z;
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

    private void drawActionButton(Canvas canvas, int i, int i2, int i3) {
        if (hasFocus() && isEnabled() && !TextUtils.isEmpty(getText())) {
            if (this.showClearButton || this.showPasswordButton) {
                this.paint.setAlpha(255);
                if (!isRTL()) {
                    i = i2 - this.iconOuterWidth;
                }
                Bitmap bitmap = this.showClearButton ? this.clearButtonBitmaps[0] : this.passwordVisible ? this.showPwIconBitmaps[0] : this.hidePwIconBitmaps[0];
                int i4 = i3 + this.bottomSpacing;
                int i5 = this.iconOuterHeight;
                canvas.drawBitmap(bitmap, i, ((i5 - bitmap.getHeight()) / 2) + (i4 - i5), this.paint);
            }
        }
    }

    private void drawBottomEllipsis(Canvas canvas, int i, int i2, int i3) {
        if (hasFocus() && this.singleLineEllipsis && getScrollX() != 0) {
            this.paint.setColor(isInternalValid() ? this.primaryColor : this.errorColor);
            float f2 = i3 + this.bottomSpacing;
            if (isRTL()) {
                i = i2;
            }
            int i4 = isRTL() ? -1 : 1;
            float f3 = i;
            int i5 = this.bottomEllipsisSize;
            canvas.drawCircle(((i4 * i5) / 2.0f) + f3, (i5 / 2.0f) + f2, i5 / 2.0f, this.paint);
            int i6 = this.bottomEllipsisSize;
            canvas.drawCircle((((i4 * i6) * 5) / 2.0f) + f3, (i6 / 2.0f) + f2, i6 / 2.0f, this.paint);
            int i7 = this.bottomEllipsisSize;
            canvas.drawCircle((((i4 * i7) * 9) / 2.0f) + f3, (i7 / 2.0f) + f2, i7 / 2.0f, this.paint);
        }
    }

    private void drawBottomText(Canvas canvas, int i, int i2, int i3, float f2) {
        int i4;
        if (this.textLayout != null) {
            if (this.tempErrorText != null || ((this.helperTextAlwaysShown || hasFocus()) && !TextUtils.isEmpty(this.helperText))) {
                TextPaint textPaint = this.textPaint;
                if (this.tempErrorText != null) {
                    i4 = this.errorColor;
                } else {
                    i4 = this.helperTextColor;
                    if (i4 == -1) {
                        i4 = (this.baseColor & 16777215) | 1140850688;
                    }
                }
                textPaint.setColor(i4);
                canvas.save();
                canvas.translate(isRTL() ? i2 - this.textLayout.getWidth() : i + getBottomTextLeftOffset(), (i3 + this.bottomSpacing) - f2);
                this.textLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void drawFloatingLabel(Canvas canvas, int i, int i2) {
        if (!this.floatingLabelEnabled || TextUtils.isEmpty(this.floatingLabelText)) {
            return;
        }
        this.textPaint.setTextSize(this.floatingLabelTextSize);
        TextPaint textPaint = this.textPaint;
        ArgbEvaluator argbEvaluator = this.focusEvaluator;
        float f2 = this.focusFraction * (isEnabled() ? 1.0f : 0.0f);
        int i3 = this.floatingLabelTextColor;
        if (i3 == -1) {
            i3 = (this.baseColor & 16777215) | 1140850688;
        }
        textPaint.setColor(((Integer) argbEvaluator.evaluate(f2, Integer.valueOf(i3), Integer.valueOf(this.primaryColor))).intValue());
        float fMeasureText = this.textPaint.measureText(this.floatingLabelText.toString());
        if ((getGravity() & 5) == 5 || isRTL()) {
            i = (int) (i2 - fMeasureText);
        } else if ((getGravity() & 3) != 3) {
            i += (int) (((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f) + getInnerPaddingLeft());
        }
        int scrollY = (int) ((((this.innerPaddingTop + this.floatingLabelTextSize) + r9) - (this.floatingLabelPadding * (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction))) + getScrollY());
        this.textPaint.setAlpha((int) (((this.focusFraction * 0.74f * (isEnabled() ? 1.0f : 0.0f)) + 0.26f) * (this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction) * 255.0f * (this.floatingLabelTextColor == -1 ? Color.alpha(r0) / 255.0f : 1.0f)));
        canvas.drawText(this.floatingLabelText.toString(), i, scrollY, this.textPaint);
    }

    private void drawIcons(Canvas canvas, int i, int i2, int i3) {
        this.paint.setAlpha(255);
        char c2 = 1;
        if (getStartIcon() != null) {
            Bitmap bitmap = getStartIcon()[!isInternalValid() ? (char) 3 : !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0];
            int i4 = i - this.iconPadding;
            int i5 = this.iconOuterWidth;
            int width = ((i5 - bitmap.getWidth()) / 2) + (i4 - i5);
            int i6 = this.bottomSpacing + i3;
            int i7 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap, width, ((i7 - bitmap.getHeight()) / 2) + (i6 - i7), this.paint);
        }
        if (getEndIcon() != null) {
            Bitmap[] endIcon = getEndIcon();
            if (!isInternalValid()) {
                c2 = 3;
            } else if (!isEnabled()) {
                c2 = 2;
            } else if (!hasFocus()) {
                c2 = 0;
            }
            Bitmap bitmap2 = endIcon[c2];
            int width2 = ((this.iconOuterWidth - bitmap2.getWidth()) / 2) + i2 + this.iconPadding;
            int i8 = i3 + this.bottomSpacing;
            int i9 = this.iconOuterHeight;
            canvas.drawBitmap(bitmap2, width2, ((i9 - bitmap2.getHeight()) / 2) + (i8 - i9), this.paint);
        }
    }

    private int drawUnderline(Canvas canvas, int i, int i2, int i3) {
        Paint paint;
        int i4;
        if (!this.hideUnderline) {
            i3 += this.bottomSpacing;
            if (!isInternalValid()) {
                paint = this.paint;
                i4 = this.errorColor;
            } else if (!isEnabled()) {
                Paint paint2 = this.paint;
                int i5 = this.underlineColor;
                if (i5 == -1) {
                    i5 = (this.baseColor & 16777215) | 1140850688;
                }
                paint2.setColor(i5);
                float pixel = getPixel(1);
                for (float f2 = 0.0f; f2 < getWidth(); f2 += 3.0f * pixel) {
                    float f3 = i + f2;
                    canvas.drawRect(f3, i3, f3 + pixel, this.underlineHeight + i3, this.paint);
                }
            } else if (hasFocus()) {
                paint = this.paint;
                i4 = this.primaryColor;
            } else {
                Paint paint3 = this.paint;
                int i6 = this.underlineColor;
                if (i6 == -1) {
                    i6 = (16777215 & this.baseColor) | 503316480;
                }
                paint3.setColor(i6);
                canvas.drawRect(i, i3, i2, this.underlineHeight + i3, this.paint);
            }
            paint.setColor(i4);
            canvas.drawRect(i, i3, i2, this.underlineHeightFocused + i3, this.paint);
        }
        return i3;
    }

    private Bitmap[] generateIconBitmaps(int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.iconSize;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return generateIconBitmaps(BitmapFactory.decodeResource(getResources(), i, options));
    }

    private Bitmap[] generateIconBitmaps(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapScaleIcon = scaleIcon(bitmap);
        bitmapArr[0] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.baseColor;
        canvas.drawColor((C0787a.m2488v(i) ? -16777216 : -1979711488) | (i & 16777215), PorterDuff.Mode.SRC_IN);
        bitmapArr[1] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArr[1]).drawColor(this.primaryColor, PorterDuff.Mode.SRC_IN);
        bitmapArr[2] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i2 = this.baseColor;
        canvas2.drawColor((C0787a.m2488v(i2) ? 1275068416 : 1107296256) | (16777215 & i2), PorterDuff.Mode.SRC_IN);
        bitmapArr[3] = bitmapScaleIcon.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArr[3]).drawColor(this.errorColor, PorterDuff.Mode.SRC_IN);
        return bitmapArr;
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

    private int getBottomEllipsisWidth() {
        if (this.singleLineEllipsis) {
            return (this.bottomEllipsisSize * 5) + getPixel(4);
        }
        return 0;
    }

    private ObjectAnimator getBottomLinesAnimator(float f2) {
        ObjectAnimator objectAnimator = this.bottomLinesAnimator;
        if (objectAnimator == null) {
            this.bottomLinesAnimator = ObjectAnimator.ofFloat(this, "currentBottomLines", f2);
        } else {
            objectAnimator.cancel();
            this.bottomLinesAnimator.setFloatValues(f2);
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
        String str;
        StringBuilder sb;
        int i;
        int iCheckLength;
        if (this.minCharacters > 0) {
            if (this.maxCharacters <= 0) {
                str = "+";
                if (!isRTL()) {
                    sb = new StringBuilder();
                    sb.append(checkLength(getText()));
                    sb.append(" / ");
                    sb.append(this.minCharacters);
                    sb.append("+");
                    return sb.toString();
                }
                sb = new StringBuilder();
            } else {
                str = "-";
                if (isRTL()) {
                    sb = new StringBuilder();
                    sb.append(this.maxCharacters);
                } else {
                    sb = new StringBuilder();
                    sb.append(checkLength(getText()));
                    sb.append(" / ");
                    sb.append(this.minCharacters);
                    sb.append("-");
                    iCheckLength = this.maxCharacters;
                }
            }
            sb.append(str);
            i = this.minCharacters;
            sb.append(i);
            sb.append(" / ");
            iCheckLength = checkLength(getText());
        } else if (isRTL()) {
            sb = new StringBuilder();
            i = this.maxCharacters;
            sb.append(i);
            sb.append(" / ");
            iCheckLength = checkLength(getText());
        } else {
            sb = new StringBuilder();
            sb.append(checkLength(getText()));
            sb.append(" / ");
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

    private int getPixel(int i) {
        return C0787a.m2474h(getContext(), i);
    }

    private Bitmap[] getStartIcon() {
        return isRTL() ? this.iconRightBitmaps : this.iconLeftBitmaps;
    }

    private void handleSwitchPasswordInputVisibility() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        setTransformationMethod(this.passwordVisible ? null : this.mTransformationMethod);
        setSelection(selectionStart, selectionEnd);
    }

    private boolean hasCharactersCounter() {
        return this.minCharacters > 0 || this.maxCharacters > 0;
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        PasswordTransformationMethod passwordTransformationMethod;
        this.iconSize = getPixel(32);
        this.iconOuterWidth = getPixel(24);
        this.iconOuterHeight = getPixel(32);
        this.bottomSpacing = getResources().getDimensionPixelSize(C1088R.dimen.default_edittext_components_spacing);
        this.bottomEllipsisSize = getResources().getDimensionPixelSize(C1088R.dimen.default_bottom_ellipsis_height);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0788b.f4452f, i, 0);
        this.textColorStateList = typedArrayObtainStyledAttributes.getColorStateList(32);
        this.textColorHintStateList = typedArrayObtainStyledAttributes.getColorStateList(33);
        this.baseColor = typedArrayObtainStyledAttributes.getColor(3, -16777216);
        this.primaryColor = typedArrayObtainStyledAttributes.getColor(29, C0787a.m2462B(getContext(), C1088R.attr.colorPrimary, this.baseColor));
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(10, 0));
        this.errorColor = typedArrayObtainStyledAttributes.getColor(7, C0787a.m2461A(getContext(), C1088R.attr.xui_config_color_error_text));
        if (!typedArrayObtainStyledAttributes.getBoolean(1, true)) {
            String string = typedArrayObtainStyledAttributes.getString(8);
            if (TextUtils.isEmpty(string)) {
                this.validators.add(new NotAllowEmptyValidator(C0787a.m2483q(C1088R.string.xui_met_not_allow_empty)));
            } else {
                this.validators.add(new NotAllowEmptyValidator(string));
            }
        }
        this.minCharacters = typedArrayObtainStyledAttributes.getInt(27, 0);
        this.maxCharacters = typedArrayObtainStyledAttributes.getInt(25, 0);
        this.singleLineEllipsis = typedArrayObtainStyledAttributes.getBoolean(31, false);
        this.helperText = typedArrayObtainStyledAttributes.getString(17);
        this.helperTextColor = typedArrayObtainStyledAttributes.getColor(19, -1);
        this.minBottomTextLines = typedArrayObtainStyledAttributes.getInt(26, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        if (string2 != null) {
            Typeface typefaceM2481o = C0787a.m2481o(string2);
            this.accentTypeface = typefaceM2481o;
            this.textPaint.setTypeface(typefaceM2481o);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(34);
        if (string3 != null) {
            setTypeface(C0787a.m2481o(string3));
        }
        String string4 = typedArrayObtainStyledAttributes.getString(14);
        this.floatingLabelText = string4;
        if (string4 == null) {
            this.floatingLabelText = getHint();
        }
        this.floatingLabelPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, this.bottomSpacing);
        this.floatingLabelTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, getResources().getDimensionPixelSize(C1088R.dimen.default_floating_label_text_size));
        this.floatingLabelTextColor = typedArrayObtainStyledAttributes.getColor(15, -1);
        this.floatingLabelAnimating = typedArrayObtainStyledAttributes.getBoolean(12, true);
        this.bottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(C1088R.dimen.default_bottom_text_size));
        this.hideUnderline = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.underlineColor = typedArrayObtainStyledAttributes.getColor(35, -1);
        this.underlineHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(36, getPixel(1));
        this.underlineHeightFocused = typedArrayObtainStyledAttributes.getDimensionPixelSize(37, getPixel(2));
        this.autoValidate = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.iconLeftBitmaps = generateIconBitmaps(typedArrayObtainStyledAttributes.getResourceId(21, -1));
        this.iconRightBitmaps = generateIconBitmaps(typedArrayObtainStyledAttributes.getResourceId(23, -1));
        this.showClearButton = typedArrayObtainStyledAttributes.getBoolean(6, false);
        this.clearButtonBitmaps = generateIconBitmaps(C0790a.m2493a(getContext(), C1088R.drawable.xui_ic_default_clear_btn));
        this.showPasswordButton = typedArrayObtainStyledAttributes.getBoolean(28, false);
        if (typedArrayObtainStyledAttributes.getBoolean(24, false)) {
            C0807a c0807a = C0807a.f4522b;
            passwordTransformationMethod = c0807a;
            if (c0807a == null) {
                C0807a c0807a2 = new C0807a();
                C0807a.f4522b = c0807a2;
                passwordTransformationMethod = c0807a2;
            }
        } else {
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        this.mTransformationMethod = passwordTransformationMethod;
        if (this.showPasswordButton) {
            handleSwitchPasswordInputVisibility();
        }
        this.showPwIconBitmaps = generateIconBitmaps(C0790a.m2493a(getContext(), C1088R.drawable.pet_icon_visibility_24dp));
        this.hidePwIconBitmaps = generateIconBitmaps(C0790a.m2493a(getContext(), C1088R.drawable.pet_icon_visibility_off_24dp));
        String string5 = typedArrayObtainStyledAttributes.getString(30);
        if (!TextUtils.isEmpty(string5)) {
            String string6 = typedArrayObtainStyledAttributes.getString(9);
            if (TextUtils.isEmpty(string6)) {
                this.validators.add(new RegexpValidator(C0787a.m2483q(C1088R.string.xui_met_input_error), string5));
            } else {
                this.validators.add(new RegexpValidator(string6, string5));
            }
        }
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, getPixel(8));
        this.floatingLabelAlwaysShown = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.helperTextAlwaysShown = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.validateOnFocusLost = typedArrayObtainStyledAttributes.getBoolean(38, false);
        this.checkCharactersCountAtBeginning = typedArrayObtainStyledAttributes.getBoolean(5, true);
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
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (MaterialEditText.this.floatingLabelEnabled && MaterialEditText.this.highlightFloatingLabel) {
                    ObjectAnimator labelFocusAnimator = MaterialEditText.this.getLabelFocusAnimator();
                    if (z) {
                        labelFocusAnimator.start();
                    } else {
                        labelFocusAnimator.reverse();
                    }
                }
                if (MaterialEditText.this.validateOnFocusLost && !z) {
                    MaterialEditText.this.validate();
                }
                View.OnFocusChangeListener onFocusChangeListener2 = MaterialEditText.this.outerFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z);
                }
            }
        };
        this.innerFocusChangeListener = onFocusChangeListener;
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void initMinBottomLines() {
        int i = 0;
        boolean z = this.minCharacters > 0 || this.maxCharacters > 0 || this.singleLineEllipsis || this.tempErrorText != null || this.helperText != null;
        int i2 = this.minBottomTextLines;
        if (i2 > 0) {
            i = i2;
        } else if (z) {
            i = 1;
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
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    private boolean insideActionButton(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding;
        int width = getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding;
        if (!isRTL()) {
            i = width - this.iconOuterWidth;
        }
        int height = ((getHeight() + getScrollY()) - getPaddingBottom()) + this.bottomSpacing;
        int i2 = this.iconOuterHeight;
        int i3 = height - i2;
        return x >= ((float) i) && x < ((float) (i + this.iconOuterWidth)) && y >= ((float) i3) && y < ((float) (i3 + i2));
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
            setHintTextColor((this.baseColor & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    private void resetTextColor() {
        ColorStateList colorStateList = this.textColorStateList;
        if (colorStateList == null) {
            int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
            int i = this.baseColor;
            colorStateList = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
            this.textColorStateList = colorStateList;
        }
        setTextColor(colorStateList);
    }

    private Bitmap scaleIcon(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.iconSize;
        if (iMax == i2 || iMax <= i2) {
            return bitmap;
        }
        float f2 = i2;
        if (width > i2) {
            i = (int) ((height / width) * f2);
        } else {
            i2 = (int) ((width / height) * f2);
            i = i2;
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i, false);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.floatingLabelEnabled = true;
        } else {
            if (i == 2) {
                this.floatingLabelEnabled = true;
                this.highlightFloatingLabel = true;
                return;
            }
            this.floatingLabelEnabled = false;
        }
        this.highlightFloatingLabel = false;
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
    public void onDraw(Canvas canvas) {
        int scrollX = getScrollX() + (getStartIcon() == null ? 0 : this.iconOuterWidth + this.iconPadding);
        int scrollX2 = getScrollX() + (getEndIcon() == null ? getWidth() : (getWidth() - this.iconOuterWidth) - this.iconPadding);
        int height = (getHeight() + getScrollY()) - getPaddingBottom();
        drawIcons(canvas, scrollX, scrollX2, height);
        drawActionButton(canvas, scrollX, scrollX2, height);
        int iDrawUnderline = drawUnderline(canvas, scrollX, scrollX2, height);
        this.textPaint.setTextSize(this.bottomTextSize);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f2 = fontMetrics.ascent;
        float f3 = fontMetrics.descent;
        float f4 = (-f2) - f3;
        float f5 = this.bottomTextSize + f2 + f3;
        if ((hasFocus() && hasCharactersCounter()) || !isCharactersCountValid()) {
            this.textPaint.setColor(isCharactersCountValid() ? (this.baseColor & 16777215) | 1140850688 : this.errorColor);
            String charactersCounterText = getCharactersCounterText();
            canvas.drawText(charactersCounterText, isRTL() ? scrollX : (getPaddingEnd() + scrollX2) - this.textPaint.measureText(charactersCounterText), this.bottomSpacing + iDrawUnderline + f4, this.textPaint);
        }
        drawBottomText(canvas, scrollX, scrollX2, iDrawUnderline, f5);
        drawFloatingLabel(canvas, scrollX, scrollX2);
        drawBottomEllipsis(canvas, scrollX, scrollX2, iDrawUnderline);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
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
                    boolean z = this.actionButtonTouched;
                    this.actionButtonTouched = false;
                    if (z) {
                        return true;
                    }
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r0 = false;
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
            r2 = 2131689586(0x7f0f0072, float:1.9008192E38)
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator r1 = (com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator) r1
            boolean r3 = r1 instanceof com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            if (r3 == 0) goto L6
            if (r5 == 0) goto L1f
            r0.remove()
            goto L32
        L1f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L29
            r1.setErrorMessage(r6)
            goto L30
        L29:
            java.lang.String r0 = p070b.p113c.p114a.C0787a.m2483q(r2)
            r1.setErrorMessage(r0)
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r5 != 0) goto L56
            if (r0 != 0) goto L56
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L48
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r5 = r4.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r0 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            r0.<init>(r6)
            r5.add(r0)
            goto L56
        L48:
            java.util.List<com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator> r5 = r4.validators
            com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator r6 = new com.xuexiang.xui.widget.edittext.materialedittext.validation.NotAllowEmptyValidator
            java.lang.String r0 = p070b.p113c.p114a.C0787a.m2483q(r2)
            r6.<init>(r0)
            r5.add(r6)
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText.setAllowEmpty(boolean, java.lang.String):com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText");
    }

    public MaterialEditText setAutoValidate(boolean z) {
        this.autoValidate = z;
        if (z) {
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

    public MaterialEditText setCurrentBottomLines(float f2) {
        this.currentBottomLines = f2;
        initPadding();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setFocusable(z);
        super.setFocusableInTouchMode(z);
        super.setEnabled(z);
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

    public MaterialEditText setFloatingLabelAlwaysShown(boolean z) {
        this.floatingLabelAlwaysShown = z;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelAnimating(boolean z) {
        this.floatingLabelAnimating = z;
        return this;
    }

    public MaterialEditText setFloatingLabelFraction(float f2) {
        this.floatingLabelFraction = f2;
        invalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelPadding(int i) {
        this.floatingLabelPadding = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setFloatingLabelText(CharSequence charSequence) {
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

    public MaterialEditText setFocusFraction(float f2) {
        this.focusFraction = f2;
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

    public MaterialEditText setHelperTextAlwaysShown(boolean z) {
        this.helperTextAlwaysShown = z;
        invalidate();
        return this;
    }

    public MaterialEditText setHelperTextColor(int i) {
        this.helperTextColor = i;
        postInvalidate();
        return this;
    }

    public MaterialEditText setHideUnderline(boolean z) {
        this.hideUnderline = z;
        initPadding();
        postInvalidate();
        return this;
    }

    public MaterialEditText setIconLeft(int i) {
        this.iconLeftBitmaps = generateIconBitmaps(i);
        initPadding();
        return this;
    }

    public MaterialEditText setIconLeft(Bitmap bitmap) {
        this.iconLeftBitmaps = generateIconBitmaps(bitmap);
        initPadding();
        return this;
    }

    public MaterialEditText setIconLeft(Drawable drawable) {
        this.iconLeftBitmaps = generateIconBitmaps(drawable);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(int i) {
        this.iconRightBitmaps = generateIconBitmaps(i);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(Bitmap bitmap) {
        this.iconRightBitmaps = generateIconBitmaps(bitmap);
        initPadding();
        return this;
    }

    public MaterialEditText setIconRight(Drawable drawable) {
        this.iconRightBitmaps = generateIconBitmaps(drawable);
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

    public MaterialEditText setMetHintTextColor(ColorStateList colorStateList) {
        this.textColorHintStateList = colorStateList;
        resetHintTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(int i) {
        this.textColorStateList = ColorStateList.valueOf(i);
        resetTextColor();
        return this;
    }

    public MaterialEditText setMetTextColor(ColorStateList colorStateList) {
        this.textColorStateList = colorStateList;
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
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public MaterialEditText setPaddings(int i, int i2, int i3, int i4) {
        this.innerPaddingTop = i2;
        this.innerPaddingBottom = i4;
        this.innerPaddingLeft = i;
        this.innerPaddingRight = i3;
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

    public MaterialEditText setShowClearButton(boolean z) {
        this.showClearButton = z;
        correctPaddings();
        return this;
    }

    public MaterialEditText setSingleLineEllipsis() {
        return setSingleLineEllipsis(true);
    }

    public MaterialEditText setSingleLineEllipsis(boolean z) {
        this.singleLineEllipsis = z;
        initMinBottomLines();
        initPadding();
        postInvalidate();
        return this;
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

    public MaterialEditText setValidateOnFocusLost(boolean z) {
        this.validateOnFocusLost = z;
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
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            METValidator next = it.next();
            z = z && next.isValid(text, zIsEmpty);
            if (!z) {
                setError(next.getErrorMessage());
                break;
            }
        }
        if (z) {
            setError(null);
        }
        postInvalidate();
        return z;
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

    public boolean validateWith(METValidator mETValidator) {
        Editable text = getText();
        boolean zIsValid = mETValidator.isValid(text, text.length() == 0);
        if (!zIsValid) {
            setError(mETValidator.getErrorMessage());
        }
        postInvalidate();
        return zIsValid;
    }
}
