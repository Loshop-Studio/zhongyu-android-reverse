package androidx.compose.foundation.text;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filterWithValidation", "(Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "originalLength", "limit", "Ld6/s;", "throwIfNotValidTransform", "(Landroidx/compose/ui/text/input/TransformedText;II)V", "originalOffset", TypedValues.CycleType.S_WAVE_OFFSET, "validateTransformedToOriginal", "(III)V", "transformedOffset", "transformedLength", "validateOriginalToTransformed", "Landroidx/compose/ui/text/input/OffsetMapping;", "ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nValidatingOffsetMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,135:1\n50#2,5:136\n50#2,5:141\n*S KotlinDebug\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n*L\n117#1:136,5\n129#1:141,5\n*E\n"})
/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {

    @NotNull
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    @NotNull
    public static final TransformedText filterWithValidation(@NotNull VisualTransformation visualTransformation, @NotNull AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(transformedTextFilter, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }

    @NotNull
    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    @VisibleForTesting
    public static final void throwIfNotValidTransform(@NotNull TransformedText transformedText, int i, int i8) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i, i8);
        for (int i9 = 0; i9 < iMin; i9++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i9), length, i9);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i), length, i);
        int iMin2 = Math.min(length, i8);
        for (int i10 = 0; i10 < iMin2; i10++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i10), i, i10);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 100;
        }
        throwIfNotValidTransform(transformedText, i, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i, int i8, int i9) {
        boolean z8 = false;
        if (i >= 0 && i <= i8) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM99x = AbstractC0037f.m99x("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", i9, " is not in range of transformed text [0, ", i);
        sbM99x.append(i8);
        sbM99x.append(']');
        InlineClassHelperKt.throwIllegalStateException(sbM99x.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i, int i8, int i9) {
        boolean z8 = false;
        if (i >= 0 && i <= i8) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM99x = AbstractC0037f.m99x("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", i9, " is not in range of original text [0, ", i);
        sbM99x.append(i8);
        sbM99x.append(']');
        InlineClassHelperKt.throwIllegalStateException(sbM99x.toString());
    }
}
