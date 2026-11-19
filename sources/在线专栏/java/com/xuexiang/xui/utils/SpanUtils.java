package com.xuexiang.xui.utils;

import android.annotation.SuppressLint;
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
import android.provider.MediaStore;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
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
import androidx.core.content.C0332a;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private int alignIconMargin;
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
    private boolean fontSizeIsDp;
    private int foregroundColor;
    private Bitmap iconMarginBitmap;
    private Drawable iconMarginDrawable;
    private int iconMarginGapWidth;
    private int iconMarginResourceId;
    private Uri iconMarginUri;
    private Bitmap imageBitmap;
    private Drawable imageDrawable;
    private int imageResourceId;
    private Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private int mType;
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
    private float xProportion;
    private final int mTypeCharSequence = 0;
    private final int mTypeImage = 1;
    private final int mTypeSpace = 2;
    private SpannableStringBuilder mBuilder = new SpannableStringBuilder();
    private CharSequence mText = "";

    @Retention(RetentionPolicy.SOURCE)
    public @interface Align {
    }

    static class CustomBulletSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private Path sBulletPath;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i9) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        Path path = new Path();
                        this.sBulletPath = path;
                        path.addCircle(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.radius, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i4 + (i5 * this.radius), (i6 + i8) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i4 + (i5 * r10), (i6 + i8) / 2.0f, this.radius, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return (this.radius * 2) + this.gapWidth;
        }

        private CustomBulletSpan(int i4, int i5, int i6) {
            this.sBulletPath = null;
            this.color = i4;
            this.radius = i5;
            this.gapWidth = i6;
        }
    }

    static abstract class CustomDynamicDrawableSpan extends ReplacementSpan {
        static final int ALIGN_BASELINE = 1;
        static final int ALIGN_BOTTOM = 0;
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private WeakReference<Drawable> mDrawableRef;
        final int mVerticalAlignment;

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> weakReference = this.mDrawableRef;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                this.mDrawableRef = new WeakReference<>(getDrawable());
            }
            return getDrawable();
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
            float f5;
            float fHeight;
            Drawable cachedDrawable = getCachedDrawable();
            Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            float f6 = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
            int i9 = i8 - bounds.bottom;
            if (bounds.height() < f6) {
                int i10 = this.mVerticalAlignment;
                if (i10 == 1) {
                    i9 -= paint.getFontMetricsInt().descent;
                } else {
                    if (i10 == 2) {
                        f5 = i9;
                        fHeight = (f6 - bounds.height()) / 2.0f;
                    } else if (i10 == 3) {
                        f5 = i9;
                        fHeight = f6 - bounds.height();
                    }
                    i9 = (int) (f5 - fHeight);
                }
            }
            canvas.translate(f4, i9);
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        public abstract Drawable getDrawable();

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
            Rect bounds = getCachedDrawable().getBounds();
            int i6 = (int) (paint.getFontMetrics().descent - paint.getFontMetrics().ascent);
            if (fontMetricsInt != null && bounds.height() > i6) {
                int i7 = this.mVerticalAlignment;
                if (i7 == 3) {
                    fontMetricsInt.descent += bounds.height() - i6;
                } else if (i7 == 2) {
                    fontMetricsInt.ascent -= (bounds.height() - i6) / 2;
                    fontMetricsInt.descent += (bounds.height() - i6) / 2;
                } else {
                    fontMetricsInt.ascent -= bounds.height() - i6;
                }
            }
            return bounds.right;
        }

        private CustomDynamicDrawableSpan() {
            this.mVerticalAlignment = 0;
        }

        private CustomDynamicDrawableSpan(int i4) {
            this.mVerticalAlignment = i4;
        }
    }

    static class CustomLineHeightSpan extends CharacterStyle implements LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private final int height;
        final int mVerticalAlignment;

        CustomLineHeightSpan(int i4, int i5) {
            this.height = i4;
            this.mVerticalAlignment = i5;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i4, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
            int i8 = this.height;
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            int i11 = i8 - (((i7 + i9) - i10) - i6);
            if (i11 > 0) {
                int i12 = this.mVerticalAlignment;
                if (i12 == 3) {
                    fontMetricsInt.descent = i9 + i11;
                } else if (i12 == 2) {
                    int i13 = i11 / 2;
                    fontMetricsInt.descent = i9 + i13;
                    fontMetricsInt.ascent = i10 - i13;
                } else {
                    fontMetricsInt.ascent = i10 - i11;
                }
            }
            int i14 = fontMetricsInt.bottom;
            int i15 = fontMetricsInt.top;
            int i16 = i8 - (((i7 + i14) - i15) - i6);
            if (i16 > 0) {
                int i17 = this.mVerticalAlignment;
                if (i17 == 3) {
                    fontMetricsInt.top = i15 + i16;
                } else {
                    if (i17 != 2) {
                        fontMetricsInt.top = i15 - i16;
                        return;
                    }
                    int i18 = i16 / 2;
                    fontMetricsInt.bottom = i14 + i18;
                    fontMetricsInt.top = i15 - i18;
                }
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    static class CustomQuoteSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i4, i6, i4 + (this.stripeWidth * i5), i8, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return this.stripeWidth + this.gapWidth;
        }

        private CustomQuoteSpan(int i4, int i5, int i6) {
            this.color = i4;
            this.stripeWidth = i5;
            this.gapWidth = i6;
        }
    }

    @SuppressLint({"ParcelCreator"})
    static class CustomTypefaceSpan extends TypefaceSpan {
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

    static class ShaderSpan extends CharacterStyle implements UpdateAppearance {
        private Shader mShader;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }

        private ShaderSpan(Shader shader) {
            this.mShader = shader;
        }
    }

    static class ShadowSpan extends CharacterStyle implements UpdateAppearance {

        /* renamed from: dx */
        private float f9678dx;

        /* renamed from: dy */
        private float f9679dy;
        private float radius;
        private int shadowColor;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.f9678dx, this.f9679dy, this.shadowColor);
        }

        private ShadowSpan(float f4, float f5, float f6, int i4) {
            this.radius = f4;
            this.f9678dx = f5;
            this.f9679dy = f6;
            this.shadowColor = i4;
        }
    }

    static class SpaceSpan extends ReplacementSpan {
        private final int color;
        private final int width;

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(f4, i6, f4 + this.width, i8, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }

        private SpaceSpan(int i4) {
            this(i4, 0);
        }

        private SpaceSpan(int i4, int i5) {
            this.width = i4;
            this.color = i5;
        }
    }

    public SpanUtils() {
        setDefault();
    }

    private void apply(int i4) {
        applyLast();
        this.mType = i4;
    }

    private void applyLast() {
        int i4 = this.mType;
        if (i4 == 0) {
            updateCharCharSequence();
        } else if (i4 == 1) {
            updateImage();
        } else if (i4 == 2) {
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
        this.iconMarginBitmap = null;
        this.iconMarginDrawable = null;
        this.iconMarginUri = null;
        this.iconMarginResourceId = -1;
        this.iconMarginGapWidth = -1;
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

    private void updateCharCharSequence() {
        if (this.mText.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i4 = this.quoteColor;
        if (i4 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomQuoteSpan(i4, this.stripeWidth, this.quoteGapWidth), length, length2, this.flag);
        }
        int i5 = this.bulletColor;
        if (i5 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomBulletSpan(i5, this.bulletRadius, this.bulletGapWidth), length, length2, this.flag);
        }
        int i6 = this.iconMarginGapWidth;
        if (i6 != -1) {
            Bitmap bitmap = this.iconMarginBitmap;
            if (bitmap != null) {
                this.mBuilder.setSpan(new CustomIconMarginSpan(bitmap, i6, this.alignIconMargin), length, length2, this.flag);
            } else {
                Drawable drawable = this.iconMarginDrawable;
                if (drawable != null) {
                    this.mBuilder.setSpan(new CustomIconMarginSpan(drawable, i6, this.alignIconMargin), length, length2, this.flag);
                } else {
                    Uri uri = this.iconMarginUri;
                    if (uri != null) {
                        this.mBuilder.setSpan(new CustomIconMarginSpan(uri, i6, this.alignIconMargin), length, length2, this.flag);
                    } else {
                        int i7 = this.iconMarginResourceId;
                        if (i7 != -1) {
                            this.mBuilder.setSpan(new CustomIconMarginSpan(i7, i6, this.alignIconMargin), length, length2, this.flag);
                        }
                    }
                }
            }
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new AbsoluteSizeSpan(this.fontSize, this.fontSizeIsDp), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        if (this.lineHeight != -1) {
            this.mBuilder.setSpan(new CustomLineHeightSpan(this.lineHeight, this.alignLine), length, length2, this.flag);
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
        this.mBuilder.append((CharSequence) "<img>");
        int i4 = length + 5;
        if (this.imageBitmap != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageBitmap, this.alignImage), length, i4, this.flag);
            return;
        }
        if (this.imageDrawable != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageDrawable, this.alignImage), length, i4, this.flag);
        } else if (this.imageUri != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageUri, this.alignImage), length, i4, this.flag);
        } else if (this.imageResourceId != -1) {
            this.mBuilder.setSpan(new CustomImageSpan(this.imageResourceId, this.alignImage), length, i4, this.flag);
        }
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mBuilder.append((CharSequence) "< >");
        this.mBuilder.setSpan(new SpaceSpan(this.spaceSize, this.spaceColor), length, length + 3, this.flag);
    }

    public SpanUtils append(CharSequence charSequence) {
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public SpanUtils appendImage(Bitmap bitmap) {
        return appendImage(bitmap, 0);
    }

    public SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(int i4) {
        return appendSpace(i4, 0);
    }

    public SpannableStringBuilder create() {
        applyLast();
        return this.mBuilder;
    }

    public SpanUtils setAlign(Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public SpanUtils setBackgroundColor(int i4) {
        this.backgroundColor = i4;
        return this;
    }

    public SpanUtils setBlur(float f4, BlurMaskFilter.Blur blur) {
        this.blurRadius = f4;
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

    public SpanUtils setBullet(int i4) {
        return setBullet(0, 3, i4);
    }

    public SpanUtils setClickSpan(ClickableSpan clickableSpan) {
        this.clickSpan = clickableSpan;
        return this;
    }

    public SpanUtils setFlag(int i4) {
        this.flag = i4;
        return this;
    }

    public SpanUtils setFontFamily(String str) {
        this.fontFamily = str;
        return this;
    }

    public SpanUtils setFontProportion(float f4) {
        this.proportion = f4;
        return this;
    }

    public SpanUtils setFontSize(int i4) {
        return setFontSize(i4, false);
    }

    public SpanUtils setFontXProportion(float f4) {
        this.xProportion = f4;
        return this;
    }

    public SpanUtils setForegroundColor(int i4) {
        this.foregroundColor = i4;
        return this;
    }

    public SpanUtils setIconMargin(Bitmap bitmap) {
        return setIconMargin(bitmap, 0, 2);
    }

    public SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public SpanUtils setLeadingMargin(int i4, int i5) {
        this.first = i4;
        this.rest = i5;
        return this;
    }

    public SpanUtils setLineHeight(int i4) {
        return setLineHeight(i4, 2);
    }

    public SpanUtils setQuoteColor(int i4) {
        return setQuoteColor(i4, 2, 2);
    }

    public SpanUtils setShader(Shader shader) {
        this.shader = shader;
        return this;
    }

    public SpanUtils setShadow(float f4, float f5, float f6, int i4) {
        this.shadowRadius = f4;
        this.shadowDx = f5;
        this.shadowDy = f6;
        this.shadowColor = i4;
        return this;
    }

    public SpanUtils setSpans(Object... objArr) {
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

    public SpanUtils setTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public SpanUtils setUrl(String str) {
        this.url = str;
        return this;
    }

    public SpanUtils appendImage(Bitmap bitmap, int i4) {
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i4;
        return this;
    }

    public SpanUtils appendSpace(int i4, int i5) {
        apply(2);
        this.spaceSize = i4;
        this.spaceColor = i5;
        return this;
    }

    public SpanUtils setBullet(int i4, int i5, int i6) {
        this.bulletColor = i4;
        this.bulletRadius = i5;
        this.bulletGapWidth = i6;
        return this;
    }

    public SpanUtils setFontSize(int i4, boolean z3) {
        this.fontSize = i4;
        this.fontSizeIsDp = z3;
        return this;
    }

    public SpanUtils setIconMargin(Bitmap bitmap, int i4, int i5) {
        this.iconMarginBitmap = bitmap;
        this.iconMarginGapWidth = i4;
        this.alignIconMargin = i5;
        return this;
    }

    public SpanUtils setLineHeight(int i4, int i5) {
        this.lineHeight = i4;
        this.alignLine = i5;
        return this;
    }

    public SpanUtils setQuoteColor(int i4, int i5, int i6) {
        this.quoteColor = i4;
        this.stripeWidth = i5;
        this.quoteGapWidth = i6;
        return this;
    }

    public SpanUtils appendLine(CharSequence charSequence) {
        apply(0);
        this.mText = ((Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    static class CustomIconMarginSpan implements LeadingMarginSpan, LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private boolean flag;
        private int lineHeight;
        Bitmap mBitmap;
        private int mPad;
        final int mVerticalAlignment;
        private int need0;
        private int need1;
        private int totalHeight;

        private Bitmap drawable2Bitmap(Drawable drawable) {
            Bitmap bitmapCreateBitmap;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        private Bitmap resource2Bitmap(int i4) {
            Drawable drawableM1806d = C0332a.m1806d(XUI.getContext(), i4);
            if (drawableM1806d == null) {
                return null;
            }
            Canvas canvas = new Canvas();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM1806d.getIntrinsicWidth(), drawableM1806d.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            canvas.setBitmap(bitmapCreateBitmap);
            drawableM1806d.setBounds(0, 0, drawableM1806d.getIntrinsicWidth(), drawableM1806d.getIntrinsicHeight());
            drawableM1806d.draw(canvas);
            return bitmapCreateBitmap;
        }

        private Bitmap uri2Bitmap(Uri uri) {
            try {
                return MediaStore.Images.Media.getBitmap(XUI.getContext().getContentResolver(), uri);
            } catch (IOException e4) {
                e4.printStackTrace();
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i4, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
            if (this.lineHeight == 0) {
                this.lineHeight = i7 - i6;
            }
            if (this.need0 == 0 && i5 == ((Spanned) charSequence).getSpanEnd(this)) {
                int height = this.mBitmap.getHeight();
                this.need0 = height - (((fontMetricsInt.descent + i7) - fontMetricsInt.ascent) - i6);
                this.need1 = height - (((fontMetricsInt.bottom + i7) - fontMetricsInt.top) - i6);
                this.totalHeight = (i7 - i6) + this.lineHeight;
                return;
            }
            if (this.need0 > 0 || this.need1 > 0) {
                int i8 = this.mVerticalAlignment;
                if (i8 == 3) {
                    if (i5 == ((Spanned) charSequence).getSpanEnd(this)) {
                        int i9 = this.need0;
                        if (i9 > 0) {
                            fontMetricsInt.descent += i9;
                        }
                        int i10 = this.need1;
                        if (i10 > 0) {
                            fontMetricsInt.bottom += i10;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i8 != 2) {
                    if (i4 == ((Spanned) charSequence).getSpanStart(this)) {
                        int i11 = this.need0;
                        if (i11 > 0) {
                            fontMetricsInt.ascent -= i11;
                        }
                        int i12 = this.need1;
                        if (i12 > 0) {
                            fontMetricsInt.top -= i12;
                            return;
                        }
                        return;
                    }
                    if (this.flag) {
                        return;
                    }
                    int i13 = this.need0;
                    if (i13 > 0) {
                        fontMetricsInt.ascent += i13;
                    }
                    int i14 = this.need1;
                    if (i14 > 0) {
                        fontMetricsInt.top += i14;
                    }
                    this.flag = true;
                    return;
                }
                Spanned spanned = (Spanned) charSequence;
                if (i4 == spanned.getSpanStart(this)) {
                    int i15 = this.need0;
                    if (i15 > 0) {
                        fontMetricsInt.ascent -= i15 / 2;
                    }
                    int i16 = this.need1;
                    if (i16 > 0) {
                        fontMetricsInt.top -= i16 / 2;
                    }
                } else if (!this.flag) {
                    int i17 = this.need0;
                    if (i17 > 0) {
                        fontMetricsInt.ascent += i17 / 2;
                    }
                    int i18 = this.need1;
                    if (i18 > 0) {
                        fontMetricsInt.top += i18 / 2;
                    }
                    this.flag = true;
                }
                if (i5 == spanned.getSpanEnd(this)) {
                    int i19 = this.need0;
                    if (i19 > 0) {
                        fontMetricsInt.descent += i19 / 2;
                    }
                    int i20 = this.need1;
                    if (i20 > 0) {
                        fontMetricsInt.bottom += i20 / 2;
                    }
                }
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
            int lineTop = layout.getLineTop(layout.getLineForOffset(((Spanned) charSequence).getSpanStart(this)));
            if (i5 < 0) {
                i4 -= this.mBitmap.getWidth();
            }
            int height = this.totalHeight - this.mBitmap.getHeight();
            if (height <= 0) {
                canvas.drawBitmap(this.mBitmap, i4, lineTop, paint);
                return;
            }
            int i11 = this.mVerticalAlignment;
            if (i11 == 3) {
                canvas.drawBitmap(this.mBitmap, i4, lineTop, paint);
            } else if (i11 == 2) {
                canvas.drawBitmap(this.mBitmap, i4, lineTop + (height / 2.0f), paint);
            } else {
                canvas.drawBitmap(this.mBitmap, i4, lineTop + height, paint);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return this.mBitmap.getWidth() + this.mPad;
        }

        private CustomIconMarginSpan(Bitmap bitmap, int i4, int i5) {
            this.mBitmap = bitmap;
            this.mPad = i4;
            this.mVerticalAlignment = i5;
        }

        private CustomIconMarginSpan(Drawable drawable, int i4, int i5) {
            this.mBitmap = drawable2Bitmap(drawable);
            this.mPad = i4;
            this.mVerticalAlignment = i5;
        }

        private CustomIconMarginSpan(Uri uri, int i4, int i5) {
            this.mBitmap = uri2Bitmap(uri);
            this.mPad = i4;
            this.mVerticalAlignment = i5;
        }

        private CustomIconMarginSpan(int i4, int i5, int i6) {
            this.mBitmap = resource2Bitmap(i4);
            this.mPad = i5;
            this.mVerticalAlignment = i6;
        }
    }

    class CustomImageSpan extends CustomDynamicDrawableSpan {
        private Uri mContentUri;
        private Drawable mDrawable;
        private int mResourceId;

        @Override // com.xuexiang.xui.utils.SpanUtils.CustomDynamicDrawableSpan
        public Drawable getDrawable() throws IOException {
            Drawable drawableM1806d;
            Drawable drawable = this.mDrawable;
            if (drawable != null) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = null;
            if (this.mContentUri != null) {
                try {
                    InputStream inputStreamOpenInputStream = XUI.getContext().getContentResolver().openInputStream(this.mContentUri);
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(XUI.getContext().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        return bitmapDrawable2;
                    } catch (Exception e4) {
                        e = e4;
                        bitmapDrawable = bitmapDrawable2;
                        Log.e("sms", "Failed to loaded content " + this.mContentUri, e);
                        return bitmapDrawable;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } else {
                try {
                    drawableM1806d = C0332a.m1806d(XUI.getContext(), this.mResourceId);
                    try {
                        drawableM1806d.setBounds(0, 0, drawableM1806d.getIntrinsicWidth(), drawableM1806d.getIntrinsicHeight());
                        return drawableM1806d;
                    } catch (Exception unused) {
                        Log.e("sms", "Unable to find resource: " + this.mResourceId);
                        return drawableM1806d;
                    }
                } catch (Exception unused2) {
                    drawableM1806d = null;
                }
            }
        }

        private CustomImageSpan(Bitmap bitmap, int i4) {
            super(i4);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(XUI.getContext().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Drawable drawable, int i4) {
            super(i4);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Uri uri, int i4) {
            super(i4);
            this.mContentUri = uri;
        }

        private CustomImageSpan(int i4, int i5) {
            super(i5);
            this.mResourceId = i4;
        }
    }

    public SpanUtils appendImage(Drawable drawable) {
        return appendImage(drawable, 0);
    }

    public SpanUtils setIconMargin(Drawable drawable) {
        return setIconMargin(drawable, 0, 2);
    }

    public SpanUtils appendImage(Drawable drawable, int i4) {
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i4;
        return this;
    }

    public SpanUtils setIconMargin(Drawable drawable, int i4, int i5) {
        this.iconMarginDrawable = drawable;
        this.iconMarginGapWidth = i4;
        this.alignIconMargin = i5;
        return this;
    }

    public SpanUtils appendImage(Uri uri) {
        return appendImage(uri, 0);
    }

    public SpanUtils setIconMargin(Uri uri) {
        return setIconMargin(uri, 0, 2);
    }

    public SpanUtils appendImage(Uri uri, int i4) {
        apply(1);
        this.imageUri = uri;
        this.alignImage = i4;
        return this;
    }

    public SpanUtils setIconMargin(Uri uri, int i4, int i5) {
        this.iconMarginUri = uri;
        this.iconMarginGapWidth = i4;
        this.alignIconMargin = i5;
        return this;
    }

    public SpanUtils appendImage(int i4) {
        return appendImage(i4, 0);
    }

    public SpanUtils setIconMargin(int i4) {
        return setIconMargin(i4, 0, 2);
    }

    public SpanUtils appendImage(int i4, int i5) {
        apply(1);
        this.imageResourceId = i4;
        this.alignImage = i5;
        return this;
    }

    public SpanUtils setIconMargin(int i4, int i5, int i6) {
        this.iconMarginResourceId = i4;
        this.iconMarginGapWidth = i5;
        this.alignIconMargin = i6;
        return this;
    }
}
