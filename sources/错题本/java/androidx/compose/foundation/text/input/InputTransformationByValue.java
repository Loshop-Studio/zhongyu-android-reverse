package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B?\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u000028\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dRG\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013¨\u0006 "}, m5110d2 = {"Landroidx/compose/foundation/text/input/InputTransformationByValue;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "current", "proposed", "transformation", "<init>", "(Lr6/e;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ld6/s;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lr6/e;", "copy", "(Lr6/e;)Landroidx/compose/foundation/text/input/InputTransformationByValue;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr6/e;", "getTransformation", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class InputTransformationByValue implements InputTransformation {

    @NotNull
    private final InterfaceC6473e transformation;

    public InputTransformationByValue(@NotNull InterfaceC6473e interfaceC6473e) {
        this.transformation = interfaceC6473e;
    }

    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6473e = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(interfaceC6473e);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6473e getTransformation() {
        return this.transformation;
    }

    @NotNull
    public final InputTransformationByValue copy(@NotNull InterfaceC6473e transformation) {
        return new InputTransformationByValue(transformation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputTransformationByValue) && AbstractC5830k.m5325b(this.transformation, ((InputTransformationByValue) other).transformation);
    }

    @NotNull
    public final InterfaceC6473e getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    @NotNull
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@NotNull TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence textFieldCharSequenceM7740toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m7740toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, null, null, 7, null);
        CharSequence charSequence = (CharSequence) this.transformation.invoke(textFieldBuffer.getOriginalValue(), textFieldCharSequenceM7740toTextFieldCharSequenceI88jaVs$foundation_release$default);
        if (charSequence == textFieldCharSequenceM7740toTextFieldCharSequenceI88jaVs$foundation_release$default) {
            return;
        }
        if (charSequence == textFieldBuffer.getOriginalValue()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(charSequence);
        }
    }
}
