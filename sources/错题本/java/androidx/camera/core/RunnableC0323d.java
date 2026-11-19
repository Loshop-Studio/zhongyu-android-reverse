package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0323d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f390a = 1;

    /* renamed from: b */
    public final /* synthetic */ CameraX f391b;

    /* renamed from: c */
    public final /* synthetic */ Context f392c;

    /* renamed from: d */
    public final /* synthetic */ Executor f393d;

    /* renamed from: e */
    public final /* synthetic */ int f394e;

    /* renamed from: f */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f395f;

    /* renamed from: g */
    public final /* synthetic */ long f396g;

    public /* synthetic */ RunnableC0323d(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter.Completer completer, long j7) {
        this.f391b = cameraX;
        this.f392c = context;
        this.f393d = executor;
        this.f394e = i;
        this.f395f = completer;
        this.f396g = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f390a) {
            case 0:
                Context context = this.f392c;
                CallbackToFutureAdapter.Completer completer = this.f395f;
                this.f391b.lambda$initAndRetryRecursively$1(this.f393d, this.f396g, this.f394e, context, completer);
                break;
            default:
                this.f391b.lambda$initAndRetryRecursively$2(this.f392c, this.f393d, this.f394e, this.f395f, this.f396g);
                break;
        }
    }

    public /* synthetic */ RunnableC0323d(CameraX cameraX, Executor executor, long j7, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        this.f391b = cameraX;
        this.f393d = executor;
        this.f396g = j7;
        this.f394e = i;
        this.f392c = context;
        this.f395f = completer;
    }
}
