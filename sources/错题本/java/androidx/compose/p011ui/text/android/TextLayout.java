package androidx.compose.p011ui.text.android;

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
import androidx.compose.p011ui.text.android.selection.WordIterator;
import androidx.compose.p011ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p011ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.p011ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b.\u0010,J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b1\u0010,J\u0015\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b2\u0010,J\u0015\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\b¢\u0006\u0004\b4\u0010,J\u001d\u00106\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u000f¢\u0006\u0004\b<\u0010;J\u0015\u0010=\u001a\u00020\b2\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b=\u0010,J\u0015\u0010>\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b>\u00100J\u0015\u0010?\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b?\u0010,J%\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bE\u0010FJ9\u0010L\u001a\u0004\u0018\u00010\u00182\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\b2\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000f0J¢\u0006\u0004\bL\u0010MJ\u001f\u0010R\u001a\u00020D2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bP\u0010QJ-\u0010V\u001a\u00020D2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010O\u001a\u00020N2\u0006\u0010U\u001a\u00020\b¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020G2\u0006\u00108\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u0015\u0010\\\u001a\u00020D2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u000f\u0010`\u001a\u00020\u000fH\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010f\u001a\u0004\bg\u0010_R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010f\u001a\u0004\bh\u0010_R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010l\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u0010_R\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR \u0010r\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010w\u001a\u0004\bt\u0010uR\u0017\u0010x\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R \u0010|\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010y\u0012\u0004\b~\u0010w\u001a\u0004\b}\u0010{R\"\u0010\u007f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b\u007f\u0010y\u0012\u0005\b\u0081\u0001\u0010w\u001a\u0005\b\u0080\u0001\u0010{R\u0017\u0010\u0082\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010fR\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010yR!\u0010\u008c\u0001\u001a\f\u0012\u0005\u0012\u00030\u008b\u0001\u0018\u00010\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010H\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0014\u0010\u0095\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0014\u0010\u0097\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0094\u0001R\u0014\u0010\u009a\u0001\u001a\u00020n8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0014\u0010\u009d\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0013\u0010\u009f\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010{R\u0018\u0010¢\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006£\u0001"}, m5110d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "Ld6/s;", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "getRangeForRect", "(Landroid/graphics/RectF;ILr6/e;)[I", "", "array", "fillLineHorizontalBounds$ui_text_release", "(I[F)V", "fillLineHorizontalBounds", "startOffset", "endOffset", "arrayStart", "fillBoundingBoxes", "(II[FI)V", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "getHorizontalPadding", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "Z", "getIncludePadding", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroidx/compose/ui/text/android/selection/WordIterator;", "backingWordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "bottomPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "leftPadding", "F", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "backingLayoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1127:1\n1#2:1128\n114#3,8:1129\n114#3,8:1137\n114#3,8:1145\n114#3,8:1153\n114#3,8:1161\n114#3,8:1169\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n*L\n607#1:1129,8\n674#1:1137,8\n675#1:1145,8\n678#1:1153,8\n681#1:1161,8\n688#1:1169,8\n*E\n"})
/* loaded from: classes2.dex */
public final class TextLayout {
    public static final int $stable = 8;

    @Nullable
    private LayoutHelper backingLayoutHelper;

    @Nullable
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;

    @Nullable
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;

    @Nullable
    private final Paint.FontMetricsInt lastLineFontMetrics;

    @NotNull
    private final Layout layout;

    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;

    @Nullable
    private final LineHeightStyleSpan[] lineHeightSpans;

    @NotNull
    private final Rect rect;
    private final float rightPadding;

    @NotNull
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public TextLayout(@NotNull CharSequence charSequence, float f, @NotNull TextPaint textPaint, int i, @Nullable TextUtils.TruncateAt truncateAt, int i8, float f7, @Px float f8, boolean z8, boolean z9, int i9, int i10, int i11, int i12, int i13, int i14, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        boolean z10;
        int i15;
        boolean z11;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutCreate;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z8;
        this.fallbackLineSpacing = z9;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i8);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d9 = f;
            int iCeil = (int) Math.ceil(d9);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z12) {
                z10 = true;
                this.isBoringLayout = false;
                i15 = i9;
                z11 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                textPaint2 = textPaint;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignment, i15, truncateAt, (int) Math.ceil(d9), f7, f8, i14, z8, z9, i10, i11, i12, i13, iArr, iArr2);
            } else {
                z10 = true;
                this.isBoringLayout = true;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z8, z9, truncateAt, iCeil);
                textPaint2 = textPaint;
                i15 = i9;
                textDirectionHeuristic = textDirectionHeuristic2;
                z11 = false;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i15);
            this.lineCount = iMin;
            int i16 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i15 && (layoutCreate.getEllipsisCount(i16) > 0 || layoutCreate.getLineEnd(i16) != charSequence.length())) ? z10 : z11;
            long verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m12822getTopPaddingimpl(verticalPaddings), VerticalPaddings.m12822getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m12821getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m12821getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i16)) : z11;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(layoutCreate, i16, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(layoutCreate, i16, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int line) {
        if (line == this.lineCount - 1) {
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
            AbstractC5830k.m5327d(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return textLayout.getPrimaryHorizontal(i, z8);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return textLayout.getSecondaryHorizontal(i, z8);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int startOffset, int endOffset, @NotNull float[] array, int arrayStart) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (!(startOffset >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(startOffset);
        int lineForOffset2 = getLineForOffset(endOffset - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i = lineForOffset;
        int i8 = arrayStart;
        while (true) {
            int lineStart = getLineStart(i);
            int lineEnd = getLineEnd(i);
            int iMin = Math.min(endOffset, lineEnd);
            float lineTop = getLineTop(i);
            float lineBottom = getLineBottom(i);
            boolean z8 = getParagraphDirection(i) == 1;
            for (int iMax = Math.max(startOffset, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z8 && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (z8 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (z8 || !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                }
                array[i8] = secondaryDownstream;
                array[i8 + 1] = lineTop;
                array[i8 + 2] = secondaryUpstream;
                array[i8 + 3] = lineBottom;
                i8 += 4;
            }
            if (i == lineForOffset2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text_release(int lineIndex, @NotNull float[] array) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(lineIndex);
        int lineEnd = getLineEnd(lineIndex);
        int i = 0;
        if (!(array.length >= (lineEnd - lineStart) * 2)) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        boolean z8 = getParagraphDirection(lineIndex) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z8 && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z8 && zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            array[i] = secondaryDownstream;
            array[i + 1] = secondaryUpstream;
            i += 2;
            lineStart++;
        }
    }

    /* renamed from: getBottomPadding$ui_text_release, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final RectF getBoundingBox(int offset) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(offset);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z8 = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z8 || zIsRtlCharAt) {
            if (z8 && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(offset, false);
                primaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(offset, false);
                primaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(offset, false);
                secondaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(offset, false);
            secondaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
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

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : getLineTop(line) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (!TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) || this.ellipsize != TextUtils.TruncateAt.END) {
            return getLayoutHelper().getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, ((-1) * getHorizontalPadding(line)) + horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    @Nullable
    public final int[] getRangeForRect(@NotNull RectF rect, int granularity, @NotNull InterfaceC6473e inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rect, granularity, inclusionStrategy) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rect, granularity, inclusionStrategy);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final void getSelectionPath(int start, int end, @NotNull Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    @NotNull
    public final CharSequence getText() {
        return this.layout.getText();
    }

    @NotNull
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    /* renamed from: getTopPadding$ui_text_release, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    @NotNull
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
            AbstractC5830k.m5328e(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        AbstractC5830k.m5328e(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(@NotNull Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            int i8 = this.topPadding;
            if (i8 != 0) {
                canvas.translate(0.0f, (-1) * i8);
            }
        }
    }

    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i8, float f7, float f8, boolean z8, boolean z9, int i9, int i10, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i15, AbstractC5824e abstractC5824e) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        LayoutIntrinsics layoutIntrinsics2;
        int i16 = (i15 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i15 & 16) != 0 ? null : truncateAt;
        int i17 = (i15 & 32) != 0 ? 2 : i8;
        float f9 = (i15 & 64) != 0 ? 1.0f : f7;
        float f10 = (i15 & 128) != 0 ? 0.0f : f8;
        boolean z10 = (i15 & 256) != 0 ? false : z8;
        boolean z11 = (i15 & 512) != 0 ? true : z9;
        int i18 = (i15 & 1024) != 0 ? Integer.MAX_VALUE : i9;
        int i19 = (i15 & 2048) != 0 ? 0 : i10;
        int i20 = (i15 & 4096) != 0 ? 0 : i11;
        int i21 = (i15 & 8192) != 0 ? 0 : i12;
        int i22 = (i15 & 16384) != 0 ? 0 : i13;
        int i23 = (32768 & i15) != 0 ? 0 : i14;
        int[] iArr3 = (65536 & i15) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i15) != 0 ? null : iArr2;
        if ((i15 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = new LayoutIntrinsics(charSequence2, textPaint2, i17);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            layoutIntrinsics2 = layoutIntrinsics;
        }
        this(charSequence2, f, textPaint2, i16, truncateAt2, i17, f9, f10, z10, z11, i18, i19, i20, i21, i22, i23, iArr3, iArr4, layoutIntrinsics2);
    }
}
