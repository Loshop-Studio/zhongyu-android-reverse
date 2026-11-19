package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* renamed from: androidx.camera.camera2.internal.b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327b4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f400a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f400a.safeClose();
    }
}
