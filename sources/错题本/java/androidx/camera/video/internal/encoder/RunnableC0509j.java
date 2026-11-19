package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* renamed from: androidx.camera.video.internal.encoder.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0509j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f638a;

    /* renamed from: b */
    public final /* synthetic */ int f639b;

    /* renamed from: c */
    public final /* synthetic */ Object f640c;

    /* renamed from: d */
    public final /* synthetic */ Object f641d;

    /* renamed from: e */
    public final /* synthetic */ Object f642e;

    public /* synthetic */ RunnableC0509j(EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f638a = 0;
        this.f640c = mediaCodecCallback;
        this.f641d = bufferInfo;
        this.f642e = mediaCodec;
        this.f639b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f638a) {
            case 0:
                ((EncoderImpl.MediaCodecCallback) this.f640c).lambda$onOutputBufferAvailable$1((MediaCodec.BufferInfo) this.f641d, (MediaCodec) this.f642e, this.f639b);
                break;
            case 1:
                EncoderImpl.lambda$notifyError$11((EncoderCallback) this.f640c, this.f639b, (String) this.f641d, (Throwable) this.f642e);
                break;
            default:
                ((EncoderImpl) this.f640c).lambda$handleEncodeError$10(this.f639b, (String) this.f641d, (Throwable) this.f642e);
                break;
        }
    }

    public /* synthetic */ RunnableC0509j(Object obj, int i, String str, Throwable th, int i8) {
        this.f638a = i8;
        this.f640c = obj;
        this.f639b = i;
        this.f641d = str;
        this.f642e = th;
    }
}
