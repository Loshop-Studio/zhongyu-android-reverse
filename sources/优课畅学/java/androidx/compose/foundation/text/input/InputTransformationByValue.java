package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {
    private final InterfaceC10574p transformation;

    public InputTransformationByValue(InterfaceC10574p interfaceC10574p) {
        this.transformation = interfaceC10574p;
    }

    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10574p = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(interfaceC10574p);
    }

    public final InterfaceC10574p component1() {
        return this.transformation;
    }

    public final InputTransformationByValue copy(InterfaceC10574p interfaceC10574p) {
        return new InputTransformationByValue(interfaceC10574p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && AbstractC9133u.m16128b(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    public final InterfaceC10574p getTransformation() {
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
        TextFieldCharSequence textFieldCharSequenceM21334toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m21334toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, null, null, 7, null);
        CharSequence charSequence = (CharSequence) this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation_release(), textFieldCharSequenceM21334toTextFieldCharSequenceI88jaVs$foundation_release$default);
        if (charSequence == textFieldCharSequenceM21334toTextFieldCharSequenceI88jaVs$foundation_release$default) {
            return;
        }
        if (charSequence == textFieldBuffer.getOriginalValue$foundation_release()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(charSequence);
        }
    }
}
