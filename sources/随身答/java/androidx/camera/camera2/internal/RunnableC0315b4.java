package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* renamed from: androidx.camera.camera2.internal.b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0315b4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f212a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f212a.safeClose();
    }
}
