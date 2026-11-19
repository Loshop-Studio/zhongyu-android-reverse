package androidx.compose.foundation.text;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.text.input.VisualTransformation;

/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(transformedTextFilter, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    @VisibleForTesting
    public static final void throwIfNotValidTransform(TransformedText transformedText, int i10, int i11) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i12), length, i12);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i13), i10, i13);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i10, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        throwIfNotValidTransform(transformedText, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']');
    }
}
