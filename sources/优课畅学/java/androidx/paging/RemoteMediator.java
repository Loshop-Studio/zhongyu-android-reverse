package androidx.paging;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

@ExperimentalPagingApi
/* loaded from: classes3.dex */
public abstract class RemoteMediator<Key, Value> {

    public enum InitializeAction {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    public static abstract class MediatorResult {

        public static final class Error extends MediatorResult {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                AbstractC9133u.m16133g(throwable, "throwable");
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

        public /* synthetic */ MediatorResult(AbstractC9126n abstractC9126n) {
            this();
        }

        private MediatorResult() {
        }
    }

    public static /* synthetic */ <Key, Value> Object initialize$suspendImpl(RemoteMediator<Key, Value> remoteMediator, InterfaceC9324c<? super InitializeAction> interfaceC9324c) {
        return InitializeAction.LAUNCH_INITIAL_REFRESH;
    }

    public Object initialize(InterfaceC9324c<? super InitializeAction> interfaceC9324c) {
        return initialize$suspendImpl(this, interfaceC9324c);
    }

    public abstract Object load(LoadType loadType, PagingState<Key, Value> pagingState, InterfaceC9324c<? super MediatorResult> interfaceC9324c);
}
