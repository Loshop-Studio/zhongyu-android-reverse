package androidx.core.os;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

@RequiresApi(api = 35)
@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m13558d2 = {"Landroidx/core/os/BufferFillPolicy;", "", "value", "", "(I)V", "getValue$core_release", "()I", "Companion", "Discard", "RingBuffer", "Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy$RingBuffer;", "core_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public abstract class BufferFillPolicy {

    @JvmField
    public static final BufferFillPolicy DISCARD = new Discard();

    @JvmField
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13558d2 = {"Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy;", "()V", "core_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13558d2 = {"Landroidx/core/os/BufferFillPolicy$RingBuffer;", "Landroidx/core/os/BufferFillPolicy;", "()V", "core_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: getValue$core_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private BufferFillPolicy(int i10) {
        this.value = i10;
    }
}
