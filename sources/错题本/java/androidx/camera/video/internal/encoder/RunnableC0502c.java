package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.internal.encoder.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0502c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f619a;

    /* renamed from: b */
    public final /* synthetic */ Object f620b;

    /* renamed from: c */
    public final /* synthetic */ Object f621c;

    public /* synthetic */ RunnableC0502c(int i, Object obj, Object obj2) {
        this.f619a = i;
        this.f620b = obj;
        this.f621c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f619a) {
            case 0:
                EncoderImpl.lambda$addSignalEosTimeoutIfNeeded$9((Executor) this.f620b, (EncoderImpl.MediaCodecCallback) this.f621c);
                break;
            case 1:
                ((EncoderImpl) this.f620b).lambda$matchAcquisitionsAndFreeBufferIndexes$15((InputBufferImpl) this.f621c);
                break;
            case 2:
                EncoderImpl.ByteBufferInput.lambda$setActive$9((Map.Entry) this.f620b, (BufferProvider.State) this.f621c);
                break;
            case 3:
                ((Observable.Observer) this.f620b).onNewData((BufferProvider.State) this.f621c);
                break;
            case 4:
                ((EncoderImpl.ByteBufferInput) this.f620b).lambda$removeObserver$8((Observable.Observer) this.f621c);
                break;
            case 5:
                ((EncoderImpl.MediaCodecCallback) this.f621c).lambda$onOutputFormatChanged$7((MediaFormat) this.f620b);
                break;
            case 6:
                ((EncoderCallback) this.f620b).onEncodedData((EncodedDataImpl) this.f621c);
                break;
            case 7:
                EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$6((EncoderCallback) this.f620b, (MediaFormat) this.f621c);
                break;
            case 8:
                ((EncoderImpl.MediaCodecCallback) this.f621c).lambda$onError$4((MediaCodec.CodecException) this.f620b);
                break;
            case 9:
                ((Encoder.SurfaceInput.OnSurfaceUpdateListener) this.f620b).onSurfaceUpdate((Surface) this.f621c);
                break;
            default:
                ((EncoderImpl) this.f620b).lambda$acquireInputBuffer$14((CallbackToFutureAdapter.Completer) this.f621c);
                break;
        }
    }

    public /* synthetic */ RunnableC0502c(EncoderImpl.MediaCodecCallback mediaCodecCallback, Object obj, int i) {
        this.f619a = i;
        this.f621c = mediaCodecCallback;
        this.f620b = obj;
    }
}
