package androidx.paging;

import androidx.paging.ViewportHint;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class HintHandler {
    private final State state = new State();

    public final class HintFlow {
        private final InterfaceC9270g _flow = AbstractC9276m.m17044b(1, 0, BufferOverflow.f17604b, 2, null);
        private ViewportHint value;

        public HintFlow() {
        }

        public final InterfaceC9266c getFlow() {
            return this._flow;
        }

        public final ViewportHint getValue() {
            return this.value;
        }

        public final void setValue(ViewportHint viewportHint) {
            this.value = viewportHint;
            if (viewportHint != null) {
                this._flow.mo16670a(viewportHint);
            }
        }
    }

    public final class State {
        private final HintFlow append;
        private ViewportHint.Access lastAccessHint;
        private final ReentrantLock lock = new ReentrantLock();
        private final HintFlow prepend;

        public State() {
            this.prepend = HintHandler.this.new HintFlow();
            this.append = HintHandler.this.new HintFlow();
        }

        public final InterfaceC9266c getAppendFlow() {
            return this.append.getFlow();
        }

        public final ViewportHint.Access getLastAccessHint() {
            return this.lastAccessHint;
        }

        public final InterfaceC9266c getPrependFlow() {
            return this.prepend.getFlow();
        }

        public final void modify(ViewportHint.Access access, InterfaceC10574p block) {
            AbstractC9133u.m16133g(block, "block");
            ReentrantLock reentrantLock = this.lock;
            try {
                reentrantLock.lock();
                if (access != null) {
                    this.lastAccessHint = access;
                }
                block.invoke(this.prepend, this.append);
                C8736p c8736p = C8736p.f16368a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void forceSetHint(final LoadType loadType, final ViewportHint viewportHint) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(viewportHint, "viewportHint");
        if (loadType == LoadType.PREPEND || loadType == LoadType.APPEND) {
            this.state.modify(null, new InterfaceC10574p() { // from class: androidx.paging.HintHandler.forceSetHint.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((HintFlow) obj, (HintFlow) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(HintFlow prependHint, HintFlow appendHint) {
                    AbstractC9133u.m16133g(prependHint, "prependHint");
                    AbstractC9133u.m16133g(appendHint, "appendHint");
                    if (loadType == LoadType.PREPEND) {
                        prependHint.setValue(viewportHint);
                    } else {
                        appendHint.setValue(viewportHint);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public final ViewportHint.Access getLastAccessHint() {
        return this.state.getLastAccessHint();
    }

    public final InterfaceC9266c hintFor(LoadType loadType) {
        AbstractC9133u.m16133g(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            return this.state.getPrependFlow();
        }
        if (i10 == 2) {
            return this.state.getAppendFlow();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void processHint(final ViewportHint viewportHint) {
        AbstractC9133u.m16133g(viewportHint, "viewportHint");
        this.state.modify(viewportHint instanceof ViewportHint.Access ? (ViewportHint.Access) viewportHint : null, new InterfaceC10574p() { // from class: androidx.paging.HintHandler.processHint.1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((HintFlow) obj, (HintFlow) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(HintFlow prependHint, HintFlow appendHint) {
                AbstractC9133u.m16133g(prependHint, "prependHint");
                AbstractC9133u.m16133g(appendHint, "appendHint");
                if (HintHandlerKt.shouldPrioritizeOver(viewportHint, prependHint.getValue(), LoadType.PREPEND)) {
                    prependHint.setValue(viewportHint);
                }
                if (HintHandlerKt.shouldPrioritizeOver(viewportHint, appendHint.getValue(), LoadType.APPEND)) {
                    appendHint.setValue(viewportHint);
                }
            }
        });
    }
}
