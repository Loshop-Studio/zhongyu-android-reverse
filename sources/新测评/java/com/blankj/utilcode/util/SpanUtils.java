package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private int alignImage;
    private int alignLine;
    private Layout.Alignment alignment;
    private int backgroundColor;
    private float blurRadius;
    private int bulletColor;
    private int bulletGapWidth;
    private int bulletRadius;
    private ClickableSpan clickSpan;
    private int first;
    private int flag;
    private String fontFamily;
    private int fontSize;
    private int foregroundColor;
    private Bitmap imageBitmap;
    private Drawable imageDrawable;
    private int imageResourceId;
    private Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isCreated;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private SerializableSpannableStringBuilder mBuilder;
    private CharSequence mText;
    private TextView mTextView;
    private int mType;
    private final int mTypeCharSequence;
    private final int mTypeImage;
    private final int mTypeSpace;
    private float proportion;
    private int quoteColor;
    private int quoteGapWidth;
    private int rest;
    private Shader shader;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private int spaceColor;
    private int spaceSize;
    private Object[] spans;
    private int stripeWidth;
    private BlurMaskFilter.Blur style;
    private Typeface typeface;
    private String url;
    private int verticalAlign;
    private float xProportion;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Align {
    }

    public static class CustomBulletSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private Path sBulletPath;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z9, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i15) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        Path path = new Path();
                        this.sBulletPath = path;
                        path.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i10 + (i11 * this.radius), (i12 + i14) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i10 + (i11 * r10), (i12 + i14) / 2.0f, this.radius, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z9) {
            return (this.radius * 2) + this.gapWidth;
        }

        private CustomBulletSpan(int i10, int i11, int i12) {
            this.sBulletPath = null;
            this.color = i10;
            this.radius = i11;
            this.gapWidth = i12;
        }
    }

    public static abstract class CustomDynamicDrawableSpan extends ReplacementSpan {
        static final int ALIGN_BASELINE = 1;
        static final int ALIGN_BOTTOM = 0;
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private WeakReference<Drawable> mDrawableRef;
        final int mVerticalAlignment;

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> weakReference = this.mDrawableRef;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = getDrawable();
            this.mDrawableRef = new WeakReference<>(drawable2);
            return drawable2;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
            int iHeight;
            float fHeight;
            Drawable cachedDrawable = getCachedDrawable();
            Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            if (bounds.height() < i14 - i12) {
                int i15 = this.mVerticalAlignment;
                if (i15 == 3) {
                    fHeight = i12;
                } else {
                    if (i15 == 2) {
                        iHeight = ((i14 + i12) - bounds.height()) / 2;
                    } else if (i15 == 1) {
                        fHeight = i13 - bounds.height();
                    } else {
                        iHeight = i14 - bounds.height();
                    }
                    fHeight = iHeight;
                }
                canvas.translate(f10, fHeight);
            } else {
                canvas.translate(f10, i12);
            }
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        public abstract Drawable getDrawable();

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            int i12;
            Rect bounds = getCachedDrawable().getBounds();
            if (fontMetricsInt != null && (i12 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i13 = this.mVerticalAlignment;
                if (i13 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i13 == 2) {
                    int i14 = i12 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i14;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i14;
                } else {
                    int i15 = -bounds.height();
                    int i16 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i15 + i16;
                    fontMetricsInt.bottom = i16;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        private CustomDynamicDrawableSpan() {
            this.mVerticalAlignment = 0;
        }

        private CustomDynamicDrawableSpan(int i10) {
            this.mVerticalAlignment = i10;
        }
    }

    public static class CustomLineHeightSpan implements LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        static Paint.FontMetricsInt sfm;
        private final int height;
        final int mVerticalAlignment;

        public CustomLineHeightSpan(int i10, int i11) {
            this.height = i10;
            this.mVerticalAlignment = i11;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = sfm;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                sfm = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                fontMetricsInt3.ascent = fontMetricsInt.ascent;
                fontMetricsInt3.descent = fontMetricsInt.descent;
                fontMetricsInt3.bottom = fontMetricsInt.bottom;
                fontMetricsInt3.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
                fontMetricsInt.leading = fontMetricsInt2.leading;
            }
            int i14 = this.height;
            int i15 = fontMetricsInt.descent;
            int i16 = fontMetricsInt.ascent;
            int i17 = i14 - (((i13 + i15) - i16) - i12);
            if (i17 > 0) {
                int i18 = this.mVerticalAlignment;
                if (i18 == 3) {
                    fontMetricsInt.descent = i15 + i17;
                } else if (i18 == 2) {
                    int i19 = i17 / 2;
                    fontMetricsInt.descent = i15 + i19;
                    fontMetricsInt.ascent = i16 - i19;
                } else {
                    fontMetricsInt.ascent = i16 - i17;
                }
            }
            int i20 = fontMetricsInt.bottom;
            int i21 = fontMetricsInt.top;
            int i22 = i14 - (((i13 + i20) - i21) - i12);
            if (i22 > 0) {
                int i23 = this.mVerticalAlignment;
                if (i23 == 3) {
                    fontMetricsInt.bottom = i20 + i22;
                } else if (i23 == 2) {
                    int i24 = i22 / 2;
                    fontMetricsInt.bottom = i20 + i24;
                    fontMetricsInt.top = i21 - i24;
                } else {
                    fontMetricsInt.top = i21 - i22;
                }
            }
            if (i11 == ((Spanned) charSequence).getSpanEnd(this)) {
                sfm = null;
            }
        }
    }

    public static class CustomQuoteSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z9, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i10, i12, i10 + (i11 * this.stripeWidth), i14, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z9) {
            return this.stripeWidth + this.gapWidth;
        }

        private CustomQuoteSpan(int i10, int i11, int i12) {
            this.color = i10;
            this.stripeWidth = i11;
            this.gapWidth = i12;
        }
    }

    @SuppressLint({"ParcelCreator"})
    public static class CustomTypefaceSpan extends TypefaceSpan {
        private final Typeface newType;

        private void apply(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        private CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.newType = typeface;
        }
    }

    public static class SerializableSpannableStringBuilder extends SpannableStringBuilder implements Serializable {
        private static final long serialVersionUID = 4909567650765875771L;

        private SerializableSpannableStringBuilder() {
        }
    }

    public static class ShaderSpan extends CharacterStyle implements UpdateAppearance {
        private Shader mShader;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }

        private ShaderSpan(Shader shader) {
            this.mShader = shader;
        }
    }

    public static class ShadowSpan extends CharacterStyle implements UpdateAppearance {

        /* renamed from: dx */
        private float f3355dx;

        /* renamed from: dy */
        private float f3356dy;
        private float radius;
        private int shadowColor;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.f3355dx, this.f3356dy, this.shadowColor);
        }

        private ShadowSpan(float f10, float f11, float f12, int i10) {
            this.radius = f10;
            this.f3355dx = f11;
            this.f3356dy = f12;
            this.shadowColor = i10;
        }
    }

    public static class SpaceSpan extends ReplacementSpan {
        private final Paint paint;
        private final int width;

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
            canvas.drawRect(f10, i12, f10 + this.width, i14, this.paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }

        private SpaceSpan(int i10) {
            this(i10, 0);
        }

        private SpaceSpan(int i10, int i11) {
            Paint paint = new Paint();
            this.paint = paint;
            this.width = i10;
            paint.setColor(i11);
            paint.setStyle(Paint.Style.FILL);
        }
    }

    public static class VerticalAlignSpan extends ReplacementSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        final int mVerticalAlignment;

        public VerticalAlignSpan(int i10) {
            this.mVerticalAlignment = i10;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
            CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(charSequenceSubSequence.toString(), f10, i13 - (((((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) / 2) - ((i14 + i12) / 2)), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence.subSequence(i10, i11).toString());
        }
    }

    private SpanUtils(TextView textView) {
        this();
        this.mTextView = textView;
    }

    private void apply(int i10) {
        applyLast();
        this.mType = i10;
    }

    private void applyLast() {
        if (this.isCreated) {
            return;
        }
        int i10 = this.mType;
        if (i10 == 0) {
            updateCharCharSequence();
        } else if (i10 == 1) {
            updateImage();
        } else if (i10 == 2) {
            updateSpace();
        }
        setDefault();
    }

    private void setDefault() {
        this.flag = 33;
        this.foregroundColor = COLOR_DEFAULT;
        this.backgroundColor = COLOR_DEFAULT;
        this.lineHeight = -1;
        this.quoteColor = COLOR_DEFAULT;
        this.first = -1;
        this.bulletColor = COLOR_DEFAULT;
        this.fontSize = -1;
        this.proportion = -1.0f;
        this.xProportion = -1.0f;
        this.isStrikethrough = false;
        this.isUnderline = false;
        this.isSuperscript = false;
        this.isSubscript = false;
        this.isBold = false;
        this.isItalic = false;
        this.isBoldItalic = false;
        this.fontFamily = null;
        this.typeface = null;
        this.alignment = null;
        this.verticalAlign = -1;
        this.clickSpan = null;
        this.url = null;
        this.blurRadius = -1.0f;
        this.shader = null;
        this.shadowRadius = -1.0f;
        this.spans = null;
        this.imageBitmap = null;
        this.imageDrawable = null;
        this.imageUri = null;
        this.imageResourceId = -1;
        this.spaceSize = -1;
    }

    private void setMovementMethodIfNeed() {
        TextView textView = this.mTextView;
        if (textView == null || textView.getMovementMethod() != null) {
            return;
        }
        this.mTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void updateCharCharSequence() {
        if (this.mText.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        if (length == 0 && this.lineHeight != -1) {
            this.mBuilder.append((CharSequence) Character.toString((char) 2)).append((CharSequence) SignParameters.NEW_LINE).setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.verticalAlign != -1) {
            this.mBuilder.setSpan(new VerticalAlignSpan(this.verticalAlign), length, length2, this.flag);
        }
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i10 = this.quoteColor;
        if (i10 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomQuoteSpan(i10, this.stripeWidth, this.quoteGapWidth), length, length2, this.flag);
        }
        int i11 = this.bulletColor;
        if (i11 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomBulletSpan(i11, this.bulletRadius, this.bulletGapWidth), length, length2, this.flag);
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new AbsoluteSizeSpan(this.fontSize, false), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        int i12 = this.lineHeight;
        if (i12 != -1) {
            this.mBuilder.setSpan(new CustomLineHeightSpan(i12, this.alignLine), length, length2, this.flag);
        }
        if (this.isStrikethrough) {
            this.mBuilder.setSpan(new StrikethroughSpan(), length, length2, this.flag);
        }
        if (this.isUnderline) {
            this.mBuilder.setSpan(new UnderlineSpan(), length, length2, this.flag);
        }
        if (this.isSuperscript) {
            this.mBuilder.setSpan(new SuperscriptSpan(), length, length2, this.flag);
        }
        if (this.isSubscript) {
            this.mBuilder.setSpan(new SubscriptSpan(), length, length2, this.flag);
        }
        if (this.isBold) {
            this.mBuilder.setSpan(new StyleSpan(1), length, length2, this.flag);
        }
        if (this.isItalic) {
            this.mBuilder.setSpan(new StyleSpan(2), length, length2, this.flag);
        }
        if (this.isBoldItalic) {
            this.mBuilder.setSpan(new StyleSpan(3), length, length2, this.flag);
        }
        if (this.fontFamily != null) {
            this.mBuilder.setSpan(new TypefaceSpan(this.fontFamily), length, length2, this.flag);
        }
        if (this.typeface != null) {
            this.mBuilder.setSpan(new CustomTypefaceSpan(this.typeface), length, length2, this.flag);
        }
        if (this.alignment != null) {
            this.mBuilder.setSpan(new AlignmentSpan.Standard(this.alignment), length, length2, this.flag);
        }
        ClickableSpan clickableSpan = this.clickSpan;
        if (clickableSpan != null) {
            this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
        }
        if (this.url != null) {
            this.mBuilder.setSpan(new URLSpan(this.url), length, length2, this.flag);
        }
        if (this.blurRadius != -1.0f) {
            this.mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.blurRadius, this.style)), length, length2, this.flag);
        }
        if (this.shader != null) {
            this.mBuilder.setSpan(new ShaderSpan(this.shader), length, length2, this.flag);
        }
        if (this.shadowRadius != -1.0f) {
            this.mBuilder.setSpan(new ShadowSpan(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor), length, length2, this.flag);
        }
        Object[] objArr = this.spans;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.mBuilder.setSpan(obj, length, length2, this.flag);
            }
        }
    }

    private void updateImage() {
        int length = this.mBuilder.length();
        this.mText = "<img>";
        updateCharCharSequence();
        int length2 = this.mBuilder.length();
        if (this.imageBitmap != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageBitmap, this.alignImage), length, length2, this.flag);
            return;
        }
        if (this.imageDrawable != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageDrawable, this.alignImage), length, length2, this.flag);
        } else if (this.imageUri != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageUri, this.alignImage), length, length2, this.flag);
        } else if (this.imageResourceId != -1) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageResourceId, this.alignImage), length, length2, this.flag);
        }
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mText = "< >";
        updateCharCharSequence();
        this.mBuilder.setSpan(new SpaceSpan(this.spaceSize, this.spaceColor), length, this.mBuilder.length(), this.flag);
    }

    public static SpanUtils with(TextView textView) {
        return new SpanUtils(textView);
    }

    public SpanUtils append(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap) {
        return appendImage(bitmap, 0);
    }

    public SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i10) {
        return appendSpace(i10, 0);
    }

    public SpannableStringBuilder create() {
        applyLast();
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(this.mBuilder);
        }
        this.isCreated = true;
        return this.mBuilder;
    }

    public SpannableStringBuilder get() {
        return this.mBuilder;
    }

    public SpanUtils setBackgroundColor(@ColorInt int i10) {
        this.backgroundColor = i10;
        return this;
    }

    public SpanUtils setBlur(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, BlurMaskFilter.Blur blur) {
        this.blurRadius = f10;
        this.style = blur;
        return this;
    }

    public SpanUtils setBold() {
        this.isBold = true;
        return this;
    }

    public SpanUtils setBoldItalic() {
        this.isBoldItalic = true;
        return this;
    }

    public SpanUtils setBullet(@IntRange(from = 0) int i10) {
        return setBullet(0, 3, i10);
    }

    public SpanUtils setClickSpan(@NonNull ClickableSpan clickableSpan) {
        setMovementMethodIfNeed();
        this.clickSpan = clickableSpan;
        return this;
    }

    public SpanUtils setFlag(int i10) {
        this.flag = i10;
        return this;
    }

    public SpanUtils setFontFamily(@NonNull String str) {
        this.fontFamily = str;
        return this;
    }

    public SpanUtils setFontProportion(float f10) {
        this.proportion = f10;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i10) {
        return setFontSize(i10, false);
    }

    public SpanUtils setFontXProportion(float f10) {
        this.xProportion = f10;
        return this;
    }

    public SpanUtils setForegroundColor(@ColorInt int i10) {
        this.foregroundColor = i10;
        return this;
    }

    public SpanUtils setHorizontalAlign(@NonNull Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public SpanUtils setLeadingMargin(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        this.first = i10;
        this.rest = i11;
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i10) {
        return setLineHeight(i10, 2);
    }

    public SpanUtils setQuoteColor(@ColorInt int i10) {
        return setQuoteColor(i10, 2, 2);
    }

    public SpanUtils setShader(@NonNull Shader shader) {
        this.shader = shader;
        return this;
    }

    public SpanUtils setShadow(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, float f11, float f12, int i10) {
        this.shadowRadius = f10;
        this.shadowDx = f11;
        this.shadowDy = f12;
        this.shadowColor = i10;
        return this;
    }

    public SpanUtils setSpans(@NonNull Object... objArr) {
        if (objArr.length > 0) {
            this.spans = objArr;
        }
        return this;
    }

    public SpanUtils setStrikethrough() {
        this.isStrikethrough = true;
        return this;
    }

    public SpanUtils setSubscript() {
        this.isSubscript = true;
        return this;
    }

    public SpanUtils setSuperscript() {
        this.isSuperscript = true;
        return this;
    }

    public SpanUtils setTypeface(@NonNull Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public SpanUtils setUrl(@NonNull String str) {
        setMovementMethodIfNeed();
        this.url = str;
        return this;
    }

    public SpanUtils setVerticalAlign(int i10) {
        this.verticalAlign = i10;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap, int i10) {
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i10;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i10, @ColorInt int i11) {
        apply(2);
        this.spaceSize = i10;
        this.spaceColor = i11;
        return this;
    }

    public SpanUtils setBullet(@ColorInt int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        this.bulletColor = i10;
        this.bulletRadius = i11;
        this.bulletGapWidth = i12;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i10, boolean z9) {
        if (!z9) {
            this.fontSize = i10;
            return this;
        }
        this.fontSize = (int) ((i10 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i10, int i11) {
        this.lineHeight = i10;
        this.alignLine = i11;
        return this;
    }

    public SpanUtils setQuoteColor(@ColorInt int i10, @IntRange(from = 1) int i11, @IntRange(from = 0) int i12) {
        this.quoteColor = i10;
        this.stripeWidth = i11;
        this.quoteGapWidth = i12;
        return this;
    }

    public SpanUtils() {
        this.mTypeCharSequence = 0;
        this.mTypeImage = 1;
        this.mTypeSpace = 2;
        this.mBuilder = new SerializableSpannableStringBuilder();
        this.mText = "";
        this.mType = -1;
        setDefault();
    }

    public SpanUtils appendLine(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = ((Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    public SpanUtils setClickSpan(@ColorInt final int i10, final boolean z9, final View.OnClickListener onClickListener) {
        setMovementMethodIfNeed();
        this.clickSpan = new ClickableSpan() { // from class: com.blankj.utilcode.util.SpanUtils.1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                textPaint.setColor(i10);
                textPaint.setUnderlineText(z9);
            }
        };
        return this;
    }

    public static class CustomImageSpan extends CustomDynamicDrawableSpan {
        private Uri mContentUri;
        private Drawable mDrawable;
        private int mResourceId;

        @Override // com.blankj.utilcode.util.SpanUtils.CustomDynamicDrawableSpan
        public Drawable getDrawable() throws IOException {
            Drawable drawable = this.mDrawable;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = null;
            if (this.mContentUri != null) {
                try {
                    InputStream inputStreamOpenInputStream = Utils.getApp().getContentResolver().openInputStream(this.mContentUri);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(Utils.getApp().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                        if (inputStreamOpenInputStream == null) {
                            return bitmapDrawable;
                        }
                        inputStreamOpenInputStream.close();
                        return bitmapDrawable;
                    } catch (Exception e10) {
                        e = e10;
                        drawable2 = bitmapDrawable;
                        Log.e("sms", "Failed to loaded content " + this.mContentUri, e);
                        return drawable2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                try {
                    drawable2 = ContextCompat.getDrawable(Utils.getApp(), this.mResourceId);
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                    return drawable2;
                } catch (Exception unused) {
                    Log.e("sms", "Unable to find resource: " + this.mResourceId);
                }
            }
            return drawable2;
        }

        private CustomImageSpan(Bitmap bitmap, int i10) {
            super(i10);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Utils.getApp().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Drawable drawable, int i10) {
            super(i10);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Uri uri, int i10) {
            super(i10);
            this.mContentUri = uri;
        }

        private CustomImageSpan(@DrawableRes int i10, int i11) {
            super(i11);
            this.mResourceId = i10;
        }
    }

    public SpanUtils appendImage(@NonNull Drawable drawable) {
        return appendImage(drawable, 0);
    }

    public SpanUtils appendImage(@NonNull Drawable drawable, int i10) {
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i10;
        return this;
    }

    public SpanUtils appendImage(@NonNull Uri uri) {
        return appendImage(uri, 0);
    }

    public SpanUtils appendImage(@NonNull Uri uri, int i10) {
        apply(1);
        this.imageUri = uri;
        this.alignImage = i10;
        return this;
    }

    public SpanUtils appendImage(@DrawableRes int i10) {
        return appendImage(i10, 0);
    }

    public SpanUtils appendImage(@DrawableRes int i10, int i11) {
        apply(1);
        this.imageResourceId = i10;
        this.alignImage = i11;
        return this;
    }
}
