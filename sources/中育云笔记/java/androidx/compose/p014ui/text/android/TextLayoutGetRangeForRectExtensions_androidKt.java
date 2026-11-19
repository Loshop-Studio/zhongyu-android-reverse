package androidx.compose.p014ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.p014ui.text.android.LayoutHelper;
import androidx.compose.p014ui.text.android.selection.SegmentFinder;
import androidx.compose.p014ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.p014ui.text.android.selection.WordSegmentFinder;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float getCharacterRightBounds(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, SegmentFinder segmentFinder, InterfaceC9544p interfaceC9544p) {
        int start;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f10, f11)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.right < f11) && (!bidiRun.isRtl() || rectF.left > f10)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i13 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i13, i10, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i13;
                } else {
                    end = i13;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getEnd() - 1;
        }
        int iPreviousStartBoundary = segmentFinder.previousStartBoundary(start + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int iM21752e = AbstractC10410o.m21752e(iPreviousStartBoundary, bidiRun.getStart());
        int iM21756i = AbstractC10410o.m21756i(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iM21756i - 1, i10, fArr) : getCharacterLeftBounds(iM21752e, i10, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iM21752e, i10, fArr) : getCharacterRightBounds(iM21756i - 1, i10, fArr);
            if (((Boolean) interfaceC9544p.invoke(rectF2, rectF)).booleanValue()) {
                return iM21756i;
            }
            iM21756i = segmentFinder.previousEndBoundary(iM21756i);
            if (iM21756i == -1 || iM21756i <= bidiRun.getStart()) {
                break;
            }
            iM21752e = AbstractC10410o.m21752e(segmentFinder.previousStartBoundary(iM21756i), bidiRun.getStart());
        }
        return -1;
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i10, InterfaceC9544p interfaceC9544p) {
        int i11;
        SegmentFinder wordSegmentFinder = i10 == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i12 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i12, rectF, wordSegmentFinder, interfaceC9544p, true);
        while (true) {
            i11 = i12;
            if (startOrEndOffsetForRectWithinLine != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i12, rectF, wordSegmentFinder, interfaceC9544p, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, interfaceC9544p, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i13, rectF, wordSegmentFinder, interfaceC9544p, false);
            lineForVertical2 = i13;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, SegmentFinder segmentFinder, InterfaceC9544p interfaceC9544p) {
        int start;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f10, f11)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f10) && (!bidiRun.isRtl() || rectF.right < f11)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i13 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i13, i10, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i13;
                } else {
                    end = i13;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getStart();
        }
        int iNextEndBoundary = segmentFinder.nextEndBoundary(start);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iM21752e = AbstractC10410o.m21752e(iPreviousStartBoundary, bidiRun.getStart());
        int iM21756i = AbstractC10410o.m21756i(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iM21756i - 1, i10, fArr) : getCharacterLeftBounds(iM21752e, i10, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iM21752e, i10, fArr) : getCharacterRightBounds(iM21756i - 1, i10, fArr);
            if (((Boolean) interfaceC9544p.invoke(rectF2, rectF)).booleanValue()) {
                return iM21752e;
            }
            iM21752e = segmentFinder.nextStartBoundary(iM21752e);
            if (iM21752e == -1 || iM21752e >= bidiRun.getEnd()) {
                break;
            }
            iM21756i = AbstractC10410o.m21756i(segmentFinder.nextEndBoundary(iM21752e), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i10, RectF rectF, SegmentFinder segmentFinder, InterfaceC9544p interfaceC9544p, boolean z10) {
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        textLayout.fillLineHorizontalBounds$ui_text_release(i10, fArr);
        LayoutHelper.BidiRun[] lineBidiRuns$ui_text_release = layoutHelper.getLineBidiRuns$ui_text_release(i10);
        C10403h c10403hM24110w0 = z10 ? AbstractC10968r.m24110w0(lineBidiRuns$ui_text_release) : AbstractC10410o.m21765r(AbstractC10968r.m24041A0(lineBidiRuns$ui_text_release), 0);
        int iM21733b = c10403hM24110w0.m21733b();
        int iM21734c = c10403hM24110w0.m21734c();
        int iM21735d = c10403hM24110w0.m21735d();
        if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
            int i11 = iM21733b;
            while (true) {
                LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text_release[i11];
                float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                int startOffsetForRectWithinRun = z10 ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC9544p) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC9544p);
                if (startOffsetForRectWithinRun < 0) {
                    if (i11 == iM21734c) {
                        break;
                    }
                    i11 += iM21735d;
                } else {
                    return startOffsetForRectWithinRun;
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }
}
