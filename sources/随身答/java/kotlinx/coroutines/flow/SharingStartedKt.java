package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.SharingStarted;

@Metadata(m13412d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13413d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m26277WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j9, long j10) {
        return new StartedWhileSubscribed(Duration.m26093getInWholeMillisecondsimpl(j9), Duration.m26093getInWholeMillisecondsimpl(j10));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m26278WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j9, long j10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = Duration.INSTANCE.m26173getZEROUwyO8pc();
        }
        if ((i9 & 2) != 0) {
            j10 = Duration.INSTANCE.m26171getINFINITEUwyO8pc();
        }
        return m26277WhileSubscribed5qebJ5I(companion, j9, j10);
    }
}
