package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.video.internal.encoder.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0511l implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f645a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f646b;

    public /* synthetic */ C0511l(AtomicReference atomicReference, int i) {
        this.f645a = i;
        this.f646b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f645a) {
            case 0:
                return InputBufferImpl.lambda$new$0(this.f646b, completer);
            case 1:
                return BufferCopiedEncodedData.lambda$new$0(this.f646b, completer);
            case 2:
                return EncodedDataImpl.lambda$new$0(this.f646b, completer);
            case 3:
                return EncoderImpl.lambda$acquireInputBuffer$13(this.f646b, completer);
            default:
                return EncoderImpl.lambda$new$0(this.f646b, completer);
        }
    }
}
