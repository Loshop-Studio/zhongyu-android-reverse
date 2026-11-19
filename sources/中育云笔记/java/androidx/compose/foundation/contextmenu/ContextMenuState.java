package androidx.compose.foundation.contextmenu;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextMenuState {
    public static final int $stable = 0;
    private final MutableState status$delegate;

    @StabilityInferred(parameters = 1)
    public static abstract class Status {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 1)
        public static final class Closed extends Status {
            public static final int $stable = 0;
            public static final Closed INSTANCE = new Closed();

            private Closed() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        @StabilityInferred(parameters = 1)
        public static final class Open extends Status {
            public static final int $stable = 0;
            private final long offset;

            public /* synthetic */ Open(long j10, AbstractC9972n abstractC9972n) {
                this(j10);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Open) {
                    return Offset.m30634equalsimpl0(this.offset, ((Open) obj).offset);
                }
                return false;
            }

            /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
            public final long m27081getOffsetF1C5BW0() {
                return this.offset;
            }

            public int hashCode() {
                return Offset.m30639hashCodeimpl(this.offset);
            }

            public String toString() {
                return "Open(offset=" + ((Object) Offset.m30645toStringimpl(this.offset)) + ')';
            }

            private Open(long j10) {
                super(null);
                this.offset = j10;
                if ((j10 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }
        }

        public /* synthetic */ Status(AbstractC9972n abstractC9972n) {
            this();
        }

        private Status() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return AbstractC9979u.m20289b(((ContextMenuState) obj).getStatus(), getStatus());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Status getStatus() {
        return (Status) this.status$delegate.getValue();
    }

    public int hashCode() {
        return getStatus().hashCode();
    }

    public final void setStatus(Status status) {
        this.status$delegate.setValue(status);
    }

    public String toString() {
        return "ContextMenuState(status=" + getStatus() + ')';
    }

    public ContextMenuState(Status status) {
        this.status$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(status, null, 2, null);
    }

    public /* synthetic */ ContextMenuState(Status status, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? Status.Closed.INSTANCE : status);
    }
}
