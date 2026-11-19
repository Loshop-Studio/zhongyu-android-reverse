package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a`\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022<\u0010\u000b\u001a8\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"R", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "transformedQueryIndex", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "untransformed", "retransformed", "onResult", "getIndexTransformationType", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;ILr6/f;)Ljava/lang/Object;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(@NotNull TransformedTextFieldState transformedTextFieldState, int i, @NotNull InterfaceC6474f interfaceC6474f) {
        long jM7884mapFromTransformedjx7JFs = transformedTextFieldState.m7884mapFromTransformedjx7JFs(i);
        long jM7887mapToTransformedGEjPoXI = transformedTextFieldState.m7887mapToTransformedGEjPoXI(jM7884mapFromTransformedjx7JFs);
        return (R) interfaceC6474f.invoke((TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) && TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? (!TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m12758boximpl(jM7884mapFromTransformedjx7JFs), TextRange.m12758boximpl(jM7887mapToTransformedGEjPoXI));
    }
}
