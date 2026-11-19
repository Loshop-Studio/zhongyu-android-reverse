package androidx.compose.foundation.text;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p009ui.text.AnnotatedString;
import androidx.compose.p009ui.text.input.OffsetMapping;
import androidx.compose.p009ui.text.input.TransformedText;
import androidx.compose.p009ui.text.input.VisualTransformation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0014"}, m7880d2 = {"ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "validateOriginalToTransformed", "", "transformedOffset", "", "transformedLength", TypedValues.CycleType.S_WAVE_OFFSET, "validateTransformedToOriginal", "originalOffset", "originalLength", "filterWithValidation", "Landroidx/compose/ui/text/input/TransformedText;", "Landroidx/compose/ui/text/input/VisualTransformation;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "throwIfNotValidTransform", "limit", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nValidatingOffsetMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,135:1\n50#2,5:136\n50#2,5:141\n*S KotlinDebug\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n*L\n117#1:136,5\n129#1:141,5\n*E\n"})
/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(transformedTextFilter, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    @VisibleForTesting
    public static final void throwIfNotValidTransform(TransformedText transformedText, int i6, int i7) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i6, i7);
        for (int i8 = 0; i8 < iMin; i8++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i8), length, i8);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i6), length, i6);
        int iMin2 = Math.min(length, i7);
        for (int i9 = 0; i9 < iMin2; i9++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i9), i6, i9);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i6, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 100;
        }
        throwIfNotValidTransform(transformedText, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i6, int i7, int i8) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= i7) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.originalToTransformed returned invalid mapping: " + i8 + " -> " + i6 + " is not in range of transformed text [0, " + i7 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i6, int i7, int i8) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= i7) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.transformedToOriginal returned invalid mapping: " + i8 + " -> " + i6 + " is not in range of original text [0, " + i7 + ']');
    }
}
