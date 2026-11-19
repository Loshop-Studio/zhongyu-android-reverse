package androidx.paging;

import androidx.paging.HintHandler;
import androidx.paging.ViewportHint;
import androidx.paging.internal.SynchronizedLock;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.BufferOverflow;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11602k;

/* loaded from: classes3.dex */
public final class HintHandler {
    private final State state = new State();

    public final class HintFlow {
        private final InterfaceC11602k _flow = AbstractC11608q.m25592b(1, 0, BufferOverflow.f23520d, 2, null);
        private ViewportHint value;

        public HintFlow() {
        }

        public final InterfaceC11594c getFlow() {
            return this._flow;
        }

        public final ViewportHint getValue() {
            return this.value;
        }

        public final void setValue(ViewportHint viewportHint) {
            this.value = viewportHint;
            if (viewportHint != null) {
                this._flow.mo20854a(viewportHint);
            }
        }
    }

    public final class State {
        private final HintFlow append;
        private ViewportHint.Access lastAccessHint;
        private final SynchronizedLock lock = new SynchronizedLock();
        private final HintFlow prepend;

        public State() {
            this.prepend = HintHandler.this.new HintFlow();
            this.append = HintHandler.this.new HintFlow();
        }

        public final InterfaceC11594c getAppendFlow() {
            return this.append.getFlow();
        }

        public final ViewportHint.Access getLastAccessHint() {
            return this.lastAccessHint;
        }

        public final InterfaceC11594c getPrependFlow() {
            return this.prepend.getFlow();
        }

        public final void modify(ViewportHint.Access access, InterfaceC9544p block) {
            AbstractC9979u.m20294g(block, "block");
            synchronized (this.lock) {
                if (access != null) {
                    try {
                        this.lastAccessHint = access;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                block.invoke(this.prepend, this.append);
                C10786q c10786q = C10786q.f26013a;
            }
        }
    }

    public static final /* synthetic */ class WhenMappings {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q forceSetHint$lambda$1(LoadType loadType, ViewportHint viewportHint, HintFlow prependHint, HintFlow appendHint) {
        AbstractC9979u.m20294g(prependHint, "prependHint");
        AbstractC9979u.m20294g(appendHint, "appendHint");
        if (loadType == LoadType.PREPEND) {
            prependHint.setValue(viewportHint);
        } else {
            appendHint.setValue(viewportHint);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q processHint$lambda$0(ViewportHint viewportHint, HintFlow prependHint, HintFlow appendHint) {
        AbstractC9979u.m20294g(prependHint, "prependHint");
        AbstractC9979u.m20294g(appendHint, "appendHint");
        if (HintHandlerKt.shouldPrioritizeOver(viewportHint, prependHint.getValue(), LoadType.PREPEND)) {
            prependHint.setValue(viewportHint);
        }
        if (HintHandlerKt.shouldPrioritizeOver(viewportHint, appendHint.getValue(), LoadType.APPEND)) {
            appendHint.setValue(viewportHint);
        }
        return C10786q.f26013a;
    }

    public final void forceSetHint(final LoadType loadType, final ViewportHint viewportHint) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(viewportHint, "viewportHint");
        if (loadType == LoadType.PREPEND || loadType == LoadType.APPEND) {
            this.state.modify(null, new InterfaceC9544p() { // from class: androidx.paging.s
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return HintHandler.forceSetHint$lambda$1(loadType, viewportHint, (HintHandler.HintFlow) obj, (HintHandler.HintFlow) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public final ViewportHint.Access getLastAccessHint() {
        return this.state.getLastAccessHint();
    }

    public final InterfaceC11594c hintFor(LoadType loadType) {
        AbstractC9979u.m20294g(loadType, "loadType");
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
        AbstractC9979u.m20294g(viewportHint, "viewportHint");
        this.state.modify(viewportHint instanceof ViewportHint.Access ? (ViewportHint.Access) viewportHint : null, new InterfaceC9544p() { // from class: androidx.paging.r
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return HintHandler.processHint$lambda$0(viewportHint, (HintHandler.HintFlow) obj, (HintHandler.HintFlow) obj2);
            }
        });
    }
}
