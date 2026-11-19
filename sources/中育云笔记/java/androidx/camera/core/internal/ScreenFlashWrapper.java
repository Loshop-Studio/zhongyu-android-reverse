package androidx.camera.core.internal;

import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ScreenFlashWrapper";

    @GuardedBy("lock")
    private boolean isClearScreenFlashPending;
    private final Object lock;

    @GuardedBy("lock")
    private ImageCapture.ScreenFlashListener pendingListener;
    private final ImageCapture.ScreenFlash screenFlash;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, AbstractC9972n abstractC9972n) {
        this(screenFlash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (this$0.pendingListener == null) {
                    Logger.m579w(TAG, "apply: pendingListener is null!");
                }
                this$0.completePendingScreenFlashListener();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void completePendingScreenFlashClear() {
        C10786q c10786q;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                    if (screenFlash != null) {
                        screenFlash.clear();
                        c10786q = C10786q.f26013a;
                    } else {
                        c10786q = null;
                    }
                    if (c10786q == null) {
                        Logger.m575e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    Logger.m579w(TAG, "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                C10786q c10786q2 = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            try {
                ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
                if (screenFlashListener != null) {
                    screenFlashListener.onCompleted();
                }
                this.pendingListener = null;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
        return Companion.from(screenFlash);
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j10, ImageCapture.ScreenFlashListener screenFlashListener) {
        C10786q c10786q;
        AbstractC9979u.m20294g(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            C10786q c10786q2 = C10786q.f26013a;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j10, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.c
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(this.f646a);
                }
            });
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            Logger.m575e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    public final ImageCapture.ScreenFlash getBaseScreenFlash() {
        return this.screenFlash;
    }

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }
}
