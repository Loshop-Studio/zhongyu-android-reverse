package kotlinx.coroutines;

import p181hd.InterfaceC9540l;
import sd.AbstractC11126j0;
import sd.InterfaceC11173w1;

/* renamed from: kotlinx.coroutines.b */
/* loaded from: classes6.dex */
public interface InterfaceC9996b extends InterfaceC11173w1 {

    /* renamed from: kotlinx.coroutines.b$a */
    public static final class a implements InterfaceC9996b {

        /* renamed from: c */
        public final InterfaceC9540l f23513c;

        public a(InterfaceC9540l interfaceC9540l) {
            this.f23513c = interfaceC9540l;
        }

        @Override // kotlinx.coroutines.InterfaceC9996b
        /* renamed from: a */
        public void mo20494a(Throwable th) {
            this.f23513c.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + AbstractC11126j0.m24738a(this.f23513c) + '@' + AbstractC11126j0.m24739b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo20494a(Throwable th);
}
