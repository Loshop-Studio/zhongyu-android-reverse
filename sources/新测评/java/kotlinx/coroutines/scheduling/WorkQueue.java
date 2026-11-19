package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.AbstractC3164a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p289x8.AbstractC9881a;

@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\"\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eJ\u0016\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001cH\u0002J\b\u0010 \u001a\u0004\u0018\u00010\fJ\b\u0010!\u001a\u0004\u0018\u00010\fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u0017H\u0002J\u001a\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0017H\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J$\u0010*\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020)H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010.\u001a\u00020'*\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0011\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¨\u0006/"}, m13558d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "bufferSize", "", "getBufferSize", "()I", "size", "getSize$kotlinx_coroutines_core", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "Lkotlinx/atomicfu/AtomicInt;", "consumerIndex", "blockingTasksInBuffer", "poll", "add", "task", "fair", "", "addLast", "trySteal", "", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stealWithExclusiveMode", "pollBlocking", "pollCpu", "pollWithExclusiveMode", "onlyBlocking", "tryExtractFromTheMiddle", "index", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "tryStealLastScheduled", "pollTo", "queue", "pollBuffer", "decrementIfBlocking", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
/* loaded from: classes5.dex */
public final class WorkQueue {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater producerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return workQueue.add(task, z9);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext) {
            blockingTasksInBuffer$volatile$FU.incrementAndGet(this);
        }
        int i10 = producerIndex$volatile$FU.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        producerIndex$volatile$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || !task.taskContext) {
            return;
        }
        blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int getBufferSize() {
        return producerIndex$volatile$FU.get(this) - consumerIndex$volatile$FU.get(this);
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
        return this.consumerIndex$volatile;
    }

    private final /* synthetic */ Object getLastScheduledTask$volatile() {
        return this.lastScheduledTask$volatile;
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
        return this.producerIndex$volatile;
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            int i10 = consumerIndex$volatile$FU.get(this);
            if (i10 - producerIndex$volatile$FU.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (consumerIndex$volatile$FU.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue queue) {
        Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        queue.addLast(taskPollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean onlyBlocking) {
        Task task;
        do {
            task = (Task) lastScheduledTask$volatile$FU.get(this);
            if (task == null || task.taskContext != onlyBlocking) {
                int i10 = consumerIndex$volatile$FU.get(this);
                int i11 = producerIndex$volatile$FU.get(this);
                while (i10 != i11) {
                    if (onlyBlocking && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i11, onlyBlocking);
                    if (taskTryExtractFromTheMiddle != null) {
                        return taskTryExtractFromTheMiddle;
                    }
                }
                return null;
            }
        } while (!AbstractC3164a.m1545a(lastScheduledTask$volatile$FU, this, task, null));
        return task;
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int i10) {
        this.blockingTasksInBuffer$volatile = i10;
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int i10) {
        this.consumerIndex$volatile = i10;
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    private final /* synthetic */ void setProducerIndex$volatile(int i10) {
        this.producerIndex$volatile = i10;
    }

    private final Task stealWithExclusiveMode(int stealingMode) {
        int i10 = consumerIndex$volatile$FU.get(this);
        int i11 = producerIndex$volatile$FU.get(this);
        boolean z9 = stealingMode == 1;
        while (i10 != i11) {
            if (z9 && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i10, z9);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i10 = i12;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        int i10 = index & 127;
        Task task = this.buffer.get(i10);
        if (task == null || task.taskContext != onlyBlocking || !AbstractC9881a.m16590a(this.buffer, i10, task, null)) {
            return null;
        }
        if (onlyBlocking) {
            blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
        }
        return task;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        ?? r02;
        do {
            r02 = (Task) lastScheduledTask$volatile$FU.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jNanoTime = TasksKt.schedulerTimeSource.nanoTime() - r02.submissionTime;
            long j10 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (jNanoTime < j10) {
                return j10 - jNanoTime;
            }
        } while (!AbstractC3164a.m1545a(lastScheduledTask$volatile$FU, this, r02, null));
        stolenTaskRef.element = r02;
        return -1L;
    }

    public final Task add(Task task, boolean fair) {
        if (fair) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$volatile$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$volatile$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        T tPollBuffer = stealingMode == 3 ? pollBuffer() : stealWithExclusiveMode(stealingMode);
        if (tPollBuffer == 0) {
            return tryStealLastScheduled(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.element = tPollBuffer;
        return -1L;
    }
}
