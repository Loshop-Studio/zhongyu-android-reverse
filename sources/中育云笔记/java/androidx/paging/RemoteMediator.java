package androidx.paging;

import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p425yc.InterfaceC11943a;
import vc.InterfaceC11588c;

@ExperimentalPagingApi
/* loaded from: classes3.dex */
public abstract class RemoteMediator<Key, Value> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InitializeAction {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ InitializeAction[] $VALUES;
        public static final InitializeAction LAUNCH_INITIAL_REFRESH = new InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
        public static final InitializeAction SKIP_INITIAL_REFRESH = new InitializeAction("SKIP_INITIAL_REFRESH", 1);

        private static final /* synthetic */ InitializeAction[] $values() {
            return new InitializeAction[]{LAUNCH_INITIAL_REFRESH, SKIP_INITIAL_REFRESH};
        }

        static {
            InitializeAction[] initializeActionArr$values = $values();
            $VALUES = initializeActionArr$values;
            $ENTRIES = AbstractC9953a.m20230a(initializeActionArr$values);
        }

        private InitializeAction(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static InitializeAction valueOf(String str) {
            return (InitializeAction) Enum.valueOf(InitializeAction.class, str);
        }

        public static InitializeAction[] values() {
            return (InitializeAction[]) $VALUES.clone();
        }
    }

    public static abstract class MediatorResult {

        public static final class Error extends MediatorResult {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                AbstractC9979u.m20294g(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        public static final class Success extends MediatorResult {
            private final boolean endOfPaginationReached;

            public Success(boolean z10) {
                super(null);
                this.endOfPaginationReached = z10;
            }

            public final boolean endOfPaginationReached() {
                return this.endOfPaginationReached;
            }
        }

        public /* synthetic */ MediatorResult(AbstractC9972n abstractC9972n) {
            this();
        }

        private MediatorResult() {
        }
    }

    public static /* synthetic */ <Key, Value> Object initialize$suspendImpl(RemoteMediator<Key, Value> remoteMediator, InterfaceC11588c<? super InitializeAction> interfaceC11588c) {
        return InitializeAction.LAUNCH_INITIAL_REFRESH;
    }

    public Object initialize(InterfaceC11588c<? super InitializeAction> interfaceC11588c) {
        return initialize$suspendImpl(this, interfaceC11588c);
    }

    public abstract Object load(LoadType loadType, PagingState<Key, Value> pagingState, InterfaceC11588c<? super MediatorResult> interfaceC11588c);
}
