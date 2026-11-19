package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements InterfaceC9544p {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(FocusDirection focusDirection, Rect rect) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m32616onRequestFocusForOwner7o62pno(focusDirection, rect));
    }
}
