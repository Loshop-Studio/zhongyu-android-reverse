package androidx.compose.p014ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

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

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, AbstractC9972n abstractC9972n) {
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
    public static /* synthetic */ void m32814paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        multiParagraph.m32821paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m32815painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        multiParagraph.m32822painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
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
    public final float[] m32816fillBoundingBoxes8ffj60Q(final long j10, final float[] fArr, @IntRange(from = 0) int i10) {
        requireIndexInRange(TextRange.m32964getMinimpl(j10));
        requireIndexInRangeInclusiveEnd(TextRange.m32963getMaximpl(j10));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f23400c = i10;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        MultiParagraphKt.m32823findParagraphsByRangeSbBc2M(this.paragraphInfoList, j10, new InterfaceC9540l() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                long j11 = j10;
                float[] fArr2 = fArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m32964getMinimpl(j11) ? paragraphInfo.getStartIndex() : TextRange.m32964getMinimpl(j11)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m32963getMaximpl(j11) ? paragraphInfo.getEndIndex() : TextRange.m32963getMaximpl(j11)));
                paragraphInfo.getParagraph().mo32774fillBoundingBoxes8ffj60Q(jTextRange, fArr2, ref$IntRef2.f23400c);
                int iM32962getLengthimpl = ref$IntRef2.f23400c + (TextRange.m32962getLengthimpl(jTextRange) * 4);
                for (int i11 = ref$IntRef2.f23400c; i11 < iM32962getLengthimpl; i11 += 4) {
                    int i12 = i11 + 1;
                    float f10 = fArr2[i12];
                    float f11 = ref$FloatRef2.f23399c;
                    fArr2[i12] = f10 + f11;
                    int i13 = i11 + 3;
                    fArr2[i13] = fArr2[i13] + f11;
                }
                ref$IntRef2.f23400c = iM32962getLengthimpl;
                ref$FloatRef2.f23399c += paragraphInfo.getParagraph().getHeight();
            }
        });
        return fArr;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i10));
    }

    public final Rect getBoundingBox(int i10) {
        requireIndexInRange(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i10)));
    }

    public final Rect getCursorRect(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i10), z10);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) AbstractC10947g0.m23956y0(this.paragraphInfoList);
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 >= getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : i10 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
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
    public final int m32817getOffsetForPositionk4lQ0M(long j10) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & j10))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo32776getOffsetForPositionk4lQ0M(paragraphInfo.m32832toLocalMKHz9U(j10)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
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
        MultiParagraphKt.m32823findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i10, i11), new InterfaceC9540l() { // from class: androidx.compose.ui.text.MultiParagraph.getPathForRange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                Path.m31148addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i10), paragraphInfo.toLocalIndex(i11))), 0L, 2, null);
            }
        });
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m32818getRangeForRect86BmAI(Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == AbstractC10978w.m24138p(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m32830toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo32778getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM32971getZerod9O1mEE = TextRange.Companion.m32971getZerod9O1mEE();
        while (true) {
            companion = TextRange.Companion;
            if (!TextRange.m32959equalsimpl0(jM32971getZerod9O1mEE, companion.m32971getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM32971getZerod9O1mEE = ParagraphInfo.m32830toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo32778getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m32959equalsimpl0(jM32971getZerod9O1mEE, companion.m32971getZerod9O1mEE())) {
            return companion.m32971getZerod9O1mEE();
        }
        long jM32971getZerod9O1mEE2 = companion.m32971getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.Companion;
            if (!TextRange.m32959equalsimpl0(jM32971getZerod9O1mEE2, companion2.m32971getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM32971getZerod9O1mEE2 = ParagraphInfo.m32830toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo32778getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i10, textInclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m32959equalsimpl0(jM32971getZerod9O1mEE2, companion2.m32971getZerod9O1mEE()) ? jM32971getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m32966getStartimpl(jM32971getZerod9O1mEE), TextRange.m32961getEndimpl(jM32971getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m32819getWordBoundaryjx7JFs(int i10) {
        requireIndexInRangeInclusiveEnd(i10);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i10 == getAnnotatedString().length() ? AbstractC10978w.m24138p(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i10));
        return paragraphInfo.m32831toGlobalxdX6G0(paragraphInfo.getParagraph().mo32779getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i10)), false);
    }

    public final boolean isLineEllipsized(int i10) {
        requireLineIndexInRange(i10);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i10)).getParagraph().isLineEllipsized(i10);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m32820paintLG529CI(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = list.get(i11);
            paragraphInfo.getParagraph().mo32780paintLG529CI(canvas, j10, shadow, textDecoration, drawStyle, i10);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @InterfaceC10770a
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m32821paintRPmYEkk(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            ParagraphInfo paragraphInfo = list.get(i10);
            Canvas canvas2 = canvas;
            long j11 = j10;
            paragraphInfo.getParagraph().mo32781paintRPmYEkk(canvas2, j11, shadow, textDecoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i10++;
            canvas = canvas2;
            j10 = j11;
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m32822painthn5TExg(Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        AndroidMultiParagraphDraw_androidKt.m33219drawMultiParagraph7AXcY_I(this, canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
    }

    @InterfaceC10770a
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, z10);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(multiParagraphIntrinsics, j10, i10, i11);
    }

    @InterfaceC10770a
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, AbstractC9972n abstractC9972n) {
        this(multiParagraphIntrinsics, j10, i10, z10);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11) {
        int iM33453getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i10;
        boolean z10 = true;
        if (!(Constraints.m33456getMinWidthimpl(j10) == 0 && Constraints.m33455getMinHeightimpl(j10) == 0)) {
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
            int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
            if (Constraints.m33449getHasBoundedHeightimpl(j10)) {
                iM33453getMaxHeightimpl = AbstractC10410o.m21752e(Constraints.m33453getMaxHeightimpl(j10) - ParagraphKt.ceilToInt(f10), 0);
            } else {
                iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
            }
            Paragraph paragraphM32839ParagraphczeNHc = ParagraphKt.m32839ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM33454getMaxWidthimpl, 0, iM33453getMaxHeightimpl, 5, null), this.maxLines - i12, i11);
            float height = f10 + paragraphM32839ParagraphczeNHc.getHeight();
            int lineCount = i12 + paragraphM32839ParagraphczeNHc.getLineCount();
            arrayList.add(new ParagraphInfo(paragraphM32839ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, lineCount, f10, height));
            if (paragraphM32839ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i13 != AbstractC10978w.m24138p(this.intrinsics.getInfoList$ui_text_release()))) {
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
        this.width = Constraints.m33454getMaxWidthimpl(j10);
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
            AbstractC10937b0.m23857B(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC10947g0.m23906H0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this(multiParagraphIntrinsics, j10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i11, (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, (AbstractC9972n) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10) {
        this(multiParagraphIntrinsics, j10, i10, z10 ? TextOverflow.Companion.m33437getEllipsisgIe3tQ8() : TextOverflow.Companion.m33436getClipgIe3tQ8(), (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10, int i11, AbstractC9972n abstractC9972n) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC10770a
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, jConstraints$default, i10, z10 ? companion.m33437getEllipsisgIe3tQ8() : companion.m33436getClipgIe3tQ8(), (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 4) != 0 ? AbstractC10978w.m24136n() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, density, resourceLoader);
    }

    @InterfaceC10770a
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10 ? companion.m33437getEllipsisgIe3tQ8() : companion.m33436getClipgIe3tQ8(), (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, f10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 32) != 0 ? AbstractC10978w.m24136n() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    @InterfaceC10770a
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10 ? companion.m33437getEllipsisgIe3tQ8() : companion.m33436getClipgIe3tQ8(), (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, j10, density, resolver, (i11 & 32) != 0 ? AbstractC10978w.m24136n() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, (AbstractC9972n) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, j10, i10, z10 ? companion.m33437getEllipsisgIe3tQ8() : companion.m33436getClipgIe3tQ8(), (AbstractC9972n) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, j10, density, resolver, (i12 & 32) != 0 ? AbstractC10978w.m24136n() : list, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i11, (AbstractC9972n) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, int i11) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j10, i10, i11, (AbstractC9972n) null);
    }
}
