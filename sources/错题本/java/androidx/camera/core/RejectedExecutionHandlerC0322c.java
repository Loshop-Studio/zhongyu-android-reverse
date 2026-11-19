package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.camera.core.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0322c implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Logger.m587e(CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
    }
}
