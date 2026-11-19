package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.video.internal.encoder.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0505f implements CallbackToFutureAdapter.Resolver, OutputConfig {

    /* renamed from: a */
    public final /* synthetic */ int f628a;

    /* renamed from: b */
    public final /* synthetic */ Object f629b;

    public /* synthetic */ C0505f(Object obj, int i) {
        this.f628a = i;
        this.f629b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f628a) {
            case 0:
                return ((EncoderImpl.ByteBufferInput) this.f629b).lambda$fetchData$1(completer);
            default:
                return ((EncoderImpl.ByteBufferInput) this.f629b).lambda$acquireBuffer$5(completer);
        }
    }

    @Override // androidx.camera.video.internal.encoder.OutputConfig
    public MediaFormat getMediaFormat() {
        return EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$5((MediaFormat) this.f629b);
    }
}
