package androidx.compose.p011ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001ad\u0010\u000b\u001a\u00020\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0001\u001a\u001c\u0010\u0017\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a,\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001d"}, m5110d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "containsInclusive", "x", "", "y", "setInsertionMarker", "selectionStart", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,237:1\n54#2:238\n85#3:239\n*S KotlinDebug\n*F\n+ 1 CursorAnchorInfoBuilder.android.kt\nandroidx/compose/ui/text/input/CursorAnchorInfoBuilder_androidKt\n*L\n119#1:238\n119#1:239\n*E\n"})
/* loaded from: classes2.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.p011ui.text.input.OffsetMapping r20, androidx.compose.p011ui.text.TextLayoutResult r21, androidx.compose.p011ui.geometry.Rect r22) {
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
            long r8 = androidx.compose.p011ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m12620fillBoundingBoxes8ffj60Q(r8, r6, r5)
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
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = androidx.compose.p011ui.text.style.ResolvedTextDirection.Rtl
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this function in foundation is used by the legacy BasicTextField.")
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix, @NotNull Rect rect, @NotNull Rect rect2, boolean z8, boolean z9, boolean z10, boolean z11) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM12768getMinimpl = TextRange.m12768getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM12768getMinimpl, TextRange.m12767getMaximpl(textFieldValue.getSelection()));
        if (z8) {
            setInsertionMarker(builder, iM12768getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z9) {
            TextRange composition = textFieldValue.getComposition();
            int iM12768getMinimpl2 = composition != null ? TextRange.m12768getMinimpl(composition.getPackedValue()) : -1;
            TextRange composition2 = textFieldValue.getComposition();
            int iM12767getMaximpl = composition2 != null ? TextRange.m12767getMaximpl(composition2.getPackedValue()) : -1;
            if (iM12768getMinimpl2 >= 0 && iM12768getMinimpl2 < iM12767getMaximpl) {
                builder.setComposingText(iM12768getMinimpl2, textFieldValue.getText().subSequence(iM12768getMinimpl2, iM12767getMaximpl));
                addCharacterBounds(builder, iM12768getMinimpl2, iM12767getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z10) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i >= 34 && z11) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z8, boolean z9, boolean z10, boolean z11, int i, Object obj) {
        if ((i & 64) != 0) {
            z8 = true;
        }
        if ((i & 128) != 0) {
            z9 = true;
        }
        if ((i & 256) != 0) {
            z10 = true;
        }
        if ((i & 512) != 0) {
            z11 = true;
        }
        return build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, z8, z9, z10, z11);
    }

    private static final boolean containsInclusive(Rect rect, float f, float f7) {
        float left = rect.getLeft();
        if (f > rect.getRight() || left > f) {
            return false;
        }
        return f7 <= rect.getBottom() && rect.getTop() <= f7;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i < 0) {
            return builder;
        }
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i);
        Rect cursorRect = textLayoutResult.getCursorRect(iOriginalToTransformed);
        float fM5273l = AbstractC5806u.m5273l(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zContainsInclusive = containsInclusive(rect, fM5273l, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rect, fM5273l, cursorRect.getBottom());
        boolean z8 = textLayoutResult.getBidiRunDirection(iOriginalToTransformed) == ResolvedTextDirection.Rtl;
        int i8 = (zContainsInclusive || zContainsInclusive2) ? 1 : 0;
        if (!zContainsInclusive || !zContainsInclusive2) {
            i8 |= 2;
        }
        if (z8) {
            i8 |= 4;
        }
        builder.setInsertionMarkerLocation(fM5273l, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i8);
        return builder;
    }
}
