package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class VideoUsageControl {
    private final Executor executor;
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(Executor executor) {
        AbstractC9979u.m20294g(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        int iDecrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.m573d("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        Logger.m579w("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        Logger.m573d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.decrementUsage$lambda$1(this.f453c);
            }
        });
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.w3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.incrementUsage$lambda$0(this.f465c);
            }
        });
    }

    public final void reset() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.v3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.reset$lambda$2(this.f458c);
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.m573d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
