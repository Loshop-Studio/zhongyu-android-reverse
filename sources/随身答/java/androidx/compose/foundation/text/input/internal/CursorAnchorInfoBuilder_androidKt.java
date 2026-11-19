package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001ax\u0010\t\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m13413d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "build-vxqZcH0", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "setInsertionMarker", "selectionStart", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n54#2:156\n85#3:157\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoBuilder_androidKt\n*L\n100#1:156\n100#1:157\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, androidx.compose.p012ui.text.TextLayoutResult r17, androidx.compose.p012ui.geometry.Rect r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            androidx.compose.ui.text.MultiParagraph r3 = r17.getMultiParagraph()
            long r4 = androidx.compose.p012ui.text.TextRangeKt.TextRange(r15, r16)
            r6 = 0
            r3.m23310fillBoundingBoxes8ffj60Q(r4, r2, r6)
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
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = androidx.compose.p012ui.text.style.ResolvedTextDirection.Rtl
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
    public static final CursorAnchorInfo m18615buildvxqZcH0(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j9, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z9, boolean z10, boolean z11, boolean z12) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM23458getMinimpl = TextRange.m23458getMinimpl(j9);
        builder.setSelectionRange(iM23458getMinimpl, TextRange.m23457getMaximpl(j9));
        if (z9) {
            setInsertionMarker(builder, iM23458getMinimpl, textLayoutResult, rect);
        }
        if (z10) {
            int iM23458getMinimpl2 = textRange != null ? TextRange.m23458getMinimpl(textRange.getPackedValue()) : -1;
            int iM23457getMaximpl = textRange != null ? TextRange.m23457getMaximpl(textRange.getPackedValue()) : -1;
            if (iM23458getMinimpl2 >= 0 && iM23458getMinimpl2 < iM23457getMaximpl) {
                builder.setComposingText(iM23458getMinimpl2, charSequence.subSequence(iM23458getMinimpl2, iM23457getMaximpl));
                addCharacterBounds(builder, iM23458getMinimpl2, iM23457getMaximpl, textLayoutResult, rect);
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z11) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i9 >= 34 && z12) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    /* renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m18616buildvxqZcH0$default(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j9, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z9, boolean z10, boolean z11, boolean z12, int i9, Object obj) {
        if ((i9 & 128) != 0) {
            z9 = true;
        }
        if ((i9 & 256) != 0) {
            z10 = true;
        }
        if ((i9 & 512) != 0) {
            z11 = true;
        }
        if ((i9 & 1024) != 0) {
            z12 = true;
        }
        return m18615buildvxqZcH0(builder, charSequence, j9, textRange, textLayoutResult, matrix, rect, rect2, z9, z10, z11, z12);
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i9, TextLayoutResult textLayoutResult, Rect rect) {
        if (i9 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i9);
        float fCoerceIn = RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zContainsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fCoerceIn, cursorRect.getTop());
        boolean zContainsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fCoerceIn, cursorRect.getBottom());
        boolean z9 = textLayoutResult.getBidiRunDirection(i9) == ResolvedTextDirection.Rtl;
        int i10 = (zContainsInclusive || zContainsInclusive2) ? 1 : 0;
        if (!zContainsInclusive || !zContainsInclusive2) {
            i10 |= 2;
        }
        if (z9) {
            i10 |= 4;
        }
        builder.setInsertionMarkerLocation(fCoerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i10);
        return builder;
    }
}
