package androidx.compose.p014ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    @StabilityInferred(parameters = 1)
    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i10, int i11, boolean z10) {
            this.start = i10;
            this.end = i11;
            this.isRtl = z10;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = bidiRun.start;
            }
            if ((i12 & 2) != 0) {
                i11 = bidiRun.end;
            }
            if ((i12 & 4) != 0) {
                z10 = bidiRun.isRtl;
            }
            return bidiRun.copy(i10, i11, z10);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i10, int i11, boolean z10) {
            return new BidiRun(i10, i11, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM23128e0 = AbstractC10793c0.m23128e0(this.layout.getText(), '\n', length, false, 4, null);
            length = iM23128e0 < 0 ? this.layout.getText().length() : iM23128e0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i10, boolean z10) {
        int iM21756i = AbstractC10410o.m21756i(i10, this.layout.getLineEnd(this.layout.getLineForOffset(i10)));
        return z10 ? this.layout.getPrimaryHorizontal(iM21756i) : this.layout.getSecondaryHorizontal(iM21756i);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return layoutHelper.getParagraphForOffset(i10, z10);
    }

    private final int lineEndToVisibleEnd(int i10, int i11) {
        while (i10 > i11 && isLineEndSpace(this.layout.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r10.paragraphEnds
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.isRtlParagraph(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.tmpBuffer
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.tmpBuffer = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i10, boolean z10, boolean z11) {
        int iLineEndToVisibleEnd = i10;
        if (!z11) {
            return getDownstreamHorizontal(i10, z10);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, z11);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(i10, z10);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.layout.getText().length()) {
            return getDownstreamHorizontal(i10, z10);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, z11);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i11 = lineStart - paragraphStart;
        int i12 = iLineEndToVisibleEnd2 - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i11, i12) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z10 || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z12 = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z12 = true;
            }
            Layout layout = this.layout;
            return z12 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            bidiRunArr[i13] = new BidiRun(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i15 = -1;
        if (iLineEndToVisibleEnd == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    break;
                }
                if (bidiRunArr[i16].getStart() == iLineEndToVisibleEnd) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            BidiRun bidiRun = bidiRunArr[i15];
            if (z10 || zIsRtlParagraph == bidiRun.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            return (i15 == 0 && zIsRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i15 != AbstractC10968r.m24041A0(bidiRunArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i15 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i15 + 1].getStart()) : this.layout.getLineRight(lineForOffset);
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                break;
            }
            if (bidiRunArr[i17].getEnd() == iLineEndToVisibleEnd) {
                i15 = i17;
                break;
            }
            i17++;
        }
        BidiRun bidiRun2 = bidiRunArr[i15];
        if (!z10 && zIsRtlParagraph != bidiRun2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        return (i15 == 0 && zIsRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i15 != AbstractC10968r.m24041A0(bidiRunArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i15 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i15 + 1].getEnd()) : this.layout.getLineRight(lineForOffset);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final BidiRun[] getLineBidiRuns$ui_text_release(int i10) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(i10);
        int lineEnd = this.layout.getLineEnd(i10);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i11 = lineStart - paragraphStart;
        int i12 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(i11, i12)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = bidiCreateLineBidi.getRunStart(i13) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            bidiRunArr[i13] = new BidiRun(runStart, runLimit, z10);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int i10) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i10), this.layout.getLineStart(i10));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i10) {
        return this.paragraphEnds.get(i10).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i10, boolean z10) {
        int iM24135m = AbstractC10978w.m24135m(this.paragraphEnds, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = iM24135m < 0 ? -(iM24135m + 1) : iM24135m + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.paragraphEnds.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i10 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return (AbstractC9979u.m20296i(c10, 8192) >= 0 && AbstractC9979u.m20296i(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i10) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i10))) == -1;
    }
}
