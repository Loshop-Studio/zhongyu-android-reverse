package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes.dex */
final class MaxLengthFilter implements InputTransformation {
    private final int maxLength;

    public MaxLengthFilter(int i10) {
        this.maxLength = i10;
        if (i10 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    private final int component1() {
        return this.maxLength;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = maxLengthFilter.maxLength;
        }
        return maxLengthFilter.copy(i10);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, this.maxLength);
    }

    public final MaxLengthFilter copy(int i10) {
        return new MaxLengthFilter(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) obj).maxLength;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLength);
    }

    public String toString() {
        return "InputTransformation.maxLength(" + this.maxLength + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getLength() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
