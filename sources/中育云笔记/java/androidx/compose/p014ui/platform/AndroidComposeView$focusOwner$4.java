package androidx.compose.p014ui.platform;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends FunctionReferenceImpl implements InterfaceC9529a {
    public AndroidComposeView$focusOwner$4(Object obj) {
        super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m32624invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m32624invoke() {
        ((AndroidComposeView) this.receiver).onClearFocusForOwner();
    }
}
