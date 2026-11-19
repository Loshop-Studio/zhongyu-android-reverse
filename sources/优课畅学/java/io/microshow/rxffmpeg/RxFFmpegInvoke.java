package io.microshow.rxffmpeg;

import io.reactivex.BackpressureStrategy;
import p112g7.AbstractC8655a;
import p244s6.AbstractC10045b;
import p244s6.InterfaceC10046c;
import p244s6.InterfaceC10047d;
import p266u6.AbstractC10198a;

/* loaded from: classes5.dex */
public class RxFFmpegInvoke {
    public static final String TAG = "RxFFmpegInvoke";
    private static volatile RxFFmpegInvoke instance;
    private IFFmpegListener ffmpegListener;

    public interface IFFmpegListener {
        void onCancel();

        void onError(String str);

        void onFinish();

        void onProgress(int i10, long j10);
    }

    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-invoke");
    }

    private RxFFmpegInvoke() {
    }

    public static RxFFmpegInvoke getInstance() {
        if (instance == null) {
            synchronized (RxFFmpegInvoke.class) {
                try {
                    if (instance == null) {
                        instance = new RxFFmpegInvoke();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public native void exit();

    public IFFmpegListener getFFmpegListener() {
        return this.ffmpegListener;
    }

    public native String getMediaInfo(String str);

    public void onCancel() {
        IFFmpegListener iFFmpegListener = this.ffmpegListener;
        if (iFFmpegListener != null) {
            iFFmpegListener.onCancel();
        }
    }

    public void onClean() {
        if (this.ffmpegListener != null) {
            this.ffmpegListener = null;
        }
    }

    public void onDestroy() {
        if (this.ffmpegListener != null) {
            this.ffmpegListener = null;
        }
        if (instance != null) {
            instance = null;
        }
    }

    public void onError(String str) {
        IFFmpegListener iFFmpegListener = this.ffmpegListener;
        if (iFFmpegListener != null) {
            iFFmpegListener.onError(str);
        }
    }

    public void onFinish() {
        IFFmpegListener iFFmpegListener = this.ffmpegListener;
        if (iFFmpegListener != null) {
            iFFmpegListener.onFinish();
        }
    }

    public void onProgress(int i10, long j10) {
        IFFmpegListener iFFmpegListener = this.ffmpegListener;
        if (iFFmpegListener != null) {
            iFFmpegListener.onProgress(i10, j10);
        }
    }

    public int runCommand(String[] strArr, IFFmpegListener iFFmpegListener) {
        int iRunFFmpegCmd;
        setFFmpegListener(iFFmpegListener);
        synchronized (RxFFmpegInvoke.class) {
            iRunFFmpegCmd = runFFmpegCmd(strArr);
            onClean();
        }
        return iRunFFmpegCmd;
    }

    public void runCommandAsync(final String[] strArr, IFFmpegListener iFFmpegListener) {
        setFFmpegListener(iFFmpegListener);
        synchronized (RxFFmpegInvoke.class) {
            new Thread(new Runnable() { // from class: io.microshow.rxffmpeg.RxFFmpegInvoke.1
                @Override // java.lang.Runnable
                public void run() {
                    RxFFmpegInvoke.this.runFFmpegCmd(strArr);
                    RxFFmpegInvoke.this.onClean();
                }
            }).start();
        }
    }

    public AbstractC10045b runCommandRxJava(final String[] strArr) {
        return AbstractC10045b.m18741c(new InterfaceC10047d() { // from class: io.microshow.rxffmpeg.RxFFmpegInvoke.2
            @Override // p244s6.InterfaceC10047d
            public void subscribe(final InterfaceC10046c interfaceC10046c) {
                RxFFmpegInvoke.this.setFFmpegListener(new IFFmpegListener() { // from class: io.microshow.rxffmpeg.RxFFmpegInvoke.2.1
                    @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
                    public void onCancel() {
                        interfaceC10046c.onNext(new RxFFmpegProgress(RxFFmpegSubscriber.STATE_CANCEL));
                    }

                    @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
                    public void onError(String str) {
                        interfaceC10046c.onError(new Throwable(str));
                    }

                    @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
                    public void onFinish() {
                        interfaceC10046c.onComplete();
                    }

                    @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
                    public void onProgress(int i10, long j10) {
                        interfaceC10046c.onNext(new RxFFmpegProgress(RxFFmpegSubscriber.STATE_PROGRESS, i10, j10));
                    }
                });
                RxFFmpegInvoke.this.runFFmpegCmd(strArr);
                RxFFmpegInvoke.this.onClean();
            }
        }, BackpressureStrategy.BUFFER).m18751l(AbstractC8655a.m13934b()).m18746f(AbstractC10198a.m19069a());
    }

    public native int runFFmpegCmd(String[] strArr);

    public native void setDebug(boolean z10);

    public void setFFmpegListener(IFFmpegListener iFFmpegListener) {
        this.ffmpegListener = iFFmpegListener;
    }
}
