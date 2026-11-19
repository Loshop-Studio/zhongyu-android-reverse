package kotlinx.coroutines;

import p135i8.AbstractC8825c0;
import p135i8.InterfaceC8850k1;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.b */
/* loaded from: classes5.dex */
public interface InterfaceC9154b extends InterfaceC8850k1 {

    /* renamed from: kotlinx.coroutines.b$a */
    public static final class a implements InterfaceC9154b {

        /* renamed from: a */
        public final InterfaceC10570l f17597a;

        public a(InterfaceC10570l interfaceC10570l) {
            this.f17597a = interfaceC10570l;
        }

        @Override // kotlinx.coroutines.InterfaceC9154b
        /* renamed from: a */
        public void mo14865a(Throwable th) {
            this.f17597a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + AbstractC8825c0.m14820a(this.f17597a) + '@' + AbstractC8825c0.m14821b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo14865a(Throwable th);
}
