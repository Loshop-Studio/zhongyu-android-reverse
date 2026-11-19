package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "SUSPEND", "DROP_OLDEST", "DROP_LATEST", "kotlinx-coroutines-core"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class BufferOverflow {
    public static final BufferOverflow DROP_LATEST;
    public static final BufferOverflow DROP_OLDEST;
    public static final BufferOverflow SUSPEND;

    /* renamed from: a */
    public static final /* synthetic */ BufferOverflow[] f9290a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9291b;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        SUSPEND = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        DROP_OLDEST = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        DROP_LATEST = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        f9290a = bufferOverflowArr;
        f9291b = AbstractC5817a.m5310a(bufferOverflowArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9291b;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f9290a.clone();
    }
}
