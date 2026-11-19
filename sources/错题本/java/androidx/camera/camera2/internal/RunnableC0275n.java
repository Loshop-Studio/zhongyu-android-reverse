package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0275n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f311a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f312b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f313c;

    public /* synthetic */ RunnableC0275n(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f311a = i;
        this.f312b = camera2CameraImpl;
        this.f313c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f311a) {
            case 0:
                this.f312b.lambda$release$4(this.f313c);
                break;
            default:
                this.f312b.lambda$isMeteringRepeatingAttached$13(this.f313c);
                break;
        }
    }
}
