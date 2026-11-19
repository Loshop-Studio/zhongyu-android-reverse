package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi34;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi24;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Ld6/s;", "startStylusHandwriting", "()V", "prepareStylusHandwritingDelegation", "acceptStylusHandwritingDelegation", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi34 extends ComposeInputMethodManagerImplApi24 {
    public ComposeInputMethodManagerImplApi34(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
        requireImm().acceptStylusHandwritingDelegation(getView());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
        requireImm().prepareStylusHandwritingDelegation(getView());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
        requireImm().startStylusHandwriting(getView());
    }
}
