package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {
    private final InterfaceC9544p transformation;

    public InputTransformationByValue(InterfaceC9544p interfaceC9544p) {
        this.transformation = interfaceC9544p;
    }

    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9544p = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(interfaceC9544p);
    }

    public final InterfaceC9544p component1() {
        return this.transformation;
    }

    public final InputTransformationByValue copy(InterfaceC9544p interfaceC9544p) {
        return new InputTransformationByValue(interfaceC9544p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && AbstractC9979u.m20289b(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    public final InterfaceC9544p getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, null, null, 7, null);
        CharSequence charSequence = (CharSequence) this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation_release(), textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default);
        if (charSequence == textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default) {
            return;
        }
        if (charSequence == textFieldBuffer.getOriginalValue$foundation_release()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(charSequence);
        }
    }
}
