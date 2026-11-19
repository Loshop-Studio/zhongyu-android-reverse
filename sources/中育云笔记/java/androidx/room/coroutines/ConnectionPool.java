package androidx.room.coroutines;

import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface ConnectionPool extends AutoCloseable {

    public static final class RollbackException extends Throwable {
        private final Object result;

        public RollbackException(Object obj) {
            this.result = obj;
        }

        public final Object getResult() {
            return this.result;
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    <R> Object useConnection(boolean z10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c);
}
