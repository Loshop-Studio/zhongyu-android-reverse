package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements Function2<FocusDirection, Rect, Boolean> {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(FocusDirection focusDirection, Rect rect) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m22692onRequestFocusForOwner7o62pno(focusDirection, rect));
    }
}
