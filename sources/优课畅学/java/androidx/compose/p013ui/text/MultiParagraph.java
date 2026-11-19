package androidx.compose.p013ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, i11);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return multiParagraph.getLineEnd(i10, z10);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m26212paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        multiParagraph.m26219paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m26213painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        multiParagraph.m26220painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    private final void requireIndexInRange(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < getAnnotatedString().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + i10 + ") is out of bounds [0, " + getAnnotatedString().length() + ')');
    }

    private final void requireIndexInRangeInclusiveEnd(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= getAnnotatedString().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + i10 + ") is out of bounds [0, " + getAnnotatedString().length() + ']');
    }

    private final void requireLineIndexInRange(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.lineCount) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + i10 + ") is out of bounds [0, " + this.lineCount + ')');
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m26214fillBoundingBoxes8ffj60Q(final long j10, final float[] fArr, @IntRange(from = 0) int i10) {
        requireIndexInRange(TextRange.m26362getMinimpl(j10));
        requireIndexInRangeInclusiveEnd(TextRange.m26361getMaximpl(j10));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f17471a = i10;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        MultiParagraphKt.m26221findParagraphsByRangeSbBc2M(this.paragraphInfoList, j10, new InterfaceC10570l() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                long j11 = j10;
                float[] fArr2 = fArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m26362getMinimpl(j11) ? paragraphInfo.getStartIndex() : TextRange.m26362getMinimpl(j11)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m26361getMaximpl(j11) ? paragraphInfo.getEndIndex() : TextRange.m26361getMaximpl(j11)));
                paragraphInfo.getParagraph().mo26172fillBoundingBoxes8ffj60Q(jTextRange, fArr2, ref$IntRef2.f17471a);
                int iM26360getLengthimpl = ref$IntRef2.f17471a + (TextRange.m26360getLengthimpl(jTextRange) * 4);
                for (int i11 = ref$IntRef2.f17471a; i11 < iM26360getLengthimpl; i11 += 4) {
                    int i12 = i11 + 1;
                    float f10 = fArr2[i12];
                    float f11 = ref$FloatRef2.f17470a;
                    fArr2[i12] = f10 + f11;
                    int i13 = i11 + 3;
                    fArr2[i13] = fArr2[i13] + f11;
                }
                ref$IntRef2.f17471a = iM26360getLengthimpl;
                ref$FloatRef2.f17470a += paragraphInfo.getParagraph().getHeight();
            }
        });
        return fArr;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i10));
    }

    public final Rect getBoundingBox(int i10) {
        requireIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i10)));
    }

    public final Rect getCursorRect(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i10)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i10, boolean z10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i10), z10);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) AbstractC8778f0.m14578x0(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i10)));
    }

    public final float getLineBottom(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i10)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i10, boolean z10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i10), z10));
    }

    public final int getLineForOffset(int i10) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 >= getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : i10 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i10)));
    }

    public final int getLineForVerticalPosition(float f10) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f10));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f10)));
    }

    public final float getLineHeight(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i10));
    }

    public final float getLineLeft(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i10));
    }

    public final float getLineRight(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i10));
    }

    public final int getLineStart(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i10)));
    }

    public final float getLineTop(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i10)));
    }

    public final float getLineWidth(int i10) {
        requireLineIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i10));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m26215getOffsetForPositionk4lQ0M(long j10) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & j10))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo26174getOffsetForPositionk4lQ0M(paragraphInfo.m26230toLocalMKHz9U(j10)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i10));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(final int i10, final int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= getAnnotatedString().getText().length())) {
            InlineClassHelperKt.throwIllegalArgumentException("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!");
        }
        if (i10 == i11) {
            return AndroidPath_androidKt.Path();
        }
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m26221findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i10, i11), new InterfaceC10570l() { // from class: androidx.compose.ui.text.MultiParagraph.getPathForRange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                Path.m24546addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i10), paragraphInfo.toLocalIndex(i11))), 0L, 2, null);
            }
        });
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m26216getRangeForRect86BmAI(Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == AbstractC8809v.m14773p(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m26228toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo26176getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM26369getZerod9O1mEE = TextRange.Companion.m26369getZerod9O1mEE();
        while (true) {
            companion = TextRange.Companion;
            if (!TextRange.m26357equalsimpl0(jM26369getZerod9O1mEE, companion.m26369getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM26369getZerod9O1mEE = ParagraphInfo.m26228toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo26176getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m26357equalsimpl0(jM26369getZerod9O1mEE, companion.m26369getZerod9O1mEE())) {
            return companion.m26369getZerod9O1mEE();
        }
        long jM26369getZerod9O1mEE2 = companion.m26369getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.Companion;
            if (!TextRange.m26357equalsimpl0(jM26369getZerod9O1mEE2, companion2.m26369getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM26369getZerod9O1mEE2 = ParagraphInfo.m26228toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo26176getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m26357equalsimpl0(jM26369getZerod9O1mEE2, companion2.m26369getZerod9O1mEE()) ? jM26369getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m26364getStartimpl(jM26369getZerod9O1mEE), TextRange.m26359getEndimpl(jM26369getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m26217getWordBoundaryjx7JFs(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC8809v.m14773p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.m26229toGlobalxdX6G0(paragraphInfo.getParagraph().mo26177getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i10)), false);
    }

    public final boolean isLineEllipsized(int i10) {
        requireLineIndexInRange(i10);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10)).getParagraph().isLineEllipsized(i10);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m26218paintLG529CI(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = list.get(i11);
            paragraphInfo.getParagraph().mo26178paintLG529CI(canvas, j10, shadow, textDecoration, drawStyle, i10);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @InterfaceC8721a
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m26219paintRPmYEkk(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            ParagraphInfo paragraphInfo = list.get(i10);
            Canvas canvas2 = canvas;
            long j11 = j10;
            paragraphInfo.getParagraph().mo26179paintRPmYEkk(canvas2, j11, shadow, textDecoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i10++;
            canvas = canvas2;
            j10 = j11;
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m26220painthn5TExg(Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        AndroidMultiParagraphDraw_androidKt.m26617drawMultiParagraph7AXcY_I(this, canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
    }

    @InterfaceC8721a
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, z10);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(multiParagraphIntrinsics, j10, i10, i11);
    }

    @InterfaceC8721a
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, AbstractC9126n abstractC9126n) {
        this(multiParagraphIntrinsics, j10, i10, z10);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11) {
        int iM26851getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i10;
        boolean z10 = true;
        if (!(Constraints.m26854getMinWidthimpl(j10) == 0 && Constraints.m26853getMinHeightimpl(j10) == 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i13);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
            if (Constraints.m26847getHasBoundedHeightimpl(j10)) {
                iM26851getMaxHeightimpl = AbstractC8323h.m13510e(Constraints.m26851getMaxHeightimpl(j10) - ParagraphKt.ceilToInt(f10), 0);
            } else {
                iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
            }
            Paragraph paragraphM26237ParagraphczeNHc = ParagraphKt.m26237ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM26852getMaxWidthimpl, 0, iM26851getMaxHeightimpl, 5, null), this.maxLines - i12, i11);
            float height = f10 + paragraphM26237ParagraphczeNHc.getHeight();
            int lineCount = i12 + paragraphM26237ParagraphczeNHc.getLineCount();
            arrayList.add(new ParagraphInfo(paragraphM26237ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, lineCount, f10, height));
            if (paragraphM26237ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i13 != AbstractC8809v.m14773p(this.intrinsics.getInfoList$ui_text_release()))) {
                i12 = lineCount;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = lineCount;
                f10 = height;
            }
        }
        z10 = false;
        this.height = f10;
        this.lineCount = i12;
        this.didExceedMaxLines = z10;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m26852getMaxWidthimpl(j10);
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Rect rect = placeholderRects.get(i15);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            AbstractC8768a0.m14481C(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC8778f0.m14529F0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(multiParagraphIntrinsics, j10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i11, (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, (AbstractC9126n) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10) {
        this(multiParagraphIntrinsics, j10, i10, z10 ? TextOverflow.Companion.m26835getEllipsisgIe3tQ8() : TextOverflow.Companion.m26834getClipgIe3tQ8(), (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10, int i11, AbstractC9126n abstractC9126n) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC8721a
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, jConstraints$default, i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 4) != 0 ? AbstractC8809v.m14771n() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, density, resourceLoader);
    }

    @InterfaceC8721a
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, f10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 32) != 0 ? AbstractC8809v.m14771n() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    @InterfaceC8721a
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, j10, density, resolver, (i11 & 32) != 0 ? AbstractC8809v.m14771n() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, (AbstractC9126n) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, j10, i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), (AbstractC9126n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, j10, density, resolver, (i12 & 32) != 0 ? AbstractC8809v.m14771n() : list, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i11, (AbstractC9126n) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, int i11) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j10, i10, i11, (AbstractC9126n) null);
    }
}
