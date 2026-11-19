package androidx.datastore.core;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8869r;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public abstract class Message<T> {

    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    public static final class Update<T> extends Message<T> {
        private final InterfaceC8869r ack;
        private final InterfaceC9100d callerContext;
        private final State<T> lastState;
        private final InterfaceC10574p transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(InterfaceC10574p transform, InterfaceC8869r ack, State<T> state, InterfaceC9100d callerContext) {
            super(null);
            AbstractC9133u.m16133g(transform, "transform");
            AbstractC9133u.m16133g(ack, "ack");
            AbstractC9133u.m16133g(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC8869r getAck() {
            return this.ack;
        }

        public final InterfaceC9100d getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final InterfaceC10574p getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract State<T> getLastState();

    private Message() {
    }
}
