package androidx.paging;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public abstract class LoadState {
    private final boolean endOfPaginationReached;

    public static final class Error extends LoadState {
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(false, null);
            AbstractC9133u.m16133g(error, "error");
            this.error = error;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return getEndOfPaginationReached() == error.getEndOfPaginationReached() && AbstractC9133u.m16128b(this.error, error.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached()) + this.error.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.error + ')';
        }
    }

    public static final class Loading extends LoadState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Loading) && getEndOfPaginationReached() == ((Loading) obj).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    public static final class NotLoading extends LoadState {
        public static final Companion Companion = new Companion(null);
        private static final NotLoading Complete = new NotLoading(true);
        private static final NotLoading Incomplete = new NotLoading(false);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public final NotLoading getComplete$paging_common_release() {
                return NotLoading.Complete;
            }

            public final NotLoading getIncomplete$paging_common_release() {
                return NotLoading.Incomplete;
            }

            private Companion() {
            }
        }

        public NotLoading(boolean z10) {
            super(z10, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof NotLoading) && getEndOfPaginationReached() == ((NotLoading) obj).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    public /* synthetic */ LoadState(boolean z10, AbstractC9126n abstractC9126n) {
        this(z10);
    }

    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }

    private LoadState(boolean z10) {
        this.endOfPaginationReached = z10;
    }
}
