package androidx.compose.p013ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.p013ui.text.android.LayoutHelper;
import androidx.compose.p013ui.text.android.selection.SegmentFinder;
import androidx.compose.p013ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.p013ui.text.android.selection.WordSegmentFinder;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float getCharacterRightBounds(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, SegmentFinder segmentFinder, InterfaceC10574p interfaceC10574p) {
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
        int iM13510e = AbstractC8323h.m13510e(iPreviousStartBoundary, bidiRun.getStart());
        int iM13513h = AbstractC8323h.m13513h(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iM13513h - 1, i10, fArr) : getCharacterLeftBounds(iM13510e, i10, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iM13510e, i10, fArr) : getCharacterRightBounds(iM13513h - 1, i10, fArr);
            if (((Boolean) interfaceC10574p.invoke(rectF2, rectF)).booleanValue()) {
                return iM13513h;
            }
            iM13513h = segmentFinder.previousEndBoundary(iM13513h);
            if (iM13513h == -1 || iM13513h <= bidiRun.getStart()) {
                break;
            }
            iM13510e = AbstractC8323h.m13510e(segmentFinder.previousStartBoundary(iM13513h), bidiRun.getStart());
        }
        return -1;
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i10, InterfaceC10574p interfaceC10574p) {
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
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i12, rectF, wordSegmentFinder, interfaceC10574p, true);
        while (true) {
            i11 = i12;
            if (startOrEndOffsetForRectWithinLine != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i12, rectF, wordSegmentFinder, interfaceC10574p, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, interfaceC10574p, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i13, rectF, wordSegmentFinder, interfaceC10574p, false);
            lineForVertical2 = i13;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, SegmentFinder segmentFinder, InterfaceC10574p interfaceC10574p) {
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
        int iM13510e = AbstractC8323h.m13510e(iPreviousStartBoundary, bidiRun.getStart());
        int iM13513h = AbstractC8323h.m13513h(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iM13513h - 1, i10, fArr) : getCharacterLeftBounds(iM13510e, i10, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iM13510e, i10, fArr) : getCharacterRightBounds(iM13513h - 1, i10, fArr);
            if (((Boolean) interfaceC10574p.invoke(rectF2, rectF)).booleanValue()) {
                return iM13510e;
            }
            iM13510e = segmentFinder.nextStartBoundary(iM13510e);
            if (iM13510e == -1 || iM13510e >= bidiRun.getEnd()) {
                break;
            }
            iM13513h = AbstractC8323h.m13513h(segmentFinder.nextEndBoundary(iM13510e), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i10, RectF rectF, SegmentFinder segmentFinder, InterfaceC10574p interfaceC10574p, boolean z10) {
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
        C8319d c8319dM14741x0 = z10 ? AbstractC8801r.m14741x0(lineBidiRuns$ui_text_release) : AbstractC8323h.m13522q(AbstractC8801r.m14668B0(lineBidiRuns$ui_text_release), 0);
        int iM13496b = c8319dM14741x0.m13496b();
        int iM13497c = c8319dM14741x0.m13497c();
        int iM13498d = c8319dM14741x0.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            int i11 = iM13496b;
            while (true) {
                LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text_release[i11];
                float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                int startOffsetForRectWithinRun = z10 ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC10574p) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC10574p);
                if (startOffsetForRectWithinRun < 0) {
                    if (i11 == iM13497c) {
                        break;
                    }
                    i11 += iM13498d;
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
