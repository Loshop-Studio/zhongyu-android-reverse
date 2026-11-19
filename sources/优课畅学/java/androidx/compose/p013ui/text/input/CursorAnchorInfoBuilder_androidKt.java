package androidx.compose.p013ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import p077d8.AbstractC8323h;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.p013ui.text.input.OffsetMapping r20, androidx.compose.p013ui.text.TextLayoutResult r21, androidx.compose.p013ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.p013ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m26214fillBoundingBoxes8ffj60Q(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L8b
            int r2 = r1.originalToTransformed(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.overlaps(r7)
            float r8 = r7.getLeft()
            float r9 = r7.getTop()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 == 0) goto L64
            float r8 = r7.getRight()
            float r9 = r7.getBottom()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 != 0) goto L61
            goto L64
        L61:
            r8 = r21
            goto L67
        L64:
            r5 = r5 | 2
            goto L61
        L67:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = r8.getBidiRunDirection(r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = androidx.compose.p013ui.text.style.ResolvedTextDirection.Rtl
            if (r2 != r9) goto L71
            r5 = r5 | 4
        L71:
            r16 = r5
            float r12 = r7.getLeft()
            float r13 = r7.getTop()
            float r14 = r7.getRight()
            float r15 = r7.getBottom()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @InterfaceC8721a
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM26362getMinimpl = TextRange.m26362getMinimpl(textFieldValue.m26612getSelectiond9O1mEE());
        builder.setSelectionRange(iM26362getMinimpl, TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE()));
        if (z10) {
            setInsertionMarker(builder, iM26362getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z11) {
            TextRange textRangeM26611getCompositionMzsxiRA = textFieldValue.m26611getCompositionMzsxiRA();
            int iM26362getMinimpl2 = textRangeM26611getCompositionMzsxiRA != null ? TextRange.m26362getMinimpl(textRangeM26611getCompositionMzsxiRA.m26368unboximpl()) : -1;
            TextRange textRangeM26611getCompositionMzsxiRA2 = textFieldValue.m26611getCompositionMzsxiRA();
            int iM26361getMaximpl = textRangeM26611getCompositionMzsxiRA2 != null ? TextRange.m26361getMaximpl(textRangeM26611getCompositionMzsxiRA2.m26368unboximpl()) : -1;
            if (iM26362getMinimpl2 >= 0 && iM26362getMinimpl2 < iM26361getMaximpl) {
                builder.setComposingText(iM26362getMinimpl2, textFieldValue.getText().subSequence(iM26362getMinimpl2, iM26361getMaximpl));
                addCharacterBounds(builder, iM26362getMinimpl2, iM26361getMaximpl, offsetMapping, textLayoutResult, rect);
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

    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 64) != 0) {
            z10 = true;
        }
        if ((i10 & 128) != 0) {
            z11 = true;
        }
        if ((i10 & 256) != 0) {
            z12 = true;
        }
        if ((i10 & 512) != 0) {
            z13 = true;
        }
        return build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, z10, z11, z12, z13);
    }

    private static final boolean containsInclusive(Rect rect, float f10, float f11) {
        float left = rect.getLeft();
        if (f10 > rect.getRight() || left > f10) {
            return false;
        }
        return f11 <= rect.getBottom() && rect.getTop() <= f11;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i10, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i10 < 0) {
            return builder;
        }
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i10);
        Rect cursorRect = textLayoutResult.getCursorRect(iOriginalToTransformed);
        float fM13517l = AbstractC8323h.m13517l(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m26335getSizeYbymL2g() >> 32));
        boolean zContainsInclusive = containsInclusive(rect, fM13517l, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rect, fM13517l, cursorRect.getBottom());
        boolean z10 = textLayoutResult.getBidiRunDirection(iOriginalToTransformed) == ResolvedTextDirection.Rtl;
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
