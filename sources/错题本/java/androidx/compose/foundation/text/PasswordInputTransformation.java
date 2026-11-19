package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function0;", "Ld6/s;", "scheduleHide", "<init>", "(Lr6/a;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "hide", "()V", "Lr6/a;", "getScheduleHide", "()Lr6/a;", "", "<set-?>", "revealCodepointIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "getRevealCodepointIndex$foundation_release", "()I", "setRevealCodepointIndex", "(I)V", "revealCodepointIndex", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n78#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n266#1:374\n266#1:375,2\n*E\n"})
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;

    /* renamed from: revealCodepointIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState revealCodepointIndex = SnapshotIntStateKt.mutableIntStateOf(-1);

    @NotNull
    private final InterfaceC6469a scheduleHide;

    public PasswordInputTransformation(@NotNull InterfaceC6469a interfaceC6469a) {
        this.scheduleHide = interfaceC6469a;
    }

    private final void setRevealCodepointIndex(int i) {
        this.revealCodepointIndex.setIntValue(i);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex.getIntValue();
    }

    @NotNull
    public final InterfaceC6469a getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@NotNull TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m12766getLengthimpl(textFieldBuffer.getChanges().mo7748getRangejx7JFs(0)) != 1 || TextRange.m12766getLengthimpl(textFieldBuffer.getChanges().mo7747getOriginalRangejx7JFs(0)) != 0 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int iM12768getMinimpl = TextRange.m12768getMinimpl(textFieldBuffer.getChanges().mo7748getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != iM12768getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(iM12768getMinimpl);
        }
    }
}
