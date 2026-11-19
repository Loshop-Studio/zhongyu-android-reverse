package androidx.compose.p014ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.android.TextLayout;
import androidx.compose.p014ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.p014ui.text.android.selection.WordIterator;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.p014ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.p014ui.text.platform.AndroidTextPaint;
import androidx.compose.p014ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, int i11, long j10, AbstractC9972n abstractC9972n) {
        this(androidParagraphIntrinsics, i10, i11, j10);
    }

    private final TextLayout constructTextLayout(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), getTextPaint$ui_text_release(), i10, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i12, i14, i15, i16, i13, i11, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    public static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, Object obj) {
        return androidParagraph.constructTextLayout(i10, i11, truncateAt, i12, i13, i14, i15, i16, (i17 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        AbstractC9979u.m20292e(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        AbstractC9979u.m20292e(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo32774fillBoundingBoxes8ffj60Q(long j10, float[] fArr, @IntRange(from = 0) int i10) {
        this.layout.fillBoundingBoxes(TextRange.m32964getMinimpl(j10), TextRange.m32963getMaximpl(j10), fArr, i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i10) {
        return this.layout.isRtlCharAt(i10) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public Rect getBoundingBox(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.charSequence.length()) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i10 + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF boundingBox = this.layout.getBoundingBox(i10);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m32775getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public Rect getCursorRect(int i10) {
        if (!(i10 >= 0 && i10 <= this.charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i10 + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i10, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i10);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getHorizontalPosition(int i10, boolean z10) {
        return z10 ? TextLayout.getPrimaryHorizontal$default(this.layout, i10, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.layout, i10, false, 2, null);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i10) {
        return this.layout.getLineAscent(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineBaseline(int i10) {
        return this.layout.getLineBaseline(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineBottom(int i10) {
        return this.layout.getLineBottom(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i10) {
        return this.layout.getLineDescent(i10);
    }

    public final int getLineEllipsisCount$ui_text_release(int i10) {
        return this.layout.getLineEllipsisCount(i10);
    }

    public final int getLineEllipsisOffset$ui_text_release(int i10) {
        return this.layout.getLineEllipsisOffset(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public int getLineEnd(int i10, boolean z10) {
        return z10 ? this.layout.getLineVisibleEnd(i10) : this.layout.getLineEnd(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public int getLineForOffset(int i10) {
        return this.layout.getLineForOffset(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public int getLineForVerticalPosition(float f10) {
        return this.layout.getLineForVertical((int) f10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineHeight(int i10) {
        return this.layout.getLineHeight(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineLeft(int i10) {
        return this.layout.getLineLeft(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineRight(int i10) {
        return this.layout.getLineRight(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public int getLineStart(int i10) {
        return this.layout.getLineStart(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineTop(int i10) {
        return this.layout.getLineTop(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getLineWidth(int i10) {
        return this.layout.getLineWidth(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo32776getOffsetForPositionk4lQ0M(long j10) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Float.intBitsToFloat((int) (4294967295L & j10))), Float.intBitsToFloat((int) (j10 >> 32)));
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m32777getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i10) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i10)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public Path getPathForRange(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i10, i11, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo32778getRangeForRect86BmAI(Rect rect, int i10, final TextInclusionStrategy textInclusionStrategy) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m32794toLayoutTextGranularityduNsdkg(i10), new InterfaceC9544p() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2)));
            }
        });
        return rangeForRect == null ? TextRange.Companion.m32971getZerod9O1mEE() : TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public float getWidth() {
        return Constraints.m33454getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo32779getWordBoundaryjx7JFs(int i10) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i10), WordBoundary_androidKt.getWordEnd(wordIterator, i10));
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    public boolean isLineEllipsized(int i10) {
        return this.layout.isLineEllipsized(i10);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo32780paintLG529CI(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        int iM33229getBlendMode0nO6VwU = getTextPaint$ui_text_release().m33229getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m33234setColor8_81llA(j10);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m33231setBlendModes9anfk8(i10);
        paint(canvas);
        getTextPaint$ui_text_release().m33231setBlendModes9anfk8(iM33229getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo32781paintRPmYEkk(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m33234setColor8_81llA(j10);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.p014ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo32782painthn5TExg(Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        int iM33229getBlendMode0nO6VwU = getTextPaint$ui_text_release().m33229getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        float width = getWidth();
        float height = getHeight();
        textPaint$ui_text_release.m33232setBrush12SF9DM(brush, Size.m30697constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f10);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m33231setBlendModes9anfk8(i10);
        paint(canvas);
        getTextPaint$ui_text_release().m33231setBlendModes9anfk8(iM33229getBlendMode0nO6VwU);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i10, int i11, long j10, FontFamily.Resolver resolver, Density density, AbstractC9972n abstractC9972n) {
        this(str, textStyle, list, list2, i10, i11, j10, resolver, density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AndroidParagraph(androidx.compose.p014ui.text.platform.AndroidParagraphIntrinsics r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, int, long):void");
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, int i11, long j10, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i10, i11, j10, null);
    }
}
