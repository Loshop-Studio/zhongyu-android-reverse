package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    @Stable
    public static final CodepointTransformation mask(CodepointTransformation.Companion companion, char c10) {
        return new MaskCodepointTransformation(c10);
    }

    public static final CharSequence toVisualText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < textFieldCharSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i10);
            int iTransform = codepointTransformation.transform(i11, iCodePointAt);
            int iCharCount = CodepointHelpers_jvmKt.charCount(iCodePointAt);
            if (iTransform != iCodePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + iCharCount, CodepointHelpers_jvmKt.charCount(iTransform));
                z10 = true;
            }
            StringHelpers_jvmKt.appendCodePointX(sb, iTransform);
            i10 += iCharCount;
            i11++;
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return z10 ? string : textFieldCharSequence;
    }
}
