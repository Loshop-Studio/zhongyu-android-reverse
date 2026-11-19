package androidx.compose.p013ui.platform;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends FunctionReferenceImpl implements InterfaceC10559a {
    public AndroidComposeView$focusOwner$4(Object obj) {
        super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m26022invoke();
        return C8736p.f16368a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m26022invoke() {
        ((AndroidComposeView) this.receiver).onClearFocusForOwner();
    }
}
