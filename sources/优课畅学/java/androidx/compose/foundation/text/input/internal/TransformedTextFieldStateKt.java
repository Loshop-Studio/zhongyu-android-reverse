package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.text.TextRange;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i10, InterfaceC10575q interfaceC10575q) {
        long jM21478mapFromTransformedjx7JFs = transformedTextFieldState.m21478mapFromTransformedjx7JFs(i10);
        long jM21481mapToTransformedGEjPoXI = transformedTextFieldState.m21481mapToTransformedGEjPoXI(jM21478mapFromTransformedjx7JFs);
        return (R) interfaceC10575q.invoke((TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) && TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? (!TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m26352boximpl(jM21478mapFromTransformedjx7JFs), TextRange.m26352boximpl(jM21481mapToTransformedGEjPoXI));
    }
}
