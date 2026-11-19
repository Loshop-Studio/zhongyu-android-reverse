package androidx.compose.p014ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface VerticalAlign {
        }

        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public PlaceholderSpan(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.width = f10;
        this.widthUnit = i10;
        this.height = f11;
        this.heightUnit = i11;
        this.pxPerSp = f12;
        this.verticalAlign = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC9979u.m20312y("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iCeilToInt;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(getFontMetrics().descent > getFontMetrics().ascent)) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.widthUnit;
        if (i12 == 0) {
            f10 = this.width * this.pxPerSp;
        } else {
            if (i12 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f10 = this.width * textSize;
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f10);
        int i13 = this.heightUnit;
        if (i13 == 0) {
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * this.pxPerSp);
        } else {
            if (i13 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * textSize);
        }
        this.heightPx = iCeilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = heightPx;
                        fontMetricsInt.descent = heightPx + getHeightPx();
                        break;
                    }
                    break;
                default:
                    InlineClassHelperKt.throwIllegalArgumentException("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }
}
