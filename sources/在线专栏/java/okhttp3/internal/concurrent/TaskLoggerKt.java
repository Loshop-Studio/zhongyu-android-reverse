package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C2757a0;
import kotlin.jvm.internal.C2768k;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import p171x2.InterfaceC3459a;

/* loaded from: classes.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        C2757a0 c2757a0 = C2757a0.f10720a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C2769l.m9240d(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        C2757a0 c2757a0 = C2757a0.f10720a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C2769l.m9240d(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull InterfaceC3459a<? extends T> block) {
        long jNanoTime;
        C2769l.m9241e(task, "task");
        C2769l.m9241e(queue, "queue");
        C2769l.m9241e(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            C2768k.m9236b(1);
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            C2768k.m9235a(1);
            return tInvoke;
        } catch (Throwable th) {
            C2768k.m9236b(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            C2768k.m9235a(1);
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull InterfaceC3459a<String> messageBlock) {
        C2769l.m9241e(task, "task");
        C2769l.m9241e(queue, "queue");
        C2769l.m9241e(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
