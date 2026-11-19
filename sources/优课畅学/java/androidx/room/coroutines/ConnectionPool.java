package androidx.room.coroutines;

import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

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

    <R> Object useConnection(boolean z10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c);
}
