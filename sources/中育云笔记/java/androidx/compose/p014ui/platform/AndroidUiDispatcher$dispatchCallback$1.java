package androidx.compose.p014ui.platform;

import android.view.Choreographer;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ AndroidUiDispatcher this$0;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.this$0 = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        this.this$0.handler.removeCallbacks(this);
        this.this$0.performTrampolineDispatch();
        this.this$0.performFrameDispatch(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.this$0.performTrampolineDispatch();
        Object obj = this.this$0.lock;
        AndroidUiDispatcher androidUiDispatcher = this.this$0;
        synchronized (obj) {
            try {
                if (androidUiDispatcher.toRunOnFrame.isEmpty()) {
                    androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                    androidUiDispatcher.scheduledFrameDispatch = false;
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
