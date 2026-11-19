package kotlinx.coroutines.scheduling;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m5110d2 = {"kotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState", "", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class CoroutineScheduler$WorkerState {
    public static final CoroutineScheduler$WorkerState BLOCKING;
    public static final CoroutineScheduler$WorkerState CPU_ACQUIRED;
    public static final CoroutineScheduler$WorkerState DORMANT;
    public static final CoroutineScheduler$WorkerState PARKING;
    public static final CoroutineScheduler$WorkerState TERMINATED;

    /* renamed from: a */
    public static final /* synthetic */ CoroutineScheduler$WorkerState[] f9498a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9499b;

    static {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = new CoroutineScheduler$WorkerState("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = coroutineScheduler$WorkerState;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = new CoroutineScheduler$WorkerState("BLOCKING", 1);
        BLOCKING = coroutineScheduler$WorkerState2;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = new CoroutineScheduler$WorkerState("PARKING", 2);
        PARKING = coroutineScheduler$WorkerState3;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = new CoroutineScheduler$WorkerState("DORMANT", 3);
        DORMANT = coroutineScheduler$WorkerState4;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState5 = new CoroutineScheduler$WorkerState("TERMINATED", 4);
        TERMINATED = coroutineScheduler$WorkerState5;
        CoroutineScheduler$WorkerState[] coroutineScheduler$WorkerStateArr = {coroutineScheduler$WorkerState, coroutineScheduler$WorkerState2, coroutineScheduler$WorkerState3, coroutineScheduler$WorkerState4, coroutineScheduler$WorkerState5};
        f9498a = coroutineScheduler$WorkerStateArr;
        f9499b = AbstractC5817a.m5310a(coroutineScheduler$WorkerStateArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9499b;
    }

    public static CoroutineScheduler$WorkerState valueOf(String str) {
        return (CoroutineScheduler$WorkerState) Enum.valueOf(CoroutineScheduler$WorkerState.class, str);
    }

    public static CoroutineScheduler$WorkerState[] values() {
        return (CoroutineScheduler$WorkerState[]) f9498a.clone();
    }
}
