package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* renamed from: androidx.camera.camera2.internal.b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0386b4 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ SafeCloseImageReaderProxy f227c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f227c.safeClose();
    }
}
