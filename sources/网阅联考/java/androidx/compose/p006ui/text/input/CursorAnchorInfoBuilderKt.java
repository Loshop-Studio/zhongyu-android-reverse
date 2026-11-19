package androidx.compose.p006ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, m5175d2 = {"build", "Landroid/view/inputmethod/CursorAnchorInfo;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "matrix", "Landroid/graphics/Matrix;", "setInsertionMarker", "selectionStart", "", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilderKt {
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, Matrix matrix) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iM11075getMinimpl = TextRange.m11075getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM11075getMinimpl, TextRange.m11074getMaximpl(textFieldValue.getSelection()));
        setInsertionMarker(builder, iM11075getMinimpl, textLayoutResult);
        TextRange composition = textFieldValue.getComposition();
        int iM11075getMinimpl2 = composition != null ? TextRange.m11075getMinimpl(composition.getPackedValue()) : -1;
        TextRange composition2 = textFieldValue.getComposition();
        int iM11074getMaximpl = composition2 != null ? TextRange.m11074getMaximpl(composition2.getPackedValue()) : -1;
        boolean z3 = false;
        if (iM11075getMinimpl2 >= 0 && iM11075getMinimpl2 < iM11074getMaximpl) {
            z3 = true;
        }
        if (z3) {
            builder.setComposingText(iM11075getMinimpl2, textFieldValue.getText().subSequence(iM11075getMinimpl2, iM11074getMaximpl));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i4, TextLayoutResult textLayoutResult) {
        if (i4 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i4);
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), textLayoutResult.getBidiRunDirection(i4) == ResolvedTextDirection.Rtl ? 4 : 0);
        return builder;
    }
}
