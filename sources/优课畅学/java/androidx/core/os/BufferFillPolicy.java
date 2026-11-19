package androidx.core.os;

import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9126n;

@RequiresApi(api = 35)
/* loaded from: classes2.dex */
public abstract class BufferFillPolicy {
    public static final Companion Companion = new Companion(null);
    public static final BufferFillPolicy DISCARD = new Discard();
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    public final int getValue$core_release() {
        return this.value;
    }

    private BufferFillPolicy(int i10) {
        this.value = i10;
    }
}
