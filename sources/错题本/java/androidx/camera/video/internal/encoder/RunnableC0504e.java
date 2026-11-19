package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.internal.encoder.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0504e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f624a;

    /* renamed from: b */
    public final /* synthetic */ Object f625b;

    /* renamed from: c */
    public final /* synthetic */ Object f626c;

    /* renamed from: d */
    public final /* synthetic */ Object f627d;

    public /* synthetic */ RunnableC0504e(EncoderImpl.MediaCodecCallback mediaCodecCallback, Executor executor, EncoderCallback encoderCallback) {
        this.f624a = 1;
        this.f626c = mediaCodecCallback;
        this.f625b = executor;
        this.f627d = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f624a) {
            case 0:
                ((EncoderImpl.ByteBufferInput) this.f626c).lambda$addObserver$7((Observable.Observer) this.f627d, (Executor) this.f625b);
                break;
            case 1:
                ((EncoderImpl.MediaCodecCallback) this.f626c).lambda$reachEndData$2((Executor) this.f625b, (EncoderCallback) this.f627d);
                break;
            default:
                ((EncoderImpl) this.f626c).lambda$stopMediaCodec$12((ArrayList) this.f627d, (Runnable) this.f625b);
                break;
        }
    }

    public /* synthetic */ RunnableC0504e(Object obj, Object obj2, int i, Object obj3) {
        this.f624a = i;
        this.f626c = obj;
        this.f627d = obj2;
        this.f625b = obj3;
    }
}
