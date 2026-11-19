package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.SharingStarted;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m13559k = 2, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m25818WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j10, long j11) {
        return new StartedWhileSubscribed(Duration.m25634getInWholeMillisecondsimpl(j10), Duration.m25634getInWholeMillisecondsimpl(j11));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m25819WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Duration.INSTANCE.m25714getZEROUwyO8pc();
        }
        if ((i10 & 2) != 0) {
            j11 = Duration.INSTANCE.m25712getINFINITEUwyO8pc();
        }
        return m25818WhileSubscribed5qebJ5I(companion, j10, j11);
    }
}
