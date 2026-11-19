package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {
    public static final int $stable = 8;
    private int batchDepth;
    private final MutableVector<InterfaceC9540l> editCommands = new MutableVector<>(new InterfaceC9540l[16], 0);
    private final TransformedTextFieldState transformedTextFieldState;

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.transformedTextFieldState = transformedTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        this.batchDepth++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(InterfaceC9540l interfaceC9540l) {
        beginBatchEdit();
        this.editCommands.add(interfaceC9540l);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && this.editCommands.getSize() != 0) {
            TransformedTextFieldState transformedTextFieldState = this.transformedTextFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
            TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
            MutableVector<InterfaceC9540l> mutableVector = this.editCommands;
            InterfaceC9540l[] interfaceC9540lArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                interfaceC9540lArr[i11].invoke(mainBuffer$foundation_release);
            }
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
            textFieldState.commitEditAsUser(inputTransformation, false, textFieldEditUndoBehavior);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo27975mapFromTransformedGEjPoXI(long j10) {
        return this.transformedTextFieldState.m28081mapFromTransformedGEjPoXI(j10);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo27976mapToTransformedGEjPoXI(long j10) {
        return this.transformedTextFieldState.m28083mapToTransformedGEjPoXI(j10);
    }
}
