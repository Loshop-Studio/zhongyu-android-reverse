package androidx.camera.core.impl.utils.executor;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.executor.AudioExecutor;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AudioExecutor implements Executor {
    private static volatile Executor sExecutor;
    private final ExecutorService mAudioService = Executors.newFixedThreadPool(2, new ThreadFactoryC06051());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1 */
    public class ThreadFactoryC06051 implements ThreadFactory {
        private static final String THREAD_NAME_STEM = "CameraX-camerax_audio_%d";
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        public ThreadFactoryC06051() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m816a(Runnable runnable) throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: androidx.camera.core.impl.utils.executor.a
                @Override // java.lang.Runnable
                public final void run() throws SecurityException, IllegalArgumentException {
                    AudioExecutor.ThreadFactoryC06051.m816a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, THREAD_NAME_STEM, Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }
    }

    public static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (AudioExecutor.class) {
            try {
                if (sExecutor == null) {
                    sExecutor = new AudioExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.mAudioService.execute(runnable);
    }
}
