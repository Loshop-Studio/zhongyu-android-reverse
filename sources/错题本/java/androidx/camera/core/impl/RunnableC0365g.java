package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.camera.core.impl.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0365g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f453a;

    /* renamed from: b */
    public final /* synthetic */ Object f454b;

    /* renamed from: c */
    public final /* synthetic */ Object f455c;

    public /* synthetic */ RunnableC0365g(int i, Object obj, Object obj2) {
        this.f453a = i;
        this.f455c = obj;
        this.f454b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        switch (this.f453a) {
            case 0:
                ((LiveDataObservable) this.f455c).lambda$removeObserver$3((LiveDataObservable.LiveDataObserverAdapter) this.f454b);
                break;
            case 1:
                ((LiveDataObservable.LiveDataObserverAdapter) this.f454b).lambda$onChanged$0((LiveDataObservable.Result) this.f455c);
                break;
            case 2:
                ((CameraRepository) this.f455c).lambda$deinit$1((CameraInternal) this.f454b);
                break;
            case 3:
                ((ConstantObservable) this.f455c).lambda$addObserver$0((Observable.Observer) this.f454b);
                break;
            case 4:
                ((DeferrableSurface) this.f455c).lambda$new$2((String) this.f454b);
                break;
            default:
                ((LiveDataObservable) this.f455c).lambda$fetchData$0((CallbackToFutureAdapter.Completer) this.f454b);
                break;
        }
    }

    public /* synthetic */ RunnableC0365g(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f453a = 1;
        this.f454b = liveDataObserverAdapter;
        this.f455c = result;
    }
}
