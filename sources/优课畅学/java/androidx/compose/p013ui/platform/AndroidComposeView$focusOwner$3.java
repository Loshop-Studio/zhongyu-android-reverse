package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.focus.FocusDirection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements InterfaceC10570l {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m26021invoke3ESFkO8(((FocusDirection) obj).m23915unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m26021invoke3ESFkO8(int i10) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m26013onMoveFocusInChildren3ESFkO8(i10));
    }
}
