package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$5 extends FunctionReferenceImpl implements InterfaceC9529a {
    public AndroidComposeView$focusOwner$5(Object obj) {
        super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public final Rect invoke() {
        return ((AndroidComposeView) this.receiver).onFetchFocusRect();
    }
}
