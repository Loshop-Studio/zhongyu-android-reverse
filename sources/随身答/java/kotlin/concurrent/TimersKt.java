package kotlin.concurrent;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u001aO\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aO\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a'\u0010\u0015\u001a\u00020\u00012\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m13413d2 = {"schedule", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "delay", "", "action", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "time", "Ljava/util/Date;", TypedValues.CycleType.S_WAVE_PERIOD, "scheduleAtFixedRate", "timer", HintConstants.AUTOFILL_HINT_NAME, "", "daemon", "", "initialDelay", "startAt", "fixedRateTimer", "timerTask", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "TimersKt")
/* loaded from: classes5.dex */
public final class TimersKt {

    @Metadata(m13412d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m13413d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = 176)
    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* renamed from: kotlin.concurrent.TimersKt$timerTask$1 */
    public static final class C83521 extends TimerTask {
        final /* synthetic */ Function1<TimerTask, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public C83521(Function1<? super TimerTask, Unit> function1) {
            this.$action = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$action.invoke(this);
        }
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z9, long j9, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.scheduleAtFixedRate(new C83521(action), j9, j10);
        return timer;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z9, long j9, long j10, Function1 action, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        if ((i9 & 4) != 0) {
            j9 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.scheduleAtFixedRate(new C83521(action), j9, j10);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j9, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.schedule(c83521, j9);
        return c83521;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, long j9, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.scheduleAtFixedRate(c83521, j9, j10);
        return c83521;
    }

    @PublishedApi
    public static final Timer timer(String str, boolean z9) {
        return str == null ? new Timer(z9) : new Timer(str, z9);
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z9, long j9, long j10, Function1 action, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        if ((i9 & 4) != 0) {
            j9 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.schedule(new C83521(action), j9, j10);
        return timer;
    }

    @InlineOnly
    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new C83521(action);
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z9, long j9, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.schedule(new C83521(action), j9, j10);
        return timer;
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z9, Date startAt, long j9, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.scheduleAtFixedRate(new C83521(action), startAt, j9);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.schedule(c83521, time);
        return c83521;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, Date time, long j9, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.scheduleAtFixedRate(c83521, time, j9);
        return c83521;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z9, Date startAt, long j9, Function1 action, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.scheduleAtFixedRate(new C83521(action), startAt, j9);
        return timer;
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z9, Date startAt, long j9, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.schedule(new C83521(action), startAt, j9);
        return timer;
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z9, Date startAt, long j9, Function1 action, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z9);
        timer.schedule(new C83521(action), startAt, j9);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j9, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.schedule(c83521, j9, j10);
        return c83521;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, long j9, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        C83521 c83521 = new C83521(action);
        timer.schedule(c83521, time, j9);
        return c83521;
    }
}
