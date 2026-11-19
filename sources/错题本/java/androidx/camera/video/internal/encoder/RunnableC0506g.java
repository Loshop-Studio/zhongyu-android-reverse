package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.video.internal.encoder.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0506g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f630a;

    /* renamed from: b */
    public final /* synthetic */ EncoderImpl.ByteBufferInput f631b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f632c;

    public /* synthetic */ RunnableC0506g(EncoderImpl.ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer, int i) {
        this.f630a = i;
        this.f631b = byteBufferInput;
        this.f632c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f630a) {
            case 0:
                this.f631b.lambda$acquireBuffer$4(this.f632c);
                break;
            default:
                this.f631b.lambda$fetchData$0(this.f632c);
                break;
        }
    }
}
