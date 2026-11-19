package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final InterfaceC10559a scheduleHide;

    public PasswordInputTransformation(InterfaceC10559a interfaceC10559a) {
        this.scheduleHide = interfaceC10559a;
    }

    private final void setRevealCodepointIndex(int i10) {
        this.revealCodepointIndex$delegate.setIntValue(i10);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    public final InterfaceC10559a getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m26360getLengthimpl(textFieldBuffer.getChanges().mo21342getRangejx7JFs(0)) != 1 || TextRange.m26360getLengthimpl(textFieldBuffer.getChanges().mo21341getOriginalRangejx7JFs(0)) != 0 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int iM26362getMinimpl = TextRange.m26362getMinimpl(textFieldBuffer.getChanges().mo21342getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != iM26362getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(iM26362getMinimpl);
        }
    }
}
