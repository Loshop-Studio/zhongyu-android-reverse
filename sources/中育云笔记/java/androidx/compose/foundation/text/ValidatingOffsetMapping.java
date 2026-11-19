package androidx.compose.foundation.text;

import androidx.compose.p014ui.text.input.OffsetMapping;

/* loaded from: classes.dex */
final class ValidatingOffsetMapping implements OffsetMapping {
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i10, int i11) {
        this.delegate = offsetMapping;
        this.originalLength = i10;
        this.transformedLength = i11;
    }

    @Override // androidx.compose.p014ui.text.input.OffsetMapping
    public int originalToTransformed(int i10) {
        int iOriginalToTransformed = this.delegate.originalToTransformed(i10);
        if (i10 >= 0 && i10 <= this.originalLength) {
            ValidatingOffsetMappingKt.validateOriginalToTransformed(iOriginalToTransformed, this.transformedLength, i10);
        }
        return iOriginalToTransformed;
    }

    @Override // androidx.compose.p014ui.text.input.OffsetMapping
    public int transformedToOriginal(int i10) {
        int iTransformedToOriginal = this.delegate.transformedToOriginal(i10);
        if (i10 >= 0 && i10 <= this.transformedLength) {
            ValidatingOffsetMappingKt.validateTransformedToOriginal(iTransformedToOriginal, this.originalLength, i10);
        }
        return iTransformedToOriginal;
    }
}
