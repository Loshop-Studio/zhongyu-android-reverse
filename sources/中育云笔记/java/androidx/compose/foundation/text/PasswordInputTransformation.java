package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final InterfaceC9529a scheduleHide;

    public PasswordInputTransformation(InterfaceC9529a interfaceC9529a) {
        this.scheduleHide = interfaceC9529a;
    }

    private final void setRevealCodepointIndex(int i10) {
        this.revealCodepointIndex$delegate.setIntValue(i10);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    public final InterfaceC9529a getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m32962getLengthimpl(textFieldBuffer.getChanges().mo27944getRangejx7JFs(0)) != 1 || TextRange.m32962getLengthimpl(textFieldBuffer.getChanges().mo27943getOriginalRangejx7JFs(0)) != 0 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int iM32964getMinimpl = TextRange.m32964getMinimpl(textFieldBuffer.getChanges().mo27944getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != iM32964getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(iM32964getMinimpl);
        }
    }
}
