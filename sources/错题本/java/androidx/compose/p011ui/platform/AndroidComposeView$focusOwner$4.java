package androidx.compose.p011ui.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends FunctionReferenceImpl implements InterfaceC6469a {
    public AndroidComposeView$focusOwner$4(Object obj) {
        super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
    }

    @Override // p152r6.InterfaceC6469a
    public /* bridge */ /* synthetic */ Object invoke() {
        m12428invoke();
        return C5443s.f8405a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m12428invoke() {
        ((AndroidComposeView) this.receiver).onClearFocusForOwner();
    }
}
