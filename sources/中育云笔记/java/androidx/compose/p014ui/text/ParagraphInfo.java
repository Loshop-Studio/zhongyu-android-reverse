package androidx.compose.p014ui.text;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;

    /* renamed from: top, reason: collision with root package name */
    private float f28520top;

    public ParagraphInfo(Paragraph paragraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.paragraph = paragraph;
        this.startIndex = i10;
        this.endIndex = i11;
        this.startLineIndex = i12;
        this.endLineIndex = i13;
        this.f28520top = f10;
        this.bottom = f11;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i10, int i11, int i12, int i13, float f10, float f11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i14 & 2) != 0) {
            i10 = paragraphInfo.startIndex;
        }
        if ((i14 & 4) != 0) {
            i11 = paragraphInfo.endIndex;
        }
        if ((i14 & 8) != 0) {
            i12 = paragraphInfo.startLineIndex;
        }
        if ((i14 & 16) != 0) {
            i13 = paragraphInfo.endLineIndex;
        }
        if ((i14 & 32) != 0) {
            f10 = paragraphInfo.f28520top;
        }
        if ((i14 & 64) != 0) {
            f11 = paragraphInfo.bottom;
        }
        float f12 = f10;
        float f13 = f11;
        int i15 = i13;
        int i16 = i11;
        return paragraphInfo.copy(paragraph, i10, i16, i12, i15, f12, f13);
    }

    /* renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m32830toGlobalxdX6G0$default(ParagraphInfo paragraphInfo, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return paragraphInfo.m32831toGlobalxdX6G0(j10, z10);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.f28520top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        return new ParagraphInfo(paragraph, i10, i11, i12, i13, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return AbstractC9979u.m20289b(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.f28520top, paragraphInfo.f28520top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.f28520top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.f28520top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void setBottom(float f10) {
        this.bottom = f10;
    }

    public final void setEndLineIndex(int i10) {
        this.endLineIndex = i10;
    }

    public final void setStartLineIndex(int i10) {
        this.startLineIndex = i10;
    }

    public final void setTop(float f10) {
        this.f28520top = f10;
    }

    public final Rect toGlobal(Rect rect) {
        float f10 = this.f28520top;
        return rect.m30674translatek4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m32831toGlobalxdX6G0(long j10, boolean z10) {
        if (z10) {
            TextRange.Companion companion = TextRange.Companion;
            if (TextRange.m32959equalsimpl0(j10, companion.m32971getZerod9O1mEE())) {
                return companion.m32971getZerod9O1mEE();
            }
        }
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m32966getStartimpl(j10)), toGlobalIndex(TextRange.m32961getEndimpl(j10)));
    }

    public final int toGlobalIndex(int i10) {
        return i10 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i10) {
        return i10 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f10) {
        return f10 + this.f28520top;
    }

    public final Rect toLocal(Rect rect) {
        float f10 = -this.f28520top;
        return rect.m30674translatek4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m32832toLocalMKHz9U(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - this.f28520top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int toLocalIndex(int i10) {
        return AbstractC10410o.m21761n(i10, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i10) {
        return i10 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f10) {
        return f10 - this.f28520top;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.f28520top + ", bottom=" + this.bottom + ')';
    }

    public final Path toGlobal(Path path) {
        float f10 = this.f28520top;
        path.mo30773translatek4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i10, int i11, int i12, int i13, float f10, float f11, int i14, AbstractC9972n abstractC9972n) {
        this(paragraph, i10, i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? -1 : i13, (i14 & 32) != 0 ? -1.0f : f10, (i14 & 64) != 0 ? -1.0f : f11);
    }
}
