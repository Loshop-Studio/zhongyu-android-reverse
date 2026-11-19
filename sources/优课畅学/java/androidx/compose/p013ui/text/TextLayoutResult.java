package androidx.compose.p013ui.text;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j10, AbstractC9126n abstractC9126n) {
        this(textLayoutInput, multiParagraph, j10);
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m26332copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i10 & 2) != 0) {
            j10 = textLayoutResult.size;
        }
        return textLayoutResult.m26333copyO0kMr_c(textLayoutInput, j10);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResult.getLineEnd(i10, z10);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m26333copyO0kMr_c(TextLayoutInput textLayoutInput, long j10) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return AbstractC9133u.m16128b(this.layoutInput, textLayoutResult.layoutInput) && AbstractC9133u.m16128b(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m27068equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && AbstractC9133u.m16128b(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final ResolvedTextDirection getBidiRunDirection(int i10) {
        return this.multiParagraph.getBidiRunDirection(i10);
    }

    public final Rect getBoundingBox(int i10) {
        return this.multiParagraph.getBoundingBox(i10);
    }

    public final Rect getCursorRect(int i10) {
        return this.multiParagraph.getCursorRect(i10);
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i10, boolean z10) {
        return this.multiParagraph.getHorizontalPosition(i10, z10);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBaseline(int i10) {
        return this.multiParagraph.getLineBaseline(i10);
    }

    public final float getLineBottom(int i10) {
        return this.multiParagraph.getLineBottom(i10);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i10, boolean z10) {
        return this.multiParagraph.getLineEnd(i10, z10);
    }

    public final int getLineForOffset(int i10) {
        return this.multiParagraph.getLineForOffset(i10);
    }

    public final int getLineForVerticalPosition(float f10) {
        return this.multiParagraph.getLineForVerticalPosition(f10);
    }

    public final float getLineLeft(int i10) {
        return this.multiParagraph.getLineLeft(i10);
    }

    public final float getLineRight(int i10) {
        return this.multiParagraph.getLineRight(i10);
    }

    public final int getLineStart(int i10) {
        return this.multiParagraph.getLineStart(i10);
    }

    public final float getLineTop(int i10) {
        return this.multiParagraph.getLineTop(i10);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m26334getOffsetForPositionk4lQ0M(long j10) {
        return this.multiParagraph.m26215getOffsetForPositionk4lQ0M(j10);
    }

    public final ResolvedTextDirection getParagraphDirection(int i10) {
        return this.multiParagraph.getParagraphDirection(i10);
    }

    public final Path getPathForRange(int i10, int i11) {
        return this.multiParagraph.getPathForRange(i10, i11);
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m26335getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m26336getWordBoundaryjx7JFs(int i10) {
        return this.multiParagraph.m26217getWordBoundaryjx7JFs(i10);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m27071hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i10) {
        return this.multiParagraph.isLineEllipsized(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m27073toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j10) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j10;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }
}
