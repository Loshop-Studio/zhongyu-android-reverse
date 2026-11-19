package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$5 extends FunctionReferenceImpl implements InterfaceC10559a {
    public AndroidComposeView$focusOwner$5(Object obj) {
        super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
    }

    @Override // p300x7.InterfaceC10559a
    public final Rect invoke() {
        return ((AndroidComposeView) this.receiver).onFetchFocusRect();
    }
}
