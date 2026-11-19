package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import p077d8.AbstractC8323h;

/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, androidx.compose.p013ui.text.TextLayoutResult r17, androidx.compose.p013ui.geometry.Rect r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            androidx.compose.ui.text.MultiParagraph r3 = r17.getMultiParagraph()
            long r4 = androidx.compose.p013ui.text.TextRangeKt.TextRange(r15, r16)
            r6 = 0
            r3.m26214fillBoundingBoxes8ffj60Q(r4, r2, r6)
            r8 = r15
        L17:
            if (r8 >= r0) goto L79
            int r3 = r8 - r15
            int r3 = r3 * 4
            androidx.compose.ui.geometry.Rect r4 = new androidx.compose.ui.geometry.Rect
            r5 = r2[r3]
            int r6 = r3 + 1
            r6 = r2[r6]
            int r7 = r3 + 2
            r7 = r2[r7]
            int r3 = r3 + 3
            r3 = r2[r3]
            r4.<init>(r5, r6, r7, r3)
            boolean r3 = r1.overlaps(r4)
            float r5 = r4.getLeft()
            float r6 = r4.getTop()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 == 0) goto L54
            float r5 = r4.getRight()
            float r6 = r4.getBottom()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 != 0) goto L51
            goto L54
        L51:
            r5 = r17
            goto L57
        L54:
            r3 = r3 | 2
            goto L51
        L57:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r5.getBidiRunDirection(r8)
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = androidx.compose.p013ui.text.style.ResolvedTextDirection.Rtl
            if (r6 != r7) goto L61
            r3 = r3 | 4
        L61:
            r13 = r3
            float r9 = r4.getLeft()
            float r10 = r4.getTop()
            float r11 = r4.getRight()
            float r12 = r4.getBottom()
            r7 = r14
            r7.addCharacterBounds(r8, r9, r10, r11, r12, r13)
            int r8 = r8 + 1
            goto L17
        L79:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    /* renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m21385buildvxqZcH0(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j10, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM26362getMinimpl = TextRange.m26362getMinimpl(j10);
        builder.setSelectionRange(iM26362getMinimpl, TextRange.m26361getMaximpl(j10));
        if (z10) {
            setInsertionMarker(builder, iM26362getMinimpl, textLayoutResult, rect);
        }
        if (z11) {
            int iM26362getMinimpl2 = textRange != null ? TextRange.m26362getMinimpl(textRange.m26368unboximpl()) : -1;
            int iM26361getMaximpl = textRange != null ? TextRange.m26361getMaximpl(textRange.m26368unboximpl()) : -1;
            if (iM26362getMinimpl2 >= 0 && iM26362getMinimpl2 < iM26361getMaximpl) {
                builder.setComposingText(iM26362getMinimpl2, charSequence.subSequence(iM26362getMinimpl2, iM26361getMaximpl));
                addCharacterBounds(builder, iM26362getMinimpl2, iM26361getMaximpl, textLayoutResult, rect);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i10 >= 34 && z13) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    /* renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m21386buildvxqZcH0$default(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j10, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 128) != 0) {
            z10 = true;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            z12 = true;
        }
        if ((i10 & 1024) != 0) {
            z13 = true;
        }
        return m21385buildvxqZcH0(builder, charSequence, j10, textRange, textLayoutResult, matrix, rect, rect2, z10, z11, z12, z13);
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i10, TextLayoutResult textLayoutResult, Rect rect) {
        if (i10 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i10);
        float fM13517l = AbstractC8323h.m13517l(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m26335getSizeYbymL2g() >> 32));
        boolean zContainsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fM13517l, cursorRect.getTop());
        boolean zContainsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fM13517l, cursorRect.getBottom());
        boolean z10 = textLayoutResult.getBidiRunDirection(i10) == ResolvedTextDirection.Rtl;
        int i11 = (zContainsInclusive || zContainsInclusive2) ? 1 : 0;
        if (!zContainsInclusive || !zContainsInclusive2) {
            i11 |= 2;
        }
        if (z10) {
            i11 |= 4;
        }
        builder.setInsertionMarkerLocation(fM13517l, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i11);
        return builder;
    }
}
