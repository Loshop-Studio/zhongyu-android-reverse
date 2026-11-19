package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.focus.FocusDirection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements InterfaceC9540l {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32623invoke3ESFkO8(((FocusDirection) obj).m30517unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m32623invoke3ESFkO8(int i10) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m32615onMoveFocusInChildren3ESFkO8(i10));
    }
}
