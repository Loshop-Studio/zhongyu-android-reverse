package androidx.compose.p013ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.text.android.selection.WordIterator;
import androidx.compose.p013ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p013ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.p013ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayout {
    public static final int $stable = 8;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public TextLayout(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, @Px float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        boolean z12;
        int i18;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutCreate;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i11);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f10 || z14) {
                z12 = true;
                this.isBoringLayout = false;
                i18 = i12;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                textPaint2 = textPaint;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignment, i18, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                z12 = true;
                this.isBoringLayout = true;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z10, z11, truncateAt, iCeil);
                textPaint2 = textPaint;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristic2;
                z13 = false;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i18);
            this.lineCount = iMin;
            int i19 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i18 && (layoutCreate.getEllipsisCount(i19) > 0 || layoutCreate.getLineEnd(i19) != charSequence.length())) ? z12 : z13;
            long verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m26416getTopPaddingimpl(verticalPaddings), VerticalPaddings.m26416getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m26415getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m26415getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i19)) : z13;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(layoutCreate, i19, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(layoutCreate, i19, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int i10) {
        if (i10 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            AbstractC9133u.m16130d(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getPrimaryHorizontal(i10, z10);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getSecondaryHorizontal(i10, z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int i10, int i11, float[] fArr, int i12) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (!(i10 < length)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (!(i11 > i10)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (!(i11 <= length)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i10);
        int lineForOffset2 = getLineForOffset(i11 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i13 = lineForOffset;
        int i14 = i12;
        while (true) {
            int lineStart = getLineStart(i13);
            int lineEnd = getLineEnd(i13);
            int iMin = Math.min(i11, lineEnd);
            float lineTop = getLineTop(i13);
            float lineBottom = getLineBottom(i13);
            boolean z10 = getParagraphDirection(i13) == 1;
            for (int iMax = Math.max(i10, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z10 && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (z10 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (z10 || !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                }
                fArr[i14] = secondaryDownstream;
                fArr[i14 + 1] = lineTop;
                fArr[i14 + 2] = secondaryUpstream;
                fArr[i14 + 3] = lineBottom;
                i14 += 4;
            }
            if (i13 == lineForOffset2) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text_release(int i10, float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i10);
        int lineEnd = getLineEnd(i10);
        int i11 = 0;
        if (!(fArr.length >= (lineEnd - lineStart) * 2)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        boolean z10 = getParagraphDirection(i10) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z10 && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z10 && zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            fArr[i11] = secondaryDownstream;
            fArr[i11 + 1] = secondaryUpstream;
            i11 += 2;
            lineStart++;
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int i10) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i10);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z10 = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i10, false);
                primaryHorizontal2 = getSecondaryHorizontal(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i10, false);
                primaryHorizontal2 = getPrimaryHorizontal(i10 + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i10, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i10 + 1, true);
            }
            float f10 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f10;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(i10, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i10 + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(i10) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i10) {
        return this.topPadding + ((i10 != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(i10) : getLineTop(i10) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int i10) {
        if (i10 != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(i10) + (i10 == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(i10 - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(i10) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int i10) {
        return this.layout.getEllipsisCount(i10);
    }

    public final int getLineEllipsisOffset(int i10) {
        return this.layout.getEllipsisStart(i10);
    }

    public final int getLineEnd(int i10) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i10) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(i10);
    }

    public final int getLineForOffset(int i10) {
        return this.layout.getLineForOffset(i10);
    }

    public final int getLineForVertical(int i10) {
        return this.layout.getLineForVertical(i10 - this.topPadding);
    }

    public final float getLineHeight(int i10) {
        return getLineBottom(i10) - getLineTop(i10);
    }

    public final float getLineLeft(int i10) {
        return this.layout.getLineLeft(i10) + (i10 == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i10) {
        return this.layout.getLineRight(i10) + (i10 == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int i10) {
        return this.layout.getLineStart(i10);
    }

    public final float getLineTop(int i10) {
        return this.layout.getLineTop(i10) + (i10 == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int i10) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i10) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(i10) + this.layout.getEllipsisStart(i10) : getLayoutHelper().getLineVisibleEnd(i10);
    }

    public final float getLineWidth(int i10) {
        return this.layout.getLineWidth(i10);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i10, float f10) {
        return this.layout.getOffsetForHorizontal(i10, f10 + ((-1) * getHorizontalPadding(i10)));
    }

    public final int getParagraphDirection(int i10) {
        return this.layout.getParagraphDirection(i10);
    }

    public final float getPrimaryHorizontal(int i10, boolean z10) {
        return getLayoutHelper().getHorizontalPosition(i10, true, z10) + getHorizontalPadding(getLineForOffset(i10));
    }

    public final int[] getRangeForRect(RectF rectF, int i10, InterfaceC10574p interfaceC10574p) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rectF, i10, interfaceC10574p) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rectF, i10, interfaceC10574p);
    }

    public final float getSecondaryHorizontal(int i10, boolean z10) {
        return getLayoutHelper().getHorizontalPosition(i10, false, z10) + getHorizontalPadding(getLineForOffset(i10));
    }

    public final void getSelectionPath(int i10, int i11, Path path) {
        this.layout.getSelectionPath(i10, i11, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            AbstractC9133u.m16131e(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        AbstractC9133u.m16131e(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i10) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, i10);
    }

    public final boolean isRtlCharAt(int i10) {
        return this.layout.isRtlCharAt(i10);
    }

    public final void paint(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i10 = this.topPadding;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            int i11 = this.topPadding;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public /* synthetic */ TextLayout(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i18, AbstractC9126n abstractC9126n) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        LayoutIntrinsics layoutIntrinsics2;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & 256) != 0 ? false : z10;
        boolean z13 = (i18 & 512) != 0 ? true : z11;
        int i21 = (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & 2048) != 0 ? 0 : i13;
        int i23 = (i18 & 4096) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & 16384) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = new LayoutIntrinsics(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = layoutIntrinsics;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, layoutIntrinsics2);
    }
}
