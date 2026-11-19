package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ld6/s;", "incrementUsage", "()V", "decrementUsage", "reset", "resetDirectly", "", "getUsage", "()I", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "camera-camera2_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VideoUsageControl {

    @NotNull
    private final Executor executor;

    @NotNull
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(@NotNull Executor executor) {
        AbstractC5830k.m5330g(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        int iDecrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.m585d("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
        } else {
            Logger.m591w("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        Logger.m585d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new RunnableC0300z0(this, 0));
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new RunnableC0300z0(this, 2));
    }

    public final void reset() {
        this.executor.execute(new RunnableC0300z0(this, 1));
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.m585d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
