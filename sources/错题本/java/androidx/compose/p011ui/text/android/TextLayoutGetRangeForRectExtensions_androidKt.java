package androidx.compose.p011ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.p011ui.text.android.LayoutHelper;
import androidx.compose.p011ui.text.android.selection.SegmentFinder;
import androidx.compose.p011ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.p011ui.text.android.selection.WordSegmentFinder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;
import p200x6.C6754d;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, m5110d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "Landroid/text/Layout;", "layout", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "getRangeForRect", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/Layout;Landroidx/compose/ui/text/android/LayoutHelper;Landroid/graphics/RectF;ILr6/e;)[I", "lineIndex", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "segmentFinder", "getStart", "getStartOrEndOffsetForRectWithinLine", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/Layout;Landroidx/compose/ui/text/android/LayoutHelper;ILandroid/graphics/RectF;Landroidx/compose/ui/text/android/selection/SegmentFinder;Lr6/e;Z)I", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "getStartOffsetForRectWithinRun", "(Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;Landroid/graphics/RectF;IIIFF[FLandroidx/compose/ui/text/android/selection/SegmentFinder;Lr6/e;)I", "getEndOffsetForRectWithinRun", TypedValues.CycleType.S_WAVE_OFFSET, "getCharacterLeftBounds", "(II[F)F", "getCharacterRightBounds", "left", "right", "horizontalOverlap", "(Landroid/graphics/RectF;FF)Z", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i, int i8, float[] fArr) {
        return fArr[(i - i8) * 2];
    }

    private static final float getCharacterRightBounds(int i, int i8, float[] fArr) {
        return fArr[((i - i8) * 2) + 1];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i8, int i9, float f, float f7, float[] fArr, SegmentFinder segmentFinder, InterfaceC6473e interfaceC6473e) {
        int start;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f, f7)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.right < f7) && (!bidiRun.isRtl() || rectF.left > f)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i10 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i10, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i10;
                } else {
                    end = i10;
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
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (iNextEndBoundary > end2) {
            iNextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i8, 0.0f, i9);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) interfaceC6473e.invoke(rectF2, rectF)).booleanValue()) {
                return iNextEndBoundary;
            }
            iNextEndBoundary = segmentFinder.previousEndBoundary(iNextEndBoundary);
            if (iNextEndBoundary == -1 || iNextEndBoundary <= bidiRun.getStart()) {
                break;
            }
            int iPreviousStartBoundary2 = segmentFinder.previousStartBoundary(iNextEndBoundary);
            int start3 = bidiRun.getStart();
            iPreviousStartBoundary = iPreviousStartBoundary2 < start3 ? start3 : iPreviousStartBoundary2;
        }
        return -1;
    }

    @Nullable
    public static final int[] getRangeForRect(@NotNull TextLayout textLayout, @NotNull Layout layout, @NotNull LayoutHelper layoutHelper, @NotNull RectF rectF, int i, @NotNull InterfaceC6473e interfaceC6473e) {
        int i8;
        SegmentFinder wordSegmentFinder = i == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i9 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i9, rectF, wordSegmentFinder, interfaceC6473e, true);
        while (true) {
            i8 = i9;
            if (startOrEndOffsetForRectWithinLine != -1 || i8 >= lineForVertical2) {
                break;
            }
            i9 = i8 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i9, rectF, wordSegmentFinder, interfaceC6473e, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, interfaceC6473e, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i8 < lineForVertical2) {
            int i10 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i10, rectF, wordSegmentFinder, interfaceC6473e, false);
            lineForVertical2 = i10;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i8, int i9, float f, float f7, float[] fArr, SegmentFinder segmentFinder, InterfaceC6473e interfaceC6473e) {
        int start;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f, f7)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f) && (!bidiRun.isRtl() || rectF.right < f7)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i10 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i10, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i10;
                } else {
                    end = i10;
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
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (iNextEndBoundary > end2) {
            iNextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i8, 0.0f, i9);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) interfaceC6473e.invoke(rectF2, rectF)).booleanValue()) {
                return iPreviousStartBoundary;
            }
            iPreviousStartBoundary = segmentFinder.nextStartBoundary(iPreviousStartBoundary);
            if (iPreviousStartBoundary == -1 || iPreviousStartBoundary >= bidiRun.getEnd()) {
                break;
            }
            int iNextEndBoundary2 = segmentFinder.nextEndBoundary(iPreviousStartBoundary);
            int end3 = bidiRun.getEnd();
            iNextEndBoundary = iNextEndBoundary2 > end3 ? end3 : iNextEndBoundary2;
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i, RectF rectF, SegmentFinder segmentFinder, InterfaceC6473e interfaceC6473e, boolean z8) {
        C6754d c6754d;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart != lineEnd) {
            float[] fArr = new float[(lineEnd - lineStart) * 2];
            textLayout.fillLineHorizontalBounds$ui_text_release(i, fArr);
            LayoutHelper.BidiRun[] lineBidiRuns$ui_text_release = layoutHelper.getLineBidiRuns$ui_text_release(i);
            if (z8) {
                AbstractC5830k.m5330g(lineBidiRuns$ui_text_release, "<this>");
                c6754d = new C6756f(0, lineBidiRuns$ui_text_release.length - 1, 1);
            } else {
                c6754d = new C6754d(AbstractC5802q.m5194U(lineBidiRuns$ui_text_release), 0, -1);
            }
            int i8 = c6754d.f11420a;
            int i9 = c6754d.f11421b;
            int i10 = c6754d.f11422c;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                int i11 = i8;
                while (true) {
                    LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text_release[i11];
                    float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                    float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                    int startOffsetForRectWithinRun = z8 ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC6473e) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, interfaceC6473e);
                    if (startOffsetForRectWithinRun < 0) {
                        if (i11 == i9) {
                            break;
                        }
                        i11 += i10;
                    } else {
                        return startOffsetForRectWithinRun;
                    }
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f, float f7) {
        return f7 >= rectF.left && f <= rectF.right;
    }
}
