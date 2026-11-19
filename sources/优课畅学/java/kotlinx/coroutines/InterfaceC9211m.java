package kotlinx.coroutines;

import p135i8.AbstractC8825c0;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.m */
/* loaded from: classes5.dex */
public interface InterfaceC9211m {

    /* renamed from: kotlinx.coroutines.m$a */
    public static final class a implements InterfaceC9211m {

        /* renamed from: a */
        public final InterfaceC10570l f18094a;

        public a(InterfaceC10570l interfaceC10570l) {
            this.f18094a = interfaceC10570l;
        }

        @Override // kotlinx.coroutines.InterfaceC9211m
        /* renamed from: a */
        public void mo14884a(Throwable th) {
            this.f18094a.invoke(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + AbstractC8825c0.m14820a(this.f18094a) + '@' + AbstractC8825c0.m14821b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo14884a(Throwable th);
}
