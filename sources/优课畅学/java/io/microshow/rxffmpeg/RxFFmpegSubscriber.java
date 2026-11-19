package io.microshow.rxffmpeg;

import io.microshow.rxffmpeg.RxFFmpegInvoke;
import io.reactivex.subscribers.AbstractC8974a;

/* loaded from: classes5.dex */
public abstract class RxFFmpegSubscriber extends AbstractC8974a implements RxFFmpegInvoke.IFFmpegListener {
    public static int STATE_CANCEL = -100;
    public static int STATE_PROGRESS = 100;

    @Override // ba.InterfaceC5218b
    public void onComplete() {
        onFinish();
    }

    @Override // ba.InterfaceC5218b
    public void onError(Throwable th) {
        onError(th.getMessage());
    }

    @Override // ba.InterfaceC5218b
    public void onNext(RxFFmpegProgress rxFFmpegProgress) {
        if (rxFFmpegProgress.state == STATE_CANCEL) {
            onCancel();
        } else {
            onProgress(rxFFmpegProgress.progress, rxFFmpegProgress.progressTime);
        }
    }
}
