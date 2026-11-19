package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.SharingStarted;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7880d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m18702WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j6, long j7) {
        return new StartedWhileSubscribed(Duration.m18518getInWholeMillisecondsimpl(j6), Duration.m18518getInWholeMillisecondsimpl(j7));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m18703WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = Duration.INSTANCE.m18598getZEROUwyO8pc();
        }
        if ((i6 & 2) != 0) {
            j7 = Duration.INSTANCE.m18596getINFINITEUwyO8pc();
        }
        return m18702WhileSubscribed5qebJ5I(companion, j6, j7);
    }
}
