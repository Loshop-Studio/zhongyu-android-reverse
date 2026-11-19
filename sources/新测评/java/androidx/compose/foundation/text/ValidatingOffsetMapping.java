package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m13558d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "delegate", "originalLength", "", "transformedLength", "(Landroidx/compose/ui/text/input/OffsetMapping;II)V", "originalToTransformed", TypedValues.CycleType.S_WAVE_OFFSET, "transformedToOriginal", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
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

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    public int originalToTransformed(int offset) {
        int iOriginalToTransformed = this.delegate.originalToTransformed(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            ValidatingOffsetMappingKt.validateOriginalToTransformed(iOriginalToTransformed, this.transformedLength, offset);
        }
        return iOriginalToTransformed;
    }

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    public int transformedToOriginal(int offset) {
        int iTransformedToOriginal = this.delegate.transformedToOriginal(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            ValidatingOffsetMappingKt.validateTransformedToOriginal(iTransformedToOriginal, this.originalLength, offset);
        }
        return iTransformedToOriginal;
    }
}
