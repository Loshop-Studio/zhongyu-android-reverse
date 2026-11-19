package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class FilterChain implements InputTransformation {
    private final InputTransformation first;
    private final InputTransformation second;

    public FilterChain(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.first.applySemantics(semanticsPropertyReceiver);
        this.second.applySemantics(semanticsPropertyReceiver);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return AbstractC9133u.m16128b(this.first, filterChain.first) && AbstractC9133u.m16128b(this.second, filterChain.second) && AbstractC9133u.m16128b(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public KeyboardOptions getKeyboardOptions() {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        return (keyboardOptions == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this.first.getKeyboardOptions())) == null) ? this.first.getKeyboardOptions() : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public int hashCode() {
        int iHashCode = ((this.first.hashCode() * 31) + this.second.hashCode()) * 32;
        KeyboardOptions keyboardOptions = getKeyboardOptions();
        return iHashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }

    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        this.first.transformInput(textFieldBuffer);
        this.second.transformInput(textFieldBuffer);
    }
}
