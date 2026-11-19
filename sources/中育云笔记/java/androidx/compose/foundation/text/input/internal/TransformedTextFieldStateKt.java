package androidx.compose.foundation.text.input.internal;

import androidx.compose.p014ui.text.TextRange;
import p181hd.InterfaceC9545q;

/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i10, InterfaceC9545q interfaceC9545q) {
        long jM28080mapFromTransformedjx7JFs = transformedTextFieldState.m28080mapFromTransformedjx7JFs(i10);
        long jM28083mapToTransformedGEjPoXI = transformedTextFieldState.m28083mapToTransformedGEjPoXI(jM28080mapFromTransformedjx7JFs);
        return (R) interfaceC9545q.invoke((TextRange.m32960getCollapsedimpl(jM28080mapFromTransformedjx7JFs) && TextRange.m32960getCollapsedimpl(jM28083mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m32960getCollapsedimpl(jM28080mapFromTransformedjx7JFs) || TextRange.m32960getCollapsedimpl(jM28083mapToTransformedGEjPoXI)) ? (!TextRange.m32960getCollapsedimpl(jM28080mapFromTransformedjx7JFs) || TextRange.m32960getCollapsedimpl(jM28083mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m32954boximpl(jM28080mapFromTransformedjx7JFs), TextRange.m32954boximpl(jM28083mapToTransformedGEjPoXI));
    }
}
