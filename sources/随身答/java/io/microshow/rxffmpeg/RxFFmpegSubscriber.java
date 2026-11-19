package io.microshow.rxffmpeg;

import io.microshow.rxffmpeg.RxFFmpegInvoke;
import io.reactivex.subscribers.DisposableSubscriber;

/* loaded from: classes5.dex */
public abstract class RxFFmpegSubscriber extends DisposableSubscriber<RxFFmpegProgress> implements RxFFmpegInvoke.IFFmpegListener {
    public static int STATE_CANCEL = -100;
    public static int STATE_PROGRESS = 100;

    @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        onFinish();
    }

    @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        onError(th.getMessage());
    }

    @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(RxFFmpegProgress rxFFmpegProgress) {
        if (rxFFmpegProgress.state == STATE_CANCEL) {
            onCancel();
        } else {
            onProgress(rxFFmpegProgress.progress, rxFFmpegProgress.progressTime);
        }
    }
}
