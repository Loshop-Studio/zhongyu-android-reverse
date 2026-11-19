package androidx.compose.foundation.text;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
public /* synthetic */ class SecureTextFieldController$passwordInputTransformation$1 extends FunctionReferenceImpl implements InterfaceC9529a {
    public SecureTextFieldController$passwordInputTransformation$1(Object obj) {
        super(0, obj, SecureTextFieldController.class, "scheduleHide", "scheduleHide()V", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m27877invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m27877invoke() {
        ((SecureTextFieldController) this.receiver).scheduleHide();
    }
}
