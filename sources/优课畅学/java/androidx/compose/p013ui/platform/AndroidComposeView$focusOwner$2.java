package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements InterfaceC10574p {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(FocusDirection focusDirection, Rect rect) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m26014onRequestFocusForOwner7o62pno(focusDirection, rect));
    }
}
