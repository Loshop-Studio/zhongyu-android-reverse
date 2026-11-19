package androidx.compose.p014ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.C10958m;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher extends AbstractC11106e0 {
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final C10958m toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC10773d Main$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // p181hd.InterfaceC9529a
        public final InterfaceC9945d invoke() {
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(AndroidUiDispatcher_androidKt.isMainThread() ? Choreographer.getInstance() : (Choreographer) AbstractC11109f.m24707e(C11157r0.m24800c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });
    private static final ThreadLocal<InterfaceC9945d> currentThread = new ThreadLocal<InterfaceC9945d>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        public InterfaceC9945d initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(looperMyLooper), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC9945d getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            InterfaceC9945d interfaceC9945d = (InterfaceC9945d) AndroidUiDispatcher.currentThread.get();
            if (interfaceC9945d != null) {
                return interfaceC9945d;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final InterfaceC9945d getMain() {
            return (InterfaceC9945d) AndroidUiDispatcher.Main$delegate.getValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, AbstractC9972n abstractC9972n) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable runnable;
        synchronized (this.lock) {
            runnable = (Runnable) this.toRunTrampolined.m23976r();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j10) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z10;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z10 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(runnable);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(frameCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new C10958m();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }
}
