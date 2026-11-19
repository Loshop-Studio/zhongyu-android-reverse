package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.focus.FocusDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements Function1<FocusDirection, Boolean> {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(FocusDirection focusDirection) {
        return m22699invoke3ESFkO8(focusDirection.getValue());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m22699invoke3ESFkO8(int i10) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m22691onMoveFocusInChildren3ESFkO8(i10));
    }
}
